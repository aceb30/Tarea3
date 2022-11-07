package tarea3;
import java.awt.*;
import javax.swing.*;
public class Comprador extends JPanel {

    private int bebida;
    private String sabor;
    private int vuelto = 0;
    private int x;
    private int y;
    public Comprador(Moneda m, int cualBebida, Expendedor exp, int posx, int posy) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        
        x = posx; 
        y = posy;
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
    }

    public int getVuelto() {
        return vuelto;
    }

    public String getSabor() {
        return sabor;
    }
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      super.paintComponent(g);
        g.setColor(Color.YELLOW);
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
        g.fillOval(50, 120, 120, 40);
   }
    
    
}
