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
@Table(name = "RPASUBST")
public class RpasubstEntity {

    @Id
    @Column(name = "ID_RPASUBST", table = "RPASUBST", nullable = false)
    private Integer idRpasubst;

    @Basic(optional = false)
    @Column(name = "ID_RPAPARCE", table = "RPASUBST", nullable = false)
    private int idRpaparce;

    @Basic
    @Column(name = "ID_CFATPDOC", table = "RPASUBST")
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "RPASUBST")
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CBAPLCTA_CTA_TRANS", table = "RPASUBST")
    private Integer idCbaplctaCtaTrans;

    @Basic
    @Column(name = "ID_CBAPLCTA_DP", table = "RPASUBST")
    private Integer idCbaplctaDp;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "RPASUBST")
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPASUBST", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPASUBST", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPASUBST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPASUBST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPASUBST")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "VL_PARCELA", table = "RPASUBST", nullable = false)
    private double vlParcela;

    @Basic
    @Column(name = "DT_EMISSAO", table = "RPASUBST")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_VENCIMENTO", table = "RPASUBST")
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    public Integer getIdRpasubst() {
        return idRpasubst;
    }

    public void setIdRpasubst(Integer idRpasubst) {
        this.idRpasubst = idRpasubst;
    }

    public int getIdRpaparce() {
        return idRpaparce;
    }

    public void setIdRpaparce(int idRpaparce) {
        this.idRpaparce = idRpaparce;
    }

    public Integer getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(Integer idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public Integer getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(Integer idCfaporta) {
        this.idCfaporta = idCfaporta;
    }

    public Integer getIdCbaplctaCtaTrans() {
        return idCbaplctaCtaTrans;
    }

    public void setIdCbaplctaCtaTrans(Integer idCbaplctaCtaTrans) {
        this.idCbaplctaCtaTrans = idCbaplctaCtaTrans;
    }

    public Integer getIdCbaplctaDp() {
        return idCbaplctaDp;
    }

    public void setIdCbaplctaDp(Integer idCbaplctaDp) {
        this.idCbaplctaDp = idCbaplctaDp;
    }

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
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

    public double getVlParcela() {
        return vlParcela;
    }

    public void setVlParcela(double vlParcela) {
        this.vlParcela = vlParcela;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

}