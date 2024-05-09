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

    //esto es para cambiar poder y arma pero no lo desarrolle la vd, esta relacionado con MejorasLuchador
    void setPoderEspecial(String nuevoPoder);
    void setArma(String nuevaArma);

}