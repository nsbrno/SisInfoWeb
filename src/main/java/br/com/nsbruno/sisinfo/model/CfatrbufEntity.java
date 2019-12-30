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
@Table(name = "CFATRBUF")
public class CfatrbufEntity {

    @Id
    @Column(name = "ID_CFATRBUF", table = "CFATRBUF", nullable = false)
    private Integer idCfatrbuf;

    @Basic(optional = false)
    @Column(name = "ID_CFATRBPR", table = "CFATRBUF", nullable = false)
    private Integer idCfatrbpr;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CFATRBUF")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_AEACODST", table = "CFATRBUF")
    private Integer idAeacodst;

    @Basic
    @Column(name = "ID_AEAOBSPR", table = "CFATRBUF")
    private Integer idAeaobspr;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "CFATRBUF")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_CFANATOP", table = "CFATRBUF")
    private Integer idCfanatop;

    @Basic
    @Column(name = "ID_AEATBPER", table = "CFATRBUF")
    private Integer idAeatbper;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFATRBUF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFATRBUF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFATRBUF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFATRBUF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFATRBUF")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "ICMS_FIS", table = "CFATRBUF", nullable = false)
    private double icmsFis;

    @Basic(optional = false)
    @Column(name = "ICMS_JUR", table = "CFATRBUF", nullable = false)
    private double icmsJur;

    @Basic
    @Column(name = "TIPO_IPI", table = "CFATRBUF")
    private String tipoIpi;

    @Basic(optional = false)
    @Column(name = "IPI", table = "CFATRBUF", nullable = false)
    private double ipi;

    @Basic(optional = false)
    @Column(name = "REDUCAO_ICMS_FIS", table = "CFATRBUF", nullable = false)
    private double reducaoIcmsFis;

    @Basic(optional = false)
    @Column(name = "REDUCAO_ICMS_JUR", table = "CFATRBUF", nullable = false)
    private double reducaoIcmsJur;

    @Basic(optional = false)
    @Column(name = "MVA", table = "CFATRBUF", nullable = false)
    private double mva;

    @Basic(optional = false)
    @Column(name = "FCP", table = "CFATRBUF", nullable = false)
    private double fcp;

    public Integer getIdCfatrbuf() {
        return idCfatrbuf;
    }

    public void setIdCfatrbuf(Integer idCfatrbuf) {
        this.idCfatrbuf = idCfatrbuf;
    }

    public Integer getIdCfatrbpr() {
        return idCfatrbpr;
    }

    public void setIdCfatrbpr(Integer idCfatrbpr) {
        this.idCfatrbpr = idCfatrbpr;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
    }

    public Integer getIdAeacodst() {
        return idAeacodst;
    }

    public void setIdAeacodst(Integer idAeacodst) {
        this.idAeacodst = idAeacodst;
    }

    public Integer getIdAeaobspr() {
        return idAeaobspr;
    }

    public void setIdAeaobspr(Integer idAeaobspr) {
        this.idAeaobspr = idAeaobspr;
    }

    public Integer getIdCfacidad() {
        return idCfacidad;
    }

    public void setIdCfacidad(Integer idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public Integer getIdCfanatop() {
        return idCfanatop;
    }

    public void setIdCfanatop(Integer idCfanatop) {
        this.idCfanatop = idCfanatop;
    }

    public Integer getIdAeatbper() {
        return idAeatbper;
    }

    public void setIdAeatbper(Integer idAeatbper) {
        this.idAeatbper = idAeatbper;
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

    public double getIcmsFis() {
        return icmsFis;
    }

    public void setIcmsFis(double icmsFis) {
        this.icmsFis = icmsFis;
    }

    public double getIcmsJur() {
        return icmsJur;
    }

    public void setIcmsJur(double icmsJur) {
        this.icmsJur = icmsJur;
    }

    public String getTipoIpi() {
        return tipoIpi;
    }

    public void setTipoIpi(String tipoIpi) {
        this.tipoIpi = tipoIpi;
    }

    public double getIpi() {
        return ipi;
    }

    public void setIpi(double ipi) {
        this.ipi = ipi;
    }

    public double getReducaoIcmsFis() {
        return reducaoIcmsFis;
    }

    public void setReducaoIcmsFis(double reducaoIcmsFis) {
        this.reducaoIcmsFis = reducaoIcmsFis;
    }

    public double getReducaoIcmsJur() {
        return reducaoIcmsJur;
    }

    public void setReducaoIcmsJur(double reducaoIcmsJur) {
        this.reducaoIcmsJur = reducaoIcmsJur;
    }

    public double getMva() {
        return mva;
    }

    public void setMva(double mva) {
        this.mva = mva;
    }

    public double getFcp() {
        return fcp;
    }

    public void setFcp(double fcp) {
        this.fcp = fcp;
    }

}