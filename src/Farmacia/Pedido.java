package Farmacia;

import java.util.ArrayList;

public class Pedido {

    private float total=0;
    private String cliente;
    String nombreC;
    String docC;

    ArrayList<String> detalles = new ArrayList<String>();

    private Empleado empleado;

    private ArrayList<String> medicamentoString = new ArrayList<String>();
    private ArrayList<Medicamento> medicamento = new ArrayList<Medicamento>();
    int c=0;
    private Venta venta;

    public Pedido(Empleado empleado) {
        this.empleado = empleado;
    }

    //La promocion es parte de un pedido y no puede ser aplicada sin este
    public class Promocion {

        private float descuento = 0.3f;
        public void aplicarDescuento() {
            
        }
    }

    //Pedido puede o no generar una Venta
    public void realizarVenta(Pedido pedido, float tiempo, boolean tipoDePago) {
        venta = new Venta(pedido, tiempo, tipoDePago);
        venta.generarComprobante(pedido.empleado.getSedeFarmacia(), tipoDePago);

        venta.registrarVenta();
    }

    public void obtenerCliente(String doc, boolean t, RegistroClientes rClientes) {
        if (t) {
            nombreC = rClientes.buscarEmpresa(doc).getNombre();
            docC = rClientes.buscarEmpresa(doc).getRuc();
        } else {
            nombreC = rClientes.buscarPersona(doc).getNombre();
            docC = rClientes.buscarPersona(doc).getDni();
        }
    }

    public void agregarProducto(String codigoM) {
        medicamento.add(empleado.getSedeFarmacia().getInventario().buscarMedicamento(codigoM));
        total=total+empleado.getSedeFarmacia().getInventario().buscarMedicamento(codigoM).getPrecio();
        medicamentoString.add(empleado.getSedeFarmacia().getInventario().buscarMedicamento(codigoM).getNombre() + ":  " + empleado.getSedeFarmacia().getInventario().buscarMedicamento(codigoM).getPrecio());
        c++;
        detalles.add(empleado.getSedeFarmacia().getInventario().buscarMedicamento(codigoM).getNombre() + ":  " + empleado.getSedeFarmacia().getInventario().buscarMedicamento(codigoM).getPrecio());
        empleado.getSedeFarmacia().getInventario().eliminarMedicamento(codigoM);
    }

    /**
     * Elimina el ultimo producto ingresado
     */
    public void eliminarProducto() {
        detalles.remove(medicamentoString.get(c-1));
        empleado.getSedeFarmacia().getInventario().añadirMedicamento(medicamento.get(c-1).getNombre(), medicamento.get(c-1).getCodigo(), medicamento.get(c-1).getPrecio(), medicamento.get(c-1).getMarca(), 1, medicamento.get(c-1).getfVencimiento(), medicamento.get(c-1).getfIngreso());
        total=total-medicamento.get(c-1).getPrecio();
        medicamentoString.remove(c-1);
        medicamento.remove(c-1);
        c--;
    }

    public void mostrarCarrito() {

    }

    public ArrayList<String> getDetalles() {
        return detalles;
    }
    

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Venta getVenta() {
        return venta;
    }

    public String getNombreC() {
        return nombreC;
    }

    public String getDocC() {
        return docC;
    }

}
