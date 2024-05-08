public class MejorasLuchador {
    private static final int COSTO_MEJORA = 400;

    public static void mejorarVida(Luchador luchador, int exp) {
        if (exp >= COSTO_MEJORA) {
            luchador.setVida((int) (luchador.getVida() * 1.05));  // Aumenta vida en 5%
        }
    }

    public static void mejorarAtaque(Luchador luchador, int exp) {
        if (exp >= COSTO_MEJORA) {
            if (luchador instanceof BaseLuchador) {
                ((BaseLuchador) luchador).incrementarPoderAtaque(0.05);  // Aumenta el poder de ataque en 5%
            }
        }
    }

    public static void recuperacionTotalVida(Luchador luchador, int exp) {
        if (exp >= COSTO_MEJORA) {
            luchador.setVida(luchador.getVidaMaxima());  // Recupera la vida al máximo
        }
    }

    public static void cambiarPoderEspecial(Luchador luchador, int exp, String nuevoPoder) {
        if (exp >= COSTO_MEJORA) {
            if (luchador instanceof BaseLuchador) {
                ((BaseLuchador) luchador).setPoderEspecial(nuevoPoder);  // Cambia el poder especial
            }
        }
    }

    public static void cambiarArma(Luchador luchador, int exp, String nuevaArma) {
        if (exp >= COSTO_MEJORA) {
            if (luchador instanceof BaseLuchador) {
                ((BaseLuchador) luchador).setArma(nuevaArma);  // Cambia el arma
            }
        }
    }
}
