
package Farmacia;

import java.util.ArrayList;
import java.util.Date;


public class Venta {
    private final String codigo;
    private static int sumar;
    private float tiempo;
    private boolean tipoDePago;
    private final Date fechaD = new Date();
    private final String fecha;
    
    private final Pedido pedido;
    
    private Factura factura;
    private Boleta boleta;
    
    
    ArrayList<String>detalles=new ArrayList<String>();
    
    public Venta( Pedido pedido, float tiempo, boolean tipoDePago) {
        this.pedido = pedido;
        this.tiempo = tiempo;
        this.tipoDePago = tipoDePago;
        this.fecha=String.valueOf(fechaD);
        sumar++;
        codigo=String.valueOf(sumar);
    }
    public void generarComprobante(Farmacia farmacia, boolean tipoPago){
        
        if(tipoPago){
            factura = new Factura(this,pedido.getEmpleado().getSedeFarmacia(),codigo, pedido.docC);

        }else{
            boleta = new Boleta(this, farmacia, codigo, pedido.docC);

        }
        
    
    }
    
    public void registrarVenta(){
        pedido.getEmpleado().getSedeFarmacia().getR_ventas().registrar(this);
    }
    public String getCodigo() {
        return codigo;
    }

    public Pedido getPedido() {
        return pedido;
    }
    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(boolean tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public Factura getFactura() {
        return factura;
    }

    public Boleta getBoleta() {
        return boleta;
    }
    
    
}
