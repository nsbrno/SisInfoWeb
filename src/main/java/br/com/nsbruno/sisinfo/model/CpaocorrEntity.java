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
@Table(name = "CPAOCORR")
public class CpaocorrEntity {

    @Id
    @Column(name = "ID_CPAOCORR", table = "CPAOCORR", nullable = false)
    private Integer idCpaocorr;

    @Basic
    @Column(name = "US_CAD", table = "CPAOCORR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPAOCORR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPAOCORR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPAOCORR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPAOCORR", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CPAOCORR", nullable = false)
    private String codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CPAOCORR", nullable = false, length = 50)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "PERC_CUSTAS", table = "CPAOCORR", nullable = false)
    private double percCustas;

    public Integer getIdCpaocorr() {
        return idCpaocorr;
    }

    public void setIdCpaocorr(Integer idCpaocorr) {
        this.idCpaocorr = idCpaocorr;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPercCustas() {
        return percCustas;
    }

    public void setPercCustas(double percCustas) {
        this.percCustas = percCustas;
    }

}