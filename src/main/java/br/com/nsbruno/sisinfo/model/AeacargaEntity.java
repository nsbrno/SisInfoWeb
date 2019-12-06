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
@Table(name = "AEACARGA")
public class AeacargaEntity {

    @Id
    @Column(name = "ID_AEACARGA", table = "AEACARGA", nullable = false)
    private Integer idAeacarga;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEACARGA", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_CFACLIFO_MOTORISTA", table = "AEACARGA")
    private Integer idCfaclifoMotorista;

    @Basic
    @Column(name = "ID_CFAEQUIP", table = "AEACARGA")
    private Integer idCfaequip;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACARGA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACARGA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACARGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACARGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACARGA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEACARGA", nullable = false)
    private int numero;

    @Basic(optional = false)
    @Column(name = "DT_CARGA", table = "AEACARGA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtCarga;

    @Basic
    @Column(name = "DT_EMISSAO", table = "AEACARGA")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_SAIDA", table = "AEACARGA")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;

    @Basic
    @Column(name = "DT_FECHAMENTO", table = "AEACARGA")
    @Temporal(TemporalType.DATE)
    private Date dtFechamento;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "AEACARGA", nullable = false)
    private double valor;

    public Integer getIdAeacarga() {
        return idAeacarga;
    }

    public void setIdAeacarga(Integer idAeacarga) {
        this.idAeacarga = idAeacarga;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfaclifoMotorista() {
        return idCfaclifoMotorista;
    }

    public void setIdCfaclifoMotorista(Integer idCfaclifoMotorista) {
        this.idCfaclifoMotorista = idCfaclifoMotorista;
    }

    public Integer getIdCfaequip() {
        return idCfaequip;
    }

    public void setIdCfaequip(Integer idCfaequip) {
        this.idCfaequip = idCfaequip;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDtCarga() {
        return dtCarga;
    }

    public void setDtCarga(Date dtCarga) {
        this.dtCarga = dtCarga;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}