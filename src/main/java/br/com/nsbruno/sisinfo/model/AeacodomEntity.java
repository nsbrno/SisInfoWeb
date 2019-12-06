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
@Table(name = "AEACODOM")
public class AeacodomEntity {

    @Id
    @Column(name = "ID_AEACODOM", table = "AEACODOM", nullable = false)
    private Integer idAeacodom;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACODOM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACODOM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACODOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACODOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACODOM")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACODOM")
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEACODOM", nullable = false, length = 40)
    private String descricao;

    public Integer getIdAeacodom() {
        return idAeacodom;
    }

    public void setIdAeacodom(Integer idAeacodom) {
        this.idAeacodom = idAeacodom;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}