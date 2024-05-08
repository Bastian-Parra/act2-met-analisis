public class Lanza extends Arma {
    public Lanza(String nombre, int danio, String tipo) {
        this.danio = danio;
        this.nombre = nombre;
        this.tipo = tipo;
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

    @Override
    public String getDescripcion() {
        return "Lanza: " + nombre + ", Daño: " + danio;
    }
 }
