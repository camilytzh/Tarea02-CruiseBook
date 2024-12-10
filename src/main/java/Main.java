public class Main {
    public static void main(String[] args) {

        //Uso de Factory Method para creación de cabinas

        System.out.println("CREACION DE CABINAS");
        System.out.println();

        CabinaFactory suiteFactory = new SuiteFactory();
        CabinaFactory balconFactory = new CabinaBalconFactory();
        CabinaFactory interiorFactory = new CabinaInteriorFactory();
        CabinaFactory familiarFactory = new CabinaFamiliarFactory();

        Cabina suite = suiteFactory.crearCabina("Suite", "Disponible");
        Cabina cabinaBalcon = balconFactory.crearCabina("Cabina con Balcón", "Disponible");
        Cabina cabinaInterior = interiorFactory.crearCabina("Cabina Interior", "Ocupada");
        Cabina cabinaFamiliar = familiarFactory.crearCabina("Cabina Familiar", "Ocupada");

        System.out.println(suite.obtenerDescripcion());
        System.out.println(cabinaBalcon.obtenerDescripcion());
        System.out.println(cabinaInterior.obtenerDescripcion());
        System.out.println(cabinaFamiliar.obtenerDescripcion());
        System.out.println();

        //Uso de Observer para gestión de las cabinas

        System.out.println("GESTION DE CABINAS");
        System.out.println();

        GestorEstadoCabina gestorCabinas = new GestorEstadoCabina();
        gestorCabinas.agregarCabina(suite);
        gestorCabinas.agregarCabina(cabinaBalcon);
        gestorCabinas.agregarCabina(cabinaInterior);

        System.out.println("Notificando estado: 'Ocupada'");
        gestorCabinas.notificar("Ocupada");

        gestorCabinas.borrarCabina(cabinaBalcon);
        System.out.println("Notificando estado: 'Disponible'");
        gestorCabinas.notificar("Disponible");
        System.out.println();

        //Uso de Strategy para la gestión de restricciones

        System.out.println("GESTION DE RESTRICCIONES");
        System.out.println();

        RestriccionCancelacion restriccionCancelacion = new RestriccionCancelacion();
        RestriccionReprogramacion restriccionReprogramacion = new RestriccionReprogramacion();
        RestriccionReembolsos restriccionReembolsos = new RestriccionReembolsos();

        restriccionCancelacion.añadirRestriccion("Cancelación permitida hasta 24 horas antes del viaje.");
        restriccionCancelacion.gestionarCancelacion();

        restriccionReprogramacion.añadirRestriccion("Reprogramación gratuita hasta 48 horas antes del viaje.");
        restriccionReprogramacion.gestionarServicioCliente();

        restriccionReembolsos.añadirRestriccion("Reembolso total solo hasta 10 días antes del viaje.");
        restriccionReembolsos.gestionarReembolsos();
    }
}
