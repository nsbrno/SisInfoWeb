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
@Table(name = "AEASAIDA")
public class AeasaidaEntity {

    @Id
    @Column(name = "ID_AEASAIDA", table = "AEASAIDA", nullable = false)
    private Integer idAeasaida;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEASAIDA", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_AEASERIE", table = "AEASAIDA", nullable = false)
    private Integer idAeaserie;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "AEASAIDA")
    private Integer idCfamoeda;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "AEASAIDA")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFACLIFO_INDICOU", table = "AEASAIDA")
    private Integer idCfaclifoIndicou;

    @Basic
    @Column(name = "ID_CFACLIFO_VENDEDOR_INI", table = "AEASAIDA")
    private Integer idCfaclifoVendedorIni;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "AEASAIDA")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "AEASAIDA")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_AEANATUR", table = "AEASAIDA")
    private Integer idAeanatur;

    @Basic
    @Column(name = "ID_CFACLIFO_DESC_GER", table = "AEASAIDA")
    private Integer idCfaclifoDescGer;

    @Basic
    @Column(name = "ID_CFAEQUIP", table = "AEASAIDA")
    private Integer idCfaequip;

    @Basic
    @Column(name = "ID_CFATPDOC", table = "AEASAIDA")
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_AEACAIXA", table = "AEASAIDA")
    private Integer idAeacaixa;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEASAIDA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEASAIDA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEASAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEASAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEASAIDA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEASAIDA", nullable = false)
    private Integer numero;

    @Basic(optional = false)
    @Column(name = "DT_VENDA", table = "AEASAIDA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtVenda;

    @Basic
    @Column(name = "DT_EMISSAO", table = "AEASAIDA")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_SAIDA", table = "AEASAIDA")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;

    @Basic
    @Column(name = "DT_CANCEL", table = "AEASAIDA")
    @Temporal(TemporalType.DATE)
    private Date dtCancel;

    @Basic
    @Column(name = "DT_CRIACAO_PALM", table = "AEASAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCriacaoPalm;

    @Basic(optional = false)
    @Column(name = "COMISSAO", table = "AEASAIDA", nullable = false)
    private double comissao;

    @Basic(optional = false)
    @Column(name = "ATAC_VAREJO", table = "AEASAIDA", nullable = false)
    private String atacVarejo;

    @Basic(optional = false)
    @Column(name = "VL_MERC_CUSTO", table = "AEASAIDA", nullable = false)
    private double vlMercCusto;

    @Basic(optional = false)
    @Column(name = "VL_MERC_VISTA", table = "AEASAIDA", nullable = false)
    private double vlMercVista;

    @Basic(optional = false)
    @Column(name = "VL_MERC_VENDA", table = "AEASAIDA", nullable = false)
    private double vlMercVenda;

    @Basic(optional = false)
    @Column(name = "VL_MERC_TABELA", table = "AEASAIDA", nullable = false)
    private double vlMercTabela;

    @Basic(optional = false)
    @Column(name = "VL_MERC_BRUTO", table = "AEASAIDA", nullable = false)
    private double vlMercBruto;

    @Basic(optional = false)
    @Column(name = "VL_SERV_CUSTO", table = "AEASAIDA", nullable = false)
    private double vlServCusto;

    @Basic(optional = false)
    @Column(name = "VL_SERV_VISTA", table = "AEASAIDA", nullable = false)
    private double vlServVista;

    @Basic(optional = false)
    @Column(name = "VL_SERV_VENDA", table = "AEASAIDA", nullable = false)
    private double vlServVenda;

    @Basic(optional = false)
    @Column(name = "VL_SERV_TABELA", table = "AEASAIDA", nullable = false)
    private double vlServTabela;

    @Basic(optional = false)
    @Column(name = "VL_SERV_BRUTO", table = "AEASAIDA", nullable = false)
    private double vlServBruto;

    @Basic(optional = false)
    @Column(name = "VL_MERC_DESCONTO", table = "AEASAIDA", nullable = false)
    private double vlMercDesconto;

    @Basic(optional = false)
    @Column(name = "VL_SERV_DESCONTO", table = "AEASAIDA", nullable = false)
    private double vlServDesconto;

    @Basic(optional = false)
    @Column(name = "VL_RESIDUAL", table = "AEASAIDA", nullable = false)
    private double vlResidual;

    @Basic(optional = false)
    @Column(name = "VL_FRETE", table = "AEASAIDA", nullable = false)
    private double vlFrete;

    @Basic(optional = false)
    @Column(name = "VL_SEGURO", table = "AEASAIDA", nullable = false)
    private double vlSeguro;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS", table = "AEASAIDA", nullable = false)
    private double vlOutros;

    @Basic(optional = false)
    @Column(name = "VL_ENCARGOS_FINANCEIROS", table = "AEASAIDA", nullable = false)
    private double vlEncargosFinanceiros;

    @Basic(optional = false)
    @Column(name = "VL_RETORNO", table = "AEASAIDA", nullable = false)
    private double vlRetorno;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_DESON", table = "AEASAIDA", nullable = false)
    private double vlIcmsDeson;

    @Basic(optional = false)
    @Column(name = "VL_PIS_DESON", table = "AEASAIDA", nullable = false)
    private double vlPisDeson;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_DESON", table = "AEASAIDA", nullable = false)
    private double vlCofinsDeson;

    @Basic(optional = false)
    @Column(name = "VL_IPI_DESON", table = "AEASAIDA", nullable = false)
    private double vlIpiDeson;

    @Basic
    @Column(name = "FC_VL_OUTROS", table = "AEASAIDA", precision = 15)
    private Double fcVlOutros;

    @Basic
    @Column(name = "FC_VL_TOTAL", table = "AEASAIDA", precision = 15)
    private Double fcVlTotal;

    @Basic(optional = false)
    @Column(name = "VL_CONFIRMADO", table = "AEASAIDA", nullable = false)
    private double vlConfirmado;

    @Basic
    @Column(name = "FC_VL_FATURAR", table = "AEASAIDA", precision = 15)
    private Double fcVlFaturar;

    @Basic(optional = false)
    @Column(name = "PERC_DESC_GERENCIA", table = "AEASAIDA", nullable = false)
    private double percDescGerencia;

    @Basic(optional = false)
    @Column(name = "NUM_EMISSOES", table = "AEASAIDA", nullable = false)
    private Integer numEmissoes;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "AEASAIDA", nullable = false)
    private short situacao;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEASAIDA")
    private byte[] obs;

    @Basic
    @Column(name = "PESSOA_CLIENTE", table = "AEASAIDA")
    private String pessoaCliente;

    @Basic
    @Column(name = "NOME_CLIENTE", table = "AEASAIDA", length = 60)
    private String nomeCliente;

    @Basic
    @Column(name = "CPF_CGC_CLIENTE", table = "AEASAIDA", length = 18)
    private String cpfCgcCliente;

    @Basic
    @Column(name = "IE_RG_CLIENTE", table = "AEASAIDA", length = 18)
    private String ieRgCliente;

    @Basic
    @Column(name = "ENDERECO_CLIENTE", table = "AEASAIDA", length = 128)
    private String enderecoCliente;

    @Basic
    @Column(name = "BAIRRO_CLIENTE", table = "AEASAIDA", length = 40)
    private String bairroCliente;

    @Basic
    @Column(name = "CEP_CLIENTE", table = "AEASAIDA", length = 9)
    private String cepCliente;

    @Basic
    @Column(name = "FONE_CLIENTE", table = "AEASAIDA", length = 18)
    private String foneCliente;

    @Basic(optional = false)
    @Column(name = "TIPO_BAIXA", table = "AEASAIDA", nullable = false)
    private String tipoBaixa;

    @Basic
    @Column(name = "TIPO_SAIDA", table = "AEASAIDA")
    private String tipoSaida;

    @Basic(optional = false)
    @Column(name = "GERANDO", table = "AEASAIDA", nullable = false)
    private String gerando;

    @Basic
    @Column(name = "REGISTRADO", table = "AEASAIDA")
    private String registrado;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEASAIDA", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "QTDE_DEVOL", table = "AEASAIDA", nullable = false)
    private double qtdeDevol;

    @Basic(optional = false)
    @Column(name = "QTDE_RETORNO", table = "AEASAIDA", nullable = false)
    private double qtdeRetorno;

    @Basic(optional = false)
    @Column(name = "QTDE_CONFERIDO", table = "AEASAIDA", nullable = false)
    private double qtdeConferido;

    @Basic
    @Column(name = "TIPO_ENTREGA", table = "AEASAIDA")
    private String tipoEntrega;

    @Basic
    @Column(name = "SERIE_ORC", table = "AEASAIDA", length = 3)
    private String serieOrc;

    @Basic
    @Column(name = "NUMERO_ORC", table = "AEASAIDA")
    private Integer numeroOrc;

    @Basic
    @Column(name = "COD", table = "AEASAIDA", length = 40)
    private String cod;

    @Basic
    @Column(name = "ANDAMENTO", table = "AEASAIDA", length = 18)
    private String andamento;

    public Integer getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(Integer idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaclifoIndicou() {
        return idCfaclifoIndicou;
    }

    public void setIdCfaclifoIndicou(Integer idCfaclifoIndicou) {
        this.idCfaclifoIndicou = idCfaclifoIndicou;
    }

    public Integer getIdCfaclifoVendedorIni() {
        return idCfaclifoVendedorIni;
    }

    public void setIdCfaclifoVendedorIni(Integer idCfaclifoVendedorIni) {
        this.idCfaclifoVendedorIni = idCfaclifoVendedorIni;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
    }

    public Integer getIdCfacidad() {
        return idCfacidad;
    }

    public void setIdCfacidad(Integer idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public Integer getIdAeanatur() {
        return idAeanatur;
    }

    public void setIdAeanatur(Integer idAeanatur) {
        this.idAeanatur = idAeanatur;
    }

    public Integer getIdCfaclifoDescGer() {
        return idCfaclifoDescGer;
    }

    public void setIdCfaclifoDescGer(Integer idCfaclifoDescGer) {
        this.idCfaclifoDescGer = idCfaclifoDescGer;
    }

    public Integer getIdCfaequip() {
        return idCfaequip;
    }

    public void setIdCfaequip(Integer idCfaequip) {
        this.idCfaequip = idCfaequip;
    }

    public Integer getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(Integer idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public Integer getIdAeacaixa() {
        return idAeacaixa;
    }

    public void setIdAeacaixa(Integer idAeacaixa) {
        this.idAeacaixa = idAeacaixa;
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

    public Date getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(Date dtVenda) {
        this.dtVenda = dtVenda;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Date getDtCancel() {
        return dtCancel;
    }

    public void setDtCancel(Date dtCancel) {
        this.dtCancel = dtCancel;
    }

    public Date getDtCriacaoPalm() {
        return dtCriacaoPalm;
    }

    public void setDtCriacaoPalm(Date dtCriacaoPalm) {
        this.dtCriacaoPalm = dtCriacaoPalm;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getAtacVarejo() {
        return atacVarejo;
    }

    public void setAtacVarejo(String atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public double getVlMercCusto() {
        return vlMercCusto;
    }

    public void setVlMercCusto(double vlMercCusto) {
        this.vlMercCusto = vlMercCusto;
    }

    public double getVlMercVista() {
        return vlMercVista;
    }

    public void setVlMercVista(double vlMercVista) {
        this.vlMercVista = vlMercVista;
    }

    public double getVlMercVenda() {
        return vlMercVenda;
    }

    public void setVlMercVenda(double vlMercVenda) {
        this.vlMercVenda = vlMercVenda;
    }

    public double getVlMercTabela() {
        return vlMercTabela;
    }

    public void setVlMercTabela(double vlMercTabela) {
        this.vlMercTabela = vlMercTabela;
    }

    public double getVlMercBruto() {
        return vlMercBruto;
    }

    public void setVlMercBruto(double vlMercBruto) {
        this.vlMercBruto = vlMercBruto;
    }

    public double getVlServCusto() {
        return vlServCusto;
    }

    public void setVlServCusto(double vlServCusto) {
        this.vlServCusto = vlServCusto;
    }

    public double getVlServVista() {
        return vlServVista;
    }

    public void setVlServVista(double vlServVista) {
        this.vlServVista = vlServVista;
    }

    public double getVlServVenda() {
        return vlServVenda;
    }

    public void setVlServVenda(double vlServVenda) {
        this.vlServVenda = vlServVenda;
    }

    public double getVlServTabela() {
        return vlServTabela;
    }

    public void setVlServTabela(double vlServTabela) {
        this.vlServTabela = vlServTabela;
    }

    public double getVlServBruto() {
        return vlServBruto;
    }

    public void setVlServBruto(double vlServBruto) {
        this.vlServBruto = vlServBruto;
    }

    public double getVlMercDesconto() {
        return vlMercDesconto;
    }

    public void setVlMercDesconto(double vlMercDesconto) {
        this.vlMercDesconto = vlMercDesconto;
    }

    public double getVlServDesconto() {
        return vlServDesconto;
    }

    public void setVlServDesconto(double vlServDesconto) {
        this.vlServDesconto = vlServDesconto;
    }

    public double getVlResidual() {
        return vlResidual;
    }

    public void setVlResidual(double vlResidual) {
        this.vlResidual = vlResidual;
    }

    public double getVlFrete() {
        return vlFrete;
    }

    public void setVlFrete(double vlFrete) {
        this.vlFrete = vlFrete;
    }

    public double getVlSeguro() {
        return vlSeguro;
    }

    public void setVlSeguro(double vlSeguro) {
        this.vlSeguro = vlSeguro;
    }

    public double getVlOutros() {
        return vlOutros;
    }

    public void setVlOutros(double vlOutros) {
        this.vlOutros = vlOutros;
    }

    public double getVlEncargosFinanceiros() {
        return vlEncargosFinanceiros;
    }

    public void setVlEncargosFinanceiros(double vlEncargosFinanceiros) {
        this.vlEncargosFinanceiros = vlEncargosFinanceiros;
    }

    public double getVlRetorno() {
        return vlRetorno;
    }

    public void setVlRetorno(double vlRetorno) {
        this.vlRetorno = vlRetorno;
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

    public Double getFcVlOutros() {
        return fcVlOutros;
    }

    public void setFcVlOutros(Double fcVlOutros) {
        this.fcVlOutros = fcVlOutros;
    }

    public Double getFcVlTotal() {
        return fcVlTotal;
    }

    public void setFcVlTotal(Double fcVlTotal) {
        this.fcVlTotal = fcVlTotal;
    }

    public double getVlConfirmado() {
        return vlConfirmado;
    }

    public void setVlConfirmado(double vlConfirmado) {
        this.vlConfirmado = vlConfirmado;
    }

    public Double getFcVlFaturar() {
        return fcVlFaturar;
    }

    public void setFcVlFaturar(Double fcVlFaturar) {
        this.fcVlFaturar = fcVlFaturar;
    }

    public double getPercDescGerencia() {
        return percDescGerencia;
    }

    public void setPercDescGerencia(double percDescGerencia) {
        this.percDescGerencia = percDescGerencia;
    }

    public Integer getNumEmissoes() {
        return numEmissoes;
    }

    public void setNumEmissoes(Integer numEmissoes) {
        this.numEmissoes = numEmissoes;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getPessoaCliente() {
        return pessoaCliente;
    }

    public void setPessoaCliente(String pessoaCliente) {
        this.pessoaCliente = pessoaCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCgcCliente() {
        return cpfCgcCliente;
    }

    public void setCpfCgcCliente(String cpfCgcCliente) {
        this.cpfCgcCliente = cpfCgcCliente;
    }

    public String getIeRgCliente() {
        return ieRgCliente;
    }

    public void setIeRgCliente(String ieRgCliente) {
        this.ieRgCliente = ieRgCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getFoneCliente() {
        return foneCliente;
    }

    public void setFoneCliente(String foneCliente) {
        this.foneCliente = foneCliente;
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

    public String getGerando() {
        return gerando;
    }

    public void setGerando(String gerando) {
        this.gerando = gerando;
    }

    public String getRegistrado() {
        return registrado;
    }

    public void setRegistrado(String registrado) {
        this.registrado = registrado;
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

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getSerieOrc() {
        return serieOrc;
    }

    public void setSerieOrc(String serieOrc) {
        this.serieOrc = serieOrc;
    }

    public Integer getNumeroOrc() {
        return numeroOrc;
    }

    public void setNumeroOrc(Integer numeroOrc) {
        this.numeroOrc = numeroOrc;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getAndamento() {
        return andamento;
    }

    public void setAndamento(String andamento) {
        this.andamento = andamento;
    }

}