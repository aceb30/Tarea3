package tarea3;

import java.awt.*;
import javax.swing.*;

abstract public class Bebida extends JPanel {
    private int serie;

    public Bebida(int s, int posx, int posy) {

        this.setPreferredSize(new Dimension(20, 50));
        serie = s;
        this.setLocation(posx, posy);
    }

    public int getSerie() {
        return serie;
    }

    public String beber() {
        return "sabor: ";
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("WARNING: paint() for Bebida called!");
    }
}
