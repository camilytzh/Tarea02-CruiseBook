public class RestriccionReprogramacion implements Restricciones {
    private String condicion;

    @Override
    public void añadirRestriccion(String descripcion) {
        this.condicion = descripcion;
        System.out.println("Restricción de reprogramación añadida: " + descripcion);
    }

    public void gestionarServicioCliente() {
        System.out.println("Servicio al cliente está gestionando la reprogramación con condición: " + condicion);
    }
}
