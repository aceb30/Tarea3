
package tarea3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Moneda1000 extends Moneda{
    public Moneda1000(){
        
        ImageIcon coin = new ImageIcon("coin.png");
        JLabel panel = new JLabel();
        panel.setText("1000");
        panel.setForeground(Color.WHITE);
        panel.setIcon(coin);
        panel.setVisible(true);
        this.setBackground(Color.BLACK);         
        this.add(panel);
        panel.setFont(new Font("Serif", Font.PLAIN, 7));
        
    }

    @Override
    public int getValor() {
        return 1000;
    }
}