package pe.idat.proyecto_final_java.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class PedidoModel {
    @Id
    private Integer idpedido;
    private Integer ordenfinalid;
    private Integer clienteid;
    private LocalDate fecha;

    public PedidoModel(){
    }

    public Integer getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public Integer getOrdenfinalid() {
        return ordenfinalid;
    }

    public void setOrdenfinalid(Integer ordenfinalid) {
        this.ordenfinalid = ordenfinalid;
    }

    public Integer getClienteid() {
        return clienteid;
    }

    public void setClienteid(Integer clienteid) {
        this.clienteid = clienteid;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
