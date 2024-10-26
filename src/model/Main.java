
package model;

/**
 *
 * @author DELL
 */

import factory.ProductoFactory;
import observer.GestorDeProduccion;
import observer.GestorDeInventario;
import observer.GestorDePedidos;
import observer.ResponsableDeCompras;
import java.util.Scanner;
import model.vista.principal;

public class Main {
    public static void main(String[] args) {
        principal inicio = new principal();
        inicio.show();
        GestorDeProduccion gestorDeProduccion = new GestorDeProduccion();
        GestorDeInventario gestorDeInventario = new GestorDeInventario();
        GestorDePedidos gestorDePedidos = new GestorDePedidos(); // Crear instancia del Gestor de Pedidos
        ResponsableDeCompras responsable = new ResponsableDeCompras();

        gestorDeProduccion.agregarObservador(responsable);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Crear Camisa");
            System.out.println("2. Crear Pantalón");
            System.out.println("3. Realizar Pedido");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Mostrar Pedidos");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    Producto camisa = ProductoFactory.crearProducto("camisa");
                    gestorDeProduccion.producirProducto(camisa);
                    gestorDeInventario.agregarProducto(camisa);
                }
                case 2 -> {
                    Producto pantalon = ProductoFactory.crearProducto("pantalon");
                    gestorDeProduccion.producirProducto(pantalon);
                    gestorDeInventario.agregarProducto(pantalon);
                }
                case 3 -> {
                    System.out.print("Ingrese el nombre del producto a pedir: ");
                    String producto = scanner.next(); // nombre del producto
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt(); // cantidad a pedir
                    gestorDePedidos.realizarPedido(producto, cantidad); // Llamada al Gestor de Pedidos
                }
                case 4 -> gestorDeInventario.mostrarInventario();
                case 5 -> gestorDePedidos.mostrarPedidos(); // Mostrar pedidos realizados
                case 6 -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}

