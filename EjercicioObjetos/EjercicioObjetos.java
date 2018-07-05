package ejercicioobjetos;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class EjercicioObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura> lstFiguras = new ArrayList<>();
        
        lstFiguras.add(new Triangulo());
        lstFiguras.add(new Cuadrado());
        lstFiguras.add(new Triangulo());
        lstFiguras.add(new Cuadrado());
        lstFiguras.add(new Rombo());
        
        for (Figura figura : lstFiguras) {
            if (figura.getTipo().equals("Paralelogramo")) {
                figura.pintar();
            }
        }
        
        for (Figura figura : lstFiguras) {
            if (figura.getTipo().equals("Triangulo")) {
                figura.pintar();
            }
        }
    }
    
}
