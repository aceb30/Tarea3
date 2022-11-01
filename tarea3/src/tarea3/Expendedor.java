package tarea3;
import java.awt.*;
import javax.swing.*;
public class Expendedor extends JPanel {

    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private DepositoVuelto depvuel;
    private int precio;
    private int vuelto;
    private Bebida b;
    private int x;
    private int y;

    public Expendedor(int cant, int pre, int posx, int posy) {
        x = posx;
        y = posy;
        vuelto = 0;
        precio = pre;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        depvuel = new DepositoVuelto();
        for (int i = 0; i < cant; ++i) {
            //Por ahora les tire posiciones xy random pero se deberá modificar.
            sprite.addBebida(new Sprite(i + 200, 100, 100));
            coca.addBebida(new CocaCola(i + 100,200,200));
            fanta.addBebida(new Fanta(i + 100,300,300));
        }
    }

    public Moneda getVuelto() {
        return depvuel.getMoneda();
    }

    public int getSizea() {
        return depvuel.getSize();
    }

    public void AddVuelto(Moneda m) {
        depvuel.addMoneda(m);
    }
    
    public String getSabor(){
        return b.beber();
    }

    public Bebida comprarBebida(Moneda m, int tipo) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {

        b = null;

        if (m == null) {
            throw new PagoIncorrectoException("Pago incorrecto");
        }
        int dinero = m.getValor();
        if (dinero >= precio) {
            vuelto = dinero - precio;
        } else {
            depvuel.addMoneda(m);
            throw new PagoInsuficienteException("Pago insuficiente");
        }
        switch (tipo) {

            case 1:
                b = coca.getBebida();
                break;
            case 2:
                b = sprite.getBebida();
                break;
            case 3:
                b = fanta.getBebida();
                break;

        }

        if (b != null) {
            if (vuelto > 0) {
                for (int i = 0; i < (vuelto / 100); ++i) {
                    AddVuelto(null);
                }
            }
            return b;
        } else {
            AddVuelto(m);
            throw new NoHayBebidaException("No hay bebida");
        }
    }
     public void paintComponent(Graphics g) {
      super.paintComponent(g);
      // draw Eyes
      g.setColor(Color.BLACK);
      g.fillOval(x+45, y+55, 30, 30);
      g.fillOval(135, 65, 30, 30);
      // draw Mouth
      g.fillOval(50, 110, 120, 60);
      // adding smile
      g.setColor(Color.YELLOW);
      g.fillRect(50, 110, 120, 30);
      g.fillOval(50, 120, 120, 40);
      
   }
}
