package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;

/**
 * Created by student2 on 10.11.17.
 */

public class ControlledRocket extends Rocket {

    private float toX,toY;

    void setTarget(float toX,float toY){
        this.toX=toX;
        this.toY=toY;
        this.vx=this.toX-this.x;
        this.vy=this.toY-this.y;
        float d =(float)Math.sqrt(vx*vx+vy*vy);
        this.vx=(this.vx/d)*4;
        this.vy=(this.vy/d)*4;

    }

    /*ControlledRocket(float g,float h ) {
        super(g,h);
        toX = this.x;
        toY=this.y;

    }*/
    ControlledRocket(){
        super();
    }
    void move(){

        if((toX-x)*(toX-x)+(toY-y)*(toY-y)<4){
            /*vx=0;
            vy=0;*/
            return ;
        }
        super.move();
    }
}
