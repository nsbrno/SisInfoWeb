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
@Table(name = "AEAEVEST")
public class AeaevestEntity {

    @Id
    @Column(name = "ID_AEAEVEST", table = "AEAEVEST", nullable = false)
    private Integer idAeaevest;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAEVEST", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAEVEST", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAEVEST", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAEVEST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAEVEST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAEVEST")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEAEVEST")
    private Integer codigo;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "AEAEVEST")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "TIPO", table = "AEAEVEST")
    private String tipo;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAEVEST")
    private byte[] obs;

    public Integer getIdAeaevest() {
        return idAeaevest;
    }

    public void setIdAeaevest(Integer idAeaevest) {
        this.idAeaevest = idAeaevest;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}