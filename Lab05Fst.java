// Lab05Fst.java
// This is the student, starting version of Lab 05F which is divided into 8 cells.
// The first cell -- "Draw Red Horizontal Lines" -- is provided as an example.
// Students need to complete the other 7 cells on their own.

import java.awt.*;
import java.applet.*;

public class Lab05Fst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        int x1, y1, x2, y2, x, y, r, r2;

        // Draw Red Horizontal Lines
        Expo.setColor(g,Expo.red);
        x1 = 0;
        y1 = 5;
        x2 = 250;
        y2 = 5;
        for (int j = 1; j <= 32; j++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            y1 += 10;
            y2 += 10;
        }
        
        
        // Draw Blue Vertical Lines
        Expo.setColor(g,Expo.blue);
        x1 = 255;
        y1 = 0;
        x2 = 255;
        y2 = 325;
        for(int j = 1;j <= 25;j++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            x1 += 10;
            x2 += 10;
        }
        
        
        // Draw Gray Diagonal Dots
        Expo.setColor(g,Expo.grey);
        x1 = 505;
        y1 = 288;
        for(int j = 1;j <= 25;j++)
        {
            Expo.drawPoint(g,x1,y1);
            x1 += 10;
            y1 -= 10;
        }
        
        
        // Draw Green Concentric Circles
        Expo.setColor(g,Expo.green);
        x1 = 875;
        y1 = 163;
        r  = 10;
        for(int j = 1;j <= 12;j++)
        {
            Expo.drawCircle(g,x1,y1,r);
            r += 10;
        }

        
        // Draw Purple Concentric Ovals
        Expo.setColor(g,Expo.purple);
        x1 = 125;
        y1 = 488;
        r  = 6;
        r2 = 8;
        for(int j = 1;j <= 20;j++)
        {
            Expo.drawOval(g,x1,y1,r,r2);
            r  += 6;
            r2 += 8;
        }

        
        // Draw Pink Concentric Arcs
        Expo.setColor(g,Expo.pink);
        x1 = 255;
        y1 = 645;
        r  = 12;
        r2 = 16;
        x  = 0;
        y  = 90;
        for(int j = 1;j <= 19;j++)
        {
            Expo.drawArc(g,x1,y1,r,r2,x,y);
            r  += 12;
            r2 += 16;
        }
        

        // Draw Brown Concentric Rectangles





        // Draw Gold Sphere





    }
}




