
package AWTEx;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Event5_1 extends java.awt.Frame implements ActionListener{

    FlowLayout fl=new FlowLayout();
    Button b1=new Button("Red");
    Button b2=new Button("Green");
    Button b3=new Button("Blue");
    TextField tf1=new TextField(20);
    Button b4=new Button("Click");
    TextField tf2=new TextField(20);
  
    /** Creates new form Event5_1 */
    public Event5_1() {
        initComponents();
        setLayout(fl);
        
        add(b1);
        add(b2);
        add(b3);
        add(tf1);
        add(b4);
        add(tf2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public static void main(String[] args) {
        Event5_1 e=new Event5_1();
        e.setSize(500, 500);
        e.setTitle("Event Example");
        e.show();
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

//    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
            if(e.getSource()==b1)
            {
                setBackground(Color.RED);
            }
            else if(e.getSource()==b2)
            {
                setBackground(Color.GREEN);
            }
            else if(e.getSource()==b3)
            {
                setBackground(Color.BLUE);
            }
            else if(e.getSource()==b4)
            {
                String s;
                s=tf1.getText();
                tf2.setText(s);
                tf2.setBackground(Color.CYAN);
                
            }
    }
}
