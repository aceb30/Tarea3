package tarea3;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import javax.swing.*;

public class Tarea3 {

    static int to_int(String s) {
        int n;
        try {
            n = Integer.parseInt(s);
        } catch (Exception e) {
            n = 1337;
        }
        return n;
    }
    
    // TODO: Handle these
    public static void main(String[] args) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {

        Ventana v = new Ventana();
        PanelPrincipal p = new PanelPrincipal();
        v.add(p);
        v.setVisible(true);
        
        
        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda n = null;
                
        Expendedor exp = new Expendedor(10, 1000, 10, 10);
        Comprador com = new Comprador(m3, 2, exp);
        
        

        
        Expendedor expendedor = new Expendedor(1, 800, 10, 10);

        Comprador pedro;
        try {
            
            pedro = new Comprador(m3, 2, expendedor);

            System.out.println(pedro.getVuelto());
            System.out.println(pedro.getSabor());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
