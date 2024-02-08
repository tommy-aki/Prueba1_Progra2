package prueba1;
import java.util.Calendar;

public abstract class MovieItem extends BlockBusterItem{
    
    public MovieItem(int codigo, String nombre, double precioRenta, String estado) {
        super(codigo, nombre, precioRenta);
        estado="ESTRENO";
    }
    
    public String toString(){
        return super.toString()+"- Movie";
    }
    
    public double pagoRenta(int dias,String estado){
        if(estado.equalsIgnoreCase(ESTRENO)&&dias>)
    }
    
    public boolean evaluarEstado(){
         fechaAdicion = getInstance();
        Calendar fechaActual=Calendar.getInstance();

        if (mesesDiferencia >= 5 && estado.equals("ESTRENO")) {
            estado = "NORMAL";
        }
    }
}
