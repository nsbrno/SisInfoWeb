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
@Table(name = "SMAARQUI")
@Data
public class SmaarquiEntity {

    @Id
    @Column(name = "ID_SMAARQUI", table = "SMAARQUI", nullable = false)
    private Integer idSmaarqui;

    @Basic
    @Column(name = "ID_SMADEPTO", table = "SMAARQUI")
    private Integer idSmadepto;

    @Basic(optional = false)
    @Column(name = "ID_SMAMODUL", table = "SMAARQUI", nullable = false)
    private Integer idSmamodul;

    @Basic
    @Column(name = "ID_SMAGRUPO", table = "SMAARQUI")
    private Integer idSmagrupo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAARQUI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAARQUI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAARQUI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAARQUI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAARQUI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "ARQUIVO", table = "SMAARQUI", nullable = false, length = 12)
    private String arquivo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "SMAARQUI", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "SMAARQUI", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "LOG_ALTERACAO", table = "SMAARQUI")
    private String logAlteracao;

    @Basic
    @Column(name = "LOG_EXCLUSAO", table = "SMAARQUI")
    private String logExclusao;

    @Basic
    @Column(name = "LOG_IMPRESSAO", table = "SMAARQUI")
    private String logImpressao;

    @Basic
    @Column(name = "SALVA_TELA", table = "SMAARQUI")
    private String salvaTela;

    @Basic
    @Column(name = "SALVA_ID_EXCLUIDO", table = "SMAARQUI")
    private String salvaIdExcluido;

    @Basic
    @Column(name = "ACESSA_COM_SENHA", table = "SMAARQUI")
    private String acessaComSenha;

    @Basic
    @Column(name = "COMANDO_IMPRESSAO", table = "SMAARQUI", length = 40)
    private String comandoImpressao;

    @Basic
    @Column(name = "PATH_IMPRESSAO", table = "SMAARQUI", length = 128)
    private String pathImpressao;

    @Basic
    @Column(name = "USUARIO_CONFIGURA", table = "SMAARQUI")
    private String usuarioConfigura;

    @Basic(optional = false)
    @Column(name = "COPIAS", table = "SMAARQUI", nullable = false)
    private Integer copias;

    @Basic
    @Column(name = "PEDE_SAIDA", table = "SMAARQUI")
    private String pedeSaida;

    @Basic
    @Column(name = "PATH_LOGOMARCA", table = "SMAARQUI", length = 128)
    private String pathLogomarca;

    @Basic
    @Column(name = "IMPRIME_SELECAO", table = "SMAARQUI")
    private String imprimeSelecao;

    @Basic
    @Column(name = "IMPRIME_LOGOMARCA", table = "SMAARQUI")
    private String imprimeLogomarca;

    @Basic(optional = false)
    @Column(name = "MARGEM_SUPERIOR", table = "SMAARQUI", nullable = false)
    private double margemSuperior;

    @Basic(optional = false)
    @Column(name = "MARGEM_INFERIOR", table = "SMAARQUI", nullable = false)
    private double margemInferior;

    @Basic(optional = false)
    @Column(name = "MARGEM_ESQUERDA", table = "SMAARQUI", nullable = false)
    private double margemEsquerda;

    @Basic(optional = false)
    @Column(name = "MARGEM_DIREITA", table = "SMAARQUI", nullable = false)
    private double margemDireita;

    @Basic(optional = false)
    @Column(name = "ALTURA_PAPEL", table = "SMAARQUI", nullable = false)
    private double alturaPapel;

    @Basic(optional = false)
    @Column(name = "LARGURA_PAPEL", table = "SMAARQUI", nullable = false)
    private double larguraPapel;

    @Basic
    @Column(name = "SERVIDOR", table = "SMAARQUI", length = 40)
    private String servidor;

    @Basic
    @Column(name = "IMPRESSORA", table = "SMAARQUI", length = 128)
    private String impressora;

    @Basic
    @Column(name = "IMPRIME_MATRICIAL", table = "SMAARQUI")
    private String imprimeMatricial;

    @Lob
    @Basic
    @Column(name = "OBS", table = "SMAARQUI")
    private byte[] obs;

    @Basic
    @Column(name = "ORIENTACAO", table = "SMAARQUI")
    private String orientacao;

    @Basic
    @Column(name = "FONTE_RELAT_NOME", table = "SMAARQUI", length = 20)
    private String fonteRelatNome;

    @Basic(optional = false)
    @Column(name = "FONTE_RELAT_SIZE", table = "SMAARQUI", nullable = false)
    private Integer fonteRelatSize;

    @Basic
    @Column(name = "ESCOLHE_RELATORIO", table = "SMAARQUI")
    private String escolheRelatorio;

    @Basic
    @Column(name = "NAO_AJUSTA_FONTE", table = "SMAARQUI")
    private String naoAjustaFonte;

    @Basic
    @Column(name = "NAO_AJUSTA_SIZE", table = "SMAARQUI")
    private String naoAjustaSize;

    @Basic
    @Column(name = "NAO_AJUSTA_ALTURA", table = "SMAARQUI")
    private String naoAjustaAltura;

    @Basic
    @Column(name = "REPLICA", table = "SMAARQUI")
    private String replica;
}