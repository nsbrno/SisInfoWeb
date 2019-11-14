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

@Data
@Entity
@Table(name = "CFACLIFO")
public class CfaclifoEntity {

    @Id
    @Column(name = "ID_CFACLIFO", table = "CFACLIFO", nullable = false)
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFAPAISE", table = "CFACLIFO")
    private Integer idCfapaise;

    @Basic
    @Column(name = "ID_CFAPROFI", table = "CFACLIFO")
    private Integer idCfaprofi;

    @Basic
    @Column(name = "ID_CFATIMEF", table = "CFACLIFO")
    private Integer idCfatimef;

    @Basic
    @Column(name = "ID_CFAPARTI", table = "CFACLIFO")
    private Integer idCfaparti;

    @Basic
    @Column(name = "ID_CFATPFOR", table = "CFACLIFO")
    private Integer idCfatpfor;

    @Basic
    @Column(name = "ID_CFAATIVI", table = "CFACLIFO")
    private Integer idCfaativi;

    @Basic
    @Column(name = "ID_CFAAREAS", table = "CFACLIFO")
    private Integer idCfaareas;

    @Basic
    @Column(name = "ID_CFATPCLI", table = "CFACLIFO")
    private Integer idCfatpcli;

    @Basic
    @Column(name = "ID_CFASTATU", table = "CFACLIFO")
    private Integer idCfastatu;

    @Basic
    @Column(name = "ID_CFAPROFI_CONJ", table = "CFACLIFO")
    private Integer idCfaprofiConj;

    @Basic
    @Column(name = "ID_CFAPROFI_CARGO_CONJ", table = "CFACLIFO")
    private Integer idCfaprofiCargoConj;

    @Basic
    @Column(name = "ID_CFAPROFI_CARGO", table = "CFACLIFO")
    private Integer idCfaprofiCargo;

    @Basic
    @Column(name = "ID_CFAPORTA_BANCO", table = "CFACLIFO")
    private Integer idCfaportaBanco;

    @Basic
    @Column(name = "ID_CFAPORTA_BANCO_CONJ", table = "CFACLIFO")
    private Integer idCfaportaBancoConj;

    @Basic
    @Column(name = "ID_CFAESTAD_UF_ORGAO", table = "CFACLIFO")
    private Integer idCfaestadUfOrgao;

    @Basic
    @Column(name = "ID_CFAESTAD_UF_ORG_CONJ", table = "CFACLIFO")
    private Integer idCfaestadUfOrgConj;

    @Basic
    @Column(name = "ID_CFAESTAD_NATURAL", table = "CFACLIFO")
    private Integer idCfaestadNatural;

    @Basic
    @Column(name = "ID_CFACIDAD_NATURAL", table = "CFACLIFO")
    private Integer idCfacidadNatural;

    @Basic
    @Column(name = "ID_CFAESTAD_UF_HABILIT", table = "CFACLIFO")
    private Integer idCfaestadUfHabilit;

    @Basic
    @Column(name = "ID_CFACCRED_CONJ", table = "CFACLIFO")
    private Integer idCfaccredConj;

    @Basic
    @Column(name = "ID_CFACCRED", table = "CFACLIFO")
    private Integer idCfaccred;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "CFACLIFO")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_SMADEPTO", table = "CFACLIFO")
    private Integer idSmadepto;

    @Basic
    @Column(name = "ID_CFACLIFO_DIOCE", table = "CFACLIFO")
    private Integer idCfaclifoDioce;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "CFACLIFO")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "CFACLIFO")
    private Integer idCfaclifoComun;

    @Basic
    @Column(name = "ID_PASTORAL_PARTICIPA", table = "CFACLIFO")
    private Integer idPastoralParticipa;

    @Basic
    @Column(name = "ID_PASTORAL_GOSTARIA", table = "CFACLIFO")
    private Integer idPastoralGostaria;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFACLIFO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFACLIFO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFACLIFO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFACLIFO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFACLIFO")
    private Integer ctInteg;

    @Basic
    @Column(name = "CPF_CGC", table = "CFACLIFO", length = 18)
    private String cpfCgc;

    @Basic(optional = false)
    @Column(name = "CPF_CGC_SEQ", table = "CFACLIFO", nullable = false)
    private Integer cpfCgcSeq;

    @Basic
    @Column(name = "IE_RG", table = "CFACLIFO", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "ORGAO_EMISSOR", table = "CFACLIFO", length = 3)
    private String orgaoEmissor;

    @Basic(optional = false)
    @Column(name = "NOME_RAZAO", table = "CFACLIFO", nullable = false, length = 60)
    private String nomeRazao;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Basic
    @Column(name = "CODIGO_CLI", table = "CFACLIFO")
    private Integer codigoCli;

    @Basic
    @Column(name = "CODIGO_FOR", table = "CFACLIFO")
    private Integer codigoFor;

    @Basic
    @Column(name = "CODIGO_FUN", table = "CFACLIFO")
    private Integer codigoFun;

    @Basic
    @Column(name = "CODIGO_USU", table = "CFACLIFO")
    private Integer codigoUsu;

    @Basic
    @Column(name = "CODIGO_REP", table = "CFACLIFO")
    private Integer codigoRep;

    @Basic
    @Column(name = "CODIGO_CON", table = "CFACLIFO")
    private Integer codigoCon;

    @Basic
    @Column(name = "CODIGO_TRA", table = "CFACLIFO")
    private Integer codigoTra;

    @Basic
    @Column(name = "CODIGO_APA", table = "CFACLIFO")
    private Integer codigoApa;

    @Basic
    @Column(name = "CLIENTE", table = "CFACLIFO")
    private String cliente;

    @Basic
    @Column(name = "FORNECEDOR", table = "CFACLIFO")
    private String fornecedor;

    @Basic
    @Column(name = "FUNCIONARIO", table = "CFACLIFO")
    private String funcionario;

    @Basic
    @Column(name = "USUARIO", table = "CFACLIFO")
    private String usuario;

    @Basic
    @Column(name = "REPRESENTANTE", table = "CFACLIFO")
    private String representante;

    @Basic
    @Column(name = "CONCORRENTE", table = "CFACLIFO")
    private String concorrente;

    @Basic
    @Column(name = "TRANSPORTADORA", table = "CFACLIFO")
    private String transportadora;

    @Basic
    @Column(name = "NOME_FANTASIA", table = "CFACLIFO", length = 60)
    private String nomeFantasia;

    @Basic
    @Column(name = "SELECIONADO", table = "CFACLIFO")
    private String selecionado;

    @Basic
    @Column(name = "SEXO", table = "CFACLIFO")
    private String sexo;

    @Basic
    @Column(name = "INSC_JUNTA", table = "CFACLIFO", length = 18)
    private String inscJunta;

    @Basic
    @Column(name = "INSC_SUFRAMA", table = "CFACLIFO", length = 18)
    private String inscSuframa;

    @Basic
    @Column(name = "INSC_MUNICIPAL", table = "CFACLIFO", length = 18)
    private String inscMunicipal;

    @Basic
    @Column(name = "INSC_PRODUTOR", table = "CFACLIFO", length = 18)
    private String inscProdutor;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO_CARGO", table = "CFACLIFO")
    private byte[] complementoCargo;

    @Basic(optional = false)
    @Column(name = "RENDA_MES_GIRO", table = "CFACLIFO", nullable = false)
    private double rendaMesGiro;

    @Basic(optional = false)
    @Column(name = "CAPITAL_SOCIAL", table = "CFACLIFO", nullable = false)
    private double capitalSocial;

    @Basic(optional = false)
    @Column(name = "EST_MERCADORIAS", table = "CFACLIFO", nullable = false)
    private double estMercadorias;

    @Basic(optional = false)
    @Column(name = "EST_MAT_PRIMA", table = "CFACLIFO", nullable = false)
    private double estMatPrima;

    @Basic(optional = false)
    @Column(name = "MOVTO_VENDAS", table = "CFACLIFO", nullable = false)
    private double movtoVendas;

    @Basic(optional = false)
    @Column(name = "DESPESAS", table = "CFACLIFO", nullable = false)
    private double despesas;

    @Basic
    @Column(name = "EMPRESA_TRAB", table = "CFACLIFO", length = 60)
    private String empresaTrab;

    @Basic
    @Column(name = "NUM_CART_HABILIT", table = "CFACLIFO", length = 18)
    private String numCartHabilit;

    @Basic
    @Column(name = "DT_ADMISSAO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtAdmissao;

    @Basic
    @Column(name = "NUM_REG_HABILIT", table = "CFACLIFO", length = 18)
    private String numRegHabilit;

    @Basic
    @Column(name = "DT_VENCT_HABILIT", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtVenctHabilit;

    @Basic
    @Column(name = "FUMANTE", table = "CFACLIFO")
    private String fumante;

    @Lob
    @Basic
    @Column(name = "OBS", table = "CFACLIFO")
    private byte[] obs;

    @Basic
    @Column(name = "MORADIA", table = "CFACLIFO")
    private String moradia;

    @Basic
    @Column(name = "MORA_DESDE", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date moraDesde;

    @Basic
    @Column(name = "PESSOA", table = "CFACLIFO")
    private String pessoa;

    @Basic
    @Column(name = "CIVIL", table = "CFACLIFO")
    private String civil;

    @Basic
    @Column(name = "CONJUGE", table = "CFACLIFO", length = 60)
    private String conjuge;

    @Basic
    @Column(name = "CPF_CONJUGE", table = "CFACLIFO", length = 18)
    private String cpfConjuge;

    @Basic
    @Column(name = "DT_NASC_CONJ", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtNascConj;

    @Basic
    @Column(name = "PAI", table = "CFACLIFO", length = 60)
    private String pai;

    @Basic
    @Column(name = "CPF_PAI", table = "CFACLIFO", length = 18)
    private String cpfPai;

    @Basic
    @Column(name = "TEL_PAI", table = "CFACLIFO", length = 15)
    private String telPai;

    @Basic
    @Column(name = "DT_NASC_PAI", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtNascPai;

    @Basic
    @Column(name = "MAE", table = "CFACLIFO", length = 60)
    private String mae;

    @Basic
    @Column(name = "TEL_MAE", table = "CFACLIFO", length = 15)
    private String telMae;

    @Basic
    @Column(name = "CPF_MAE", table = "CFACLIFO", length = 18)
    private String cpfMae;

    @Basic
    @Column(name = "DT_NASC_MAE", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtNascMae;

    @Basic
    @Column(name = "ESCOLARIDADE", table = "CFACLIFO")
    private String escolaridade;

    @Basic
    @Column(name = "FORMACAO_SUPERIOR", table = "CFACLIFO", length = 18)
    private String formacaoSuperior;

    @Basic
    @Column(name = "AREAS_INTERESSE", table = "CFACLIFO", length = 128)
    private String areasInteresse;

    @Basic(optional = false)
    @Column(name = "QTDE_FUNCIONARIOS", table = "CFACLIFO", nullable = false)
    private Integer qtdeFuncionarios;

    @Basic(optional = false)
    @Column(name = "OUTRAS_RENDAS", table = "CFACLIFO", nullable = false)
    private double outrasRendas;

    @Basic(optional = false)
    @Column(name = "LIMITE_CARTAO", table = "CFACLIFO", nullable = false)
    private double limiteCartao;

    @Basic(optional = false)
    @Column(name = "NUM_DEP_MAIOR", table = "CFACLIFO", nullable = false)
    private Integer numDepMaior;

    @Basic(optional = false)
    @Column(name = "NUM_DEP_MENOR", table = "CFACLIFO", nullable = false)
    private Integer numDepMenor;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO_CARGO_CONJ", table = "CFACLIFO")
    private byte[] complementoCargoConj;

    @Basic
    @Column(name = "RG_CONJUGE", table = "CFACLIFO", length = 18)
    private String rgConjuge;

    @Basic
    @Column(name = "ORGAO_EMISSOR_CONJ", table = "CFACLIFO", length = 3)
    private String orgaoEmissorConj;

    @Basic(optional = false)
    @Column(name = "LIMITE_CONJUGE", table = "CFACLIFO", nullable = false)
    private double limiteConjuge;

    @Basic
    @Column(name = "EMPRESA_CONJUGE", table = "CFACLIFO", length = 60)
    private String empresaConjuge;

    @Basic
    @Column(name = "ADMISSAO_CONJUGE", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date admissaoConjuge;

    @Basic(optional = false)
    @Column(name = "RENDA_CONJUGE", table = "CFACLIFO", nullable = false)
    private double rendaConjuge;

    @Basic
    @Column(name = "AGENCIA_CONJ", table = "CFACLIFO")
    private Integer agenciaConj;

    @Basic
    @Column(name = "DG_AG_CONJ", table = "CFACLIFO")
    private String dgAgConj;

    @Basic
    @Column(name = "CONTA_CONJ", table = "CFACLIFO")
    private Integer contaConj;

    @Basic
    @Column(name = "DG_CT_CONJ", table = "CFACLIFO", length = 2)
    private String dgCtConj;

    @Basic
    @Column(name = "TIPO_CONTA_CONJ", table = "CFACLIFO")
    private String tipoContaConj;

    @Basic
    @Column(name = "DT_ABERTURA_CT_CONJ", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtAberturaCtConj;

    @Basic
    @Column(name = "VALIDADE_CT_CONJ", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date validadeCtConj;

    @Basic
    @Column(name = "CT_ESPECIAL_CONJ", table = "CFACLIFO")
    private String ctEspecialConj;

    @Basic
    @Column(name = "AGENCIA", table = "CFACLIFO")
    private Integer agencia;

    @Basic
    @Column(name = "DG_AG", table = "CFACLIFO")
    private String dgAg;

    @Basic
    @Column(name = "CONTA", table = "CFACLIFO")
    private Integer conta;

    @Basic
    @Column(name = "DG_CT", table = "CFACLIFO", length = 2)
    private String dgCt;

    @Basic
    @Column(name = "TIPO_CT", table = "CFACLIFO")
    private String tipoCt;

    @Basic
    @Column(name = "VALIDADE_CARTAO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date validadeCartao;

    @Basic
    @Column(name = "DT_ABERTURA_CONTA", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtAberturaConta;

    @Basic
    @Column(name = "CONTA_ESPECIAL", table = "CFACLIFO")
    private String contaEspecial;

    @Basic
    @Column(name = "CONVENIO", table = "CFACLIFO")
    private String convenio;

    @Basic
    @Column(name = "MASCARA_PRODUTO", table = "CFACLIFO")
    private String mascaraProduto;

    @Basic
    @Column(name = "CONSUMIDOR_REVENDA", table = "CFACLIFO")
    private String consumidorRevenda;

    @Basic
    @Column(name = "LOCAL_TRABALHO", table = "CFACLIFO", length = 60)
    private String localTrabalho;

    @Basic(optional = false)
    @Column(name = "MANEQUIM", table = "CFACLIFO", nullable = false)
    private Integer manequim;

    @Basic(optional = false)
    @Column(name = "MANEQUIM_CONJUGE", table = "CFACLIFO", nullable = false)
    private Integer manequimConjuge;

    @Basic(optional = false)
    @Column(name = "CALCADO", table = "CFACLIFO", nullable = false)
    private Integer calcado;

    @Basic(optional = false)
    @Column(name = "CALCADO_CONJUGE", table = "CFACLIFO", nullable = false)
    private Integer calcadoConjuge;

    @Basic
    @Column(name = "TIPO_FUNCIONARIO", table = "CFACLIFO", length = 18)
    private String tipoFuncionario;

    @Basic
    @Column(name = "SENHA", table = "CFACLIFO", length = 20)
    private String senha;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "CFACLIFO", nullable = false)
    private String ativo;

    @Basic
    @Column(name = "ENVIAR_EXTRATO", table = "CFACLIFO")
    private String enviarExtrato;

    @Basic
    @Column(name = "TIPO_EXTRATO", table = "CFACLIFO")
    private String tipoExtrato;

    @Basic
    @Column(name = "CONJ_PODE_COMPRAR", table = "CFACLIFO")
    private String conjPodeComprar;

    @Basic
    @Column(name = "DT_ULT_COMPRA", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtUltCompra;

    @Basic
    @Column(name = "DT_RENOVACAO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtRenovacao;

    @Basic
    @Column(name = "IS_DIZIMISTA", table = "CFACLIFO")
    private String isDizimista;

    @Basic
    @Column(name = "IS_CATEQUISTA", table = "CFACLIFO")
    private String isCatequista;

    @Basic
    @Column(name = "IS_CATEQUIZANDO", table = "CFACLIFO")
    private String isCatequizando;

    @Basic
    @Column(name = "IS_RELIGIOSO", table = "CFACLIFO")
    private String isReligioso;

    @Basic
    @Column(name = "IS_PADRE", table = "CFACLIFO")
    private String isPadre;

    @Basic
    @Column(name = "IS_LEIGO", table = "CFACLIFO")
    private String isLeigo;

    @Basic
    @Column(name = "IS_MINISTRO", table = "CFACLIFO")
    private String isMinistro;

    @Basic
    @Column(name = "IS_OUTROS", table = "CFACLIFO")
    private String isOutros;

    @Basic
    @Column(name = "IS_DIOCESE", table = "CFACLIFO")
    private String isDiocese;

    @Basic
    @Column(name = "IS_PAROQUIA", table = "CFACLIFO")
    private String isParoquia;

    @Basic
    @Column(name = "IS_COMUNIDADE", table = "CFACLIFO")
    private String isComunidade;

    @Basic
    @Column(name = "IS_CONTRIBUINTE", table = "CFACLIFO")
    private String isContribuinte;

    @Basic
    @Column(name = "IS_FUNERARIA", table = "CFACLIFO")
    private String isFuneraria;

    @Basic
    @Column(name = "IS_COORDCOMUN", table = "CFACLIFO")
    private String isCoordcomun;

    @Basic
    @Column(name = "IS_COORDPAROQ", table = "CFACLIFO")
    private String isCoordparoq;

    @Basic
    @Column(name = "PAROQUIA_ANTERIOR", table = "CFACLIFO", length = 60)
    private String paroquiaAnterior;

    @Basic
    @Column(name = "PADRE_PAROCO_VIGARIO", table = "CFACLIFO")
    private String padreParocoVigario;

    @Basic
    @Column(name = "PADRE_TEM_PROCURACAO", table = "CFACLIFO")
    private String padreTemProcuracao;

    @Basic
    @Column(name = "PADRE_DT_EXPEDICAO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date padreDtExpedicao;

    @Basic
    @Column(name = "PADRE_DT_VALIDADE", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date padreDtValidade;

    @Basic
    @Column(name = "PADRE_LIVRO_PROCURACAO", table = "CFACLIFO")
    private Integer padreLivroProcuracao;

    @Basic
    @Column(name = "PADRE_FOLHA_PROCURACAO", table = "CFACLIFO")
    private Integer padreFolhaProcuracao;

    @Basic
    @Column(name = "PADRE_VINCULACAO_DR", table = "CFACLIFO")
    private String padreVinculacaoDr;

    @Basic
    @Column(name = "PADRE_DT_CHEGADA_DIOCESE", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date padreDtChegadaDiocese;

    @Basic
    @Column(name = "PADRE_DT_ORDENACAO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date padreDtOrdenacao;

    @Basic
    @Column(name = "PADRE_DT_PRESBITERAL", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date padreDtPresbiteral;

    @Basic
    @Column(name = "PADRE_DT_EPISCOPAL", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date padreDtEpiscopal;

    @Basic
    @Column(name = "PADRE_DIOCESE_ORDENACAO", table = "CFACLIFO", length = 60)
    private String padreDioceseOrdenacao;

    @Basic
    @Column(name = "PADRE_DIOCESE_INCARDINACAO", table = "CFACLIFO", length = 60)
    private String padreDioceseIncardinacao;

    @Basic
    @Column(name = "PADRE_DIOCESE_RESIDENCIA", table = "CFACLIFO", length = 60)
    private String padreDioceseResidencia;

    @Lob
    @Basic
    @Column(name = "PADRE_ESTUDOS_FEITOS", table = "CFACLIFO")
    private byte[] padreEstudosFeitos;

    @Basic
    @Column(name = "CAT_JA_FOI", table = "CFACLIFO")
    private String catJaFoi;

    @Basic
    @Column(name = "CAT_JA_FOI_ONDE", table = "CFACLIFO", length = 60)
    private String catJaFoiOnde;

    @Basic
    @Column(name = "CAT_JA_FOI_DT_INICIO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date catJaFoiDtInicio;

    @Basic
    @Column(name = "CAT_JA_FOI_DT_FINAL", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date catJaFoiDtFinal;

    @Basic
    @Column(name = "CAT_ATUAL_DT_INICIO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date catAtualDtInicio;

    @Basic
    @Column(name = "CAT_ATUAL_DT_FINAL", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date catAtualDtFinal;

    @Basic
    @Column(name = "CAT_ATUAL_N_MATRICULAS", table = "CFACLIFO")
    private Integer catAtualNMatriculas;

    @Basic
    @Column(name = "CAT_ATUAL_N_FORMANDOS", table = "CFACLIFO")
    private Integer catAtualNFormandos;

    @Basic
    @Column(name = "CAT_ATUAL_USA_AGENDA", table = "CFACLIFO")
    private String catAtualUsaAgenda;

    @Basic
    @Column(name = "DT_CASAMENTO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtCasamento;

    @Basic
    @Column(name = "TIPO_SANGUINEO", table = "CFACLIFO")
    private String tipoSanguineo;

    @Basic
    @Column(name = "TIPO_SANG_RH", table = "CFACLIFO")
    private String tipoSangRh;

    @Basic
    @Column(name = "IE_RG_DT_EXPEDICAO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date ieRgDtExpedicao;

    @Basic
    @Column(name = "TEMPO_CONTRIBUICAO", table = "CFACLIFO", length = 40)
    private String tempoContribuicao;

    @Basic
    @Column(name = "ZONA", table = "CFACLIFO")
    private String zona;

    @Basic
    @Column(name = "GRUPO_REFLEXAO", table = "CFACLIFO")
    private String grupoReflexao;

    @Basic
    @Column(name = "QUANT_GRUPO_REFLEXAO", table = "CFACLIFO")
    private Integer quantGrupoReflexao;

    @Lob
    @Basic
    @Column(name = "LEIGO_OUTROS_OBSERVACAO", table = "CFACLIFO")
    private byte[] leigoOutrosObservacao;

    @Basic
    @Column(name = "NUMERO_FICHA", table = "CFACLIFO")
    private Integer numeroFicha;

    @Basic
    @Column(name = "PARTICIPA_PASTORAL", table = "CFACLIFO")
    private String participaPastoral;

    @Basic
    @Column(name = "GOSTARIA_PASTORAL", table = "CFACLIFO")
    private String gostariaPastoral;

    @Basic
    @Column(name = "CODIGO", table = "CFACLIFO")
    private Integer codigo;

    @Basic
    @Column(name = "DT_BATIZADO", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtBatizado;

    @Basic
    @Column(name = "DT_EUCARISTIA", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtEucaristia;

    @Basic
    @Column(name = "PAROQ_BATIZADO", table = "CFACLIFO", length = 60)
    private String paroqBatizado;

    @Basic
    @Column(name = "PAROQ_EUCARISTIA", table = "CFACLIFO", length = 60)
    private String paroqEucaristia;

    @Basic
    @Column(name = "EMAIL_GERAL", table = "CFACLIFO", length = 128)
    private String emailGeral;

    @Basic
    @Column(name = "EMAIL_FINAN", table = "CFACLIFO", length = 128)
    private String emailFinan;

    @Basic
    @Column(name = "EMAIL_CONTABIL", table = "CFACLIFO", length = 128)
    private String emailContabil;

    @Basic
    @Column(name = "EMAIL_COMPRAS", table = "CFACLIFO", length = 128)
    private String emailCompras;

    @Basic
    @Column(name = "SITE", table = "CFACLIFO", length = 128)
    private String site;

    @Basic
    @Column(name = "CRT", table = "CFACLIFO")
    private String crt;

    @Basic
    @Column(name = "SUFRAMA_OK", table = "CFACLIFO")
    private String suframaOk;

    @Basic
    @Column(name = "DT_VALIDADE_SUFRAMA", table = "CFACLIFO")
    @Temporal(TemporalType.DATE)
    private Date dtValidadeSuframa;

    @Basic(optional = false)
    @Column(name = "QTDE_LICENCA_MOVEL", table = "CFACLIFO", nullable = false)
    private Integer qtdeLicencaMovel;

    @Basic
    @Column(name = "VERSAO_SAVARE", table = "CFACLIFO", length = 20)
    private String versaoSavare;

    @Basic
    @Column(name = "IP_SERVIDOR_SISINFO", table = "CFACLIFO", length = 128)
    private String ipServidorSisinfo;

    @Basic
    @Column(name = "IP_SERVIDOR_WEBSERVICE", table = "CFACLIFO", length = 128)
    private String ipServidorWebservice;

    @Basic
    @Column(name = "USU_SISINFO_WEBSERVICE", table = "CFACLIFO", length = 20)
    private String usuSisinfoWebservice;

    @Basic
    @Column(name = "SENHA_SISINFO_WEBSERVICE", table = "CFACLIFO", length = 20)
    private String senhaSisinfoWebservice;

    @Basic
    @Column(name = "CAMINHO_BANCO_SISINFO", table = "CFACLIFO", length = 128)
    private String caminhoBancoSisinfo;

    @Basic
    @Column(name = "PORTA_BANCO_SISINFO", table = "CFACLIFO")
    private Integer portaBancoSisinfo;

    @Basic
    @Column(name = "MODO_CONEXAO_WEBSERVICE", table = "CFACLIFO")
    private String modoConexaoWebservice;

    @Basic
    @Column(name = "MAE_FONE", table = "CFACLIFO", length = 15)
    private String maeFone;

    @Basic
    @Column(name = "PAI_FONE", table = "CFACLIFO", length = 15)
    private String paiFone;

    @Basic
    @Column(name = "TEM_BIBLIA", table = "CFACLIFO")
    private String temBiblia;

    @Basic
    @Column(name = "PADRINHO", table = "CFACLIFO", length = 60)
    private String padrinho;

    @Basic
    @Column(name = "PADRI_CASADO", table = "CFACLIFO")
    private String padriCasado;

    @Basic
    @Column(name = "PADRI_CONJUGUE", table = "CFACLIFO", length = 60)
    private String padriConjugue;

    @Basic
    @Column(name = "BATISMO", table = "CFACLIFO")
    private String batismo;

    @Basic
    @Column(name = "EUCARISTIA", table = "CFACLIFO")
    private String eucaristia;

    @Basic
    @Column(name = "CRISMA", table = "CFACLIFO")
    private String crisma;

    @Basic
    @Column(name = "MATRIMONIO", table = "CFACLIFO")
    private String matrimonio;
}