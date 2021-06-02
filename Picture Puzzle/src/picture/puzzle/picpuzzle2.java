package picture.puzzle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author castro
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;
 import java.sql.*;

 
class picpuzzle2 extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB,bl,wi,he,pre;
//JButton playStopButton, retryButton, newGameButton;
JButton bu=new JButton();
JButton bn=new JButton();
Icon star;

Icon ic0=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\3.jpg");
Icon ic10=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_03.jpg");
Icon ic20=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_03.jpg");
Icon ic30=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_05.jpg");
Icon ic40=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_05.jpg");
Icon ic50=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_05.jpg");
Icon ic60=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_05.jpg");   //car
Icon ic70=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_04.jpg");
Icon ic80=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_04.jpg");
Icon ic90=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_04.jpg");

Icon samicon1=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\parrot-feet.jpg");
Icon samicon2=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\kitten.jpg");
Icon samicon3=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\house.jpg");
Icon samicon4=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\in.jpg");
Icon samicon5=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\ball.jpg");
Icon samicon6=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\man.jpeg");
Icon samicon7=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\cake.jpg");
Icon samicon8=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\car.jpg");
Icon samicon9=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\players.jpg");
Icon samicon10=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\vol.jpg");
 
Icon ic1=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\1.jpg");
Icon ic2=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\5.jpg");
Icon ic3=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\2.jpg");       //kitten_01
Icon ic4=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\7.jpg");
Icon ic5=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\4.jpg");
Icon ic6=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\6.jpg");
Icon ic7=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\8.jpg");
Icon ic8=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\9.jpg");
Icon ic9=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\3.jpg");

Icon ic11=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_01.jpg");
Icon ic12=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_05.jpg");
Icon ic13=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_02.jpg");
Icon ic14=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_07.jpg");    //h1_01
Icon ic15=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_04.jpg");
Icon ic16=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_06.jpg");
Icon ic17=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_08.jpg");
Icon ic18=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_09.jpg");
Icon ic19=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\kitten_03.jpg");

Icon ic21=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_01.jpg");
Icon ic22=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_05.jpg");
Icon ic23=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_02.jpg");
Icon ic24=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_07.jpg");
Icon ic25=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_04.jpg");
Icon ic26=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_06.jpg");
Icon ic27=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_08.jpg");
Icon ic28=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_09.jpg");
Icon ic29=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\h1_03.jpg");

Icon ic31=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_01.jpg");
Icon ic32=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_09.jpg");
Icon ic33=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_02.jpg");
Icon ic34=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_07.jpg");
Icon ic35=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_04.jpg");
Icon ic36=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_06.jpg");
Icon ic37=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_08.jpg");
Icon ic38=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_05.jpg");
Icon ic39=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\i1_03.jpg");

Icon ic41=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_01.jpg");
Icon ic42=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_09.jpg");
Icon ic43=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_02.jpg");
Icon ic44=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_07.jpg");
Icon ic45=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_04.jpg");
Icon ic46=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_06.jpg");
Icon ic47=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_08.jpg");
Icon ic48=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_05.jpg");
Icon ic49=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\b_03.jpg");

Icon ic51=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_01.jpg");
Icon ic52=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_09.jpg");
Icon ic53=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_02.jpg");
Icon ic54=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_07.jpg");
Icon ic55=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_04.jpg");
Icon ic56=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_06.jpg");
Icon ic57=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_08.jpg");
Icon ic58=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_05.jpg");
Icon ic59=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\man_03.jpg");

Icon ic61=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_01.jpg");
Icon ic62=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_09.jpg");
Icon ic63=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_02.jpg");
Icon ic64=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_07.jpg");
Icon ic65=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_04.jpg");
Icon ic66=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_06.jpg");
Icon ic67=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_08.jpg");
Icon ic68=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_05.jpg");
Icon ic69=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\w_03.jpg");

Icon ic71=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_01.jpg");
Icon ic72=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_04.jpg");
Icon ic73=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_02.jpg");
Icon ic74=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_07.jpg");
Icon ic75=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_05.jpg");
Icon ic76=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_06.jpg");
Icon ic77=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_08.jpg");
Icon ic78=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_09.jpg");
Icon ic79=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\m_03.jpg");

Icon ic81=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_01.jpg");
Icon ic82=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_04.jpg");
Icon ic83=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_02.jpg");
Icon ic84=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_07.jpg");
Icon ic85=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_05.jpg");
Icon ic86=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_06.jpg");
Icon ic87=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_08.jpg");
Icon ic88=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_09.jpg");
Icon ic89=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\players_03.jpg");

Icon ic91=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_01.jpg");
Icon ic92=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_04.jpg");
Icon ic93=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_02.jpg");
Icon ic94=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_07.jpg");
Icon ic95=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_05.jpg");
Icon ic96=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_06.jpg");
Icon ic97=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_08.jpg");
Icon ic98=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_09.jpg");
Icon ic99=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\images\\v_03.jpg");

picpuzzle2()
{  
super("Picture Puzzle");
super.setBounds(200,20,1600,1000);

 bu=new JButton("Exit");
bu.setBounds(330,730,120,50);
bu.setFont(new Font("Sans_Sarif",Font.ITALIC,20));
bu.setBackground(Color.red);
bu.setForeground(Color.black);
 
bl=new JButton();
bl.setBounds(1100,100,30,30);
bl.setBackground(Color.black);

wi=new JButton();
wi.setBounds(1150,100,30,30);
wi.setBackground(Color.white);

bn=new JButton("Next");
bn.setBounds(1300,730,120,50);
bn.setFont(new Font("Sans_Sarif",Font.ITALIC,20));
bn.setBackground(Color.GREEN);
bn.setForeground(Color.black);

pre=new JButton("Previous");
pre.setBounds(1080,730,120,50);
pre.setFont(new Font("Sans_Sarif",Font.ITALIC,20));
pre.setBackground(Color.cyan);
pre.setForeground(Color.black);



he=new JButton("i");
he.setBounds(780,40,40,40);
he.setFont(new Font("Sans_Sarif",Font.ITALIC,20));
// JFrame f1=new JFrame();

b1=new JButton(ic1);
b1.setBounds(10,230,236,153);

b2=new JButton(ic2);
b2.setBounds(246,230,236,153);

b3=new JButton(ic3);
b3.setBounds(482,230,236,153);

b4=new JButton(ic4);
b4.setBounds(10,383,236,153);

b5=new JButton(ic5);
b5.setBounds(246,383,236,153);

b6=new JButton(ic6);
b6.setBounds(482,383,236,153);

b7=new JButton(ic7);
b7.setBounds(10,536,236,153);

b8=new JButton(ic8);
b8.setBounds(246,536,236,153);

b9=new JButton(ic9);
b9.setBounds(482,536,236,153);

sample=new JButton(samicon1);
sample.setBounds(870,220,690,465);



JLabel l1=new JLabel("PREVIEW:");
l1.setBounds(780,380,100,70);
l1.setFont(new Font("Calibri",Font.BOLD,20));
l1.setForeground(Color.BLUE);

JLabel l2=new JLabel("NOTE: Icon has power to swap with neighbour icon>>>");
l2.setBounds(10,55,500,30);
l2.setFont(new Font("Calibri",Font.ITALIC,20));
l2.setForeground(Color.magenta);

JLabel l3=new JLabel("Themes");
l3.setBounds(1000,40,100,30);
l3.setFont(new Font("Calibri",Font.BOLD,20));
l3.setForeground(Color.red);

/*JLabel l4=new JLabel("i");
l4.setBounds(970,40,80,20);
l4.setFont(new Font("Serif",Font.ITALIC,20));
l4.setForeground(Color.red);*/

starB=new JButton(ic0);
starB.setBounds(470,5,236,153);
star=b9.getIcon();

add(b1);add(b2);add(b3);add(b4);
add(b5);add(b6);add(b7);add(b8);
add(b9);add(sample);add(l1);add(l2);
add(bu);add(bn);
add(bl);add(wi);add(he);add(pre);
add(starB);add(l3);

b1.addActionListener(this); b2.addActionListener(this); 
b3.addActionListener(this); b4.addActionListener(this); 
b5.addActionListener(this); b6.addActionListener(this);
b7.addActionListener(this); b8.addActionListener(this);
b9.addActionListener(this);
bu.addActionListener(this);bn.addActionListener(this);
bl.addActionListener(this);wi.addActionListener(this);
he.addActionListener(this);pre.addActionListener(this);
sample.addActionListener(this);

		
setLayout(null);
setSize(1600,1000);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 }
public void actionPerformed(ActionEvent e)
        
{
 
    if(e.getSource()==bl)
    {
       super.getContentPane().setBackground(Color.black);
    }
    if(e.getSource()==wi)
    {
      super.getContentPane().setBackground(Color.white);  
    }
    if(e.getSource()==he)
    {
               
        JLabel l11=new JLabel("How to Play  the Game ");
         l11.setBounds(10,20,300,35);
        l11.setFont(new Font("Serif",Font.BOLD,30));
    
       JLabel l12=new JLabel("1.If the movable images wants to move up click the above image");
        l12.setBounds(10,120,550,30);
        l12.setFont(new Font("Serif",Font.BOLD,20));
        
         JLabel l13=new JLabel("2.Same for moving to Left,Right,Down");
        l13.setBounds(10,220,500,30);
        l13.setFont(new Font("Serif",Font.BOLD,20));
        
      JLabel l14=new JLabel("3.The moveable can only able to move on Step a head");
        l14.setBounds(10,400,500,30);
        l14.setFont(new Font("Serif",Font.BOLD,20));
  
    JFrame f2=new JFrame("Instructions");
    f2.setVisible(true);
    //f2.setSize(400, 430);
   f2.setBounds(750,200,750,750);
    f2.add(l11);
    f2.add(l12);
    f2.add(l13);
   f2.add(l14);
    
    }
    if(e.getSource()==bu)
    {
         ImageIcon i7=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\Icon\\image.jpg");
         int result = JOptionPane.showConfirmDialog(null, 
   "Are you sure you wish to exit application?",null, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,i7);
if(result == JOptionPane.YES_OPTION) {
    System.exit(0);
}
        
    }
    {
if(e.getSource()==b1)
{
  Icon s1=b1.getIcon();
   if(b2.getIcon()==star)
   {
      b2.setIcon(s1);
      b1.setIcon(star);
   } 
   else if(b4.getIcon()==star)
   {
      b4.setIcon(s1);
      b1.setIcon(star);
     /* if(b1.Icon(ic3))
      {
          JOptionPane.showMessageDialog(null,"Success");   
      }*/
   }
  }

if(e.getSource()==b2)
{
  Icon s1=b2.getIcon();
  if(b1.getIcon()==star)
  {
     b1.setIcon(s1);
     b2.setIcon(star);
   } 
  else if(b5.getIcon()==star)
  {
    b5.setIcon(s1);
    b2.setIcon(star);
  }
  else if(b3.getIcon()==star)
  {
    b3.setIcon(s1);
    b2.setIcon(star);
  }
  }

if(e.getSource()==b3){
    Icon s1=b3.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b3.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b3.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b4){
    Icon s1=b4.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b4.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b4.setIcon(star);
                   }
         else if(b7.getIcon()==star){
                    b7.setIcon(s1);
                    b4.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b5){
    Icon s1=b5.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b5.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b5.setIcon(star);
                   }
         else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b5.setIcon(star);
                   }
          else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b5.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b6){
    Icon s1=b6.getIcon();
      if(b3.getIcon()==star){
        b3.setIcon(s1);
        b6.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b6.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b6.setIcon(star);
                   }
}//end of if

if(e.getSource()==b7){
    Icon s1=b7.getIcon();
      if(b4.getIcon()==star){
        b4.setIcon(s1);
        b7.setIcon(star);
      } else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b7.setIcon(star);
                   }
 }//end of if

   if(e.getSource()==b8){
    Icon s1=b8.getIcon();
      if(b7.getIcon()==star){
        b7.setIcon(s1);
        b8.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b8.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b8.setIcon(star);
                   }

  }//end of if

 if(e.getSource()==b9){
    Icon s1=b9.getIcon();
      if(b8.getIcon()==star){
        b8.setIcon(s1);
        b9.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b9.setIcon(star);
                   }
  }//end of if

    }

if(e.getSource()==bn)
{    
Icon s1=sample.getIcon();
 if(s1==samicon10)
 {    
     ImageIcon i1=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\Icon\\parrot-feet.jpg");
   int result = JOptionPane.showConfirmDialog(null, 
   "Decrease  to Low level?",null, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,i1);
     if(result==JOptionPane.YES_OPTION) {
sample.setIcon(samicon1);
 b1.setIcon(ic1);
b2.setIcon(ic2);
b3.setIcon(ic3);
b4.setIcon(ic4);
b5.setIcon(ic5);
b6.setIcon(ic6);
b7.setIcon(ic7);
b8.setIcon(ic8);
b9.setIcon(ic9);
star=b9.getIcon();
starB.setIcon(ic0);
     }
     if(result==JOptionPane.NO_OPTION)
     {
         sample.setIcon(samicon10);
b1.setIcon(ic99);
b2.setIcon(ic98);
b3.setIcon(ic94);
b4.setIcon(ic96);
b5.setIcon(ic93);
b6.setIcon(ic91);
b7.setIcon(ic97);
b8.setIcon(ic95);
b9.setIcon(ic92);
star=b9.getIcon();
starB.setIcon(ic90);
     }
}//eof if
else if(s1==samicon1)
{    
 
sample.setIcon(samicon2);
b1.setIcon(ic11);
b2.setIcon(ic12);
b3.setIcon(ic13);
b4.setIcon(ic14);
b5.setIcon(ic15);
b6.setIcon(ic16);
b7.setIcon(ic17);
b8.setIcon(ic18);
b9.setIcon(ic19);
star=b9.getIcon();
starB.setIcon(ic10);
}//endof else
else if(s1==samicon2)
{
 
sample.setIcon(samicon3);
b1.setIcon(ic21);
b2.setIcon(ic22);
b3.setIcon(ic23);
b4.setIcon(ic24);
b5.setIcon(ic25);
b6.setIcon(ic26);
b7.setIcon(ic27);
b8.setIcon(ic28);
b9.setIcon(ic29);
star=b9.getIcon();
starB.setIcon(ic20);
}//end of else if
else if(s1==samicon3)
{
      ImageIcon i2=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\Icon\\in.jpg");
     int result = JOptionPane.showConfirmDialog(null, 
   "Are you want to enter into Medium level?",null, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,i2);
     if(result==JOptionPane.YES_OPTION)
     {
          sample.setIcon(samicon4);
b1.setIcon(ic37);
b2.setIcon(ic36);
b3.setIcon(ic35);
b4.setIcon(ic34);
b5.setIcon(ic33);
b6.setIcon(ic39);
b7.setIcon(ic32);
b8.setIcon(ic31);
b9.setIcon(ic38);
star=b9.getIcon();
starB.setIcon(ic30);
     }
if(result == JOptionPane.NO_OPTION) {
    sample.setIcon(samicon3);
b1.setIcon(ic21);
b2.setIcon(ic22);
b3.setIcon(ic23);
b4.setIcon(ic24);
b5.setIcon(ic25);
b6.setIcon(ic26);
b7.setIcon(ic27);
b8.setIcon(ic28);
b9.setIcon(ic29);
star=b9.getIcon();
starB.setIcon(ic20);  
} 

   
}
 else if(s1==samicon4)
{
    
sample.setIcon(samicon5);
b1.setIcon(ic47);
b2.setIcon(ic46);
b3.setIcon(ic45);
b4.setIcon(ic44);
b5.setIcon(ic43);
b6.setIcon(ic49);
b7.setIcon(ic42);
b8.setIcon(ic41);
b9.setIcon(ic48);
star=b9.getIcon();
starB.setIcon(ic40);
}
 else if(s1==samicon5)
{
     
sample.setIcon(samicon6);
b1.setIcon(ic57);
b2.setIcon(ic56);
b3.setIcon(ic55);
b4.setIcon(ic54);
b5.setIcon(ic53);
b6.setIcon(ic59);
b7.setIcon(ic52);
b8.setIcon(ic51);
b9.setIcon(ic58);
star=b9.getIcon();
starB.setIcon(ic50);
}
 else if(s1==samicon6)
{
   
sample.setIcon(samicon7);
b1.setIcon(ic67);
b2.setIcon(ic66);
b3.setIcon(ic65);
b4.setIcon(ic64);
b5.setIcon(ic63);
b6.setIcon(ic69);
b7.setIcon(ic62);
b8.setIcon(ic61);
b9.setIcon(ic68);
star=b9.getIcon();
starB.setIcon(ic60);
}
 else if(s1==samicon7)
{
    ImageIcon i3=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\Icon\\car.jpg");
      int result = JOptionPane.showConfirmDialog(null, 
   "Are you want to enter into High level?",null, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,i3);
     if(result==JOptionPane.YES_OPTION)
     {
         sample.setIcon(samicon8);
b1.setIcon(ic79);
b2.setIcon(ic78);
b3.setIcon(ic74);
b4.setIcon(ic76);
b5.setIcon(ic73);
b6.setIcon(ic71);
b7.setIcon(ic77);
b8.setIcon(ic75);
b9.setIcon(ic72);
star=b9.getIcon();
starB.setIcon(ic70);
     }
if(result==JOptionPane.NO_OPTION)
{
    sample.setIcon(samicon7);
b1.setIcon(ic67);
b2.setIcon(ic66);
b3.setIcon(ic65);
b4.setIcon(ic64);
b5.setIcon(ic63);
b6.setIcon(ic69);
b7.setIcon(ic62);
b8.setIcon(ic61);
b9.setIcon(ic68);
star=b9.getIcon();
starB.setIcon(ic60);
}
}
 else if(s1==samicon8)
{
sample.setIcon(samicon9);
b1.setIcon(ic89);
b2.setIcon(ic88);
b3.setIcon(ic84);
b4.setIcon(ic86);
b5.setIcon(ic83);
b6.setIcon(ic81);
b7.setIcon(ic87);
b8.setIcon(ic85);
b9.setIcon(ic82);
star=b9.getIcon();
starB.setIcon(ic80);
}
 else 
{
sample.setIcon(samicon10);
b1.setIcon(ic99);
b2.setIcon(ic98);
b3.setIcon(ic94);
b4.setIcon(ic96);
b5.setIcon(ic93);
b6.setIcon(ic91);
b7.setIcon(ic97);
b8.setIcon(ic95);
b9.setIcon(ic92);
star=b9.getIcon();
starB.setIcon(ic90);
}
}
//end of actionPerformed


if(e.getSource()==pre)
{    
Icon s2=sample.getIcon();
 if(s2==samicon1)
 {    
      ImageIcon i4=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\Icon\\vol.jpg");
  int result = JOptionPane.showConfirmDialog(null, 
   "Wish to Jump to High level?",null, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,i4);
     if(result==JOptionPane.YES_OPTION)
     {
sample.setIcon(samicon10);
b1.setIcon(ic99);
b2.setIcon(ic98);
b3.setIcon(ic94);
b4.setIcon(ic96);
b5.setIcon(ic93);
b6.setIcon(ic91);
b7.setIcon(ic97);
b8.setIcon(ic95);
b9.setIcon(ic92);
star=b9.getIcon();
starB.setIcon(ic90);
     }
     if(result==JOptionPane.NO_OPTION)
     {
         sample.setIcon(samicon1);
 b1.setIcon(ic1);
b2.setIcon(ic2);
b3.setIcon(ic3);
b4.setIcon(ic4);
b5.setIcon(ic5);
b6.setIcon(ic6);
b7.setIcon(ic7);
b8.setIcon(ic8);
b9.setIcon(ic9);
star=b9.getIcon();
starB.setIcon(ic0);
     }
}//eof if
else if(s2==samicon10)
{    
 
sample.setIcon(samicon9);
b1.setIcon(ic89);
b2.setIcon(ic88);
b3.setIcon(ic84);
b4.setIcon(ic86);
b5.setIcon(ic83);
b6.setIcon(ic81);
b7.setIcon(ic87);
b8.setIcon(ic85);
b9.setIcon(ic82);
star=b9.getIcon();
starB.setIcon(ic80);
}//endof else
else if(s2==samicon9)
{
 
sample.setIcon(samicon8);
b1.setIcon(ic79);
b2.setIcon(ic78);
b3.setIcon(ic74);
b4.setIcon(ic76);
b5.setIcon(ic73);
b6.setIcon(ic71);
b7.setIcon(ic77);
b8.setIcon(ic75);
b9.setIcon(ic72);
star=b9.getIcon();
starB.setIcon(ic70);
}//end of else if
else if(s2==samicon8)
{
     ImageIcon i5=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\Icon\\cake.jpg");
    int result = JOptionPane.showConfirmDialog(null, 
   "Decrease to Medium level?",null, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,i5);
     if(result==JOptionPane.YES_OPTION)
     {
    sample.setIcon(samicon7);
b1.setIcon(ic67);
b2.setIcon(ic66);
b3.setIcon(ic65);
b4.setIcon(ic64);
b5.setIcon(ic63);
b6.setIcon(ic69);
b7.setIcon(ic62);
b8.setIcon(ic61);
b9.setIcon(ic68);
star=b9.getIcon();
starB.setIcon(ic60);
     }
     if(result==JOptionPane.NO_OPTION)
     {
           sample.setIcon(samicon8);
b1.setIcon(ic79);
b2.setIcon(ic78);
b3.setIcon(ic74);
b4.setIcon(ic76);
b5.setIcon(ic73);
b6.setIcon(ic71);
b7.setIcon(ic77);
b8.setIcon(ic75);
b9.setIcon(ic72);
star=b9.getIcon();
starB.setIcon(ic70);
     }
}
 else if(s2==samicon7)
{
    
sample.setIcon(samicon6);
b1.setIcon(ic57);
b2.setIcon(ic56);
b3.setIcon(ic55);
b4.setIcon(ic54);
b5.setIcon(ic53);
b6.setIcon(ic59);
b7.setIcon(ic52);
b8.setIcon(ic51);
b9.setIcon(ic58);
star=b9.getIcon();
starB.setIcon(ic50);
}
 else if(s2==samicon6)
{
     
sample.setIcon(samicon5);
b1.setIcon(ic47);
b2.setIcon(ic46);
b3.setIcon(ic45);
b4.setIcon(ic44);
b5.setIcon(ic43);
b6.setIcon(ic49);
b7.setIcon(ic42);
b8.setIcon(ic41);
b9.setIcon(ic48);
star=b9.getIcon();
starB.setIcon(ic40);
}
 else if(s2==samicon5)
{
   
sample.setIcon(samicon4);
b1.setIcon(ic37);
b2.setIcon(ic36);
b3.setIcon(ic35);
b4.setIcon(ic34);
b5.setIcon(ic33);
b6.setIcon(ic39);
b7.setIcon(ic32);
b8.setIcon(ic31);
b9.setIcon(ic38);
star=b9.getIcon();
starB.setIcon(ic30);

}
 else if(s2==samicon4)
{
     ImageIcon i6=new ImageIcon("C:\\Users\\Castro Zac\\Desktop\\pro\\Icon\\house.jpg");
   int result = JOptionPane.showConfirmDialog(null, 
   "Decrease to Low level?",null, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,i6);
     if(result==JOptionPane.YES_OPTION)
     {
sample.setIcon(samicon3);
b1.setIcon(ic21);
b2.setIcon(ic22);
b3.setIcon(ic23);
b4.setIcon(ic24);
b5.setIcon(ic25);
b6.setIcon(ic26);
b7.setIcon(ic27);
b8.setIcon(ic28);
b9.setIcon(ic29);
star=b9.getIcon();
starB.setIcon(ic20);
     }
     if(result==JOptionPane.NO_OPTION)
     {
          sample.setIcon(samicon4);
b1.setIcon(ic37);
b2.setIcon(ic36);
b3.setIcon(ic35);
b4.setIcon(ic34);
b5.setIcon(ic33);
b6.setIcon(ic39);
b7.setIcon(ic32);
b8.setIcon(ic31);
b9.setIcon(ic38);
star=b9.getIcon();
starB.setIcon(ic30);
     }
}
 else if(s2==samicon3)
{
sample.setIcon(samicon2);
b1.setIcon(ic11);
b2.setIcon(ic12);
b3.setIcon(ic13);
b4.setIcon(ic14);
b5.setIcon(ic15);
b6.setIcon(ic16);
b7.setIcon(ic17);
b8.setIcon(ic18);
b9.setIcon(ic19);
star=b9.getIcon();
starB.setIcon(ic10);
}
 else 
{
sample.setIcon(samicon1);
b1.setIcon(ic1);
b2.setIcon(ic2);
b3.setIcon(ic3);
b4.setIcon(ic4);
b5.setIcon(ic5);
b6.setIcon(ic6);
b7.setIcon(ic7);
b8.setIcon(ic8);
b9.setIcon(ic9);
star=b9.getIcon();
starB.setIcon(ic0);
}
}
}//end of actionPerformed
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
    
new picpuzzle2();







/*JOptionPane.showMessageDialog(null,"Difficulty Level:Low");   
try
{
    Class.forName("oracle.jdbc.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","17mss007");
    //return con;
  }catch(Exception e)
  {
      JOptionPane.showMessageDialog(null, e);
  }*/

}//end of main
 
    }
            

    
    


