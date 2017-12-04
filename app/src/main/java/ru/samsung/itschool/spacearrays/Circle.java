package ru.samsung.itschool.spacearrays;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by student2 on 27.11.17.
 */

public class Circle extends Figures implements  Drawable,Touchable,View.OnClickListener{
    float x,y,r=20;



   static boolean check1=false;

    public  void  draw (Canvas canvas){
        if (check1 = false){
            paint.setColor(Color.BLACK);
        }
        else {paint.setColor(Color.YELLOW);}


        canvas.drawCircle(x,y,r,paint);
    }

    public Circle(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void onTouch(MotionEvent event){
        /*this.x+=20;
        this.y+=20;*/
        this.r+=5;
    }

    @Override
    public void onClick(View view) {
        this.r=20;

    }



}
