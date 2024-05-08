/*
 * interfaz de estado de ataque
 * que sirve para implementar el cambio dinámico de 
 * comportamiento de ataque en los luchadores
 
 */
public interface EstadoAtaque {
    /*
     * Método atacar que todos los estados concretos deben implementar.
     * Este método se encarga de ejecutar el ataque correspondiente al estado actual y debe devolver una descripción del ataque realizado.
     * Recibe como parámetro un objeto de tipo luchador, que representa el luchador que está realizando el ataque.
     * Esto permite que el estado acceda a métodos y propiedades del luchador para realizar operaciones como modificar el contador de ataques,
     * cambiar el estado del luchador, o simplemente ejecutar el ataque y devolver una descripción del mismo.
     */
    String atacar(Luchador luchador);
}
