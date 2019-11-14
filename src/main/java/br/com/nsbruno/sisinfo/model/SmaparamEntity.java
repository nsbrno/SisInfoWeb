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

@Data
@Entity
@Table(name = "SMAPARAM")
public class SmaparamEntity {

    @Id
    @Column(name = "ID_SMAPARAM", table = "SMAPARAM", nullable = false)
    private Integer idSmaparam;

    @Basic
    @Column(name = "ID_AEACODOM", table = "SMAPARAM")
    private Integer idAeacodom;

    @Basic
    @Column(name = "ID_SMAEMPRE_MANUT_PROD", table = "SMAPARAM")
    private Integer idSmaempreManutProd;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "SMAPARAM")
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAPARAM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAPARAM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAPARAM")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DIG_FAMILIA", table = "SMAPARAM", nullable = false)
    private Integer digFamilia;

    @Basic(optional = false)
    @Column(name = "DIG_CLASSE", table = "SMAPARAM", nullable = false)
    private Integer digClasse;

    @Basic(optional = false)
    @Column(name = "DIG_GRUPO", table = "SMAPARAM", nullable = false)
    private Integer digGrupo;

    @Basic(optional = false)
    @Column(name = "DIG_SUBGRUPO", table = "SMAPARAM", nullable = false)
    private Integer digSubgrupo;

    @Basic(optional = false)
    @Column(name = "DIG_CODIGO", table = "SMAPARAM", nullable = false)
    private Integer digCodigo;

    @Basic
    @Column(name = "NOME_RAZAO", table = "SMAPARAM", length = 60)
    private String nomeRazao;

    @Basic
    @Column(name = "CPF_CGC", table = "SMAPARAM", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "PADRAO_CODIGO_BARRAS", table = "SMAPARAM", length = 20)
    private String padraoCodigoBarras;

    @Basic
    @Column(name = "INATIVA_PROD_COM_ESTOQUE", table = "SMAPARAM")
    private String inativaProdComEstoque;

    @Basic
    @Column(name = "FONTE_RELAT_NOME", table = "SMAPARAM", length = 20)
    private String fonteRelatNome;

    @Basic(optional = false)
    @Column(name = "FONTE_RELAT_SIZE", table = "SMAPARAM", nullable = false)
    private Integer fonteRelatSize;

    @Basic
    @Column(name = "DATA_ULT_TRANSF", table = "SMAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltTransf;

    @Basic
    @Column(name = "DATA_ENTROU_AR", table = "SMAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrouAr;

    @Basic(optional = false)
    @Column(name = "ANOS_LOCK", table = "SMAPARAM", nullable = false)
    private Integer anosLock;

    @Basic(optional = false)
    @Column(name = "DELAY_BANNER", table = "SMAPARAM", nullable = false)
    private Integer delayBanner;

    @Basic(optional = false)
    @Column(name = "DELAY_ENTRE_BANNER", table = "SMAPARAM", nullable = false)
    private Integer delayEntreBanner;

    @Basic
    @Column(name = "RETORNO_FATURADO", table = "SMAPARAM")
    private String retornoFaturado;

    @Basic
    @Column(name = "VALIDA_GTIN", table = "SMAPARAM")
    private String validaGtin;

    @Basic
    @Column(name = "COD_INC_TRIB", table = "SMAPARAM")
    private String codIncTrib;

    @Basic
    @Column(name = "IND_APRO_CRED", table = "SMAPARAM")
    private String indAproCred;

    @Basic
    @Column(name = "COD_TIPO_CONT", table = "SMAPARAM")
    private String codTipoCont;

    @Basic
    @Column(name = "IND_REG_CUM", table = "SMAPARAM")
    private String indRegCum;

    @Basic
    @Column(name = "VERSAO_BANCO", table = "SMAPARAM")
    private Integer versaoBanco;

    @Basic
    @Column(name = "BD_ATUALIZANDO", table = "SMAPARAM")
    private String bdAtualizando;

    @Basic
    @Column(name = "TIPO_PARTIDAS", table = "SMAPARAM")
    private String tipoPartidas;

    @Basic
    @Column(name = "TIPO_BAIXA_CONTRATOS", table = "SMAPARAM")
    private String tipoBaixaContratos;
}