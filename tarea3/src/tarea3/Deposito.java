
package tarea3;

import java.util.ArrayList;


public class Deposito {
    
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
