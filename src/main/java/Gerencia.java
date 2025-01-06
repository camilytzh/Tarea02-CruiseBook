import java.util.Scanner;

public class Gerencia extends Entidad {
    private String telefono;
    private SolucionReporteChain solucion;

    public Gerencia(int cedula, String nombre, String telefono) {
        super(cedula, nombre, 0); 
        this.telefono = telefono;
    }


    public void procesarReporte() {
        Scanner sc = new Scanner(System.in);

        System.out.println("*Solucion del problema por Gerencia del Crusero*");

        System.out.println("Esta satisfecho con la solucion? ");
    
        String input = sc.nextLine();

        sc.close();

        if (input.equalsIgnoreCase("S")) { //La respuesta debe de ser dada en un S/N
            
            System.out.println("Gracias por su paciencia y espero haya sido de ayuda");

        }else{

            this.solucion.procesarReporte();

        }

    }

    public void setNextChain(SolucionReporteChain nextChain){

        this.solucion = nextChain;

    }


}