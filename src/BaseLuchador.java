public abstract class BaseLuchador implements luchador {
    protected int vida;
    protected int vidaMaxima;
    protected int contadorGolpes = 0;

    public BaseLuchador(int vidaInicial) {
        this.vida = vidaInicial;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getVidaMaxima() {  // Implementación del nuevo método
        return vidaMaxima;
    }

    @Override
    public String golpear() {
        contadorGolpes++;
        if (contadorGolpes >= 3) {
            contadorGolpes = 0;
            return ataqueFuerte();
        }
        return "Golpe normal - 10 de daño";
    }

    protected String ataqueFuerte() {
        return "Ataque fuerte - 20 de daño";
    }

    @Override
    public String defender() {
        return "Defensa activada";
    }

    @Override
    public void recibirDano(int dano) {
        this.vida -= dano;
    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }

    public abstract String poderEspecial();
    public abstract String usarArma();

    public abstract void incrementarPoderAtaque(double porcentaje);
    public abstract void cambiarPoderEspecial(String nuevoPoder);
    public abstract void cambiarArma(String nuevaArma);
}
