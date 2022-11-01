

/*
 -Recatangle clase to create a rectangles and pass them to ArrayForm clase to store them 
 -2 buttons to create and cancle (back to mainGUI)
 -2 text fields and 2 labels for leangth and width
 
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;



public class Rectangle extends ArrayForm{
    
 JFrame r;
 JButton Create,Cancle;
 JLabel Length , Width;
 JTextField t1,t2;
 String resR ,LenghS , WidhtS,areaS;
 int n=-1;
 double lengthD, widthD, areaD;
 
 
 
 
 public Rectangle()  {
     
    r =new JFrame("Rectangle");
    r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    r.setLocation(500, 250);
    r.setSize(550,250);
    
    Create = new JButton("Create");
    Create.setFont(font);
    Cancle = new JButton("Cancle");
    Cancle.setFont(font);
    Length = new JLabel("Length");
    Length.setFont(font);
    Width = new JLabel("Width");
    Width.setFont(font);
    t1 = new JTextField(5);
    t1.setFont(font);
    t2 = new JTextField(5);
    t2.setFont(font);

  
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();


    p1.add(Length);
    p1.add(t1);
    p1.add(Width);
    p1.add(t2);
    p2.add(Create);
    p2.add(Cancle);
    
    r.add(p1,BorderLayout.NORTH );
    r.add(p2,BorderLayout.CENTER );

    Create.addActionListener(new CreateC());
    Cancle.addActionListener(new CancleC());
     r.setVisible(true);

}


   public class CreateC implements ActionListener{
    public void actionPerformed(ActionEvent ae) {
        try {  
        JButton newB=(JButton)ae.getSource();
          if(newB==Create){
                if(t1.getText().equals("") && t2.getText().equals("") ){
                JOptionPane.showConfirmDialog(null, "You need to fill the answers!", "empty input", 0);}
                else if(t1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "please enter the length ","missing value",JOptionPane.ERROR_MESSAGE);
                 }
                else if(t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "please enter the width","missing value",JOptionPane.ERROR_MESSAGE);
                }
                
            else {
                          lengthD =  Double.parseDouble(t1.getText());
                          widthD = Double.parseDouble(t2.getText());
                          areaD = lengthD *widthD;
                          areaS = String.valueOf(areaD);
                          
                          LenghS =t1.getText();  
                           WidhtS  =t2.getText();   
                             
                             resR = "Rectangle{ Length= " + LenghS + ", Widht= " + WidhtS + "\n, Area= " + areaS +" } " ;
                             indexR++;
                             R[++n]=resR;
                          JOptionPane.showMessageDialog(null, "Rectangle is created","well done",JOptionPane.INFORMATION_MESSAGE);
                          
                         
    }
              
    }
    }
          catch(ClassCastException e){
            System.out.println("incorret casting" + e.getMessage());   
        }
        catch(NumberFormatException ie){
            System.out.println("wrong format" + ie.getMessage());
        }
    }
   }

public class CancleC implements ActionListener{
 public void actionPerformed(ActionEvent ae) {
          try {    
     int n =  JOptionPane.showConfirmDialog(null, "Do you want to clear the answers ?", "", 0);
                if(n==0) {
                  t1.setText("");
                  t2.setText("");
    }
              else {

               r.dispose();
                 Geometric dd = new Geometric();

                }                         
     }
            catch(ClassCastException e){
            System.out.println("incorret casting" + e.getMessage());   
        }
        catch(NumberFormatException ie){
            System.out.println("wrong format" + ie.getMessage());
        }
 }
}
public static void main(String[] args) {    
   Rectangle R= new Rectangle();         
}
}
   









   





