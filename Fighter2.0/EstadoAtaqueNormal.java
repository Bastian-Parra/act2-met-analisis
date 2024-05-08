public class EstadoAtaqueNormal implements EstadoAtaque {
    @Override
    public String atacar(luchador luchador) {
        if (luchador instanceof BaseLuchador) {
            BaseLuchador baseLuchador = (BaseLuchador) luchador;
            baseLuchador.incrementarContadorAtaque();
            if (baseLuchador.getContadorAtaques() == 3) {
                baseLuchador.cambiarEstado(new EstadoAtaquePotenciado());
            }
        }
        return "Ataque normal - 10 de daño";
    }
}
