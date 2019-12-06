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
@Table(name = "CPAESPEC")
public class CpaespecEntity {

    @Id
    @Column(name = "ID_CPAESPEC", table = "CPAESPEC", nullable = false)
    private Integer idCpaespec;

    @Basic
    @Column(name = "US_CAD", table = "CPAESPEC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPAESPEC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPAESPEC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPAESPEC")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPAESPEC", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CPAESPEC", nullable = false, length = 3)
    private String codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CPAESPEC", nullable = false, length = 40)
    private String descricao;

    public Integer getIdCpaespec() {
        return idCpaespec;
    }

    public void setIdCpaespec(Integer idCpaespec) {
        this.idCpaespec = idCpaespec;
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

}