public class Mago extends BaseLuchador {
    private double factorPoderAtaque = 1.0;
    private String poderEspecialActual = "Bola de Fuego";  // Poder especial inicial
    private String armaActual = "Bastón Mágico";  // Arma inicial

    public Mago(int vidaInicial) {
        super(vidaInicial);
    }

    @Override
    public void incrementarPoderAtaque(int puntosDanoExtra) {
        this.factorPoderAtaque += puntosDanoExtra;
    }

    @Override
    public String poderEspecial() {
        return poderEspecialActual + " - 30 de daño";
    }

    @Override
    public String usarArma() {
        return "Ataque con " + armaActual + " - 15 de daño";
    }
}