package tarea2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarea2 {

    // TODO: Handle these
    public static void main(String[] args){

        Moneda m1 = new Moneda100();
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda n = null;

        Expendedor expendedor = new Expendedor(1, 800);

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
