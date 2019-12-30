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
@Table(name = "AEANATOP")
public class AeanatopEntity {

    @Id
    @Column(name = "ID_AEANATOP", table = "AEANATOP", nullable = false)
    private Integer idAeanatop;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEANATOP")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "AEANATOP")
    private Integer idAeanfsai;

    @Basic(optional = false)
    @Column(name = "ID_CFANATOP", table = "AEANATOP", nullable = false)
    private Integer idCfanatop;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEANATOP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEANATOP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEANATOP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEANATOP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEANATOP")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEANATOP", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS", table = "AEANATOP", nullable = false)
    private double aliquotaIcms;

    @Basic(optional = false)
    @Column(name = "VL_CONTABIL_IPI", table = "AEANATOP", nullable = false)
    private double vlContabilIpi;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC_IPI", table = "AEANATOP", nullable = false)
    private double vlBaseCalcIpi;

    @Basic(optional = false)
    @Column(name = "VL_IPI", table = "AEANATOP", nullable = false)
    private double vlIpi;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_IPI", table = "AEANATOP", nullable = false)
    private double vlIsentoIpi;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS_IPI", table = "AEANATOP", nullable = false)
    private double vlOutrosIpi;

    @Basic(optional = false)
    @Column(name = "VL_CONTABIL_ICMS", table = "AEANATOP", nullable = false)
    private double vlContabilIcms;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC_ICMS", table = "AEANATOP", nullable = false)
    private double vlBaseCalcIcms;

    @Basic(optional = false)
    @Column(name = "VL_ICMS", table = "AEANATOP", nullable = false)
    private double vlIcms;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_ICMS", table = "AEANATOP", nullable = false)
    private double vlIsentoIcms;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS_ICMS", table = "AEANATOP", nullable = false)
    private double vlOutrosIcms;

    public Integer getIdAeanatop() {
        return idAeanatop;
    }

    public void setIdAeanatop(Integer idAeanatop) {
        this.idAeanatop = idAeanatop;
    }

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdCfanatop() {
        return idCfanatop;
    }

    public void setIdCfanatop(Integer idCfanatop) {
        this.idCfanatop = idCfanatop;
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

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getVlContabilIpi() {
        return vlContabilIpi;
    }

    public void setVlContabilIpi(double vlContabilIpi) {
        this.vlContabilIpi = vlContabilIpi;
    }

    public double getVlBaseCalcIpi() {
        return vlBaseCalcIpi;
    }

    public void setVlBaseCalcIpi(double vlBaseCalcIpi) {
        this.vlBaseCalcIpi = vlBaseCalcIpi;
    }

    public double getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public double getVlIsentoIpi() {
        return vlIsentoIpi;
    }

    public void setVlIsentoIpi(double vlIsentoIpi) {
        this.vlIsentoIpi = vlIsentoIpi;
    }

    public double getVlOutrosIpi() {
        return vlOutrosIpi;
    }

    public void setVlOutrosIpi(double vlOutrosIpi) {
        this.vlOutrosIpi = vlOutrosIpi;
    }

    public double getVlContabilIcms() {
        return vlContabilIcms;
    }

    public void setVlContabilIcms(double vlContabilIcms) {
        this.vlContabilIcms = vlContabilIcms;
    }

    public double getVlBaseCalcIcms() {
        return vlBaseCalcIcms;
    }

    public void setVlBaseCalcIcms(double vlBaseCalcIcms) {
        this.vlBaseCalcIcms = vlBaseCalcIcms;
    }

    public double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public double getVlIsentoIcms() {
        return vlIsentoIcms;
    }

    public void setVlIsentoIcms(double vlIsentoIcms) {
        this.vlIsentoIcms = vlIsentoIcms;
    }

    public double getVlOutrosIcms() {
        return vlOutrosIcms;
    }

    public void setVlOutrosIcms(double vlOutrosIcms) {
        this.vlOutrosIcms = vlOutrosIcms;
    }

}