public class PlayExtremeFighter {
    public static void main(String[] args) {
        Luchador jugador = LuchadorFactory.crearLuchador(LuchadorFactory.TipoLuchador.GUERRERO, 80);
        Luchador enemigo = LuchadorFactory.crearLuchador(LuchadorFactory.TipoLuchador.MAGO, 100);// 80 es la vida inicial del enemigo
        FightEngine motorDeCombate = new FightEngine(jugador, enemigo);
        motorDeCombate.iniciarCombate();
    }
}