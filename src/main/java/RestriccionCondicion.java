public class RestriccionCondicion implements Restricciones {
    private String condicion;

    @Override
    public void añadirRestriccion(String descripcion) {
        this.condicion = descripcion;
        System.out.println("Restricción de condición añadida: " + descripcion);
    }

    public void validarCondicion() {
        System.out.println("Validando condición específica: " + condicion);
    }
}
