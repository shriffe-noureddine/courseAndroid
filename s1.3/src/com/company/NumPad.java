package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumPad
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame  F = new JFrame("NumPad");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                F.setSize(400, 300);
                F.setVisible(true);
                F.getContentPane().setLayout(new BorderLayout());

                JTextField  T   =   new JTextField();
                F.getContentPane().add(T,BorderLayout.NORTH);

                JPanel  P = new JPanel();
                F.getContentPane().add(P,BorderLayout.CENTER);

                P.setBackground(Color.GREEN);

                // STEP 1: create 12 buttons
                JButton b1 = new JButton("1");
                JButton b2 = new JButton("2");
                JButton b3 = new JButton("3");
                JButton b4 = new JButton("4");
                JButton b5 = new JButton("5");
                JButton b6 = new JButton("6");
                JButton b7 = new JButton("7");
                JButton b8 = new JButton("8");
                JButton b9 = new JButton("9");
                JButton b10 = new JButton(".");
                JButton b11 = new JButton("0");
                JButton b12 = new JButton("DEL");

                // STEP 2: set layout of panel

                P.setLayout(new GridLayout(4,3));

                // STEP 3: add buttons to panel
                P.add(b1);
                P.add(b2);
                P.add(b3);
                P.add(b4);
                P.add(b5);
                P.add(b6);
                P.add(b7);
                P.add(b8);
                P.add(b9);
                P.add(b10);
                P.add(b11);
                P.add(b12);
                // STEP 4: add listeners
                ActionListener A = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String s = ((JButton)e.getSource()).getText();
                        T.setText(T.getText()+s);
                    }
                };
                b1.addActionListener(A);
                b2.addActionListener(A);
                b3.addActionListener(A);
                b4.addActionListener(A);
                b5.addActionListener(A);
                b6.addActionListener(A);
                b7.addActionListener(A);
                b8.addActionListener(A);
                b9.addActionListener(A);
                b10.addActionListener(A);
                b11.addActionListener(A);
                b12.addActionListener(A);
            } });

    }
}