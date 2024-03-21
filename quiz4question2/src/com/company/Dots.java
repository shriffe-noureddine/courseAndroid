package com.company;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Dots
{

    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("Swing Painting");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                final DotsPanel    P    =    new    DotsPanel();

                JButton        B    =    new    JButton("Clear");

                // ADD ACTIONLISTENER TO BUTTON
                B.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        P.deleteDots();
                    }
                });


                F.getContentPane().add(P);
                F.getContentPane().add(B,BorderLayout.SOUTH);

                F.setSize(400,400);
                F.setVisible(true);
            }
        });
    }
}
