public class Baston extends Arma {
    public Baston(String nombre, int danio, String tipo) {
        this.nombre = nombre;
        this.danio = danio;
        this.tipo = tipo;
    }

    @Override
    public String getDescripcion() {
        return "Baston: " + nombre + ", Daño: " + danio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public int getDanio() {
        return danio;
    }
}
