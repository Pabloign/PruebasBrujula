package ejercicioobjetos;

/**
 *
 * @author pablo
 */
public class Triangulo extends Figura {
    
    private String tipo;

    public Triangulo() {
        this.tipo = "Triangulo";
    }
    
    @Override
    public void pintar() {
        System.out.println(this.getClass().getSimpleName());
    }

    public String getTipo() {
        return tipo;
    }
    
}
