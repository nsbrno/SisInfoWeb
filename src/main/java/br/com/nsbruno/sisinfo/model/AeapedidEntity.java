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
@Table(name = "AEAPEDID")
public class AeapedidEntity {

    @Id
    @Column(name = "ID_AEAPEDID", table = "AEAPEDID", nullable = false)
    private Integer idAeapedid;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAPEDID", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "AEAPEDID", nullable = false)
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFACLIFO_CLIENTE", table = "AEAPEDID")
    private Integer idCfaclifoCliente;

    @Basic
    @Column(name = "ID_CFACLIFO_FUNC_PED", table = "AEAPEDID")
    private Integer idCfaclifoFuncPed;

    @Basic
    @Column(name = "ID_CFACLIFO_FUNC_AUT", table = "AEAPEDID")
    private Integer idCfaclifoFuncAut;

    @Basic
    @Column(name = "ID_CFACLIFO_FUNC_CONF", table = "AEAPEDID")
    private Integer idCfaclifoFuncConf;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPEDID", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPEDID", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPEDID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPEDID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPEDID")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAPEDID", nullable = false)
    private Integer codigo;

    @Basic
    @Column(name = "NUM_PEDIDO_FOR", table = "AEAPEDID", length = 20)
    private String numPedidoFor;

    @Basic(optional = false)
    @Column(name = "DT_PEDIDO", table = "AEAPEDID", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtPedido;

    @Basic
    @Column(name = "DT_ENVIADO", table = "AEAPEDID")
    @Temporal(TemporalType.DATE)
    private Date dtEnviado;

    @Basic
    @Column(name = "DT_PREVISAO", table = "AEAPEDID")
    @Temporal(TemporalType.DATE)
    private Date dtPrevisao;

    @Basic
    @Column(name = "DT_CONFIRMACAO", table = "AEAPEDID")
    @Temporal(TemporalType.DATE)
    private Date dtConfirmacao;

    @Basic
    @Column(name = "DT_ATENDIDO", table = "AEAPEDID")
    @Temporal(TemporalType.DATE)
    private Date dtAtendido;

    @Basic
    @Column(name = "DT_CANCELADO", table = "AEAPEDID")
    @Temporal(TemporalType.DATE)
    private Date dtCancelado;

    @Basic
    @Column(name = "FORMA_PAGAMENTO", table = "AEAPEDID")
    private String formaPagamento;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "AEAPEDID", nullable = false)
    private short situacao;

    @Basic
    @Column(name = "PRECO", table = "AEAPEDID")
    private String preco;

    @Basic(optional = false)
    @Column(name = "VL_PEDIDO", table = "AEAPEDID", nullable = false)
    private double vlPedido;

    @Basic(optional = false)
    @Column(name = "VL_ENTREGUE", table = "AEAPEDID", nullable = false)
    private double vlEntregue;

    @Basic(optional = false)
    @Column(name = "VL_CANCELADO", table = "AEAPEDID", nullable = false)
    private double vlCancelado;

    @Basic(optional = false)
    @Column(name = "DESCONTO1", table = "AEAPEDID", nullable = false)
    private double desconto1;

    @Basic(optional = false)
    @Column(name = "DESCONTO2", table = "AEAPEDID", nullable = false)
    private double desconto2;

    @Basic(optional = false)
    @Column(name = "DESCONTO3", table = "AEAPEDID", nullable = false)
    private double desconto3;

    @Basic(optional = false)
    @Column(name = "DESCONTO4", table = "AEAPEDID", nullable = false)
    private double desconto4;

    @Basic(optional = false)
    @Column(name = "DESCONTO5", table = "AEAPEDID", nullable = false)
    private double desconto5;

    @Basic(optional = false)
    @Column(name = "QUANT_PEDIDA", table = "AEAPEDID", nullable = false)
    private double quantPedida;

    @Basic(optional = false)
    @Column(name = "QUANT_CONF", table = "AEAPEDID", nullable = false)
    private double quantConf;

    @Basic(optional = false)
    @Column(name = "QUANT_ATENDIDA", table = "AEAPEDID", nullable = false)
    private double quantAtendida;

    @Basic(optional = false)
    @Column(name = "QUANT_CANCELADA", table = "AEAPEDID", nullable = false)
    private double quantCancelada;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAPEDID")
    private byte[] obs;

    public Integer getIdAeapedid() {
        return idAeapedid;
    }

    public void setIdAeapedid(Integer idAeapedid) {
        this.idAeapedid = idAeapedid;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaclifoCliente() {
        return idCfaclifoCliente;
    }

    public void setIdCfaclifoCliente(Integer idCfaclifoCliente) {
        this.idCfaclifoCliente = idCfaclifoCliente;
    }

    public Integer getIdCfaclifoFuncPed() {
        return idCfaclifoFuncPed;
    }

    public void setIdCfaclifoFuncPed(Integer idCfaclifoFuncPed) {
        this.idCfaclifoFuncPed = idCfaclifoFuncPed;
    }

    public Integer getIdCfaclifoFuncAut() {
        return idCfaclifoFuncAut;
    }

    public void setIdCfaclifoFuncAut(Integer idCfaclifoFuncAut) {
        this.idCfaclifoFuncAut = idCfaclifoFuncAut;
    }

    public Integer getIdCfaclifoFuncConf() {
        return idCfaclifoFuncConf;
    }

    public void setIdCfaclifoFuncConf(Integer idCfaclifoFuncConf) {
        this.idCfaclifoFuncConf = idCfaclifoFuncConf;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNumPedidoFor() {
        return numPedidoFor;
    }

    public void setNumPedidoFor(String numPedidoFor) {
        this.numPedidoFor = numPedidoFor;
    }

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public Date getDtEnviado() {
        return dtEnviado;
    }

    public void setDtEnviado(Date dtEnviado) {
        this.dtEnviado = dtEnviado;
    }

    public Date getDtPrevisao() {
        return dtPrevisao;
    }

    public void setDtPrevisao(Date dtPrevisao) {
        this.dtPrevisao = dtPrevisao;
    }

    public Date getDtConfirmacao() {
        return dtConfirmacao;
    }

    public void setDtConfirmacao(Date dtConfirmacao) {
        this.dtConfirmacao = dtConfirmacao;
    }

    public Date getDtAtendido() {
        return dtAtendido;
    }

    public void setDtAtendido(Date dtAtendido) {
        this.dtAtendido = dtAtendido;
    }

    public Date getDtCancelado() {
        return dtCancelado;
    }

    public void setDtCancelado(Date dtCancelado) {
        this.dtCancelado = dtCancelado;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public double getVlPedido() {
        return vlPedido;
    }

    public void setVlPedido(double vlPedido) {
        this.vlPedido = vlPedido;
    }

    public double getVlEntregue() {
        return vlEntregue;
    }

    public void setVlEntregue(double vlEntregue) {
        this.vlEntregue = vlEntregue;
    }

    public double getVlCancelado() {
        return vlCancelado;
    }

    public void setVlCancelado(double vlCancelado) {
        this.vlCancelado = vlCancelado;
    }

    public double getDesconto1() {
        return desconto1;
    }

    public void setDesconto1(double desconto1) {
        this.desconto1 = desconto1;
    }

    public double getDesconto2() {
        return desconto2;
    }

    public void setDesconto2(double desconto2) {
        this.desconto2 = desconto2;
    }

    public double getDesconto3() {
        return desconto3;
    }

    public void setDesconto3(double desconto3) {
        this.desconto3 = desconto3;
    }

    public double getDesconto4() {
        return desconto4;
    }

    public void setDesconto4(double desconto4) {
        this.desconto4 = desconto4;
    }

    public double getDesconto5() {
        return desconto5;
    }

    public void setDesconto5(double desconto5) {
        this.desconto5 = desconto5;
    }

    public double getQuantPedida() {
        return quantPedida;
    }

    public void setQuantPedida(double quantPedida) {
        this.quantPedida = quantPedida;
    }

    public double getQuantConf() {
        return quantConf;
    }

    public void setQuantConf(double quantConf) {
        this.quantConf = quantConf;
    }

    public double getQuantAtendida() {
        return quantAtendida;
    }

    public void setQuantAtendida(double quantAtendida) {
        this.quantAtendida = quantAtendida;
    }

    public double getQuantCancelada() {
        return quantCancelada;
    }

    public void setQuantCancelada(double quantCancelada) {
        this.quantCancelada = quantCancelada;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}