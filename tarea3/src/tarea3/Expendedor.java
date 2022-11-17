package tarea3;

import java.awt.*;
import javax.swing.*;

public class Expendedor extends JPanel {

    private DepositoMonedas monedas;
    private DepositoExpBebida salida;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private DepositoVuelto depvuel;
    private int precio;
    private int vuelto;
    private Bebida b;
    private int x;
    private int y;

    public Expendedor(int cant, int pre, int posx, int posy) {
        this.setPreferredSize(new Dimension(750, 800));
        x = posx;
        y = posy;
        vuelto = 0;
        precio = pre;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        depvuel = new DepositoVuelto();
        monedas = new DepositoMonedas();
        for (int i = 0; i < cant; ++i) {
            //Por ahora les tire posiciones xy random pero se deberá modificar.
            sprite.addBebida(new Sprite(i + 200, 100, 100));
            coca.addBebida(new CocaCola(i + 100, 200, 200));
            fanta.addBebida(new Fanta(i + 100, 300, 300));
        }
        
        ImageIcon coin = new ImageIcon("dispenser.png");        
        JLabel c100Label = new JLabel();
        c100Label.setVisible(true);                
        c100Label.setText("Hombrefalo");
        c100Label.setForeground(Color.black);
        c100Label.setIcon(coin);        
        c100Label.setLocation(0,0);
        c100Label.setSize(100,100);
        
        this.add(c100Label);
    }

    public Moneda getVuelto() {
        return depvuel.getMoneda();
    }

    public int getSizea() {
        return depvuel.getSizea();
    }

    public void AddVuelto(Moneda m) {
        depvuel.addMoneda(m);
    }

    public String getSabor() {
        return b.beber();
    }

    public void comprarBebida(Moneda m, int tipo) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {

        b = null;

        if (m == null) {
            throw new PagoIncorrectoException("Pago incorrecto");
        }
        int dinero = m.getValor();
        if (dinero >= precio) {
            vuelto = dinero - precio;
        } else {
            depvuel.addMoneda(m);
            throw new PagoInsuficienteException("Pago insuficiente");
        }
        switch (tipo) {

            case 1:
                b = coca.getBebida();
                break;
            case 2:
                b = sprite.getBebida();
                break;
            case 3:
                b = fanta.getBebida();
                break;

        }

        if (b != null) {
            if (vuelto > 0) {
                for (int i = 0; i < (vuelto / 100); ++i) {
                    AddVuelto(null);
                }
            }
            salida = new DepositoExpBebida(b);
        } else {
            AddVuelto(m);
            throw new NoHayBebidaException("No hay bebida");
        }
    }

    public Bebida getBebida() throws NoHayBebidaException {
        return salida.GetBebida();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        /*g.setColor(Color.blue);
        g.fillRect(400, 55, 600, 25);
        g.fillRect(400, 55, 25, 600);
        g.fillRect(400, 600, 600, 150);
        g.fillRect(1250, 55, 150, 600);
        g.setColor(Color.gray);
        //Dimensiones caja principal 425*520
        g.fillRect(825, 80, 425, 520);
        //Dimensiones caja salida de botellas
        g.setColor(Color.black);
        g.fillRect(825, 625, 425, 100);
        //Dimensiones selector
        g.setColor(Color.orange);
        g.fillRect(1260, 100, 130, 200);
        //Dimemsiones cosa de monedas
        g.setColor(Color.red);
        g.fillRect(1260, 350, 130, 200);
        //Separadores de filas
        g.setColor(Color.black);
        g.fillRect(825, 250, 425, 10);
        g.fillRect(825, 440, 425, 10);*/

    }
}
