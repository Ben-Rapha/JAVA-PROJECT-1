
package project1;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class DateGUI extends JFrame {
    private JFrame frame;
    private JTextArea leftSide;
    private JTextArea rightSide;
   
    public void DateGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        putTogether(getContentPane());
        setVisible(true);
        
     }//DATEGUI
    
    public void setRightSide(String[] text) {
        String dates = "Sorted dates: " + "\n";
        for (String date : text) {
            if (!date.isEmpty())
                dates += date + "\n";
        }
        // place date list on the right side
        rightSide = new JTextArea(dates);
    }
    
     public void setLeftSide(String[] text) {
        String dates = "Unsorted dates: " + "\n";
        for (String date : text) {
            if(!date.isEmpty())
                dates += date + "\n";
        }
      
         // place date list on the left side
        
        leftSide = new JTextArea(dates);
    }
    private void putTogether(Container container) {
        //method to put together date lis on the content window:
        GridLayout layout = new GridLayout(1, 2); //create 1 column  2 row s
        container.setLayout(layout);

        container.add(leftSide);
        container.add(rightSide);
    }
    
    
}
