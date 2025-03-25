package pe.idat.proyecto_final_java.model;

import java.time.LocalDate;

public class OrdenFinalModel {
    private int idOrdenFinal;
    private int clienteId;
    private LocalDate fechaOrdenFinal;
    private String estadoOrdenFinal;
    private double totalOrdenFinal;

    public OrdenFinalModel(){
    }

    public OrdenFinalModel(int idOrdenFinal, int clienteId, LocalDate fechaOrdenFinal, String estadoOrdenFinal, double totalOrdenFinal) {
        this.idOrdenFinal = idOrdenFinal;
        this.clienteId = clienteId;
        this.fechaOrdenFinal = fechaOrdenFinal;
        this.estadoOrdenFinal = estadoOrdenFinal;
        this.totalOrdenFinal = totalOrdenFinal;
    }

    public int getIdOrdenFinal() {
        return idOrdenFinal;
    }

    public void setIdOrdenFinal(int idOrdenFinal) {
        this.idOrdenFinal = idOrdenFinal;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getFechaOrdenFinal() {
        return fechaOrdenFinal;
    }

    public void setFechaOrdenFinal(LocalDate fechaOrdenFinal) {
        this.fechaOrdenFinal = fechaOrdenFinal;
    }

    public String getEstadoOrdenFinal() {
        return estadoOrdenFinal;
    }

    public void setEstadoOrdenFinal(String estadoOrdenFinal) {
        this.estadoOrdenFinal = estadoOrdenFinal;
    }

    public double getTotalOrdenFinal() {
        return totalOrdenFinal;
    }

    public void setTotalOrdenFinal(double totalOrdenFinal) {
        this.totalOrdenFinal = totalOrdenFinal;
    }
}
