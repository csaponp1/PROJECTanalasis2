
package command;

/**
 *
 * @author DELL
 */


import model.GestorDeInventario;

public class AgregarProductoCommand implements Command {
    private final GestorDeInventario inventario;
    private final int cantidad;

    public AgregarProductoCommand(int cantidad) {
        this.inventario = GestorDeInventario.obtenerInstancia();
        this.cantidad = cantidad;
    }

    @Override
    public void ejecutar() {
        inventario.agregarProductoTerminado(cantidad);
        System.out.println("Se agregaron " + cantidad + " productos al inventario.");
    }

    @Override
    public void deshacer() {
        inventario.agregarProductoTerminado(-cantidad);
        System.out.println("Se removieron " + cantidad + " productos del inventario.");
    }
}

    