/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

import java.util.Calendar;

/**
 *
 * @author Tommy Lee Pon
 */
public class VideoGameItem extends BlockBusterItem{
    private int code;
    private String name;
    private final double RENTA=30;
    private Calendar fecha;
    private String consola;
    public static final String PLAYSTATION="playstation";
    public static final String XBOX="xbox";
    public static final String WII="wii";
    
    
    public VideoGameItem(int codigo, String nombre, double renta, Calendar fecha, String consola){
        super(codigo, nombre, fecha);
        renta=RENTA;
        this.consola=consola;
    }
    
    @Override
    public String toString(){
        return super.toString() + consola + " Game";
    }
    
    @Override
    public double pagoRenta(int dias){
        return dias*RENTA;
    }
}
