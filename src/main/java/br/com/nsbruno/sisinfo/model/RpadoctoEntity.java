package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "RPADOCTO")
public class RpadoctoEntity {

    @Id
    @Column(name = "ID_RPADOCTO", table = "RPADOCTO", nullable = false)
    private Integer idRpadocto;

    @Basic(optional = false)
    @Column(name = "ID_RPAFATUR", table = "RPADOCTO", nullable = false)
    private int idRpafatur;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "RPADOCTO")
    private Integer idAeaentra;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPADOCTO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPADOCTO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPADOCTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPADOCTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPADOCTO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "RPADOCTO", nullable = false)
    private int sequencia;

    @Basic(optional = false)
    @Column(name = "VL_ANEXADO", table = "RPADOCTO", nullable = false)
    private double vlAnexado;

    public Integer getIdRpadocto() {
        return idRpadocto;
    }

    public void setIdRpadocto(Integer idRpadocto) {
        this.idRpadocto = idRpadocto;
    }

    public int getIdRpafatur() {
        return idRpafatur;
    }

    public void setIdRpafatur(int idRpafatur) {
        this.idRpafatur = idRpafatur;
    }

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUsCad() {
        return usCad;
    }

    public void setUsCad(String usCad) {
        this.usCad = usCad;
    }

    public Date getDtCad() {
        return dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getCtInteg() {
        return ctInteg;
    }

    public void setCtInteg(Integer ctInteg) {
        this.ctInteg = ctInteg;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getVlAnexado() {
        return vlAnexado;
    }

    public void setVlAnexado(double vlAnexado) {
        this.vlAnexado = vlAnexado;
    }

}