public class Mago extends BaseLuchador {
    private double factorPoderAtaque = 1.0;
    private String poderEspecialActual = "Bola de Fuego";  // Poder especial inicial
    private String armaActual = "Bastón Mágico";  // Arma inicial

    public Mago(int vidaInicial) {
        super(vidaInicial);
    }

    @Override
    public void incrementarPoderAtaque(double porcentaje) {
        this.factorPoderAtaque += porcentaje;
    }

    @Override
    public void cambiarPoderEspecial(String nuevoPoder) {
        this.poderEspecialActual = nuevoPoder;
    }

    @Override
    public void cambiarArma(String nuevaArma) {
        this.armaActual = nuevaArma;
    }

    @Override
    public String poderEspecial() {
        return poderEspecialActual + " - 30 de daño";
    }

    @Override
    public String usarArma() {
        return "Ataque con " + armaActual + " - 15 de daño";
    }

    @Override
    public void setPoderEspecial(String nuevoPoder) {
        this.poderEspecialActual = nuevoPoder;  // Actualiza el poder especial
    }

    @Override
    public void setArma(String nuevaArma) {
        this.armaActual = nuevaArma;  // Actualiza el arma
    }
}