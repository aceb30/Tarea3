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
    private JButton botonMoneda100 = new JButton();
    private JButton botonMoneda500 = new JButton();
    private JButton botonMoneda1000 = new JButton();
    private JButton botonMoneda1500 = new JButton();
    
    public PanelPrincipal() throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        
        super(new BorderLayout());
        this.setLocale(null);
        
        botonBebida.setBounds(0, 100, 100, 30);
        botonBebida.addActionListener(this);
        botonBebida.setText("Bebida");
        botonBebida.setFocusable(false);
        
        this.setBackground(Color.WHITE);

        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda1000();
        Moneda m3 = new Moneda500();
        Moneda m4 = new Moneda100();
        Moneda m5 = new Moneda500();
        Moneda m6 = new Moneda1000();
        Moneda m7 = new Moneda1000();
        Moneda m8 = new Moneda1000();
        Moneda m9 = new Moneda1000();
        Moneda m10 = new Moneda1000();
        Moneda m11 = new Moneda1000();
        Moneda m12 = new Moneda1000();
        Moneda m13 = new Moneda1000();
        Moneda m14 = new Moneda1000();
        Moneda m90 = new Moneda1000();
        Moneda n = null;
        
        exp = new Expendedor(10, 1000, 10, 10);

        exp.AddVuelto(m1);
        exp.AddVuelto(m2);
        exp.AddVuelto(m3);
        exp.AddVuelto(m4);
        exp.AddVuelto(m5);
        exp.AddVuelto(m6);
        exp.AddVuelto(m7);
        exp.AddVuelto(m8);
        exp.AddVuelto(m9);
        exp.AddVuelto(m10);
        exp.AddVuelto(m11);
        exp.AddVuelto(m12);
        exp.AddVuelto(m13);
        exp.AddVuelto(m14);
        com = new Comprador(m90, 2, exp);              
        
        //com.setBounds(0, 0, 300, 200);
        com.setBounds(0, 0, 750, 1000);
        exp.setBounds(750, 0, 750, 1000);
        this.add(com);
        this.add(exp,BorderLayout.EAST);                                                 
        
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
