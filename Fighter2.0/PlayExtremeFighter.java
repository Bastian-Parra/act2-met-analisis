public class PlayExtremeFighter {
    public static void main(String[] args) {
        luchador jugadorReal = new Guerrero(100);  // 100 es la vida inicial
        ProxyHabilidadLuchador proxyJugador = new ProxyHabilidadLuchador(jugadorReal, 1);
        luchador enemigo = new Mago(100);  // 80 es la vida inicial del enemigo

        FightEngine motorDeCombate = new FightEngine(proxyJugador, enemigo);
        motorDeCombate.iniciarCombate();
    }
}