/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calci;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



class gui extends JFrame{
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
        JButton ba,bb,bc,bd,be, bf;
        JTextField t1;
        static double a=0,b=0,res=0;static int op=0;
        
        
        JPanel p1,p2;
         gui(){
         setSize(700,700);
           setLayout(null);
          
           p1=new JPanel();
           p1.setLayout(null);
          
           p1.setBounds(20,60,580,60);
           add(p1);
           p2=new JPanel();
           p2.setLayout(null);
          
           
         
           p2.setBounds(20,140,580,580);
           add(p2);
           t1=new JTextField();
           t1.setBounds(20,20,300,30);
           p1.add(t1);
           ba=new JButton("clear");
           ba.setBounds(330,20,50,30);
           ba.addActionListener(new A());
           p1.add(ba);
           b0=new JButton("0");
           b0.setBounds(20,20,50,30);
            b0.addActionListener(new B());
           p2.add(b0);
           b1=new JButton("1");
           b1.setBounds(100,20,50,30);
            b1.addActionListener(new C());
           p2.add(b1);
           b2=new JButton("2");
           b2.setBounds(200,20,50,30);
            b2.addActionListener(new D());
           p2.add(b2);
             b3=new JButton("3");
           b3.setBounds(20,70,50,30);
           b3.addActionListener(new E());

           p2.add(b3);
           b4=new JButton("4");
           b4.setBounds(100,70,50,30);
           b4.addActionListener(new F());

           p2.add(b4);
           b5=new JButton("5");
           b5.setBounds(200,70,50,30);
           b5.addActionListener(new G());
           p2.add(b5);
           b6=new JButton("6");
           b6.setBounds(20,140,50,30);
           b6.addActionListener(new H());
           p2.add(b6);
           b7=new JButton("7");
           b7.setBounds(100,140,50,30);
           b7.addActionListener(new I());
           
           p2.add(b7);
           b8=new JButton("8");
           b8.setBounds(200,140,50,30);
           b8.addActionListener(new J());
           p2.add(b8);
             b9=new JButton("9");
           b9.setBounds(20,210,50,30);
           b9.addActionListener(new K());
           p2.add(b9);
           bb=new JButton("-");
           bb.setBounds(200,210,50,30);
           bb.addActionListener(new sub());
           p2.add(bb);
           bc=new JButton("+");
           bc.setBounds(100,210,50,30);
           bc.addActionListener(new add());
           p2.add(bc);
           bd=new JButton("=");
           bd.setBounds(300,20,50,70);
           bd.addActionListener(new eq());
           p2.add(bd);
           be=new JButton("*");
           be.setBounds(300,210,50,30);
           be.addActionListener(new mul());
           p2.add(be);
           bf=new JButton("/");
           bf.setBounds(300,140,50,30);
           bf.addActionListener(new div());
           p2.add(bf);
           
           
         
         
        
       
        
        
    }
         class A implements ActionListener{

   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ba){
         t1.setText("");
        
            
        }
    
    
    }
    
    
}
class B implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b0){
           t1.setText(t1.getText().concat("0"));
       }
}
}
class I implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b7){
           t1.setText(t1.getText().concat("7"));
       }
}
}
class J implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b8){
           t1.setText(t1.getText().concat("8"));
       }
}
}
class K implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b9){
           t1.setText(t1.getText().concat("9"));
       }
}
}
class sub implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==bb){
          a=Double.parseDouble(t1.getText());
          op=2;
          t1.setText("");
       }
}
}
class add implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==bc){
           a=Double.parseDouble(t1.getText());
          op=1;
          t1.setText("");
       }
}
}
class mul implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==be){
           a=Double.parseDouble(t1.getText());
          op=3;
          t1.setText("");
       }
}
}
class div implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==bf){
           a=Double.parseDouble(t1.getText());
          op=4;
          t1.setText("");
       }
}
}
class eq implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==bd){
         b=Double.parseDouble(t1.getText());
         switch(op)
         {
             case 1:res=a+b;
             break;
             case 2:res=a-b;
             break;
             case 3:res=a*b;
             break;
             case 4:res=a/b;break;
             default:res=0;
         }
         t1.setText(""+res);
       }
}
}


class C implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==b1){
           t1.setText(t1.getText().concat("1"));
       }
    }
    
}
class D implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b2){
           t1.setText(t1.getText().concat("2"));
       }
    }
        
    
}
class E implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b3){
           t1.setText(t1.getText().concat("3"));
       }
    
}
} 
class F implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b4){
           t1.setText(t1.getText().concat("4"));
       }
    
}
}
class G implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b5){
           t1.setText(t1.getText().concat("5"));
       }
    }
}
class H implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b6){
           t1.setText(t1.getText().concat("6"));
       }
    
}
           
    
   
}}

public class Calci{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gui g=new gui();
        g.setVisible(true);
    }
    
}
