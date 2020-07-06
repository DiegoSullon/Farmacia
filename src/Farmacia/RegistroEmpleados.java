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
class RegistroEmpleados {
    int n_empleados;
    
    
    ArrayList<Empleado>empleados = new ArrayList<Empleado>();
    
    
    

    public RegistroEmpleados() {
    }
    /**
     * agrega empleado
     * @param cargo, dni
    */  
    public void agregarEmpleado(String dni, String cargo, String nombre, String telefono, String correo, boolean genero, float sueldo, Farmacia sedeFarmacia){
        Empleado e = new Empleado(dni,cargo,nombre,telefono,correo,genero, sueldo, sedeFarmacia);                
        empleados.add(e);        
    }
    public void eliminarEmpleado(String cod){
        for(int i=0;i<empleados.size();i++){
             if(empleados.get(i).getDni().equals(cod)){
               empleados.remove(i);
             }
         }
    }
   public void actualizarDatos(String cod){
   }
    public void mostrarEmpleados(){
        for(int i=0;i<empleados.size();i++){
            System.out.println(empleados.get(i).getDni());
    }
   }
    public Empleado obtenerEmpleado(String dni){
        for(int i=0;i<empleados.size();i++){
             if(empleados.get(i).getDni().equals(dni)){
               return empleados.get(i);
             }
         }
        return null;
   }
    
}
