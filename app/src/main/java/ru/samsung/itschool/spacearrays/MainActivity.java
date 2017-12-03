package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ImageManager.resources= getResources();
		setContentView(R.layout.activity_main);
		Intent intent=this.getIntent();
		Button button =(Button) findViewById(R.id.magicButton);
		MyDraw myDraw=(MyDraw)findViewById(R.id.myDraw1);
		button.setOnClickListener(myDraw);
	}
}
