package tarea3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


class Moneda100 extends Moneda{
    
    public Moneda100(){
        
        ImageIcon coin = new ImageIcon("coin.png");
        JLabel panel = new JLabel();
        panel.setText("100");
        panel.setForeground(Color.WHITE);
        panel.setIcon(coin);
        panel.setVisible(true);
        this.setBackground(Color.BLACK);                 
        panel.setFont(new Font("Serif", Font.PLAIN, 7));
        //panel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(panel);
    }

    @Override
    public int getValor() {
        return 100;
    }  
}
