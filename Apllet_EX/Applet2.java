//APPLET WITH GUI
package Apllet_EX;
import java.awt.*;

public class Applet2 extends java.applet.Applet 
{
    public void init()
    {
        setBackground(Color.red);
        setForeground(Color.white);
    }
    
    public void paint(Graphics gp)
    {
        gp.drawString("Hello" ,10, 20);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
