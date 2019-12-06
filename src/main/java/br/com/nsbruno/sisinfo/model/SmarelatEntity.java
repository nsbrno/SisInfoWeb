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
@Table(name = "SMARELAT")
public class SmarelatEntity {

    @Id
    @Column(name = "ID_SMARELAT", table = "SMARELAT", nullable = false)
    private Integer idSmarelat;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMARELAT")
    private Integer idSmaarqui;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMARELAT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMARELAT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMARELAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMARELAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMARELAT")
    private Integer ctInteg;

    @Lob
    @Basic
    @Column(name = "RELATORIO", table = "SMARELAT")
    private byte[] relatorio;

    @Basic
    @Column(name = "DESCRICAO", table = "SMARELAT", length = 40)
    private String descricao;

    @Basic
    @Column(name = "PRINCIPAL", table = "SMARELAT")
    private String principal;

    @Basic
    @Column(name = "USAR_ORIGINAL", table = "SMARELAT")
    private String usarOriginal;

    public Integer getIdSmarelat() {
        return idSmarelat;
    }

    public void setIdSmarelat(Integer idSmarelat) {
        this.idSmarelat = idSmarelat;
    }

    public Integer getIdSmaarqui() {
        return idSmaarqui;
    }

    public void setIdSmaarqui(Integer idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
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

    public byte[] getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(byte[] relatorio) {
        this.relatorio = relatorio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getUsarOriginal() {
        return usarOriginal;
    }

    public void setUsarOriginal(String usarOriginal) {
        this.usarOriginal = usarOriginal;
    }

}