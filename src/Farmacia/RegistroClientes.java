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
public class RegistroClientes {
    int cod=1;
    private ArrayList<Empresa> empresas = new ArrayList<Empresa>();
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public RegistroClientes() {
    }

    public void agregarEmpresa(String ruc, String nombre) {
        Empresa e = new Empresa(ruc, nombre, codigoCliente());
        empresas.add(e);
        cod++;
    }

    public void agregarPersona(String dni, String nombre) {
        Persona e = new Persona(dni, nombre, codigoCliente());
        personas.add(e);
        cod++;
    }

    public Empresa buscarEmpresa(String ruc) {

        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).getRuc().equals(ruc)) {
                return empresas.get(i);
            }
        }
        return null;
    }

    public Persona buscarPersona(String dni) {

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                return personas.get(i);
            }
        }
        return null;
    }
    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    public String codigoCliente() {
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
    
    
}
