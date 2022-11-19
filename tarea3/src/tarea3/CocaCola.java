
package tarea3;
import java.awt.*;
import javax.swing.*;

class CocaCola extends Bebida{
    
    public CocaCola(int serie, int posx, int posy){
        super(serie, posx, posy);        
        this.btn = new JButton();
        
        ImageIcon coca = new ImageIcon("cocacola.png");
        //JLabel panel = new JLabel();    
        
        this.btn.setIcon(coca);
        this.btn.setBounds(0, 0, 20, 50);

        this.add(this.btn);      
    }
    @Override
    public String beber(){
        return super.beber() + "cocacola";
    }
 
    @Override
    public void paint(Graphics g){
        super.paint(g);
    }
}
