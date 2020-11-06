//APPLET LIFE CYCLE

package Apllet_EX;
import java.awt.*;

public class Applet3 extends java.applet.Applet
{
    
String s1,s2,s3,s4;
public void init() 
    {
    setForeground(Color.black);
    setBackground(Color.white);
    s1="This msg is from init method";
    }
public void start()
    {
    s2="This msg is from start method";
    }
public void stop()
    {
    s3="This msg is from stop method";
    } 
public void paint(Graphics gp)
    {
    if(s1!=null)
    gp.drawString(s1, 10, 40);
    if(s2!=null)
    gp.drawString(s2, 10, 60);
    if(s3!=null)
    gp.drawString(s3, 10, 80);
    if(s4!=null)
    gp.drawString(s4, 10, 100);
    gp.drawString("This msg is from paint method", 10, 20); // due to 20 at output this will first printed!
    }

public void destroy()
    {
    s4="Now Computer will remove Memory of Applet";
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
