public class Varita extends Arma {
    public Varita(String nombre, int danio, String tipo ) {
        this.danio = danio;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String getDescripcion() {
        return "Varita: " + nombre + ", Daño: " + danio;
    }

    @Override
    public int getDanio() {
        return danio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
