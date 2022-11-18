
package tarea3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Moneda1500 extends Moneda{
    
    public Moneda1500(){        
    ImageIcon coin = new ImageIcon("coin.png");
        
    JLabel panel = new JLabel();
        panel.setText("1500");
        panel.setForeground(Color.WHITE);
        panel.setIcon(coin);
        panel.setVisible(true);
        this.setBackground(Color.BLACK);                 
        panel.setFont(new Font("Serif", Font.PLAIN, 7));
        this.add(panel,BorderLayout.NORTH);
    }

    @Override
    public int getValor() {
        return 1500;
    }
}