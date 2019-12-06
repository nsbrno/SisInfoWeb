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
@Table(name = "GCAVIGEN")
public class GcavigenEntity {

    @Id
    @Column(name = "ID_GCAVIGEN", table = "GCAVIGEN", nullable = false)
    private Integer idGcavigen;

    @Basic
    @Column(name = "ID_GCATPLOC", table = "GCAVIGEN")
    private Integer idGcatploc;

    @Basic
    @Column(name = "ID_GCACONTR", table = "GCAVIGEN")
    private Integer idGcacontr;

    @Basic
    @Column(name = "ID_CFACLIFO_VENDEDOR", table = "GCAVIGEN")
    private Integer idCfaclifoVendedor;

    @Basic
    @Column(name = "US_CAD", table = "GCAVIGEN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "GCAVIGEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "GCAVIGEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "GCAVIGEN")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "GCAVIGEN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DATA_INICIO", table = "GCAVIGEN")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Basic
    @Column(name = "DATA_TERMINO", table = "GCAVIGEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTermino;

    @Basic(optional = false)
    @Column(name = "VL_VIGENCIA", table = "GCAVIGEN", nullable = false)
    private double vlVigencia;

    @Basic
    @Column(name = "TIPO", table = "GCAVIGEN")
    private String tipo;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "GCAVIGEN", nullable = false)
    private short situacao;

    @Basic(optional = false)
    @Column(name = "STATUS", table = "GCAVIGEN", nullable = false)
    private int status;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "GCAVIGEN", nullable = false)
    private double quantidade;

    public Integer getIdGcavigen() {
        return idGcavigen;
    }

    public void setIdGcavigen(Integer idGcavigen) {
        this.idGcavigen = idGcavigen;
    }

    public Integer getIdGcatploc() {
        return idGcatploc;
    }

    public void setIdGcatploc(Integer idGcatploc) {
        this.idGcatploc = idGcatploc;
    }

    public Integer getIdGcacontr() {
        return idGcacontr;
    }

    public void setIdGcacontr(Integer idGcacontr) {
        this.idGcacontr = idGcacontr;
    }

    public Integer getIdCfaclifoVendedor() {
        return idCfaclifoVendedor;
    }

    public void setIdCfaclifoVendedor(Integer idCfaclifoVendedor) {
        this.idCfaclifoVendedor = idCfaclifoVendedor;
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getVlVigencia() {
        return vlVigencia;
    }

    public void setVlVigencia(double vlVigencia) {
        this.vlVigencia = vlVigencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}