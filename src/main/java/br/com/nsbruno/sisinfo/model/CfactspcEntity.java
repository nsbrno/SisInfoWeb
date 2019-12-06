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
@Table(name = "CFACTSPC")
public class CfactspcEntity {

    @Id
    @Column(name = "ID_CFACTSPC", table = "CFACTSPC", nullable = false)
    private Integer idCfactspc;

    @Basic
    @Column(name = "ID_AEAORCAM", table = "CFACTSPC")
    private Integer idAeaorcam;

    @Basic
    @Column(name = "ID_AEASAIDA", table = "CFACTSPC")
    private Integer idAeasaida;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "CFACTSPC")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_RPAPARCE", table = "CFACTSPC")
    private Integer idRpaparce;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFACTSPC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFACTSPC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFACTSPC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFACTSPC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFACTSPC")
    private Integer ctInteg;

    @Lob
    @Basic
    @Column(name = "RESULTADO", table = "CFACTSPC")
    private byte[] resultado;

    @Basic
    @Column(name = "ID_CFAHISTO", table = "CFACTSPC")
    private Integer idCfahisto;

    public Integer getIdCfactspc() {
        return idCfactspc;
    }

    public void setIdCfactspc(Integer idCfactspc) {
        this.idCfactspc = idCfactspc;
    }

    public Integer getIdAeaorcam() {
        return idAeaorcam;
    }

    public void setIdAeaorcam(Integer idAeaorcam) {
        this.idAeaorcam = idAeaorcam;
    }

    public Integer getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdRpaparce() {
        return idRpaparce;
    }

    public void setIdRpaparce(Integer idRpaparce) {
        this.idRpaparce = idRpaparce;
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

    public byte[] getResultado() {
        return resultado;
    }

    public void setResultado(byte[] resultado) {
        this.resultado = resultado;
    }

    public Integer getIdCfahisto() {
        return idCfahisto;
    }

    public void setIdCfahisto(Integer idCfahisto) {
        this.idCfahisto = idCfahisto;
    }

}