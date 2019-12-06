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
@Table(name = "AEABICOS")
public class AeabicosEntity {

    @Id
    @Column(name = "ID_AEABICOS", table = "AEABICOS", nullable = false)
    private Integer idAeabicos;

    @Basic(optional = false)
    @Column(name = "ID_AEATANQU", table = "AEABICOS", nullable = false)
    private int idAeatanqu;

    @Basic(optional = false)
    @Column(name = "ID_AEABOMBA", table = "AEABICOS", nullable = false)
    private int idAeabomba;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEABICOS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEABICOS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEABICOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEABICOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEABICOS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEABICOS", nullable = false)
    private int numero;

    @Basic(optional = false)
    @Column(name = "CONTADOR", table = "AEABICOS", nullable = false)
    private double contador;

    @Basic(optional = false)
    @Column(name = "PRECO", table = "AEABICOS", nullable = false)
    private double preco;

    public Integer getIdAeabicos() {
        return idAeabicos;
    }

    public void setIdAeabicos(Integer idAeabicos) {
        this.idAeabicos = idAeabicos;
    }

    public int getIdAeatanqu() {
        return idAeatanqu;
    }

    public void setIdAeatanqu(int idAeatanqu) {
        this.idAeatanqu = idAeatanqu;
    }

    public int getIdAeabomba() {
        return idAeabomba;
    }

    public void setIdAeabomba(int idAeabomba) {
        this.idAeabomba = idAeabomba;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getContador() {
        return contador;
    }

    public void setContador(double contador) {
        this.contador = contador;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}