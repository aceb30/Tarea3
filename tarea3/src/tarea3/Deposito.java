package tarea3;

import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;

public class Deposito extends JPanel {

    private ArrayList<Bebida> al;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }

    public Deposito() {
        super(null);
        this.setLocation(100, 200);
        this.setSize(100, 100);
        this.setBackground(Color.blue);
        al = new ArrayList<Bebida>();
        this.setVisible(true);
    }

    public void addBebida(Bebida b) {
        al.add(b);
        this.add(b);
    }

    public Bebida getBebida() {

        if (al.isEmpty()) {
            return null;
        } else {
            return al.remove(0);
        }
    }
}
