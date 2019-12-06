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
@Table(name = "AEAETPRD")
public class AeaetprdEntity {

    @Id
    @Column(name = "ID_AEAETPRD", table = "AEAETPRD", nullable = false)
    private Integer idAeaetprd;

    @Basic(optional = false)
    @Column(name = "ID_AEAETAPA", table = "AEAETPRD", nullable = false)
    private int idAeaetapa;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEAETPRD", nullable = false)
    private int idAeaprodu;

    @Basic
    @Column(name = "US_CAD", table = "AEAETPRD", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAETPRD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAETPRD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAETPRD")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAETPRD", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "MIN_PREVISTOS", table = "AEAETPRD")
    private Integer minPrevistos;

    public Integer getIdAeaetprd() {
        return idAeaetprd;
    }

    public void setIdAeaetprd(Integer idAeaetprd) {
        this.idAeaetprd = idAeaetprd;
    }

    public int getIdAeaetapa() {
        return idAeaetapa;
    }

    public void setIdAeaetapa(int idAeaetapa) {
        this.idAeaetapa = idAeaetapa;
    }

    public int getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(int idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
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

    public Integer getMinPrevistos() {
        return minPrevistos;
    }

    public void setMinPrevistos(Integer minPrevistos) {
        this.minPrevistos = minPrevistos;
    }

}