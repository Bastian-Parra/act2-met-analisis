public class PocionVida implements Pocion {
    private int puntosDeCuracion;
    private boolean usada = false;  // Controla si la poción ya fue usada

    public PocionVida(int puntosDeCuracion) {
        this.puntosDeCuracion = puntosDeCuracion;
    }

    @Override
    public void efectoPocion(luchador luchador) {
        if (!usada) {
            int vidaActual = luchador.getVida();
            int nuevaVida = vidaActual + puntosDeCuracion;
            luchador.setVida(nuevaVida);
            System.out.println("Poción de vida aplicada. Vida recuperada: " + puntosDeCuracion + ", Vida total: " + luchador.getVida());
        } else {
            System.out.println("La poción de vida ya ha sido usada.");
        }
    }
}
