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
@Table(name = "SMAUSPRG")
public class SmausprgEntity {

    @Id
    @Column(name = "ID_SMAUSPRG", table = "SMAUSPRG", nullable = false)
    private Integer idSmausprg;

    @Basic(optional = false)
    @Column(name = "ID_SMAUSUAR", table = "SMAUSPRG", nullable = false)
    private int idSmausuar;

    @Basic
    @Column(name = "ID_SMAMENUS", table = "SMAUSPRG")
    private Integer idSmamenus;

    @Basic
    @Column(name = "ID_SMAMNPRG", table = "SMAUSPRG")
    private Integer idSmamnprg;

    @Basic
    @Column(name = "ID_SMAMNPRG_TELA", table = "SMAUSPRG")
    private Integer idSmamnprgTela;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAUSPRG", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAUSPRG", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAUSPRG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAUSPRG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAUSPRG")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "SMAUSPRG", nullable = false)
    private int sequencia;

    public Integer getIdSmausprg() {
        return idSmausprg;
    }

    public void setIdSmausprg(Integer idSmausprg) {
        this.idSmausprg = idSmausprg;
    }

    public int getIdSmausuar() {
        return idSmausuar;
    }

    public void setIdSmausuar(int idSmausuar) {
        this.idSmausuar = idSmausuar;
    }

    public Integer getIdSmamenus() {
        return idSmamenus;
    }

    public void setIdSmamenus(Integer idSmamenus) {
        this.idSmamenus = idSmamenus;
    }

    public Integer getIdSmamnprg() {
        return idSmamnprg;
    }

    public void setIdSmamnprg(Integer idSmamnprg) {
        this.idSmamnprg = idSmamnprg;
    }

    public Integer getIdSmamnprgTela() {
        return idSmamnprgTela;
    }

    public void setIdSmamnprgTela(Integer idSmamnprgTela) {
        this.idSmamnprgTela = idSmamnprgTela;
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

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

}