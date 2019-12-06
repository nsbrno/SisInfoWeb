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
@Table(name = "SMAARQUI")
public class SmaarquiEntity {

    @Id
    @Column(name = "ID_SMAARQUI", table = "SMAARQUI", nullable = false)
    private Integer idSmaarqui;

    @Basic
    @Column(name = "ID_SMADEPTO", table = "SMAARQUI")
    private Integer idSmadepto;

    @Basic(optional = false)
    @Column(name = "ID_SMAMODUL", table = "SMAARQUI", nullable = false)
    private int idSmamodul;

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
    private int copias;

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
    private int fonteRelatSize;

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

    public Integer getIdSmaarqui() {
        return idSmaarqui;
    }

    public void setIdSmaarqui(Integer idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
    }

    public Integer getIdSmadepto() {
        return idSmadepto;
    }

    public void setIdSmadepto(Integer idSmadepto) {
        this.idSmadepto = idSmadepto;
    }

    public int getIdSmamodul() {
        return idSmamodul;
    }

    public void setIdSmamodul(int idSmamodul) {
        this.idSmamodul = idSmamodul;
    }

    public Integer getIdSmagrupo() {
        return idSmagrupo;
    }

    public void setIdSmagrupo(Integer idSmagrupo) {
        this.idSmagrupo = idSmagrupo;
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

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogAlteracao() {
        return logAlteracao;
    }

    public void setLogAlteracao(String logAlteracao) {
        this.logAlteracao = logAlteracao;
    }

    public String getLogExclusao() {
        return logExclusao;
    }

    public void setLogExclusao(String logExclusao) {
        this.logExclusao = logExclusao;
    }

    public String getLogImpressao() {
        return logImpressao;
    }

    public void setLogImpressao(String logImpressao) {
        this.logImpressao = logImpressao;
    }

    public String getSalvaTela() {
        return salvaTela;
    }

    public void setSalvaTela(String salvaTela) {
        this.salvaTela = salvaTela;
    }

    public String getSalvaIdExcluido() {
        return salvaIdExcluido;
    }

    public void setSalvaIdExcluido(String salvaIdExcluido) {
        this.salvaIdExcluido = salvaIdExcluido;
    }

    public String getAcessaComSenha() {
        return acessaComSenha;
    }

    public void setAcessaComSenha(String acessaComSenha) {
        this.acessaComSenha = acessaComSenha;
    }

    public String getComandoImpressao() {
        return comandoImpressao;
    }

    public void setComandoImpressao(String comandoImpressao) {
        this.comandoImpressao = comandoImpressao;
    }

    public String getPathImpressao() {
        return pathImpressao;
    }

    public void setPathImpressao(String pathImpressao) {
        this.pathImpressao = pathImpressao;
    }

    public String getUsuarioConfigura() {
        return usuarioConfigura;
    }

    public void setUsuarioConfigura(String usuarioConfigura) {
        this.usuarioConfigura = usuarioConfigura;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getPedeSaida() {
        return pedeSaida;
    }

    public void setPedeSaida(String pedeSaida) {
        this.pedeSaida = pedeSaida;
    }

    public String getPathLogomarca() {
        return pathLogomarca;
    }

    public void setPathLogomarca(String pathLogomarca) {
        this.pathLogomarca = pathLogomarca;
    }

    public String getImprimeSelecao() {
        return imprimeSelecao;
    }

    public void setImprimeSelecao(String imprimeSelecao) {
        this.imprimeSelecao = imprimeSelecao;
    }

    public String getImprimeLogomarca() {
        return imprimeLogomarca;
    }

    public void setImprimeLogomarca(String imprimeLogomarca) {
        this.imprimeLogomarca = imprimeLogomarca;
    }

    public double getMargemSuperior() {
        return margemSuperior;
    }

    public void setMargemSuperior(double margemSuperior) {
        this.margemSuperior = margemSuperior;
    }

    public double getMargemInferior() {
        return margemInferior;
    }

    public void setMargemInferior(double margemInferior) {
        this.margemInferior = margemInferior;
    }

    public double getMargemEsquerda() {
        return margemEsquerda;
    }

    public void setMargemEsquerda(double margemEsquerda) {
        this.margemEsquerda = margemEsquerda;
    }

    public double getMargemDireita() {
        return margemDireita;
    }

    public void setMargemDireita(double margemDireita) {
        this.margemDireita = margemDireita;
    }

    public double getAlturaPapel() {
        return alturaPapel;
    }

    public void setAlturaPapel(double alturaPapel) {
        this.alturaPapel = alturaPapel;
    }

    public double getLarguraPapel() {
        return larguraPapel;
    }

    public void setLarguraPapel(double larguraPapel) {
        this.larguraPapel = larguraPapel;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }

    public String getImprimeMatricial() {
        return imprimeMatricial;
    }

    public void setImprimeMatricial(String imprimeMatricial) {
        this.imprimeMatricial = imprimeMatricial;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
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

    public String getEscolheRelatorio() {
        return escolheRelatorio;
    }

    public void setEscolheRelatorio(String escolheRelatorio) {
        this.escolheRelatorio = escolheRelatorio;
    }

    public String getNaoAjustaFonte() {
        return naoAjustaFonte;
    }

    public void setNaoAjustaFonte(String naoAjustaFonte) {
        this.naoAjustaFonte = naoAjustaFonte;
    }

    public String getNaoAjustaSize() {
        return naoAjustaSize;
    }

    public void setNaoAjustaSize(String naoAjustaSize) {
        this.naoAjustaSize = naoAjustaSize;
    }

    public String getNaoAjustaAltura() {
        return naoAjustaAltura;
    }

    public void setNaoAjustaAltura(String naoAjustaAltura) {
        this.naoAjustaAltura = naoAjustaAltura;
    }

    public String getReplica() {
        return replica;
    }

    public void setReplica(String replica) {
        this.replica = replica;
    }

}