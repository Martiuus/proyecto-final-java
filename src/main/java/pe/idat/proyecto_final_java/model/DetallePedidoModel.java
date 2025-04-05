package pe.idat.proyecto_final_java.model;

public class DetallePedidoModel {
    private Integer detallepedidoid;
    private Integer pedidoid;
    private Integer productoid;
    private Integer cantidad;
    private Double precio;
    private Double subtotal;

    public Integer getDetallepedidoid() {
        return detallepedidoid;
    }

    public void setDetallepedidoid(Integer detallepedidoid) {
        this.detallepedidoid = detallepedidoid;
    }

    public Integer getPedidoid() {
        return pedidoid;
    }

    public void setPedidoid(Integer pedidoid) {
        this.pedidoid = pedidoid;
    }

    public Integer getProductoid() {
        return productoid;
    }

    public void setProductoid(Integer productoid) {
        this.productoid = productoid;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
