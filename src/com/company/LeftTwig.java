package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LeftTwig implements XmasShape {
    int x;
    int y;
    double scale;
    static BufferedImage img;

    static {
        try {
            img = ImageIO.read(new File("resources/twig.png"));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public LeftTwig(int x, int y, double scale){
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    @Override
    public void transform(Graphics2D g2d) {
        g2d.translate(x,y);
        g2d.scale(scale,scale);


    }

    @Override
    public void render(Graphics2D g2d) {
        g2d.drawImage(img,101,110,-img.getWidth(),img.getHeight(),null);

    }
}
