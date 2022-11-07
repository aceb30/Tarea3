 
package tarea3;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel {
    private Comprador com;
    private Expendedor exp;
    public PanelPrincipal() throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException{
        //Por ahora le pongo valores por defecto, pero debe ser modificado.
        exp = new Expendedor(10, 1000, 10, 10);
        Moneda1000 m = new Moneda1000();
        com = new Comprador(m, 2, exp, 10, 10);
        this.setBackground(Color.black);
        
        
    }
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      
      com.paintComponent(g);
      
      
      exp.paintComponent(g);
      
      
   }
    
}
