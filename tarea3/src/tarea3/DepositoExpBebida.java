
package tarea3;
import java.awt.*;
import javax.swing.*;

public class DepositoExpBebida extends JPanel {
    private Bebida bebida;
    private int cant;
    
    public DepositoExpBebida(Bebida b){
        
        cant = 1;
        bebida = b;
        this.setPreferredSize(new Dimension(80, 40));        
        this.setBackground(Color.MAGENTA);
        
        JLabel bebidaLabel = new JLabel();
        bebidaLabel.setText("Bebida");
        bebidaLabel.setVisible(true);
        bebidaLabel.setForeground(Color.WHITE);        
        this.add(bebidaLabel);
    }
  
    public Bebida GetBebida() throws NoHayBebidaException{
        if(cant == 1){
            cant = 0;
            return bebida;
        }
        throw new NoHayBebidaException("No hay bebida");
    }
    
}
