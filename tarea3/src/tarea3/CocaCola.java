
package tarea3;
import java.awt.*;
import javax.swing.*;

class CocaCola extends Bebida{
    public CocaCola(int serie, int posx, int posy){
        super(serie, posx, posy);
    }
    public String beber(){
        return super.beber() + "cocacola";
    }
 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
    }
}
