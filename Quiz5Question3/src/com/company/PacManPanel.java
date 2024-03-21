package com.company;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.BoundedRangeModel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;

public class PacManPanel    extends    JPanel    implements    MouseMotionListener,ActionListener
{

    int x;
    int y;

    int t    =    30;

    public    PacManPanel()
    {
        addMouseMotionListener(this);
        setBackground(Color.CYAN);

        Timer    timer = new Timer(50, this);
        timer.start();
    }

    public    void    paintComponent    (Graphics    G)
    {
        super.paintComponent(G);

        Graphics2D    G2    =    (Graphics2D)    G;

        // ADD CODE HERE
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


    // ADD CODE HERE (FOR 2 LISTENERS)
}

