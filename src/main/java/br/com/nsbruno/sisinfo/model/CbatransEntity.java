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
@Table(name = "CBATRANS")
public class CbatransEntity {

    @Id
    @Column(name = "ID_CBATRANS", table = "CBATRANS", nullable = false)
    private Integer idCbatrans;

    @Basic(optional = false)
    @Column(name = "ID_CBACAIXA", table = "CBATRANS", nullable = false)
    private int idCbacaixa;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_NUMCX", table = "CBATRANS", nullable = false)
    private int idCbaplctaNumcx;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_TROCO", table = "CBATRANS", nullable = false)
    private int idCbaplctaTroco;

    @Basic
    @Column(name = "ID_AEACAIXA", table = "CBATRANS")
    private Integer idAeacaixa;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBATRANS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBATRANS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBATRANS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBATRANS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBATRANS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CBATRANS", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "CBATRANS", nullable = false)
    private short situacao;

    @Basic(optional = false)
    @Column(name = "VL_MOVIMENTO", table = "CBATRANS", nullable = false)
    private double vlMovimento;

    @Basic(optional = false)
    @Column(name = "VL_ACERTO", table = "CBATRANS", nullable = false)
    private double vlAcerto;

    @Basic(optional = false)
    @Column(name = "VL_TROCO", table = "CBATRANS", nullable = false)
    private double vlTroco;

    @Basic
    @Column(name = "TAG", table = "CBATRANS")
    private Integer tag;

    @Basic
    @Column(name = "A_S", table = "CBATRANS")
    private String a_S;

    public Integer getIdCbatrans() {
        return idCbatrans;
    }

    public void setIdCbatrans(Integer idCbatrans) {
        this.idCbatrans = idCbatrans;
    }

    public int getIdCbacaixa() {
        return idCbacaixa;
    }

    public void setIdCbacaixa(int idCbacaixa) {
        this.idCbacaixa = idCbacaixa;
    }

    public int getIdCbaplctaNumcx() {
        return idCbaplctaNumcx;
    }

    public void setIdCbaplctaNumcx(int idCbaplctaNumcx) {
        this.idCbaplctaNumcx = idCbaplctaNumcx;
    }

    public int getIdCbaplctaTroco() {
        return idCbaplctaTroco;
    }

    public void setIdCbaplctaTroco(int idCbaplctaTroco) {
        this.idCbaplctaTroco = idCbaplctaTroco;
    }

    public Integer getIdAeacaixa() {
        return idAeacaixa;
    }

    public void setIdAeacaixa(Integer idAeacaixa) {
        this.idAeacaixa = idAeacaixa;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public double getVlMovimento() {
        return vlMovimento;
    }

    public void setVlMovimento(double vlMovimento) {
        this.vlMovimento = vlMovimento;
    }

    public double getVlAcerto() {
        return vlAcerto;
    }

    public void setVlAcerto(double vlAcerto) {
        this.vlAcerto = vlAcerto;
    }

    public double getVlTroco() {
        return vlTroco;
    }

    public void setVlTroco(double vlTroco) {
        this.vlTroco = vlTroco;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public String getA_S() {
        return a_S;
    }

    public void setA_S(String a_S) {
        this.a_S = a_S;
    }

}