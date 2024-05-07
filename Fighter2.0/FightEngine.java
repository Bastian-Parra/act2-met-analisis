import java.util.Random;
import java.util.Scanner;

public class FightEngine {
    private luchador jugador;
    private luchador enemigo;
    private Scanner scanner = new Scanner(System.in);

    public FightEngine(luchador jugador, luchador enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }

    public void iniciarCombate() {
        int ronda = 1;
        while (jugador.estaVivo() && enemigo.estaVivo()) {
            System.out.println("Ronda " + ronda++);
            turnoJugador();
            if (enemigo.estaVivo()) {
                turnoEnemigo();
            }
        }
        if (jugador.estaVivo()) {
            System.out.println("¡Ganaste la ronda!");
        } else {
            System.out.println("GAME OVER");
        }
    }
    private int danoDesdeAccion(String descripcion) {
        String[] partes = descripcion.split(" - ");
        if (partes.length > 1) {
            try {
                return Integer.parseInt(partes[1].replace(" de daño", "").trim());
            } catch (NumberFormatException e) {
                System.out.println("Error al interpretar el daño.");
                return 0;
            }
        }
        return 0;
    }

    private void turnoJugador() {
        System.out.println("Elige tu acción: 1-Golpear, 2-Defender, 3-Poder Especial, 4-Usar Arma");
        int eleccion = scanner.nextInt();
    
        switch (eleccion) {
            case 1: // Golpear
                System.out.println("Has elegido golpear.");
                String resultado = jugador.golpear();
                System.out.println(resultado);
                enemigo.recibirDano(danoDesdeAccion(resultado));
                break;
            case 2: // Defender
                System.out.println("Te has defendido.");
                break;
            case 3: // Poder Especial
                System.out.println("Has usado tu poder especial.");
                resultado = jugador.poderEspecial();
                System.out.println(resultado);
                enemigo.recibirDano(danoDesdeAccion(resultado));
                break;
            case 4: // Usar Arma
                System.out.println("Has usado tu arma.");
                resultado = jugador.usarArma();
                System.out.println(resultado);
                enemigo.recibirDano(danoDesdeAccion(resultado));
                break;
            default:
                System.out.println("Opción inválida, pierdes tu turno.");
                break;
        }
    }

    private void turnoEnemigo() {
        int accion = new Random().nextInt(3) + 1;
        System.out.println("Es el turno del enemigo.");
        String resultado;
    
        switch (accion) {
            case 1: // Golpear
                resultado = enemigo.golpear();
                System.out.println("Enemigo golpea: " + resultado);
                jugador.recibirDano(danoDesdeAccion(resultado));
                break;
            case 2: // Defender
                System.out.println("Enemigo se defiende.");
                break;
            case 3: // Poder Especial
                resultado = enemigo.poderEspecial();
                System.out.println("Enemigo usa poder especial: " + resultado);
                jugador.recibirDano(danoDesdeAccion(resultado));
                break;
        }
    }
}