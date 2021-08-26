import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
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
  public static String BoardGame[][] = {{"A","B","C","D"},{"E","F","G","H"},{"I","J"," ","K"}};
  public JFrame frame = new JFrame("SortGame ABC");
  
  public static void main(String[] args){
    SortGame_ABC s = new SortGame_ABC();
    s.setup();
  }

  public void setup(){
    
    DrawBoard draw  = new DrawBoard();
    
    JLabel  l1 = new JLabel();
    l1.setBounds(45,25,90,100);
    l1.setFont(new Font("Paytone",Font.BOLD,90));
    l1.setForeground(Color.BLUE);

    JLabel  l2 = new JLabel();
    l2.setBounds(195,25,90,100);
    l2.setFont(new Font("Paytone",Font.BOLD,90));
    l2.setForeground(Color.BLUE);
    

    JLabel  l3 = new JLabel();
    l3.setBounds(345,25,90,100);
    l3.setFont(new Font("Paytone",Font.BOLD,90));
    l3.setForeground(Color.BLUE);

    JLabel  l4 = new JLabel();
    l4.setBounds(495,25,90,100);
    l4.setFont(new Font("Paytone",Font.BOLD,90));
    l4.setForeground(Color.BLUE);

    JLabel  l5 = new JLabel();
    l5.setBounds(45,175,90,100);
    l5.setFont(new Font("Paytone",Font.BOLD,90));
    l5.setForeground(Color.BLUE);

    JLabel  l6 = new JLabel();
    l6.setBounds(195,175,90,100);
    l6.setFont(new Font("Paytone",Font.BOLD,90));
    l6.setForeground(Color.BLUE);

    JLabel  l7 = new JLabel();
    l7.setBounds(345,175,90,100);
    l7.setFont(new Font("Paytone",Font.BOLD,90));
    l7.setForeground(Color.BLUE);

    JLabel  l8 = new JLabel();
    l8.setBounds(495,175,90,100);
    l8.setFont(new Font("Paytone",Font.BOLD,90));
    l8.setForeground(Color.BLUE);

    JLabel  l9 = new JLabel();
    l9.setBounds(45,325,90,100);
    l9.setFont(new Font("Paytone",Font.BOLD,90));
    l9.setForeground(Color.BLUE);

    JLabel  l10 = new JLabel();
    l10.setBounds(195,325,90,100);
    l10.setFont(new Font("Paytone",Font.BOLD,90));
    l10.setForeground(Color.BLUE);

    JLabel  l11 = new JLabel();
    l11.setBounds(345,325,90,100);
    l11.setFont(new Font("Paytone",Font.BOLD,90));
    l11.setForeground(Color.BLUE);

    JLabel  l12 = new JLabel();
    l12.setBounds(495,325,90,100);
    l12.setFont(new Font("Paytone",Font.BOLD,90));
    l12.setForeground(Color.BlUE);
    
    frame.add(l1);
    frame.add(l2);
    frame.add(l3);
    frame.add(l4);
    frame.add(l5);
    frame.add(l6);
    frame.add(l7);
    frame.add(l8);
    frame.add(l9);
    frame.add(l10);
    frame.add(l11);
    frame.add(l12);
    frame.add(draw);

    frame.setSize(618, 491);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLayout(null);
    
    frame.addMouseListener(this);
    draw.addMouseListener(this);
    

    while(true){
      l1.setText(BoardGame[0][0]);l2.setText(BoardGame[0][1]);l3.setText(BoardGame[0][2]);l4.setText(BoardGame[0][3]);
      l5.setText(BoardGame[1][0]);l6.setText(BoardGame[1][1]);l7.setText(BoardGame[1][2]);l8.setText(BoardGame[1][3]);
      l9.setText(BoardGame[2][0]);l10.setText(BoardGame[2][1]);l11.setText(BoardGame[2][2]);l12.setText(BoardGame[2][3]);
    }

  }

@Override
public void mouseClicked(MouseEvent ev){
    int row = ev.getY() / 150;    
    int column = ev.getX() / 150;  
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
