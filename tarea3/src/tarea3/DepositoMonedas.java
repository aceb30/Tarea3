
package tarea3;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DepositoMonedas extends JPanel {
     private ArrayList<Moneda> al;
     public DepositoMonedas(){
         al = new ArrayList<Moneda>();
     }
     public void addMoneda(Moneda m) {
      if (m != null) {
          al.add(m);
      }
     }
      
     
     

}

