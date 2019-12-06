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
@Table(name = "AEABICMV")
public class AeabicmvEntity {

    @Id
    @Column(name = "ID_AEABICMV", table = "AEABICMV", nullable = false)
    private Integer idAeabicmv;

    @Basic
    @Column(name = "ID_AEACAIXA", table = "AEABICMV")
    private Integer idAeacaixa;

    @Basic
    @Column(name = "ID_AEATANQU", table = "AEABICMV")
    private Integer idAeatanqu;

    @Basic
    @Column(name = "ID_AEABICOS", table = "AEABICMV")
    private Integer idAeabicos;

    @Basic
    @Column(name = "ID_AEAITENT", table = "AEABICMV")
    private Integer idAeaitent;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEABICMV", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEABICMV", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEABICMV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEABICMV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEABICMV")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO", table = "AEABICMV")
    private String tipo;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "AEABICMV")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "QTDE", table = "AEABICMV", nullable = false)
    private double qtde;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEABICMV", nullable = false)
    private int numero;

    @Basic
    @Column(name = "MOT_INTERV", table = "AEABICMV", length = 40)
    private String motInterv;

    @Basic
    @Column(name = "NOM_INTERV", table = "AEABICMV", length = 40)
    private String nomInterv;

    @Basic
    @Column(name = "CNPJ_INTERV", table = "AEABICMV", length = 18)
    private String cnpjInterv;

    @Basic
    @Column(name = "CPF_INTERV", table = "AEABICMV", length = 18)
    private String cpfInterv;

    @Basic(optional = false)
    @Column(name = "VAL_FECHA", table = "AEABICMV", nullable = false)
    private double valFecha;

    @Basic(optional = false)
    @Column(name = "VAL_ABERT", table = "AEABICMV", nullable = false)
    private double valAbert;

    @Basic(optional = false)
    @Column(name = "VOL_AFERI", table = "AEABICMV", nullable = false)
    private double volAferi;

    @Basic(optional = false)
    @Column(name = "VL_UNIT", table = "AEABICMV", nullable = false)
    private double vlUnit;

    @Basic
    @Column(name = "FC_VOL_VENDAS", table = "AEABICMV", precision = 15)
    private Double fcVolVendas;

    @Basic
    @Column(name = "FC_VL_VENDA", table = "AEABICMV", precision = 15)
    private Double fcVlVenda;

    public Integer getIdAeabicmv() {
        return idAeabicmv;
    }

    public void setIdAeabicmv(Integer idAeabicmv) {
        this.idAeabicmv = idAeabicmv;
    }

    public Integer getIdAeacaixa() {
        return idAeacaixa;
    }

    public void setIdAeacaixa(Integer idAeacaixa) {
        this.idAeacaixa = idAeacaixa;
    }

    public Integer getIdAeatanqu() {
        return idAeatanqu;
    }

    public void setIdAeatanqu(Integer idAeatanqu) {
        this.idAeatanqu = idAeatanqu;
    }

    public Integer getIdAeabicos() {
        return idAeabicos;
    }

    public void setIdAeabicos(Integer idAeabicos) {
        this.idAeabicos = idAeabicos;
    }

    public Integer getIdAeaitent() {
        return idAeaitent;
    }

    public void setIdAeaitent(Integer idAeaitent) {
        this.idAeaitent = idAeaitent;
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

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMotInterv() {
        return motInterv;
    }

    public void setMotInterv(String motInterv) {
        this.motInterv = motInterv;
    }

    public String getNomInterv() {
        return nomInterv;
    }

    public void setNomInterv(String nomInterv) {
        this.nomInterv = nomInterv;
    }

    public String getCnpjInterv() {
        return cnpjInterv;
    }

    public void setCnpjInterv(String cnpjInterv) {
        this.cnpjInterv = cnpjInterv;
    }

    public String getCpfInterv() {
        return cpfInterv;
    }

    public void setCpfInterv(String cpfInterv) {
        this.cpfInterv = cpfInterv;
    }

    public double getValFecha() {
        return valFecha;
    }

    public void setValFecha(double valFecha) {
        this.valFecha = valFecha;
    }

    public double getValAbert() {
        return valAbert;
    }

    public void setValAbert(double valAbert) {
        this.valAbert = valAbert;
    }

    public double getVolAferi() {
        return volAferi;
    }

    public void setVolAferi(double volAferi) {
        this.volAferi = volAferi;
    }

    public double getVlUnit() {
        return vlUnit;
    }

    public void setVlUnit(double vlUnit) {
        this.vlUnit = vlUnit;
    }

    public Double getFcVolVendas() {
        return fcVolVendas;
    }

    public void setFcVolVendas(Double fcVolVendas) {
        this.fcVolVendas = fcVolVendas;
    }

    public Double getFcVlVenda() {
        return fcVlVenda;
    }

    public void setFcVlVenda(Double fcVlVenda) {
        this.fcVlVenda = fcVlVenda;
    }

}