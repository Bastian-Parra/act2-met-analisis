public interface luchador {

    int getVida();
    void setVida(int vida);
    //String golpear();
    String atacar();
    String defender();
    String poderEspecial();
    String usarArma();

    void recibirDano(int dano);
    boolean estaVivo();
    int getVidaMaxima();

    
    void incrementarPoderAtaque(int puntosDanoExtra);

}