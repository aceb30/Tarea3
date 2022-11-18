package tarea3;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    
    public Ventana() throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Tarea 3");
        this.setSize(1500, 1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setLocale(null);
    }
}
