package tarea3;
import java.awt.*;
import javax.swing.*;
abstract public class Bebida extends JPanel{

    private int serie;
    private int x;
    private int y;
    public Bebida(int s, int posx, int posy) {
        serie = s;
        x = posx;
        y = posy;
    }

    public int getSerie() {
        return serie;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String beber() {
        return "sabor: ";
    }
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
     
      
   }
}