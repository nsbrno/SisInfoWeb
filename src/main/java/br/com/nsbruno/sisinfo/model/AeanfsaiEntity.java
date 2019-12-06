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
@Table(name = "AEANFSAI")
public class AeanfsaiEntity {

    @Id
    @Column(name = "ID_AEANFSAI", table = "AEANFSAI", nullable = false)
    private Integer idAeanfsai;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEANFSAI", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_AEASERIE", table = "AEANFSAI", nullable = false)
    private int idAeaserie;

    @Basic
    @Column(name = "ID_AEASERIE_NF", table = "AEANFSAI")
    private Integer idAeaserieNf;

    @Basic
    @Column(name = "ID_AEASAIDA", table = "AEANFSAI")
    private Integer idAeasaida;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "AEANFSAI")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "AEANFSAI")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "AEANFSAI")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_RPAFATUR", table = "AEANFSAI")
    private Integer idRpafatur;

    @Basic
    @Column(name = "ID_AEANATUR", table = "AEANFSAI")
    private Integer idAeanatur;

    @Basic
    @Column(name = "ID_GCACONTR", table = "AEANFSAI")
    private Integer idGcacontr;

    @Basic
    @Column(name = "ID_AEATRANS", table = "AEANFSAI")
    private Integer idAeatrans;

    @Basic
    @Column(name = "ID_CFANATOP_CF_NF", table = "AEANFSAI")
    private Integer idCfanatopCfNf;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEANFSAI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEANFSAI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEANFSAI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEANFSAI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEANFSAI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_NF", table = "AEANFSAI", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtNf;

    @Basic
    @Column(name = "DT_EMISSAO", table = "AEANFSAI")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_SAIDA", table = "AEANFSAI")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;

    @Basic
    @Column(name = "DT_SAIDA_VAZIO", table = "AEANFSAI")
    private String dtSaidaVazio;

    @Basic
    @Column(name = "DT_CANCEL", table = "AEANFSAI")
    @Temporal(TemporalType.DATE)
    private Date dtCancel;

    @Basic
    @Column(name = "NUMERO_NF", table = "AEANFSAI")
    private Integer numeroNf;

    @Basic
    @Column(name = "NUMERO", table = "AEANFSAI")
    private Integer numero;

    @Basic(optional = false)
    @Column(name = "COMISSAO", table = "AEANFSAI", nullable = false)
    private double comissao;

    @Basic(optional = false)
    @Column(name = "ATAC_VAREJO", table = "AEANFSAI", nullable = false)
    private String atacVarejo;

    @Basic(optional = false)
    @Column(name = "VL_MERC_CUSTO", table = "AEANFSAI", nullable = false)
    private double vlMercCusto;

    @Basic(optional = false)
    @Column(name = "VL_MERC_CUSTO_FIS", table = "AEANFSAI", nullable = false)
    private double vlMercCustoFis;

    @Basic(optional = false)
    @Column(name = "VL_MERC_VISTA", table = "AEANFSAI", nullable = false)
    private double vlMercVista;

    @Basic(optional = false)
    @Column(name = "VL_MERC_VENDA", table = "AEANFSAI", nullable = false)
    private double vlMercVenda;

    @Basic(optional = false)
    @Column(name = "VL_MERC_TABELA", table = "AEANFSAI", nullable = false)
    private double vlMercTabela;

    @Basic(optional = false)
    @Column(name = "VL_MERC_BRUTO", table = "AEANFSAI", nullable = false)
    private double vlMercBruto;

    @Basic(optional = false)
    @Column(name = "VL_SERV_CUSTO", table = "AEANFSAI", nullable = false)
    private double vlServCusto;

    @Basic(optional = false)
    @Column(name = "VL_SERV_CUSTO_FIS", table = "AEANFSAI", nullable = false)
    private double vlServCustoFis;

    @Basic(optional = false)
    @Column(name = "VL_SERV_VISTA", table = "AEANFSAI", nullable = false)
    private double vlServVista;

    @Basic(optional = false)
    @Column(name = "VL_SERV_VENDA", table = "AEANFSAI", nullable = false)
    private double vlServVenda;

    @Basic(optional = false)
    @Column(name = "VL_SERV_TABELA", table = "AEANFSAI", nullable = false)
    private double vlServTabela;

    @Basic(optional = false)
    @Column(name = "VL_SERV_BRUTO", table = "AEANFSAI", nullable = false)
    private double vlServBruto;

    @Basic(optional = false)
    @Column(name = "VL_MERC_DESCONTO", table = "AEANFSAI", nullable = false)
    private double vlMercDesconto;

    @Basic(optional = false)
    @Column(name = "VL_SERV_DESCONTO", table = "AEANFSAI", nullable = false)
    private double vlServDesconto;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS", table = "AEANFSAI", nullable = false)
    private double vlBaseIcms;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_SUB", table = "AEANFSAI", nullable = false)
    private double vlBaseIcmsSub;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ISS", table = "AEANFSAI", nullable = false)
    private double vlBaseIss;

    @Basic(optional = false)
    @Column(name = "VL_BASE_IPI", table = "AEANFSAI", nullable = false)
    private double vlBaseIpi;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_IPI", table = "AEANFSAI", nullable = false)
    private double vlIsentoIpi;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_ICMS", table = "AEANFSAI", nullable = false)
    private double vlIsentoIcms;

    @Basic(optional = false)
    @Column(name = "VL_ICMS", table = "AEANFSAI", nullable = false)
    private double vlIcms;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_SUB", table = "AEANFSAI", nullable = false)
    private double vlIcmsSub;

    @Basic(optional = false)
    @Column(name = "VL_IPI", table = "AEANFSAI", nullable = false)
    private double vlIpi;

    @Basic(optional = false)
    @Column(name = "VL_ISS", table = "AEANFSAI", nullable = false)
    private double vlIss;

    @Basic(optional = false)
    @Column(name = "VL_PIS", table = "AEANFSAI", nullable = false)
    private double vlPis;

    @Basic(optional = false)
    @Column(name = "VL_PIS_ST", table = "AEANFSAI", nullable = false)
    private double vlPisSt;

    @Basic(optional = false)
    @Column(name = "VL_COFINS", table = "AEANFSAI", nullable = false)
    private double vlCofins;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_ST", table = "AEANFSAI", nullable = false)
    private double vlCofinsSt;

    @Basic(optional = false)
    @Column(name = "VL_FRETE", table = "AEANFSAI", nullable = false)
    private double vlFrete;

    @Basic(optional = false)
    @Column(name = "VL_SEGURO", table = "AEANFSAI", nullable = false)
    private double vlSeguro;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS", table = "AEANFSAI", nullable = false)
    private double vlOutros;

    @Basic(optional = false)
    @Column(name = "VL_ENCARGOS_FINANCEIROS", table = "AEANFSAI", nullable = false)
    private double vlEncargosFinanceiros;

    @Basic(optional = false)
    @Column(name = "VL_RESIDUAL", table = "AEANFSAI", nullable = false)
    private double vlResidual;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_DESON", table = "AEANFSAI", nullable = false)
    private double vlIcmsDeson;

    @Basic(optional = false)
    @Column(name = "VL_PIS_DESON", table = "AEANFSAI", nullable = false)
    private double vlPisDeson;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_DESON", table = "AEANFSAI", nullable = false)
    private double vlCofinsDeson;

    @Basic(optional = false)
    @Column(name = "VL_IPI_DESON", table = "AEANFSAI", nullable = false)
    private double vlIpiDeson;

    @Basic(optional = false)
    @Column(name = "VL_TOT_TRIB", table = "AEANFSAI", nullable = false)
    private double vlTotTrib;

    @Basic(optional = false)
    @Column(name = "VL_FCP_UF_DEST", table = "AEANFSAI", nullable = false)
    private double vlFcpUfDest;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_UF_DEST", table = "AEANFSAI", nullable = false)
    private double vlIcmsUfDest;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_UF_REMET", table = "AEANFSAI", nullable = false)
    private double vlIcmsUfRemet;

    @Basic
    @Column(name = "FC_VL_TOTAL", table = "AEANFSAI", precision = 15)
    private Double fcVlTotal;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "AEANFSAI", nullable = false)
    private short situacao;

    @Basic
    @Column(name = "PESSOA_CLIENTE", table = "AEANFSAI")
    private String pessoaCliente;

    @Basic
    @Column(name = "NOME_CLIENTE", table = "AEANFSAI", length = 60)
    private String nomeCliente;

    @Basic
    @Column(name = "CPF_CGC_CLIENTE", table = "AEANFSAI", length = 18)
    private String cpfCgcCliente;

    @Basic
    @Column(name = "IE_RG_CLIENTE", table = "AEANFSAI", length = 18)
    private String ieRgCliente;

    @Basic
    @Column(name = "ENDERECO_CLIENTE", table = "AEANFSAI", length = 128)
    private String enderecoCliente;

    @Basic
    @Column(name = "BAIRRO_CLIENTE", table = "AEANFSAI", length = 40)
    private String bairroCliente;

    @Basic
    @Column(name = "CEP_CLIENTE", table = "AEANFSAI", length = 9)
    private String cepCliente;

    @Basic
    @Column(name = "FONE_CLIENTE", table = "AEANFSAI", length = 18)
    private String foneCliente;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEANFSAI")
    private byte[] obs;

    @Basic(optional = false)
    @Column(name = "TIPO_BAIXA", table = "AEANFSAI", nullable = false)
    private String tipoBaixa;

    @Basic(optional = false)
    @Column(name = "NUM_EMISSOES", table = "AEANFSAI", nullable = false)
    private int numEmissoes;

    @Basic(optional = false)
    @Column(name = "GERANDO", table = "AEANFSAI", nullable = false)
    private String gerando;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEANFSAI", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "QTDE_DEVOL", table = "AEANFSAI", nullable = false)
    private double qtdeDevol;

    @Basic
    @Column(name = "TIPO_TRANSACAO", table = "AEANFSAI")
    private String tipoTransacao;

    @Basic
    @Column(name = "TIPO_MERCADORIA", table = "AEANFSAI")
    private String tipoMercadoria;

    @Basic
    @Column(name = "COD_SIT", table = "AEANFSAI")
    private String codSit;

    @Basic
    @Column(name = "CHV_NFE", table = "AEANFSAI", length = 50)
    private String chvNfe;

    @Basic
    @Column(name = "NUMPROT", table = "AEANFSAI", length = 18)
    private String numprot;

    @Basic
    @Column(name = "DHNPROT", table = "AEANFSAI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dhnprot;

    @Basic
    @Column(name = "FINALIDADE", table = "AEANFSAI")
    private String finalidade;

    @Basic
    @Column(name = "NFE_SERVER", table = "AEANFSAI")
    private String nfeServer;

    @Basic
    @Column(name = "CRT", table = "AEANFSAI")
    private String crt;

    @Basic
    @Column(name = "NUMERO_RPS", table = "AEANFSAI")
    private Integer numeroRps;

    @Basic
    @Column(name = "ISS_RESP_RETENCAO", table = "AEANFSAI")
    private String issRespRetencao;

    @Basic
    @Column(name = "CONSUMIDOR_FINAL", table = "AEANFSAI")
    private String consumidorFinal;

    @Basic
    @Column(name = "NFE_CONTROLE", table = "AEANFSAI")
    private String nfeControle;

    @Basic
    @Column(name = "TIPO_NOTA", table = "AEANFSAI")
    private String tipoNota;

    @Basic
    @Column(name = "DT_HR_COFFL", table = "AEANFSAI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtHrCoffl;

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public int getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(int idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdAeaserieNf() {
        return idAeaserieNf;
    }

    public void setIdAeaserieNf(Integer idAeaserieNf) {
        this.idAeaserieNf = idAeaserieNf;
    }

    public Integer getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
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

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdRpafatur() {
        return idRpafatur;
    }

    public void setIdRpafatur(Integer idRpafatur) {
        this.idRpafatur = idRpafatur;
    }

    public Integer getIdAeanatur() {
        return idAeanatur;
    }

    public void setIdAeanatur(Integer idAeanatur) {
        this.idAeanatur = idAeanatur;
    }

    public Integer getIdGcacontr() {
        return idGcacontr;
    }

    public void setIdGcacontr(Integer idGcacontr) {
        this.idGcacontr = idGcacontr;
    }

    public Integer getIdAeatrans() {
        return idAeatrans;
    }

    public void setIdAeatrans(Integer idAeatrans) {
        this.idAeatrans = idAeatrans;
    }

    public Integer getIdCfanatopCfNf() {
        return idCfanatopCfNf;
    }

    public void setIdCfanatopCfNf(Integer idCfanatopCfNf) {
        this.idCfanatopCfNf = idCfanatopCfNf;
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

    public Date getDtNf() {
        return dtNf;
    }

    public void setDtNf(Date dtNf) {
        this.dtNf = dtNf;
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

    public String getDtSaidaVazio() {
        return dtSaidaVazio;
    }

    public void setDtSaidaVazio(String dtSaidaVazio) {
        this.dtSaidaVazio = dtSaidaVazio;
    }

    public Date getDtCancel() {
        return dtCancel;
    }

    public void setDtCancel(Date dtCancel) {
        this.dtCancel = dtCancel;
    }

    public Integer getNumeroNf() {
        return numeroNf;
    }

    public void setNumeroNf(Integer numeroNf) {
        this.numeroNf = numeroNf;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public double getVlMercCustoFis() {
        return vlMercCustoFis;
    }

    public void setVlMercCustoFis(double vlMercCustoFis) {
        this.vlMercCustoFis = vlMercCustoFis;
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

    public double getVlServCustoFis() {
        return vlServCustoFis;
    }

    public void setVlServCustoFis(double vlServCustoFis) {
        this.vlServCustoFis = vlServCustoFis;
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

    public double getVlBaseIcms() {
        return vlBaseIcms;
    }

    public void setVlBaseIcms(double vlBaseIcms) {
        this.vlBaseIcms = vlBaseIcms;
    }

    public double getVlBaseIcmsSub() {
        return vlBaseIcmsSub;
    }

    public void setVlBaseIcmsSub(double vlBaseIcmsSub) {
        this.vlBaseIcmsSub = vlBaseIcmsSub;
    }

    public double getVlBaseIss() {
        return vlBaseIss;
    }

    public void setVlBaseIss(double vlBaseIss) {
        this.vlBaseIss = vlBaseIss;
    }

    public double getVlBaseIpi() {
        return vlBaseIpi;
    }

    public void setVlBaseIpi(double vlBaseIpi) {
        this.vlBaseIpi = vlBaseIpi;
    }

    public double getVlIsentoIpi() {
        return vlIsentoIpi;
    }

    public void setVlIsentoIpi(double vlIsentoIpi) {
        this.vlIsentoIpi = vlIsentoIpi;
    }

    public double getVlIsentoIcms() {
        return vlIsentoIcms;
    }

    public void setVlIsentoIcms(double vlIsentoIcms) {
        this.vlIsentoIcms = vlIsentoIcms;
    }

    public double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public double getVlIcmsSub() {
        return vlIcmsSub;
    }

    public void setVlIcmsSub(double vlIcmsSub) {
        this.vlIcmsSub = vlIcmsSub;
    }

    public double getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public double getVlIss() {
        return vlIss;
    }

    public void setVlIss(double vlIss) {
        this.vlIss = vlIss;
    }

    public double getVlPis() {
        return vlPis;
    }

    public void setVlPis(double vlPis) {
        this.vlPis = vlPis;
    }

    public double getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(double vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public double getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(double vlCofins) {
        this.vlCofins = vlCofins;
    }

    public double getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(double vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
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

    public double getVlTotTrib() {
        return vlTotTrib;
    }

    public void setVlTotTrib(double vlTotTrib) {
        this.vlTotTrib = vlTotTrib;
    }

    public double getVlFcpUfDest() {
        return vlFcpUfDest;
    }

    public void setVlFcpUfDest(double vlFcpUfDest) {
        this.vlFcpUfDest = vlFcpUfDest;
    }

    public double getVlIcmsUfDest() {
        return vlIcmsUfDest;
    }

    public void setVlIcmsUfDest(double vlIcmsUfDest) {
        this.vlIcmsUfDest = vlIcmsUfDest;
    }

    public double getVlIcmsUfRemet() {
        return vlIcmsUfRemet;
    }

    public void setVlIcmsUfRemet(double vlIcmsUfRemet) {
        this.vlIcmsUfRemet = vlIcmsUfRemet;
    }

    public Double getFcVlTotal() {
        return fcVlTotal;
    }

    public void setFcVlTotal(Double fcVlTotal) {
        this.fcVlTotal = fcVlTotal;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
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

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getTipoBaixa() {
        return tipoBaixa;
    }

    public void setTipoBaixa(String tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public int getNumEmissoes() {
        return numEmissoes;
    }

    public void setNumEmissoes(int numEmissoes) {
        this.numEmissoes = numEmissoes;
    }

    public String getGerando() {
        return gerando;
    }

    public void setGerando(String gerando) {
        this.gerando = gerando;
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

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public String getTipoMercadoria() {
        return tipoMercadoria;
    }

    public void setTipoMercadoria(String tipoMercadoria) {
        this.tipoMercadoria = tipoMercadoria;
    }

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public String getNumprot() {
        return numprot;
    }

    public void setNumprot(String numprot) {
        this.numprot = numprot;
    }

    public Date getDhnprot() {
        return dhnprot;
    }

    public void setDhnprot(Date dhnprot) {
        this.dhnprot = dhnprot;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public String getNfeServer() {
        return nfeServer;
    }

    public void setNfeServer(String nfeServer) {
        this.nfeServer = nfeServer;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    public Integer getNumeroRps() {
        return numeroRps;
    }

    public void setNumeroRps(Integer numeroRps) {
        this.numeroRps = numeroRps;
    }

    public String getIssRespRetencao() {
        return issRespRetencao;
    }

    public void setIssRespRetencao(String issRespRetencao) {
        this.issRespRetencao = issRespRetencao;
    }

    public String getConsumidorFinal() {
        return consumidorFinal;
    }

    public void setConsumidorFinal(String consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }

    public String getNfeControle() {
        return nfeControle;
    }

    public void setNfeControle(String nfeControle) {
        this.nfeControle = nfeControle;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public Date getDtHrCoffl() {
        return dtHrCoffl;
    }

    public void setDtHrCoffl(Date dtHrCoffl) {
        this.dtHrCoffl = dtHrCoffl;
    }

}