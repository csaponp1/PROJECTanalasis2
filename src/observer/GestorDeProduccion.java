
package observer;

/**
 *
 * @author DELL
 */

import model.Producto;
import java.util.ArrayList;
import java.util.List;

public class GestorDeProduccion {
    private final List<Observer> observadores = new ArrayList<>();

    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(String mensaje) {
        for (Observer observador : observadores) {
            observador.actualizar(mensaje);
        }
    }

    public void producirProducto(Producto producto) {
        // Lógica de producción
        System.out.println(producto.getClass().getSimpleName() + " producido.");
        notificarObservadores("Producción completada: " + producto.getClass().getSimpleName());
    }
}
