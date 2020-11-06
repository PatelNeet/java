package AWTEx;
import java.awt.*;
public class ChoiceEx4 extends java.awt.Frame {

    /** Creates new form ChoiceEx4 */
    public ChoiceEx4(String s)
    {
        super(s);
        initComponents();
    }	
    public static void main(String[] args) {
        Choice c=new Choice();
        c.addItem("Red");
        c.addItem("Green");
        c.addItem("Blue");
        
        List l=new List();
        l.addItem("India");
        l.addItem("Pakistan");
        l.addItem("Australia");
        
        FlowLayout fl=new FlowLayout();
        ChoiceEx4 c1=new ChoiceEx4("ComboBox");
        c1.setLayout(fl);
        c1.add(c);
        c1.add(l);
        c1.setSize(300,200);
        c1.show();
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