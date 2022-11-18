package tarea3;

import java.awt.*;
import javax.swing.*;

abstract public class Moneda extends JPanel{

    public Moneda() {
        this.setPreferredSize(new Dimension(60, 50));        
    }

    public String getSerie() {
        return this.toString();
    }

    public abstract int getValor();
}
