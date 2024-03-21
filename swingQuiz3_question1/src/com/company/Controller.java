package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener
{
    Double price = 3905.6155;
    JTextField euros;
    JTextField bitcoins;

    public Controller   (JTextField T1,JTextField T2)
    {
        euros      =   T1;
        bitcoins   =   T2;
        // ADD CODE HERE
        T1.addActionListener(this);
        T2.addActionListener(this);
    }

    public void actionPerformed  (ActionEvent e)
    {
        // ADD CODE HERE
        // (use e.getSource() to determine the source of the event)
        if(e.getSource() == euros){
            double eurosDouble = Double.parseDouble(euros.getText());
            eurosDouble = eurosDouble / price;
            bitcoins.setText(""+ eurosDouble);
        }else if(e.getSource() == bitcoins){
            double bitcoinsDouble = Double.parseDouble(bitcoins.getText());
            bitcoinsDouble = bitcoinsDouble * price;
            euros.setText(""+ bitcoinsDouble);
        }
    }

}
