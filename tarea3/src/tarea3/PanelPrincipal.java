
package tarea3;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel {
    private Comprador com;
    private Expendedor exp;
    public PanelPrincipal() throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException{
        //Por ahora le pongo valores por defecto, pero debe ser modificado.
        exp = new Expendedor(10, 1000);
        Moneda1000 m = new Moneda1000();
        com = new Comprador(m, 2, exp);
        this.setBackground(Color.white);
    }
    public void paintComponent(Graphics g) {
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
