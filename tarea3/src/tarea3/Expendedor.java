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
    private int posCoca = 200;
    
    private JButton button100 = new JButton();
    private JButton button500 = new JButton();
    private JButton button1000 = new JButton();
    private JButton button1500 = new JButton();
    
    private JButton buttonSprite = new JButton();
    private JButton buttonCoca = new JButton();
    private JButton buttonFanta = new JButton();

    public Expendedor(int cant, int pre, int posx, int posy) {
        
        super(null);
        this.setPreferredSize(new Dimension(750, 1000));
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
            coca.setBounds(100,posCoca, 40, 60);
            posCoca=posCoca+50;
            this.add(coca);
            //this.add(sprite);
            //this.add(fanta);
        }                                               
        
        monedas.setBounds(800, 100, 30, 40);        
        this.add(monedas);
        
        salida.setBounds(650,875,30,40);
        salida.setVisible(true);
        this.add(salida);
        
        depvuel.setBounds(0,0,750,150);
        this.add(depvuel);
        
        button100.setBounds(10, 175, 100, 30);
        //botonBebida.addActionListener(this);
        button100.setText("Add 100");
        button100.setFocusable(false);
        this.add(button100);
        
        button500.setBounds(210, 175, 100, 30);
        //botonBebida.addActionListener(this);
        button500.setText("Add 500");
        button500.setFocusable(false);
        this.add(button500);
        
        button1000.setBounds(410, 175, 100, 30);
        //botonBebida.addActionListener(this);
        button1000.setText("Add 1000");
        button1000.setFocusable(false);
        this.add(button1000);
        
        button1500.setBounds(610, 175, 100, 30);
        //botonBebida.addActionListener(this);
        button1500.setText("Add 1500");
        button1500.setFocusable(false);
        this.add(button1500);
        
        //Buy buttons
        
        buttonSprite.setBounds(650, 350, 50, 50);
        //botonBebida.addActionListener(this);
        buttonSprite.setText("S");
        buttonSprite.setFocusable(false);
        this.add(buttonSprite);
        
        buttonCoca.setBounds(650, 400, 50, 50);
        //.addActionListener(this);
        buttonCoca.setText("C");
        button100.setFocusable(false);
        this.add(buttonCoca);
        
        buttonFanta.setBounds(650, 450, 50, 50);
        //buttonFanta.addActionListener(this);
        buttonFanta.setText("F");
        buttonFanta.setFocusable(false);
        this.add(buttonFanta);
        
        
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
        return salida.getBebida();
    }

    @Override
    
    public void paint(Graphics g) {
        
        super.paint(g);
        
        g.setColor(Color.cyan);
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
        
        //coca.paintComponent(g);
        //sprite.paintComponent(g);
        //fanta.paintComponent(g);*/

    }
}
