

/*
   form class is to display the informations of forms
*/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;    

public class displayForms extends ArrayForm {    
JFrame f;
JLabel T,L;
JButton show,Back;
JComboBox cb;

form(){    
    f=new JFrame("Display Forms"); 
    f.setLocation(500, 250);
    f.setSize(550,250);
    String Shapes[]={"Rectangle","Circle","Square"};        
    cb=new JComboBox(Shapes);    
    cb.setBounds(50, 50,90,20);  
    cb.setFont(font);
    T = new JLabel("choose a shape");
    T.setFont(font);
    L =new JLabel("");
  //  L.setFont(font);
   show=new  JButton("show");
   show.setFont(font);
   Back=new JButton("Back");
   Back.setFont(font);
   
   JPanel p1=new JPanel();
   JPanel p2 = new JPanel();
   JPanel p3=new JPanel();
   
    
   p1.add(T);
   p2.add(cb);
   p2.add(show);
   p2.add(Back);
   p3.add(L);
   
    f.add(p1,BorderLayout.WEST);
    f.add(p2,BorderLayout.CENTER);
    f.add(p3,BorderLayout.SOUTH);
    
    f.setLayout(new GridLayout(3,1));    
    f.setSize(500,400);    
    f.setVisible(true);         
  

 show.addActionListener(new showP());
 Back.addActionListener(new BackP());

}  

public class showP implements ActionListener{
    int nS=0,nC=0,nR=0;
        public void actionPerformed(ActionEvent ae) {
          
            try {
            String shape = (String)cb.getSelectedItem();
            String data=null;
            
            if(shape=="Circle"){
                    data = "Shape Selected is: "+C[nC];  
                     L.setText(data); 
                      nC++;
                    }
            else if(shape=="Rectangle"){
                    data = "Shape Selected is: "+R[nR];  
                     L.setText(data); 
                      nR++;
                    }
                  
             else if(shape=="Square"){
                    data = "Shape Selected is: "+S[nS];  
                     L.setText(data); 
                      nS++;
                    }
            }
            
            
            catch(NumberFormatException e){           
                System.out.println("incorrect type of format" + e.getMessage());
            }
            catch(ClassCastException e){
            System.out.println("Class not found" + e.getMessage());
            
        }
            catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Class not found" + e.getMessage());
            
        }
          
            
        }
         

}

public class BackP implements ActionListener{
 
        public void actionPerformed(ActionEvent ae) {
            f.dispose();
            new MainGUI();
        }
}
public static void main(String[] args) {    
    new displayForms();         
}    
}  





