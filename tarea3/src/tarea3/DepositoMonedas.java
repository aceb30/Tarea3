
package tarea3;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DepositoMonedas extends JPanel {
     private ArrayList<Moneda> al;
     public DepositoMonedas(){
         al = new ArrayList<Moneda>();
         
        this.setPreferredSize(new Dimension(50, 60));        
        this.setBackground(Color.YELLOW);        
        
        JLabel vueltoLabel = new JLabel();
        vueltoLabel.setText("Vuelto");
        vueltoLabel.setVisible(true);
        vueltoLabel.setForeground(Color.black);        
        this.add(vueltoLabel);
                   
     }
     public void addMoneda(Moneda m) {
      if (m != null) {
          al.add(m);
      }
     }               
}

