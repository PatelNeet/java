package AWTEx;
import java.awt.*;
public class FrameEx1 extends java.awt.Frame {

    /** Creates new form FrameEx1 */
    FlowLayout fl=new FlowLayout();
    Label l=new Label("Username:");
    TextField tf=new TextField(20);
    Button b=new Button("Login");
    public FrameEx1(String s) {
        super(s);
        initComponents();
        setLayout(fl);
        
        add(l);
        add(tf);
        add(b);
    }
    public static void main(String[] args) {
        FrameEx1 f=new FrameEx1("Welcome");
        f.setSize(500, 500);
       // f.setTitle("Welcome");
        f.show();
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




