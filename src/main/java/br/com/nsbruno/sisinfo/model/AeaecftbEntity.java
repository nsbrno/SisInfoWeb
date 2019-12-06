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
@Table(name = "AEAECFTB")
public class AeaecftbEntity {

    @Id
    @Column(name = "ID_AEAECFTB", table = "AEAECFTB", nullable = false)
    private Integer idAeaecftb;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAECFTB", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAECFTB", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAECFTB", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAECFTB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAECFTB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAECFTB")
    private Integer ctInteg;

    @Basic
    @Column(name = "NUMERO_SERIE", table = "AEAECFTB", length = 20)
    private String numeroSerie;

    @Basic
    @Column(name = "MODELO", table = "AEAECFTB", length = 20)
    private String modelo;

    @Basic
    @Column(name = "MODELO_ECF", table = "AEAECFTB", length = 20)
    private String modeloEcf;

    @Basic(optional = false)
    @Column(name = "CAIXA", table = "AEAECFTB", nullable = false)
    private int caixa;

    public Integer getIdAeaecftb() {
        return idAeaecftb;
    }

    public void setIdAeaecftb(Integer idAeaecftb) {
        this.idAeaecftb = idAeaecftb;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
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

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModeloEcf() {
        return modeloEcf;
    }

    public void setModeloEcf(String modeloEcf) {
        this.modeloEcf = modeloEcf;
    }

    public int getCaixa() {
        return caixa;
    }

    public void setCaixa(int caixa) {
        this.caixa = caixa;
    }

}