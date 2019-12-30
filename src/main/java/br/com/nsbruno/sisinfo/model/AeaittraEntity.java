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
@Table(name = "AEAITTRA")
public class AeaittraEntity {

    @Id
    @Column(name = "ID_AEAITTRA", table = "AEAITTRA", nullable = false)
    private Integer idAeaittra;

    @Basic(optional = false)
    @Column(name = "ID_AEATRANS", table = "AEAITTRA", nullable = false)
    private Integer idAeatrans;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ_ORIGEM", table = "AEAITTRA", nullable = false)
    private Integer idAeaestoqOrigem;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ_DESTINO", table = "AEAITTRA", nullable = false)
    private Integer idAeaestoqDestino;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAITTRA", nullable = false)
    private Integer idAeaunven;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITTRA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITTRA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITTRA")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_TRANSF", table = "AEAITTRA")
    @Temporal(TemporalType.DATE)
    private Date dtTransf;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITTRA", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "FLAG", table = "AEAITTRA", nullable = false)
    private Integer flag;

    @Basic
    @Column(name = "EST_ORIGEM", table = "AEAITTRA")
    private String estOrigem;

    @Basic
    @Column(name = "EST_DESTINO", table = "AEAITTRA")
    private String estDestino;

    public Integer getIdAeaittra() {
        return idAeaittra;
    }

    public void setIdAeaittra(Integer idAeaittra) {
        this.idAeaittra = idAeaittra;
    }

    public Integer getIdAeatrans() {
        return idAeatrans;
    }

    public void setIdAeatrans(Integer idAeatrans) {
        this.idAeatrans = idAeatrans;
    }

    public Integer getIdAeaestoqOrigem() {
        return idAeaestoqOrigem;
    }

    public void setIdAeaestoqOrigem(Integer idAeaestoqOrigem) {
        this.idAeaestoqOrigem = idAeaestoqOrigem;
    }

    public Integer getIdAeaestoqDestino() {
        return idAeaestoqDestino;
    }

    public void setIdAeaestoqDestino(Integer idAeaestoqDestino) {
        this.idAeaestoqDestino = idAeaestoqDestino;
    }

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
        this.idAeaunven = idAeaunven;
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

    public Date getDtTransf() {
        return dtTransf;
    }

    public void setDtTransf(Date dtTransf) {
        this.dtTransf = dtTransf;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getEstOrigem() {
        return estOrigem;
    }

    public void setEstOrigem(String estOrigem) {
        this.estOrigem = estOrigem;
    }

    public String getEstDestino() {
        return estDestino;
    }

    public void setEstDestino(String estDestino) {
        this.estDestino = estDestino;
    }

}