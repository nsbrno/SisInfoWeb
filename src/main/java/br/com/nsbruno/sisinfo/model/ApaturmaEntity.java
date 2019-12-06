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
@Table(name = "APATURMA")
public class ApaturmaEntity {

    @Id
    @Column(name = "ID_APATURMA", table = "APATURMA", nullable = false)
    private Integer idApaturma;

    @Basic(optional = false)
    @Column(name = "US_CAD", table = "APATURMA", nullable = false, length = 20)
    private String usCad;

    @Basic(optional = false)
    @Column(name = "DT_CAD", table = "APATURMA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic(optional = false)
    @Column(name = "DT_ALT", table = "APATURMA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APATURMA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APATURMA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "APATURMA")
    private Integer codigo;

    @Basic
    @Column(name = "TURMA", table = "APATURMA", length = 40)
    private String turma;

    public Integer getIdApaturma() {
        return idApaturma;
    }

    public void setIdApaturma(Integer idApaturma) {
        this.idApaturma = idApaturma;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}