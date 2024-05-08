public class EstadoAtaquePotenciado implements EstadoAtaque {
    @Override
    public String atacar(luchador luchador) {
        if (luchador instanceof BaseLuchador) {
            BaseLuchador baseLuchador = (BaseLuchador) luchador;
            baseLuchador.resetearContadorAtaque();
            baseLuchador.cambiarEstado(new EstadoAtaqueNormal());
        }
        return "Ataque Fuerte - 20 de daño";
    }
}
