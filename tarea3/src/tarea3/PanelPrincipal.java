package tarea3;

import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel {

    private Comprador com;
    private Expendedor exp;

    public PanelPrincipal() throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        super(new BorderLayout());
        this.setBackground(Color.black);

        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda n = null;

        exp = new Expendedor(10, 1000, 10, 10);
        com = new Comprador(m3, 2, exp, 10, 10);

        this.add(exp, BorderLayout.EAST);
        this.add(com, BorderLayout.WEST);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

}
