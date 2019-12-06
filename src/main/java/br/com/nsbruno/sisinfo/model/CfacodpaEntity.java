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
@Table(name = "CFACODPA")
public class CfacodpaEntity {

    @Id
    @Column(name = "ID_CFACODPA", table = "CFACODPA", nullable = false)
    private Integer idCfacodpa;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "CFACODPA")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "CFACODPA")
    private Integer idCfaclifoComun;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFACODPA")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_APADIZIM", table = "CFACODPA")
    private Integer idApadizim;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFACODPA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFACODPA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFACODPA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFACODPA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFACODPA")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO", table = "CFACODPA")
    private String tipo;

    @Basic
    @Column(name = "CODIGO", table = "CFACODPA")
    private Integer codigo;

    @Basic
    @Column(name = "FICHA", table = "CFACODPA")
    private Integer ficha;

    public Integer getIdCfacodpa() {
        return idCfacodpa;
    }

    public void setIdCfacodpa(Integer idCfacodpa) {
        this.idCfacodpa = idCfacodpa;
    }

    public Integer getIdCfaclifoParoq() {
        return idCfaclifoParoq;
    }

    public void setIdCfaclifoParoq(Integer idCfaclifoParoq) {
        this.idCfaclifoParoq = idCfaclifoParoq;
    }

    public Integer getIdCfaclifoComun() {
        return idCfaclifoComun;
    }

    public void setIdCfaclifoComun(Integer idCfaclifoComun) {
        this.idCfaclifoComun = idCfaclifoComun;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdApadizim() {
        return idApadizim;
    }

    public void setIdApadizim(Integer idApadizim) {
        this.idApadizim = idApadizim;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getFicha() {
        return ficha;
    }

    public void setFicha(Integer ficha) {
        this.ficha = ficha;
    }

}