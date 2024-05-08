public class Espada extends Arma {
    public Espada(String nombre, int danio, String tipo) {
        this.nombre = nombre;
        this.danio = danio;
        this.tipo = tipo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getDanio() {
        return danio;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getDescripcion() {
        return "Espada " + nombre + ", Daño: " + danio;
    }
}
