
package model;

/**
 *
 * @author DELL
 */

public class GestorDeInventario {

    public static GestorDeInventario obtenerInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int cantidadMateriaPrima = 100; // Ejemplo inicial
    private int inventarioProductos = 0; // Para contar productos terminados

    public void agregarProducto() {
        inventarioProductos++;
        System.out.println("Se agregó un producto al inventario. Total productos: " + inventarioProductos);
    }

    public void removerProducto() {
        if (inventarioProductos > 0) {
            inventarioProductos--;
            System.out.println("Se removió un producto del inventario. Total productos: " + inventarioProductos);
        } else {
            System.out.println("No hay productos en el inventario para remover.");
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario total de productos: " + inventarioProductos);
    }

    public int getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }

    public void setCantidadMateriaPrima(int cantidad) {
        this.cantidadMateriaPrima = cantidad;
    }

    public void agregarProductoTerminado(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    

