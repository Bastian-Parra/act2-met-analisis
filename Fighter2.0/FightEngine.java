import java.util.Random;
import java.util.Scanner;

/*
 * Clase que se encarga de manejar el combate entre dos luchadores.
 */
public class FightEngine {

    private ProxyHabilidadLuchador jugador;
    private luchador enemigo;

    private boolean pocionDeVidaUsada = false;
    private boolean pocionDeAtaqueUsada = false;

    // Scanner para capturar la entrada del usuario durante el combate.
    private Scanner scanner = new Scanner(System.in);
    
    // Constructor que inicializa el motor de lucha
    public FightEngine(ProxyHabilidadLuchador jugador, luchador enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }
    // Método para iniciar y gestionar el combate hasta que uno de los luchadores pierda
    public void iniciarCombate() {
        int ronda = 1;
        while (jugador.estaVivo() && enemigo.estaVivo()) {
            System.out.println("Ronda " + ronda);
            jugador.setRondaActual(ronda);
            ronda++;
            turnoJugador();
            if (enemigo.estaVivo()) {
                turnoEnemigo();
            }
        }
        // Determina el resultado del combate
        if (jugador.estaVivo()) {
            System.out.println("¡Ganaste la ronda!");
        } else {
            System.out.println("GAME OVER");
        }
    }
    // Método para calcular el daño basado en la descripción del ataque.
    //formato de la descripción (ejemplo): "Ataque con Espada - 15 de daño"
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
    // Método para manejar el turno del jugador, permitiendo seleccionar la acción a realizar.
    private void turnoJugador() {
        System.out.println("Elige tu acción: 1-Golpear, 2-Defender, 3-Poder Especial, 4-Usar Arma 5.-Usar Pocion de Vida 6.- Usar Pocion de Ataque");
        int eleccion = scanner.nextInt();
        String resultado;
    
        switch (eleccion) {
            case 1: // Golpear
                resultado = jugador.atacar();
                System.out.println(resultado);
                enemigo.recibirDano(danoDesdeAccion(resultado));
                break;
            case 2: // Defender
                resultado = jugador.defender();
                System.out.println(resultado);
                //falta implementar la defensa, solo dice que te defiendes
                //pero el enemigo te hace daño igual
                break;
            case 3: // Poder Especial
                resultado = jugador.poderEspecial();
                System.out.println(resultado);
                if (!resultado.contains("¡No has alcanzado")) {
                    enemigo.recibirDano(danoDesdeAccion(resultado));
                }
                break;
            case 4: // Usar Arma
                resultado = jugador.usarArma();
                System.out.println(resultado);
                if (!resultado.contains("¡No has alcanzado")) {
                    enemigo.recibirDano(danoDesdeAccion(resultado));
                }
                break;
            case 5:
                if (!pocionDeVidaUsada) {
                    Pocion pocionVida = new PocionVida(10);  // Suponemos que 50 es la cantidad de curación.
                    pocionVida.efectoPocion(jugador);
                    pocionDeVidaUsada = true;
                } else {
                    System.out.println("Ya has usado la poción de vida en este combate.");
                }
                /*if (!resultado.contains("¡No has alcanzado")) {
                    enemigo.recibirDano(danoDesdeAccion(resultado));
                }*/
                break;
            case 6:
                if(!pocionDeAtaqueUsada){
                    Pocion pocion = PocionFactory.crearPocion("dano", 20);
                    if (pocion != null) {
                        pocion.efectoPocion(jugador);
                        pocionDeAtaqueUsada = true;
                    }
                } else {
                    System.out.println("Ya has usado la poción de ataque en este combate.");
                }
                /*if (!resultado.contains("¡No has alcanzado")) {
                    enemigo.recibirDano(danoDesdeAccion(resultado));
                }*/
                break;
            default:
                System.out.println("Opción inválida, pierdes tu turno.");
                break;
        }
    }
    // Método para manejar el turno del enemigo, determinando aleatoriamente la acción a realizar.
    private void turnoEnemigo() {
        int accion = new Random().nextInt(3) + 1;
        System.out.println("Es el turno del enemigo.");
        String resultado;
    
        switch (accion) {
            case 1: // Golpear
                resultado = enemigo.atacar();
                System.out.println("Enemigo golpea: " + resultado);
                jugador.recibirDano(danoDesdeAccion(resultado));
                break;
            case 2: // Defender
                System.out.println("Enemigo se defiende.");
                //falta implementar la defensa, solo dice que se defiende
                //pero le haces daño igual
                break;
            case 3: // Poder Especial
                resultado = enemigo.poderEspecial();
                System.out.println("Enemigo usa poder especial: " + resultado);
                jugador.recibirDano(danoDesdeAccion(resultado));
                break;
        }
    }
}