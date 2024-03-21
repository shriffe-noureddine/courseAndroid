package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main
{

    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("Swing custom paint");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel    P    =    new    MyPanel();
                F.getContentPane().add(P);

                F.setSize(400,400);
                F.setVisible(true);
            }
        });
    }
}
