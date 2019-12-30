package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "AEAOSIND")
public class AeaosindEntity {

    @Id
    @Column(name = "ID_AEAOSIND", table = "AEAOSIND", nullable = false)
    private Integer idAeaosind;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAOSIND", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_AEASERIE", table = "AEAOSIND", nullable = false)
    private Integer idAeaserie;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAOSIND", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAOSIND", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAOSIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAOSIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAOSIND")
    private Integer ctInteg;

    @Basic
    @Column(name = "NUMERO", table = "AEAOSIND")
    private Integer numero;

    @Basic(optional = false)
    @Column(name = "DT_ABERTURA", table = "AEAOSIND", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtAbertura;

    @Basic
    @Column(name = "DT_FECHAMENTO", table = "AEAOSIND")
    @Temporal(TemporalType.DATE)
    private Date dtFechamento;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAOSIND")
    private byte[] obs;

    @Basic
    @Column(name = "REPOE_PERDAS", table = "AEAOSIND")
    private String repoePerdas;

    public Integer getIdAeaosind() {
        return idAeaosind;
    }

    public void setIdAeaosind(Integer idAeaosind) {
        this.idAeaosind = idAeaosind;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(Integer idAeaserie) {
        this.idAeaserie = idAeaserie;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getRepoePerdas() {
        return repoePerdas;
    }

    public void setRepoePerdas(String repoePerdas) {
        this.repoePerdas = repoePerdas;
    }

}