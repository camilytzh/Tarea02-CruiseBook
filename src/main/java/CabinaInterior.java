public class CabinaInterior extends Cabina{
    public CabinaInterior(String tipo, String estado) {
        super(tipo, estado);
    }

    @Override
    public String obtenerDescripcion() {
        return "Cabina interior, estado: " + estado;
    }
}
