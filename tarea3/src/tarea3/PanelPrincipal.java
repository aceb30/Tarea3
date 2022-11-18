package tarea3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class PanelPrincipal extends JPanel implements ActionListener {

    private Comprador com;
    private Expendedor exp;
    
    private JButton botonBebida = new JButton();
    
    public PanelPrincipal() throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        
        super(new BorderLayout());
        this.setLocale(null);
        
        botonBebida.setBounds(10, 10, 100, 50);
        botonBebida.addActionListener(this);
        botonBebida.setText("Bebida");
        botonBebida.setFocusable(false);
        
        this.setBackground(Color.WHITE);

        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda n = null;
        
        exp = new Expendedor(10, 1000, 10, 10);
        com = new Comprador(m3, 2, exp);
        
        this.add(botonBebida);
        
        this.add(exp,BorderLayout.EAST);
        this.add(com);
        
        
        
        this.revalidate();
        this.repaint();
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        if(e.getSource()==botonBebida){
            System.out.println("Botón Bebida Presionado");
            //For testing, weird code suggested by netporotos.
            Moneda m4 = new Moneda1000();
            try {
                exp.comprarBebida(m4, 3);
            } catch (NoHayBebidaException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PagoInsuficienteException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PagoIncorrectoException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
