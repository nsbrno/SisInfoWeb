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
@Table(name = "AEATANQU")
public class AeatanquEntity {

    @Id
    @Column(name = "ID_AEATANQU", table = "AEATANQU", nullable = false)
    private Integer idAeatanqu;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEATANQU", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEATANQU", nullable = false)
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEATANQU", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEATANQU", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEATANQU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEATANQU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEATANQU")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEATANQU", nullable = false)
    private Integer numero;

    @Basic
    @Column(name = "DESCRICAO", table = "AEATANQU", length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "CAPACIDADE", table = "AEATANQU", nullable = false)
    private double capacidade;

    @Basic(optional = false)
    @Column(name = "ESTOQUE", table = "AEATANQU", nullable = false)
    private double estoque;

    @Basic(optional = false)
    @Column(name = "ESTOQUE_MINIMO", table = "AEATANQU", nullable = false)
    private double estoqueMinimo;

    public Integer getIdAeatanqu() {
        return idAeatanqu;
    }

    public void setIdAeatanqu(Integer idAeatanqu) {
        this.idAeatanqu = idAeatanqu;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

}