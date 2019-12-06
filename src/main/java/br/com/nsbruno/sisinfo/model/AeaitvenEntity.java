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
@Table(name = "AEAITVEN")
public class AeaitvenEntity {

    @Id
    @Column(name = "ID_AEAITVEN", table = "AEAITVEN", nullable = false)
    private Integer idAeaitven;

    @Basic
    @Column(name = "ID_CFACLIFO_PRODUTIVO", table = "AEAITVEN")
    private Integer idCfaclifoProdutivo;

    @Basic
    @Column(name = "ID_AEAITNFS", table = "AEAITVEN")
    private Integer idAeaitnfs;

    @Basic
    @Column(name = "ID_AEAITCNJ", table = "AEAITVEN")
    private Integer idAeaitcnj;

    @Basic
    @Column(name = "ID_AEAITSAI", table = "AEAITVEN")
    private Integer idAeaitsai;

    @Basic
    @Column(name = "ID_AEAITORC", table = "AEAITVEN")
    private Integer idAeaitorc;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITVEN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITVEN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITVEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITVEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITVEN")
    private Integer ctInteg;

    @Basic
    @Column(name = "SEQUENCIA", table = "AEAITVEN")
    private Integer sequencia;

    @Basic
    @Column(name = "DT_INICIO", table = "AEAITVEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInicio;

    @Basic
    @Column(name = "DT_FIM", table = "AEAITVEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFim;

    @Basic(optional = false)
    @Column(name = "PERCENTUAL", table = "AEAITVEN", nullable = false)
    private double percentual;

    @Basic(optional = false)
    @Column(name = "COMISSAO", table = "AEAITVEN", nullable = false)
    private double comissao;

    public Integer getIdAeaitven() {
        return idAeaitven;
    }

    public void setIdAeaitven(Integer idAeaitven) {
        this.idAeaitven = idAeaitven;
    }

    public Integer getIdCfaclifoProdutivo() {
        return idCfaclifoProdutivo;
    }

    public void setIdCfaclifoProdutivo(Integer idCfaclifoProdutivo) {
        this.idCfaclifoProdutivo = idCfaclifoProdutivo;
    }

    public Integer getIdAeaitnfs() {
        return idAeaitnfs;
    }

    public void setIdAeaitnfs(Integer idAeaitnfs) {
        this.idAeaitnfs = idAeaitnfs;
    }

    public Integer getIdAeaitcnj() {
        return idAeaitcnj;
    }

    public void setIdAeaitcnj(Integer idAeaitcnj) {
        this.idAeaitcnj = idAeaitcnj;
    }

    public Integer getIdAeaitsai() {
        return idAeaitsai;
    }

    public void setIdAeaitsai(Integer idAeaitsai) {
        this.idAeaitsai = idAeaitsai;
    }

    public Integer getIdAeaitorc() {
        return idAeaitorc;
    }

    public void setIdAeaitorc(Integer idAeaitorc) {
        this.idAeaitorc = idAeaitorc;
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

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}