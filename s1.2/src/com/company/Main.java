package com.company;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.*;

public class Main {
    static int count = 0;
//    static String text = "Click count: "+ count;

public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setTitle("Click Counter");
        JLabel label = new JLabel();
        frame.add(label);

        label.setText("Click count: "+ count);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        JButton button = new JButton("Click HERE");
        label.add(button);
        frame.add(button, SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Click count: "+ count);
            }
        });
    }
}
