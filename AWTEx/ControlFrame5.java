package AWTEx;
import java.awt.*;
import java.awt.event.*;
public class ControlFrame5 extends java.awt.Frame  {

    /** Creates new form ControlFrame5 */
    Label name = new Label("Name:");
    Label address = new Label("Address");

    TextField textname = new TextField();
    TextArea textaddress = new TextArea();

    Label education = new Label("Education");
    CheckboxGroup gender = new CheckboxGroup();
    Checkbox c1 = new Checkbox("Male",gender,true);
    Checkbox c2 = new Checkbox("Female",gender,false);


    Label username = new Label("Username");
    Label password = new Label("Password");
    TextField textusername = new TextField();
    TextField textpassword = new TextField();
    TextField textans = new TextField();

    Button b1 = new Button("Submit");
    Button b2 = new Button("Cancle");   
    Button b3 = new Button("Login");
    GridLayout gl = new GridLayout(10,2);
    public ControlFrame5(String s) {
        super(s);
        initComponents();
        setLayout(gl);
        add(name);
        add(textname);
        add(address);
        add(textaddress);
        add(education);
        
        
        add(b1);
        add(b2);
        add(b3);
    }

    
    public static void main(String args[])
    {
   
    List H = new List();
        H.addItem("Swim");
        H.addItem("Cricket");
        H.addItem("Gym");
        H.addItem("Basketball");
        H.addItem("Football");

        
        Choice c = new Choice();
        c.addItem("10");
        c.addItem("11sci");
        c.addItem("12sci");
        c.addItem("11com");
        c.addItem("12com");

        ControlFrame5 cf = new ControlFrame5("Login Form");
        cf.add(c);       
        cf.add(H);
        cf.setSize(500,500);
       
        cf.show();
        
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
