package pe.idat.proyecto_final_java.model;

import java.time.LocalDate;

public class EntradasModel {
    private Integer idEntradas;
    private Integer productoId;
    private Integer proveedorId;
    private Integer cantidad;
    private LocalDate fechaEntrada;
    private Integer usuarioId;

    public EntradasModel(){
    }

    public EntradasModel(int idEntradas, int productoId, int proveedorId, int cantidad, LocalDate fechaEntrada, int usuarioId) {
        this.idEntradas = idEntradas;
        this.productoId = productoId;
        this.proveedorId = proveedorId;
        this.cantidad = cantidad;
        this.fechaEntrada = fechaEntrada;
        this.usuarioId = usuarioId;
    }

    public int getIdEntradas() {
        return idEntradas;
    }

    public void setIdEntradas(int idEntradas) {
        this.idEntradas = idEntradas;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}
