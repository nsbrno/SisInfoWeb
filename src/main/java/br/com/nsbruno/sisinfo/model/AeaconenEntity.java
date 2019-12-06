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
@Table(name = "AEACONEN")
public class AeaconenEntity {

    @Id
    @Column(name = "ID_AEACONEN", table = "AEACONEN", nullable = false)
    private Integer idAeaconen;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACONEN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACONEN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACONEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "DT_CAD", table = "AEACONEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACONEN")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACONEN")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "AEACONEN", length = 128)
    private String descricao;

    public Integer getIdAeaconen() {
        return idAeaconen;
    }

    public void setIdAeaconen(Integer idAeaconen) {
        this.idAeaconen = idAeaconen;
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

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Date getDtCad() {
        return dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}