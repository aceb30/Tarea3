package tarea3;

import javax.swing.*;


class Moneda100 extends Moneda{
    
    public Moneda100(){
        ImageIcon coin = new ImageIcon("coin.png");
        JLabel panel = new JLabel();
        panel.setIcon(coin);
        panel.setVisible(true);
        this.add(panel);
    }

    @Override
    public int getValor() {
        return 100;
    }  
}
