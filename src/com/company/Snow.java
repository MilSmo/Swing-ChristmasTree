package com.company;

import java.awt.*;

public class Snow implements XmasShape {
    int x;
    int y;
    double scale;
    Color lineColor;
    Color fillColor;

    public Snow(int x, int y, double scale){
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    @Override
    public void render(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);

        for(int i=0;i<12;i++){
            g2d.drawLine(0,0,5,5);
            g2d.rotate(2*Math.PI/12);
        }
    }

    @Override
    public void transform(Graphics2D g2d) {
        g2d.translate(x,y);
        g2d.scale(scale,scale);
    }
}
