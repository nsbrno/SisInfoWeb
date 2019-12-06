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
@Table(name = "CFAESTAD")
public class CfaestadEntity {

    @Id
    @Column(name = "ID_CFAESTAD", table = "CFAESTAD", nullable = false)
    private Integer idCfaestad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAESTAD", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAESTAD", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAESTAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAESTAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAESTAD")
    private Integer ctInteg;

    @Basic
    @Column(name = "ID_CFAPAISE", table = "CFAESTAD")
    private Integer idCfapaise;

    @Basic(optional = false)
    @Column(name = "UF", table = "CFAESTAD", nullable = false, length = 2)
    private String uf;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFAESTAD", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "DDD", table = "CFAESTAD")
    private Integer ddd;

    @Basic(optional = false)
    @Column(name = "ICMS_ENT", table = "CFAESTAD", nullable = false)
    private double icmsEnt;

    @Basic(optional = false)
    @Column(name = "ICMS_SAI", table = "CFAESTAD", nullable = false)
    private double icmsSai;

    @Basic
    @Column(name = "TIPO_IPI_ENT", table = "CFAESTAD")
    private String tipoIpiEnt;

    @Basic
    @Column(name = "TIPO_IPI_SAI", table = "CFAESTAD")
    private String tipoIpiSai;

    @Basic(optional = false)
    @Column(name = "IPI_ENT", table = "CFAESTAD", nullable = false)
    private double ipiEnt;

    @Basic(optional = false)
    @Column(name = "IPI_SAI", table = "CFAESTAD", nullable = false)
    private double ipiSai;

    @Basic
    @Column(name = "COD_IBGE", table = "CFAESTAD")
    private Integer codIbge;

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
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

    public Integer getIdCfapaise() {
        return idCfapaise;
    }

    public void setIdCfapaise(Integer idCfapaise) {
        this.idCfapaise = idCfapaise;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public double getIcmsEnt() {
        return icmsEnt;
    }

    public void setIcmsEnt(double icmsEnt) {
        this.icmsEnt = icmsEnt;
    }

    public double getIcmsSai() {
        return icmsSai;
    }

    public void setIcmsSai(double icmsSai) {
        this.icmsSai = icmsSai;
    }

    public String getTipoIpiEnt() {
        return tipoIpiEnt;
    }

    public void setTipoIpiEnt(String tipoIpiEnt) {
        this.tipoIpiEnt = tipoIpiEnt;
    }

    public String getTipoIpiSai() {
        return tipoIpiSai;
    }

    public void setTipoIpiSai(String tipoIpiSai) {
        this.tipoIpiSai = tipoIpiSai;
    }

    public double getIpiEnt() {
        return ipiEnt;
    }

    public void setIpiEnt(double ipiEnt) {
        this.ipiEnt = ipiEnt;
    }

    public double getIpiSai() {
        return ipiSai;
    }

    public void setIpiSai(double ipiSai) {
        this.ipiSai = ipiSai;
    }

    public Integer getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(Integer codIbge) {
        this.codIbge = codIbge;
    }

}