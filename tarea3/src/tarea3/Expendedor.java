package tarea3;

import java.awt.*;
import java.awt.event.ActionListener;
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
        
        this.setPreferredSize(new Dimension(750, 600));
        this.setBackground(Color.BLUE);     
        this.setLocale(null);
        
        x = posx;
        y = posy;
        vuelto = 0;
        precio = pre;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        depvuel = new DepositoVuelto();
        monedas = new DepositoMonedas();
        salida = new DepositoExpBebida(null);
                                
        for (int i = 0; i < cant; ++i) {
            //Por ahora les tire posiciones xy random pero se deberá modificar.
            sprite.addBebida(new Sprite(i + 200, 100, 100));
            coca.addBebida(new CocaCola(i + 100, 200, 200));
            fanta.addBebida(new Fanta(i + 100, 300, 300));
            //this.add(coca);
            //this.add(sprite);
            //this.add(fanta);
        }        
        this.add(depvuel,BorderLayout.NORTH);
        
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(750, 120));
        panel2.setBackground(Color.YELLOW);
        panel2.setVisible(true);
        this.add(panel2,BorderLayout.NORTH);
        
        JPanel panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(235, 120));
        panel3.setBackground(Color.ORANGE);
        panel3.setVisible(true);
        this.add(panel3,BorderLayout.WEST);
        
        JPanel panel4 = new JPanel();
        panel4.setPreferredSize(new Dimension(260, 120));
        panel4.setBackground(Color.BLACK);
        panel4.setVisible(true);
        this.add(panel4,BorderLayout.EAST);
        
        JPanel panel5 = new JPanel();
        panel5.setPreferredSize(new Dimension(260, 120));
        panel5.setBackground(Color.cyan);
        panel5.setVisible(true);
        this.add(panel5,BorderLayout.NORTH);
        
        /*JPanel panel6 = new JPanel();
        panel6.setPreferredSize(new Dimension(260, 120));
        panel6.setBackground(Color.BLACK);
        panel6.setVisible(true);
        this.add(panel6,BorderLayout.NORTH);*/
        
        JPanel panel7 = new JPanel();
        panel7.setPreferredSize(new Dimension(235, 120));
        panel7.setBackground(Color.WHITE);
        panel7.setVisible(true);
        this.add(panel5,BorderLayout.EAST);
        
        this.add(monedas,BorderLayout.EAST);
                        
        this.add(salida,BorderLayout.EAST);
        
        
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
        
        /*g.setColor(Color.cyan);
        g.fillRect(200, 300, 400, 25);  // rec superiror
        g.fillRect(200, 300, 25, 600);  // rec Izquierdo
        g.fillRect(200, 800, 400, 150); // rec Inferior
        g.fillRect(480, 300, 120, 600); // rec Derecho
        
        //Dimensiones caja principal 425*520
        g.setColor(Color.gray);
        g.fillRect(225, 325, 260, 530);
        
        //Dimensiones caja salida de botellas
        g.setColor(Color.black);
        g.fillRect(225, 875, 260, 50);
        
        //Dimensiones salida de monedas
        g.setColor(Color.yellow);
        g.fillRect(525, 700, 30, 30);
                        
        //Dimensiones selector
        g.setColor(Color.orange);
        g.fillRect(500, 350, 30, 30);       
        
        g.setColor(Color.red);
        g.fillRect(500, 400, 30, 30);
        g.setColor(Color.green);
        g.fillRect(500, 450, 30, 30);
        
        //Separadores de filas
        g.setColor(Color.black);
        g.fillRect(225,500 , 260, 10);
        g.fillRect(225,675 , 260, 10);
        
        coca.paintComponent(g);
        sprite.paintComponent(g);
        fanta.paintComponent(g);*/

    }
}
