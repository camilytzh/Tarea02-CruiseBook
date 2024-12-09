public class Suite extends Cabina{
    public Suite(String tipo, String estado) {
        super(tipo, estado);
    }

    @Override
    public String obtenerDescripcion() {
        return "Suite con estado: " + estado;
    }
}
