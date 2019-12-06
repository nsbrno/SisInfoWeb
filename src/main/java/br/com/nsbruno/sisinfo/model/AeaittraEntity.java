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
    private int idAeatrans;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ_ORIGEM", table = "AEAITTRA", nullable = false)
    private int idAeaestoqOrigem;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ_DESTINO", table = "AEAITTRA", nullable = false)
    private int idAeaestoqDestino;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAITTRA", nullable = false)
    private int idAeaunven;

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
    private int flag;

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

    public int getIdAeatrans() {
        return idAeatrans;
    }

    public void setIdAeatrans(int idAeatrans) {
        this.idAeatrans = idAeatrans;
    }

    public int getIdAeaestoqOrigem() {
        return idAeaestoqOrigem;
    }

    public void setIdAeaestoqOrigem(int idAeaestoqOrigem) {
        this.idAeaestoqOrigem = idAeaestoqOrigem;
    }

    public int getIdAeaestoqDestino() {
        return idAeaestoqDestino;
    }

    public void setIdAeaestoqDestino(int idAeaestoqDestino) {
        this.idAeaestoqDestino = idAeaestoqDestino;
    }

    public int getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
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

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
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