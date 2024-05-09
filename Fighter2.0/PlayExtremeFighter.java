public class PlayExtremeFighter {
    public static void main(String[] args) {
        luchador jugador = new Guerrero(100);  // 100 es la vida inicial
        luchador enemigo = new Mago(100);  // 80 es la vida inicial del enemigo

        FightEngine motorDeCombate = new FightEngine(jugador, enemigo);
        motorDeCombate.iniciarCombate();
    }
}