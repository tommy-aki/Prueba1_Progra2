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
        if(estado.equalsIgnoreCase("ESTRENO")&&dias>2){
            return 50;
        }else if(estado.equalsIgnoreCase("NORMAL")&&dias>5){
            return 30;
        }
        return 0;
    }
    
    public boolean evaluarEstado(String estado){
        Calendar fechaActual=Calendar.getInstance();
        fechaActual.get(Calendar.MONTH);

        if (fechaActual.equals(fechaAdicion.add(Calendar.MONTH, 5)) && estado.equalsIgnoreCase("ESTRENO")) {
            estado = "NORMAL";
            return true;
        }
        return false;
    }
}
