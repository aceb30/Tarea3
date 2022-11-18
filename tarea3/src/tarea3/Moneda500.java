
package tarea3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Moneda500 extends Moneda{
    
    public Moneda500(){
        ImageIcon coin = new ImageIcon("coin.png");
        JLabel panel = new JLabel();
        panel.setText("500");
        panel.setForeground(Color.WHITE);
        panel.setIcon(coin);
        panel.setVisible(true);
        this.setBackground(Color.BLACK);         
        this.add(panel);
        panel.setFont(new Font("Serif", Font.PLAIN, 8));
    }    

    @Override
    public int getValor() {
        return 500;
    }
}
