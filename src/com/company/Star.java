package com.company;

import java.awt.*;

public class Star implements XmasShape {
    int x;
    int y;
    double scale;
    Color lineColor;
    Color fillColor;

    public Star(int x, int y, double scale){
        this.x = x;
        this.y = y;
        this.scale = scale;
    }
    public Star(int x, int y, double scale, Color lineColor, Color fillColor){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.lineColor = lineColor;
        this.fillColor = fillColor;
    }

    @Override
    public void render(Graphics2D g2d) {
        g2d.setColor(new Color(255, 253, 208));

        for(int i=0;i<50;i++){
            g2d.drawLine(0,0,100,100);
            g2d.rotate(2*Math.PI/50);
        }
    }

    @Override
    public void transform(Graphics2D g2d) {
        g2d.translate(x,y);
        g2d.scale(scale,scale);
    }
}
