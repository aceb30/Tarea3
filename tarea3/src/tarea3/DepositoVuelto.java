package tarea3;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class DepositoVuelto extends JPanel {

    private ArrayList<Moneda> al;

    public DepositoVuelto() {
    
        al = new ArrayList<Moneda>();
        
        this.setPreferredSize(new Dimension(750, 200));
        this.setBackground(Color.GREEN);                      
    
    }

    public void addMoneda(Moneda m) {
        if (m != null) {
            
            al.add(m);
            this.add(m,BorderLayout.EAST);
            
        } else {
            al.add(new Moneda100());
        }        

    }

    public Moneda getMoneda() {

        if (al.size() == 0) {
            return null;
        }
        return al.remove(0);
    }

    public int getSizea() {
        return al.size();
    }
}
