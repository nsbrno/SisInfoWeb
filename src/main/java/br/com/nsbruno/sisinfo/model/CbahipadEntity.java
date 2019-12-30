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
@Table(name = "CBAHIPAD")
public class CbahipadEntity {

    @Id
    @Column(name = "ID_CBAHIPAD", table = "CBAHIPAD", nullable = false)
    private Integer idCbahipad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBAHIPAD", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBAHIPAD", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBAHIPAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBAHIPAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBAHIPAD")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CBAHIPAD", nullable = false)
    private Integer codigo;

    @Lob
    @Basic
    @Column(name = "DESCRICAO", table = "CBAHIPAD")
    private byte[] descricao;

    public Integer getIdCbahipad() {
        return idCbahipad;
    }

    public void setIdCbahipad(Integer idCbahipad) {
        this.idCbahipad = idCbahipad;
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

    public byte[] getDescricao() {
        return descricao;
    }

    public void setDescricao(byte[] descricao) {
        this.descricao = descricao;
    }

}