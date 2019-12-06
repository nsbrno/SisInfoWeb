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
@Table(name = "AEAPESOS")
public class AeapesosEntity {

    @Id
    @Column(name = "ID_AEAPESOS", table = "AEAPESOS", nullable = false)
    private Integer idAeapesos;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPESOS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPESOS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPESOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPESOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPESOS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SIGLA", table = "AEAPESOS", nullable = false, length = 3)
    private String sigla;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAPESOS", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "PLURAL", table = "AEAPESOS", nullable = false, length = 40)
    private String plural;

    @Basic(optional = false)
    @Column(name = "FATOR_GRAMA", table = "AEAPESOS", nullable = false)
    private double fatorGrama;

    @Basic(optional = false)
    @Column(name = "FATOR_KILO", table = "AEAPESOS", nullable = false)
    private double fatorKilo;

    @Basic(optional = false)
    @Column(name = "FATOR_TONELADA", table = "AEAPESOS", nullable = false)
    private double fatorTonelada;

    public Integer getIdAeapesos() {
        return idAeapesos;
    }

    public void setIdAeapesos(Integer idAeapesos) {
        this.idAeapesos = idAeapesos;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

    public double getFatorGrama() {
        return fatorGrama;
    }

    public void setFatorGrama(double fatorGrama) {
        this.fatorGrama = fatorGrama;
    }

    public double getFatorKilo() {
        return fatorKilo;
    }

    public void setFatorKilo(double fatorKilo) {
        this.fatorKilo = fatorKilo;
    }

    public double getFatorTonelada() {
        return fatorTonelada;
    }

    public void setFatorTonelada(double fatorTonelada) {
        this.fatorTonelada = fatorTonelada;
    }

}