package com.p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
//import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Gallery.LayoutParams;
import android.widget.ViewSwitcher.ViewFactory;

public class MyphActivity extends Activity implements
OnItemSelectedListener, ViewFactory {
	private ImageSwitcher is;
	private Gallery gallery;
	private Integer[] mThumbIds = { R.drawable.im1,R.drawable.im2,R.drawable.im3
			,R.drawable.im4,R.drawable.im5,R.drawable.im6
			,R.drawable.im7,R.drawable.im11,R.drawable.im9,R.drawable.im8
	};

	private Integer[] mImageIds = { R.drawable.im1,R.drawable.im2,R.drawable.im3
			,R.drawable.im4,R.drawable.im5,R.drawable.im6
			,R.drawable.im7,R.drawable.im11,R.drawable.im9,R.drawable.im8 };
	private Button b1,b2,b3,b4,b5;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.h_d_p);
		b1 = (Button)findViewById(R.id.b1);
		b2 = (Button)findViewById(R.id.b2);
		b3 = (Button)findViewById(R.id.b3);
		b4 = (Button)findViewById(R.id.b4);
		b5 = (Button)findViewById(R.id.b5);
		b1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent1 = new Intent();
				intent1.setClass(MyphActivity.this, PptActivity.class);
				startActivity(intent1);

			}
		});
		b2.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent2 = new Intent();
				intent2.setClass(MyphActivity.this, NimActivity.class);
				startActivity(intent2);

			}
		});

		b3.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				finish();

			}
		});
		b4.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				Intent intent4 = new Intent();
				intent4.setClass(MyphActivity.this, CdActivity.class);
				startActivity(intent4);

			}

		});
		b5.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				Intent intent5 = new Intent();
				intent5.setClass(MyphActivity.this, Tuotu.class);
				startActivity(intent5);

			}

		});
		is = (ImageSwitcher) findViewById(R.id.switcher);
		is.setFactory(this);

		is.setInAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.fade_in));
		is.setOutAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.fade_out));

		gallery = (Gallery) findViewById(R.id.gallery);

		gallery.setAdapter(new ImageAdapter(this));
		gallery.setOnItemSelectedListener(this);
	}

	public View makeView() {
		ImageView i = new ImageView(this);
		i.setBackgroundColor(0xFF000000);
		i.setScaleType(ImageView.ScaleType.FIT_CENTER);
		i.setLayoutParams(new ImageSwitcher.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		return i;
	}

	public class ImageAdapter extends BaseAdapter {
		public ImageAdapter(Context c) {
			mContext = c;
		}

		public int getCount() {
			return mThumbIds.length;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView i = new ImageView(mContext);

			i.setImageResource(mThumbIds[position]);
			i.setAdjustViewBounds(true);
			i.setLayoutParams(new Gallery.LayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			i.setBackgroundResource(R.drawable.im11);
			return i;
		}

		private Context mContext;

	}


	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		is.setImageResource(mImageIds[position]);

	}

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}
	public void OnItemClickListener(){

	}

}
