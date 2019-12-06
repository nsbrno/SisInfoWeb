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
@Table(name = "AEAPRECO")
public class AeaprecoEntity {

    @Id
    @Column(name = "ID_AEAPRECO", table = "AEAPRECO", nullable = false)
    private Integer idAeapreco;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "AEAPRECO")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "AEAPRECO")
    private Integer idAeaprodu;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "AEAPRECO")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_AEAPLPGT", table = "AEAPRECO")
    private Integer idAeaplpgt;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPRECO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPRECO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPRECO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPRECO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPRECO")
    private Integer ctInteg;

    @Basic
    @Column(name = "CALCULA_JUROS", table = "AEAPRECO")
    private String calculaJuros;

    @Basic
    @Column(name = "FORMA", table = "AEAPRECO")
    private String forma;

    @Basic(optional = false)
    @Column(name = "VENDA_ATAC", table = "AEAPRECO", nullable = false)
    private double vendaAtac;

    @Basic(optional = false)
    @Column(name = "VENDA_VARE", table = "AEAPRECO", nullable = false)
    private double vendaVare;

    public Integer getIdAeapreco() {
        return idAeapreco;
    }

    public void setIdAeapreco(Integer idAeapreco) {
        this.idAeapreco = idAeapreco;
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

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdAeaplpgt() {
        return idAeaplpgt;
    }

    public void setIdAeaplpgt(Integer idAeaplpgt) {
        this.idAeaplpgt = idAeaplpgt;
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

    public String getCalculaJuros() {
        return calculaJuros;
    }

    public void setCalculaJuros(String calculaJuros) {
        this.calculaJuros = calculaJuros;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public double getVendaAtac() {
        return vendaAtac;
    }

    public void setVendaAtac(double vendaAtac) {
        this.vendaAtac = vendaAtac;
    }

    public double getVendaVare() {
        return vendaVare;
    }

    public void setVendaVare(double vendaVare) {
        this.vendaVare = vendaVare;
    }

}