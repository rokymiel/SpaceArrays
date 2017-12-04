package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by Roky Mielsen on 04.12.2017.
 */

public class RedCircle extends Figures  implements  Drawable {
    float x,y,r=40;
    public RedCircle(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void  draw (Canvas canvas){
        paint.setColor(Color.RED);
        canvas.drawCircle(x,y,r,paint);
    }
}
