
/**
 *
 * @author DELL
 */

    
    package factory;


import model.Camisa;
import model.Pantalon;
import model.Producto;

public class ProductoFactory {
    public static Producto crearProducto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "camisa" -> {
                return new Camisa();  // Devuelve una instancia de Camisa
            }
            case "pantalon" -> {
                return new Pantalon(); // Devuelve una instancia de Pantalon
            }
            default -> throw new IllegalArgumentException("Tipo de producto no reconocido: " + tipo);
        }
    }
}



    

