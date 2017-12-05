package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by Roky Mielsen on 04.12.2017.
 */

public class RedRect extends Figures implements  Drawable {
    static boolean check2=false;

    @Override
    public void draw(Canvas canvas) {
        if (check2 == false){
            paint.setColor(Color.BLACK);
        }
        else {paint.setColor(Color.RED);};

        canvas.drawRect(x,y,x+size,y+size,paint);
    }
    float x,y,size=20;


    public RedRect(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
