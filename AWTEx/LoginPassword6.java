
package AWTEx;
import java.awt.*;
import java.awt.event.*;
public class LoginPassword6 extends java.awt.Frame implements ActionListener {
    
    Label lname = new Label("Name");
    Label lpas = new Label("Password");
    TextField textname = new TextField();
    TextField textpas = new TextField();
    TextField textans = new TextField();
    Button btnclick = new Button("Login");


    /** Creates new form LoginPassword6 */
    public LoginPassword6(String s) {
        super(s);
        initComponents();
      
        setBackground(Color.pink);
        setLayout(null);
        lname.setBounds(20,50,50,25);
        lpas.setBounds(20, 90, 60, 25);
        textname.setBounds(80, 50, 120, 25);
        textpas.setBounds(80, 90, 120, 25);

        textans.setBounds(50, 140, 150, 25 );
        btnclick.setBounds(100, 170, 80,40);
        btnclick.addActionListener(this);

        add(lname);
        add(textname);
        textpas.setEchoChar('*');
        add(lpas);
        add(textpas);
        add(textans);
        add(btnclick);

    }
    
    public static void main(String args[])
    {
    LoginPassword6 lp = new LoginPassword6("Login Password");
    lp.setSize(300,200);
    lp.show();	
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

        public void actionPerformed(ActionEvent e)
    {
        String s = textname.getText();
        String n = textpas.getText();
        if(s.equals("lTech") && n.equals("Mah"))
        {
            textans.setText("Login Successfully");
        }
        else
        {           
            textans.setText("Invalid Username or Password");	
        }
    }
}
