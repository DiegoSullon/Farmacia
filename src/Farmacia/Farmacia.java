
package Farmacia;



public class Farmacia {
    private String nombre="Farmacia La morgue";
    private String ciudad;
    private String sede;
    private String direccion;
    private String telefono;
    private final String codigo;
    private final String ruc="20566345658";
    
    
    

    
    

    private RegistroVentas rVentas = new RegistroVentas();
    private Inventario inventario = new Inventario();
    
    private RegistroEmpleados r_empleados = new RegistroEmpleados(this);
    
    
    
    
    
    
    public Farmacia(String ciudad, String sede, String direccion, String telefono, String codigo) {
        this.ciudad = ciudad;
        this.sede = sede;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigo=codigo;
    }


    public Empleado login(String dni){
        return r_empleados.obtenerEmpleado(dni);
    }
    public RegistroVentas getR_ventas() {
        return rVentas;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public RegistroEmpleados getR_empleados() {
        return r_empleados;
    }
    
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getRuc() {
        return ruc;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    

}
