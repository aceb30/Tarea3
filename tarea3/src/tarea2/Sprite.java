package tarea2;

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return super.beber() + "sprite";
    }
}
