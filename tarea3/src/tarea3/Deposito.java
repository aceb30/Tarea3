package tarea3;
import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;


public class Deposito extends JPanel {
    
    private ArrayList<Bebida> al;
    
    public void paint(Graphics g){
        al.get(0).paint(g); //Se supone que aquí irá un for para dibujar cada bebida del depósito
    }
    public Deposito(){                        
        
        al = new ArrayList<Bebida>();        
    }
    
    public void addBebida(Bebida b){
        al.add(b);
        this.add(b,BorderLayout.SOUTH);
    }
    
    public Bebida getBebida(){
        
        if(al.isEmpty()){
            return null;
        }
        else
        return al.remove(0);
    }
}
