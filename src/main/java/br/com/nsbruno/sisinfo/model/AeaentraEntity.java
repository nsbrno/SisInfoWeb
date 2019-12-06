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
@Table(name = "AEAENTRA")
public class AeaentraEntity {

    @Id
    @Column(name = "ID_AEAENTRA", table = "AEAENTRA", nullable = false)
    private Integer idAeaentra;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAENTRA", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_AEASERIE", table = "AEAENTRA", nullable = false)
    private int idAeaserie;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "AEAENTRA", nullable = false)
    private int idCfaclifo;

    @Basic
    @Column(name = "ID_AEACONEN", table = "AEAENTRA")
    private Integer idAeaconen;

    @Basic
    @Column(name = "ID_AEANATUR", table = "AEAENTRA")
    private Integer idAeanatur;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "AEAENTRA")
    private Integer idAeanfsai;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAENTRA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAENTRA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAENTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAENTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAENTRA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "AEAENTRA", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "SERIE", table = "AEAENTRA", length = 3)
    private String serie;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEAENTRA", nullable = false)
    private int numero;

    @Basic(optional = false)
    @Column(name = "DT_EMISSAO", table = "AEAENTRA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic(optional = false)
    @Column(name = "DT_SAIDA", table = "AEAENTRA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtSaida;

    @Basic(optional = false)
    @Column(name = "DT_ENTRADA", table = "AEAENTRA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;

    @Basic
    @Column(name = "DT_ESTORNO", table = "AEAENTRA")
    @Temporal(TemporalType.DATE)
    private Date dtEstorno;

    @Basic(optional = false)
    @Column(name = "VL_MERCADORIA", table = "AEAENTRA", nullable = false)
    private double vlMercadoria;

    @Basic(optional = false)
    @Column(name = "VL_FRETE", table = "AEAENTRA", nullable = false)
    private double vlFrete;

    @Basic(optional = false)
    @Column(name = "VL_SEGURO", table = "AEAENTRA", nullable = false)
    private double vlSeguro;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS", table = "AEAENTRA", nullable = false)
    private double vlOutros;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_FRETE", table = "AEAENTRA", nullable = false)
    private double vlBaseIcmsFrete;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_MERC", table = "AEAENTRA", nullable = false)
    private double vlBaseIcmsMerc;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_SUBST", table = "AEAENTRA", nullable = false)
    private double vlBaseIcmsSubst;

    @Basic(optional = false)
    @Column(name = "VL_BASE_IPI", table = "AEAENTRA", nullable = false)
    private double vlBaseIpi;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_FRETE", table = "AEAENTRA", nullable = false)
    private double vlIcmsFrete;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_MERC", table = "AEAENTRA", nullable = false)
    private double vlIcmsMerc;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_SUBST", table = "AEAENTRA", nullable = false)
    private double vlIcmsSubst;

    @Basic(optional = false)
    @Column(name = "VL_IPI", table = "AEAENTRA", nullable = false)
    private double vlIpi;

    @Basic(optional = false)
    @Column(name = "VL_FRETE_EXTRA", table = "AEAENTRA", nullable = false)
    private double vlFreteExtra;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_EXTRA", table = "AEAENTRA", nullable = false)
    private double vlIcmsExtra;

    @Basic(optional = false)
    @Column(name = "VL_IPI_EXTRA", table = "AEAENTRA", nullable = false)
    private double vlIpiExtra;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_ICMS", table = "AEAENTRA", nullable = false)
    private double vlIsentoIcms;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_IPI", table = "AEAENTRA", nullable = false)
    private double vlIsentoIpi;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "AEAENTRA", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_PG_ADIANTADO", table = "AEAENTRA", nullable = false)
    private double vlPgAdiantado;

    @Basic(optional = false)
    @Column(name = "VL_PIS", table = "AEAENTRA", nullable = false)
    private double vlPis;

    @Basic(optional = false)
    @Column(name = "VL_COFINS", table = "AEAENTRA", nullable = false)
    private double vlCofins;

    @Basic(optional = false)
    @Column(name = "VL_PIS_ST", table = "AEAENTRA", nullable = false)
    private double vlPisSt;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_ST", table = "AEAENTRA", nullable = false)
    private double vlCofinsSt;

    @Basic(optional = false)
    @Column(name = "VL_SUFRAMA", table = "AEAENTRA", nullable = false)
    private double vlSuframa;

    @Basic(optional = false)
    @Column(name = "VL_TERCEIROS", table = "AEAENTRA", nullable = false)
    private double vlTerceiros;

    @Basic(optional = false)
    @Column(name = "VL_TOT_TRIB", table = "AEAENTRA", nullable = false)
    private double vlTotTrib;

    @Basic(optional = false)
    @Column(name = "VL_FCP_UF_DEST", table = "AEAENTRA", nullable = false)
    private double vlFcpUfDest;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_UF_DEST", table = "AEAENTRA", nullable = false)
    private double vlIcmsUfDest;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_UF_REMET", table = "AEAENTRA", nullable = false)
    private double vlIcmsUfRemet;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_DESON", table = "AEAENTRA", nullable = false)
    private double vlIcmsDeson;

    @Basic(optional = false)
    @Column(name = "VL_IPI_DESON", table = "AEAENTRA", nullable = false)
    private double vlIpiDeson;

    @Basic(optional = false)
    @Column(name = "VL_PIS_DESON", table = "AEAENTRA", nullable = false)
    private double vlPisDeson;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_DESON", table = "AEAENTRA", nullable = false)
    private double vlCofinsDeson;

    @Basic
    @Column(name = "FC_VL_TOTAL", table = "AEAENTRA", precision = 15)
    private Double fcVlTotal;

    @Basic
    @Column(name = "FC_VL_TOTAL_GERAL", table = "AEAENTRA", precision = 15)
    private Double fcVlTotalGeral;

    @Basic
    @Column(name = "FC_VL_FATURAR", table = "AEAENTRA", precision = 15)
    private Double fcVlFaturar;

    @Basic
    @Column(name = "FC_CT_REP", table = "AEAENTRA", precision = 15)
    private Double fcCtRep;

    @Basic
    @Column(name = "FC_CT_REAL", table = "AEAENTRA", precision = 15)
    private Double fcCtReal;

    @Basic
    @Column(name = "FC_CT_COMP", table = "AEAENTRA", precision = 15)
    private Double fcCtComp;

    @Basic(optional = false)
    @Column(name = "DG_MERCADORIA", table = "AEAENTRA", nullable = false)
    private double dgMercadoria;

    @Basic(optional = false)
    @Column(name = "DG_FRETE", table = "AEAENTRA", nullable = false)
    private double dgFrete;

    @Basic(optional = false)
    @Column(name = "DG_SEGURO", table = "AEAENTRA", nullable = false)
    private double dgSeguro;

    @Basic(optional = false)
    @Column(name = "DG_OUTROS", table = "AEAENTRA", nullable = false)
    private double dgOutros;

    @Basic(optional = false)
    @Column(name = "DG_BASE_ICMS_FRETE", table = "AEAENTRA", nullable = false)
    private double dgBaseIcmsFrete;

    @Basic(optional = false)
    @Column(name = "DG_BASE_ICMS_MERC", table = "AEAENTRA", nullable = false)
    private double dgBaseIcmsMerc;

    @Basic(optional = false)
    @Column(name = "DG_BASE_ICMS_SUBST", table = "AEAENTRA", nullable = false)
    private double dgBaseIcmsSubst;

    @Basic(optional = false)
    @Column(name = "DG_BASE_IPI", table = "AEAENTRA", nullable = false)
    private double dgBaseIpi;

    @Basic(optional = false)
    @Column(name = "DG_ICMS_FRETE", table = "AEAENTRA", nullable = false)
    private double dgIcmsFrete;

    @Basic(optional = false)
    @Column(name = "DG_ICMS_MERC", table = "AEAENTRA", nullable = false)
    private double dgIcmsMerc;

    @Basic(optional = false)
    @Column(name = "DG_ICMS_SUBST", table = "AEAENTRA", nullable = false)
    private double dgIcmsSubst;

    @Basic(optional = false)
    @Column(name = "DG_IPI", table = "AEAENTRA", nullable = false)
    private double dgIpi;

    @Basic(optional = false)
    @Column(name = "DG_FRETE_EXTRA", table = "AEAENTRA", nullable = false)
    private double dgFreteExtra;

    @Basic(optional = false)
    @Column(name = "DG_ICMS_EXTRA", table = "AEAENTRA", nullable = false)
    private double dgIcmsExtra;

    @Basic(optional = false)
    @Column(name = "DG_IPI_EXTRA", table = "AEAENTRA", nullable = false)
    private double dgIpiExtra;

    @Basic(optional = false)
    @Column(name = "DG_ISENTO_ICMS", table = "AEAENTRA", nullable = false)
    private double dgIsentoIcms;

    @Basic(optional = false)
    @Column(name = "DG_ISENTO_IPI", table = "AEAENTRA", nullable = false)
    private double dgIsentoIpi;

    @Basic(optional = false)
    @Column(name = "DG_DESCONTO", table = "AEAENTRA", nullable = false)
    private double dgDesconto;

    @Basic(optional = false)
    @Column(name = "DG_PIS", table = "AEAENTRA", nullable = false)
    private double dgPis;

    @Basic(optional = false)
    @Column(name = "DG_COFINS", table = "AEAENTRA", nullable = false)
    private double dgCofins;

    @Basic(optional = false)
    @Column(name = "DG_PIS_ST", table = "AEAENTRA", nullable = false)
    private double dgPisSt;

    @Basic(optional = false)
    @Column(name = "DG_COFINS_ST", table = "AEAENTRA", nullable = false)
    private double dgCofinsSt;

    @Basic(optional = false)
    @Column(name = "DG_SUFRAMA", table = "AEAENTRA", nullable = false)
    private double dgSuframa;

    @Basic(optional = false)
    @Column(name = "DG_TOT_TRIB", table = "AEAENTRA", nullable = false)
    private double dgTotTrib;

    @Basic(optional = false)
    @Column(name = "DG_FCP_UF_DEST", table = "AEAENTRA", nullable = false)
    private double dgFcpUfDest;

    @Basic(optional = false)
    @Column(name = "DG_ICMS_UF_DEST", table = "AEAENTRA", nullable = false)
    private double dgIcmsUfDest;

    @Basic(optional = false)
    @Column(name = "DG_ICMS_UF_REMET", table = "AEAENTRA", nullable = false)
    private double dgIcmsUfRemet;

    @Basic(optional = false)
    @Column(name = "DG_ICMS_DESON", table = "AEAENTRA", nullable = false)
    private double dgIcmsDeson;

    @Basic(optional = false)
    @Column(name = "DG_IPI_DESON", table = "AEAENTRA", nullable = false)
    private double dgIpiDeson;

    @Basic(optional = false)
    @Column(name = "DG_PIS_DESON", table = "AEAENTRA", nullable = false)
    private double dgPisDeson;

    @Basic(optional = false)
    @Column(name = "DG_COFINS_DESON", table = "AEAENTRA", nullable = false)
    private double dgCofinsDeson;

    @Basic
    @Column(name = "FC_DG_TOTAL", table = "AEAENTRA", precision = 15)
    private Double fcDgTotal;

    @Basic
    @Column(name = "FC_DG_TOTAL_GERAL", table = "AEAENTRA", precision = 15)
    private Double fcDgTotalGeral;

    @Basic(optional = false)
    @Column(name = "VL_CUSTO_MERC_FIS", table = "AEAENTRA", nullable = false)
    private double vlCustoMercFis;

    @Basic(optional = false)
    @Column(name = "VL_CUSTO_MERC_CON", table = "AEAENTRA", nullable = false)
    private double vlCustoMercCon;

    @Basic(optional = false)
    @Column(name = "VL_CONSUMO_ENERGIA", table = "AEAENTRA", nullable = false)
    private double vlConsumoEnergia;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS", table = "AEAENTRA", nullable = false)
    private double aliquotaIcms;

    @Basic(optional = false)
    @Column(name = "JUROS_DESCONTO", table = "AEAENTRA", nullable = false)
    private double jurosDesconto;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "AEAENTRA", nullable = false)
    private short situacao;

    @Basic(optional = false)
    @Column(name = "FECHADO", table = "AEAENTRA", nullable = false)
    private int fechado;

    @Basic(optional = false)
    @Column(name = "NUM_EMISSOES", table = "AEAENTRA", nullable = false)
    private int numEmissoes;

    @Basic(optional = false)
    @Column(name = "TIPO_BAIXA", table = "AEAENTRA", nullable = false)
    private String tipoBaixa;

    @Basic
    @Column(name = "SUFRAMA", table = "AEAENTRA")
    private String suframa;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAENTRA")
    private byte[] obs;

    @Basic
    @Column(name = "TIPO_TRANSACAO", table = "AEAENTRA")
    private String tipoTransacao;

    @Basic
    @Column(name = "TIPO_MERCADORIAS", table = "AEAENTRA")
    private String tipoMercadorias;

    @Basic
    @Column(name = "COD_SIT", table = "AEAENTRA")
    private String codSit;

    @Basic
    @Column(name = "CHV_NFE", table = "AEAENTRA", length = 50)
    private String chvNfe;

    @Basic
    @Column(name = "NUMPROT", table = "AEAENTRA", length = 18)
    private String numprot;

    @Basic
    @Column(name = "DHNPROT", table = "AEAENTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dhnprot;

    @Basic
    @Column(name = "TIPO_EMISSAO", table = "AEAENTRA")
    private String tipoEmissao;

    @Basic
    @Column(name = "FINALIDADE", table = "AEAENTRA")
    private String finalidade;

    @Basic
    @Column(name = "NFE_SERVER", table = "AEAENTRA")
    private String nfeServer;

    @Basic
    @Column(name = "CONSUMIDOR_FINAL", table = "AEAENTRA")
    private String consumidorFinal;

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
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

    public int getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdAeaconen() {
        return idAeaconen;
    }

    public void setIdAeaconen(Integer idAeaconen) {
        this.idAeaconen = idAeaconen;
    }

    public Integer getIdAeanatur() {
        return idAeanatur;
    }

    public void setIdAeanatur(Integer idAeanatur) {
        this.idAeanatur = idAeanatur;
    }

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public Date getDtEstorno() {
        return dtEstorno;
    }

    public void setDtEstorno(Date dtEstorno) {
        this.dtEstorno = dtEstorno;
    }

    public double getVlMercadoria() {
        return vlMercadoria;
    }

    public void setVlMercadoria(double vlMercadoria) {
        this.vlMercadoria = vlMercadoria;
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

    public double getVlBaseIcmsFrete() {
        return vlBaseIcmsFrete;
    }

    public void setVlBaseIcmsFrete(double vlBaseIcmsFrete) {
        this.vlBaseIcmsFrete = vlBaseIcmsFrete;
    }

    public double getVlBaseIcmsMerc() {
        return vlBaseIcmsMerc;
    }

    public void setVlBaseIcmsMerc(double vlBaseIcmsMerc) {
        this.vlBaseIcmsMerc = vlBaseIcmsMerc;
    }

    public double getVlBaseIcmsSubst() {
        return vlBaseIcmsSubst;
    }

    public void setVlBaseIcmsSubst(double vlBaseIcmsSubst) {
        this.vlBaseIcmsSubst = vlBaseIcmsSubst;
    }

    public double getVlBaseIpi() {
        return vlBaseIpi;
    }

    public void setVlBaseIpi(double vlBaseIpi) {
        this.vlBaseIpi = vlBaseIpi;
    }

    public double getVlIcmsFrete() {
        return vlIcmsFrete;
    }

    public void setVlIcmsFrete(double vlIcmsFrete) {
        this.vlIcmsFrete = vlIcmsFrete;
    }

    public double getVlIcmsMerc() {
        return vlIcmsMerc;
    }

    public void setVlIcmsMerc(double vlIcmsMerc) {
        this.vlIcmsMerc = vlIcmsMerc;
    }

    public double getVlIcmsSubst() {
        return vlIcmsSubst;
    }

    public void setVlIcmsSubst(double vlIcmsSubst) {
        this.vlIcmsSubst = vlIcmsSubst;
    }

    public double getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public double getVlFreteExtra() {
        return vlFreteExtra;
    }

    public void setVlFreteExtra(double vlFreteExtra) {
        this.vlFreteExtra = vlFreteExtra;
    }

    public double getVlIcmsExtra() {
        return vlIcmsExtra;
    }

    public void setVlIcmsExtra(double vlIcmsExtra) {
        this.vlIcmsExtra = vlIcmsExtra;
    }

    public double getVlIpiExtra() {
        return vlIpiExtra;
    }

    public void setVlIpiExtra(double vlIpiExtra) {
        this.vlIpiExtra = vlIpiExtra;
    }

    public double getVlIsentoIcms() {
        return vlIsentoIcms;
    }

    public void setVlIsentoIcms(double vlIsentoIcms) {
        this.vlIsentoIcms = vlIsentoIcms;
    }

    public double getVlIsentoIpi() {
        return vlIsentoIpi;
    }

    public void setVlIsentoIpi(double vlIsentoIpi) {
        this.vlIsentoIpi = vlIsentoIpi;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlPgAdiantado() {
        return vlPgAdiantado;
    }

    public void setVlPgAdiantado(double vlPgAdiantado) {
        this.vlPgAdiantado = vlPgAdiantado;
    }

    public double getVlPis() {
        return vlPis;
    }

    public void setVlPis(double vlPis) {
        this.vlPis = vlPis;
    }

    public double getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(double vlCofins) {
        this.vlCofins = vlCofins;
    }

    public double getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(double vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public double getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(double vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }

    public double getVlSuframa() {
        return vlSuframa;
    }

    public void setVlSuframa(double vlSuframa) {
        this.vlSuframa = vlSuframa;
    }

    public double getVlTerceiros() {
        return vlTerceiros;
    }

    public void setVlTerceiros(double vlTerceiros) {
        this.vlTerceiros = vlTerceiros;
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

    public double getVlIcmsDeson() {
        return vlIcmsDeson;
    }

    public void setVlIcmsDeson(double vlIcmsDeson) {
        this.vlIcmsDeson = vlIcmsDeson;
    }

    public double getVlIpiDeson() {
        return vlIpiDeson;
    }

    public void setVlIpiDeson(double vlIpiDeson) {
        this.vlIpiDeson = vlIpiDeson;
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

    public Double getFcVlTotal() {
        return fcVlTotal;
    }

    public void setFcVlTotal(Double fcVlTotal) {
        this.fcVlTotal = fcVlTotal;
    }

    public Double getFcVlTotalGeral() {
        return fcVlTotalGeral;
    }

    public void setFcVlTotalGeral(Double fcVlTotalGeral) {
        this.fcVlTotalGeral = fcVlTotalGeral;
    }

    public Double getFcVlFaturar() {
        return fcVlFaturar;
    }

    public void setFcVlFaturar(Double fcVlFaturar) {
        this.fcVlFaturar = fcVlFaturar;
    }

    public Double getFcCtRep() {
        return fcCtRep;
    }

    public void setFcCtRep(Double fcCtRep) {
        this.fcCtRep = fcCtRep;
    }

    public Double getFcCtReal() {
        return fcCtReal;
    }

    public void setFcCtReal(Double fcCtReal) {
        this.fcCtReal = fcCtReal;
    }

    public Double getFcCtComp() {
        return fcCtComp;
    }

    public void setFcCtComp(Double fcCtComp) {
        this.fcCtComp = fcCtComp;
    }

    public double getDgMercadoria() {
        return dgMercadoria;
    }

    public void setDgMercadoria(double dgMercadoria) {
        this.dgMercadoria = dgMercadoria;
    }

    public double getDgFrete() {
        return dgFrete;
    }

    public void setDgFrete(double dgFrete) {
        this.dgFrete = dgFrete;
    }

    public double getDgSeguro() {
        return dgSeguro;
    }

    public void setDgSeguro(double dgSeguro) {
        this.dgSeguro = dgSeguro;
    }

    public double getDgOutros() {
        return dgOutros;
    }

    public void setDgOutros(double dgOutros) {
        this.dgOutros = dgOutros;
    }

    public double getDgBaseIcmsFrete() {
        return dgBaseIcmsFrete;
    }

    public void setDgBaseIcmsFrete(double dgBaseIcmsFrete) {
        this.dgBaseIcmsFrete = dgBaseIcmsFrete;
    }

    public double getDgBaseIcmsMerc() {
        return dgBaseIcmsMerc;
    }

    public void setDgBaseIcmsMerc(double dgBaseIcmsMerc) {
        this.dgBaseIcmsMerc = dgBaseIcmsMerc;
    }

    public double getDgBaseIcmsSubst() {
        return dgBaseIcmsSubst;
    }

    public void setDgBaseIcmsSubst(double dgBaseIcmsSubst) {
        this.dgBaseIcmsSubst = dgBaseIcmsSubst;
    }

    public double getDgBaseIpi() {
        return dgBaseIpi;
    }

    public void setDgBaseIpi(double dgBaseIpi) {
        this.dgBaseIpi = dgBaseIpi;
    }

    public double getDgIcmsFrete() {
        return dgIcmsFrete;
    }

    public void setDgIcmsFrete(double dgIcmsFrete) {
        this.dgIcmsFrete = dgIcmsFrete;
    }

    public double getDgIcmsMerc() {
        return dgIcmsMerc;
    }

    public void setDgIcmsMerc(double dgIcmsMerc) {
        this.dgIcmsMerc = dgIcmsMerc;
    }

    public double getDgIcmsSubst() {
        return dgIcmsSubst;
    }

    public void setDgIcmsSubst(double dgIcmsSubst) {
        this.dgIcmsSubst = dgIcmsSubst;
    }

    public double getDgIpi() {
        return dgIpi;
    }

    public void setDgIpi(double dgIpi) {
        this.dgIpi = dgIpi;
    }

    public double getDgFreteExtra() {
        return dgFreteExtra;
    }

    public void setDgFreteExtra(double dgFreteExtra) {
        this.dgFreteExtra = dgFreteExtra;
    }

    public double getDgIcmsExtra() {
        return dgIcmsExtra;
    }

    public void setDgIcmsExtra(double dgIcmsExtra) {
        this.dgIcmsExtra = dgIcmsExtra;
    }

    public double getDgIpiExtra() {
        return dgIpiExtra;
    }

    public void setDgIpiExtra(double dgIpiExtra) {
        this.dgIpiExtra = dgIpiExtra;
    }

    public double getDgIsentoIcms() {
        return dgIsentoIcms;
    }

    public void setDgIsentoIcms(double dgIsentoIcms) {
        this.dgIsentoIcms = dgIsentoIcms;
    }

    public double getDgIsentoIpi() {
        return dgIsentoIpi;
    }

    public void setDgIsentoIpi(double dgIsentoIpi) {
        this.dgIsentoIpi = dgIsentoIpi;
    }

    public double getDgDesconto() {
        return dgDesconto;
    }

    public void setDgDesconto(double dgDesconto) {
        this.dgDesconto = dgDesconto;
    }

    public double getDgPis() {
        return dgPis;
    }

    public void setDgPis(double dgPis) {
        this.dgPis = dgPis;
    }

    public double getDgCofins() {
        return dgCofins;
    }

    public void setDgCofins(double dgCofins) {
        this.dgCofins = dgCofins;
    }

    public double getDgPisSt() {
        return dgPisSt;
    }

    public void setDgPisSt(double dgPisSt) {
        this.dgPisSt = dgPisSt;
    }

    public double getDgCofinsSt() {
        return dgCofinsSt;
    }

    public void setDgCofinsSt(double dgCofinsSt) {
        this.dgCofinsSt = dgCofinsSt;
    }

    public double getDgSuframa() {
        return dgSuframa;
    }

    public void setDgSuframa(double dgSuframa) {
        this.dgSuframa = dgSuframa;
    }

    public double getDgTotTrib() {
        return dgTotTrib;
    }

    public void setDgTotTrib(double dgTotTrib) {
        this.dgTotTrib = dgTotTrib;
    }

    public double getDgFcpUfDest() {
        return dgFcpUfDest;
    }

    public void setDgFcpUfDest(double dgFcpUfDest) {
        this.dgFcpUfDest = dgFcpUfDest;
    }

    public double getDgIcmsUfDest() {
        return dgIcmsUfDest;
    }

    public void setDgIcmsUfDest(double dgIcmsUfDest) {
        this.dgIcmsUfDest = dgIcmsUfDest;
    }

    public double getDgIcmsUfRemet() {
        return dgIcmsUfRemet;
    }

    public void setDgIcmsUfRemet(double dgIcmsUfRemet) {
        this.dgIcmsUfRemet = dgIcmsUfRemet;
    }

    public double getDgIcmsDeson() {
        return dgIcmsDeson;
    }

    public void setDgIcmsDeson(double dgIcmsDeson) {
        this.dgIcmsDeson = dgIcmsDeson;
    }

    public double getDgIpiDeson() {
        return dgIpiDeson;
    }

    public void setDgIpiDeson(double dgIpiDeson) {
        this.dgIpiDeson = dgIpiDeson;
    }

    public double getDgPisDeson() {
        return dgPisDeson;
    }

    public void setDgPisDeson(double dgPisDeson) {
        this.dgPisDeson = dgPisDeson;
    }

    public double getDgCofinsDeson() {
        return dgCofinsDeson;
    }

    public void setDgCofinsDeson(double dgCofinsDeson) {
        this.dgCofinsDeson = dgCofinsDeson;
    }

    public Double getFcDgTotal() {
        return fcDgTotal;
    }

    public void setFcDgTotal(Double fcDgTotal) {
        this.fcDgTotal = fcDgTotal;
    }

    public Double getFcDgTotalGeral() {
        return fcDgTotalGeral;
    }

    public void setFcDgTotalGeral(Double fcDgTotalGeral) {
        this.fcDgTotalGeral = fcDgTotalGeral;
    }

    public double getVlCustoMercFis() {
        return vlCustoMercFis;
    }

    public void setVlCustoMercFis(double vlCustoMercFis) {
        this.vlCustoMercFis = vlCustoMercFis;
    }

    public double getVlCustoMercCon() {
        return vlCustoMercCon;
    }

    public void setVlCustoMercCon(double vlCustoMercCon) {
        this.vlCustoMercCon = vlCustoMercCon;
    }

    public double getVlConsumoEnergia() {
        return vlConsumoEnergia;
    }

    public void setVlConsumoEnergia(double vlConsumoEnergia) {
        this.vlConsumoEnergia = vlConsumoEnergia;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getJurosDesconto() {
        return jurosDesconto;
    }

    public void setJurosDesconto(double jurosDesconto) {
        this.jurosDesconto = jurosDesconto;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public int getFechado() {
        return fechado;
    }

    public void setFechado(int fechado) {
        this.fechado = fechado;
    }

    public int getNumEmissoes() {
        return numEmissoes;
    }

    public void setNumEmissoes(int numEmissoes) {
        this.numEmissoes = numEmissoes;
    }

    public String getTipoBaixa() {
        return tipoBaixa;
    }

    public void setTipoBaixa(String tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public String getTipoMercadorias() {
        return tipoMercadorias;
    }

    public void setTipoMercadorias(String tipoMercadorias) {
        this.tipoMercadorias = tipoMercadorias;
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

    public String getTipoEmissao() {
        return tipoEmissao;
    }

    public void setTipoEmissao(String tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
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

    public String getConsumidorFinal() {
        return consumidorFinal;
    }

    public void setConsumidorFinal(String consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }

}