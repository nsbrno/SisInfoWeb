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
@Table(name = "RPALCPAR")
public class RpalcparEntity {

    @Id
    @Column(name = "ID_RPALCPAR", table = "RPALCPAR", nullable = false)
    private Integer idRpalcpar;

    @Basic(optional = false)
    @Column(name = "ID_RPAPARCE", table = "RPALCPAR", nullable = false)
    private int idRpaparce;

    @Basic
    @Column(name = "ID_CBAITMOV", table = "RPALCPAR")
    private Integer idCbaitmov;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "RPALCPAR")
    private Integer idCbaplcta;

    @Basic
    @Column(name = "ID_CFATPDOC_ANT", table = "RPALCPAR")
    private Integer idCfatpdocAnt;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPALCPAR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPALCPAR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPALCPAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPALCPAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPALCPAR")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO", table = "RPALCPAR")
    private String tipo;

    @Basic
    @Column(name = "DT_IMPORTACAO", table = "RPALCPAR")
    @Temporal(TemporalType.DATE)
    private Date dtImportacao;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "RPALCPAR")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "RPALCPAR", nullable = false)
    private int sequencia;

    @Basic
    @Column(name = "D_C", table = "RPALCPAR")
    private String dC;

    @Basic(optional = false)
    @Column(name = "VL_PAGO", table = "RPALCPAR", nullable = false)
    private double vlPago;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_PRORROG", table = "RPALCPAR", nullable = false)
    private double vlJurosProrrog;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "RPALCPAR", nullable = false)
    private double vlJuros;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "RPALCPAR", nullable = false)
    private double vlDesconto;

    @Basic
    @Column(name = "FC_VL_PAGO_TOTAL", table = "RPALCPAR", precision = 15)
    private Double fcVlPagoTotal;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPALCPAR")
    private byte[] obs;

    public Integer getIdRpalcpar() {
        return idRpalcpar;
    }

    public void setIdRpalcpar(Integer idRpalcpar) {
        this.idRpalcpar = idRpalcpar;
    }

    public int getIdRpaparce() {
        return idRpaparce;
    }

    public void setIdRpaparce(int idRpaparce) {
        this.idRpaparce = idRpaparce;
    }

    public Integer getIdCbaitmov() {
        return idCbaitmov;
    }

    public void setIdCbaitmov(Integer idCbaitmov) {
        this.idCbaitmov = idCbaitmov;
    }

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public Integer getIdCfatpdocAnt() {
        return idCfatpdocAnt;
    }

    public void setIdCfatpdocAnt(Integer idCfatpdocAnt) {
        this.idCfatpdocAnt = idCfatpdocAnt;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDtImportacao() {
        return dtImportacao;
    }

    public void setDtImportacao(Date dtImportacao) {
        this.dtImportacao = dtImportacao;
    }

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public String getDC() {
        return dC;
    }

    public void setDC(String dC) {
        this.dC = dC;
    }

    public double getVlPago() {
        return vlPago;
    }

    public void setVlPago(double vlPago) {
        this.vlPago = vlPago;
    }

    public double getVlJurosProrrog() {
        return vlJurosProrrog;
    }

    public void setVlJurosProrrog(double vlJurosProrrog) {
        this.vlJurosProrrog = vlJurosProrrog;
    }

    public double getVlJuros() {
        return vlJuros;
    }

    public void setVlJuros(double vlJuros) {
        this.vlJuros = vlJuros;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public Double getFcVlPagoTotal() {
        return fcVlPagoTotal;
    }

    public void setFcVlPagoTotal(Double fcVlPagoTotal) {
        this.fcVlPagoTotal = fcVlPagoTotal;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}