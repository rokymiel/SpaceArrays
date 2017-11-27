package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/**
 * Created by student2 on 27.10.17.
 */

public class Planet {

    float r= 200;//(float) ((Math.random()*200)-5);

    float x=1000, y=300,a=0,xv=800,yv=100;



    Planet(Bitmap pic) {

        this.pic = pic;

    }

    Matrix matrix = new Matrix();
    Paint paint=new Paint();
    Bitmap pic ;

    void move(){
        this.x=r*((float)Math.cos(a))+this.xv;
        this.y=r*((float)Math.sin(a))+this.yv;
        a+=0.01;
    }
    void draw(Canvas canvas)
    {
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        //matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }
}

