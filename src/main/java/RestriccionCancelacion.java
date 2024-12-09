public class RestriccionCancelacion implements Restricciones {
    private String condicion;

    @Override
    public void añadirRestriccion(String descripcion) {
        this.condicion = descripcion;
        System.out.println("Restricción de cancelación añadida: " + descripcion);
    }

    public void gestionarCancelacion() {
        System.out.println("Gestionando cancelación con condición: " + condicion);
    }
}
