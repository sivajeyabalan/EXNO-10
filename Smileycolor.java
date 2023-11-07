/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
/**
 *
 * @author 22cseb57
 */
public class Smileycolor {
    public static void main(String[] args) {
       new smileychange();
    }    
}
class smileychange extends JFrame implements MouseListener
{
    int c=0;
    smileychange()
    {
        addMouseListener(this);
        setSize(600,600);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(1,1,300,300);
    }
public void mouseClicked(MouseEvent e){
    Graphics g=getGraphics();
    c++;
    if(c%2==0)
    {
       g.setColor(Color.yellow);
       g.fillOval(50,50,150,150);       
       g.setColor(Color.black);
       g.fillOval(80,90,15,25); 
       g.drawArc(80,80,15,25,0,180);
       g.fillOval(150,90,15,25); 
       g.drawArc(150,80,15,25,0,180);
       g.drawArc(90,125,65,50,0,-180);     
      }
    else
    { g.setColor(Color.red);
       g.fillOval(50,50,150,150);       
       g.setColor(Color.black);
       g.fillOval(80,90,15,25); 
       g.drawArc(80,80,15,25,0,180);
       g.fillOval(150,90,15,25); 
       g.drawArc(150,80,15,25,0,180);
       g.drawArc(90,125,65,50,0,180);  
    }
   }    
  public void mousePressed(MouseEvent e){  }
  public void mouseReleased(MouseEvent e){   }
  public void mouseEntered(MouseEvent e){   }
  public void mouseExited(MouseEvent e){   }
  
}