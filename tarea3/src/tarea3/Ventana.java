
package tarea3;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    
    public Ventana(){
        
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Tarea 3");
        this.setSize(1500, 800);
        this.getContentPane().setBackground(new Color(0,0,0));
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Windows icon
        ImageIcon icon = new ImageIcon("icon.png");
        this.setIconImage(icon.getImage());
        
        JLabel dLabel = new JLabel();
        dLabel.setText("Dispenser");
        dLabel.setForeground(Color.white);
        ImageIcon dispenser = new ImageIcon("dispenser.png");
        dLabel.setIcon(dispenser);
        
        //dLabel.setHorizontalAlignment(JLabel.CENTER);
        //dLabel.setVerticalAlignment(JLabel.CENTER);
        
        ImageIcon coin = new ImageIcon("coin.png");        
        JLabel c100Label = new JLabel();
        c100Label.setVisible(true);                
        c100Label.setText(" X 4");
        c100Label.setForeground(Color.white);                
        c100Label.setIcon(coin);
        c100Label.setLocation(0,0);
        c100Label.setSize(40,40);
        
        //ImageIcon coin = new ImageIcon("coin500.png");
        JLabel c500Label = new JLabel();
        c100Label.setVisible(true);
        //c500Label.setBounds(100, 0, 40, 40);        
        c500Label.setText(" X 6");
        c500Label.setForeground(Color.white);                
        c500Label.setIcon(coin);
        c100Label.setLocation(80,0);
        c100Label.setSize(40,40);
        
        
                                                
        this.add(c100Label);
        this.add(c500Label);
        
        //this.add(dLabel);
        
                        
        this.setVisible(true);
        
                         
                                        
    }
    
}
