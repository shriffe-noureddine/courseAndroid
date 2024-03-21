package com.company;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PacMan
{

    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("PacMan");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel    P    =    new    PacManPanel();

                F.getContentPane().add(P);

                F.setSize(400,400);
                F.setVisible(true);
            }
        });
    }
}