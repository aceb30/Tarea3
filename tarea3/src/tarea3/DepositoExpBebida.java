
package tarea3;
import java.awt.*;
import javax.swing.*;

public class DepositoExpBebida extends JPanel {
    private Bebida bebida;
    private int cant;
    public DepositoExpBebida(){
        cant = 0;
    }
    public void addBebida(Bebida b){
        if(cant == 0){
            bebida = b;
            cant = 1;
        }
    }
    public Bebida GetBebida(){
        if(cant == 1){
            cant = 0;
            return bebida;
        }
        return null;
    }
    
}
