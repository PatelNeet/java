
package AWTEx;
import java.awt.*;			
import java.awt.event.*;
//import java.awt.event.ActionEvent;		//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;	//import java.awt.event.WindowEvent;


public class PasswordEvent8 extends java.awt.Frame implements ActionListener {
 

        Label lblname = new Label("Name");
        Label lblpassword = new Label("Password");
        Label lblans = new Label("Name & Password");

        TextField textname = new TextField(20);
        TextField textpassword = new TextField(20);
        TextField textans = new TextField(40);

        Button btnclick = new Button("Display");
        GridLayout gl = new GridLayout(4,2);

    public PasswordEvent8(String s) {

        super(s);
        initComponents();
        setLayout(gl);

        btnclick.addActionListener(this);
        add(lblname);
        add(textname);
        add(lblpassword);
        
        textpassword.setEchoChar('*');
        add(textpassword);
        add(lblans);
        add(textans);
        add(btnclick);

    }
    
    public static void main(String args[]) {

        PasswordEvent8 p = new PasswordEvent8("Name & Password");
        p.setSize(300,200);
        p.show();
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
        String s = textname.getText();
        String s1 = textpassword.getText();
        textans.setText(s+","+s1);
    }

}
