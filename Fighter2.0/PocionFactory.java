public class PocionFactory {
    public static Pocion crearPocion(String tipo, int cantidad) {

        switch (tipo) {
            case "vida":
                return new PocionVida(cantidad);
            case "dano":
                return new PocionDano(cantidad);
            default:
                System.out.println("Tipo de poción no reconocido: " + tipo);
                return null;
            }

    }
}
