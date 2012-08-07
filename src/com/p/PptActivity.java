package com.p;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
//import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
//import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
//import android.widget.TextSwitcher;
//import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;

public class PptActivity extends Activity implements ViewFactory{
	/** Called when the activity is first created. */
	ImageSwitcher switcher;
	Handler handler;
	private  int[] images = new int[]{
			R.drawable.im1,R.drawable.im2,R.drawable.im3
			,R.drawable.im4,R.drawable.im5,R.drawable.im6
			,R.drawable.im7,R.drawable.im8,R.drawable.im9
			,R.drawable.im11
	};
	private Handler mHandler = new Handler(){  

		public void handleMessage(Message msg) {  
			switch (msg.what) {  
			case 1:  
				id = next(); //����Iֵ
				updateText(); 
				break;  
			}  
		};  
	};  
	int id= 0; 

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.iswitch);
		init();
		Timer timer = new Timer();  
		timer.scheduleAtFixedRate(new MyTask(), 1, 4000);
	}
	private void init(){
		switcher = (ImageSwitcher) findViewById(R.id.is1);
		switcher.setFactory(this);
		switcher.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.huandeng));
		switcher.setOutAnimation(AnimationUtils.loadAnimation(this,R.anim.huandeng_1));
	}
	private int next(){

		int flag = id+1;
		if(flag>images.length-1){
			flag=flag-images.length;
		}
		return flag;
	}
	private void updateText(){
		switcher.setImageResource(images[id]);
	}

	public View makeView(){
		ImageView iv =new ImageView(this);
		iv.setImageResource(images[id]);
		return iv;
	}
	private class MyTask extends TimerTask{  

		public void run() {  
			Message message = new Message();  
			message.what = 1;  
			mHandler.sendMessage(message);  

		}     
	}  
}


