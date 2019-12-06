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
@Table(name = "CPAIRREG")
public class CpairregEntity {

    @Id
    @Column(name = "ID_CPAIRREG", table = "CPAIRREG", nullable = false)
    private Integer idCpairreg;

    @Basic
    @Column(name = "US_CAD", table = "CPAIRREG", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPAIRREG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPAIRREG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPAIRREG")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPAIRREG", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "CPAIRREG", length = 2)
    private String codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "CPAIRREG", length = 50)
    private String descricao;

    public Integer getIdCpairreg() {
        return idCpairreg;
    }

    public void setIdCpairreg(Integer idCpairreg) {
        this.idCpairreg = idCpairreg;
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