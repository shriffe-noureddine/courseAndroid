package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Main
{

    static    JLabel    B    =    new    JLabel();

    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("JMenu Exercise");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                F.getContentPane().add(B);
                B.setOpaque(true);
                B.setHorizontalAlignment(JLabel.CENTER);

                F.setJMenuBar(createJMenuBar());

                F.setSize(400,400);                   // set Window size
                F.setVisible(true);

            }
        });
    }

    static    JMenuBar    createJMenuBar()
    {
        JMenuBar    M    =    new    JMenuBar();

        JMenu color = new JMenu("Color");
        JMenu name = new JMenu("Name");
        M.add(color);
        M.add(name);

        JMenuItem menuRed = new JMenuItem("red");
        JMenuItem menuBlue = new JMenuItem("blue");
        JMenuItem menuGreen = new JMenuItem("green");
        color.add(menuRed);
        color.add(menuBlue);
        color.add(menuGreen);

        JMenuItem alice = new JMenuItem("Alice");
        JMenuItem bob = new JMenuItem("Bob");
        JMenuItem carol = new JMenuItem("Carol");
        name.add(alice);
        name.add(bob);
        name.add(carol);
        B.setFont(new Font("Serif", Font.PLAIN, 22));

        ActionListener setColor = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String c = ((JMenuItem)e.getSource()).getText();
//                Stirng c = Color.getColor();
                if(c == "blue"){
                    B.setBackground(Color.BLUE);
                }else if( c == "green"){
                    B.setBackground(Color.GREEN);
                }else if(c == "red"){
                    B.setBackground(Color.RED);
                }

            }
        };

        ActionListener setName = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = ((JMenuItem)e.getSource()).getText();
                B.setText(s);
            }
        };

        menuGreen.addActionListener(setColor);
        menuRed.addActionListener(setColor);
        menuBlue.addActionListener(setColor);

        alice.addActionListener(setName);
        bob.addActionListener(setName);
        carol.addActionListener(setName);

        return M;
    }

}