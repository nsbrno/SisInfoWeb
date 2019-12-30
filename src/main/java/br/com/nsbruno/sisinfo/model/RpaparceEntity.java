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
@Table(name = "RPAPARCE")
@Data
public class RpaparceEntity {

    @Id
    @Column(name = "ID_RPAPARCE", table = "RPAPARCE", nullable = false)
    private Integer idRpaparce;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "RPAPARCE", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_RPAFATUR", table = "RPAPARCE")
    private Integer idRpafatur;

    @Basic
    @Column(name = "ID_CBAITACE", table = "RPAPARCE")
    private Integer idCbaitace;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "RPAPARCE", nullable = false)
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_CFATPDOC", table = "RPAPARCE", nullable = false)
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_CBAPLCTA_CTA_TRANS", table = "RPAPARCE")
    private Integer idCbaplctaCtaTrans;

    @Basic
    @Column(name = "ID_CBAPLCTA_DP", table = "RPAPARCE")
    private Integer idCbaplctaDp;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "RPAPARCE")
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "ID_CFATPCOB", table = "RPAPARCE", nullable = false)
    private Integer idCfatpcob;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "RPAPARCE")
    private Integer idCfamoeda;

    @Basic(optional = false)
    @Column(name = "ID_CFAPORTA", table = "RPAPARCE", nullable = false)
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CFAESTAD_ORGAO", table = "RPAPARCE")
    private Integer idCfaestadOrgao;

    @Basic
    @Column(name = "ID_CBACAIXA_AUTENTIC", table = "RPAPARCE")
    private Integer idCbacaixaAutentic;

    @Basic
    @Column(name = "ID_CFACLIFO_AUTENTIC", table = "RPAPARCE")
    private Integer idCfaclifoAutentic;

    @Basic
    @Column(name = "ID_CFACCRED", table = "RPAPARCE")
    private Integer idCfaccred;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAPARCE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAPARCE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAPARCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAPARCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAPARCE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "RPAPARCE", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "DT_IMPORTACAO", table = "RPAPARCE")
    @Temporal(TemporalType.DATE)
    private Date dtImportacao;

    @Basic(optional = false)
    @Column(name = "DT_EMISSAO", table = "RPAPARCE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic(optional = false)
    @Column(name = "DT_VENCIMENTO", table = "RPAPARCE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Basic
    @Column(name = "DT_PAGAMENTO", table = "RPAPARCE")
    @Temporal(TemporalType.DATE)
    private Date dtPagamento;

    @Basic
    @Column(name = "DT_BAIXA", table = "RPAPARCE")
    @Temporal(TemporalType.DATE)
    private Date dtBaixa;

    @Basic
    @Column(name = "DT_TEM_DOCTO_MUDOU", table = "RPAPARCE")
    @Temporal(TemporalType.DATE)
    private Date dtTemDoctoMudou;

    @Basic
    @Column(name = "DT_AUTENTIC", table = "RPAPARCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAutentic;

    @Basic(optional = false)
    @Column(name = "PARCELA", table = "RPAPARCE", nullable = false)
    private Integer parcela;

    @Basic(optional = false)
    @Column(name = "VL_PARCELA", table = "RPAPARCE", nullable = false)
    private double vlParcela;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_PRORROG", table = "RPAPARCE", nullable = false)
    private double vlJurosProrrog;

    @Basic(optional = false)
    @Column(name = "VL_PAGO", table = "RPAPARCE", nullable = false)
    private double vlPago;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "RPAPARCE", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "RPAPARCE", nullable = false)
    private double vlJuros;

    @Basic
    @Column(name = "FC_VL_TOTAL_PAGO", table = "RPAPARCE", precision = 15)
    private Double fcVlTotalPago;

    @Basic
    @Column(name = "FC_VL_RESTANTE", table = "RPAPARCE", precision = 15)
    private Double fcVlRestante;

    @Basic
    @Column(name = "FC_VL_RESTANTE_SEM_PRORROG", table = "RPAPARCE", precision = 15)
    private Double fcVlRestanteSemProrrog;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_DIARIO", table = "RPAPARCE", nullable = false)
    private double vlJurosDiario;

    @Basic(optional = false)
    @Column(name = "NUM_EMISSOES", table = "RPAPARCE", nullable = false)
    private Integer numEmissoes;

    @Basic(optional = false)
    @Column(name = "TAXA_DIARIA", table = "RPAPARCE", nullable = false)
    private double taxaDiaria;

    @Basic
    @Column(name = "CAPITALIZA", table = "RPAPARCE")
    private String capitaliza;

    @Basic
    @Column(name = "PRORROGADO", table = "RPAPARCE")
    private String prorrogado;

    @Basic(optional = false)
    @Column(name = "DIAS_PROTESTO", table = "RPAPARCE", nullable = false)
    private Integer diasProtesto;

    @Basic(optional = false)
    @Column(name = "TEM_DOCTO", table = "RPAPARCE", nullable = false)
    private String temDocto;

    @Basic(optional = false)
    @Column(name = "PERC_MULTA", table = "RPAPARCE", nullable = false)
    private double percMulta;

    @Basic(optional = false)
    @Column(name = "PERC_DESCONTO", table = "RPAPARCE", nullable = false)
    private double percDesconto;

    @Basic
    @Column(name = "INDEXADO", table = "RPAPARCE")
    private String indexado;

    @Basic(optional = false)
    @Column(name = "SEQUENCIAL", table = "RPAPARCE", nullable = false, length = 13)
    private String sequencial;

    @Basic(optional = false)
    @Column(name = "AGENCIA", table = "RPAPARCE", nullable = false)
    private Integer agencia;

    @Basic
    @Column(name = "DG_AG", table = "RPAPARCE")
    private String dgAg;

    @Basic
    @Column(name = "CONTA", table = "RPAPARCE")
    private Integer conta;

    @Basic
    @Column(name = "DG_CT", table = "RPAPARCE", length = 2)
    private String dgCt;

    @Basic
    @Column(name = "SERIE", table = "RPAPARCE", length = 6)
    private String serie;

    @Basic
    @Column(name = "NUMERO", table = "RPAPARCE", length = 20)
    private String numero;

    @Basic
    @Column(name = "CONTROLE", table = "RPAPARCE", length = 60)
    private String controle;

    @Basic
    @Column(name = "SEQ_BOLETO", table = "RPAPARCE")
    private Integer seqBoleto;

    @Basic
    @Column(name = "NOME", table = "RPAPARCE", length = 60)
    private String nome;

    @Basic
    @Column(name = "CPF_CGC", table = "RPAPARCE", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "IE_RG", table = "RPAPARCE", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "ORGAO_EMISSOR", table = "RPAPARCE", length = 3)
    private String orgaoEmissor;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "RPAPARCE", nullable = false)
    private short situacao;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPAPARCE")
    private byte[] obs;

    @Basic
    @Column(name = "A_S", table = "RPAPARCE")
    private String a_S;
}