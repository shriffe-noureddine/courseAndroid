package com.company;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



public class MyPanel    extends    JPanel
{

    public    MyPanel()
    {
        setBackground(Color.WHITE);
    }

    public    void    paintComponent    (Graphics    G)
    {
        G.setColor(Color.red);
        G.fillRect(100,100,100,100);
        G.setColor(Color.blue);
        G.fillRect(200,100,100,100);
        G.setColor(Color.green);
        G.fillRect(100,200,100,100);
        G.setColor(Color.white);
        G.fillRect(200,200,100,100);

        int y1 = 0;
        int x2 = 400;
        for(int i = 0; i < 40; i+=2){
            G.setColor(Color.black);
            G.drawLine(0,y1,x2,0);
            G.drawLine(400,y1,x2,400);
            y1+=i;
            x2-=i;


    }
    }
}
