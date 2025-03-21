package pe.idat.proyecto_final_java.model;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class entradas {
    private int idEntradas;
    private int productoId;
    private int proveedorId;
    private int cantidad;
    private LocalDate fechaEntrada;
    private int usuarioId;

    public entradas(){
    }

    public entradas(int idEntradas, int productoId, int proveedorId, int cantidad, LocalDate fechaEntrada, int usuarioId) {
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
