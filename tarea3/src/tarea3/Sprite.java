package tarea3;
import java.awt.*;
import javax.swing.*;
class Sprite extends Bebida {

    public Sprite(int serie, int posx, int posy) {
        super(serie, posx, posy);

    }

    public String beber() {
        return super.beber() + "sprite";
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(super.getX(), super.getY(), 50, 50);
    }
}
