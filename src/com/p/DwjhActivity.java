package com.p;

import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle; 
import android.view.Menu; 
import android.view.MenuItem;  
public class DwjhActivity extends Activity { 
	private static final int ITEM = Menu.FIRST; 
	private static final int ITME2 = Menu.FIRST + 1;  
	private static final int ITME3 = Menu.FIRST + 2;  
	private static final int ITME4 = Menu.FIRST + 3;  
	public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.tuotu); 

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
			intent1.setClass(DwjhActivity.this, PptActivity.class);
			startActivity(intent1);
			break; 
		case ITME2: 
			Intent intent2 = new Intent();
			intent2.setClass(DwjhActivity.this, NimActivity.class);
			startActivity(intent2);
			break; 
		case ITME3: 
			Intent intent3 = new Intent();
			intent3.setClass(DwjhActivity.this, CoverFlowExample.class);
			startActivity(intent3);
			break; 
		case ITME4: 
			Intent intent4 = new Intent();
			intent4.setClass(DwjhActivity.this, MyphActivity.class);
			startActivity(intent4);
			break; 
		} 
		return true; 

	} 

} 