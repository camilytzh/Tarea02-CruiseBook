public abstract class Cabina {
    protected String tipo;
    protected String estado;

    public Cabina(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public abstract String obtenerDescripcion();
}
