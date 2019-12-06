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
@Table(name = "CFATPLOG")
public class CfatplogEntity {

    @Id
    @Column(name = "ID_CFATPLOG", table = "CFATPLOG", nullable = false)
    private Integer idCfatplog;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFATPLOG", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFATPLOG", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFATPLOG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFATPLOG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFATPLOG")
    private Integer ctInteg;

    @Basic
    @Column(name = "DESCRICAO", table = "CFATPLOG", length = 40)
    private String descricao;

    @Basic
    @Column(name = "SIGLA", table = "CFATPLOG", length = 18)
    private String sigla;

    @Basic
    @Column(name = "TIPO", table = "CFATPLOG")
    private String tipo;

    public Integer getIdCfatplog() {
        return idCfatplog;
    }

    public void setIdCfatplog(Integer idCfatplog) {
        this.idCfatplog = idCfatplog;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}