import java.util.ArrayList;
import java.util.List;

public class Reserva {
    
 private List<Observer> cabinasReservadasObserver = new ArrayList<>();

    public void addObserver(Observer observer) {
        cabinasReservadasObserver.add(observer);
    }

    public void removeObserver(Observer observer) {
        cabinasReservadasObserver.remove(observer);
    }

    public void notifyObservers(String estado) {
        for (Observer observer : cabinasReservadasObserver) {
            observer.update(estado);
        }
    }

}
