
package Apllet_EX;
import java.awt.*;	


public class Rectangles6 extends java.applet.Applet
{

public void paint(Graphics g)
    {
    g.drawRect(10, 10, 60, 50);
    g.fillRect(80, 10, 60, 50);
    g.drawRoundRect(150, 10, 60, 50, 5, 5);
    g.fillRoundRect(10, 70, 150, 100, 10, 10);	
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
