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
@Table(name = "CCASALAP")
public class CcasalapEntity {

    @Id
    @Column(name = "ID_CCASALAP", table = "CCASALAP", nullable = false)
    private Integer idCcasalap;

    @Basic
    @Column(name = "ID_CCAESCLA", table = "CCASALAP")
    private Integer idCcaescla;

    @Basic
    @Column(name = "ID_CCACONCU", table = "CCASALAP")
    private Integer idCcaconcu;

    @Basic
    @Column(name = "US_CAD", table = "CCASALAP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CCASALAP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CCASALAP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CCASALAP")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CCASALAP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "LUGARES", table = "CCASALAP")
    private Integer lugares;

    @Basic
    @Column(name = "CODIGO", table = "CCASALAP")
    private Integer codigo;

    public Integer getIdCcasalap() {
        return idCcasalap;
    }

    public void setIdCcasalap(Integer idCcasalap) {
        this.idCcasalap = idCcasalap;
    }

    public Integer getIdCcaescla() {
        return idCcaescla;
    }

    public void setIdCcaescla(Integer idCcaescla) {
        this.idCcaescla = idCcaescla;
    }

    public Integer getIdCcaconcu() {
        return idCcaconcu;
    }

    public void setIdCcaconcu(Integer idCcaconcu) {
        this.idCcaconcu = idCcaconcu;
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getLugares() {
        return lugares;
    }

    public void setLugares(Integer lugares) {
        this.lugares = lugares;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}