package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/**
 * Created by student2 on 23.10.17.
 */

public class Rocket {
    float x,y;
    float vx,vy;

    static Bitmap pic = ImageManager.get(R.drawable.rocket) ;

    Rocket(Rocket rocket){
        this.x=rocket.x;
        this.y=rocket.y;
        this.vx=-rocket.vx;
        this.vy=-rocket.vy;
    }
    Rocket (){
        this.x= (float)((Math.random()*500));
        this.x= (float)((Math.random()*500));
    }

    static MyDraw getRandom;

    /*Rocket(float g,float h){
        this.x=g;
        this.y=h;
        this.vx=(float)((Math.random()*10)-5);
        this.vy=(float)((Math.random()*10)-5);


    }*/


    void move(){
        this.x+=this.vx;
        this.y+=this.vy;
    }



    Matrix matrix = new Matrix();
    Paint paint=new Paint();

    void draw(Canvas canvas)
    {
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }
}
