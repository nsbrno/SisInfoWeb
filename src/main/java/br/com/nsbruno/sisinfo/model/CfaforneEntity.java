package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CFAFORNE")
public class CfaforneEntity {

    @Id
    @Column(name = "ID_CFAFORNE", table = "CFAFORNE", nullable = false)
    private Integer idCfaforne;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO_FORNE", table = "CFAFORNE", nullable = false)
    private int idCfaclifoForne;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFAFORNE", nullable = false)
    private int idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAFORNE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAFORNE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAFORNE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAFORNE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAFORNE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "VOLUME_COMPRA", table = "CFAFORNE", nullable = false)
    private double volumeCompra;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CFAFORNE")
    private byte[] complemento;

    public Integer getIdCfaforne() {
        return idCfaforne;
    }

    public void setIdCfaforne(Integer idCfaforne) {
        this.idCfaforne = idCfaforne;
    }

    public int getIdCfaclifoForne() {
        return idCfaclifoForne;
    }

    public void setIdCfaclifoForne(int idCfaclifoForne) {
        this.idCfaclifoForne = idCfaclifoForne;
    }

    public int getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public double getVolumeCompra() {
        return volumeCompra;
    }

    public void setVolumeCompra(double volumeCompra) {
        this.volumeCompra = volumeCompra;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

}