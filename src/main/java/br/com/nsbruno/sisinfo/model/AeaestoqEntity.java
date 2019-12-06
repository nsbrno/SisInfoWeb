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
@Table(name = "AEAESTOQ")
public class AeaestoqEntity {

    @Id
    @Column(name = "ID_AEAESTOQ", table = "AEAESTOQ", nullable = false)
    private Integer idAeaestoq;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLOJA", table = "AEAESTOQ", nullable = false)
    private int idAeaploja;

    @Basic
    @Column(name = "ID_AEAGRDPL", table = "AEAESTOQ")
    private Integer idAeagrdpl;

    @Basic(optional = false)
    @Column(name = "ID_AEALOCES", table = "AEAESTOQ", nullable = false)
    private int idAealoces;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAESTOQ", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAESTOQ", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAESTOQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAESTOQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAESTOQ")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "ESTOQUE", table = "AEAESTOQ", nullable = false)
    private double estoque;

    @Basic(optional = false)
    @Column(name = "RETIDO", table = "AEAESTOQ", nullable = false)
    private double retido;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAESTOQ", nullable = false)
    private String ativo;

    @Basic
    @Column(name = "LOCACAO_ATIVA", table = "AEAESTOQ", length = 18)
    private String locacaoAtiva;

    @Basic
    @Column(name = "LOCACAO_RESERVA", table = "AEAESTOQ", length = 18)
    private String locacaoReserva;

    public Integer getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(Integer idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
    }

    public int getIdAeaploja() {
        return idAeaploja;
    }

    public void setIdAeaploja(int idAeaploja) {
        this.idAeaploja = idAeaploja;
    }

    public Integer getIdAeagrdpl() {
        return idAeagrdpl;
    }

    public void setIdAeagrdpl(Integer idAeagrdpl) {
        this.idAeagrdpl = idAeagrdpl;
    }

    public int getIdAealoces() {
        return idAealoces;
    }

    public void setIdAealoces(int idAealoces) {
        this.idAealoces = idAealoces;
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

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public double getRetido() {
        return retido;
    }

    public void setRetido(double retido) {
        this.retido = retido;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getLocacaoAtiva() {
        return locacaoAtiva;
    }

    public void setLocacaoAtiva(String locacaoAtiva) {
        this.locacaoAtiva = locacaoAtiva;
    }

    public String getLocacaoReserva() {
        return locacaoReserva;
    }

    public void setLocacaoReserva(String locacaoReserva) {
        this.locacaoReserva = locacaoReserva;
    }

}