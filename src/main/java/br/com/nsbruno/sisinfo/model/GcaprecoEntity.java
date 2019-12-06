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
@Table(name = "GCAPRECO")
public class GcaprecoEntity {

    @Id
    @Column(name = "ID_GCAPRECO", table = "GCAPRECO", nullable = false)
    private Integer idGcapreco;

    @Basic
    @Column(name = "ID_GCATPLOC", table = "GCAPRECO")
    private Integer idGcatploc;

    @Basic
    @Column(name = "ID_GCAPRODU", table = "GCAPRECO")
    private Integer idGcaprodu;

    @Basic
    @Column(name = "US_CAD", table = "GCAPRECO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "GCAPRECO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "GCAPRECO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "GCAPRECO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "GCAPRECO", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "PRECO", table = "GCAPRECO", nullable = false)
    private double preco;

    @Basic(optional = false)
    @Column(name = "MULTA_DIARIA", table = "GCAPRECO", nullable = false)
    private double multaDiaria;

    @Basic(optional = false)
    @Column(name = "DESCONTO_DIARIO", table = "GCAPRECO", nullable = false)
    private double descontoDiario;

    public Integer getIdGcapreco() {
        return idGcapreco;
    }

    public void setIdGcapreco(Integer idGcapreco) {
        this.idGcapreco = idGcapreco;
    }

    public Integer getIdGcatploc() {
        return idGcatploc;
    }

    public void setIdGcatploc(Integer idGcatploc) {
        this.idGcatploc = idGcatploc;
    }

    public Integer getIdGcaprodu() {
        return idGcaprodu;
    }

    public void setIdGcaprodu(Integer idGcaprodu) {
        this.idGcaprodu = idGcaprodu;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getMultaDiaria() {
        return multaDiaria;
    }

    public void setMultaDiaria(double multaDiaria) {
        this.multaDiaria = multaDiaria;
    }

    public double getDescontoDiario() {
        return descontoDiario;
    }

    public void setDescontoDiario(double descontoDiario) {
        this.descontoDiario = descontoDiario;
    }

}