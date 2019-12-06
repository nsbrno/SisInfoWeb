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
@Table(name = "CFAFOTOS")
public class CfafotosEntity {

    @Id
    @Column(name = "ID_CFAFOTOS", table = "CFAFOTOS", nullable = false)
    private Integer idCfafotos;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFAFOTOS")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "CFAFOTOS")
    private Integer idAeaprodu;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "CFAFOTOS")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_GCAPRODU", table = "CFAFOTOS")
    private Integer idGcaprodu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAFOTOS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAFOTOS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAFOTOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAFOTOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAFOTOS")
    private Integer ctInteg;

    @Lob
    @Basic
    @Column(name = "FOTO", table = "CFAFOTOS")
    private byte[] foto;

    public Integer getIdCfafotos() {
        return idCfafotos;
    }

    public void setIdCfafotos(Integer idCfafotos) {
        this.idCfafotos = idCfafotos;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdGcaprodu() {
        return idGcaprodu;
    }

    public void setIdGcaprodu(Integer idGcaprodu) {
        this.idGcaprodu = idGcaprodu;
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

}