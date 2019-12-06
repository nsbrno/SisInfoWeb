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
@Table(name = "CFAPOSSE")
public class CfaposseEntity {

    @Id
    @Column(name = "ID_CFAPOSSE", table = "CFAPOSSE", nullable = false)
    private Integer idCfaposse;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFAPOSSE", nullable = false)
    private int idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAPOSSE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAPOSSE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAPOSSE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAPOSSE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAPOSSE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFAPOSSE", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CFAPOSSE", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "DT_COMPRA", table = "CFAPOSSE")
    @Temporal(TemporalType.DATE)
    private Date dtCompra;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "CFAPOSSE", nullable = false)
    private double valor;

    @Lob
    @Basic
    @Column(name = "OBS", table = "CFAPOSSE")
    private byte[] obs;

    @Basic
    @Column(name = "SITUACAO", table = "CFAPOSSE")
    private String situacao;

    public Integer getIdCfaposse() {
        return idCfaposse;
    }

    public void setIdCfaposse(Integer idCfaposse) {
        this.idCfaposse = idCfaposse;
    }

    public int getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}