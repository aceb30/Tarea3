package tarea3;

public class Comprador {

    private int bebida;
    private String sabor;
    private int vuelto = 0;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        
        Bebida b = exp.comprarBebida(m, cualBebida);

        vuelto = 0;
        
        while (true) {
            if (exp.getSize() != 0) {
                Moneda v = exp.getVuelto();
                vuelto = vuelto + v.getValor();
            } else {
                break;
            }
        }
        sabor = b.beber();
    }

    public int getVuelto() {
        return vuelto;
    }

    public String getSabor() {
        return sabor;
    }
}
