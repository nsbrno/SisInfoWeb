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
@Table(name = "CFAHOBYS")
public class CfahobysEntity {

    @Id
    @Column(name = "ID_CFAHOBYS", table = "CFAHOBYS", nullable = false)
    private Integer idCfahobys;

    @Basic
    @Column(name = "ID_CFACONTA", table = "CFAHOBYS")
    private Integer idCfaconta;

    @Basic(optional = false)
    @Column(name = "ID_CFAHOBBY", table = "CFAHOBYS", nullable = false)
    private int idCfahobby;

    @Basic
    @Column(name = "ID_CFADEPEN", table = "CFAHOBYS")
    private Integer idCfadepen;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFAHOBYS")
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAHOBYS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAHOBYS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAHOBYS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAHOBYS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAHOBYS")
    private Integer ctInteg;

    public Integer getIdCfahobys() {
        return idCfahobys;
    }

    public void setIdCfahobys(Integer idCfahobys) {
        this.idCfahobys = idCfahobys;
    }

    public Integer getIdCfaconta() {
        return idCfaconta;
    }

    public void setIdCfaconta(Integer idCfaconta) {
        this.idCfaconta = idCfaconta;
    }

    public int getIdCfahobby() {
        return idCfahobby;
    }

    public void setIdCfahobby(int idCfahobby) {
        this.idCfahobby = idCfahobby;
    }

    public Integer getIdCfadepen() {
        return idCfadepen;
    }

    public void setIdCfadepen(Integer idCfadepen) {
        this.idCfadepen = idCfadepen;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
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

}