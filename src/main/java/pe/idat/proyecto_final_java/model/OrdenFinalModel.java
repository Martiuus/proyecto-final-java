package pe.idat.proyecto_final_java.model;

import java.time.LocalDate;

public class OrdenFinalModel {
    private Integer idordenfinal;
    private Integer clienteid;
    private LocalDate fechaordenfinal;
    private String estadoordenfinal;
    private Double totalordenfinal;

    public OrdenFinalModel(){
    }

    public Integer getIdordenfinal() {
        return idordenfinal;
    }

    public void setIdordenfinal(Integer idordenfinal) {
        this.idordenfinal = idordenfinal;
    }

    public Integer getClienteid() {
        return clienteid;
    }

    public void setClienteid(Integer clienteid) {
        this.clienteid = clienteid;
    }

    public LocalDate getFechaordenfinal() {
        return fechaordenfinal;
    }

    public void setFechaordenfinal(LocalDate fechaordenfinal) {
        this.fechaordenfinal = fechaordenfinal;
    }

    public String getEstadoordenfinal() {
        return estadoordenfinal;
    }

    public void setEstadoordenfinal(String estadoordenfinal) {
        this.estadoordenfinal = estadoordenfinal;
    }

    public Double getTotalordenfinal() {
        return totalordenfinal;
    }

    public void setTotalordenfinal(Double totalordenfinal) {
        this.totalordenfinal = totalordenfinal;
    }
}
