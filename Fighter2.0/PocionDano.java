public class PocionDano implements Pocion{
    private int puntosDanoExtra;

    public PocionDano(int puntosDanoExtra) {
        this.puntosDanoExtra = puntosDanoExtra;
    }

    @Override
    public void efectoPocion(luchador luchador) {
        luchador.incrementarPoderAtaque(puntosDanoExtra);
        System.out.println("Pocion de daño aplicada, daño aumentado");
    }
}
