package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by student2 on 27.11.17.
 */

public class MyRect extends Figures implements  Drawable {
    float x,y,size=20;


    public MyRect(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Canvas canvas) {
        paint.setColor(Color.YELLOW);
        canvas.drawRect(x,y,x+size,y+size,paint);
    }
}
