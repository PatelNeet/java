
package AWTEx;
import java.awt.*;
public class MyFrame3 extends java.awt.Frame {

    /** Creates new form MyFrame3 */
    public MyFrame3(String s)
    {		
        super(s);
        initComponents();
    }
    public static void main (String[] args)
    {
        MyFrame3 m=new MyFrame3("This is my First Frame");
        m.setSize(500,300);
        m.show();
    }       


   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}