
package AWTEx;
import java.awt.*;

public class FramEx2 extends java.awt.Frame {

     /** Creates new form First */
   // FlowLayout fl=new FlowLayout();
    GridLayout gl=new GridLayout(4, 2);
    Label l=new Label("Username:");
    TextField tf=new TextField(20);
    TextArea ta=new TextArea(4, 20);
    Choice c=new Choice();
    List li=new List();
    Checkbox c1=new Checkbox("C");
    Checkbox c2=new Checkbox("C++");
    Checkbox c3=new Checkbox("Java");
    Checkbox c4=new Checkbox("PHP");
    
    CheckboxGroup cg=new CheckboxGroup();
    Checkbox r1=new Checkbox("Male", cg, false);
    Checkbox r2=new Checkbox("Female", cg, false);
    
    Panel p1=new Panel();
    Panel p2=new Panel();
    Button b=new Button("Login");
    public FramEx2(String s) {
        super(s);
        initComponents();
        setLayout(gl);
        
        add(l);
        add(tf);
        add(ta);
        
        c.addItem("Apple");
        c.addItem("Banana");
        c.addItem("Chiku");
        c.addItem("Mango");
        add(c);
        add(p1);
        li.addItem("Apple");
        li.addItem("Banana");
        li.addItem("Chiku");
        li.addItem("Mango");
        add(li);
        
        p2.add(c1);
        p2.add(c2);
        p2.add(c3);
        p2.add(c4);
        p2.setBackground(Color.red);
        add(p2);
        p1.add(r1);
        p1.add(r2);
        p1.setBackground(Color.red);
        
        
        add(b);
    }
    public static void main(String[] args) {
        FramEx2 f=new FramEx2("Welcome");
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


