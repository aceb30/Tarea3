
package tarea3;
import java.awt.*;
import javax.swing.*;

class CocaCola extends Bebida{
    
    public CocaCola(int serie, int posx, int posy){
        
        super(serie, posx, posy);        
        ImageIcon coca = new ImageIcon("cocacola.png");
        JLabel panel = new JLabel();                
        panel.setIcon(coca);
        panel.setVisible(true);
        panel.setBackground(Color.YELLOW);      
        this.add(panel);        
    }
    public String beber(){
        return super.beber() + "cocacola";
    }
 
    public void paint(Graphics g){
        super.paint(g);
        //g.setColor(Color.white);
        //g.fillRect(super.getX(), super.getY(), 50, 50);
    }
}
