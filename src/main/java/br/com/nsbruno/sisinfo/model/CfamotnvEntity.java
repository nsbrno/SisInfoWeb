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
@Table(name = "CFAMOTNV")
public class CfamotnvEntity {

    @Id
    @Column(name = "ID_CFAMOTNV", table = "CFAMOTNV", nullable = false)
    private Integer idCfamotnv;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFAMOTNV", nullable = false)
    private int idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_CFAMOTIV", table = "CFAMOTNV", nullable = false)
    private int idCfamotiv;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAMOTNV", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAMOTNV", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAMOTNV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAMOTNV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAMOTNV")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_VISITA", table = "CFAMOTNV", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVisita;

    public Integer getIdCfamotnv() {
        return idCfamotnv;
    }

    public void setIdCfamotnv(Integer idCfamotnv) {
        this.idCfamotnv = idCfamotnv;
    }

    public int getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public int getIdCfamotiv() {
        return idCfamotiv;
    }

    public void setIdCfamotiv(int idCfamotiv) {
        this.idCfamotiv = idCfamotiv;
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

    public Date getDtVisita() {
        return dtVisita;
    }

    public void setDtVisita(Date dtVisita) {
        this.dtVisita = dtVisita;
    }

}