package tarea3;

import java.awt.*;
import javax.swing.*;

public class Comprador extends JPanel {

    private int bebida;
    private String sabor;
    private int vuelto = 0;
    private int x;
    private int y;        

    public Comprador(Moneda m, int cualBebida, Expendedor exp) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        
        this.setPreferredSize(new Dimension(750,500));
        
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
        
        this.setBackground(Color.MAGENTA);
        //this.setLocale(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(30, 30, 400, 300);
        panel.setBackground(Color.red);
        
        ImageIcon stickman = new ImageIcon("stickman.png");        
        JLabel compradorLabel = new JLabel();  
        compradorLabel.setBackground(Color.red);
        compradorLabel.setVisible(true);
        compradorLabel.setText("Comprador");
        compradorLabel.setForeground(Color.black);
        compradorLabel.setIcon(stickman);
        compradorLabel.setBounds(100,100,100,100);
        
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
        
        /*g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200);

        // draw Eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        // draw Mouth
        g.fillOval(50, 110, 120, 60);

        // adding smile
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);*/
                             
    }    

}
