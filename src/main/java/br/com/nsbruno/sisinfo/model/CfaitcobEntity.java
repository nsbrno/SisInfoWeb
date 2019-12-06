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
@Table(name = "CFAITCOB")
public class CfaitcobEntity {

    @Id
    @Column(name = "ID_CFAITCOB", table = "CFAITCOB", nullable = false)
    private Integer idCfaitcob;

    @Basic
    @Column(name = "ID_CFATPCOB", table = "CFAITCOB")
    private Integer idCfatpcob;

    @Basic
    @Column(name = "US_CAD", table = "CFAITCOB", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAITCOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAITCOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAITCOB")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAITCOB", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "ATRAZO_INI", table = "CFAITCOB")
    private Integer atrazoIni;

    @Basic
    @Column(name = "ATRAZO_FIM", table = "CFAITCOB")
    private Integer atrazoFim;

    @Basic(optional = false)
    @Column(name = "PERC_JUROS", table = "CFAITCOB", nullable = false)
    private double percJuros;

    @Basic(optional = false)
    @Column(name = "PERC_DESCONTO", table = "CFAITCOB", nullable = false)
    private double percDesconto;

    @Basic(optional = false)
    @Column(name = "PERC_COMISSAO", table = "CFAITCOB", nullable = false)
    private double percComissao;

    @Basic
    @Column(name = "PESSOA", table = "CFAITCOB")
    private String pessoa;

    @Basic
    @Column(name = "ATACADO_VAREJO", table = "CFAITCOB")
    private String atacadoVarejo;

    public Integer getIdCfaitcob() {
        return idCfaitcob;
    }

    public void setIdCfaitcob(Integer idCfaitcob) {
        this.idCfaitcob = idCfaitcob;
    }

    public Integer getIdCfatpcob() {
        return idCfatpcob;
    }

    public void setIdCfatpcob(Integer idCfatpcob) {
        this.idCfatpcob = idCfatpcob;
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

    public Integer getAtrazoIni() {
        return atrazoIni;
    }

    public void setAtrazoIni(Integer atrazoIni) {
        this.atrazoIni = atrazoIni;
    }

    public Integer getAtrazoFim() {
        return atrazoFim;
    }

    public void setAtrazoFim(Integer atrazoFim) {
        this.atrazoFim = atrazoFim;
    }

    public double getPercJuros() {
        return percJuros;
    }

    public void setPercJuros(double percJuros) {
        this.percJuros = percJuros;
    }

    public double getPercDesconto() {
        return percDesconto;
    }

    public void setPercDesconto(double percDesconto) {
        this.percDesconto = percDesconto;
    }

    public double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getAtacadoVarejo() {
        return atacadoVarejo;
    }

    public void setAtacadoVarejo(String atacadoVarejo) {
        this.atacadoVarejo = atacadoVarejo;
    }

}