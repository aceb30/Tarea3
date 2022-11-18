package tarea3;

import java.awt.*;
import javax.swing.*;

public class Comprador extends JPanel {

    private int bebida;
    private String sabor;
    private int vuelto = 0;
    private int x;
    private int y;
    
    private JButton botonBebida = new JButton();

    public Comprador(Moneda m, int cualBebida, Expendedor exp) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        
        super(null);
        this.setLocale(null);
        this.setPreferredSize(new Dimension(750,500));                
        this.setBackground(Color.MAGENTA);
        
        botonBebida.setBounds(10, 10, 100, 50);
        //botonBebida.addActionListener(this);
        botonBebida.setText("Bebida");
        botonBebida.setFocusable(false);
        
        exp.comprarBebida(m, cualBebida);
        Bebida b = exp.getBebida();
        vuelto = 0;

        while (true) {
            if (exp.getSizea() != 0) {
                Moneda v = exp.getVuelto();
                vuelto = vuelto + v.getValor();
            } else {
                break;
            }
        }
        sabor = b.beber();                                               
                        
        JLabel compradorLabel = new JLabel();
        ImageIcon stickman = new ImageIcon("stickman3.png");
        compradorLabel.setIcon(stickman);
        compradorLabel.setText("Comprador (Is a programer)");        
        compradorLabel.setForeground(Color.WHITE);
        compradorLabel.setVisible(true);                
        compradorLabel.setBounds(200,500, 400, 300);
                
       this.add(compradorLabel);                      
                        
    }

    public int getVuelto() {
        return vuelto;
    }

    public String getSabor() {
        return sabor;
    }

    @Override
    public void paint(Graphics g) {
        
        super.paint(g);                                     
    }    

}
