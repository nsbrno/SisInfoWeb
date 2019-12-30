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
@Table(name = "AEAITINV")
public class AeaitinvEntity {

    @Id
    @Column(name = "ID_AEAITINV", table = "AEAITINV", nullable = false)
    private Integer idAeaitinv;

    @Basic(optional = false)
    @Column(name = "ID_AEAINVEN", table = "AEAITINV", nullable = false)
    private Integer idAeainven;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ", table = "AEAITINV", nullable = false)
    private Integer idAeaestoq;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAITINV", nullable = false)
    private Integer idAeaunven;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITINV", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITINV", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITINV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITINV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITINV")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITINV", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE_C", table = "AEAITINV", nullable = false)
    private double quantidadeC;

    @Basic(optional = false)
    @Column(name = "ESTOQUE_F_ANT", table = "AEAITINV", nullable = false)
    private double estoqueFAnt;

    @Basic(optional = false)
    @Column(name = "ESTOQUE_C_ANT", table = "AEAITINV", nullable = false)
    private double estoqueCAnt;

    public Integer getIdAeaitinv() {
        return idAeaitinv;
    }

    public void setIdAeaitinv(Integer idAeaitinv) {
        this.idAeaitinv = idAeaitinv;
    }

    public Integer getIdAeainven() {
        return idAeainven;
    }

    public void setIdAeainven(Integer idAeainven) {
        this.idAeainven = idAeainven;
    }

    public Integer getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(Integer idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidadeC() {
        return quantidadeC;
    }

    public void setQuantidadeC(double quantidadeC) {
        this.quantidadeC = quantidadeC;
    }

    public double getEstoqueFAnt() {
        return estoqueFAnt;
    }

    public void setEstoqueFAnt(double estoqueFAnt) {
        this.estoqueFAnt = estoqueFAnt;
    }

    public double getEstoqueCAnt() {
        return estoqueCAnt;
    }

    public void setEstoqueCAnt(double estoqueCAnt) {
        this.estoqueCAnt = estoqueCAnt;
    }

}