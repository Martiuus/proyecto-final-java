package pe.idat.proyecto_final_java.model;

import java.time.LocalDate;

public class SalidaModel {
    private int idSalida;
    private int productoId;
    private int cantidad;
    private LocalDate fechaSalida;
    private String motivo;
    private int usuarioId;

    public SalidaModel(){
    }

    public SalidaModel(int idSalida, int productoId, int cantidad, LocalDate fechaSalida, String motivo, int usuarioId) {
        this.idSalida = idSalida;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.fechaSalida = fechaSalida;
        this.motivo = motivo;
        this.usuarioId = usuarioId;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
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

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}
