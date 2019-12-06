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
@Table(name = "CPAMOTIV")
public class CpamotivEntity {

    @Id
    @Column(name = "ID_CPAMOTIV", table = "CPAMOTIV", nullable = false)
    private Integer idCpamotiv;

    @Basic
    @Column(name = "US_CAD", table = "CPAMOTIV", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPAMOTIV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPAMOTIV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPAMOTIV")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPAMOTIV", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CPAMOTIV", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CPAMOTIV", nullable = false, length = 40)
    private String descricao;

    public Integer getIdCpamotiv() {
        return idCpamotiv;
    }

    public void setIdCpamotiv(Integer idCpamotiv) {
        this.idCpamotiv = idCpamotiv;
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}