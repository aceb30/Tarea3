package tarea3;

import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel {

    private Comprador com;
    private Expendedor exp;

    public PanelPrincipal() throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        
        super(new BorderLayout());
        this.setLocale(null);
        
        this.setBackground(Color.WHITE);

        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda1000();
        Moneda m3 = new Moneda500();
        Moneda m4 = new Moneda100();
        Moneda m5 = new Moneda500();
        Moneda m6 = new Moneda1000();
        Moneda m7 = new Moneda1000();
        Moneda m8 = new Moneda1000();
        Moneda m9 = new Moneda1000();
        Moneda m10 = new Moneda1000();
        Moneda m11 = new Moneda1000();
        Moneda m12 = new Moneda1000();
        Moneda m13 = new Moneda1000();
        Moneda m14 = new Moneda1000();
        Moneda m90 = new Moneda1000();
        Moneda n = null;

        exp = new Expendedor(10, 1000, 10, 10);
        exp.AddVuelto(m1);
        exp.AddVuelto(m2);
        exp.AddVuelto(m3);
        exp.AddVuelto(m4);
        exp.AddVuelto(m5);
        exp.AddVuelto(m6);
        exp.AddVuelto(m7);
        exp.AddVuelto(m8);
        exp.AddVuelto(m9);
        exp.AddVuelto(m10);
        exp.AddVuelto(m11);
        exp.AddVuelto(m12);
        exp.AddVuelto(m13);
        exp.AddVuelto(m14);
        com = new Comprador(m90, 2, exp);

        this.add(exp,BorderLayout.EAST);
        this.add(com,BorderLayout.WEST);
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

}
