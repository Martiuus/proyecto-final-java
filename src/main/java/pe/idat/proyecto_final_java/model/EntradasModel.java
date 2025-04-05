package pe.idat.proyecto_final_java.model;

import java.time.LocalDate;

public class EntradasModel {
    private Integer entradaid;
    private Integer productoid;
    private Integer proveedorid;
    private Integer cantidad;
    private LocalDate fecha;
    private Integer usuarioid;

    public Integer getEntradaid() {
        return entradaid;
    }

    public void setEntradaid(Integer entradaid) {
        this.entradaid = entradaid;
    }

    public Integer getProductoid() {
        return productoid;
    }

    public void setProductoid(Integer productoid) {
        this.productoid = productoid;
    }

    public Integer getProveedorid() {
        return proveedorid;
    }

    public void setProveedorid(Integer proveedorid) {
        this.proveedorid = proveedorid;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Integer usuarioid) {
        this.usuarioid = usuarioid;
    }
}
