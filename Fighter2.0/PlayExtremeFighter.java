public class PlayExtremeFighter {
    public static void main(String[] args) {
        luchador jugador = new Guerrero(100);  // 100 es la vida inicial
        ProxyHabilidadLuchador proxyJugador = new ProxyHabilidadLuchador(jugador, 1);  // 100 es la vida inicial
        luchador enemigo = new Mago(100);

        FightEngine motorDeCombate = new FightEngine(proxyJugador, enemigo);
        motorDeCombate.iniciarCombate();
    }
}