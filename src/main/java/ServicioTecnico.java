import java.util.Scanner;

public class ServicioTecnico extends Entidad implements SolucionReporteChain {

    private SolucionReporteChain solucion;

    public ServicioTecnico(int cedula, String nombre, int edad) {
        super(cedula, nombre, edad);
    }

    public void procesarReporte() {
        Scanner sc = new Scanner(System.in);

        System.out.println("*Solucion del problema por Servicio Tecnico*");

        System.out.println("Esta satisfecho con la solucion? ");
    
        String input = sc.nextLine();

        sc.close();

        if (input.equalsIgnoreCase("S")) {
            
            System.out.println("Gracias por su paciencia y espero haya sido de ayuda");

        }else{

            this.solucion.procesarReporte();

        }

    }

    public void setNextChain(SolucionReporteChain nextChain){

        this.solucion = nextChain;

    }

}
