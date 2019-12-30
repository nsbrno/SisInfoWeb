package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


@Entity
@Table(name = "SMAEMPRE")
@Data
public class SmaempreEntity {

    @Id
    @Column(name = "ID_SMAEMPRE", table = "SMAEMPRE", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_AEASITVE", table = "SMAEMPRE")
    private Integer idAeasitve;

    @Basic
    @Column(name = "ID_AEASITIT", table = "SMAEMPRE")
    private Integer idAeasitit;

    @Basic
    @Column(name = "ID_AEALOCES", table = "SMAEMPRE")
    private Integer idAealoces;

    @Basic
    @Column(name = "ID_AEAUNVEN", table = "SMAEMPRE")
    private Integer idAeaunven;

    @Basic
    @Column(name = "ID_CFAVIATR", table = "SMAEMPRE")
    private Integer idCfaviatr;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "SMAEMPRE")
    private Integer idCfamoeda;

    @Basic
    @Column(name = "ID_CFAMOEDA_PAIS", table = "SMAEMPRE")
    private Integer idCfamoedaPais;

    @Basic
    @Column(name = "ID_AEAPLPGT_VARE", table = "SMAEMPRE")
    private Integer idAeaplpgtVare;

    @Basic
    @Column(name = "ID_AEAPLPGT_ATAC", table = "SMAEMPRE")
    private Integer idAeaplpgtAtac;

    @Basic
    @Column(name = "ID_AEAPLPGT_ATAC_VISTA", table = "SMAEMPRE")
    private Integer idAeaplpgtAtacVista;

    @Basic
    @Column(name = "ID_AEAPLPGT_VARE_VISTA", table = "SMAEMPRE")
    private Integer idAeaplpgtVareVista;

    @Basic
    @Column(name = "ID_AEAPLPGT_VENDA_RAP", table = "SMAEMPRE")
    private Integer idAeaplpgtVendaRap;

    @Basic
    @Column(name = "ID_AEAFORMA_VARE", table = "SMAEMPRE")
    private Integer idAeaformaVare;

    @Basic
    @Column(name = "ID_AEAFORMA_ATAC", table = "SMAEMPRE")
    private Integer idAeaformaAtac;

    @Basic
    @Column(name = "ID_CFACLIFO_VEND_LOJA", table = "SMAEMPRE")
    private Integer idCfaclifoVendLoja;

    @Basic
    @Column(name = "ID_AEASERIE_PED_ECF", table = "SMAEMPRE")
    private Integer idAeaseriePedEcf;

    @Basic
    @Column(name = "ID_AEASERIE_ECF", table = "SMAEMPRE")
    private Integer idAeaserieEcf;

    @Basic
    @Column(name = "ID_AEASERIE_PED", table = "SMAEMPRE")
    private Integer idAeaseriePed;

    @Basic
    @Column(name = "ID_AEASERIE_ORC", table = "SMAEMPRE")
    private Integer idAeaserieOrc;

    @Basic
    @Column(name = "ID_AEASERIE_ORC_PALM", table = "SMAEMPRE")
    private Integer idAeaserieOrcPalm;

    @Basic
    @Column(name = "ID_AEASERIE_NF", table = "SMAEMPRE")
    private Integer idAeaserieNf;

    @Basic
    @Column(name = "ID_AEASERIE_PEN", table = "SMAEMPRE")
    private Integer idAeaseriePen;

    @Basic
    @Column(name = "ID_AEASERIE_OS", table = "SMAEMPRE")
    private Integer idAeaserieOs;

    @Basic
    @Column(name = "ID_AEACODST_ENT", table = "SMAEMPRE")
    private Integer idAeacodstEnt;

    @Basic
    @Column(name = "ID_AEACODST", table = "SMAEMPRE")
    private Integer idAeacodst;

    @Basic
    @Column(name = "ID_CFAESTAD_FISCAL", table = "SMAEMPRE")
    private Integer idCfaestadFiscal;

    @Basic
    @Column(name = "ID_CFATPDOC_LF_NF", table = "SMAEMPRE")
    private Integer idCfatpdocLfNf;

    @Basic
    @Column(name = "ID_CFATPDOC_LF_MF", table = "SMAEMPRE")
    private Integer idCfatpdocLfMf;

    @Basic
    @Column(name = "ID_CFATPDOC_LF_CN", table = "SMAEMPRE")
    private Integer idCfatpdocLfCn;

    @Basic
    @Column(name = "ID_CFATPDOC_REFAT", table = "SMAEMPRE")
    private Integer idCfatpdocRefat;

    @Basic
    @Column(name = "ID_CFACLIFO_VISTA", table = "SMAEMPRE")
    private Integer idCfaclifoVista;

    @Basic
    @Column(name = "ID_CFACLIFO_CAIXA", table = "SMAEMPRE")
    private Integer idCfaclifoCaixa;

    @Basic
    @Column(name = "ID_CFACLIFO_CARTAO", table = "SMAEMPRE")
    private Integer idCfaclifoCartao;

    @Basic
    @Column(name = "ID_CFACLIFO_CHEQUE", table = "SMAEMPRE")
    private Integer idCfaclifoCheque;

    @Basic
    @Column(name = "ID_CFAPORTA_CAIXA", table = "SMAEMPRE")
    private Integer idCfaportaCaixa;

    @Basic
    @Column(name = "ID_CFATPCOB_CAIXA", table = "SMAEMPRE")
    private Integer idCfatpcobCaixa;

    @Basic
    @Column(name = "ID_CFATPFAT_REC_PVV", table = "SMAEMPRE")
    private Integer idCfatpfatRecPvv;

    @Basic
    @Column(name = "ID_CFATPFAT_REC_PVA", table = "SMAEMPRE")
    private Integer idCfatpfatRecPva;

    @Basic
    @Column(name = "ID_CFATPFAT_REC_VFV", table = "SMAEMPRE")
    private Integer idCfatpfatRecVfv;

    @Basic
    @Column(name = "ID_CFATPFAT_REC_VFA", table = "SMAEMPRE")
    private Integer idCfatpfatRecVfa;

    @Basic
    @Column(name = "ID_CFATPFAT_REC_CON", table = "SMAEMPRE")
    private Integer idCfatpfatRecCon;

    @Basic
    @Column(name = "ID_CFATPFAT_PAG_ED", table = "SMAEMPRE")
    private Integer idCfatpfatPagEd;

    @Basic
    @Column(name = "ID_CFATPFAT_PAG_EN", table = "SMAEMPRE")
    private Integer idCfatpfatPagEn;

    @Basic
    @Column(name = "ID_CFATPFAT_PAG_DV", table = "SMAEMPRE")
    private Integer idCfatpfatPagDv;

    @Basic
    @Column(name = "ID_CFATPFAT_PAG_DF", table = "SMAEMPRE")
    private Integer idCfatpfatPagDf;

    @Basic
    @Column(name = "ID_CFATPFAT_PAG_PC", table = "SMAEMPRE")
    private Integer idCfatpfatPagPc;

    @Basic
    @Column(name = "ID_CFATPFAT_PAG_FRETE_D", table = "SMAEMPRE")
    private Integer idCfatpfatPagFreteD;

    @Basic
    @Column(name = "ID_CFATPFAT_PAG_FRETE_N", table = "SMAEMPRE")
    private Integer idCfatpfatPagFreteN;

    @Basic
    @Column(name = "ID_CFAESTAD_UF_ORGAO", table = "SMAEMPRE")
    private Integer idCfaestadUfOrgao;

    @Basic
    @Column(name = "ID_CBAPLCTA_JUROS_REFAT", table = "SMAEMPRE")
    private Integer idCbaplctaJurosRefat;

    @Basic
    @Column(name = "ID_CBAPLCTA_DESC_REFAT", table = "SMAEMPRE")
    private Integer idCbaplctaDescRefat;

    @Basic
    @Column(name = "ID_CBAPLCTA_RETORNO", table = "SMAEMPRE")
    private Integer idCbaplctaRetorno;

    @Basic
    @Column(name = "ID_CBAPLCTA_C_RETORNO", table = "SMAEMPRE")
    private Integer idCbaplctaCRetorno;

    @Basic
    @Column(name = "ID_CBAPLCTA_EST_FIS", table = "SMAEMPRE")
    private Integer idCbaplctaEstFis;

    @Basic
    @Column(name = "ID_CBAPLCTA_C_EST_FIS", table = "SMAEMPRE")
    private Integer idCbaplctaCEstFis;

    @Basic
    @Column(name = "ID_CBAPLCTA_EST_CON", table = "SMAEMPRE")
    private Integer idCbaplctaEstCon;

    @Basic
    @Column(name = "ID_CBAPLCTA_C_EST_CON", table = "SMAEMPRE")
    private Integer idCbaplctaCEstCon;

    @Basic
    @Column(name = "ID_CBAPLCTA_CMV_FIS", table = "SMAEMPRE")
    private Integer idCbaplctaCmvFis;

    @Basic
    @Column(name = "ID_CBAPLCTA_CMV_CON", table = "SMAEMPRE")
    private Integer idCbaplctaCmvCon;

    @Basic
    @Column(name = "ID_AEAPESOS", table = "SMAEMPRE")
    private Integer idAeapesos;

    @Basic
    @Column(name = "ID_CFASTATU", table = "SMAEMPRE")
    private Integer idCfastatu;

    @Basic
    @Column(name = "ID_CBADCONT", table = "SMAEMPRE")
    private Integer idCbadcont;

    @Basic
    @Column(name = "ID_CFAATIVI", table = "SMAEMPRE")
    private Integer idCfaativi;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAEMPRE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAEMPRE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAEMPRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAEMPRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAEMPRE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "SMAEMPRE", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "NOME_RAZAO", table = "SMAEMPRE", nullable = false, length = 60)
    private String nomeRazao;

    @Basic
    @Column(name = "NOME_FANTASIA", table = "SMAEMPRE", length = 60)
    private String nomeFantasia;

    @Basic
    @Column(name = "CPF_CGC", table = "SMAEMPRE", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "PESSOA", table = "SMAEMPRE")
    private String pessoa;

    @Basic
    @Column(name = "IE_RG", table = "SMAEMPRE", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "ORGAO_EMISSOR", table = "SMAEMPRE", length = 3)
    private String orgaoEmissor;

    @Basic(optional = false)
    @Column(name = "CURVA_A_FIS", table = "SMAEMPRE", nullable = false)
    private double curvaAFis;

    @Basic(optional = false)
    @Column(name = "CURVA_B_FIS", table = "SMAEMPRE", nullable = false)
    private double curvaBFis;

    @Basic(optional = false)
    @Column(name = "CURVA_C_FIS", table = "SMAEMPRE", nullable = false)
    private double curvaCFis;

    @Basic(optional = false)
    @Column(name = "CURVA_A_FIN", table = "SMAEMPRE", nullable = false)
    private double curvaAFin;

    @Basic(optional = false)
    @Column(name = "CURVA_B_FIN", table = "SMAEMPRE", nullable = false)
    private double curvaBFin;

    @Basic(optional = false)
    @Column(name = "CURVA_C_FIN", table = "SMAEMPRE", nullable = false)
    private double curvaCFin;

    @Basic
    @Column(name = "VALIDADE", table = "SMAEMPRE")
    private String validade;

    @Basic(optional = false)
    @Column(name = "PESO", table = "SMAEMPRE", nullable = false)
    private Integer peso;

    @Basic
    @Column(name = "ATAC_VAREJO", table = "SMAEMPRE")
    private String atacVarejo;

    @Basic
    @Column(name = "VENDE_ATAC_VARE", table = "SMAEMPRE", length = 3)
    private String vendeAtacVare;

    @Basic(optional = false)
    @Column(name = "VALIDADE_ORCAMENTO", table = "SMAEMPRE", nullable = false)
    private Integer validadeOrcamento;

    @Basic
    @Column(name = "ORC_SEM_ESTOQUE", table = "SMAEMPRE")
    private String orcSemEstoque;

    @Basic
    @Column(name = "PED_SEM_ESTOQUE", table = "SMAEMPRE")
    private String pedSemEstoque;

    @Basic
    @Column(name = "NFS_SEM_ESTOQUE", table = "SMAEMPRE")
    private String nfsSemEstoque;

    @Basic
    @Column(name = "CENTAVOS", table = "SMAEMPRE")
    private String centavos;

    @Basic
    @Column(name = "GERA_LISAI", table = "SMAEMPRE")
    private String geraLisai;

    @Basic
    @Column(name = "GERA_LIENT", table = "SMAEMPRE")
    private String geraLient;

    @Basic(optional = false)
    @Column(name = "VAL_MARKUP_ATAC1", table = "SMAEMPRE", nullable = false)
    private double valMarkupAtac1;

    @Basic(optional = false)
    @Column(name = "VAL_MARKUP_ATAC2", table = "SMAEMPRE", nullable = false)
    private double valMarkupAtac2;

    @Basic(optional = false)
    @Column(name = "VAL_MARKUP_ATAC3", table = "SMAEMPRE", nullable = false)
    private double valMarkupAtac3;

    @Basic(optional = false)
    @Column(name = "VAL_MARKUP_VARE1", table = "SMAEMPRE", nullable = false)
    private double valMarkupVare1;

    @Basic(optional = false)
    @Column(name = "VAL_MARKUP_VARE2", table = "SMAEMPRE", nullable = false)
    private double valMarkupVare2;

    @Basic(optional = false)
    @Column(name = "VAL_MARKUP_VARE3", table = "SMAEMPRE", nullable = false)
    private double valMarkupVare3;

    @Basic(optional = false)
    @Column(name = "MARKUP_ATAC1", table = "SMAEMPRE", nullable = false)
    private double markupAtac1;

    @Basic(optional = false)
    @Column(name = "MARKUP_ATAC2", table = "SMAEMPRE", nullable = false)
    private double markupAtac2;

    @Basic(optional = false)
    @Column(name = "MARKUP_ATAC3", table = "SMAEMPRE", nullable = false)
    private double markupAtac3;

    @Basic(optional = false)
    @Column(name = "MARKUP_VARE1", table = "SMAEMPRE", nullable = false)
    private double markupVare1;

    @Basic(optional = false)
    @Column(name = "MARKUP_VARE2", table = "SMAEMPRE", nullable = false)
    private double markupVare2;

    @Basic(optional = false)
    @Column(name = "MARKUP_VARE3", table = "SMAEMPRE", nullable = false)
    private double markupVare3;

    @Basic(optional = false)
    @Column(name = "DIAS_ATRAZO", table = "SMAEMPRE", nullable = false)
    private Integer diasAtrazo;

    @Basic(optional = false)
    @Column(name = "SEM_MOVIMENTO", table = "SMAEMPRE", nullable = false)
    private Integer semMovimento;

    @Basic(optional = false)
    @Column(name = "ANO_ATUAL", table = "SMAEMPRE", nullable = false)
    private Integer anoAtual;

    @Basic(optional = false)
    @Column(name = "MES_ATUAL", table = "SMAEMPRE", nullable = false)
    private Integer mesAtual;

    @Basic(optional = false)
    @Column(name = "MESES_ANALISE", table = "SMAEMPRE", nullable = false)
    private Integer mesesAnalise;

    @Basic(optional = false)
    @Column(name = "INCREMENTO_SEQUENCIA", table = "SMAEMPRE", nullable = false)
    private Integer incrementoSequencia;

    @Basic(optional = false)
    @Column(name = "SUGESTAO_QUANTIDADE", table = "SMAEMPRE", nullable = false)
    private double sugestaoQuantidade;

    @Basic
    @Column(name = "LEITURA_OTICA", table = "SMAEMPRE")
    private String leituraOtica;

    @Basic
    @Column(name = "GERA_IMP_PED", table = "SMAEMPRE")
    private String geraImpPed;

    @Basic
    @Column(name = "GERA_IMP_SEPAR_PED", table = "SMAEMPRE")
    private String geraImpSeparPed;

    @Basic
    @Column(name = "GERA_IMP_NF", table = "SMAEMPRE")
    private String geraImpNf;

    @Basic
    @Column(name = "USA_SIMILAR", table = "SMAEMPRE")
    private String usaSimilar;

    @Basic
    @Column(name = "FATURA_NF", table = "SMAEMPRE")
    private String faturaNf;

    @Basic
    @Column(name = "FATURA_PEDIDO", table = "SMAEMPRE")
    private String faturaPedido;

    @Basic(optional = false)
    @Column(name = "JUROS_DIARIO", table = "SMAEMPRE", nullable = false)
    private double jurosDiario;

    @Basic
    @Column(name = "CAPITALIZA", table = "SMAEMPRE")
    private String capitaliza;

    @Basic
    @Column(name = "EMITE_RECIBO", table = "SMAEMPRE")
    private String emiteRecibo;

    @Basic
    @Column(name = "INDEXA", table = "SMAEMPRE")
    private String indexa;

    @Basic
    @Column(name = "INDICE_VALOR", table = "SMAEMPRE")
    private String indiceValor;

    @Basic
    @Column(name = "DIST_SERV_ORC", table = "SMAEMPRE")
    private String distServOrc;

    @Basic
    @Column(name = "DIST_SERV_REQ", table = "SMAEMPRE")
    private String distServReq;

    @Basic
    @Column(name = "DIST_SERV_PED", table = "SMAEMPRE")
    private String distServPed;

    @Basic
    @Column(name = "DIST_SERV_NF", table = "SMAEMPRE")
    private String distServNf;

    @Basic
    @Column(name = "DT_GERA_FAT", table = "SMAEMPRE")
    private String dtGeraFat;

    @Basic
    @Column(name = "DT_GERA_NF", table = "SMAEMPRE")
    private String dtGeraNf;

    @Basic
    @Column(name = "DT_FAT_SEGUE", table = "SMAEMPRE")
    private String dtFatSegue;

    @Basic
    @Column(name = "DT_NF_SEGUE", table = "SMAEMPRE")
    private String dtNfSegue;

    @Basic
    @Column(name = "MODELO_CONTABIL", table = "SMAEMPRE")
    private String modeloContabil;

    @Basic
    @Column(name = "INTEG_CXREG_MOV", table = "SMAEMPRE")
    private String IntegeregCxregMov;

    @Basic
    @Column(name = "INTEG_CXREG_ACE", table = "SMAEMPRE")
    private String IntegeregCxregAce;

    @Basic
    @Column(name = "INTEG_FIN", table = "SMAEMPRE")
    private String IntegeregFin;

    @Basic(optional = false)
    @Column(name = "DIAS_VENDA_VISTA", table = "SMAEMPRE", nullable = false)
    private Integer diasVendaVista;

    @Basic
    @Column(name = "ROMANEIO_FECHADO_CARGA", table = "SMAEMPRE")
    private String romaneioFechadoCarga;

    @Basic(optional = false)
    @Column(name = "PERC_DESC_PGTO_ANT", table = "SMAEMPRE", nullable = false)
    private double percDescPgtoAnt;

    @Basic
    @Column(name = "TEM_DOCTO_REC", table = "SMAEMPRE")
    private String temDoctoRec;

    @Basic
    @Column(name = "TEM_DOCTO_PAG", table = "SMAEMPRE")
    private String temDoctoPag;

    @Basic(optional = false)
    @Column(name = "DIAS_CARENCIA", table = "SMAEMPRE", nullable = false)
    private Integer diasCarencia;

    @Basic
    @Column(name = "BAIXA_SEM_DOCTO_REC", table = "SMAEMPRE")
    private String baixaSemDoctoRec;

    @Basic
    @Column(name = "BAIXA_SEM_DOCTO_PAG", table = "SMAEMPRE")
    private String baixaSemDoctoPag;

    @Basic(optional = false)
    @Column(name = "DIAS_PEDIDOS_PALM", table = "SMAEMPRE", nullable = false)
    private Integer diasPedidosPalm;

    @Basic
    @Column(name = "PATH_FTP_REC", table = "SMAEMPRE", length = 128)
    private String pathFtpRec;

    @Basic
    @Column(name = "PATH_FTP_ENV", table = "SMAEMPRE", length = 128)
    private String pathFtpEnv;

    @Basic
    @Column(name = "VALIDADE_PRECO_PALM_INI", table = "SMAEMPRE")
    @Temporal(TemporalType.DATE)
    private Date validadePrecoPalmIni;

    @Basic
    @Column(name = "VALIDADE_PRECO_PALM_FIM", table = "SMAEMPRE")
    @Temporal(TemporalType.DATE)
    private Date validadePrecoPalmFim;

    @Basic(optional = false)
    @Column(name = "PERC_JR_VENC_PARC_MENOR", table = "SMAEMPRE", nullable = false)
    private double percJrVencParcMenor;

    @Basic
    @Column(name = "NUM_PARCELA", table = "SMAEMPRE")
    private Integer numParcela;

    @Basic
    @Column(name = "COD_PROD_ORC", table = "SMAEMPRE")
    private String codProdOrc;

    @Basic
    @Column(name = "COD_PROD_PED", table = "SMAEMPRE")
    private String codProdPed;

    @Basic
    @Column(name = "COD_PROD_TRANS", table = "SMAEMPRE")
    private String codProdTrans;

    @Basic
    @Column(name = "COD_PROD_NF", table = "SMAEMPRE")
    private String codProdNf;

    @Basic
    @Column(name = "COD_PROD_COM", table = "SMAEMPRE")
    private String codProdCom;

    @Basic
    @Column(name = "COD_PROD_DEFAULT", table = "SMAEMPRE")
    private String codProdDefault;

    @Basic
    @Column(name = "COD_PROD_TELAS", table = "SMAEMPRE")
    private String codProdTelas;

    @Basic
    @Column(name = "TEM_DOCTO_NAO_ALTERA_CR", table = "SMAEMPRE")
    private String temDoctoNaoAlteraCr;

    @Basic
    @Column(name = "TEM_DOCTO_NAO_ALTERA_CP", table = "SMAEMPRE")
    private String temDoctoNaoAlteraCp;

    @Basic
    @Column(name = "AUT_DOCTO_NAO_ALTERA_CR", table = "SMAEMPRE")
    private String autDoctoNaoAlteraCr;

    @Basic
    @Column(name = "AUT_DOCTO_NAO_ALTERA_CP", table = "SMAEMPRE")
    private String autDoctoNaoAlteraCp;

    @Basic
    @Column(name = "CHECA_NUM_EMISSOES", table = "SMAEMPRE")
    private String checaNumEmissoes;

    @Basic
    @Column(name = "DESC_UNIT_ECF", table = "SMAEMPRE")
    private String descUnitEcf;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "SMAEMPRE")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "ORDEM_PROD_CONSULTA", table = "SMAEMPRE")
    private String ordemProdConsulta;

    @Basic
    @Column(name = "MUDA_CONTA_CP", table = "SMAEMPRE")
    private String mudaContaCp;

    @Basic
    @Column(name = "MUDA_CONTA_CR", table = "SMAEMPRE")
    private String mudaContaCr;

    @Basic
    @Column(name = "VENCTO_EM_FERIADO", table = "SMAEMPRE")
    private String venctoEmFeriado;

    @Basic
    @Column(name = "VENDE_BLOQUEADO_ORC", table = "SMAEMPRE")
    private String vendeBloqueadoOrc;

    @Basic
    @Column(name = "VENDE_BLOQUEADO_PED", table = "SMAEMPRE")
    private String vendeBloqueadoPed;

    @Basic
    @Column(name = "VENDE_BLOQUEADO_FAT", table = "SMAEMPRE")
    private String vendeBloqueadoFat;

    @Basic
    @Column(name = "VALIDA_PROD_ORC", table = "SMAEMPRE")
    private String validaProdOrc;

    @Basic
    @Column(name = "VALIDA_PROD_PED", table = "SMAEMPRE")
    private String validaProdPed;

    @Basic
    @Column(name = "VALIDA_PROD_NFS", table = "SMAEMPRE")
    private String validaProdNfs;

    @Basic
    @Column(name = "VALIDA_PROD_INV", table = "SMAEMPRE")
    private String validaProdInv;

    @Basic
    @Column(name = "VALIDA_PROD_ENT", table = "SMAEMPRE")
    private String validaProdEnt;

    @Basic
    @Column(name = "VALIDA_PROD_TRA", table = "SMAEMPRE")
    private String validaProdTra;

    @Basic
    @Column(name = "VALIDA_PROD_COM", table = "SMAEMPRE")
    private String validaProdCom;

    @Basic
    @Column(name = "FONTE_RELAT_NOME", table = "SMAEMPRE", length = 20)
    private String fonteRelatNome;

    @Basic(optional = false)
    @Column(name = "FONTE_RELAT_SIZE", table = "SMAEMPRE", nullable = false)
    private Integer fonteRelatSize;

    @Basic
    @Column(name = "AGRUPA_PEDIDOS", table = "SMAEMPRE")
    private String agrupaPedidos;

    @Basic
    @Column(name = "WORK_ON_DATE_SERVER", table = "SMAEMPRE")
    private String workOnDateServer;

    @Basic
    @Column(name = "CODIGO_SPC", table = "SMAEMPRE", length = 18)
    private String codigoSpc;

    @Basic
    @Column(name = "DUPLICATA_UNICA", table = "SMAEMPRE")
    private String duplicataUnica;

    @Basic
    @Column(name = "AGUARDA_FATURAMENTO", table = "SMAEMPRE")
    private String aguardaFaturamento;

    @Basic
    @Column(name = "ENTRADA_PROD_SO_COM_PEDIDO", table = "SMAEMPRE")
    private String entradaProdSoComPedido;

    @Basic(optional = false)
    @Column(name = "VALIDADE_FICHA_CLIENTE", table = "SMAEMPRE", nullable = false)
    private Integer validadeFichaCliente;

    @Basic(optional = false)
    @Column(name = "PERC_JR_VENC_PARC_MAIOR", table = "SMAEMPRE", nullable = false)
    private double percJrVencParcMaior;

    @Basic(optional = false)
    @Column(name = "PERC_JUROS_DIA_REFAT", table = "SMAEMPRE", nullable = false)
    private double percJurosDiaRefat;

    @Basic(optional = false)
    @Column(name = "PERC_MULTA", table = "SMAEMPRE", nullable = false)
    private double percMulta;

    @Basic
    @Column(name = "SUGERE_PRODUTO_GRID", table = "SMAEMPRE")
    private String sugereProdutoGrid;

    @Basic
    @Column(name = "ACESSA_ESTOQ_MOVIM", table = "SMAEMPRE")
    private String acessaEstoqMovim;

    @Basic
    @Column(name = "ACESSA_PLANO_MOVIM", table = "SMAEMPRE")
    private String acessaPlanoMovim;

    @Basic
    @Column(name = "ACEITA_QTDE_NEG_ORC", table = "SMAEMPRE")
    private String aceitaQtdeNegOrc;

    @Basic
    @Column(name = "ACEITA_QTDE_NEG_PED", table = "SMAEMPRE")
    private String aceitaQtdeNegPed;

    @Basic
    @Column(name = "ACEITA_QTDE_NEG_ENT", table = "SMAEMPRE")
    private String aceitaQtdeNegEnt;

    @Basic
    @Column(name = "ENTREGA_SO_CONFERIDO", table = "SMAEMPRE")
    private String entregaSoConferido;

    @Basic(optional = false)
    @Column(name = "PERC_CREDITO_RENDA", table = "SMAEMPRE", nullable = false)
    private double percCreditoRenda;

    @Basic
    @Column(name = "USA_RENDA_CONJ_LIMCRE", table = "SMAEMPRE")
    private String usaRendaConjLimcre;

    @Basic
    @Column(name = "TIPO_ANALISE_CREDITO", table = "SMAEMPRE")
    private String tipoAnaliseCredito;

    @Basic
    @Column(name = "FONTE_ANALISE_CREDITO", table = "SMAEMPRE")
    private String fonteAnaliseCredito;

    @Basic(optional = false)
    @Column(name = "LUCRO_MINIMO", table = "SMAEMPRE", nullable = false)
    private double lucroMinimo;

    @Basic
    @Column(name = "OPCAO_PEN", table = "SMAEMPRE")
    private String opcaoPen;

    @Basic(optional = false)
    @Column(name = "VL_MIN_PRAZO_VAREJO", table = "SMAEMPRE", nullable = false)
    private double vlMinPrazoVarejo;

    @Basic(optional = false)
    @Column(name = "VL_MIN_PRAZO_ATACADO", table = "SMAEMPRE", nullable = false)
    private double vlMinPrazoAtacado;

    @Basic(optional = false)
    @Column(name = "VL_MIN_VISTA_VAREJO", table = "SMAEMPRE", nullable = false)
    private double vlMinVistaVarejo;

    @Basic(optional = false)
    @Column(name = "VL_MIN_VISTA_ATACADO", table = "SMAEMPRE", nullable = false)
    private double vlMinVistaAtacado;

    @Basic
    @Column(name = "FATURA_VL_MIN", table = "SMAEMPRE")
    private String faturaVlMin;

    @Basic
    @Column(name = "SUFRAMA", table = "SMAEMPRE", length = 20)
    private String suframa;

    @Basic
    @Column(name = "INSC_MUNICIPAL", table = "SMAEMPRE", length = 20)
    private String inscMunicipal;

    @Basic
    @Column(name = "CNAE", table = "SMAEMPRE", length = 15)
    private String cnae;

    @Basic
    @Column(name = "PERFIL_SPED", table = "SMAEMPRE")
    private String perfilSped;

    @Basic(optional = false)
    @Column(name = "PERC_FAT_ATAC", table = "SMAEMPRE", nullable = false)
    private double percFatAtac;

    @Basic(optional = false)
    @Column(name = "PERC_FAT_VARE", table = "SMAEMPRE", nullable = false)
    private double percFatVare;

    @Basic
    @Column(name = "PERMITE_RETORNO_COM_NF", table = "SMAEMPRE")
    private String permiteRetornoComNf;

    @Basic
    @Column(name = "MULTIPLOS_PLANOS", table = "SMAEMPRE")
    private String multiplosPlanos;

    @Basic
    @Column(name = "PARCELAS_CREDITO", table = "SMAEMPRE")
    private String parcelasCredito;

    @Basic
    @Column(name = "PEDIDO_FECHADO", table = "SMAEMPRE")
    private String pedidoFechado;

    @Basic
    @Column(name = "FICHA_SEM_DOC", table = "SMAEMPRE")
    private String fichaSemDoc;

    @Basic
    @Column(name = "TIPO_PRODUTO", table = "SMAEMPRE")
    private String tipoProduto;

    @Basic
    @Column(name = "CRT", table = "SMAEMPRE")
    private String crt;

    @Basic
    @Column(name = "CSOSN", table = "SMAEMPRE", length = 3)
    private String csosn;

    @Basic
    @Column(name = "IND_ATIV", table = "SMAEMPRE")
    private String indAtiv;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_SN", table = "SMAEMPRE", nullable = false)
    private double aliquotaSn;

    @Basic
    @Column(name = "TIPO_BAIXA_DEVOL", table = "SMAEMPRE")
    private String tipoBaixaDevol;

    @Basic
    @Column(name = "CODIGO_PREFEITURA_NFSE", table = "SMAEMPRE", length = 20)
    private String codigoPrefeituraNfse;

    @Basic(optional = false)
    @Column(name = "HORAS_DIA_IND", table = "SMAEMPRE", nullable = false)
    private Integer horasDiaInd;

    @Basic
    @Column(name = "SPC_WS_OPERADOR", table = "SMAEMPRE", length = 26)
    private String spcWsOperador;

    @Basic
    @Column(name = "SPC_WS_SENHA", table = "SMAEMPRE", length = 20)
    private String spcWsSenha;

    @Basic
    @Column(name = "SPC_WS_CODIGO", table = "SMAEMPRE", length = 26)
    private String spcWsCodigo;

    @Basic(optional = false)
    @Column(name = "QTD_DIAS_DESTACA_PRODUTO", table = "SMAEMPRE", nullable = false)
    private Integer qtdDiasDestacaProduto;

    @Basic
    @Column(name = "FECHA_VENDA_CRED_NEG_ATAC", table = "SMAEMPRE")
    private String fechaVendaCredNegAtac;

    @Basic
    @Column(name = "FECHA_VENDA_CRED_NEG_VARE", table = "SMAEMPRE")
    private String fechaVendaCredNegVare;

    @Basic
    @Column(name = "TIPO_ACUMULO_CRED_ATAC", table = "SMAEMPRE")
    private String tipoAcumuloCredAtac;

    @Basic
    @Column(name = "TIPO_ACUMULO_CRED_VARE", table = "SMAEMPRE")
    private String tipoAcumuloCredVare;

    @Basic
    @Column(name = "PERIODO_CRED_ATAC", table = "SMAEMPRE")
    private String periodoCredAtac;

    @Basic
    @Column(name = "PERIODO_CRED_VARE", table = "SMAEMPRE")
    private String periodoCredVare;

    @Basic
    @Column(name = "NF_VL_VISTA", table = "SMAEMPRE")
    private String nfVlVista;

    @Basic
    @Column(name = "CHECA_ZONA_FRANCA", table = "SMAEMPRE", length = 5)
    private String checaZonaFranca;

    @Basic
    @Column(name = "CONS_FINAL_OUTRA_UF", table = "SMAEMPRE")
    private String consFinalOutraUf;

    @Basic
    @Column(name = "VERSAO_SAVARE", table = "SMAEMPRE", length = 20)
    private String versaoSavare;

    @Basic
    @Column(name = "IMP_FED_CUPOM", table = "SMAEMPRE")
    private String impFedCupom;

    @Basic
    @Column(name = "DT_TENTOU_COFFL", table = "SMAEMPRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtTentouCoffl;
}