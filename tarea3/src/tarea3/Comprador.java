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
        //this.setSize(250,500);
        //this.setBounds(0, 0, 750, 500);
        this.setBackground(Color.MAGENTA);
        this.setLocale(null);
        
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
        
       
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(750, 400));
        panel.setBackground(Color.red);
        panel.setVisible(true);
        this.add(panel,BorderLayout.NORTH);
        
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(350, 500));
        panel2.setBackground(Color.YELLOW);
        panel2.setVisible(true);
        this.add(panel2,BorderLayout.WEST);
                        
        JLabel compradorLabel = new JLabel();
        ImageIcon stickman = new ImageIcon("stickman.png");
        compradorLabel.setPreferredSize(new Dimension(350, 200));  
        compradorLabel.setBackground(Color.YELLOW);
        compradorLabel.setText("Comprador");
        compradorLabel.setVisible(true);        
        compradorLabel.setForeground(Color.GREEN);
        compradorLabel.setIcon(stickman);
        this.add(compradorLabel,BorderLayout.EAST);
        
        
        //compradorLabel.setBounds(100,100,100,100);
        
        /*JLabel divisor = new JLabel();
        divisor.setBackground(Color.red);                
        divisor.setVisible(true);
        divisor.setSize(new Dimension(750, 200));
        this.add(divisor,BorderLayout.NORTH);

        this.add(compradorLabel);*/
                        
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
