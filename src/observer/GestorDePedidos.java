
package observer;

/**
 *
 * @author DELL
 */
import java.util.HashMap;
import java.util.Map;

public class GestorDePedidos {
    private final Map<String, Integer> pedidos = new HashMap<>();

    public void realizarPedido(String producto, int cantidad) {
        pedidos.put(producto, pedidos.getOrDefault(producto, 0) + cantidad);
        System.out.println("Pedido realizado: " + cantidad + " de " + producto);
    }

    public void mostrarPedidos() {
        System.out.println("Lista de pedidos:");
        for (Map.Entry<String, Integer> entry : pedidos.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

