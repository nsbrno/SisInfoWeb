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
@Table(name = "AEACAIXA")
public class AeacaixaEntity {

    @Id
    @Column(name = "ID_AEACAIXA", table = "AEACAIXA", nullable = false)
    private Integer idAeacaixa;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEACAIXA", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO_FUNC", table = "AEACAIXA", nullable = false)
    private int idCfaclifoFunc;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACAIXA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACAIXA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACAIXA")
    private Integer ctInteg;

    @Basic
    @Column(name = "NUMERO", table = "AEACAIXA")
    private Integer numero;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "AEACAIXA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "TURNO", table = "AEACAIXA", nullable = false)
    private String turno;

    @Basic(optional = false)
    @Column(name = "VL_RECEBIMENTOS", table = "AEACAIXA", nullable = false)
    private double vlRecebimentos;

    @Basic(optional = false)
    @Column(name = "VL_CARTAO", table = "AEACAIXA", nullable = false)
    private double vlCartao;

    @Basic(optional = false)
    @Column(name = "VL_NOTAS", table = "AEACAIXA", nullable = false)
    private double vlNotas;

    @Basic(optional = false)
    @Column(name = "VL_CHEQUE_VISTA", table = "AEACAIXA", nullable = false)
    private double vlChequeVista;

    @Basic(optional = false)
    @Column(name = "VL_CHEQUE_PRAZO", table = "AEACAIXA", nullable = false)
    private double vlChequePrazo;

    @Basic(optional = false)
    @Column(name = "VL_DINHEIRO", table = "AEACAIXA", nullable = false)
    private double vlDinheiro;

    @Basic(optional = false)
    @Column(name = "VL_SAIDAS", table = "AEACAIXA", nullable = false)
    private double vlSaidas;

    @Basic(optional = false)
    @Column(name = "VL_ENCERRANTE", table = "AEACAIXA", nullable = false)
    private double vlEncerrante;

    @Basic(optional = false)
    @Column(name = "VL_VENDAS", table = "AEACAIXA", nullable = false)
    private double vlVendas;

    @Basic(optional = false)
    @Column(name = "FECHADO", table = "AEACAIXA", nullable = false)
    private short fechado;

    @Basic
    @Column(name = "FC_VL_CAIXA", table = "AEACAIXA", precision = 15)
    private Double fcVlCaixa;

    @Basic
    @Column(name = "FC_VL_MOVTO", table = "AEACAIXA", precision = 15)
    private Double fcVlMovto;

    public Integer getIdAeacaixa() {
        return idAeacaixa;
    }

    public void setIdAeacaixa(Integer idAeacaixa) {
        this.idAeacaixa = idAeacaixa;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public int getIdCfaclifoFunc() {
        return idCfaclifoFunc;
    }

    public void setIdCfaclifoFunc(int idCfaclifoFunc) {
        this.idCfaclifoFunc = idCfaclifoFunc;
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

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getVlRecebimentos() {
        return vlRecebimentos;
    }

    public void setVlRecebimentos(double vlRecebimentos) {
        this.vlRecebimentos = vlRecebimentos;
    }

    public double getVlCartao() {
        return vlCartao;
    }

    public void setVlCartao(double vlCartao) {
        this.vlCartao = vlCartao;
    }

    public double getVlNotas() {
        return vlNotas;
    }

    public void setVlNotas(double vlNotas) {
        this.vlNotas = vlNotas;
    }

    public double getVlChequeVista() {
        return vlChequeVista;
    }

    public void setVlChequeVista(double vlChequeVista) {
        this.vlChequeVista = vlChequeVista;
    }

    public double getVlChequePrazo() {
        return vlChequePrazo;
    }

    public void setVlChequePrazo(double vlChequePrazo) {
        this.vlChequePrazo = vlChequePrazo;
    }

    public double getVlDinheiro() {
        return vlDinheiro;
    }

    public void setVlDinheiro(double vlDinheiro) {
        this.vlDinheiro = vlDinheiro;
    }

    public double getVlSaidas() {
        return vlSaidas;
    }

    public void setVlSaidas(double vlSaidas) {
        this.vlSaidas = vlSaidas;
    }

    public double getVlEncerrante() {
        return vlEncerrante;
    }

    public void setVlEncerrante(double vlEncerrante) {
        this.vlEncerrante = vlEncerrante;
    }

    public double getVlVendas() {
        return vlVendas;
    }

    public void setVlVendas(double vlVendas) {
        this.vlVendas = vlVendas;
    }

    public short getFechado() {
        return fechado;
    }

    public void setFechado(short fechado) {
        this.fechado = fechado;
    }

    public Double getFcVlCaixa() {
        return fcVlCaixa;
    }

    public void setFcVlCaixa(Double fcVlCaixa) {
        this.fcVlCaixa = fcVlCaixa;
    }

    public Double getFcVlMovto() {
        return fcVlMovto;
    }

    public void setFcVlMovto(Double fcVlMovto) {
        this.fcVlMovto = fcVlMovto;
    }

}