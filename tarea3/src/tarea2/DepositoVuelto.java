package tarea2;

import java.util.ArrayList;

public class DepositoVuelto {

    private ArrayList<Moneda> al;

    public DepositoVuelto() {
        al = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda m) {
        if (m != null) {
            al.add(m);
        } else {
            al.add(new Moneda100());
        }

    }

    public Moneda getMoneda() {

        if (al.size() == 0) {
            return null;
        }
        return al.remove(0);
    }

    public int getSize() {
        return al.size();
    }
}
