
package observer;

/**
 *
 * @author DELL
 */


import model.Producto;
import java.util.ArrayList;
import java.util.List;

public class GestorDeInventario {
    private final List<Producto> productos = new ArrayList<>();
    private int cantidadMateriaPrima = 100;

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al inventario: " + producto.getClass().getSimpleName());
    }

    public void removerProducto(Producto producto) {
        if (productos.remove(producto)) {
            System.out.println("Producto removido del inventario: " + producto.getClass().getSimpleName());
        } else {
            System.out.println("El producto no se encontró en el inventario.");
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario de productos:");
        for (Producto p : productos) {
            System.out.println("- " + p.getClass().getSimpleName());
        }
    }

    public void setCantidadMateriaPrima(int cantidad) {
        this.cantidadMateriaPrima = cantidad;
    }

    public int getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }
}

    

