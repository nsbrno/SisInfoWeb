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
@Table(name = "AEASAZON")
public class AeasazonEntity {

    @Id
    @Column(name = "ID_AEASAZON", table = "AEASAZON", nullable = false)
    private Integer idAeasazon;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEASAZON", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEASAZON", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEASAZON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEASAZON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEASAZON")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEASAZON", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "DT_INICIO1", table = "AEASAZON")
    @Temporal(TemporalType.DATE)
    private Date dtInicio1;

    @Basic
    @Column(name = "DT_INICIO2", table = "AEASAZON")
    @Temporal(TemporalType.DATE)
    private Date dtInicio2;

    @Basic
    @Column(name = "DT_INICIO3", table = "AEASAZON")
    @Temporal(TemporalType.DATE)
    private Date dtInicio3;

    @Basic
    @Column(name = "DT_FIM1", table = "AEASAZON")
    @Temporal(TemporalType.DATE)
    private Date dtFim1;

    @Basic
    @Column(name = "DT_FIM2", table = "AEASAZON")
    @Temporal(TemporalType.DATE)
    private Date dtFim2;

    @Basic
    @Column(name = "DT_FIM3", table = "AEASAZON")
    @Temporal(TemporalType.DATE)
    private Date dtFim3;

    public Integer getIdAeasazon() {
        return idAeasazon;
    }

    public void setIdAeasazon(Integer idAeasazon) {
        this.idAeasazon = idAeasazon;
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

    public Date getDtInicio1() {
        return dtInicio1;
    }

    public void setDtInicio1(Date dtInicio1) {
        this.dtInicio1 = dtInicio1;
    }

    public Date getDtInicio2() {
        return dtInicio2;
    }

    public void setDtInicio2(Date dtInicio2) {
        this.dtInicio2 = dtInicio2;
    }

    public Date getDtInicio3() {
        return dtInicio3;
    }

    public void setDtInicio3(Date dtInicio3) {
        this.dtInicio3 = dtInicio3;
    }

    public Date getDtFim1() {
        return dtFim1;
    }

    public void setDtFim1(Date dtFim1) {
        this.dtFim1 = dtFim1;
    }

    public Date getDtFim2() {
        return dtFim2;
    }

    public void setDtFim2(Date dtFim2) {
        this.dtFim2 = dtFim2;
    }

    public Date getDtFim3() {
        return dtFim3;
    }

    public void setDtFim3(Date dtFim3) {
        this.dtFim3 = dtFim3;
    }

}