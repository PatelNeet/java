//SMIELY USING GUI
package Apllet_EX;
import java.awt.*;

public class Smiley7 extends java.applet.Applet {

    public void paint(Graphics g)
    {
    g.drawOval(60, 60, 110, 110);//circle
    //g.drawLine(60, 60, 10, 10);//cross
    //g.drawLine(60, 60, 60, 170);//top-bottom left
    //g.drawLine(60, 60, 170, 60);//top left-right
    //g.drawLine(60, 170, 170, 170);//bottom left-right
    //g.drawLine(170, 60, 170, 170);//top-bottom right
    //g.drawLine(60, 140, 170, 140);//smile line
    //g.drawLine(115, 60, 115, 170);//midLine
    g.drawArc(105, 130, 20, 20, 0, -180);
    g.drawLine(115, 80, 105, 120);
    g.drawLine(105, 120, 125, 120);
    g.drawLine(115, 80, 125, 120);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
