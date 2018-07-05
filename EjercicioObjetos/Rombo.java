package ejercicioobjetos;

/**
 *
 * @author pablo
 */
public class Rombo extends Paralelogramo{
    
    @Override
    public void pintar() {
        System.out.println(this.getClass().getSimpleName());
    }
    
    @Override
    public String getTipo() {
        return tipo;
    }
}
