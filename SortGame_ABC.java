import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class SortGame_ABC extends JFrame {
    String BoardGame[][]  = {{"A","B","C","D"},{"E","F","G","H"},{"I","J","K"," "}};
    int row ;
    int column ;
    public static void main(String[] args) {
        new SortGame_ABC();
  }
    public SortGame_ABC() {
        this.setSize(618, 491);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new DrawBoard(), BorderLayout.CENTER);
        this.setVisible(true);
  }

    private class DrawBoard extends JComponent {
        public void paint(Graphics g) {
            Graphics2D g2D = (Graphics2D) g;
            for(int i = 0 ; i < 600; i=i+150){
                column = i/150;
                for(int j = 0; j < 450; j=j+150){
                    row = j/150;
                    g2D.drawRect(i, j, 150, 150);
                    g2D.setPaint(Color.black);
                    g2D.drawString(BoardGame[row][column], i+75, j+75);  
                }
            }
        }
    }
}