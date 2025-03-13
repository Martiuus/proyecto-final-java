package pe.idat.proyecto_final_java.model;

import java.time.LocalDate;

public class lote {
    private int idLote;
    private int productoId;
    private int cantidad;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;

    public lote(){
    }

    public lote(int idLote, int productoId, int cantidad, LocalDate fechaIngreso, LocalDate fechaSalida) {
        this.idLote = idLote;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
