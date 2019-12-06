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
@Table(name = "AEALISSE")
public class AealisseEntity {

    @Id
    @Column(name = "ID_AEALISSE", table = "AEALISSE", nullable = false)
    private Integer idAealisse;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEALISSE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEALISSE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEALISSE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEALISSE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEALISSE")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEALISSE", length = 6)
    private String codigo;

    @Lob
    @Basic
    @Column(name = "DESCRICAO", table = "AEALISSE")
    private byte[] descricao;

    public Integer getIdAealisse() {
        return idAealisse;
    }

    public void setIdAealisse(Integer idAealisse) {
        this.idAealisse = idAealisse;
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