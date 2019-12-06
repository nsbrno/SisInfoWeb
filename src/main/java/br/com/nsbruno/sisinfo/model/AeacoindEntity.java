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
@Table(name = "AEACOIND")
public class AeacoindEntity {

    @Id
    @Column(name = "ID_AEACOIND", table = "AEACOIND", nullable = false)
    private Integer idAeacoind;

    @Basic
    @Column(name = "ID_AEAITIND", table = "AEACOIND")
    private Integer idAeaitind;

    @Basic
    @Column(name = "US_CAD", table = "AEACOIND", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACOIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACOIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACOIND")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACOIND", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DT_CONCLUIDO", table = "AEACOIND")
    @Temporal(TemporalType.DATE)
    private Date dtConcluido;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEACOIND", nullable = false)
    private double quantidade;

    public Integer getIdAeacoind() {
        return idAeacoind;
    }

    public void setIdAeacoind(Integer idAeacoind) {
        this.idAeacoind = idAeacoind;
    }

    public Integer getIdAeaitind() {
        return idAeaitind;
    }

    public void setIdAeaitind(Integer idAeaitind) {
        this.idAeaitind = idAeaitind;
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

    public Date getDtConcluido() {
        return dtConcluido;
    }

    public void setDtConcluido(Date dtConcluido) {
        this.dtConcluido = dtConcluido;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}