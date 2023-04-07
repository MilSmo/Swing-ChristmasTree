package com.company;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawPanel extends JPanel {
    List<XmasShape> shapes = new ArrayList<>();
    public DrawPanel(){
        Random random = new Random();
        int x,y;


        setBackground(new Color(0,0,50));
        for (int i=0; i<500; i++){
            x= random.nextInt(800);
            y= random.nextInt(700);
            shapes.add(new Snow(x,y,0.7));
        }
        shapes.add(new RightTwig(360,400,0.19));
        shapes.add(new LeftTwig(400,400,0.19));
        shapes.add(new RightTwig(360,350,0.15));
        shapes.add(new LeftTwig(400,350,0.15));
        shapes.add(new RightTwig(360,300,0.12));
        shapes.add(new LeftTwig(400,300,0.12));
        shapes.add(new RightTwig(360,250,0.09));
        shapes.add(new LeftTwig(400,250,0.09));
        shapes.add(new RightTwig(360,220,0.07));
        shapes.add(new LeftTwig(400,220,0.07));
        shapes.add(new RightTwig(360,200,0.05));
        shapes.add(new LeftTwig(400,200,0.05));
        shapes.add(new RightTwig(360,190,0.03));
        shapes.add(new LeftTwig(400,190,0.03));
        shapes.add(new Star(385,185,0.25));
shapes.add(new Greetings(120,0,0.4));
shapes.add(new Bubble(350,250,0.25));
shapes.add(new Bubble(400,300,0.25));
shapes.add(new Bubble(450,350,0.25));
shapes.add(new Bubble(300,350,0.25));
        shapes.add(new Bubble(350,400,0.25));
        shapes.add(new Bubble(400,450,0.25));
        shapes.add(new Bubble(450,500,0.25));
        shapes.add(new Bubble(300,500,0.25));
        shapes.add(new Bubble(250,450,0.25));
        shapes.add(new Bubble(500,400,0.25));
        shapes.add(new Bubble(570,500,0.25));






    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        for(XmasShape s:shapes){
            s.draw((Graphics2D)g);

        }
    }
    public void addShape(XmasShape shape){
        shapes.add(shape);
    }
}