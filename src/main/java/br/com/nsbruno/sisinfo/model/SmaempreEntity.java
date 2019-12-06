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
@Table(name = "SMAEMPRE")
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
    private int codigo;

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
    private int peso;

    @Basic
    @Column(name = "ATAC_VAREJO", table = "SMAEMPRE")
    private String atacVarejo;

    @Basic
    @Column(name = "VENDE_ATAC_VARE", table = "SMAEMPRE", length = 3)
    private String vendeAtacVare;

    @Basic(optional = false)
    @Column(name = "VALIDADE_ORCAMENTO", table = "SMAEMPRE", nullable = false)
    private int validadeOrcamento;

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
    private int diasAtrazo;

    @Basic(optional = false)
    @Column(name = "SEM_MOVIMENTO", table = "SMAEMPRE", nullable = false)
    private int semMovimento;

    @Basic(optional = false)
    @Column(name = "ANO_ATUAL", table = "SMAEMPRE", nullable = false)
    private int anoAtual;

    @Basic(optional = false)
    @Column(name = "MES_ATUAL", table = "SMAEMPRE", nullable = false)
    private int mesAtual;

    @Basic(optional = false)
    @Column(name = "MESES_ANALISE", table = "SMAEMPRE", nullable = false)
    private int mesesAnalise;

    @Basic(optional = false)
    @Column(name = "INCREMENTO_SEQUENCIA", table = "SMAEMPRE", nullable = false)
    private int incrementoSequencia;

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
    private String integCxregMov;

    @Basic
    @Column(name = "INTEG_CXREG_ACE", table = "SMAEMPRE")
    private String integCxregAce;

    @Basic
    @Column(name = "INTEG_FIN", table = "SMAEMPRE")
    private String integFin;

    @Basic(optional = false)
    @Column(name = "DIAS_VENDA_VISTA", table = "SMAEMPRE", nullable = false)
    private int diasVendaVista;

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
    private int diasCarencia;

    @Basic
    @Column(name = "BAIXA_SEM_DOCTO_REC", table = "SMAEMPRE")
    private String baixaSemDoctoRec;

    @Basic
    @Column(name = "BAIXA_SEM_DOCTO_PAG", table = "SMAEMPRE")
    private String baixaSemDoctoPag;

    @Basic(optional = false)
    @Column(name = "DIAS_PEDIDOS_PALM", table = "SMAEMPRE", nullable = false)
    private int diasPedidosPalm;

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
    private int fonteRelatSize;

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
    private int validadeFichaCliente;

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
    private int horasDiaInd;

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
    private int qtdDiasDestacaProduto;

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

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAeasitve() {
        return idAeasitve;
    }

    public void setIdAeasitve(Integer idAeasitve) {
        this.idAeasitve = idAeasitve;
    }

    public Integer getIdAeasitit() {
        return idAeasitit;
    }

    public void setIdAeasitit(Integer idAeasitit) {
        this.idAeasitit = idAeasitit;
    }

    public Integer getIdAealoces() {
        return idAealoces;
    }

    public void setIdAealoces(Integer idAealoces) {
        this.idAealoces = idAealoces;
    }

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public Integer getIdCfaviatr() {
        return idCfaviatr;
    }

    public void setIdCfaviatr(Integer idCfaviatr) {
        this.idCfaviatr = idCfaviatr;
    }

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
    }

    public Integer getIdCfamoedaPais() {
        return idCfamoedaPais;
    }

    public void setIdCfamoedaPais(Integer idCfamoedaPais) {
        this.idCfamoedaPais = idCfamoedaPais;
    }

    public Integer getIdAeaplpgtVare() {
        return idAeaplpgtVare;
    }

    public void setIdAeaplpgtVare(Integer idAeaplpgtVare) {
        this.idAeaplpgtVare = idAeaplpgtVare;
    }

    public Integer getIdAeaplpgtAtac() {
        return idAeaplpgtAtac;
    }

    public void setIdAeaplpgtAtac(Integer idAeaplpgtAtac) {
        this.idAeaplpgtAtac = idAeaplpgtAtac;
    }

    public Integer getIdAeaplpgtAtacVista() {
        return idAeaplpgtAtacVista;
    }

    public void setIdAeaplpgtAtacVista(Integer idAeaplpgtAtacVista) {
        this.idAeaplpgtAtacVista = idAeaplpgtAtacVista;
    }

    public Integer getIdAeaplpgtVareVista() {
        return idAeaplpgtVareVista;
    }

    public void setIdAeaplpgtVareVista(Integer idAeaplpgtVareVista) {
        this.idAeaplpgtVareVista = idAeaplpgtVareVista;
    }

    public Integer getIdAeaplpgtVendaRap() {
        return idAeaplpgtVendaRap;
    }

    public void setIdAeaplpgtVendaRap(Integer idAeaplpgtVendaRap) {
        this.idAeaplpgtVendaRap = idAeaplpgtVendaRap;
    }

    public Integer getIdAeaformaVare() {
        return idAeaformaVare;
    }

    public void setIdAeaformaVare(Integer idAeaformaVare) {
        this.idAeaformaVare = idAeaformaVare;
    }

    public Integer getIdAeaformaAtac() {
        return idAeaformaAtac;
    }

    public void setIdAeaformaAtac(Integer idAeaformaAtac) {
        this.idAeaformaAtac = idAeaformaAtac;
    }

    public Integer getIdCfaclifoVendLoja() {
        return idCfaclifoVendLoja;
    }

    public void setIdCfaclifoVendLoja(Integer idCfaclifoVendLoja) {
        this.idCfaclifoVendLoja = idCfaclifoVendLoja;
    }

    public Integer getIdAeaseriePedEcf() {
        return idAeaseriePedEcf;
    }

    public void setIdAeaseriePedEcf(Integer idAeaseriePedEcf) {
        this.idAeaseriePedEcf = idAeaseriePedEcf;
    }

    public Integer getIdAeaserieEcf() {
        return idAeaserieEcf;
    }

    public void setIdAeaserieEcf(Integer idAeaserieEcf) {
        this.idAeaserieEcf = idAeaserieEcf;
    }

    public Integer getIdAeaseriePed() {
        return idAeaseriePed;
    }

    public void setIdAeaseriePed(Integer idAeaseriePed) {
        this.idAeaseriePed = idAeaseriePed;
    }

    public Integer getIdAeaserieOrc() {
        return idAeaserieOrc;
    }

    public void setIdAeaserieOrc(Integer idAeaserieOrc) {
        this.idAeaserieOrc = idAeaserieOrc;
    }

    public Integer getIdAeaserieOrcPalm() {
        return idAeaserieOrcPalm;
    }

    public void setIdAeaserieOrcPalm(Integer idAeaserieOrcPalm) {
        this.idAeaserieOrcPalm = idAeaserieOrcPalm;
    }

    public Integer getIdAeaserieNf() {
        return idAeaserieNf;
    }

    public void setIdAeaserieNf(Integer idAeaserieNf) {
        this.idAeaserieNf = idAeaserieNf;
    }

    public Integer getIdAeaseriePen() {
        return idAeaseriePen;
    }

    public void setIdAeaseriePen(Integer idAeaseriePen) {
        this.idAeaseriePen = idAeaseriePen;
    }

    public Integer getIdAeaserieOs() {
        return idAeaserieOs;
    }

    public void setIdAeaserieOs(Integer idAeaserieOs) {
        this.idAeaserieOs = idAeaserieOs;
    }

    public Integer getIdAeacodstEnt() {
        return idAeacodstEnt;
    }

    public void setIdAeacodstEnt(Integer idAeacodstEnt) {
        this.idAeacodstEnt = idAeacodstEnt;
    }

    public Integer getIdAeacodst() {
        return idAeacodst;
    }

    public void setIdAeacodst(Integer idAeacodst) {
        this.idAeacodst = idAeacodst;
    }

    public Integer getIdCfaestadFiscal() {
        return idCfaestadFiscal;
    }

    public void setIdCfaestadFiscal(Integer idCfaestadFiscal) {
        this.idCfaestadFiscal = idCfaestadFiscal;
    }

    public Integer getIdCfatpdocLfNf() {
        return idCfatpdocLfNf;
    }

    public void setIdCfatpdocLfNf(Integer idCfatpdocLfNf) {
        this.idCfatpdocLfNf = idCfatpdocLfNf;
    }

    public Integer getIdCfatpdocLfMf() {
        return idCfatpdocLfMf;
    }

    public void setIdCfatpdocLfMf(Integer idCfatpdocLfMf) {
        this.idCfatpdocLfMf = idCfatpdocLfMf;
    }

    public Integer getIdCfatpdocLfCn() {
        return idCfatpdocLfCn;
    }

    public void setIdCfatpdocLfCn(Integer idCfatpdocLfCn) {
        this.idCfatpdocLfCn = idCfatpdocLfCn;
    }

    public Integer getIdCfatpdocRefat() {
        return idCfatpdocRefat;
    }

    public void setIdCfatpdocRefat(Integer idCfatpdocRefat) {
        this.idCfatpdocRefat = idCfatpdocRefat;
    }

    public Integer getIdCfaclifoVista() {
        return idCfaclifoVista;
    }

    public void setIdCfaclifoVista(Integer idCfaclifoVista) {
        this.idCfaclifoVista = idCfaclifoVista;
    }

    public Integer getIdCfaclifoCaixa() {
        return idCfaclifoCaixa;
    }

    public void setIdCfaclifoCaixa(Integer idCfaclifoCaixa) {
        this.idCfaclifoCaixa = idCfaclifoCaixa;
    }

    public Integer getIdCfaclifoCartao() {
        return idCfaclifoCartao;
    }

    public void setIdCfaclifoCartao(Integer idCfaclifoCartao) {
        this.idCfaclifoCartao = idCfaclifoCartao;
    }

    public Integer getIdCfaclifoCheque() {
        return idCfaclifoCheque;
    }

    public void setIdCfaclifoCheque(Integer idCfaclifoCheque) {
        this.idCfaclifoCheque = idCfaclifoCheque;
    }

    public Integer getIdCfaportaCaixa() {
        return idCfaportaCaixa;
    }

    public void setIdCfaportaCaixa(Integer idCfaportaCaixa) {
        this.idCfaportaCaixa = idCfaportaCaixa;
    }

    public Integer getIdCfatpcobCaixa() {
        return idCfatpcobCaixa;
    }

    public void setIdCfatpcobCaixa(Integer idCfatpcobCaixa) {
        this.idCfatpcobCaixa = idCfatpcobCaixa;
    }

    public Integer getIdCfatpfatRecPvv() {
        return idCfatpfatRecPvv;
    }

    public void setIdCfatpfatRecPvv(Integer idCfatpfatRecPvv) {
        this.idCfatpfatRecPvv = idCfatpfatRecPvv;
    }

    public Integer getIdCfatpfatRecPva() {
        return idCfatpfatRecPva;
    }

    public void setIdCfatpfatRecPva(Integer idCfatpfatRecPva) {
        this.idCfatpfatRecPva = idCfatpfatRecPva;
    }

    public Integer getIdCfatpfatRecVfv() {
        return idCfatpfatRecVfv;
    }

    public void setIdCfatpfatRecVfv(Integer idCfatpfatRecVfv) {
        this.idCfatpfatRecVfv = idCfatpfatRecVfv;
    }

    public Integer getIdCfatpfatRecVfa() {
        return idCfatpfatRecVfa;
    }

    public void setIdCfatpfatRecVfa(Integer idCfatpfatRecVfa) {
        this.idCfatpfatRecVfa = idCfatpfatRecVfa;
    }

    public Integer getIdCfatpfatRecCon() {
        return idCfatpfatRecCon;
    }

    public void setIdCfatpfatRecCon(Integer idCfatpfatRecCon) {
        this.idCfatpfatRecCon = idCfatpfatRecCon;
    }

    public Integer getIdCfatpfatPagEd() {
        return idCfatpfatPagEd;
    }

    public void setIdCfatpfatPagEd(Integer idCfatpfatPagEd) {
        this.idCfatpfatPagEd = idCfatpfatPagEd;
    }

    public Integer getIdCfatpfatPagEn() {
        return idCfatpfatPagEn;
    }

    public void setIdCfatpfatPagEn(Integer idCfatpfatPagEn) {
        this.idCfatpfatPagEn = idCfatpfatPagEn;
    }

    public Integer getIdCfatpfatPagDv() {
        return idCfatpfatPagDv;
    }

    public void setIdCfatpfatPagDv(Integer idCfatpfatPagDv) {
        this.idCfatpfatPagDv = idCfatpfatPagDv;
    }

    public Integer getIdCfatpfatPagDf() {
        return idCfatpfatPagDf;
    }

    public void setIdCfatpfatPagDf(Integer idCfatpfatPagDf) {
        this.idCfatpfatPagDf = idCfatpfatPagDf;
    }

    public Integer getIdCfatpfatPagPc() {
        return idCfatpfatPagPc;
    }

    public void setIdCfatpfatPagPc(Integer idCfatpfatPagPc) {
        this.idCfatpfatPagPc = idCfatpfatPagPc;
    }

    public Integer getIdCfatpfatPagFreteD() {
        return idCfatpfatPagFreteD;
    }

    public void setIdCfatpfatPagFreteD(Integer idCfatpfatPagFreteD) {
        this.idCfatpfatPagFreteD = idCfatpfatPagFreteD;
    }

    public Integer getIdCfatpfatPagFreteN() {
        return idCfatpfatPagFreteN;
    }

    public void setIdCfatpfatPagFreteN(Integer idCfatpfatPagFreteN) {
        this.idCfatpfatPagFreteN = idCfatpfatPagFreteN;
    }

    public Integer getIdCfaestadUfOrgao() {
        return idCfaestadUfOrgao;
    }

    public void setIdCfaestadUfOrgao(Integer idCfaestadUfOrgao) {
        this.idCfaestadUfOrgao = idCfaestadUfOrgao;
    }

    public Integer getIdCbaplctaJurosRefat() {
        return idCbaplctaJurosRefat;
    }

    public void setIdCbaplctaJurosRefat(Integer idCbaplctaJurosRefat) {
        this.idCbaplctaJurosRefat = idCbaplctaJurosRefat;
    }

    public Integer getIdCbaplctaDescRefat() {
        return idCbaplctaDescRefat;
    }

    public void setIdCbaplctaDescRefat(Integer idCbaplctaDescRefat) {
        this.idCbaplctaDescRefat = idCbaplctaDescRefat;
    }

    public Integer getIdCbaplctaRetorno() {
        return idCbaplctaRetorno;
    }

    public void setIdCbaplctaRetorno(Integer idCbaplctaRetorno) {
        this.idCbaplctaRetorno = idCbaplctaRetorno;
    }

    public Integer getIdCbaplctaCRetorno() {
        return idCbaplctaCRetorno;
    }

    public void setIdCbaplctaCRetorno(Integer idCbaplctaCRetorno) {
        this.idCbaplctaCRetorno = idCbaplctaCRetorno;
    }

    public Integer getIdCbaplctaEstFis() {
        return idCbaplctaEstFis;
    }

    public void setIdCbaplctaEstFis(Integer idCbaplctaEstFis) {
        this.idCbaplctaEstFis = idCbaplctaEstFis;
    }

    public Integer getIdCbaplctaCEstFis() {
        return idCbaplctaCEstFis;
    }

    public void setIdCbaplctaCEstFis(Integer idCbaplctaCEstFis) {
        this.idCbaplctaCEstFis = idCbaplctaCEstFis;
    }

    public Integer getIdCbaplctaEstCon() {
        return idCbaplctaEstCon;
    }

    public void setIdCbaplctaEstCon(Integer idCbaplctaEstCon) {
        this.idCbaplctaEstCon = idCbaplctaEstCon;
    }

    public Integer getIdCbaplctaCEstCon() {
        return idCbaplctaCEstCon;
    }

    public void setIdCbaplctaCEstCon(Integer idCbaplctaCEstCon) {
        this.idCbaplctaCEstCon = idCbaplctaCEstCon;
    }

    public Integer getIdCbaplctaCmvFis() {
        return idCbaplctaCmvFis;
    }

    public void setIdCbaplctaCmvFis(Integer idCbaplctaCmvFis) {
        this.idCbaplctaCmvFis = idCbaplctaCmvFis;
    }

    public Integer getIdCbaplctaCmvCon() {
        return idCbaplctaCmvCon;
    }

    public void setIdCbaplctaCmvCon(Integer idCbaplctaCmvCon) {
        this.idCbaplctaCmvCon = idCbaplctaCmvCon;
    }

    public Integer getIdAeapesos() {
        return idAeapesos;
    }

    public void setIdAeapesos(Integer idAeapesos) {
        this.idAeapesos = idAeapesos;
    }

    public Integer getIdCfastatu() {
        return idCfastatu;
    }

    public void setIdCfastatu(Integer idCfastatu) {
        this.idCfastatu = idCfastatu;
    }

    public Integer getIdCbadcont() {
        return idCbadcont;
    }

    public void setIdCbadcont(Integer idCbadcont) {
        this.idCbadcont = idCbadcont;
    }

    public Integer getIdCfaativi() {
        return idCfaativi;
    }

    public void setIdCfaativi(Integer idCfaativi) {
        this.idCfaativi = idCfaativi;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCpfCgc() {
        return cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getIeRg() {
        return ieRg;
    }

    public void setIeRg(String ieRg) {
        this.ieRg = ieRg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public double getCurvaAFis() {
        return curvaAFis;
    }

    public void setCurvaAFis(double curvaAFis) {
        this.curvaAFis = curvaAFis;
    }

    public double getCurvaBFis() {
        return curvaBFis;
    }

    public void setCurvaBFis(double curvaBFis) {
        this.curvaBFis = curvaBFis;
    }

    public double getCurvaCFis() {
        return curvaCFis;
    }

    public void setCurvaCFis(double curvaCFis) {
        this.curvaCFis = curvaCFis;
    }

    public double getCurvaAFin() {
        return curvaAFin;
    }

    public void setCurvaAFin(double curvaAFin) {
        this.curvaAFin = curvaAFin;
    }

    public double getCurvaBFin() {
        return curvaBFin;
    }

    public void setCurvaBFin(double curvaBFin) {
        this.curvaBFin = curvaBFin;
    }

    public double getCurvaCFin() {
        return curvaCFin;
    }

    public void setCurvaCFin(double curvaCFin) {
        this.curvaCFin = curvaCFin;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getAtacVarejo() {
        return atacVarejo;
    }

    public void setAtacVarejo(String atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public String getVendeAtacVare() {
        return vendeAtacVare;
    }

    public void setVendeAtacVare(String vendeAtacVare) {
        this.vendeAtacVare = vendeAtacVare;
    }

    public int getValidadeOrcamento() {
        return validadeOrcamento;
    }

    public void setValidadeOrcamento(int validadeOrcamento) {
        this.validadeOrcamento = validadeOrcamento;
    }

    public String getOrcSemEstoque() {
        return orcSemEstoque;
    }

    public void setOrcSemEstoque(String orcSemEstoque) {
        this.orcSemEstoque = orcSemEstoque;
    }

    public String getPedSemEstoque() {
        return pedSemEstoque;
    }

    public void setPedSemEstoque(String pedSemEstoque) {
        this.pedSemEstoque = pedSemEstoque;
    }

    public String getNfsSemEstoque() {
        return nfsSemEstoque;
    }

    public void setNfsSemEstoque(String nfsSemEstoque) {
        this.nfsSemEstoque = nfsSemEstoque;
    }

    public String getCentavos() {
        return centavos;
    }

    public void setCentavos(String centavos) {
        this.centavos = centavos;
    }

    public String getGeraLisai() {
        return geraLisai;
    }

    public void setGeraLisai(String geraLisai) {
        this.geraLisai = geraLisai;
    }

    public String getGeraLient() {
        return geraLient;
    }

    public void setGeraLient(String geraLient) {
        this.geraLient = geraLient;
    }

    public double getValMarkupAtac1() {
        return valMarkupAtac1;
    }

    public void setValMarkupAtac1(double valMarkupAtac1) {
        this.valMarkupAtac1 = valMarkupAtac1;
    }

    public double getValMarkupAtac2() {
        return valMarkupAtac2;
    }

    public void setValMarkupAtac2(double valMarkupAtac2) {
        this.valMarkupAtac2 = valMarkupAtac2;
    }

    public double getValMarkupAtac3() {
        return valMarkupAtac3;
    }

    public void setValMarkupAtac3(double valMarkupAtac3) {
        this.valMarkupAtac3 = valMarkupAtac3;
    }

    public double getValMarkupVare1() {
        return valMarkupVare1;
    }

    public void setValMarkupVare1(double valMarkupVare1) {
        this.valMarkupVare1 = valMarkupVare1;
    }

    public double getValMarkupVare2() {
        return valMarkupVare2;
    }

    public void setValMarkupVare2(double valMarkupVare2) {
        this.valMarkupVare2 = valMarkupVare2;
    }

    public double getValMarkupVare3() {
        return valMarkupVare3;
    }

    public void setValMarkupVare3(double valMarkupVare3) {
        this.valMarkupVare3 = valMarkupVare3;
    }

    public double getMarkupAtac1() {
        return markupAtac1;
    }

    public void setMarkupAtac1(double markupAtac1) {
        this.markupAtac1 = markupAtac1;
    }

    public double getMarkupAtac2() {
        return markupAtac2;
    }

    public void setMarkupAtac2(double markupAtac2) {
        this.markupAtac2 = markupAtac2;
    }

    public double getMarkupAtac3() {
        return markupAtac3;
    }

    public void setMarkupAtac3(double markupAtac3) {
        this.markupAtac3 = markupAtac3;
    }

    public double getMarkupVare1() {
        return markupVare1;
    }

    public void setMarkupVare1(double markupVare1) {
        this.markupVare1 = markupVare1;
    }

    public double getMarkupVare2() {
        return markupVare2;
    }

    public void setMarkupVare2(double markupVare2) {
        this.markupVare2 = markupVare2;
    }

    public double getMarkupVare3() {
        return markupVare3;
    }

    public void setMarkupVare3(double markupVare3) {
        this.markupVare3 = markupVare3;
    }

    public int getDiasAtrazo() {
        return diasAtrazo;
    }

    public void setDiasAtrazo(int diasAtrazo) {
        this.diasAtrazo = diasAtrazo;
    }

    public int getSemMovimento() {
        return semMovimento;
    }

    public void setSemMovimento(int semMovimento) {
        this.semMovimento = semMovimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getMesAtual() {
        return mesAtual;
    }

    public void setMesAtual(int mesAtual) {
        this.mesAtual = mesAtual;
    }

    public int getMesesAnalise() {
        return mesesAnalise;
    }

    public void setMesesAnalise(int mesesAnalise) {
        this.mesesAnalise = mesesAnalise;
    }

    public int getIncrementoSequencia() {
        return incrementoSequencia;
    }

    public void setIncrementoSequencia(int incrementoSequencia) {
        this.incrementoSequencia = incrementoSequencia;
    }

    public double getSugestaoQuantidade() {
        return sugestaoQuantidade;
    }

    public void setSugestaoQuantidade(double sugestaoQuantidade) {
        this.sugestaoQuantidade = sugestaoQuantidade;
    }

    public String getLeituraOtica() {
        return leituraOtica;
    }

    public void setLeituraOtica(String leituraOtica) {
        this.leituraOtica = leituraOtica;
    }

    public String getGeraImpPed() {
        return geraImpPed;
    }

    public void setGeraImpPed(String geraImpPed) {
        this.geraImpPed = geraImpPed;
    }

    public String getGeraImpSeparPed() {
        return geraImpSeparPed;
    }

    public void setGeraImpSeparPed(String geraImpSeparPed) {
        this.geraImpSeparPed = geraImpSeparPed;
    }

    public String getGeraImpNf() {
        return geraImpNf;
    }

    public void setGeraImpNf(String geraImpNf) {
        this.geraImpNf = geraImpNf;
    }

    public String getUsaSimilar() {
        return usaSimilar;
    }

    public void setUsaSimilar(String usaSimilar) {
        this.usaSimilar = usaSimilar;
    }

    public String getFaturaNf() {
        return faturaNf;
    }

    public void setFaturaNf(String faturaNf) {
        this.faturaNf = faturaNf;
    }

    public String getFaturaPedido() {
        return faturaPedido;
    }

    public void setFaturaPedido(String faturaPedido) {
        this.faturaPedido = faturaPedido;
    }

    public double getJurosDiario() {
        return jurosDiario;
    }

    public void setJurosDiario(double jurosDiario) {
        this.jurosDiario = jurosDiario;
    }

    public String getCapitaliza() {
        return capitaliza;
    }

    public void setCapitaliza(String capitaliza) {
        this.capitaliza = capitaliza;
    }

    public String getEmiteRecibo() {
        return emiteRecibo;
    }

    public void setEmiteRecibo(String emiteRecibo) {
        this.emiteRecibo = emiteRecibo;
    }

    public String getIndexa() {
        return indexa;
    }

    public void setIndexa(String indexa) {
        this.indexa = indexa;
    }

    public String getIndiceValor() {
        return indiceValor;
    }

    public void setIndiceValor(String indiceValor) {
        this.indiceValor = indiceValor;
    }

    public String getDistServOrc() {
        return distServOrc;
    }

    public void setDistServOrc(String distServOrc) {
        this.distServOrc = distServOrc;
    }

    public String getDistServReq() {
        return distServReq;
    }

    public void setDistServReq(String distServReq) {
        this.distServReq = distServReq;
    }

    public String getDistServPed() {
        return distServPed;
    }

    public void setDistServPed(String distServPed) {
        this.distServPed = distServPed;
    }

    public String getDistServNf() {
        return distServNf;
    }

    public void setDistServNf(String distServNf) {
        this.distServNf = distServNf;
    }

    public String getDtGeraFat() {
        return dtGeraFat;
    }

    public void setDtGeraFat(String dtGeraFat) {
        this.dtGeraFat = dtGeraFat;
    }

    public String getDtGeraNf() {
        return dtGeraNf;
    }

    public void setDtGeraNf(String dtGeraNf) {
        this.dtGeraNf = dtGeraNf;
    }

    public String getDtFatSegue() {
        return dtFatSegue;
    }

    public void setDtFatSegue(String dtFatSegue) {
        this.dtFatSegue = dtFatSegue;
    }

    public String getDtNfSegue() {
        return dtNfSegue;
    }

    public void setDtNfSegue(String dtNfSegue) {
        this.dtNfSegue = dtNfSegue;
    }

    public String getModeloContabil() {
        return modeloContabil;
    }

    public void setModeloContabil(String modeloContabil) {
        this.modeloContabil = modeloContabil;
    }

    public String getIntegCxregMov() {
        return integCxregMov;
    }

    public void setIntegCxregMov(String integCxregMov) {
        this.integCxregMov = integCxregMov;
    }

    public String getIntegCxregAce() {
        return integCxregAce;
    }

    public void setIntegCxregAce(String integCxregAce) {
        this.integCxregAce = integCxregAce;
    }

    public String getIntegFin() {
        return integFin;
    }

    public void setIntegFin(String integFin) {
        this.integFin = integFin;
    }

    public int getDiasVendaVista() {
        return diasVendaVista;
    }

    public void setDiasVendaVista(int diasVendaVista) {
        this.diasVendaVista = diasVendaVista;
    }

    public String getRomaneioFechadoCarga() {
        return romaneioFechadoCarga;
    }

    public void setRomaneioFechadoCarga(String romaneioFechadoCarga) {
        this.romaneioFechadoCarga = romaneioFechadoCarga;
    }

    public double getPercDescPgtoAnt() {
        return percDescPgtoAnt;
    }

    public void setPercDescPgtoAnt(double percDescPgtoAnt) {
        this.percDescPgtoAnt = percDescPgtoAnt;
    }

    public String getTemDoctoRec() {
        return temDoctoRec;
    }

    public void setTemDoctoRec(String temDoctoRec) {
        this.temDoctoRec = temDoctoRec;
    }

    public String getTemDoctoPag() {
        return temDoctoPag;
    }

    public void setTemDoctoPag(String temDoctoPag) {
        this.temDoctoPag = temDoctoPag;
    }

    public int getDiasCarencia() {
        return diasCarencia;
    }

    public void setDiasCarencia(int diasCarencia) {
        this.diasCarencia = diasCarencia;
    }

    public String getBaixaSemDoctoRec() {
        return baixaSemDoctoRec;
    }

    public void setBaixaSemDoctoRec(String baixaSemDoctoRec) {
        this.baixaSemDoctoRec = baixaSemDoctoRec;
    }

    public String getBaixaSemDoctoPag() {
        return baixaSemDoctoPag;
    }

    public void setBaixaSemDoctoPag(String baixaSemDoctoPag) {
        this.baixaSemDoctoPag = baixaSemDoctoPag;
    }

    public int getDiasPedidosPalm() {
        return diasPedidosPalm;
    }

    public void setDiasPedidosPalm(int diasPedidosPalm) {
        this.diasPedidosPalm = diasPedidosPalm;
    }

    public String getPathFtpRec() {
        return pathFtpRec;
    }

    public void setPathFtpRec(String pathFtpRec) {
        this.pathFtpRec = pathFtpRec;
    }

    public String getPathFtpEnv() {
        return pathFtpEnv;
    }

    public void setPathFtpEnv(String pathFtpEnv) {
        this.pathFtpEnv = pathFtpEnv;
    }

    public Date getValidadePrecoPalmIni() {
        return validadePrecoPalmIni;
    }

    public void setValidadePrecoPalmIni(Date validadePrecoPalmIni) {
        this.validadePrecoPalmIni = validadePrecoPalmIni;
    }

    public Date getValidadePrecoPalmFim() {
        return validadePrecoPalmFim;
    }

    public void setValidadePrecoPalmFim(Date validadePrecoPalmFim) {
        this.validadePrecoPalmFim = validadePrecoPalmFim;
    }

    public double getPercJrVencParcMenor() {
        return percJrVencParcMenor;
    }

    public void setPercJrVencParcMenor(double percJrVencParcMenor) {
        this.percJrVencParcMenor = percJrVencParcMenor;
    }

    public Integer getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(Integer numParcela) {
        this.numParcela = numParcela;
    }

    public String getCodProdOrc() {
        return codProdOrc;
    }

    public void setCodProdOrc(String codProdOrc) {
        this.codProdOrc = codProdOrc;
    }

    public String getCodProdPed() {
        return codProdPed;
    }

    public void setCodProdPed(String codProdPed) {
        this.codProdPed = codProdPed;
    }

    public String getCodProdTrans() {
        return codProdTrans;
    }

    public void setCodProdTrans(String codProdTrans) {
        this.codProdTrans = codProdTrans;
    }

    public String getCodProdNf() {
        return codProdNf;
    }

    public void setCodProdNf(String codProdNf) {
        this.codProdNf = codProdNf;
    }

    public String getCodProdCom() {
        return codProdCom;
    }

    public void setCodProdCom(String codProdCom) {
        this.codProdCom = codProdCom;
    }

    public String getCodProdDefault() {
        return codProdDefault;
    }

    public void setCodProdDefault(String codProdDefault) {
        this.codProdDefault = codProdDefault;
    }

    public String getCodProdTelas() {
        return codProdTelas;
    }

    public void setCodProdTelas(String codProdTelas) {
        this.codProdTelas = codProdTelas;
    }

    public String getTemDoctoNaoAlteraCr() {
        return temDoctoNaoAlteraCr;
    }

    public void setTemDoctoNaoAlteraCr(String temDoctoNaoAlteraCr) {
        this.temDoctoNaoAlteraCr = temDoctoNaoAlteraCr;
    }

    public String getTemDoctoNaoAlteraCp() {
        return temDoctoNaoAlteraCp;
    }

    public void setTemDoctoNaoAlteraCp(String temDoctoNaoAlteraCp) {
        this.temDoctoNaoAlteraCp = temDoctoNaoAlteraCp;
    }

    public String getAutDoctoNaoAlteraCr() {
        return autDoctoNaoAlteraCr;
    }

    public void setAutDoctoNaoAlteraCr(String autDoctoNaoAlteraCr) {
        this.autDoctoNaoAlteraCr = autDoctoNaoAlteraCr;
    }

    public String getAutDoctoNaoAlteraCp() {
        return autDoctoNaoAlteraCp;
    }

    public void setAutDoctoNaoAlteraCp(String autDoctoNaoAlteraCp) {
        this.autDoctoNaoAlteraCp = autDoctoNaoAlteraCp;
    }

    public String getChecaNumEmissoes() {
        return checaNumEmissoes;
    }

    public void setChecaNumEmissoes(String checaNumEmissoes) {
        this.checaNumEmissoes = checaNumEmissoes;
    }

    public String getDescUnitEcf() {
        return descUnitEcf;
    }

    public void setDescUnitEcf(String descUnitEcf) {
        this.descUnitEcf = descUnitEcf;
    }

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public String getOrdemProdConsulta() {
        return ordemProdConsulta;
    }

    public void setOrdemProdConsulta(String ordemProdConsulta) {
        this.ordemProdConsulta = ordemProdConsulta;
    }

    public String getMudaContaCp() {
        return mudaContaCp;
    }

    public void setMudaContaCp(String mudaContaCp) {
        this.mudaContaCp = mudaContaCp;
    }

    public String getMudaContaCr() {
        return mudaContaCr;
    }

    public void setMudaContaCr(String mudaContaCr) {
        this.mudaContaCr = mudaContaCr;
    }

    public String getVenctoEmFeriado() {
        return venctoEmFeriado;
    }

    public void setVenctoEmFeriado(String venctoEmFeriado) {
        this.venctoEmFeriado = venctoEmFeriado;
    }

    public String getVendeBloqueadoOrc() {
        return vendeBloqueadoOrc;
    }

    public void setVendeBloqueadoOrc(String vendeBloqueadoOrc) {
        this.vendeBloqueadoOrc = vendeBloqueadoOrc;
    }

    public String getVendeBloqueadoPed() {
        return vendeBloqueadoPed;
    }

    public void setVendeBloqueadoPed(String vendeBloqueadoPed) {
        this.vendeBloqueadoPed = vendeBloqueadoPed;
    }

    public String getVendeBloqueadoFat() {
        return vendeBloqueadoFat;
    }

    public void setVendeBloqueadoFat(String vendeBloqueadoFat) {
        this.vendeBloqueadoFat = vendeBloqueadoFat;
    }

    public String getValidaProdOrc() {
        return validaProdOrc;
    }

    public void setValidaProdOrc(String validaProdOrc) {
        this.validaProdOrc = validaProdOrc;
    }

    public String getValidaProdPed() {
        return validaProdPed;
    }

    public void setValidaProdPed(String validaProdPed) {
        this.validaProdPed = validaProdPed;
    }

    public String getValidaProdNfs() {
        return validaProdNfs;
    }

    public void setValidaProdNfs(String validaProdNfs) {
        this.validaProdNfs = validaProdNfs;
    }

    public String getValidaProdInv() {
        return validaProdInv;
    }

    public void setValidaProdInv(String validaProdInv) {
        this.validaProdInv = validaProdInv;
    }

    public String getValidaProdEnt() {
        return validaProdEnt;
    }

    public void setValidaProdEnt(String validaProdEnt) {
        this.validaProdEnt = validaProdEnt;
    }

    public String getValidaProdTra() {
        return validaProdTra;
    }

    public void setValidaProdTra(String validaProdTra) {
        this.validaProdTra = validaProdTra;
    }

    public String getValidaProdCom() {
        return validaProdCom;
    }

    public void setValidaProdCom(String validaProdCom) {
        this.validaProdCom = validaProdCom;
    }

    public String getFonteRelatNome() {
        return fonteRelatNome;
    }

    public void setFonteRelatNome(String fonteRelatNome) {
        this.fonteRelatNome = fonteRelatNome;
    }

    public int getFonteRelatSize() {
        return fonteRelatSize;
    }

    public void setFonteRelatSize(int fonteRelatSize) {
        this.fonteRelatSize = fonteRelatSize;
    }

    public String getAgrupaPedidos() {
        return agrupaPedidos;
    }

    public void setAgrupaPedidos(String agrupaPedidos) {
        this.agrupaPedidos = agrupaPedidos;
    }

    public String getWorkOnDateServer() {
        return workOnDateServer;
    }

    public void setWorkOnDateServer(String workOnDateServer) {
        this.workOnDateServer = workOnDateServer;
    }

    public String getCodigoSpc() {
        return codigoSpc;
    }

    public void setCodigoSpc(String codigoSpc) {
        this.codigoSpc = codigoSpc;
    }

    public String getDuplicataUnica() {
        return duplicataUnica;
    }

    public void setDuplicataUnica(String duplicataUnica) {
        this.duplicataUnica = duplicataUnica;
    }

    public String getAguardaFaturamento() {
        return aguardaFaturamento;
    }

    public void setAguardaFaturamento(String aguardaFaturamento) {
        this.aguardaFaturamento = aguardaFaturamento;
    }

    public String getEntradaProdSoComPedido() {
        return entradaProdSoComPedido;
    }

    public void setEntradaProdSoComPedido(String entradaProdSoComPedido) {
        this.entradaProdSoComPedido = entradaProdSoComPedido;
    }

    public int getValidadeFichaCliente() {
        return validadeFichaCliente;
    }

    public void setValidadeFichaCliente(int validadeFichaCliente) {
        this.validadeFichaCliente = validadeFichaCliente;
    }

    public double getPercJrVencParcMaior() {
        return percJrVencParcMaior;
    }

    public void setPercJrVencParcMaior(double percJrVencParcMaior) {
        this.percJrVencParcMaior = percJrVencParcMaior;
    }

    public double getPercJurosDiaRefat() {
        return percJurosDiaRefat;
    }

    public void setPercJurosDiaRefat(double percJurosDiaRefat) {
        this.percJurosDiaRefat = percJurosDiaRefat;
    }

    public double getPercMulta() {
        return percMulta;
    }

    public void setPercMulta(double percMulta) {
        this.percMulta = percMulta;
    }

    public String getSugereProdutoGrid() {
        return sugereProdutoGrid;
    }

    public void setSugereProdutoGrid(String sugereProdutoGrid) {
        this.sugereProdutoGrid = sugereProdutoGrid;
    }

    public String getAcessaEstoqMovim() {
        return acessaEstoqMovim;
    }

    public void setAcessaEstoqMovim(String acessaEstoqMovim) {
        this.acessaEstoqMovim = acessaEstoqMovim;
    }

    public String getAcessaPlanoMovim() {
        return acessaPlanoMovim;
    }

    public void setAcessaPlanoMovim(String acessaPlanoMovim) {
        this.acessaPlanoMovim = acessaPlanoMovim;
    }

    public String getAceitaQtdeNegOrc() {
        return aceitaQtdeNegOrc;
    }

    public void setAceitaQtdeNegOrc(String aceitaQtdeNegOrc) {
        this.aceitaQtdeNegOrc = aceitaQtdeNegOrc;
    }

    public String getAceitaQtdeNegPed() {
        return aceitaQtdeNegPed;
    }

    public void setAceitaQtdeNegPed(String aceitaQtdeNegPed) {
        this.aceitaQtdeNegPed = aceitaQtdeNegPed;
    }

    public String getAceitaQtdeNegEnt() {
        return aceitaQtdeNegEnt;
    }

    public void setAceitaQtdeNegEnt(String aceitaQtdeNegEnt) {
        this.aceitaQtdeNegEnt = aceitaQtdeNegEnt;
    }

    public String getEntregaSoConferido() {
        return entregaSoConferido;
    }

    public void setEntregaSoConferido(String entregaSoConferido) {
        this.entregaSoConferido = entregaSoConferido;
    }

    public double getPercCreditoRenda() {
        return percCreditoRenda;
    }

    public void setPercCreditoRenda(double percCreditoRenda) {
        this.percCreditoRenda = percCreditoRenda;
    }

    public String getUsaRendaConjLimcre() {
        return usaRendaConjLimcre;
    }

    public void setUsaRendaConjLimcre(String usaRendaConjLimcre) {
        this.usaRendaConjLimcre = usaRendaConjLimcre;
    }

    public String getTipoAnaliseCredito() {
        return tipoAnaliseCredito;
    }

    public void setTipoAnaliseCredito(String tipoAnaliseCredito) {
        this.tipoAnaliseCredito = tipoAnaliseCredito;
    }

    public String getFonteAnaliseCredito() {
        return fonteAnaliseCredito;
    }

    public void setFonteAnaliseCredito(String fonteAnaliseCredito) {
        this.fonteAnaliseCredito = fonteAnaliseCredito;
    }

    public double getLucroMinimo() {
        return lucroMinimo;
    }

    public void setLucroMinimo(double lucroMinimo) {
        this.lucroMinimo = lucroMinimo;
    }

    public String getOpcaoPen() {
        return opcaoPen;
    }

    public void setOpcaoPen(String opcaoPen) {
        this.opcaoPen = opcaoPen;
    }

    public double getVlMinPrazoVarejo() {
        return vlMinPrazoVarejo;
    }

    public void setVlMinPrazoVarejo(double vlMinPrazoVarejo) {
        this.vlMinPrazoVarejo = vlMinPrazoVarejo;
    }

    public double getVlMinPrazoAtacado() {
        return vlMinPrazoAtacado;
    }

    public void setVlMinPrazoAtacado(double vlMinPrazoAtacado) {
        this.vlMinPrazoAtacado = vlMinPrazoAtacado;
    }

    public double getVlMinVistaVarejo() {
        return vlMinVistaVarejo;
    }

    public void setVlMinVistaVarejo(double vlMinVistaVarejo) {
        this.vlMinVistaVarejo = vlMinVistaVarejo;
    }

    public double getVlMinVistaAtacado() {
        return vlMinVistaAtacado;
    }

    public void setVlMinVistaAtacado(double vlMinVistaAtacado) {
        this.vlMinVistaAtacado = vlMinVistaAtacado;
    }

    public String getFaturaVlMin() {
        return faturaVlMin;
    }

    public void setFaturaVlMin(String faturaVlMin) {
        this.faturaVlMin = faturaVlMin;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getInscMunicipal() {
        return inscMunicipal;
    }

    public void setInscMunicipal(String inscMunicipal) {
        this.inscMunicipal = inscMunicipal;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public String getPerfilSped() {
        return perfilSped;
    }

    public void setPerfilSped(String perfilSped) {
        this.perfilSped = perfilSped;
    }

    public double getPercFatAtac() {
        return percFatAtac;
    }

    public void setPercFatAtac(double percFatAtac) {
        this.percFatAtac = percFatAtac;
    }

    public double getPercFatVare() {
        return percFatVare;
    }

    public void setPercFatVare(double percFatVare) {
        this.percFatVare = percFatVare;
    }

    public String getPermiteRetornoComNf() {
        return permiteRetornoComNf;
    }

    public void setPermiteRetornoComNf(String permiteRetornoComNf) {
        this.permiteRetornoComNf = permiteRetornoComNf;
    }

    public String getMultiplosPlanos() {
        return multiplosPlanos;
    }

    public void setMultiplosPlanos(String multiplosPlanos) {
        this.multiplosPlanos = multiplosPlanos;
    }

    public String getParcelasCredito() {
        return parcelasCredito;
    }

    public void setParcelasCredito(String parcelasCredito) {
        this.parcelasCredito = parcelasCredito;
    }

    public String getPedidoFechado() {
        return pedidoFechado;
    }

    public void setPedidoFechado(String pedidoFechado) {
        this.pedidoFechado = pedidoFechado;
    }

    public String getFichaSemDoc() {
        return fichaSemDoc;
    }

    public void setFichaSemDoc(String fichaSemDoc) {
        this.fichaSemDoc = fichaSemDoc;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    public String getCsosn() {
        return csosn;
    }

    public void setCsosn(String csosn) {
        this.csosn = csosn;
    }

    public String getIndAtiv() {
        return indAtiv;
    }

    public void setIndAtiv(String indAtiv) {
        this.indAtiv = indAtiv;
    }

    public double getAliquotaSn() {
        return aliquotaSn;
    }

    public void setAliquotaSn(double aliquotaSn) {
        this.aliquotaSn = aliquotaSn;
    }

    public String getTipoBaixaDevol() {
        return tipoBaixaDevol;
    }

    public void setTipoBaixaDevol(String tipoBaixaDevol) {
        this.tipoBaixaDevol = tipoBaixaDevol;
    }

    public String getCodigoPrefeituraNfse() {
        return codigoPrefeituraNfse;
    }

    public void setCodigoPrefeituraNfse(String codigoPrefeituraNfse) {
        this.codigoPrefeituraNfse = codigoPrefeituraNfse;
    }

    public int getHorasDiaInd() {
        return horasDiaInd;
    }

    public void setHorasDiaInd(int horasDiaInd) {
        this.horasDiaInd = horasDiaInd;
    }

    public String getSpcWsOperador() {
        return spcWsOperador;
    }

    public void setSpcWsOperador(String spcWsOperador) {
        this.spcWsOperador = spcWsOperador;
    }

    public String getSpcWsSenha() {
        return spcWsSenha;
    }

    public void setSpcWsSenha(String spcWsSenha) {
        this.spcWsSenha = spcWsSenha;
    }

    public String getSpcWsCodigo() {
        return spcWsCodigo;
    }

    public void setSpcWsCodigo(String spcWsCodigo) {
        this.spcWsCodigo = spcWsCodigo;
    }

    public int getQtdDiasDestacaProduto() {
        return qtdDiasDestacaProduto;
    }

    public void setQtdDiasDestacaProduto(int qtdDiasDestacaProduto) {
        this.qtdDiasDestacaProduto = qtdDiasDestacaProduto;
    }

    public String getFechaVendaCredNegAtac() {
        return fechaVendaCredNegAtac;
    }

    public void setFechaVendaCredNegAtac(String fechaVendaCredNegAtac) {
        this.fechaVendaCredNegAtac = fechaVendaCredNegAtac;
    }

    public String getFechaVendaCredNegVare() {
        return fechaVendaCredNegVare;
    }

    public void setFechaVendaCredNegVare(String fechaVendaCredNegVare) {
        this.fechaVendaCredNegVare = fechaVendaCredNegVare;
    }

    public String getTipoAcumuloCredAtac() {
        return tipoAcumuloCredAtac;
    }

    public void setTipoAcumuloCredAtac(String tipoAcumuloCredAtac) {
        this.tipoAcumuloCredAtac = tipoAcumuloCredAtac;
    }

    public String getTipoAcumuloCredVare() {
        return tipoAcumuloCredVare;
    }

    public void setTipoAcumuloCredVare(String tipoAcumuloCredVare) {
        this.tipoAcumuloCredVare = tipoAcumuloCredVare;
    }

    public String getPeriodoCredAtac() {
        return periodoCredAtac;
    }

    public void setPeriodoCredAtac(String periodoCredAtac) {
        this.periodoCredAtac = periodoCredAtac;
    }

    public String getPeriodoCredVare() {
        return periodoCredVare;
    }

    public void setPeriodoCredVare(String periodoCredVare) {
        this.periodoCredVare = periodoCredVare;
    }

    public String getNfVlVista() {
        return nfVlVista;
    }

    public void setNfVlVista(String nfVlVista) {
        this.nfVlVista = nfVlVista;
    }

    public String getChecaZonaFranca() {
        return checaZonaFranca;
    }

    public void setChecaZonaFranca(String checaZonaFranca) {
        this.checaZonaFranca = checaZonaFranca;
    }

    public String getConsFinalOutraUf() {
        return consFinalOutraUf;
    }

    public void setConsFinalOutraUf(String consFinalOutraUf) {
        this.consFinalOutraUf = consFinalOutraUf;
    }

    public String getVersaoSavare() {
        return versaoSavare;
    }

    public void setVersaoSavare(String versaoSavare) {
        this.versaoSavare = versaoSavare;
    }

    public String getImpFedCupom() {
        return impFedCupom;
    }

    public void setImpFedCupom(String impFedCupom) {
        this.impFedCupom = impFedCupom;
    }

    public Date getDtTentouCoffl() {
        return dtTentouCoffl;
    }

    public void setDtTentouCoffl(Date dtTentouCoffl) {
        this.dtTentouCoffl = dtTentouCoffl;
    }

}