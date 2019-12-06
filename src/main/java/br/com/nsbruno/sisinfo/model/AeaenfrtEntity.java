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
@Table(name = "AEAENFRT")
public class AeaenfrtEntity {

    @Id
    @Column(name = "ID_AEAENFRT", table = "AEAENFRT", nullable = false)
    private Integer idAeaenfrt;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEAENFRT")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEAFRETE", table = "AEAENFRT")
    private Integer idAeafrete;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAENFRT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAENFRT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAENFRT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAENFRT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAENFRT")
    private Integer ctInteg;

    public Integer getIdAeaenfrt() {
        return idAeaenfrt;
    }

    public void setIdAeaenfrt(Integer idAeaenfrt) {
        this.idAeaenfrt = idAeaenfrt;
    }

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public Integer getIdAeafrete() {
        return idAeafrete;
    }

    public void setIdAeafrete(Integer idAeafrete) {
        this.idAeafrete = idAeafrete;
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