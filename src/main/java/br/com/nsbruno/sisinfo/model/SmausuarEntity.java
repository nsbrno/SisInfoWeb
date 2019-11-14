package br.com.nsbruno.sisinfo.model;

import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "SMAUSUAR", uniqueConstraints = @UniqueConstraint(columnNames = "ID_CFACLIFO"))
public class SmausuarEntity implements Serializable {

    @Id
    @Column(name = "ID_SMAUSUAR", table = "SMAUSUAR", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSmausuar;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "SMAUSUAR")
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "SMAUSUAR", nullable = false)
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CBANUMCX", table = "SMAUSUAR")
    private Integer idCbanumcx;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAUSUAR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAUSUAR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAUSUAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAUSUAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAUSUAR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NOME", table = "SMAUSUAR", nullable = false, length = 60)
    @NotEmpty(message = "NOME " + DefaultMessageConfiguration.NOT_EMPTY)
    private String nome;
    
    @Basic(optional = false)
    @Column(name = "SENHA", table = "SMAUSUAR", nullable = false)
    @JsonIgnore
    private String senha;

    @Basic
    @Column(name = "COR_CAMPO_COM_FOCU", table = "SMAUSUAR", length = 20)
    private String corCampoComFocu;

    @Basic
    @Column(name = "COR_CAMPO_SEM_FOCU", table = "SMAUSUAR", length = 20)
    private String corCampoSemFocu;

    @Basic
    @Column(name = "COR_BOX_COM_FOCU", table = "SMAUSUAR", length = 20)
    private String corBoxComFocu;

    @Basic
    @Column(name = "COR_BOX_SEM_FOCU", table = "SMAUSUAR", length = 20)
    private String corBoxSemFocu;

    @Basic
    @Column(name = "COR_LINHA_SEL_GRID", table = "SMAUSUAR", length = 20)
    private String corLinhaSelGrid;

    @Basic
    @Column(name = "COR_COLUNA_SEL_GRID", table = "SMAUSUAR", length = 20)
    private String corColunaSelGrid;

    @Basic
    @Column(name = "COR_CAMPO_SEL_GRID", table = "SMAUSUAR", length = 20)
    private String corCampoSelGrid;

    @Basic
    @Column(name = "COR_LINHA_IMPAR_GRID", table = "SMAUSUAR", length = 20)
    private String corLinhaImparGrid;

    @Basic
    @Column(name = "COR_LINHA_PAR_GRID", table = "SMAUSUAR", length = 20)
    private String corLinhaParGrid;

    @Basic
    @Column(name = "COR_HEADER_GRID_COM_FOCU", table = "SMAUSUAR", length = 20)
    private String corHeaderGridComFocu;

    @Basic
    @Column(name = "COR_HEADER_GRID_SEM_FOCU", table = "SMAUSUAR", length = 20)
    private String corHeaderGridSemFocu;

    @Basic
    @Column(name = "COR_LINHA", table = "SMAUSUAR", length = 20)
    private String corLinha;

    @Basic
    @Column(name = "COR_FORM", table = "SMAUSUAR", length = 20)
    private String corForm;

    @Basic
    @Column(name = "FONTE_LCF_NOME", table = "SMAUSUAR", length = 20)
    private String fonteLcfNome;

    @Basic
    @Column(name = "FONTE_LSF_NOME", table = "SMAUSUAR", length = 20)
    private String fonteLsfNome;

    @Basic
    @Column(name = "FONTE_CCF_NOME", table = "SMAUSUAR", length = 20)
    private String fonteCcfNome;

    @Basic
    @Column(name = "FONTE_CSF_NOME", table = "SMAUSUAR", length = 20)
    private String fonteCsfNome;

    @Basic
    @Column(name = "FONTE_LSG_NOME", table = "SMAUSUAR", length = 20)
    private String fonteLsgNome;

    @Basic
    @Column(name = "FONTE_COLSG_NOME", table = "SMAUSUAR", length = 20)
    private String fonteColsgNome;

    @Basic
    @Column(name = "FONTE_CPOSG_NOME", table = "SMAUSUAR", length = 20)
    private String fonteCposgNome;

    @Basic
    @Column(name = "FONTE_LIG_NOME", table = "SMAUSUAR", length = 20)
    private String fonteLigNome;

    @Basic
    @Column(name = "FONTE_LPG_NOME", table = "SMAUSUAR", length = 20)
    private String fonteLpgNome;

    @Basic
    @Column(name = "FONTE_HGCF_NOME", table = "SMAUSUAR", length = 20)
    private String fonteHgcfNome;

    @Basic
    @Column(name = "FONTE_HGSF_NOME", table = "SMAUSUAR", length = 20)
    private String fonteHgsfNome;

    @Basic
    @Column(name = "FONTE_MENU_NOME", table = "SMAUSUAR", length = 20)
    private String fonteMenuNome;

    @Basic
    @Column(name = "FONTE_RELAT_NOME", table = "SMAUSUAR", length = 20)
    private String fonteRelatNome;

    @Basic
    @Column(name = "FONTE_LCF_COR", table = "SMAUSUAR", length = 20)
    private String fonteLcfCor;

    @Basic
    @Column(name = "FONTE_LSF_COR", table = "SMAUSUAR", length = 20)
    private String fonteLsfCor;

    @Basic
    @Column(name = "FONTE_CCF_COR", table = "SMAUSUAR", length = 20)
    private String fonteCcfCor;

    @Basic
    @Column(name = "FONTE_CSF_COR", table = "SMAUSUAR", length = 20)
    private String fonteCsfCor;

    @Basic
    @Column(name = "FONTE_LSG_COR", table = "SMAUSUAR", length = 20)
    private String fonteLsgCor;

    @Basic
    @Column(name = "FONTE_COLSG_COR", table = "SMAUSUAR", length = 20)
    private String fonteColsgCor;

    @Basic
    @Column(name = "FONTE_CPOSG_COR", table = "SMAUSUAR", length = 20)
    private String fonteCposgCor;

    @Basic
    @Column(name = "FONTE_LIG_COR", table = "SMAUSUAR", length = 20)
    private String fonteLigCor;

    @Basic
    @Column(name = "FONTE_LPG_COR", table = "SMAUSUAR", length = 20)
    private String fonteLpgCor;

    @Basic
    @Column(name = "FONTE_HGCF_COR", table = "SMAUSUAR", length = 20)
    private String fonteHgcfCor;

    @Basic
    @Column(name = "FONTE_HGSF_COR", table = "SMAUSUAR", length = 20)
    private String fonteHgsfCor;

    @Basic
    @Column(name = "FONTE_MENU_COR", table = "SMAUSUAR", length = 20)
    private String fonteMenuCor;

    @Basic(optional = false)
    @Column(name = "FONTE_LCF_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteLcfSize;

    @Basic(optional = false)
    @Column(name = "FONTE_LSF_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteLsfSize;

    @Basic(optional = false)
    @Column(name = "FONTE_CCF_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteCcfSize;

    @Basic(optional = false)
    @Column(name = "FONTE_CSF_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteCsfSize;

    @Basic(optional = false)
    @Column(name = "FONTE_LSG_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteLsgSize;

    @Basic(optional = false)
    @Column(name = "FONTE_CPOSG_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteCposgSize;

    @Basic(optional = false)
    @Column(name = "FONTE_LIG_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteLigSize;

    @Basic(optional = false)
    @Column(name = "FONTE_LPG_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteLpgSize;

    @Basic(optional = false)
    @Column(name = "FONTE_HGCF_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteHgcfSize;

    @Basic(optional = false)
    @Column(name = "FONTE_COLSG_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteColsgSize;

    @Basic(optional = false)
    @Column(name = "FONTE_HGSF_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteHgsfSize;

    @Basic(optional = false)
    @Column(name = "FONTE_MENU_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteMenuSize;

    @Basic(optional = false)
    @Column(name = "FONTE_RELAT_SIZE", table = "SMAUSUAR", nullable = false)
    private Integer fonteRelatSize;

    @Basic
    @Column(name = "FONTE_LCF_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteLcfEstilo;

    @Basic
    @Column(name = "FONTE_LSF_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteLsfEstilo;

    @Basic
    @Column(name = "FONTE_CCF_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteCcfEstilo;

    @Basic
    @Column(name = "FONTE_CSF_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteCsfEstilo;

    @Basic
    @Column(name = "FONTE_LSG_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteLsgEstilo;

    @Basic
    @Column(name = "FONTE_COLSG_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteColsgEstilo;

    @Basic
    @Column(name = "FONTE_CPOSG_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteCposgEstilo;

    @Basic
    @Column(name = "FONTE_LIG_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteLigEstilo;

    @Basic
    @Column(name = "FONTE_LPG_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteLpgEstilo;

    @Basic
    @Column(name = "FONTE_HGCF_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteHgcfEstilo;

    @Basic
    @Column(name = "FONTE_HGSF_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteHgsfEstilo;

    @Basic
    @Column(name = "FONTE_MENU_ESTILO", table = "SMAUSUAR", length = 5)
    private String fonteMenuEstilo;

    @Basic
    @Column(name = "BOX_ENVOLVATOR", table = "SMAUSUAR")
    private String boxEnvolvator;

    @Basic
    @Column(name = "BOTAO_RELEVO", table = "SMAUSUAR")
    private String botaoRelevo;

    @Basic
    @Column(name = "EDICAO_2D", table = "SMAUSUAR")
    private String edicao2d;

    @Basic
    @Column(name = "SELECIONA_EDICAO", table = "SMAUSUAR")
    private String selecionaEdicao;

    @Basic
    @Column(name = "PISCA_NOME_CAMPO", table = "SMAUSUAR")
    private String piscaNomeCampo;

    @Basic
    @Column(name = "TELA_CHAMADORA", table = "SMAUSUAR")
    private String telaChamadora;

    @Basic
    @Column(name = "ACESSO_TOTAL", table = "SMAUSUAR")
    private String acessoTotal;

    @Basic(optional = false)
    @Column(name = "DEFAULT_ROW_HEIGHT", table = "SMAUSUAR", nullable = false)
    private Integer defaultRowHeight;

    @Basic(optional = false)
    @Column(name = "DEFAULT_ROW_HEIGHT_C", table = "SMAUSUAR", nullable = false)
    private Integer defaultRowHeightC;

    @Basic
    @Column(name = "MASCARA_DATA_HORA", table = "SMAUSUAR", length = 40)
    private String mascaraDataHora;

    @Basic
    @Column(name = "MASCARA_DATA", table = "SMAUSUAR", length = 40)
    private String mascaraData;

    @Basic
    @Column(name = "MASCARA_HORA", table = "SMAUSUAR", length = 40)
    private String mascaraHora;

    @Basic
    @Column(name = "MASCARA_PERCENTUAL", table = "SMAUSUAR", length = 40)
    private String mascaraPercentual;

    @Basic
    @Column(name = "MASCARA_QTDE", table = "SMAUSUAR", length = 40)
    private String mascaraQtde;

    @Basic
    @Column(name = "MASCARA_MONETARIA", table = "SMAUSUAR", length = 40)
    private String mascaraMonetaria;

    @Basic(optional = false)
    @Column(name = "TAMANHO_PERC", table = "SMAUSUAR", nullable = false)
    private Integer tamanhoPerc;

    @Basic(optional = false)
    @Column(name = "TAMANHO_QTDE", table = "SMAUSUAR", nullable = false)
    private Integer tamanhoQtde;

    @Basic(optional = false)
    @Column(name = "DECIMAIS_PERC", table = "SMAUSUAR", nullable = false)
    private Integer decimaisPerc;

    @Basic(optional = false)
    @Column(name = "DECIMAIS_QTDE", table = "SMAUSUAR", nullable = false)
    private Integer decimaisQtde;

    @Basic(optional = false)
    @Column(name = "DECIMAIS_PRECO", table = "SMAUSUAR", nullable = false)
    private Integer decimaisPreco;

    @Basic
    @Column(name = "GERENCIA_CORES", table = "SMAUSUAR")
    private String gerenciaCores;

    @Basic
    @Column(name = "ACESSA_CADASTRO", table = "SMAUSUAR")
    private String acessaCadastro;

    @Basic
    @Column(name = "ESCOLHE_RELATORIO", table = "SMAUSUAR")
    private String escolheRelatorio;

    @Lob
    @Basic
    @Column(name = "BMP_BROWSE", table = "SMAUSUAR")
    private byte[] bmpBrowse;

    @Lob
    @Basic
    @Column(name = "BMP_SELECAO", table = "SMAUSUAR")
    private byte[] bmpSelecao;

    @Lob
    @Basic
    @Column(name = "BMP_EDIT", table = "SMAUSUAR")
    private byte[] bmpEdit;

    @Lob
    @Basic
    @Column(name = "BMP_INSERT", table = "SMAUSUAR")
    private byte[] bmpInsert;

    @Lob
    @Basic
    @Column(name = "BMP_FIRST", table = "SMAUSUAR")
    private byte[] bmpFirst;

    @Lob
    @Basic
    @Column(name = "BMP_PRIOR", table = "SMAUSUAR")
    private byte[] bmpPrior;

    @Lob
    @Basic
    @Column(name = "BMP_NEXT", table = "SMAUSUAR")
    private byte[] bmpNext;

    @Lob
    @Basic
    @Column(name = "BMP_LAST", table = "SMAUSUAR")
    private byte[] bmpLast;

    @Lob
    @Basic
    @Column(name = "BMP_CLEAR", table = "SMAUSUAR")
    private byte[] bmpClear;

    @Lob
    @Basic
    @Column(name = "BMP_GRAVA", table = "SMAUSUAR")
    private byte[] bmpGrava;

    @Lob
    @Basic
    @Column(name = "BMP_EXCLUI", table = "SMAUSUAR")
    private byte[] bmpExclui;

    @Lob
    @Basic
    @Column(name = "BMP_CONSULTA", table = "SMAUSUAR")
    private byte[] bmpConsulta;

    @Lob
    @Basic
    @Column(name = "BMP_CADASTRA", table = "SMAUSUAR")
    private byte[] bmpCadastra;

    @Lob
    @Basic
    @Column(name = "BMP_CALEND", table = "SMAUSUAR")
    private byte[] bmpCalend;

    @Lob
    @Basic
    @Column(name = "BMP_CALC", table = "SMAUSUAR")
    private byte[] bmpCalc;

    @Lob
    @Basic
    @Column(name = "BMP_SAIR", table = "SMAUSUAR")
    private byte[] bmpSair;

    @Lob
    @Basic
    @Column(name = "BMP_OK", table = "SMAUSUAR")
    private byte[] bmpOk;

    @Lob
    @Basic
    @Column(name = "BMP_CANCEL", table = "SMAUSUAR")
    private byte[] bmpCancel;

    @Lob
    @Basic
    @Column(name = "BMP_IMPRIMIR", table = "SMAUSUAR")
    private byte[] bmpImprimir;

    @Lob
    @Basic
    @Column(name = "BMP_OPCAO_TELA", table = "SMAUSUAR")
    private byte[] bmpOpcaoTela;

    @Lob
    @Basic
    @Column(name = "BMP_REFRESH_RECORD", table = "SMAUSUAR")
    private byte[] bmpRefreshRecord;

    @Lob
    @Basic
    @Column(name = "BMP_FUNDO_TELA", table = "SMAUSUAR")
    private byte[] bmpFundoTela;

    @Lob
    @Basic
    @Column(name = "BMP_VISUALIZAR", table = "SMAUSUAR")
    private byte[] bmpVisualizar;

    @Basic
    @Column(name = "TIPO_FUNDO", table = "SMAUSUAR")
    private String tipoFundo;

    @Basic
    @Column(name = "SKIN", table = "SMAUSUAR", length = 40)
    private String skin;

    @Basic
    @Column(name = "MODELO_CALCULADORA", table = "SMAUSUAR")
    private String modeloCalculadora;
}