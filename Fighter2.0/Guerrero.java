public class Guerrero extends BaseLuchador{
    private double factorPoderAtaque = 1.0;
    private String poderEspecialActual = "Tormenta de Espadas";  // Valor predeterminado
    private String armaActual = "Espada";

    public Guerrero(int vidaInicial) {
        super(vidaInicial);
    }

    @Override
    public void incrementarPoderAtaque(int puntosDanoExtra) {
        this.factorPoderAtaque += puntosDanoExtra / 100.0;  // Asumiendo que puntosDanoExtra es un porcentaje
        System.out.println("Poder de ataque incrementado a: " + this.factorPoderAtaque);
    }

    @Override
    public String poderEspecial() {
        resetearContadorAtaque();
        int danio = (int) (30 * factorPoderAtaque);  // Aplica el factor de poder de ataque
        return poderEspecialActual + " - " + danio + " de daño";
    }

    @Override
    public String usarArma() {
        resetearContadorAtaque();
        int danio = (int) (15 * factorPoderAtaque);  // Aplica el factor de poder de ataque
        return "Ataque con " + armaActual + " - " + danio + " de daño";
    }
}
