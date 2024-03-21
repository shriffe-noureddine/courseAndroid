package com.company;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Main
{


    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {

            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("Color Sliders Exercise");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // ADD TOP PANEL

                JPanel    P1    =    new JPanel();

                P1.setBackground(new Color(0,0,0));

                JPanel    P2    =    new JPanel();
                P2.setLayout(new GridLayout(3,1));

                JSlider s1    = new JSlider(0,255,0);
                JSlider s2    = new JSlider(0,255,0);
                JSlider s3    = new JSlider(0,255,0);

                // add code for look of sliders
                s1.setPaintTicks(true);
                s1.setPaintTicks(true);
                s1.setPaintLabels(true);
                s1.setMajorTickSpacing(50);
                s1.setBorder(new TitledBorder("red"));

                s2.setPaintTicks(true);
                s2.setPaintTicks(true);
                s2.setPaintLabels(true);
                s2.setMajorTickSpacing(50);
                s2.setBorder(new TitledBorder("green"));

                s3.setPaintTicks(true);
                s3.setPaintTicks(true);
                s3.setPaintLabels(true);
                s3.setMajorTickSpacing(50);
                s3.setBorder(new TitledBorder("blue"));
                // add titles for sliders

                P2.add(s1);
                P2.add(s2);
                P2.add(s3);

                ChangeListener    L    =    new    ChangeListener() {
                    // ADD LISTENER IMPLEMENTATION
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        int red = s1.getValue();
                        int green = s2.getValue();
                        int blue = s3.getValue();
                        P1.setBackground(new Color(red,green,blue));
                    }
                };

                s1.addChangeListener(L);
                s2.addChangeListener(L);
                s3.addChangeListener(L);

                F.getContentPane().add(P1);
                F.getContentPane().add(P2,BorderLayout.SOUTH);

                F.setSize(400,400);
                F.setVisible(true);
            }
        });
    }

}
