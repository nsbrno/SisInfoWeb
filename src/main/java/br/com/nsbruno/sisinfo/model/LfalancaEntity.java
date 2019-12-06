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
@Table(name = "LFALANCA")
public class LfalancaEntity {

    @Id
    @Column(name = "ID_LFALANCA", table = "LFALANCA", nullable = false)
    private Integer idLfalanca;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "LFALANCA")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "US_CAD", table = "LFALANCA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "LFALANCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "LFALANCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "LFALANCA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "LFALANCA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "TIPO", table = "LFALANCA")
    private String tipo;

    @Basic
    @Column(name = "A_E", table = "LFALANCA")
    private String aE;

    @Basic
    @Column(name = "NUMERO", table = "LFALANCA")
    private Integer numero;

    @Basic
    @Column(name = "NUMERO_INI", table = "LFALANCA")
    private Integer numeroIni;

    @Basic
    @Column(name = "DT_EMISSAO", table = "LFALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_ENTRADA", table = "LFALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;

    @Basic
    @Column(name = "IE_RG", table = "LFALANCA", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "CPF_CGC", table = "LFALANCA", length = 18)
    private String cpfCgc;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_IPI", table = "LFALANCA", nullable = false)
    private double aliquotaIpi;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS", table = "LFALANCA", nullable = false)
    private double aliquotaIcms;

    @Basic(optional = false)
    @Column(name = "VL_CONT_IPI", table = "LFALANCA", nullable = false)
    private double vlContIpi;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC_IPI", table = "LFALANCA", nullable = false)
    private double vlBaseCalcIpi;

    @Basic(optional = false)
    @Column(name = "VL_IMP_IPI", table = "LFALANCA", nullable = false)
    private double vlImpIpi;

    @Basic(optional = false)
    @Column(name = "VL_ISE_IPI", table = "LFALANCA", nullable = false)
    private double vlIseIpi;

    @Basic(optional = false)
    @Column(name = "VL_OUT_IPI", table = "LFALANCA", nullable = false)
    private double vlOutIpi;

    @Basic(optional = false)
    @Column(name = "VL_EXT_IPI", table = "LFALANCA", nullable = false)
    private double vlExtIpi;

    @Basic(optional = false)
    @Column(name = "VL_CONT_ICMS", table = "LFALANCA", nullable = false)
    private double vlContIcms;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC_ICMS", table = "LFALANCA", nullable = false)
    private double vlBaseCalcIcms;

    @Basic(optional = false)
    @Column(name = "VL_IMP_ICMS", table = "LFALANCA", nullable = false)
    private double vlImpIcms;

    @Basic(optional = false)
    @Column(name = "VL_ISE_ICMS", table = "LFALANCA", nullable = false)
    private double vlIseIcms;

    @Basic(optional = false)
    @Column(name = "VL_OUT_ICMS", table = "LFALANCA", nullable = false)
    private double vlOutIcms;

    @Basic(optional = false)
    @Column(name = "VL_EXT_ICMS", table = "LFALANCA", nullable = false)
    private double vlExtIcms;

    @Basic
    @Column(name = "FECHADO", table = "LFALANCA")
    private String fechado;

    @Lob
    @Basic
    @Column(name = "OBS", table = "LFALANCA")
    private byte[] obs;

    public Integer getIdLfalanca() {
        return idLfalanca;
    }

    public void setIdLfalanca(Integer idLfalanca) {
        this.idLfalanca = idLfalanca;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAE() {
        return aE;
    }

    public void setAE(String aE) {
        this.aE = aE;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumeroIni() {
        return numeroIni;
    }

    public void setNumeroIni(Integer numeroIni) {
        this.numeroIni = numeroIni;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public String getIeRg() {
        return ieRg;
    }

    public void setIeRg(String ieRg) {
        this.ieRg = ieRg;
    }

    public String getCpfCgc() {
        return cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public double getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getVlContIpi() {
        return vlContIpi;
    }

    public void setVlContIpi(double vlContIpi) {
        this.vlContIpi = vlContIpi;
    }

    public double getVlBaseCalcIpi() {
        return vlBaseCalcIpi;
    }

    public void setVlBaseCalcIpi(double vlBaseCalcIpi) {
        this.vlBaseCalcIpi = vlBaseCalcIpi;
    }

    public double getVlImpIpi() {
        return vlImpIpi;
    }

    public void setVlImpIpi(double vlImpIpi) {
        this.vlImpIpi = vlImpIpi;
    }

    public double getVlIseIpi() {
        return vlIseIpi;
    }

    public void setVlIseIpi(double vlIseIpi) {
        this.vlIseIpi = vlIseIpi;
    }

    public double getVlOutIpi() {
        return vlOutIpi;
    }

    public void setVlOutIpi(double vlOutIpi) {
        this.vlOutIpi = vlOutIpi;
    }

    public double getVlExtIpi() {
        return vlExtIpi;
    }

    public void setVlExtIpi(double vlExtIpi) {
        this.vlExtIpi = vlExtIpi;
    }

    public double getVlContIcms() {
        return vlContIcms;
    }

    public void setVlContIcms(double vlContIcms) {
        this.vlContIcms = vlContIcms;
    }

    public double getVlBaseCalcIcms() {
        return vlBaseCalcIcms;
    }

    public void setVlBaseCalcIcms(double vlBaseCalcIcms) {
        this.vlBaseCalcIcms = vlBaseCalcIcms;
    }

    public double getVlImpIcms() {
        return vlImpIcms;
    }

    public void setVlImpIcms(double vlImpIcms) {
        this.vlImpIcms = vlImpIcms;
    }

    public double getVlIseIcms() {
        return vlIseIcms;
    }

    public void setVlIseIcms(double vlIseIcms) {
        this.vlIseIcms = vlIseIcms;
    }

    public double getVlOutIcms() {
        return vlOutIcms;
    }

    public void setVlOutIcms(double vlOutIcms) {
        this.vlOutIcms = vlOutIcms;
    }

    public double getVlExtIcms() {
        return vlExtIcms;
    }

    public void setVlExtIcms(double vlExtIcms) {
        this.vlExtIcms = vlExtIcms;
    }

    public String getFechado() {
        return fechado;
    }

    public void setFechado(String fechado) {
        this.fechado = fechado;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}