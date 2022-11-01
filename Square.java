

/*
 Square clase to create a Squares and pass them to ArrayForm clase to store them 
 2buttons to create and cancle (back to mainGUI)
 one text field and one label for leangth 
 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Square extends ArrayForm{
    
   JFrame f;
   public JLabel length;
   public  JTextField t;
   public JButton b1 , b2;  
   public String [] arrayS; 
   String resS,lengthS,x,areaS;
   double lengS, areaMath; 
   int n=-1;
   

    public Square() {
        
        f = new JFrame("Circle");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(500, 250);
        f.setSize(550,250);

        length = new JLabel("Length");
        length.setFont(font);
        t = new JTextField(7);
        t.setFont(font);
        b1 = new JButton("Create");
        b1.setFont(font);
        b2 = new JButton("Cancle");
        b2.setFont(font);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.add(length);
        p1.add(t);

        p2.add(b1);
        p2.add(b2);

       b1.addActionListener(new actionSquare());
       b2.addActionListener(new actionSquareC());

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);

       f.setVisible(true);
    }
  


     class actionSquare implements ActionListener{
        public void actionPerformed(ActionEvent e){
           try {
            JButton ab = (JButton)e.getSource();
            if(ab == b1 ){
                if(t.getText().equals("") ){
                JOptionPane.showConfirmDialog(null, "You need to fill the answers!", "empty input", 0);
                
                }
            else  {

                    x = t.getText();
                    lengS = Double.parseDouble(x);
                    areaMath = lengS *lengS;
                    areaS = String.valueOf(areaMath);
                String resS = "Square { Length= " + x + "\n ,Area= " + areaS +" }";
               indexS++; 
                S[++n]=resS;
                
                JOptionPane.showMessageDialog(null, "Square is created!","Well Done",JOptionPane.INFORMATION_MESSAGE);
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

class actionSquareC implements ActionListener{
    public void actionPerformed(ActionEvent e){
        int n =  JOptionPane.showConfirmDialog(null, "Do you want to clear the answers?", "", 0);
        if(n==0) {
          t.setText("");       
}
      else {
       f.dispose();
        Geometric g = new Geometric();

        }             
}   
}

public static void main(String[] args) throws IOException{
        Square s = new Square();
    }
}





