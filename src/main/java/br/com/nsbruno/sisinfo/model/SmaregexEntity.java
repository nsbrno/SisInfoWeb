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
@Table(name = "SMAREGEX")
public class SmaregexEntity {

    @Id
    @Column(name = "ID_SMAREGEX", table = "SMAREGEX", nullable = false)
    private Integer idSmaregex;

    @Basic
    @Column(name = "US_CAD", table = "SMAREGEX", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAREGEX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic(optional = false)
    @Column(name = "ARQUIVO", table = "SMAREGEX", nullable = false, length = 12)
    private String arquivo;

    @Basic
    @Column(name = "IDEXCLUIDO", table = "SMAREGEX")
    private Integer idexcluido;

    @Basic(optional = false)
    @Column(name = "GUIDEXCLUIDO", table = "SMAREGEX", nullable = false, length = 16)
    private String guidexcluido;

    public Integer getIdSmaregex() {
        return idSmaregex;
    }

    public void setIdSmaregex(Integer idSmaregex) {
        this.idSmaregex = idSmaregex;
    }

    public String getUsCad() {
        return usCad;
    }

    public void setUsCad(String usCad) {
        this.usCad = usCad;
    }

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Integer getIdexcluido() {
        return idexcluido;
    }

    public void setIdexcluido(Integer idexcluido) {
        this.idexcluido = idexcluido;
    }

    public String getGuidexcluido() {
        return guidexcluido;
    }

    public void setGuidexcluido(String guidexcluido) {
        this.guidexcluido = guidexcluido;
    }

}