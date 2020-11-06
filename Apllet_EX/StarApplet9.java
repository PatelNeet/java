//MAKING STAR 
package Apllet_EX;
import java.awt.*;
public class StarApplet9 extends java.applet.Applet {

    public void paint(Graphics g)
    {
    g.drawLine(175, 0, 50, 125);
    g.drawLine(175, 0, 300, 125);
    g.drawLine(50, 125, 300, 50);
    g.drawLine(300, 125, 50, 50);
    g.drawLine(50, 50, 300, 50);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

