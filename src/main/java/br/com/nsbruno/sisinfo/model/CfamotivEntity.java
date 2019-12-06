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
@Table(name = "CFAMOTIV")
public class CfamotivEntity {

    @Id
    @Column(name = "ID_CFAMOTIV", table = "CFAMOTIV", nullable = false)
    private Integer idCfamotiv;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAMOTIV", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAMOTIV", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAMOTIV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAMOTIV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAMOTIV")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFAMOTIV", nullable = false)
    private int codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "CFAMOTIV", length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CFAMOTIV", nullable = false)
    private String tipo;

    public Integer getIdCfamotiv() {
        return idCfamotiv;
    }

    public void setIdCfamotiv(Integer idCfamotiv) {
        this.idCfamotiv = idCfamotiv;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}