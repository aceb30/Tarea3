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
        
        //this.setPreferredSize(new Dimension(750, 800));
        
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
        
        ImageIcon coin = new ImageIcon("stickman.png");        
        JLabel c100Label = new JLabel();
        c100Label.setVisible(true);                
        c100Label.setText("Hombrefalo");
        c100Label.setForeground(Color.black);
        c100Label.setIcon(coin);        
        c100Label.setLocation(0,0);
        c100Label.setSize(40,40);
        
        this.add(c100Label);
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
