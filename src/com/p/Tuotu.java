package com.p;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.Toast;
public class Tuotu extends Activity {
	ImageButton img;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tuotu);        
		img = (ImageButton)findViewById(R.id.imageButton1);

		img.setOnTouchListener(new OnTouchListener(){        	
			private float x, y;
			private int mx, my;		

			public boolean onTouch(View v, MotionEvent event) {

				switch(event.getAction()) {	
				case MotionEvent.ACTION_DOWN:
					x = event.getX();
					y = event.getY();	
				break;
				case MotionEvent.ACTION_MOVE:
					mx = (int)(event.getRawX());
					my = (int)(event.getRawY());


					v.layout(mx - img.getWidth()/2, my - img.getHeight()/2, 
							mx + img.getWidth()/2, my + img.getHeight()/2);
					break;
				}
				return true;

			}});    Toast.makeText(this, "ÍÏÎÒ×ß", Toast.LENGTH_SHORT).show();
			img.setOnLongClickListener(new OnLongClickListener(){
				public boolean onLongClick(View v) {
					// TODO Auto-generated method stub
					Intent intent_1 = new Intent();
					intent_1.setClass(Tuotu.this, MyphActivity.class);
					startActivity(intent_1);				
					return true;
				}

			});

	}
}
//public class Tuotu extends Activity {	
//	ImageView img1;
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tuotu);        
//
//        img1= (ImageView)findViewById(R.id.imageView1);
//        img1.setOnTouchListener(new OnTouchListener(){        	
//        	private int mx, my;			
//			public boolean onTouch(View v, MotionEvent event) {
//				switch(event.getAction()) {				
//				case MotionEvent.ACTION_MOVE:
//					mx = (int)(event.getRawX());
//					my = (int)(event.getRawY() - 50);
//					
//					v.layout(mx - img1.getWidth()/2, my - img1.getHeight()/2, 
//							mx + img1.getWidth()/2, my + img1.getHeight()/2);
//					break;
//				
//				case MotionEvent.ACTION_DOWN:
//					
//			
//				}
//				return true;
//			}});
//	}
//	
//}

//import android.util.DisplayMetrics;
//import android.view.KeyEvent;
//import android.view.View.OnClickListener;
//public class Tuotu extends Activity {
//	
//	final static int xSpeed = 10;
//	final static int ySpeed = 10;
//	ImageView image = null;
//	int width,height;
//	float mx,my,x,y;
//	int screenX,screenY;
//	
//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		switch(keyCode){
//		case KeyEvent.KEYCODE_DPAD_DOWN:
//			y += ySpeed;break;
//		case KeyEvent.KEYCODE_DPAD_UP:
//			y -= ySpeed;break;
//		case KeyEvent.KEYCODE_DPAD_LEFT:
//			x -= xSpeed;break;
//		case KeyEvent.KEYCODE_DPAD_RIGHT:
//			x += xSpeed;break;
//		}
//		picMove(x, y);
//		return true;
//	}
//	
//	@Override
//	public boolean onTouchEvent(MotionEvent event) {
//		x = event.getX();
//		y = event.getY();
//		switch(event.getAction()){
//		case MotionEvent.ACTION_DOWN:
//			picMove(x,y);
//			break;
//		case MotionEvent.ACTION_MOVE:
//			picMove(x,y);
//			break;
//		case MotionEvent.ACTION_UP:
//			picMove(x,y);
//			break;
//		}
//		return true;
//	}
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tuotu);
//        DisplayMetrics dm = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//        screenX = dm.widthPixels;
//        screenY = dm.heightPixels;
//        width = 60;
//        height = 60;
//        image = (ImageView) findViewById(R.id.imageView1);
//        image.setImageResource(R.drawable.im11);
////        image.setLayoutParams(new AbsoluteLayout.LayoutParams(screenX, screenY,width,height));
//        image.setOnClickListener(new OnClickListener(){
//			public void onClick(View v) {
//				picMove(100,100);	
//			}
//        	
//        });
//    }
//    
//	private void picMove(float x,float y){
//    	mx = x;
//    	my = y;
//    	if((mx+width)>screenX){
//    		mx = screenX-width;
//    	}
//    	if((my+height)>screenY-50){
//    		my = screenY-height-50;
//    	}
//
//    	image.setLayoutParams(new AbsoluteLayout.LayoutParams(width,height,(int)mx,(int)my));
//    	
//    }
//
//} 