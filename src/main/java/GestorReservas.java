import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private List<Reserva> reservas = new ArrayList<>();

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva añadida!");
    }

    public void borrarReserva(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("Reserva eliminada.");
    }

    public void notificarReservas(String estado) {
        for (Reserva reserva : reservas) {
            reserva.notifyObservers(estado);
        }
    }
}
