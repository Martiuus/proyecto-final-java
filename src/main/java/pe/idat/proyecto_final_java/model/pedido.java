package pe.idat.proyecto_final_java.model;

import java.time.LocalDate;

public class pedido {
    private int idPedido;
    private int ordenFinalId;
    private int clienteId;
    private LocalDate fecha;

    public pedido(){
    }

    public pedido(int idPedido, int ordenFinalId, int clienteId, LocalDate fecha) {
        this.idPedido = idPedido;
        this.ordenFinalId = ordenFinalId;
        this.clienteId = clienteId;
        this.fecha = fecha;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getOrdenFinalId() {
        return ordenFinalId;
    }

    public void setOrdenFinalId(int ordenFinalId) {
        this.ordenFinalId = ordenFinalId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
