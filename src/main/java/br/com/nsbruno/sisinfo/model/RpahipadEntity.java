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
@Table(name = "RPAHIPAD")
public class RpahipadEntity {

    @Id
    @Column(name = "ID_RPAHIPAD", table = "RPAHIPAD", nullable = false)
    private Integer idRpahipad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAHIPAD", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAHIPAD", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAHIPAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAHIPAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAHIPAD")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "RPAHIPAD", nullable = false)
    private int codigo;

    @Lob
    @Basic
    @Column(name = "DESCRICAO", table = "RPAHIPAD")
    private byte[] descricao;

    public Integer getIdRpahipad() {
        return idRpahipad;
    }

    public void setIdRpahipad(Integer idRpahipad) {
        this.idRpahipad = idRpahipad;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public byte[] getDescricao() {
        return descricao;
    }

    public void setDescricao(byte[] descricao) {
        this.descricao = descricao;
    }

}