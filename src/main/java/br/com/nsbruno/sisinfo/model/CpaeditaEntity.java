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
@Table(name = "CPAEDITA")
public class CpaeditaEntity {

    @Id
    @Column(name = "ID_CPAEDITA", table = "CPAEDITA", nullable = false)
    private Integer idCpaedita;

    @Basic
    @Column(name = "US_CAD", table = "CPAEDITA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPAEDITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPAEDITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPAEDITA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPAEDITA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "CPAEDITA")
    private Integer codigo;

    @Basic
    @Column(name = "DT_EDITAL", table = "CPAEDITA")
    @Temporal(TemporalType.DATE)
    private Date dtEdital;

    @Basic
    @Column(name = "DT_PREV_PROT", table = "CPAEDITA")
    @Temporal(TemporalType.DATE)
    private Date dtPrevProt;

    public Integer getIdCpaedita() {
        return idCpaedita;
    }

    public void setIdCpaedita(Integer idCpaedita) {
        this.idCpaedita = idCpaedita;
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

    public Date getDtEdital() {
        return dtEdital;
    }

    public void setDtEdital(Date dtEdital) {
        this.dtEdital = dtEdital;
    }

    public Date getDtPrevProt() {
        return dtPrevProt;
    }

    public void setDtPrevProt(Date dtPrevProt) {
        this.dtPrevProt = dtPrevProt;
    }

}