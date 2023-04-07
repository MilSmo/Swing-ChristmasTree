package com.company;

import java.awt.*;

public class Bubble implements XmasShape {
    int x;
    int y;
    double scale;
    Color lineColor;
    Color fillColor;

    public Bubble(int x, int y, double scale){
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    public Bubble(int x, int y, double scale, Color lineColor, Color fillColor){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.lineColor = lineColor;
        this.fillColor = fillColor;

    }

    @Override
    public void render(Graphics2D g2d) {

        GradientPaint grad = new GradientPaint(0,0,new Color(222,24,56),0,100,new Color(255,204,203));
        g2d.setPaint(grad);
        //g2d.setColor(new Color(222,24,56));

        g2d.fillOval(0,0,75,75);


    }

    @Override
    public void transform(Graphics2D g2d) {
        g2d.translate(x,y);
        g2d.scale(scale,scale);
    }
}