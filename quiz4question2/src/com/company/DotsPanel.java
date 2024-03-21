package com.company;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DotsPanel    extends    JPanel     implements    MouseListener
{

    public    ArrayList<Point>    L    =    new    ArrayList<Point>();
    public    DotsPanel()
    {
        setBackground(Color.WHITE);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // ADD CODE TO DRAW THE DOTS
        Point point = new Point(e.getX(),e.getY());
        L.add(point);
        repaint();
//        this.setBackground(Color.black);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void deleteDots(){
        L.clear();
        repaint();
    }


    public    void    paintComponent    (Graphics    G)
    {
        super.paintComponent(G);
        for(int i = 0; i < L.size();i++){

            G.drawOval((int)L.get(i).getX(),(int)L.get(i).getY(),10,10);
        }
    }
}



    // ADD CLEAR METHOD

    // ADD MOUSE LISTENERS


