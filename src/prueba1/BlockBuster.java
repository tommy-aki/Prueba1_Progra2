/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

import java.util.ArrayList;

/**
 *
 * @author Tommy Lee Pon
 */
public class BlockBuster {
    private ArrayList<BlockBusterItem> inventario;
    
    public BlockBuster(){
        inventario=new ArrayList();
    }
    
    public BlockBusterItem buscarItem(int codigo, String tipo, int cero){
        if (cero<inventario.size()){
            if(codigo==inventario.get(cero).codigo){
                if(tipo.equalsIgnoreCase("movie") && inventario.get(cero) instanceof MovieItem) {
                    return inventario.get(cero);
                }
                if(tipo.equalsIgnoreCase("game") && inventario.get(cero) instanceof VideoGameItem){
                    return inventario.get(cero);
                }
            }
            return buscarItem(codigo, tipo, cero+1);
        }
        return null;
    }
    
}
