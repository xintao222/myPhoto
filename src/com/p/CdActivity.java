package com.p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle; 
import android.view.View;  
import android.widget.AdapterView; 
import android.widget.AdapterView.OnItemClickListener; 
import android.widget.GridView; 
import android.widget.SimpleAdapter;
public class CdActivity extends Activity { 
	private int[] imagesId  = new int[]{ 
			R.drawable.im1, R.drawable.im2, R.drawable.im3,  
			R.drawable.im4, R.drawable.im5, R.drawable.im6,                
			R.drawable.im7, R.drawable.im8, R.drawable.im9,  
			R.drawable.im11
		
	}; 
	private String[] strId = new String[]{
			"df","dfasa","asg","gfg","sgh",
			"df","dfasa","asg","gfg","sgh",
			"df","dfasa","asg"
			
	};
	
	public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.grivd); 
		List<Map<String,Object>> listItems = new ArrayList<Map<String,Object>>();
		for(int i=0;i<imagesId.length;i++){
			Map<String,Object>listItem = new HashMap<String,Object>();
			listItem.put("images", imagesId[i]);
			listItem.put("string", strId[i]);
			listItems.add(listItem);
		}
		SimpleAdapter sa = new SimpleAdapter(
				this,listItems,R.layout.item,
				new String[]{"images","string"},
				new int[]{R.id.ItemImage,R.id.ItemText});
		//SimpleAdapter st = new SimpleAdapter(this,listItems,R.layout.item,new String[]{"string"},new int[]{R.id.ItemText});
//		List<Map<String,Object>> listItems1 = new ArrayList<Map<String,Object>>();
//		for(int i=0;i<imagesId.length;i++){
//			Map<String,Object>listItem = new HashMap<String,Object>();
//			listItem.put("string", strId[i]);
//			listItems1.add(listItem);
//		}
		GridView gv = (GridView)findViewById(R.id.gridView1); 
		//GridView gv1 = (GridView)findViewById(R.id.gridView1);
		//ÎªGridViewÉèÖÃÊÊÅäÆ÷ 
		gv.setAdapter(sa); 
		//gv1.setAdapter(st);
		//×¢²á¼àÌýÊÂ¼þ 
		gv.setOnItemClickListener(new OnItemClickListener() 
		{ 
			public void onItemClick(AdapterView<?> parent, View v, int i, long id) 
			{ 
				//Toast.makeText(CdActivity.this, "pic" + position, Toast.LENGTH_SHORT).show(); 
//				Intent intent1 = new Intent();
//				intent1.setClass(CdActivity.this, AdActivity.class);
//				startActivity(intent1);
				switch(imagesId[i]){
				case R.drawable.im1:
					startActivity(new Intent(CdActivity.this,A.class));
					finish();
					break;
				case R.drawable.im2:
					startActivity(new Intent(CdActivity.this,B.class));
					finish();
					break;
				case R.drawable.im3:
					startActivity(new Intent(CdActivity.this,C.class));
					finish();
					break;	
				case R.drawable.im4:
					startActivity(new Intent(CdActivity.this,D.class));
					finish();
					break;
				case R.drawable.im5:
					startActivity(new Intent(CdActivity.this,E.class));
					finish();
					break;
				case R.drawable.im6:
					startActivity(new Intent(CdActivity.this,F.class));
					finish();
					break;	
				case R.drawable.im7:
					startActivity(new Intent(CdActivity.this,G.class));
					finish();
					break;
				case R.drawable.im8:
					startActivity(new Intent(CdActivity.this,H.class));
					finish();
					break;
				case R.drawable.im9:
					startActivity(new Intent(CdActivity.this,I.class));
					finish();
					break;
				case R.drawable.im11:
					startActivity(new Intent(CdActivity.this,J.class));
					finish();
					break;
				
					
				}
			} 
		}); 
		
	} 
} 

