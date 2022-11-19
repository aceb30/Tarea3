
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
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.orange);
        g.fillRect(super.getX(), super.getY(), 20, 50);
    }
}
