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
        Bebida b = exp.comprarBebida(m, cualBebida);

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
      //Yes, i know.
      g.setColor(Color.YELLOW);
      g.fillOval(x, y, 200, 200);
   }
    
    
}
