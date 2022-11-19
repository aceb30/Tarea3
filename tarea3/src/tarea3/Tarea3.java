package tarea3;

public class Tarea3 {

    public static void main(String[] args) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        Ventana v = new Ventana();
        PanelPrincipal p = new PanelPrincipal();
        v.add(p);
        v.setVisible(true);
    }
}
