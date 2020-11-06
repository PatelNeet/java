
package AWTEx;
import java.awt.*;
import java.awt.event.*;

public class MoveButton7 extends java.awt.Frame implements ActionListener{
    Button b1= new Button("Click");
    /** Creates new form MoveButton7 */
    public MoveButton7(String s) {
        
        super(s);
        initComponents();
        setBackground(Color.pink);
        setLayout(null);
        b1.addActionListener(this);
        b1.setBounds(20, 50, 100, 25);//intial position...
        add(b1);
        


    }
    public static void main(String[] args) {
        MoveButton7 mb = new MoveButton7("Click And Move The Button");
        mb.setSize(300,200);
        mb.show();
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

        public void actionPerformed(ActionEvent e) {
        b1.setBounds(150, 50, 100, 25);//final position
    }
}
