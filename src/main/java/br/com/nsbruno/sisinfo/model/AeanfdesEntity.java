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
@Table(name = "AEANFDES")
public class AeanfdesEntity {

    @Id
    @Column(name = "ID_AEANFDES", table = "AEANFDES", nullable = false)
    private Integer idAeanfdes;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "AEANFDES")
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEANFDES", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEANFDES", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEANFDES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEANFDES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEANFDES")
    private Integer ctInteg;

    @Basic
    @Column(name = "NSU", table = "AEANFDES", length = 60)
    private String nsu;

    @Basic
    @Column(name = "CHNFE", table = "AEANFDES", length = 60)
    private String chnfe;

    @Basic
    @Column(name = "XNOME", table = "AEANFDES", length = 60)
    private String xnome;

    @Basic
    @Column(name = "CNPJ", table = "AEANFDES", length = 18)
    private String cnpj;

    @Basic
    @Column(name = "IE", table = "AEANFDES", length = 18)
    private String ie;

    @Basic
    @Column(name = "DEMI", table = "AEANFDES")
    @Temporal(TemporalType.DATE)
    private Date demi;

    @Basic
    @Column(name = "TPNF", table = "AEANFDES")
    private String tpnf;

    @Basic(optional = false)
    @Column(name = "VNF", table = "AEANFDES", nullable = false)
    private double vnf;

    @Basic
    @Column(name = "DIGVAL", table = "AEANFDES", length = 128)
    private String digval;

    @Basic
    @Column(name = "DHRECBTO", table = "AEANFDES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dhrecbto;

    @Basic
    @Column(name = "CSITNFE", table = "AEANFDES")
    private String csitnfe;

    @Basic
    @Column(name = "CSITCONF", table = "AEANFDES")
    private String csitconf;

    @Basic
    @Column(name = "STATUS_MONITOR", table = "AEANFDES")
    private String statusMonitor;

    @Basic
    @Column(name = "FEZ_DOWNLOAD", table = "AEANFDES")
    private String fezDownload;

    @Basic
    @Column(name = "XJUST", table = "AEANFDES", length = 128)
    private String xjust;

    public Integer getIdAeanfdes() {
        return idAeanfdes;
    }

    public void setIdAeanfdes(Integer idAeanfdes) {
        this.idAeanfdes = idAeanfdes;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
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

    public String getNsu() {
        return nsu;
    }

    public void setNsu(String nsu) {
        this.nsu = nsu;
    }

    public String getChnfe() {
        return chnfe;
    }

    public void setChnfe(String chnfe) {
        this.chnfe = chnfe;
    }

    public String getXnome() {
        return xnome;
    }

    public void setXnome(String xnome) {
        this.xnome = xnome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Date getDemi() {
        return demi;
    }

    public void setDemi(Date demi) {
        this.demi = demi;
    }

    public String getTpnf() {
        return tpnf;
    }

    public void setTpnf(String tpnf) {
        this.tpnf = tpnf;
    }

    public double getVnf() {
        return vnf;
    }

    public void setVnf(double vnf) {
        this.vnf = vnf;
    }

    public String getDigval() {
        return digval;
    }

    public void setDigval(String digval) {
        this.digval = digval;
    }

    public Date getDhrecbto() {
        return dhrecbto;
    }

    public void setDhrecbto(Date dhrecbto) {
        this.dhrecbto = dhrecbto;
    }

    public String getCsitnfe() {
        return csitnfe;
    }

    public void setCsitnfe(String csitnfe) {
        this.csitnfe = csitnfe;
    }

    public String getCsitconf() {
        return csitconf;
    }

    public void setCsitconf(String csitconf) {
        this.csitconf = csitconf;
    }

    public String getStatusMonitor() {
        return statusMonitor;
    }

    public void setStatusMonitor(String statusMonitor) {
        this.statusMonitor = statusMonitor;
    }

    public String getFezDownload() {
        return fezDownload;
    }

    public void setFezDownload(String fezDownload) {
        this.fezDownload = fezDownload;
    }

    public String getXjust() {
        return xjust;
    }

    public void setXjust(String xjust) {
        this.xjust = xjust;
    }

}