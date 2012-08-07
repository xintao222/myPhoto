package com.p;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class NimActivity extends Activity implements OnGestureListener{
	private static final int ITEM = Menu.FIRST; 
	private static final int ITME2 = Menu.FIRST + 1;  
	private static final int ITME3 = Menu.FIRST + 2;  
	private static final int ITME4 = Menu.FIRST + 3;  
	GestureDetector detector;
	int[] next={
			R.layout.main,
			R.layout.next,
			R.layout.three,	
			R.layout.four,
			R.layout.five,
			R.layout.sxt,
			R.layout.seven,
			R.layout.eight,
			R.layout.nine,
			R.layout.ten
	};
	int[] nextI={
		R.id.im1,	
		R.id.im2,
		R.id.im3,
		R.id.im4,
		R.id.im5,
		R.id.im6,
		R.id.im7,
		R.id.im8,
		R.id.im9,
		R.id.im10
	};
	int i=0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        detector=new GestureDetector(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	// TODO Auto-generated method stub
    	return detector.onTouchEvent(event);
    }
    
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		if(e2.getX()-e1.getX()>0){
			ImageView iv0=(ImageView)findViewById(nextI[i]);
			iv0.setAnimation(AnimationUtils.loadAnimation(NimActivity.this, R.anim.enter_rtol));
			i+=1;
			if(i>9)i=0;
			setContentView(next[i]);
			ImageView iv=(ImageView)findViewById(nextI[i]);
			iv.setAnimation(AnimationUtils.loadAnimation(NimActivity.this, R.anim.right_out));
			return true;
		}
		if(e1.getX()-e2.getX()>0){
			ImageView iv0=(ImageView)findViewById(nextI[i]);
			iv0.setAnimation(AnimationUtils.loadAnimation(NimActivity.this, R.anim.right_in));
			i-=1;
			if(i<0)i=9;
			setContentView(next[i]);
			ImageView iv=(ImageView)findViewById(nextI[i]);
			iv.setAnimation(AnimationUtils.loadAnimation(NimActivity.this, R.anim.left_out));
			
			return true;
		}
		return false;
	}
	public boolean onCreateOptionsMenu(Menu menu) { 
		menu.add(0, ITEM, 0, "幻灯片").setIcon(R.drawable.ic_launcher); 
		menu.add(0, ITME2, 0, "动画").setIcon(R.drawable.ic_launcher); 
		menu.add(0, ITME3, 0, "翻折").setIcon(R.drawable.ic_launcher);
		menu.add(0, ITME4, 0, "分栏").setIcon(R.drawable.ic_launcher);
		return true; 

	} 
	public boolean onOptionsItemSelected(MenuItem item) { 

		switch (item.getItemId()) { 
		case ITEM: 
			Intent intent1 = new Intent();
			intent1.setClass(NimActivity.this, PptActivity.class);
			startActivity(intent1);
			break; 
		case ITME2: 

			Intent intent2 = new Intent();
			intent2.setClass(NimActivity.this, NimActivity.class);
			startActivity(intent2);
			break; 
		case ITME3: 

			Intent intent3 = new Intent();
			intent3.setClass(NimActivity.this, CoverFlowExample.class);
			startActivity(intent3);
			break; 
		case ITME4:  
			Intent intent4 = new Intent();
			intent4.setClass(NimActivity.this, MyphActivity.class);
			startActivity(intent4);
			break; 
		} 
		return true; 

	} 


	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}


	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}


	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}


	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
}