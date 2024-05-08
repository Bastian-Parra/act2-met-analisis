public class TrajeMagico extends Armadura {
    public TrajeMagico(String nombre, int defensa) {
        this.defensa = defensa;
        this.tipo = "Magico";
        this.nombre = nombre;
    }

    @Override
    public String getDescripcion() {
        return nombre + ", Defensa: " + defensa;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}