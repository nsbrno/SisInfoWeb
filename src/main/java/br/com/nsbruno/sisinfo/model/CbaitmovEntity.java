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
@Table(name = "CBAITMOV")
public class CbaitmovEntity {

    @Id
    @Column(name = "ID_CBAITMOV", table = "CBAITMOV", nullable = false)
    private Integer idCbaitmov;

    @Basic(optional = false)
    @Column(name = "ID_CBATRANS", table = "CBAITMOV", nullable = false)
    private Integer idCbatrans;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA", table = "CBAITMOV", nullable = false)
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_NUMCX", table = "CBAITMOV", nullable = false)
    private Integer idCbaplctaNumcx;

    @Basic
    @Column(name = "ID_CBAPLCTA_JUROS", table = "CBAITMOV")
    private Integer idCbaplctaJuros;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_JUROS_DISP", table = "CBAITMOV", nullable = false)
    private Integer idCbaplctaJurosDisp;

    @Basic
    @Column(name = "ID_CBAPLCTA_DESCONTO", table = "CBAITMOV")
    private Integer idCbaplctaDesconto;

    @Basic
    @Column(name = "ID_RPAPARCE", table = "CBAITMOV")
    private Integer idRpaparce;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBAITMOV", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBAITMOV", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBAITMOV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBAITMOV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBAITMOV")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "D_C", table = "CBAITMOV", nullable = false)
    private String dC;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "CBAITMOV", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "A_S", table = "CBAITMOV", nullable = false)
    private String a_S;

    @Basic(optional = false)
    @Column(name = "VL_CAPITAL", table = "CBAITMOV", nullable = false)
    private double vlCapital;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "CBAITMOV", nullable = false)
    private double vlJuros;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "CBAITMOV", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_A_PRORROG", table = "CBAITMOV", nullable = false)
    private double vlJurosAProrrog;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_CALC", table = "CBAITMOV", nullable = false)
    private double vlJurosCalc;

    @Basic
    @Column(name = "FC_VL_MOVIMENTO", table = "CBAITMOV", precision = 15)
    private Double fcVlMovimento;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CBAITMOV")
    private byte[] complemento;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CBAITMOV", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "AUTENTICADO", table = "CBAITMOV")
    private String autenticado;

    public Integer getIdCbaitmov() {
        return idCbaitmov;
    }

    public void setIdCbaitmov(Integer idCbaitmov) {
        this.idCbaitmov = idCbaitmov;
    }

    public Integer getIdCbatrans() {
        return idCbatrans;
    }

    public void setIdCbatrans(Integer idCbatrans) {
        this.idCbatrans = idCbatrans;
    }

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public Integer getIdCbaplctaNumcx() {
        return idCbaplctaNumcx;
    }

    public void setIdCbaplctaNumcx(Integer idCbaplctaNumcx) {
        this.idCbaplctaNumcx = idCbaplctaNumcx;
    }

    public Integer getIdCbaplctaJuros() {
        return idCbaplctaJuros;
    }

    public void setIdCbaplctaJuros(Integer idCbaplctaJuros) {
        this.idCbaplctaJuros = idCbaplctaJuros;
    }

    public Integer getIdCbaplctaJurosDisp() {
        return idCbaplctaJurosDisp;
    }

    public void setIdCbaplctaJurosDisp(Integer idCbaplctaJurosDisp) {
        this.idCbaplctaJurosDisp = idCbaplctaJurosDisp;
    }

    public Integer getIdCbaplctaDesconto() {
        return idCbaplctaDesconto;
    }

    public void setIdCbaplctaDesconto(Integer idCbaplctaDesconto) {
        this.idCbaplctaDesconto = idCbaplctaDesconto;
    }

    public Integer getIdRpaparce() {
        return idRpaparce;
    }

    public void setIdRpaparce(Integer idRpaparce) {
        this.idRpaparce = idRpaparce;
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

    public String getDC() {
        return dC;
    }

    public void setDC(String dC) {
        this.dC = dC;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public String getA_S() {
        return a_S;
    }

    public void setA_S(String a_S) {
        this.a_S = a_S;
    }

    public double getVlCapital() {
        return vlCapital;
    }

    public void setVlCapital(double vlCapital) {
        this.vlCapital = vlCapital;
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

    public double getVlJurosAProrrog() {
        return vlJurosAProrrog;
    }

    public void setVlJurosAProrrog(double vlJurosAProrrog) {
        this.vlJurosAProrrog = vlJurosAProrrog;
    }

    public double getVlJurosCalc() {
        return vlJurosCalc;
    }

    public void setVlJurosCalc(double vlJurosCalc) {
        this.vlJurosCalc = vlJurosCalc;
    }

    public Double getFcVlMovimento() {
        return fcVlMovimento;
    }

    public void setFcVlMovimento(Double fcVlMovimento) {
        this.fcVlMovimento = fcVlMovimento;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutenticado() {
        return autenticado;
    }

    public void setAutenticado(String autenticado) {
        this.autenticado = autenticado;
    }

}