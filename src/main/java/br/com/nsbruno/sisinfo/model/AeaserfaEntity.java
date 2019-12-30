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
@Table(name = "AEASERFA")
public class AeaserfaEntity {

    @Id
    @Column(name = "ID_AEASERFA", table = "AEASERFA", nullable = false)
    private Integer idAeaserfa;

    @Basic(optional = false)
    @Column(name = "ID_AEASERIE", table = "AEASERFA", nullable = false)
    private Integer idAeaserie;

    @Basic(optional = false)
    @Column(name = "ID_AEAFAMIL", table = "AEASERFA", nullable = false)
    private Integer idAeafamil;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEASERFA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEASERFA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEASERFA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEASERFA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEASERFA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "AEASERFA", nullable = false)
    private String tipo;

    public Integer getIdAeaserfa() {
        return idAeaserfa;
    }

    public void setIdAeaserfa(Integer idAeaserfa) {
        this.idAeaserfa = idAeaserfa;
    }

    public Integer getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(Integer idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdAeafamil() {
        return idAeafamil;
    }

    public void setIdAeafamil(Integer idAeafamil) {
        this.idAeafamil = idAeafamil;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}