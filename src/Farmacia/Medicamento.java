
package Farmacia;




public class Medicamento {
    private String nombre;
    private final String codigo;
    private float precio;
    private String marca;
    private int cantidad;    
    private int fVencimiento;
    private int fIngreso;

    public Medicamento(String nombre, String codigo, float precio, String marca, int cantidad, int fVencimiento, int fIngreso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.marca = marca;
        this.fVencimiento = fVencimiento;
        this.cantidad = cantidad;
        this.fIngreso = fIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(int fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(int fIngreso) {
        this.fIngreso = fIngreso;
    }
    
    
}
