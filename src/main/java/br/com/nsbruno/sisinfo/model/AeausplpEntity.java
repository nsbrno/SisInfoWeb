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
@Table(name = "AEAUSPLP")
public class AeausplpEntity {

    @Id
    @Column(name = "ID_AEAUSPLP", table = "AEAUSPLP", nullable = false)
    private Integer idAeausplp;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLPGT", table = "AEAUSPLP", nullable = false)
    private int idAeaplpgt;

    @Basic(optional = false)
    @Column(name = "ID_SMAUSUAR", table = "AEAUSPLP", nullable = false)
    private int idSmausuar;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAUSPLP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAUSPLP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAUSPLP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAUSPLP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAUSPLP")
    private Integer ctInteg;

    @Basic
    @Column(name = "ACAO", table = "AEAUSPLP")
    private String acao;

    public Integer getIdAeausplp() {
        return idAeausplp;
    }

    public void setIdAeausplp(Integer idAeausplp) {
        this.idAeausplp = idAeausplp;
    }

    public int getIdAeaplpgt() {
        return idAeaplpgt;
    }

    public void setIdAeaplpgt(int idAeaplpgt) {
        this.idAeaplpgt = idAeaplpgt;
    }

    public int getIdSmausuar() {
        return idSmausuar;
    }

    public void setIdSmausuar(int idSmausuar) {
        this.idSmausuar = idSmausuar;
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

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

}