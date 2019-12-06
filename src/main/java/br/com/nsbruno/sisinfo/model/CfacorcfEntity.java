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
@Table(name = "CFACORCF")
public class CfacorcfEntity {

    @Id
    @Column(name = "ID_CFACORCF", table = "CFACORCF", nullable = false)
    private Integer idCfacorcf;

    @Basic(optional = false)
    @Column(name = "ID_CFACORES", table = "CFACORCF", nullable = false)
    private int idCfacores;

    @Basic
    @Column(name = "ID_CFACLIFO_CONJ", table = "CFACORCF")
    private Integer idCfaclifoConj;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFACORCF")
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFACORCF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFACORCF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFACORCF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFACORCF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFACORCF")
    private Integer ctInteg;

    public Integer getIdCfacorcf() {
        return idCfacorcf;
    }

    public void setIdCfacorcf(Integer idCfacorcf) {
        this.idCfacorcf = idCfacorcf;
    }

    public int getIdCfacores() {
        return idCfacores;
    }

    public void setIdCfacores(int idCfacores) {
        this.idCfacores = idCfacores;
    }

    public Integer getIdCfaclifoConj() {
        return idCfaclifoConj;
    }

    public void setIdCfaclifoConj(Integer idCfaclifoConj) {
        this.idCfaclifoConj = idCfaclifoConj;
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