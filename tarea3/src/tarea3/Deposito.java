
package tarea3;
import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;


public class Deposito extends JPanel {
    
    private ArrayList<Bebida> al;
    
    public Deposito(){
        al = new ArrayList<Bebida>();
    }
    
    public void addBebida(Bebida b){
        al.add(b);
    }
    
    public Bebida getBebida(){
        
        if(al.isEmpty()){
            return null;
        }
        else
        return al.remove(0);
    }
}