package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SMAITREL")
public class SmaitrelEntity {

    @Id
    @Column(name = "ID_SMAITREL", table = "SMAITREL", nullable = false)
    private Integer idSmaitrel;

    @Basic(optional = false)
    @Column(name = "ID_SMARELAT", table = "SMAITREL", nullable = false)
    private int idSmarelat;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAITREL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAITREL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAITREL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAITREL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAITREL")
    private Integer ctInteg;

    @Basic
    @Column(name = "NOME_ARQUIVO", table = "SMAITREL", length = 20)
    private String nomeArquivo;

    @Lob
    @Basic
    @Column(name = "SQL", table = "SMAITREL")
    private byte[] sql;

    public Integer getIdSmaitrel() {
        return idSmaitrel;
    }

    public void setIdSmaitrel(Integer idSmaitrel) {
        this.idSmaitrel = idSmaitrel;
    }

    public int getIdSmarelat() {
        return idSmarelat;
    }

    public void setIdSmarelat(int idSmarelat) {
        this.idSmarelat = idSmarelat;
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

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public byte[] getSql() {
        return sql;
    }

    public void setSql(byte[] sql) {
        this.sql = sql;
    }

}