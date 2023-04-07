package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        JFrame frame = new JFrame("Choinka");
        frame.setContentPane(new DrawPanel());
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);





    }
}
