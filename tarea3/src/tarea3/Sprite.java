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
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
