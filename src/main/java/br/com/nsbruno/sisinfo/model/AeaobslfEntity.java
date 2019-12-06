package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AEAOBSLF")
public class AeaobslfEntity {

    @Id
    @Column(name = "ID_AEAOBSLF", table = "AEAOBSLF", nullable = false)
    private Integer idAeaobslf;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEAOBSLF")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "AEAOBSLF")
    private Integer idAeanfsai;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAOBSLF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAOBSLF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAOBSLF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAOBSLF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAOBSLF")
    private Integer ctInteg;

    @Basic
    @Column(name = "COD_OBS", table = "AEAOBSLF", length = 6)
    private String codObs;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "AEAOBSLF")
    private byte[] complemento;

    public Integer getIdAeaobslf() {
        return idAeaobslf;
    }

    public void setIdAeaobslf(Integer idAeaobslf) {
        this.idAeaobslf = idAeaobslf;
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

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

}