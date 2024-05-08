public interface LuchadorFactory {
    public enum TipoLuchador {
        GUERRERO, 
        MAGO
    }

    public static Luchador crearLuchador(TipoLuchador tipo, int vidaInicial){
        switch(tipo) {
            case GUERRERO:
                return new Guerrero(vidaInicial);
            case MAGO:
                return new Mago(vidaInicial);
            default:
                throw new IllegalArgumentException("Tipo de luchador desconocido");
        }
    }
}