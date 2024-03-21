package com.company;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BoundedRangeModel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpeedPanel    extends    JPanel    implements    ChangeListener
{

    BoundedRangeModel    M;

    public    SpeedPanel(BoundedRangeModel    newM)
    {
        M    =    newM;
        setBackground(Color.WHITE);

        // ADD CODE HERE
    M.addChangeListener(this);

    }

    public    void    paintComponent    (Graphics    G)
    {
        super.paintComponent(G);

        Graphics2D    G2    =    (Graphics2D)    G;

        // ADD CODE HERE
        G2.setColor(Color.green);
        G2.fillArc(50,100,250,250,90,90);
        G2.setColor(Color.yellow);
        G2.fillArc(50,100,250,250,45,45);
        G2.setColor(Color.red);
        G2.fillArc(50,100,250,250,0,45);
        G2.setColor(Color.black);
        G2.fillArc(50,100,250,250,M.getValue()*175/180,5);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        repaint();
    }

    // ADD CODE HERE
}
