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
@Table(name = "AEACFREF")
public class AeacfrefEntity {

    @Id
    @Column(name = "ID_AEACFREF", table = "AEACFREF", nullable = false)
    private Integer idAeacfref;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEACFREF")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEAMODDF", table = "AEACFREF")
    private Integer idAeamoddf;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "AEACFREF")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_AEANFSAI_CUPOM", table = "AEACFREF")
    private Integer idAeanfsaiCupom;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "AEACFREF")
    private Integer idCfaestad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACFREF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACFREF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACFREF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACFREF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACFREF")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO", table = "AEACFREF")
    private String tipo;

    @Basic
    @Column(name = "ECF_CX", table = "AEACFREF")
    private Integer ecfCx;

    @Basic
    @Column(name = "SERIE", table = "AEACFREF", length = 3)
    private String serie;

    @Basic
    @Column(name = "NUM_DOC", table = "AEACFREF")
    private Integer numDoc;

    @Basic
    @Column(name = "ANO_MES", table = "AEACFREF", length = 4)
    private String anoMes;

    @Basic
    @Column(name = "DT_DOC", table = "AEACFREF")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;

    @Basic
    @Column(name = "CNPJ_EMIT", table = "AEACFREF", length = 18)
    private String cnpjEmit;

    @Basic
    @Column(name = "IE_EMIT", table = "AEACFREF", length = 18)
    private String ieEmit;

    @Basic
    @Column(name = "CHAVE", table = "AEACFREF", length = 50)
    private String chave;

    public Integer getIdAeacfref() {
        return idAeacfref;
    }

    public void setIdAeacfref(Integer idAeacfref) {
        this.idAeacfref = idAeacfref;
    }

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public Integer getIdAeamoddf() {
        return idAeamoddf;
    }

    public void setIdAeamoddf(Integer idAeamoddf) {
        this.idAeamoddf = idAeamoddf;
    }

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdAeanfsaiCupom() {
        return idAeanfsaiCupom;
    }

    public void setIdAeanfsaiCupom(Integer idAeanfsaiCupom) {
        this.idAeanfsaiCupom = idAeanfsaiCupom;
    }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getEcfCx() {
        return ecfCx;
    }

    public void setEcfCx(Integer ecfCx) {
        this.ecfCx = ecfCx;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public String getAnoMes() {
        return anoMes;
    }

    public void setAnoMes(String anoMes) {
        this.anoMes = anoMes;
    }

    public Date getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getCnpjEmit() {
        return cnpjEmit;
    }

    public void setCnpjEmit(String cnpjEmit) {
        this.cnpjEmit = cnpjEmit;
    }

    public String getIeEmit() {
        return ieEmit;
    }

    public void setIeEmit(String ieEmit) {
        this.ieEmit = ieEmit;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

}