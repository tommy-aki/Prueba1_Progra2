package prueba1;
import java.util.Calendar;

public abstract class BlockBusterItem {
    protected int codigo;
    protected String nombre;
    protected double precioRenta;
    protected Calendar fechaAdicion;

    public BlockBusterItem(int codigo,String nombre,double precioRenta) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.precioRenta=precioRenta;
        fechaAdicion=Calendar.getInstance();
}

    @Override
    public String toString() {
        return "Codigo=" + codigo + ", nombre=" + nombre + ", precioRenta=" + precioRenta;
    }
    
    public abstract double pagoRenta(int dias);
    
}
    
