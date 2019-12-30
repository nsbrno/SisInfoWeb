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
@Table(name = "CFATRBPR")
public class CfatrbprEntity {

    @Id
    @Column(name = "ID_CFATRBPR", table = "CFATRBPR", nullable = false)
    private Integer idCfatrbpr;

    @Basic(optional = false)
    @Column(name = "ID_CFAESTAD", table = "CFATRBPR", nullable = false)
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_AEAAGPPR", table = "CFATRBPR")
    private Integer idAeaagppr;

    @Basic
    @Column(name = "ID_AEAMARCA", table = "CFATRBPR")
    private Integer idAeamarca;

    @Basic
    @Column(name = "ID_AEAFAMIL", table = "CFATRBPR")
    private Integer idAeafamil;

    @Basic
    @Column(name = "ID_AEACLASE", table = "CFATRBPR")
    private Integer idAeaclase;

    @Basic
    @Column(name = "ID_AEAGRUPO", table = "CFATRBPR")
    private Integer idAeagrupo;

    @Basic
    @Column(name = "ID_AEASGRUP", table = "CFATRBPR")
    private Integer idAeasgrup;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "CFATRBPR")
    private Integer idAeaprodu;

    @Basic
    @Column(name = "ID_AEACODOM", table = "CFATRBPR")
    private Integer idAeacodom;

    @Basic
    @Column(name = "ID_AEATBPER", table = "CFATRBPR")
    private Integer idAeatbper;

    @Basic
    @Column(name = "ID_AEACODST", table = "CFATRBPR")
    private Integer idAeacodst;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFATRBPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFATRBPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFATRBPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFATRBPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFATRBPR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "CFATRBPR", nullable = false)
    private Integer sequencia;

    @Basic
    @Column(name = "TIPO_IPI", table = "CFATRBPR")
    private String tipoIpi;

    @Basic(optional = false)
    @Column(name = "IPI", table = "CFATRBPR", nullable = false)
    private double ipi;

    @Basic(optional = false)
    @Column(name = "ICMS", table = "CFATRBPR", nullable = false)
    private double icms;

    @Basic(optional = false)
    @Column(name = "REDUCAO_ICMS", table = "CFATRBPR", nullable = false)
    private double reducaoIcms;

    @Basic(optional = false)
    @Column(name = "MVA", table = "CFATRBPR", nullable = false)
    private double mva;

    @Basic(optional = false)
    @Column(name = "FCP", table = "CFATRBPR", nullable = false)
    private double fcp;

    @Basic
    @Column(name = "EXCLUI_INCLUI", table = "CFATRBPR")
    private String excluiInclui;

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

    public Integer getIdAeaagppr() {
        return idAeaagppr;
    }

    public void setIdAeaagppr(Integer idAeaagppr) {
        this.idAeaagppr = idAeaagppr;
    }

    public Integer getIdAeamarca() {
        return idAeamarca;
    }

    public void setIdAeamarca(Integer idAeamarca) {
        this.idAeamarca = idAeamarca;
    }

    public Integer getIdAeafamil() {
        return idAeafamil;
    }

    public void setIdAeafamil(Integer idAeafamil) {
        this.idAeafamil = idAeafamil;
    }

    public Integer getIdAeaclase() {
        return idAeaclase;
    }

    public void setIdAeaclase(Integer idAeaclase) {
        this.idAeaclase = idAeaclase;
    }

    public Integer getIdAeagrupo() {
        return idAeagrupo;
    }

    public void setIdAeagrupo(Integer idAeagrupo) {
        this.idAeagrupo = idAeagrupo;
    }

    public Integer getIdAeasgrup() {
        return idAeasgrup;
    }

    public void setIdAeasgrup(Integer idAeasgrup) {
        this.idAeasgrup = idAeasgrup;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdAeacodom() {
        return idAeacodom;
    }

    public void setIdAeacodom(Integer idAeacodom) {
        this.idAeacodom = idAeacodom;
    }

    public Integer getIdAeatbper() {
        return idAeatbper;
    }

    public void setIdAeatbper(Integer idAeatbper) {
        this.idAeatbper = idAeatbper;
    }

    public Integer getIdAeacodst() {
        return idAeacodst;
    }

    public void setIdAeacodst(Integer idAeacodst) {
        this.idAeacodst = idAeacodst;
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

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getReducaoIcms() {
        return reducaoIcms;
    }

    public void setReducaoIcms(double reducaoIcms) {
        this.reducaoIcms = reducaoIcms;
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

    public String getExcluiInclui() {
        return excluiInclui;
    }

    public void setExcluiInclui(String excluiInclui) {
        this.excluiInclui = excluiInclui;
    }

}