/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farmacia;

import java.util.ArrayList;

/**
 *
 * @author Diego Sullon
 */
public class RegistroVentas {
    private ArrayList<Venta>ventas = new ArrayList<Venta>();
    
    public void registrar(Venta venta){
        ventas.add(venta);
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    
}
