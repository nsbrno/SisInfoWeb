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
@Table(name = "AEAPRIOR")
public class AeapriorEntity {

    @Id
    @Column(name = "ID_AEAPRIOR", table = "AEAPRIOR", nullable = false)
    private Integer idAeaprior;

    @Basic
    @Column(name = "ID_AEAPRISM", table = "AEAPRIOR")
    private Integer idAeaprism;

    @Basic
    @Column(name = "ID_AEAORCAM", table = "AEAPRIOR")
    private Integer idAeaorcam;

    @Basic
    @Column(name = "ID_AEASAIDA", table = "AEAPRIOR")
    private Integer idAeasaida;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPRIOR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPRIOR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPRIOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPRIOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPRIOR")
    private Integer ctInteg;

    @Basic
    @Column(name = "ORCAMENTO", table = "AEAPRIOR", length = 15)
    private String orcamento;

    @Basic
    @Column(name = "DT_INICIO", table = "AEAPRIOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInicio;

    @Basic
    @Column(name = "DT_FIM", table = "AEAPRIOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFim;

    public Integer getIdAeaprior() {
        return idAeaprior;
    }

    public void setIdAeaprior(Integer idAeaprior) {
        this.idAeaprior = idAeaprior;
    }

    public Integer getIdAeaprism() {
        return idAeaprism;
    }

    public void setIdAeaprism(Integer idAeaprism) {
        this.idAeaprism = idAeaprism;
    }

    public Integer getIdAeaorcam() {
        return idAeaorcam;
    }

    public void setIdAeaorcam(Integer idAeaorcam) {
        this.idAeaorcam = idAeaorcam;
    }

    public Integer getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
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

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

}