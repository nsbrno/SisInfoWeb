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
@Table(name = "CFAPROMO")
public class CfapromoEntity {

    @Id
    @Column(name = "ID_CFAPROMO", table = "CFAPROMO", nullable = false)
    private Integer idCfapromo;

    @Basic
    @Column(name = "ID_AEATBPRO", table = "CFAPROMO")
    private Integer idAeatbpro;

    @Basic
    @Column(name = "ID_CFACLIFO_INDICOU", table = "CFAPROMO")
    private Integer idCfaclifoIndicou;

    @Basic
    @Column(name = "ID_CFACLIFO_INDICADO", table = "CFAPROMO")
    private Integer idCfaclifoIndicado;

    @Basic
    @Column(name = "ID_AEASAIDA", table = "CFAPROMO")
    private Integer idAeasaida;

    @Basic
    @Column(name = "US_CAD", table = "CFAPROMO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAPROMO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAPROMO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAPROMO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAPROMO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "CFAPROMO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtMovimento;

    @Basic
    @Column(name = "FECHADO", table = "CFAPROMO")
    private String fechado;

    @Basic(optional = false)
    @Column(name = "IMPRESSOES", table = "CFAPROMO", nullable = false)
    private int impressoes;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "CFAPROMO", nullable = false)
    private int sequencia;

    public Integer getIdCfapromo() {
        return idCfapromo;
    }

    public void setIdCfapromo(Integer idCfapromo) {
        this.idCfapromo = idCfapromo;
    }

    public Integer getIdAeatbpro() {
        return idAeatbpro;
    }

    public void setIdAeatbpro(Integer idAeatbpro) {
        this.idAeatbpro = idAeatbpro;
    }

    public Integer getIdCfaclifoIndicou() {
        return idCfaclifoIndicou;
    }

    public void setIdCfaclifoIndicou(Integer idCfaclifoIndicou) {
        this.idCfaclifoIndicou = idCfaclifoIndicou;
    }

    public Integer getIdCfaclifoIndicado() {
        return idCfaclifoIndicado;
    }

    public void setIdCfaclifoIndicado(Integer idCfaclifoIndicado) {
        this.idCfaclifoIndicado = idCfaclifoIndicado;
    }

    public Integer getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
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

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public String getFechado() {
        return fechado;
    }

    public void setFechado(String fechado) {
        this.fechado = fechado;
    }

    public int getImpressoes() {
        return impressoes;
    }

    public void setImpressoes(int impressoes) {
        this.impressoes = impressoes;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

}