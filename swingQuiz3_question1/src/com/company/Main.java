package com.company;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import static javax.swing.SwingConstants.CENTER;

public class Main
{
    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame("Converter");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                F.getContentPane().setLayout(new GridLayout(2,1));

                JTextField  t1   =   new JTextField(20);
                JTextField  t2   =   new JTextField(20);


                // SET TEXT ALIGNMENT AND BORDER FOR t1
                TitledBorder titledEuros = new TitledBorder("euros");
                titledEuros.setTitleJustification(TitledBorder.CENTER);
                t1.setBorder(titledEuros);

                // SET TEXT ALIGNMENT AND BORDER FOR t2
                TitledBorder titledBitcoins = new TitledBorder("bitcoins");
                titledBitcoins.setTitleJustification(TitledBorder.CENTER);
                t2.setBorder(titledBitcoins);

                F.getContentPane().add(t1);
                F.getContentPane().add(t2);
                new Controller(t1,t2);

                F.pack();
                F.setVisible(true);
            }
        });
    }

}
