import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.event.MouseInputListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DrawBoard extends Canvas{  
      public void paint(Graphics g) {
            for(int i = 0 ; i < 600; i=i+150){
                for(int j = 0; j < 450; j=j+150){
                    g.drawRect(i, j, 150, 150);
                }
            }
          }
      }
public class SortGame_ABC implements MouseListener{
  public static String BoardGame[][] = {{"A","B","C","D"},{"E","F","G","H"},{"I","J","K"," "}};
  public JFrame frame;

  public static void main(String[] args){
    SortGame_ABC s = new SortGame_ABC();
    s.setup();

  }

  public void setup(){
    frame = new JFrame("SortGame ABC");
    DrawBoard draw = new DrawBoard();
    
    JLabel  l1 = new JLabel();
    l1.setBounds(20,10,90,100);
    l1.setFont(new Font("Paytone",Font.BOLD,90));
    l1.setText(BoardGame[0][0]);

    JLabel  l2 = new JLabel();
    l2.setBounds(10,10,90,100);
    l2.setFont(new Font("Paytone",Font.BOLD,90));
    l2.setText(BoardGame[0][1]);

    JLabel  l3 = new JLabel();
    l3.setBounds(10,10,90,100);
    l3.setFont(new Font("Paytone",Font.BOLD,90));
    l3.setText(BoardGame[0][2]);

    JLabel  l4 = new JLabel();
    l4.setBounds(10,10,90,100);
    l4.setFont(new Font("Paytone",Font.BOLD,90));
    l4.setText(BoardGame[0][3]);

    JLabel  l5 = new JLabel();
    l5.setBounds(10,10,90,100);
    l5.setFont(new Font("Paytone",Font.BOLD,90));
    l5.setText(BoardGame[1][0]);

    JLabel  l6 = new JLabel();
    l6.setBounds(10,10,90,100);
    l6.setFont(new Font("Paytone",Font.BOLD,90));
    l6.setText(BoardGame[1][1]);

    JLabel  l7 = new JLabel();
    l7.setBounds(10,10,90,100);
    l7.setFont(new Font("Paytone",Font.BOLD,90));
    l7.setText(BoardGame[1][2]);

    JLabel  l8 = new JLabel();
    l8.setBounds(10,10,90,100);
    l8.setFont(new Font("Paytone",Font.BOLD,90));
    l8.setText(BoardGame[1][3]); 

    JLabel  l9 = new JLabel();
    l9.setBounds(10,10,90,100);
    l9.setFont(new Font("Paytone",Font.BOLD,90));
    l9.setText(BoardGame[2][0]);

    JLabel  l10 = new JLabel();
    l10.setBounds(10,10,90,100);
    l10.setFont(new Font("Paytone",Font.BOLD,90));
    l10.setText(BoardGame[2][1]);

    JLabel  l11 = new JLabel();
    l11.setBounds(10,10,90,100);
    l11.setFont(new Font("Paytone",Font.BOLD,90));
    l11.setText(BoardGame[2][2]);

    JLabel  l12 = new JLabel();
    l12.setBounds(10,10,90,100);
    l12.setFont(new Font("Paytone",Font.BOLD,90));
    l12.setText(BoardGame[2][3]);


    frame.add(l1); frame.add(l2);
    frame.add(draw);
    frame.setSize(618, 491);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLayout(null);
    

  }

@Override
public void mouseClicked(MouseEvent ev){
    int row = ev.getY()/150;    
    int column = ev.getX()/150;  
    String blank_value = " ";   
    try{
        if(row+1 <= 2 && BoardGame[row+1][column].equals(" ")){        //move down
          blank_value = BoardGame[row][column];
          BoardGame[row][column] = BoardGame[row+1][column];
          BoardGame[row+1][column] = blank_value;
          
      }  //if
      else if(row-1 >= 0 && BoardGame[row-1][column].equals(" ")){           //move up
        blank_value = BoardGame[row][column];
        BoardGame[row][column] = BoardGame[row-1][column];
        BoardGame[row-1][column] = blank_value;
        
      }  //else if
      else if (column+1 <= 3 && BoardGame[row][column+1].equals(" ")){         //move right
        blank_value = BoardGame[row][column];
        BoardGame[row][column] = BoardGame[row][column+1];
        BoardGame[row][column+1] = blank_value;
        
      }  //else if
      else if (column-1 >= 0 && BoardGame[row][column-1].equals(" ")){       //move left
        blank_value = BoardGame[row][column];
        BoardGame[row][column] = BoardGame[row][column-1];
        BoardGame[row][column-1] = blank_value;
        
    } 
    //save_game();
    //else if
    }   //try
    catch (Exception e){
    }
 }

@Override
public void mousePressed(MouseEvent e) {
  
  
}

@Override
public void mouseReleased(MouseEvent e) {
 
  
}

@Override
public void mouseEntered(MouseEvent e) {
 
}

@Override
public void mouseExited(MouseEvent e) {
 
  
}



}
