public class RestriccionReembolsos implements Restricciones {
    private String condicion;

    @Override
    public void añadirRestriccion(String descripcion) {
        this.condicion = descripcion;
        System.out.println("Restricción de reembolso añadida: " + descripcion);
    }

    public void gestionarReembolsos() {
        System.out.println("Reembolso gestionado bajo la condición: " + condicion);
    }
}
