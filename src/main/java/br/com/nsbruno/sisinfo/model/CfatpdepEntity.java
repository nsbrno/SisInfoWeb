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
@Table(name = "CFATPDEP")
public class CfatpdepEntity {

    @Id
    @Column(name = "ID_CFATPDEP", table = "CFATPDEP", nullable = false)
    private Integer idCfatpdep;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFATPDEP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFATPDEP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFATPDEP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFATPDEP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFATPDEP")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFATPDEP", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFATPDEP", nullable = false, length = 40)
    private String descricao;

    public Integer getIdCfatpdep() {
        return idCfatpdep;
    }

    public void setIdCfatpdep(Integer idCfatpdep) {
        this.idCfatpdep = idCfatpdep;
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

}