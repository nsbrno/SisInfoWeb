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
@Table(name = "CTAHIPAD")
public class CtahipadEntity {

    @Id
    @Column(name = "ID_CTAHIPAD", table = "CTAHIPAD", nullable = false)
    private Integer idCtahipad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CTAHIPAD", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CTAHIPAD", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CTAHIPAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CTAHIPAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CTAHIPAD")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "CTAHIPAD")
    private Integer codigo;

    @Lob
    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CTAHIPAD", nullable = false)
    private byte[] descricao;

    public Integer getIdCtahipad() {
        return idCtahipad;
    }

    public void setIdCtahipad(Integer idCtahipad) {
        this.idCtahipad = idCtahipad;
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