
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Geometric extends JFrame  {

    //defining the buttons that will contain the operations of the forms
    private JButton b1, b2, b3, b4 ;
   
   public Geometric(){

   // this.setSize(250,500);
    this.setLocation(500,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("GUI Forms");
    
    //creating the buttons
    b1 = new JButton("Create Rectangle");
    b2 = new JButton("Create Circle");
    b3 = new JButton("Create Square");
    b4 = new JButton("Display Forms");

   //organizing the buttons
   JPanel org = (JPanel)this.getContentPane();
   org.setLayout(new GridLayout(4,1));
   //add the buttons to the panels
   org.add(b1);
   org.add(b2);
   org.add(b3);
   org.add(b4);


    this.setVisible(true);
    this.pack();
   }
 

    public static void main(String[] args) {
        Geometric proj= new Geometric();
    }


}
