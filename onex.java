import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Onex implements ActionListener
{
   int score=10;
   JFrame f=new JFrame("Login");
   JLabel l=new JLabel("ROLL NUMBER");
   JLabel l1=new JLabel("PASSWORD");
   JTextField t=new JTextField();
   JTextField t1=new JTextField();
   Button b=new Button("Login");
   JFrame f1=new JFrame("User Info");
   JLabel l2=new JLabel("ROLL NUMBER");
   JLabel l3=new JLabel("PASSWORD");
   JLabel l4=new JLabel("NAME");
   JLabel l5=new JLabel("BRANCH");
   JTextField t2=new JTextField();
   JTextField t3=new JTextField();
   JTextField t4=new JTextField();
   JTextField t5=new JTextField();
   JButton b1=new JButton("Update profile");
   JButton b2=new JButton("Update password");
   JButton b3=new JButton("Online Exam");
   JFrame f2=new JFrame("Online Exam");
   JFrame f3=new JFrame("Online Exam");
   JFrame f4=new JFrame("Online Exam");
   ButtonGroup bug=new ButtonGroup();
   JRadioButton r1=new JRadioButton("2011");
   JRadioButton r2=new JRadioButton("1983");
   JRadioButton r3=new JRadioButton("1990");
   JRadioButton r4=new JRadioButton("2011");
   JRadioButton r5=new JRadioButton("1983");
   JRadioButton r6=new JRadioButton("1990");
   JRadioButton r7=new JRadioButton("Virat Kohli");
   JRadioButton r8=new JRadioButton("Ms Dhoni");
   JRadioButton r9=new JRadioButton("Rohit Sharma");
   JLabel l6=new JLabel("1)When india won first world cup ?");
   JLabel l7=new JLabel("2)When india won second world cup ?");
   JLabel l8=new JLabel("3)who is the present captain for team india ?");
   JButton b4=new JButton("Logout");
   JButton b5=new JButton("Next");
   JButton b6=new JButton("Next");
   JButton b7=new JButton("Submit");
   JButton b8=new JButton("close session");
    void m1()
    {
    f.add(l);
    f.add(l1);
    f.add(t);
    f.add(t1);
    f.add(b);
    l.setBounds(55,80,100,30);
    l1.setBounds(55,140,100,30);
    t.setBounds(180,85,150,30);
    t1.setBounds(180,145,150,30); 
    b.setBounds(140,220,80,30);
    b.addActionListener(this);
    f.setTitle("Login");
    f.setSize(400,400);
    f.setLayout(new BorderLayout());
    f.setVisible(true);
    f1.add(l2);
    f1.add(l3);
    f1.add(l4);
    f1.add(l5);
    f1.add(t2);
    f1.add(t3);
    f1.add(t4);
    f1.add(t5);
    f1.add(b1);
    f1.add(b2);
    f1.add(b3);
    f1.add(b4);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    l2.setBounds(55,70,100,30);
    l3.setBounds(55,130,100,30);
    l4.setBounds(55,190,100,30);
    l5.setBounds(55,250,100,30);
    t2.setBounds(180,75,150,30);
    t3.setBounds(180,135,150,30);
    t4.setBounds(180,195,150,30);
    t5.setBounds(180,255,150,30);
    b1.setBounds(40,320,140,30);
    b2.setBounds(200,320,140,30);
    b3.setBounds(120,370,140,30);
    b4.setBounds(250,10,100,30);
    f2.add(l6);
    f2.add(b5);
    b5.addActionListener(this);
    b5.setBounds(70,190,100,30);
    l6.setBounds(50,60,300,35);
    bug.add(r1);
    bug.add(r2);
    bug.add(r3);
    f2.add(r1);
    f2.add(r2);
    f2.add(r3);
    r1.setBounds(50,90,200,30);
    r2.setBounds(50,120,200,30);
    r3.setBounds(50,150,200,30);
    f3.add(l7);
    l7.setBounds(50,60,300,35);
    bug.add(r4);
    bug.add(r5);
    bug.add(r6);
    f3.add(r4);
    f3.add(r5);
    f3.add(r6);
    r4.setBounds(50,90,200,30);
    r5.setBounds(50,120,200,30);
    r6.setBounds(50,150,200,30);
    f3.add(b6);
    b6.setBounds(70,190,100,30);
    b6.addActionListener(this);
    f4.add(l8);
    l8.setBounds(50,60,300,35);
    bug.add(r7);
    bug.add(r8);
    bug.add(r9);
    f4.add(r7);
    f4.add(r8);
    f4.add(r9);
    f4.add(b8);
    r7.setBounds(50,90,200,30);
    r8.setBounds(50,120,200,30);
    r9.setBounds(50,150,200,30);
    f4.add(b7);
    b7.setBounds(70,190,100,30);
    b7.addActionListener(this);
    b8.setBounds(250,10,150,30);
    b8.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
{
String s=t.getText();
String s1=t1.getText();
t2.setText(s);
t3.setText(s1);
t4.setText("Null");
t5.setText("Null");
f1.setSize(450,450);
f1.setLayout(null);
f1.setVisible(true);
f.setVisible(false);
}
else if(e.getSource()==b1)
{
    String name=JOptionPane.showInputDialog("Enter name");
    t4.setText(name);
    String branch=JOptionPane.showInputDialog("Enter branch");
    t5.setText(branch);
}
else if(e.getSource()==b2)
{
    String p=JOptionPane.showInputDialog("change your Password");
    t3.setText(p); 
}
else if(e.getSource()==b3)
{
    f2.setSize(450,450);
    f2.setLayout(new BorderLayout());
    f2.setVisible(true);
}
else if(e.getSource()==b5)
{
    f3.setSize(450,450);
    f3.setLayout(new BorderLayout());
    f3.setVisible(true);
    f2.setVisible(false);
}
else if(e.getSource()==b6)
{
    f4.setSize(450,450);
    f4.setLayout(new BorderLayout());
    f4.setVisible(true);
    f3.setVisible(false);
}
else if(e.getSource()==b7)
{
    JOptionPane.showMessageDialog(null,"your score is "+score+"/30","Message",JOptionPane.INFORMATION_MESSAGE);
}
else if(e.getSource()==b8)
{
    f4.setVisible(false);
}
else if(e.getSource()==b4)
{
    System.exit(0);
}
if(r2.isSelected())
{
    score=score+10;
}
if(r4.isSelected())
{
    score=score+10;
}
if(r9.isSelected())
{
    score=score+10;
}
}
public static void main(String ar[])
{
    Onex o=new Onex();
    o.m1();
}
}