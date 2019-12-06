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
@Table(name = "CFAFERIA")
public class CfaferiaEntity {

    @Id
    @Column(name = "ID_CFAFERIA", table = "CFAFERIA", nullable = false)
    private Integer idCfaferia;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAFERIA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAFERIA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAFERIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAFERIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAFERIA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFAFERIA", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "DATA", table = "CFAFERIA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CFAFERIA", nullable = false)
    private String tipo;

    @Basic(optional = false)
    @Column(name = "ABRANGENCIA", table = "CFAFERIA", nullable = false)
    private String abrangencia;

    public Integer getIdCfaferia() {
        return idCfaferia;
    }

    public void setIdCfaferia(Integer idCfaferia) {
        this.idCfaferia = idCfaferia;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAbrangencia() {
        return abrangencia;
    }

    public void setAbrangencia(String abrangencia) {
        this.abrangencia = abrangencia;
    }

}