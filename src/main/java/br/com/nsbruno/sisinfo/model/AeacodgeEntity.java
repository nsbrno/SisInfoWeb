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
@Table(name = "AEACODGE")
public class AeacodgeEntity {

    @Id
    @Column(name = "ID_AEACODGE", table = "AEACODGE", nullable = false)
    private Integer idAeacodge;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACODGE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACODGE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACODGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACODGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACODGE")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACODGE", length = 5)
    private String codigo;

    @Lob
    @Basic
    @Column(name = "DESCRICAO", table = "AEACODGE")
    private byte[] descricao;

    public Integer getIdAeacodge() {
        return idAeacodge;
    }

    public void setIdAeacodge(Integer idAeacodge) {
        this.idAeacodge = idAeacodge;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte[] getDescricao() {
        return descricao;
    }

    public void setDescricao(byte[] descricao) {
        this.descricao = descricao;
    }

}