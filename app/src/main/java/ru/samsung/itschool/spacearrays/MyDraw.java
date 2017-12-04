package ru.samsung.itschool.spacearrays;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class MyDraw extends View implements View.OnClickListener{

	/*boolean check1,check2;*/
    ArrayList objects = new ArrayList();

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		Sky=new Sky();
		Sky.makeSky();


		planet = new Planet(BitmapFactory.decodeResource(getResources(), R.drawable.planet));
		objects.add(new Circle(20,100));
		objects.add(new Circle(50,150));
		objects.add(new MyRect(30,200));
		objects.add(new MyRect(100,100));
		objects.add(new RedCircle(170,400));
		objects.add(new RedRect(460,400));



		/*xRocket = new float [100];
		 yRocket = new float [100];
		 vxRocket = new float [100];
		 vyRocket = new float [100] ;*/
		/*for (int i=0;i<xRocket.length;i++){
			xRocket[i] = getRandom(0,400) ;
			yRocket[i] = getRandom(0,400);
			vxRocket[i]=getRandom(-4,4);
			vyRocket[i]=getRandom(-4,4);
		}*/


	}

	Planet planet;
	ControlledRocket rocket = new ControlledRocket();
	/*@Override
	public boolean onTouchEvent(MotionEvent event) {

			rocket[n] = new ControlledRocket(event.getX(),event.getY());
		    *//*rocket[n+1]= new ControlledRocket(rocket[n]) ;*//*

		n++;
		return super.onTouchEvent(event);
	}
	*/

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		this.rocket.setTarget(event.getX(),event.getY());
		for (Object object:objects){
			if (object instanceof  Touchable) ((Touchable)object).onTouch(event);
		}
		return super.onTouchEvent(event) /*true*/;
	}

	Paint paint = new Paint();
	Bitmap pic;


    Sky Sky;


	int n=0;
	@Override
	protected void onDraw(Canvas canvas) {
		Sky.drawSky(canvas);
		planet.draw(canvas);
		planet.move();
          /*for (int i=0;i<n;i++) {*/
		rocket.draw(canvas);
		rocket.move();


		for (Object object:objects){
			if (object instanceof  Drawable) ((Drawable)object).draw(canvas);
		}
		
		// Запрос на перерисовку экрана
		invalidate();
	}
	float getRandom(float a, float b){
		float r = (float)(Math.random() * (b-a) + a);
		return r;

	}


	@Override
	public void onClick(View view) {
		for (Object object:objects){
			if (object instanceof  View.OnClickListener) ((View.OnClickListener)object).onClick(view);
		}
		for (Object object:objects){

		}
	}
	public void check(boolean check1, boolean check2 ){
		Circle.check1=check1;
		RedCircle.check1=check1;

	}



}
