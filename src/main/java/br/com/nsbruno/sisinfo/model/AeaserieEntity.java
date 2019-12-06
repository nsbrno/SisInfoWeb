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
@Table(name = "AEASERIE")
public class AeaserieEntity {

    @Id
    @Column(name = "ID_AEASERIE", table = "AEASERIE", nullable = false)
    private Integer idAeaserie;

    @Basic
    @Column(name = "ID_AEAECFTB", table = "AEASERIE")
    private Integer idAeaecftb;

    @Basic
    @Column(name = "ID_AEASERIE_GRANDE", table = "AEASERIE")
    private Integer idAeaserieGrande;

    @Basic(optional = false)
    @Column(name = "ID_AEAMODDF", table = "AEASERIE", nullable = false)
    private int idAeamoddf;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEASERIE", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_AEALOCES", table = "AEASERIE")
    private Integer idAealoces;

    @Basic
    @Column(name = "ID_SMAARQUI_ENTRADA", table = "AEASERIE")
    private Integer idSmaarquiEntrada;

    @Basic
    @Column(name = "ID_SMAARQUI_SAIDA", table = "AEASERIE")
    private Integer idSmaarquiSaida;

    @Basic
    @Column(name = "ID_SMAARQUI_SEPAR", table = "AEASERIE")
    private Integer idSmaarquiSepar;

    @Basic
    @Column(name = "ID_SMARELAT_ENTRADA", table = "AEASERIE")
    private Integer idSmarelatEntrada;

    @Basic
    @Column(name = "ID_SMARELAT_SAIDA", table = "AEASERIE")
    private Integer idSmarelatSaida;

    @Basic
    @Column(name = "ID_SMARELAT_SEPAR", table = "AEASERIE")
    private Integer idSmarelatSepar;

    @Basic
    @Column(name = "ID_CFANATOP_CF_NF_INT", table = "AEASERIE")
    private Integer idCfanatopCfNfInt;

    @Basic
    @Column(name = "ID_CFANATOP_CF_NF_EXT", table = "AEASERIE")
    private Integer idCfanatopCfNfExt;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEASERIE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEASERIE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEASERIE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEASERIE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEASERIE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "AEASERIE", nullable = false)
    private String tipo;

    @Basic(optional = false)
    @Column(name = "SERIE", table = "AEASERIE", nullable = false, length = 3)
    private String serie;

    @Basic
    @Column(name = "SUBSERIE", table = "AEASERIE", length = 2)
    private String subserie;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEASERIE", nullable = false, length = 3)
    private String codigo;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEASERIE", nullable = false)
    private int numero;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEASERIE", nullable = false)
    private String ativo;

    @Basic
    @Column(name = "TIPO_BAIXA", table = "AEASERIE")
    private String tipoBaixa;

    @Basic(optional = false)
    @Column(name = "VISTA_PRAZO", table = "AEASERIE", nullable = false)
    private String vistaPrazo;

    @Basic(optional = false)
    @Column(name = "ATACADO_VAREJO", table = "AEASERIE", nullable = false)
    private String atacadoVarejo;

    @Basic(optional = false)
    @Column(name = "PESSOA", table = "AEASERIE", nullable = false)
    private String pessoa;

    @Basic(optional = false)
    @Column(name = "ECF", table = "AEASERIE", nullable = false)
    private String ecf;

    @Basic(optional = false)
    @Column(name = "LINHAS_ANTES_BODY", table = "AEASERIE", nullable = false)
    private int linhasAntesBody;

    @Basic(optional = false)
    @Column(name = "LINHAS_BODY", table = "AEASERIE", nullable = false)
    private int linhasBody;

    @Basic(optional = false)
    @Column(name = "LINHAS_DEPOIS_BODY", table = "AEASERIE", nullable = false)
    private int linhasDepoisBody;

    @Basic
    @Column(name = "DISPOSITIVO", table = "AEASERIE", length = 128)
    private String dispositivo;

    @Basic
    @Column(name = "GERA_DOCUMENTO", table = "AEASERIE", length = 5)
    private String geraDocumento;

    @Basic
    @Column(name = "TIPO_EXCESSAO", table = "AEASERIE")
    private String tipoExcessao;

    @Basic(optional = false)
    @Column(name = "QTDE_EXCESSOES", table = "AEASERIE", nullable = false)
    private int qtdeExcessoes;

    @Basic
    @Column(name = "MODELO_ECF", table = "AEASERIE", length = 20)
    private String modeloEcf;

    @Basic
    @Column(name = "GERA_IMPRIME", table = "AEASERIE")
    private String geraImprime;

    @Basic
    @Column(name = "CHECA_LINHAS", table = "AEASERIE")
    private String checaLinhas;

    @Basic
    @Column(name = "TRAVA_ESTOQUE", table = "AEASERIE")
    private String travaEstoque;

    @Basic
    @Column(name = "PATHDBF", table = "AEASERIE", length = 128)
    private String pathdbf;

    @Basic
    @Column(name = "SOMENTE_UF_LOCAL", table = "AEASERIE")
    private String somenteUfLocal;

    @Basic
    @Column(name = "ULTIMONSU", table = "AEASERIE", length = 20)
    private String ultimonsu;

    @Basic
    @Column(name = "AJUSTA_CENTAVOS", table = "AEASERIE")
    private String ajustaCentavos;

    @Basic
    @Column(name = "TIPO_SAIDA", table = "AEASERIE")
    private String tipoSaida;

    @Basic
    @Column(name = "REPOE_PERDAS_IND", table = "AEASERIE")
    private String repoePerdasInd;

    @Basic
    @Column(name = "SEM_VALIDACAO", table = "AEASERIE")
    private String semValidacao;

    @Basic
    @Column(name = "PERMITE_FRETE", table = "AEASERIE")
    private String permiteFrete;

    public Integer getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(Integer idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdAeaecftb() {
        return idAeaecftb;
    }

    public void setIdAeaecftb(Integer idAeaecftb) {
        this.idAeaecftb = idAeaecftb;
    }

    public Integer getIdAeaserieGrande() {
        return idAeaserieGrande;
    }

    public void setIdAeaserieGrande(Integer idAeaserieGrande) {
        this.idAeaserieGrande = idAeaserieGrande;
    }

    public int getIdAeamoddf() {
        return idAeamoddf;
    }

    public void setIdAeamoddf(int idAeamoddf) {
        this.idAeamoddf = idAeamoddf;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAealoces() {
        return idAealoces;
    }

    public void setIdAealoces(Integer idAealoces) {
        this.idAealoces = idAealoces;
    }

    public Integer getIdSmaarquiEntrada() {
        return idSmaarquiEntrada;
    }

    public void setIdSmaarquiEntrada(Integer idSmaarquiEntrada) {
        this.idSmaarquiEntrada = idSmaarquiEntrada;
    }

    public Integer getIdSmaarquiSaida() {
        return idSmaarquiSaida;
    }

    public void setIdSmaarquiSaida(Integer idSmaarquiSaida) {
        this.idSmaarquiSaida = idSmaarquiSaida;
    }

    public Integer getIdSmaarquiSepar() {
        return idSmaarquiSepar;
    }

    public void setIdSmaarquiSepar(Integer idSmaarquiSepar) {
        this.idSmaarquiSepar = idSmaarquiSepar;
    }

    public Integer getIdSmarelatEntrada() {
        return idSmarelatEntrada;
    }

    public void setIdSmarelatEntrada(Integer idSmarelatEntrada) {
        this.idSmarelatEntrada = idSmarelatEntrada;
    }

    public Integer getIdSmarelatSaida() {
        return idSmarelatSaida;
    }

    public void setIdSmarelatSaida(Integer idSmarelatSaida) {
        this.idSmarelatSaida = idSmarelatSaida;
    }

    public Integer getIdSmarelatSepar() {
        return idSmarelatSepar;
    }

    public void setIdSmarelatSepar(Integer idSmarelatSepar) {
        this.idSmarelatSepar = idSmarelatSepar;
    }

    public Integer getIdCfanatopCfNfInt() {
        return idCfanatopCfNfInt;
    }

    public void setIdCfanatopCfNfInt(Integer idCfanatopCfNfInt) {
        this.idCfanatopCfNfInt = idCfanatopCfNfInt;
    }

    public Integer getIdCfanatopCfNfExt() {
        return idCfanatopCfNfExt;
    }

    public void setIdCfanatopCfNfExt(Integer idCfanatopCfNfExt) {
        this.idCfanatopCfNfExt = idCfanatopCfNfExt;
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

    public String getSubserie() {
        return subserie;
    }

    public void setSubserie(String subserie) {
        this.subserie = subserie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getTipoBaixa() {
        return tipoBaixa;
    }

    public void setTipoBaixa(String tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public String getVistaPrazo() {
        return vistaPrazo;
    }

    public void setVistaPrazo(String vistaPrazo) {
        this.vistaPrazo = vistaPrazo;
    }

    public String getAtacadoVarejo() {
        return atacadoVarejo;
    }

    public void setAtacadoVarejo(String atacadoVarejo) {
        this.atacadoVarejo = atacadoVarejo;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getEcf() {
        return ecf;
    }

    public void setEcf(String ecf) {
        this.ecf = ecf;
    }

    public int getLinhasAntesBody() {
        return linhasAntesBody;
    }

    public void setLinhasAntesBody(int linhasAntesBody) {
        this.linhasAntesBody = linhasAntesBody;
    }

    public int getLinhasBody() {
        return linhasBody;
    }

    public void setLinhasBody(int linhasBody) {
        this.linhasBody = linhasBody;
    }

    public int getLinhasDepoisBody() {
        return linhasDepoisBody;
    }

    public void setLinhasDepoisBody(int linhasDepoisBody) {
        this.linhasDepoisBody = linhasDepoisBody;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getGeraDocumento() {
        return geraDocumento;
    }

    public void setGeraDocumento(String geraDocumento) {
        this.geraDocumento = geraDocumento;
    }

    public String getTipoExcessao() {
        return tipoExcessao;
    }

    public void setTipoExcessao(String tipoExcessao) {
        this.tipoExcessao = tipoExcessao;
    }

    public int getQtdeExcessoes() {
        return qtdeExcessoes;
    }

    public void setQtdeExcessoes(int qtdeExcessoes) {
        this.qtdeExcessoes = qtdeExcessoes;
    }

    public String getModeloEcf() {
        return modeloEcf;
    }

    public void setModeloEcf(String modeloEcf) {
        this.modeloEcf = modeloEcf;
    }

    public String getGeraImprime() {
        return geraImprime;
    }

    public void setGeraImprime(String geraImprime) {
        this.geraImprime = geraImprime;
    }

    public String getChecaLinhas() {
        return checaLinhas;
    }

    public void setChecaLinhas(String checaLinhas) {
        this.checaLinhas = checaLinhas;
    }

    public String getTravaEstoque() {
        return travaEstoque;
    }

    public void setTravaEstoque(String travaEstoque) {
        this.travaEstoque = travaEstoque;
    }

    public String getPathdbf() {
        return pathdbf;
    }

    public void setPathdbf(String pathdbf) {
        this.pathdbf = pathdbf;
    }

    public String getSomenteUfLocal() {
        return somenteUfLocal;
    }

    public void setSomenteUfLocal(String somenteUfLocal) {
        this.somenteUfLocal = somenteUfLocal;
    }

    public String getUltimonsu() {
        return ultimonsu;
    }

    public void setUltimonsu(String ultimonsu) {
        this.ultimonsu = ultimonsu;
    }

    public String getAjustaCentavos() {
        return ajustaCentavos;
    }

    public void setAjustaCentavos(String ajustaCentavos) {
        this.ajustaCentavos = ajustaCentavos;
    }

    public String getTipoSaida() {
        return tipoSaida;
    }

    public void setTipoSaida(String tipoSaida) {
        this.tipoSaida = tipoSaida;
    }

    public String getRepoePerdasInd() {
        return repoePerdasInd;
    }

    public void setRepoePerdasInd(String repoePerdasInd) {
        this.repoePerdasInd = repoePerdasInd;
    }

    public String getSemValidacao() {
        return semValidacao;
    }

    public void setSemValidacao(String semValidacao) {
        this.semValidacao = semValidacao;
    }

    public String getPermiteFrete() {
        return permiteFrete;
    }

    public void setPermiteFrete(String permiteFrete) {
        this.permiteFrete = permiteFrete;
    }

}