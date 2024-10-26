
package observer;

/**
 *
 * @author DELL
 */

// ResponsableDeCompras implementa Observer
public class ResponsableDeCompras implements Observer {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Responsable de compras ha recibido la actualización: " + mensaje);
    }
}


    
