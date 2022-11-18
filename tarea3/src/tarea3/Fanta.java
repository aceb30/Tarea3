
package tarea3;
import java.awt.*;
import javax.swing.*;
class Fanta extends Bebida{
    public Fanta(int serie, int posx, int posy){
        super(serie, posx, posy);
    }
    public String beber(){
        return super.beber() + "fanta";
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(super.getX(), super.getY(), 50, 50);
    }
}
