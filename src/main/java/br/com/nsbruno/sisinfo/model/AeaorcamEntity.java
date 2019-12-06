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
@Table(name = "AEAORCAM")
public class AeaorcamEntity {

    @Id
    @Column(name = "ID_AEAORCAM", table = "AEAORCAM", nullable = false)
    private Integer idAeaorcam;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAORCAM", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_CFACLIFO_VENDEDOR_INI", table = "AEAORCAM")
    private Integer idCfaclifoVendedorIni;

    @Basic
    @Column(name = "ID_CFACLIFO_INDICOU", table = "AEAORCAM")
    private Integer idCfaclifoIndicou;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "AEAORCAM")
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_AEASERIE", table = "AEAORCAM", nullable = false)
    private int idAeaserie;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "AEAORCAM")
    private Integer idCfamoeda;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "AEAORCAM")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "AEAORCAM")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_CFAEQUIP", table = "AEAORCAM")
    private Integer idCfaequip;

    @Basic
    @Column(name = "ID_AEAROMAN", table = "AEAORCAM")
    private Integer idAearoman;

    @Basic
    @Column(name = "ID_AEASERIE_PED", table = "AEAORCAM")
    private Integer idAeaseriePed;

    @Basic
    @Column(name = "ID_AEASAIDA", table = "AEAORCAM")
    private Integer idAeasaida;

    @Basic
    @Column(name = "ID_AEANATUR", table = "AEAORCAM")
    private Integer idAeanatur;

    @Basic
    @Column(name = "ID_CFATPDOC", table = "AEAORCAM")
    private Integer idCfatpdoc;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAORCAM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAORCAM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAORCAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAORCAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAORCAM")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_ORCAMENTO", table = "AEAORCAM", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtOrcamento;

    @Basic
    @Column(name = "DT_VALIDADE", table = "AEAORCAM")
    @Temporal(TemporalType.DATE)
    private Date dtValidade;

    @Basic
    @Column(name = "DT_EMISSAO", table = "AEAORCAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtEmissao;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEAORCAM", nullable = false)
    private int numero;

    @Basic(optional = false)
    @Column(name = "VL_MERC_CUSTO", table = "AEAORCAM", nullable = false)
    private double vlMercCusto;

    @Basic(optional = false)
    @Column(name = "VL_SERV_CUSTO", table = "AEAORCAM", nullable = false)
    private double vlServCusto;

    @Basic(optional = false)
    @Column(name = "VL_MERC_BRUTO", table = "AEAORCAM", nullable = false)
    private double vlMercBruto;

    @Basic(optional = false)
    @Column(name = "VL_SERV_BRUTO", table = "AEAORCAM", nullable = false)
    private double vlServBruto;

    @Basic(optional = false)
    @Column(name = "VL_MERC_DESCONTO", table = "AEAORCAM", nullable = false)
    private double vlMercDesconto;

    @Basic(optional = false)
    @Column(name = "VL_SERV_DESCONTO", table = "AEAORCAM", nullable = false)
    private double vlServDesconto;

    @Basic(optional = false)
    @Column(name = "VL_FRETE", table = "AEAORCAM", nullable = false)
    private double vlFrete;

    @Basic(optional = false)
    @Column(name = "VL_SEGURO", table = "AEAORCAM", nullable = false)
    private double vlSeguro;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS", table = "AEAORCAM", nullable = false)
    private double vlOutros;

    @Basic(optional = false)
    @Column(name = "VL_ENCARGOS_FINANCEIROS", table = "AEAORCAM", nullable = false)
    private double vlEncargosFinanceiros;

    @Basic(optional = false)
    @Column(name = "VL_RESIDUAL", table = "AEAORCAM", nullable = false)
    private double vlResidual;

    @Basic(optional = false)
    @Column(name = "VL_DIF_PARCELA", table = "AEAORCAM", nullable = false)
    private double vlDifParcela;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_DESON", table = "AEAORCAM", nullable = false)
    private double vlIcmsDeson;

    @Basic(optional = false)
    @Column(name = "VL_PIS_DESON", table = "AEAORCAM", nullable = false)
    private double vlPisDeson;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_DESON", table = "AEAORCAM", nullable = false)
    private double vlCofinsDeson;

    @Basic(optional = false)
    @Column(name = "VL_IPI_DESON", table = "AEAORCAM", nullable = false)
    private double vlIpiDeson;

    @Basic
    @Column(name = "FC_VL_TOTAL_SEM_DIF", table = "AEAORCAM", precision = 15)
    private Double fcVlTotalSemDif;

    @Basic
    @Column(name = "FC_VL_TOTAL", table = "AEAORCAM", precision = 15)
    private Double fcVlTotal;

    @Basic
    @Column(name = "FC_VL_OUTROS", table = "AEAORCAM", precision = 15)
    private Double fcVlOutros;

    @Basic(optional = false)
    @Column(name = "VL_FATURADO", table = "AEAORCAM", nullable = false)
    private double vlFaturado;

    @Basic(optional = false)
    @Column(name = "ATAC_VAREJO", table = "AEAORCAM", nullable = false)
    private String atacVarejo;

    @Basic
    @Column(name = "PESSOA_CLIENTE", table = "AEAORCAM")
    private String pessoaCliente;

    @Basic
    @Column(name = "NOME_CLIENTE", table = "AEAORCAM", length = 60)
    private String nomeCliente;

    @Basic
    @Column(name = "IE_RG_CLIENTE", table = "AEAORCAM", length = 18)
    private String ieRgCliente;

    @Basic
    @Column(name = "CPF_CGC_CLIENTE", table = "AEAORCAM", length = 18)
    private String cpfCgcCliente;

    @Basic
    @Column(name = "ENDERECO_CLIENTE", table = "AEAORCAM", length = 128)
    private String enderecoCliente;

    @Basic
    @Column(name = "BAIRRO_CLIENTE", table = "AEAORCAM", length = 40)
    private String bairroCliente;

    @Basic
    @Column(name = "CEP_CLIENTE", table = "AEAORCAM", length = 9)
    private String cepCliente;

    @Basic
    @Column(name = "FONE_CLIENTE", table = "AEAORCAM", length = 18)
    private String foneCliente;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAORCAM")
    private byte[] obs;

    @Basic(optional = false)
    @Column(name = "NUM_EMISSOES", table = "AEAORCAM", nullable = false)
    private int numEmissoes;

    @Basic
    @Column(name = "MANTEM", table = "AEAORCAM")
    private String mantem;

    @Basic
    @Column(name = "TIPO_BAIXA", table = "AEAORCAM")
    private String tipoBaixa;

    @Basic
    @Column(name = "TIPO_ENTREGA", table = "AEAORCAM")
    private String tipoEntrega;

    @Basic
    @Column(name = "AGRUPAMENTO", table = "AEAORCAM")
    private Integer agrupamento;

    @Basic
    @Column(name = "SEM_VALIDACAO", table = "AEAORCAM")
    private String semValidacao;

    @Basic
    @Column(name = "ANDAMENTO", table = "AEAORCAM")
    private String andamento;

    public Integer getIdAeaorcam() {
        return idAeaorcam;
    }

    public void setIdAeaorcam(Integer idAeaorcam) {
        this.idAeaorcam = idAeaorcam;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfaclifoVendedorIni() {
        return idCfaclifoVendedorIni;
    }

    public void setIdCfaclifoVendedorIni(Integer idCfaclifoVendedorIni) {
        this.idCfaclifoVendedorIni = idCfaclifoVendedorIni;
    }

    public Integer getIdCfaclifoIndicou() {
        return idCfaclifoIndicou;
    }

    public void setIdCfaclifoIndicou(Integer idCfaclifoIndicou) {
        this.idCfaclifoIndicou = idCfaclifoIndicou;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public int getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(int idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
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

    public Integer getIdCfaequip() {
        return idCfaequip;
    }

    public void setIdCfaequip(Integer idCfaequip) {
        this.idCfaequip = idCfaequip;
    }

    public Integer getIdAearoman() {
        return idAearoman;
    }

    public void setIdAearoman(Integer idAearoman) {
        this.idAearoman = idAearoman;
    }

    public Integer getIdAeaseriePed() {
        return idAeaseriePed;
    }

    public void setIdAeaseriePed(Integer idAeaseriePed) {
        this.idAeaseriePed = idAeaseriePed;
    }

    public Integer getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public Integer getIdAeanatur() {
        return idAeanatur;
    }

    public void setIdAeanatur(Integer idAeanatur) {
        this.idAeanatur = idAeanatur;
    }

    public Integer getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(Integer idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
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

    public Date getDtOrcamento() {
        return dtOrcamento;
    }

    public void setDtOrcamento(Date dtOrcamento) {
        this.dtOrcamento = dtOrcamento;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getVlMercCusto() {
        return vlMercCusto;
    }

    public void setVlMercCusto(double vlMercCusto) {
        this.vlMercCusto = vlMercCusto;
    }

    public double getVlServCusto() {
        return vlServCusto;
    }

    public void setVlServCusto(double vlServCusto) {
        this.vlServCusto = vlServCusto;
    }

    public double getVlMercBruto() {
        return vlMercBruto;
    }

    public void setVlMercBruto(double vlMercBruto) {
        this.vlMercBruto = vlMercBruto;
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

    public double getVlResidual() {
        return vlResidual;
    }

    public void setVlResidual(double vlResidual) {
        this.vlResidual = vlResidual;
    }

    public double getVlDifParcela() {
        return vlDifParcela;
    }

    public void setVlDifParcela(double vlDifParcela) {
        this.vlDifParcela = vlDifParcela;
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

    public Double getFcVlTotalSemDif() {
        return fcVlTotalSemDif;
    }

    public void setFcVlTotalSemDif(Double fcVlTotalSemDif) {
        this.fcVlTotalSemDif = fcVlTotalSemDif;
    }

    public Double getFcVlTotal() {
        return fcVlTotal;
    }

    public void setFcVlTotal(Double fcVlTotal) {
        this.fcVlTotal = fcVlTotal;
    }

    public Double getFcVlOutros() {
        return fcVlOutros;
    }

    public void setFcVlOutros(Double fcVlOutros) {
        this.fcVlOutros = fcVlOutros;
    }

    public double getVlFaturado() {
        return vlFaturado;
    }

    public void setVlFaturado(double vlFaturado) {
        this.vlFaturado = vlFaturado;
    }

    public String getAtacVarejo() {
        return atacVarejo;
    }

    public void setAtacVarejo(String atacVarejo) {
        this.atacVarejo = atacVarejo;
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

    public String getIeRgCliente() {
        return ieRgCliente;
    }

    public void setIeRgCliente(String ieRgCliente) {
        this.ieRgCliente = ieRgCliente;
    }

    public String getCpfCgcCliente() {
        return cpfCgcCliente;
    }

    public void setCpfCgcCliente(String cpfCgcCliente) {
        this.cpfCgcCliente = cpfCgcCliente;
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

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public int getNumEmissoes() {
        return numEmissoes;
    }

    public void setNumEmissoes(int numEmissoes) {
        this.numEmissoes = numEmissoes;
    }

    public String getMantem() {
        return mantem;
    }

    public void setMantem(String mantem) {
        this.mantem = mantem;
    }

    public String getTipoBaixa() {
        return tipoBaixa;
    }

    public void setTipoBaixa(String tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Integer getAgrupamento() {
        return agrupamento;
    }

    public void setAgrupamento(Integer agrupamento) {
        this.agrupamento = agrupamento;
    }

    public String getSemValidacao() {
        return semValidacao;
    }

    public void setSemValidacao(String semValidacao) {
        this.semValidacao = semValidacao;
    }

    public String getAndamento() {
        return andamento;
    }

    public void setAndamento(String andamento) {
        this.andamento = andamento;
    }

}