/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farmacia;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Diego Sullon
 */
public class Inventario {
    int cod=1;
    private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
    private ArrayList<Medicamento> enPromocion = new ArrayList<Medicamento>();

    public void añadirMedicamento(String nombre,String codigo, float precio, String marca, int cantidad, int fVencimiento, int fIngreso) {
        boolean t=true;
        for (int i = 0; i < medicamentos.size(); i++){
            if (medicamentos.get(i).getCodigo().equals(codigo)){
                medicamentos.get(i).setCantidad(medicamentos.get(i).getCantidad() + cantidad);
                t=false;
            }
        }
        if(t){
            Medicamento e = new Medicamento(nombre, codigo, precio, marca, cantidad, fVencimiento, fIngreso);
            medicamentos.add(e);
        }
    }

    public void eliminarMedicamento(String med) {
        for (int i = 0; i < medicamentos.size(); i++) {
            if (medicamentos.get(i).getCodigo().equals(med)) {
                medicamentos.get(i).setCantidad(medicamentos.get(i).getCantidad() - 1);
                if (medicamentos.get(i).getCantidad() <= 0) {
                    medicamentos.remove(i);
                }    
            }
        }

    }

    public Medicamento buscarMedicamento(String med) {
        for (int i = 0; i < medicamentos.size(); i++) {
            if (medicamentos.get(i).getCodigo().equals(med)) {
                return medicamentos.get(i);
            }
        }
        return null;
    }

    public void actualizarMedicamento() {
    }

    private void ponerEnPromocion() {
        Date fecha = new Date();
        for (int i = 0; i < medicamentos.size(); i++) {
            if (medicamentos.get(i).getNombre().equals(fecha.getMonth())) {
                medicamentos.get(i).setCantidad(medicamentos.get(i).getCantidad() - 1);
                if (medicamentos.get(i).getCantidad() == 0) {
                    medicamentos.remove(i);
                }
            }
        }
    }
    public String codigoP() {
        String codC="000";
        int length;
        length=String.valueOf(cod).length();
        switch(length){
            case 1:
                codC="00"+String.valueOf(cod);
                break;
            case 2:
                codC="0"+String.valueOf(cod);
                break;
            case 3:
                codC=String.valueOf(cod);
                break;
        }
        return codC;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setEnPromocion(ArrayList<Medicamento> enPromocion) {
        this.enPromocion = enPromocion;
    }
    
    

}
