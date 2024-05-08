/* BaseLuchador es una clase abstracta que implementa la interfaz luchador.
Define las propiedades y métodos comunes para todos los tipos de luchadores en el juego.*/

public abstract class BaseLuchador implements luchador {
    protected int vida;
    protected int vidaMaxima;

    private EstadoAtaque estadoAtaque;
    // Contador para los ataques consecutivos.
    private int contadorAtaques;
//constructor
    public BaseLuchador(int vidaInicial) {
        this.estadoAtaque = new EstadoAtaqueNormal();
        this.contadorAtaques = 0;
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

    /*
    @Override
    public String golpear() {
        contadorGolpes++;
        if (contadorGolpes > 3) {
            contadorGolpes = 0;
            return ataqueFuerte();
        }
        return "Golpe normal - 10 de daño";
    }

    protected String ataqueFuerte() {
        return "Ataque fuerte - 20 de daño";
    }
    */

    public String atacar(){
        return estadoAtaque.atacar(this);
    }

    public void cambiarEstado(EstadoAtaque nuevoEstado){
        this.estadoAtaque = nuevoEstado;
    }

    public void resetearContadorAtaque(){
        contadorAtaques = 0;
    }

    public void incrementarContadorAtaque(){
        contadorAtaques++;
        System.out.println("Contador de ataques: " + this.contadorAtaques);
    }

    public int getContadorAtaques(){
        return contadorAtaques;
    }

    @Override
    public String defender() {
        resetearContadorAtaque();
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
//Metodos que son implementados por subclases como guerrero y mago
    public abstract String poderEspecial();
    public abstract String usarArma();

    //metodos para cambiar las propiedades de los luchadores (MejorasLuchador)
    public abstract void incrementarPoderAtaque(double porcentaje);
    public abstract void cambiarPoderEspecial(String nuevoPoder);
    public abstract void cambiarArma(String nuevaArma);
}
