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
import lombok.Data;


@Entity
@Table(name = "AEAENTRA")
@Data
public class AeaentraEntity {

    @Id
    @Column(name = "ID_AEAENTRA", table = "AEAENTRA", nullable = false)
    private Integer idAeaentra;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAENTRA", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_AEASERIE", table = "AEAENTRA", nullable = false)
    private Integer idAeaserie;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "AEAENTRA", nullable = false)
    private Integer idCfaclifo;

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
    private Integer numero;

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
    private Integer fechado;

    @Basic(optional = false)
    @Column(name = "NUM_EMISSOES", table = "AEAENTRA", nullable = false)
    private Integer numEmissoes;

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
}