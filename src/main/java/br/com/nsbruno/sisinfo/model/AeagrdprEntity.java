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
@Table(name = "AEAGRDPR")
public class AeagrdprEntity {

    @Id
    @Column(name = "ID_AEAGRDPR", table = "AEAGRDPR", nullable = false)
    private Integer idAeagrdpr;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "AEAGRDPR")
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "ID_AEAGRADE", table = "AEAGRDPR", nullable = false)
    private int idAeagrade;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAGRDPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAGRDPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAGRDPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAGRDPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAGRDPR")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO_BARRAS", table = "AEAGRDPR", length = 20)
    private String codigoBarras;

    @Basic
    @Column(name = "REFERENCIA", table = "AEAGRDPR", length = 20)
    private String referencia;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAGRDPR", nullable = false)
    private String ativo;

    public Integer getIdAeagrdpr() {
        return idAeagrdpr;
    }

    public void setIdAeagrdpr(Integer idAeagrdpr) {
        this.idAeagrdpr = idAeagrdpr;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public int getIdAeagrade() {
        return idAeagrade;
    }

    public void setIdAeagrade(int idAeagrade) {
        this.idAeagrade = idAeagrade;
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

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}