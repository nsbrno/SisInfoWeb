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
@Table(name = "AEAREFPR")
public class AearefprEntity {

    @Id
    @Column(name = "ID_AEAREFPR", table = "AEAREFPR", nullable = false)
    private Integer idAearefpr;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEAREFPR", nullable = false)
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "ID_AEAREFER", table = "AEAREFPR", nullable = false)
    private Integer idAearefer;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAREFPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAREFPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAREFPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAREFPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAREFPR")
    private Integer ctInteg;

    public Integer getIdAearefpr() {
        return idAearefpr;
    }

    public void setIdAearefpr(Integer idAearefpr) {
        this.idAearefpr = idAearefpr;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdAearefer() {
        return idAearefer;
    }

    public void setIdAearefer(Integer idAearefer) {
        this.idAearefer = idAearefer;
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