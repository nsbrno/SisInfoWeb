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
@Table(name = "AEACODPR")
public class AeacodprEntity {

    @Id
    @Column(name = "ID_AEACODPR", table = "AEACODPR", nullable = false)
    private Integer idAeacodpr;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEACODPR", nullable = false)
    private int idAeaprodu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACODPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACODPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACODPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACODPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACODPR")
    private Integer ctInteg;

    @Basic
    @Column(name = "DESCRICAO", table = "AEACODPR", length = 40)
    private String descricao;

    @Basic
    @Column(name = "REFERENCIA", table = "AEACODPR", length = 20)
    private String referencia;

    @Basic
    @Column(name = "CODIGO_BARRAS", table = "AEACODPR", length = 20)
    private String codigoBarras;

    public Integer getIdAeacodpr() {
        return idAeacodpr;
    }

    public void setIdAeacodpr(Integer idAeacodpr) {
        this.idAeacodpr = idAeacodpr;
    }

    public int getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(int idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

}