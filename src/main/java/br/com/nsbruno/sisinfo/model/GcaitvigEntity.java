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
@Table(name = "GCAITVIG")
public class GcaitvigEntity {

    @Id
    @Column(name = "ID_GCAITVIG", table = "GCAITVIG", nullable = false)
    private Integer idGcaitvig;

    @Basic
    @Column(name = "ID_GCAVIGEN", table = "GCAITVIG")
    private Integer idGcavigen;

    @Basic
    @Column(name = "ID_GCAPRODU", table = "GCAITVIG")
    private Integer idGcaprodu;

    @Basic
    @Column(name = "US_CAD", table = "GCAITVIG", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "GCAITVIG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "GCAITVIG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "GCAITVIG")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "GCAITVIG", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DATA_BAIXA", table = "GCAITVIG")
    @Temporal(TemporalType.DATE)
    private Date dataBaixa;

    @Basic(optional = false)
    @Column(name = "PRECO", table = "GCAITVIG", nullable = false)
    private double preco;

    @Lob
    @Basic
    @Column(name = "OBSERVACAO", table = "GCAITVIG")
    private byte[] observacao;

    @Basic
    @Column(name = "ATRASADO_ANTECIPADO", table = "GCAITVIG")
    private String atrasadoAntecipado;

    @Basic(optional = false)
    @Column(name = "RECALCULA_DIAS", table = "GCAITVIG", nullable = false)
    private int recalculaDias;

    @Basic(optional = false)
    @Column(name = "MULTA_DIARIA", table = "GCAITVIG", nullable = false)
    private double multaDiaria;

    @Basic(optional = false)
    @Column(name = "DESCONTO_DIARIO", table = "GCAITVIG", nullable = false)
    private double descontoDiario;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "GCAITVIG", nullable = false)
    private double quantidade;

    public Integer getIdGcaitvig() {
        return idGcaitvig;
    }

    public void setIdGcaitvig(Integer idGcaitvig) {
        this.idGcaitvig = idGcaitvig;
    }

    public Integer getIdGcavigen() {
        return idGcavigen;
    }

    public void setIdGcavigen(Integer idGcavigen) {
        this.idGcavigen = idGcavigen;
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

    public Date getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public byte[] getObservacao() {
        return observacao;
    }

    public void setObservacao(byte[] observacao) {
        this.observacao = observacao;
    }

    public String getAtrasadoAntecipado() {
        return atrasadoAntecipado;
    }

    public void setAtrasadoAntecipado(String atrasadoAntecipado) {
        this.atrasadoAntecipado = atrasadoAntecipado;
    }

    public int getRecalculaDias() {
        return recalculaDias;
    }

    public void setRecalculaDias(int recalculaDias) {
        this.recalculaDias = recalculaDias;
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}