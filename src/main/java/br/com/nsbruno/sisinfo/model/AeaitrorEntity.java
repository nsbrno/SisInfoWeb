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
@Table(name = "AEAITROR")
public class AeaitrorEntity {

    @Id
    @Column(name = "ID_AEAITROR", table = "AEAITROR", nullable = false)
    private Integer idAeaitror;

    @Basic
    @Column(name = "ID_AEAROMAN", table = "AEAITROR")
    private Integer idAearoman;

    @Basic
    @Column(name = "ID_AEAORCAM", table = "AEAITROR")
    private Integer idAeaorcam;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITROR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITROR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITROR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITROR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITROR")
    private Integer ctInteg;

    public Integer getIdAeaitror() {
        return idAeaitror;
    }

    public void setIdAeaitror(Integer idAeaitror) {
        this.idAeaitror = idAeaitror;
    }

    public Integer getIdAearoman() {
        return idAearoman;
    }

    public void setIdAearoman(Integer idAearoman) {
        this.idAearoman = idAearoman;
    }

    public Integer getIdAeaorcam() {
        return idAeaorcam;
    }

    public void setIdAeaorcam(Integer idAeaorcam) {
        this.idAeaorcam = idAeaorcam;
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