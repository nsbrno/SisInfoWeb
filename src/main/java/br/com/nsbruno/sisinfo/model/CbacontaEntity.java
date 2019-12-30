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
@Table(name = "CBACONTA")
public class CbacontaEntity {

    @Id
    @Column(name = "ID_CBACONTA", table = "CBACONTA", nullable = false)
    private Integer idCbaconta;

    @Basic(optional = false)
    @Column(name = "ID_CFAPORTA", table = "CBACONTA", nullable = false)
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "CBACONTA")
    private Integer idCbaplcta;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "CBACONTA")
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBACONTA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBACONTA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBACONTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBACONTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBACONTA")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_ABERTURA", table = "CBACONTA")
    @Temporal(TemporalType.DATE)
    private Date dtAbertura;

    @Basic(optional = false)
    @Column(name = "AGENCIA", table = "CBACONTA", nullable = false)
    private Integer agencia;

    @Basic
    @Column(name = "DG_AG", table = "CBACONTA")
    private String dgAg;

    @Basic(optional = false)
    @Column(name = "CONTA", table = "CBACONTA", nullable = false)
    private Integer conta;

    @Basic
    @Column(name = "DG_CT", table = "CBACONTA", length = 2)
    private String dgCt;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CBACONTA", nullable = false)
    private String tipo;

    @Basic(optional = false)
    @Column(name = "NOME", table = "CBACONTA", nullable = false, length = 60)
    private String nome;

    @Basic
    @Column(name = "GERENTE", table = "CBACONTA", length = 60)
    private String gerente;

    @Basic
    @Column(name = "DDD", table = "CBACONTA")
    private Integer ddd;

    @Basic
    @Column(name = "FONE", table = "CBACONTA", length = 15)
    private String fone;

    @Basic(optional = false)
    @Column(name = "RAMAL", table = "CBACONTA", nullable = false)
    private Integer ramal;

    @Lob
    @Basic
    @Column(name = "BOLETO", table = "CBACONTA")
    private byte[] boleto;

    @Basic
    @Column(name = "SEQ_BOLETO", table = "CBACONTA")
    private Integer seqBoleto;

    @Basic(optional = false)
    @Column(name = "VL_MINIMO", table = "CBACONTA", nullable = false)
    private double vlMinimo;

    @Basic(optional = false)
    @Column(name = "VL_TAXA_MINIMO", table = "CBACONTA", nullable = false)
    private double vlTaxaMinimo;

    public Integer getIdCbaconta() {
        return idCbaconta;
    }

    public void setIdCbaconta(Integer idCbaconta) {
        this.idCbaconta = idCbaconta;
    }

    public Integer getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(Integer idCfaporta) {
        this.idCfaporta = idCfaporta;
    }

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getDgAg() {
        return dgAg;
    }

    public void setDgAg(String dgAg) {
        this.dgAg = dgAg;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public String getDgCt() {
        return dgCt;
    }

    public void setDgCt(String dgCt) {
        this.dgCt = dgCt;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Integer getRamal() {
        return ramal;
    }

    public void setRamal(Integer ramal) {
        this.ramal = ramal;
    }

    public byte[] getBoleto() {
        return boleto;
    }

    public void setBoleto(byte[] boleto) {
        this.boleto = boleto;
    }

    public Integer getSeqBoleto() {
        return seqBoleto;
    }

    public void setSeqBoleto(Integer seqBoleto) {
        this.seqBoleto = seqBoleto;
    }

    public double getVlMinimo() {
        return vlMinimo;
    }

    public void setVlMinimo(double vlMinimo) {
        this.vlMinimo = vlMinimo;
    }

    public double getVlTaxaMinimo() {
        return vlTaxaMinimo;
    }

    public void setVlTaxaMinimo(double vlTaxaMinimo) {
        this.vlTaxaMinimo = vlTaxaMinimo;
    }

}