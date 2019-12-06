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
@Table(name = "AEAEMTBP")
public class AeaemtbpEntity {

    @Id
    @Column(name = "ID_AEAEMTBP", table = "AEAEMTBP", nullable = false)
    private Integer idAeaemtbp;

    @Basic(optional = false)
    @Column(name = "ID_AEATBPRO", table = "AEAEMTBP", nullable = false)
    private int idAeatbpro;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAEMTBP", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAEMTBP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAEMTBP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAEMTBP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAEMTBP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAEMTBP")
    private Integer ctInteg;

    public Integer getIdAeaemtbp() {
        return idAeaemtbp;
    }

    public void setIdAeaemtbp(Integer idAeaemtbp) {
        this.idAeaemtbp = idAeaemtbp;
    }

    public int getIdAeatbpro() {
        return idAeatbpro;
    }

    public void setIdAeatbpro(int idAeatbpro) {
        this.idAeatbpro = idAeatbpro;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
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