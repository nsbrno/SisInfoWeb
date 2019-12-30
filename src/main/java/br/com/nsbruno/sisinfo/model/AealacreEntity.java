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
@Table(name = "AEALACRE")
public class AealacreEntity {

    @Id
    @Column(name = "ID_AEALACRE", table = "AEALACRE", nullable = false)
    private Integer idAealacre;

    @Basic(optional = false)
    @Column(name = "ID_AEABOMBA", table = "AEALACRE", nullable = false)
    private Integer idAeabomba;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEALACRE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEALACRE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEALACRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEALACRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEALACRE")
    private Integer ctInteg;

    @Basic
    @Column(name = "NUM_LACRE", table = "AEALACRE", length = 20)
    private String numLacre;

    @Basic
    @Column(name = "DT_APLICACAO", table = "AEALACRE")
    @Temporal(TemporalType.DATE)
    private Date dtAplicacao;

    public Integer getIdAealacre() {
        return idAealacre;
    }

    public void setIdAealacre(Integer idAealacre) {
        this.idAealacre = idAealacre;
    }

    public Integer getIdAeabomba() {
        return idAeabomba;
    }

    public void setIdAeabomba(Integer idAeabomba) {
        this.idAeabomba = idAeabomba;
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

    public String getNumLacre() {
        return numLacre;
    }

    public void setNumLacre(String numLacre) {
        this.numLacre = numLacre;
    }

    public Date getDtAplicacao() {
        return dtAplicacao;
    }

    public void setDtAplicacao(Date dtAplicacao) {
        this.dtAplicacao = dtAplicacao;
    }

}