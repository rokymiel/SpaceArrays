package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import static ru.samsung.itschool.spacearrays.R.id.checkBox;
import static ru.samsung.itschool.spacearrays.R.id.checkBox2;

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
		CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
		CheckBox checkBox1 = (CheckBox)findViewById(checkBox2);
        Button checkFigures=(Button)findViewById(R.id.checkFigures);
        checkFigures.setOnClickListener(myDraw);
       /* boolean chech1=(checkBox.isChecked());
        boolean chech2=(checkBox1.isChecked());
        intent.putExtra("check1",chech1);
        intent.putExtra("check2",chech2);*/

	}
	public void check(View view){
        Intent intent=new Intent(this,Figures.class);
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        CheckBox checkBox1 = (CheckBox)findViewById(checkBox2);
        boolean chech1=(checkBox.isChecked());
        boolean chech2=(checkBox1.isChecked());
        intent.putExtra("check1",chech1);
        intent.putExtra("check2",chech2);}



}
