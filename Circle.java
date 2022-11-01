

/*
 -Circle clase to create a circles and pass them to ArrayForm clase to store them
 -2 buttons to create and cancle (back to mainGUI)
 -3 text fields and 3 labels for x and y and radius 
*/



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.math.*;


public class Circle extends ArrayForm{
    JFrame f;
    JLabel cx, yL, rL;
    JTextField t1, t2, t3;
    JButton b1 , b2;
    String x , y ,r;
    String resC, areaS;
    double radius;  
    double area; 
     int n=-1;
    

    public Circle(){
        f = new JFrame("Circle");
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setLocation(500, 250);
         f.setSize(550,250);
          
         cx = new JLabel("Center X: ");
         cx.setFont(font);
         yL = new JLabel("Y: ");
         yL.setFont(font);
         rL = new JLabel("Radius");
         rL.setFont(font);

         t1 = new JTextField(5);
         t1.setFont(font);
         t2 = new JTextField(5);
         t2.setFont(font);
         t3 = new JTextField(5);
         t3.setFont(font);

         b1 = new JButton("Create");
         b1.setFont(font);
         b2 = new JButton("Cancle");
         b2.setFont(font);

         JPanel p1 = new JPanel();
         JPanel p2 = new JPanel();
         JPanel p3 = new JPanel();

         p1.add(cx);
         p1.add(t1);
         p1.add(yL);
         p1.add(t2);

         p2.add(rL);
         p2.add(t3);

         p3.add(b1);
         p3.add(b2);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.CENTER);
        f.add(p3, BorderLayout.SOUTH);

        b1.addActionListener(new actionCircleb1());
         b2.addActionListener(new actionCircleb2());

         f.setVisible(true);
    }
 
  

  public class actionCircleb1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        try {
        JButton ab = (JButton)e.getSource();
        if(ab == b1 ){
            if(t1.getText().equals("") && t2.getText().equals("") && t3.getText().equals("")){
            JOptionPane.showConfirmDialog(null, "You need to fill the answers!", "empty input", 0);
            }
            else if(t1.getText().equals("")) {
              JOptionPane.showMessageDialog(null, "please enter the X value! ","missing value",JOptionPane.ERROR_MESSAGE);
              }
            else if(t2.getText().equals("")){
              JOptionPane.showMessageDialog(null, "please enter the Y value!","missing value",JOptionPane.ERROR_MESSAGE);
              }
            else if(t3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "please enter the Radius value!","missing value",JOptionPane.ERROR_MESSAGE);
                }

            else {
          
               
                x=t1.getText(); 
                y =t2.getText();   
                r =t3.getText();
                radius = Double.parseDouble(r);
                area =  (radius*radius) * Math.PI; 
                areaS = String.valueOf(area);
                 resC = "Circle {Point= ( " + x + ", " + y + " )" + "Radius= " + r  + "\n , Area= "+  areaS +" } ";
                 indexC++;
                  C[++n]=resC; 
                JOptionPane.showMessageDialog(null, "Circle is created!","Well Done",JOptionPane.INFORMATION_MESSAGE);
            }    
        }       
            }
        catch(ClassCastException ae){
            System.out.println("incorret casting" + ae.getMessage());   
        }
        catch(NumberFormatException ie){
            System.out.println("wrong format" + ie.getMessage());
        }
        
        }

    }


    public class actionCircleb2 implements ActionListener  {
        public void actionPerformed(ActionEvent e){

            int n =  JOptionPane.showConfirmDialog(null, "Do you want to clear the answers?", "", 0);
          if(n==0) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            System.out.println(C[0]);
            System.out.println(C[1]);   System.out.println(C[2]);
}
        else {
         f.dispose();
          Geometric g = new Geometric();
        
        } 
        }
         
        }
            
    public static void main(String[] args) {    
    new Circle();         
} 
            }



  









  




