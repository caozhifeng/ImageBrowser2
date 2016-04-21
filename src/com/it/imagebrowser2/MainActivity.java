package com.it.imagebrowser2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	int jia = 0;
	int jian = 9;// 10张图片,最后的索引为9

	public void fun(View view) {
		int[] imgIds = { R.drawable.zero, R.drawable.one, R.drawable.two,
				R.drawable.three, R.drawable.four, R.drawable.five,
				R.drawable.six, R.drawable.seven, R.drawable.eight,
				R.drawable.nine };
		ImageView imgView = (ImageView) findViewById(R.id.showImage_iv);
		if (view.getId() == R.id.backward_btn) {
			jia++;
			if (10 == jia) {
				jia = 0;
			}
			imgView.setImageResource(imgIds[jia]);
		}
		if(view.getId() == R.id.forward_btn) {
			jian--;
			if ( -1 == jian ) {
				jian = 9;
			}
			imgView.setImageResource(imgIds[jian]);
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
