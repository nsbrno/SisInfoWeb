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
@Table(name = "APADIMIN")
public class ApadiminEntity {

    @Id
    @Column(name = "ID_APADIMIN", table = "APADIMIN", nullable = false)
    private Integer idApadimin;

    @Basic
    @Column(name = "ID_APADIZIM", table = "APADIMIN")
    private Integer idApadizim;

    @Basic
    @Column(name = "ID_APAMINIS", table = "APADIMIN")
    private Integer idApaminis;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "APADIMIN")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "US_CAD", table = "APADIMIN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APADIMIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APADIMIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APADIMIN")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APADIMIN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DT_INICIAL", table = "APADIMIN")
    @Temporal(TemporalType.DATE)
    private Date dtInicial;

    @Basic
    @Column(name = "DT_FINAL", table = "APADIMIN")
    @Temporal(TemporalType.DATE)
    private Date dtFinal;

    public Integer getIdApadimin() {
        return idApadimin;
    }

    public void setIdApadimin(Integer idApadimin) {
        this.idApadimin = idApadimin;
    }

    public Integer getIdApadizim() {
        return idApadizim;
    }

    public void setIdApadizim(Integer idApadizim) {
        this.idApadizim = idApadizim;
    }

    public Integer getIdApaminis() {
        return idApaminis;
    }

    public void setIdApaminis(Integer idApaminis) {
        this.idApaminis = idApaminis;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public Date getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(Date dtInicial) {
        this.dtInicial = dtInicial;
    }

    public Date getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(Date dtFinal) {
        this.dtFinal = dtFinal;
    }

}