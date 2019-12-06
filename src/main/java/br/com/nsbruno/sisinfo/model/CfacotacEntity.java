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
@Table(name = "CFACOTAC")
public class CfacotacEntity {

    @Id
    @Column(name = "ID_CFACOTAC", table = "CFACOTAC", nullable = false)
    private Integer idCfacotac;

    @Basic(optional = false)
    @Column(name = "ID_CFAMOEDA", table = "CFACOTAC", nullable = false)
    private int idCfamoeda;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFACOTAC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFACOTAC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFACOTAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFACOTAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFACOTAC")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DATA", table = "CFACOTAC", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "CFACOTAC", nullable = false)
    private double valor;

    public Integer getIdCfacotac() {
        return idCfacotac;
    }

    public void setIdCfacotac(Integer idCfacotac) {
        this.idCfacotac = idCfacotac;
    }

    public int getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(int idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}