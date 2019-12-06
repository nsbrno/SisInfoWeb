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
@Table(name = "AEATOTPA")
public class AeatotpaEntity {

    @Id
    @Column(name = "ID_AEATOTPA", table = "AEATOTPA", nullable = false)
    private Integer idAeatotpa;

    @Basic
    @Column(name = "ID_AEAECFTB", table = "AEATOTPA")
    private Integer idAeaecftb;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEATOTPA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEATOTPA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEATOTPA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEATOTPA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEATOTPA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQ", table = "AEATOTPA", nullable = false)
    private int seq;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA", table = "AEATOTPA", nullable = false)
    private double aliquota;

    @Basic
    @Column(name = "TIPO", table = "AEATOTPA")
    private String tipo;

    public Integer getIdAeatotpa() {
        return idAeatotpa;
    }

    public void setIdAeatotpa(Integer idAeatotpa) {
        this.idAeatotpa = idAeatotpa;
    }

    public Integer getIdAeaecftb() {
        return idAeaecftb;
    }

    public void setIdAeaecftb(Integer idAeaecftb) {
        this.idAeaecftb = idAeaecftb;
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

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}