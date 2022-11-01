

/*
 main graphical user intergace 
contains 3 Buttons to create a shape and one button to dispaly them 

 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Geometric extends ArrayForm{

 JButton Rectangle,circle,square,forms;
 JFrame mainFrame;
 
 public Geometric()  {
    
    mainFrame= new JFrame("GUI Forms");
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setLocation(500, 250);
    mainFrame.setSize(550,550);

    Rectangle = new JButton("Creat Rectangle");
    Rectangle.setFont(font);
    Rectangle.setFocusable(false);
    circle = new JButton("Creat Circle");
    circle.setFont(font);
    circle.setFocusable(false);
    square = new JButton("Creat Square");
    square.setFont(font);
    square.setFocusable(false);
    forms = new JButton("Display Forms");
    forms.setFont(font);
    forms.setFocusable(false);


    JPanel mainPanel=new JPanel();
    mainPanel.setLayout(new GridLayout(4,1));

    mainPanel.add(Rectangle);
    mainPanel.add(circle);
    mainPanel.add(square);
    mainPanel.add(forms);
    
    mainFrame.add(mainPanel, BorderLayout.CENTER);


    Rectangle.addActionListener(new CreatRectangle());
    circle.addActionListener(new Creatcircle());
    square.addActionListener(new Creatsquare());
    forms.addActionListener(new Creatforms());
    
    mainFrame.setVisible(true);
}

public class CreatRectangle implements ActionListener{
    public void actionPerformed(ActionEvent ae) {
        try{       
        mainFrame.dispose();
              Rectangle dd = new Rectangle();
        }
         catch(ClassCastException e){
            System.out.println("Class not found" + e.getMessage());
                }
    }
}

public class Creatsquare implements ActionListener{
    public void actionPerformed(ActionEvent ae) {
        try{   
        mainFrame.dispose();
        Square Sq = new Square();
        }
         catch(ClassCastException e){
            System.out.println("Class not found" + e.getMessage());
                }
    }
}


public class Creatcircle implements ActionListener{
    public void actionPerformed(ActionEvent ae) {
       try{
        mainFrame.dispose();
         Circle c = new Circle();
       }
       catch(ClassCastException e){
            System.out.println("Class not found" + e.getMessage());
                }
    }}


public class Creatforms implements ActionListener{
    public void actionPerformed(ActionEvent ae) {
             try{
             mainFrame.dispose();
             new displayForms();
             }
             catch(ClassCastException e){
            System.out.println("Class not found" + e.getMessage());
                }
    }
}



    public static void main(String[] args) {
        Geometric dd = new Geometric();
    }

}











   

    




