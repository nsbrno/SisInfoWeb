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
@Table(name = "AEAITSAI")
public class AeaitsaiEntity {

    @Id
    @Column(name = "ID_AEAITSAI", table = "AEAITSAI", nullable = false)
    private Integer idAeaitsai;

    @Basic(optional = false)
    @Column(name = "ID_AEASAIDA", table = "AEAITSAI", nullable = false)
    private Integer idAeasaida;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLPGT", table = "AEAITSAI", nullable = false)
    private Integer idAeaplpgt;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAITSAI", nullable = false)
    private Integer idAeaunven;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ", table = "AEAITSAI", nullable = false)
    private Integer idAeaestoq;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO_VENDEDOR", table = "AEAITSAI", nullable = false)
    private Integer idCfaclifoVendedor;

    @Basic
    @Column(name = "ID_AEAITSAI_CONJ", table = "AEAITSAI")
    private Integer idAeaitsaiConj;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITSAI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITSAI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITSAI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITSAI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITSAI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_VENDA", table = "AEAITSAI", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtVenda;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEAITSAI", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "VL_CUSTO", table = "AEAITSAI", nullable = false)
    private double vlCusto;

    @Basic(optional = false)
    @Column(name = "VL_VISTA", table = "AEAITSAI", nullable = false)
    private double vlVista;

    @Basic(optional = false)
    @Column(name = "VL_VENDA", table = "AEAITSAI", nullable = false)
    private double vlVenda;

    @Basic(optional = false)
    @Column(name = "VL_TABELA", table = "AEAITSAI", nullable = false)
    private double vlTabela;

    @Basic(optional = false)
    @Column(name = "VL_BRUTO", table = "AEAITSAI", nullable = false)
    private double vlBruto;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "AEAITSAI", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITSAI", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "QTDE_DEVOL", table = "AEAITSAI", nullable = false)
    private double qtdeDevol;

    @Basic(optional = false)
    @Column(name = "QTDE_RETORNO", table = "AEAITSAI", nullable = false)
    private double qtdeRetorno;

    @Basic(optional = false)
    @Column(name = "QTDE_CONFERIDO", table = "AEAITSAI", nullable = false)
    private double qtdeConferido;

    @Basic
    @Column(name = "FC_VL_LIQUIDO", table = "AEAITSAI", precision = 15)
    private Double fcVlLiquido;

    @Basic
    @Column(name = "FC_VISTA_UN", table = "AEAITSAI", precision = 15)
    private Double fcVistaUn;

    @Basic
    @Column(name = "FC_VENDA_UN", table = "AEAITSAI", precision = 15)
    private Double fcVendaUn;

    @Basic
    @Column(name = "FC_CUSTO_UN", table = "AEAITSAI", precision = 15)
    private Double fcCustoUn;

    @Basic
    @Column(name = "FC_TABELA_UN", table = "AEAITSAI", precision = 15)
    private Double fcTabelaUn;

    @Basic
    @Column(name = "FC_BRUTO_UN", table = "AEAITSAI", precision = 15)
    private Double fcBrutoUn;

    @Basic
    @Column(name = "FC_DESCONTO_UN", table = "AEAITSAI", precision = 15)
    private Double fcDescontoUn;

    @Basic
    @Column(name = "FC_RETORNO", table = "AEAITSAI", precision = 15)
    private Double fcRetorno;

    @Basic(optional = false)
    @Column(name = "COMISSAO", table = "AEAITSAI", nullable = false)
    private double comissao;

    @Basic(optional = false)
    @Column(name = "COMISSAO_EXT", table = "AEAITSAI", nullable = false)
    private double comissaoExt;

    @Basic(optional = false)
    @Column(name = "PROMOCAO", table = "AEAITSAI", nullable = false)
    private String promocao;

    @Basic(optional = false)
    @Column(name = "TIPO_PRODUTO", table = "AEAITSAI", nullable = false)
    private String tipoProduto;

    @Basic(optional = false)
    @Column(name = "ATAC_VAREJO", table = "AEAITSAI", nullable = false)
    private String atacVarejo;

    @Basic(optional = false)
    @Column(name = "TIPO_BAIXA", table = "AEAITSAI", nullable = false)
    private String tipoBaixa;

    @Basic
    @Column(name = "TIPO_SAIDA", table = "AEAITSAI")
    private String tipoSaida;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "AEAITSAI")
    private byte[] complemento;

    @Basic
    @Column(name = "SEQ_DESCONTO", table = "AEAITSAI", length = 50)
    private String seqDesconto;

    @Basic
    @Column(name = "BAIXA_POR_CONF", table = "AEAITSAI")
    private String baixaPorConf;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_DESON", table = "AEAITSAI", nullable = false)
    private double vlIcmsDeson;

    @Basic(optional = false)
    @Column(name = "VL_PIS_DESON", table = "AEAITSAI", nullable = false)
    private double vlPisDeson;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_DESON", table = "AEAITSAI", nullable = false)
    private double vlCofinsDeson;

    @Basic(optional = false)
    @Column(name = "VL_IPI_DESON", table = "AEAITSAI", nullable = false)
    private double vlIpiDeson;

    public Integer getIdAeaitsai() {
        return idAeaitsai;
    }

    public void setIdAeaitsai(Integer idAeaitsai) {
        this.idAeaitsai = idAeaitsai;
    }

    public Integer getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public Integer getIdAeaplpgt() {
        return idAeaplpgt;
    }

    public void setIdAeaplpgt(Integer idAeaplpgt) {
        this.idAeaplpgt = idAeaplpgt;
    }

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public Integer getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(Integer idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
    }

    public Integer getIdCfaclifoVendedor() {
        return idCfaclifoVendedor;
    }

    public void setIdCfaclifoVendedor(Integer idCfaclifoVendedor) {
        this.idCfaclifoVendedor = idCfaclifoVendedor;
    }

    public Integer getIdAeaitsaiConj() {
        return idAeaitsaiConj;
    }

    public void setIdAeaitsaiConj(Integer idAeaitsaiConj) {
        this.idAeaitsaiConj = idAeaitsaiConj;
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

    public Date getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(Date dtVenda) {
        this.dtVenda = dtVenda;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public double getVlCusto() {
        return vlCusto;
    }

    public void setVlCusto(double vlCusto) {
        this.vlCusto = vlCusto;
    }

    public double getVlVista() {
        return vlVista;
    }

    public void setVlVista(double vlVista) {
        this.vlVista = vlVista;
    }

    public double getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(double vlVenda) {
        this.vlVenda = vlVenda;
    }

    public double getVlTabela() {
        return vlTabela;
    }

    public void setVlTabela(double vlTabela) {
        this.vlTabela = vlTabela;
    }

    public double getVlBruto() {
        return vlBruto;
    }

    public void setVlBruto(double vlBruto) {
        this.vlBruto = vlBruto;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQtdeDevol() {
        return qtdeDevol;
    }

    public void setQtdeDevol(double qtdeDevol) {
        this.qtdeDevol = qtdeDevol;
    }

    public double getQtdeRetorno() {
        return qtdeRetorno;
    }

    public void setQtdeRetorno(double qtdeRetorno) {
        this.qtdeRetorno = qtdeRetorno;
    }

    public double getQtdeConferido() {
        return qtdeConferido;
    }

    public void setQtdeConferido(double qtdeConferido) {
        this.qtdeConferido = qtdeConferido;
    }

    public Double getFcVlLiquido() {
        return fcVlLiquido;
    }

    public void setFcVlLiquido(Double fcVlLiquido) {
        this.fcVlLiquido = fcVlLiquido;
    }

    public Double getFcVistaUn() {
        return fcVistaUn;
    }

    public void setFcVistaUn(Double fcVistaUn) {
        this.fcVistaUn = fcVistaUn;
    }

    public Double getFcVendaUn() {
        return fcVendaUn;
    }

    public void setFcVendaUn(Double fcVendaUn) {
        this.fcVendaUn = fcVendaUn;
    }

    public Double getFcCustoUn() {
        return fcCustoUn;
    }

    public void setFcCustoUn(Double fcCustoUn) {
        this.fcCustoUn = fcCustoUn;
    }

    public Double getFcTabelaUn() {
        return fcTabelaUn;
    }

    public void setFcTabelaUn(Double fcTabelaUn) {
        this.fcTabelaUn = fcTabelaUn;
    }

    public Double getFcBrutoUn() {
        return fcBrutoUn;
    }

    public void setFcBrutoUn(Double fcBrutoUn) {
        this.fcBrutoUn = fcBrutoUn;
    }

    public Double getFcDescontoUn() {
        return fcDescontoUn;
    }

    public void setFcDescontoUn(Double fcDescontoUn) {
        this.fcDescontoUn = fcDescontoUn;
    }

    public Double getFcRetorno() {
        return fcRetorno;
    }

    public void setFcRetorno(Double fcRetorno) {
        this.fcRetorno = fcRetorno;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissaoExt() {
        return comissaoExt;
    }

    public void setComissaoExt(double comissaoExt) {
        this.comissaoExt = comissaoExt;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getAtacVarejo() {
        return atacVarejo;
    }

    public void setAtacVarejo(String atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public String getTipoBaixa() {
        return tipoBaixa;
    }

    public void setTipoBaixa(String tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public String getTipoSaida() {
        return tipoSaida;
    }

    public void setTipoSaida(String tipoSaida) {
        this.tipoSaida = tipoSaida;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public String getSeqDesconto() {
        return seqDesconto;
    }

    public void setSeqDesconto(String seqDesconto) {
        this.seqDesconto = seqDesconto;
    }

    public String getBaixaPorConf() {
        return baixaPorConf;
    }

    public void setBaixaPorConf(String baixaPorConf) {
        this.baixaPorConf = baixaPorConf;
    }

    public double getVlIcmsDeson() {
        return vlIcmsDeson;
    }

    public void setVlIcmsDeson(double vlIcmsDeson) {
        this.vlIcmsDeson = vlIcmsDeson;
    }

    public double getVlPisDeson() {
        return vlPisDeson;
    }

    public void setVlPisDeson(double vlPisDeson) {
        this.vlPisDeson = vlPisDeson;
    }

    public double getVlCofinsDeson() {
        return vlCofinsDeson;
    }

    public void setVlCofinsDeson(double vlCofinsDeson) {
        this.vlCofinsDeson = vlCofinsDeson;
    }

    public double getVlIpiDeson() {
        return vlIpiDeson;
    }

    public void setVlIpiDeson(double vlIpiDeson) {
        this.vlIpiDeson = vlIpiDeson;
    }

}