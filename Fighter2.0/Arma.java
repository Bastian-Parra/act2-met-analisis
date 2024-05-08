public abstract class Arma {
    protected String nombre;
    protected int danio;
    protected String tipo; // El tipo puede ser físico (Espadas, Lanzas) o Mágico (Bastones, Varitas)
    
    public abstract String getDescripcion();
    public abstract String getNombre();
    public abstract String getTipo();
    public abstract int getDanio();
}
