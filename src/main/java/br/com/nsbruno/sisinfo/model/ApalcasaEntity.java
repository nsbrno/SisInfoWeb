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
@Table(name = "APALCASA")
public class ApalcasaEntity {

    @Id
    @Column(name = "ID_APALCASA", table = "APALCASA", nullable = false)
    private Integer idApalcasa;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APALCASA")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_APACOMUN", table = "APALCASA")
    private Integer idApacomun;

    @Basic
    @Column(name = "ID_CFACIDAD_NOIVO", table = "APALCASA")
    private Integer idCfacidadNoivo;

    @Basic
    @Column(name = "ID_CFAESTAD_NOIVO", table = "APALCASA")
    private Integer idCfaestadNoivo;

    @Basic
    @Column(name = "ID_CFACIDAD_NOIVA", table = "APALCASA")
    private Integer idCfacidadNoiva;

    @Basic
    @Column(name = "ID_CFAESTAD_NOIVA", table = "APALCASA")
    private Integer idCfaestadNoiva;

    @Basic
    @Column(name = "ID_CFACIDAD_MORAR", table = "APALCASA")
    private Integer idCfacidadMorar;

    @Basic
    @Column(name = "ID_CFAESTAD_MORAR", table = "APALCASA")
    private Integer idCfaestadMorar;

    @Basic
    @Column(name = "ID_CFAESTAD_CIVIL_CARTOR", table = "APALCASA")
    private Integer idCfaestadCivilCartor;

    @Basic
    @Column(name = "ID_CFACIDAD_CIVIL_CARTOR", table = "APALCASA")
    private Integer idCfacidadCivilCartor;

    @Basic
    @Column(name = "ID_CFAESTAD_TESTEMUNHA1", table = "APALCASA")
    private Integer idCfaestadTestemunha1;

    @Basic
    @Column(name = "ID_CFACIDAD_TESTEMUNHA1", table = "APALCASA")
    private Integer idCfacidadTestemunha1;

    @Basic
    @Column(name = "ID_CFAESTAD_TESTEMUNHA2", table = "APALCASA")
    private Integer idCfaestadTestemunha2;

    @Basic
    @Column(name = "ID_CFACIDAD_TESTEMUNHA2", table = "APALCASA")
    private Integer idCfacidadTestemunha2;

    @Basic
    @Column(name = "ID_CFACLIFO_DIOCE", table = "APALCASA")
    private Integer idCfaclifoDioce;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APALCASA")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "APALCASA")
    private Integer idCfaclifoComun;

    @Basic(optional = false)
    @Column(name = "US_CAD", table = "APALCASA", nullable = false, length = 20)
    private String usCad;

    @Basic(optional = false)
    @Column(name = "DT_CAD", table = "APALCASA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic(optional = false)
    @Column(name = "DT_ALT", table = "APALCASA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APALCASA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APALCASA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DT_HR_CASAMENTO", table = "APALCASA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtHrCasamento;

    @Basic
    @Column(name = "LIVRO", table = "APALCASA")
    private Integer livro;

    @Basic
    @Column(name = "FOLHA", table = "APALCASA")
    private Integer folha;

    @Basic
    @Column(name = "TERMO", table = "APALCASA")
    private Integer termo;

    @Basic
    @Column(name = "NOIVA_NOME", table = "APALCASA", length = 40)
    private String noivaNome;

    @Basic
    @Column(name = "NOIVA_NATURAL", table = "APALCASA", length = 40)
    private String noivaNatural;

    @Basic(optional = false)
    @Column(name = "NOIVA_IDADE", table = "APALCASA", nullable = false)
    private int noivaIdade;

    @Basic
    @Column(name = "NOIVA_BATIZADA", table = "APALCASA", length = 40)
    private String noivaBatizada;

    @Basic
    @Column(name = "NOIVA_PROF", table = "APALCASA", length = 40)
    private String noivaProf;

    @Basic
    @Column(name = "NOIVA_PAI", table = "APALCASA", length = 60)
    private String noivaPai;

    @Basic
    @Column(name = "NOIVA_MAE", table = "APALCASA", length = 60)
    private String noivaMae;

    @Basic
    @Column(name = "NOIVA_RESIDENTE", table = "APALCASA", length = 40)
    private String noivaResidente;

    @Basic
    @Column(name = "NOIVA_BAIRRO", table = "APALCASA", length = 40)
    private String noivaBairro;

    @Basic
    @Column(name = "NOIVA_BATIZ_COMO", table = "APALCASA")
    private String noivaBatizComo;

    @Basic
    @Column(name = "NOIVA_BATIZ_LIVRO", table = "APALCASA")
    private Integer noivaBatizLivro;

    @Basic
    @Column(name = "NOIVA_BATIZ_FOLHA", table = "APALCASA")
    private Integer noivaBatizFolha;

    @Basic
    @Column(name = "NOIVA_BATIZ_TERMO", table = "APALCASA")
    private Integer noivaBatizTermo;

    @Basic
    @Column(name = "NOIVA_PERGUNTA1", table = "APALCASA", length = 128)
    private String noivaPergunta1;

    @Basic
    @Column(name = "NOIVA_PERGUNTA2", table = "APALCASA", length = 128)
    private String noivaPergunta2;

    @Basic
    @Column(name = "NOIVA_PERGUNTA3", table = "APALCASA", length = 128)
    private String noivaPergunta3;

    @Basic
    @Column(name = "NOIVA_PERGUNTA4", table = "APALCASA", length = 128)
    private String noivaPergunta4;

    @Basic
    @Column(name = "NOIVA_PERGUNTA5", table = "APALCASA", length = 128)
    private String noivaPergunta5;

    @Basic
    @Column(name = "NOIVA_PERGUNTA6", table = "APALCASA", length = 128)
    private String noivaPergunta6;

    @Basic
    @Column(name = "NOIVA_SUPLETIVO", table = "APALCASA")
    private String noivaSupletivo;

    @Basic
    @Column(name = "NOIVA_SUPLE_JURADO", table = "APALCASA", length = 60)
    private String noivaSupleJurado;

    @Basic
    @Column(name = "NOIVA_SUPLE_TESTEMUNHA1", table = "APALCASA", length = 60)
    private String noivaSupleTestemunha1;

    @Basic
    @Column(name = "NOIVA_SUPLE_TESTEMUNHA2", table = "APALCASA", length = 60)
    private String noivaSupleTestemunha2;

    @Basic
    @Column(name = "NOIVA_SUPLE_PADRE", table = "APALCASA", length = 60)
    private String noivaSuplePadre;

    @Basic
    @Column(name = "NOIVA_EST_CIVIL", table = "APALCASA")
    private String noivaEstCivil;

    @Basic
    @Column(name = "NOIVA_DT_BATISMO", table = "APALCASA")
    @Temporal(TemporalType.DATE)
    private Date noivaDtBatismo;

    @Basic
    @Column(name = "NOIVA_BATIZ_PAROQ", table = "APALCASA", length = 40)
    private String noivaBatizParoq;

    @Basic
    @Column(name = "NOIVA_BATIZ_DIOCESE", table = "APALCASA", length = 40)
    private String noivaBatizDiocese;

    @Basic
    @Column(name = "NOIVA_PAIS_RESIDENTES", table = "APALCASA", length = 128)
    private String noivaPaisResidentes;

    @Basic
    @Column(name = "NOIVA_MAE_NATURAL", table = "APALCASA", length = 40)
    private String noivaMaeNatural;

    @Basic
    @Column(name = "NOIVA_PAI_NATURAL", table = "APALCASA", length = 40)
    private String noivaPaiNatural;

    @Basic
    @Column(name = "NOIVA_RESIDE_PAROQ", table = "APALCASA", length = 128)
    private String noivaResideParoq;

    @Basic
    @Column(name = "NOIVO_NOME", table = "APALCASA", length = 60)
    private String noivoNome;

    @Basic
    @Column(name = "NOIVO_DT_NASCIMENTO", table = "APALCASA")
    @Temporal(TemporalType.DATE)
    private Date noivoDtNascimento;

    @Basic
    @Column(name = "NOIVO_NATURAL", table = "APALCASA", length = 40)
    private String noivoNatural;

    @Basic(optional = false)
    @Column(name = "NOIVO_IDADE", table = "APALCASA", nullable = false)
    private int noivoIdade;

    @Basic
    @Column(name = "NOIVO_BATIZADO", table = "APALCASA", length = 40)
    private String noivoBatizado;

    @Basic
    @Column(name = "NOIVO_PROF", table = "APALCASA", length = 40)
    private String noivoProf;

    @Basic
    @Column(name = "NOIVO_PAI", table = "APALCASA", length = 60)
    private String noivoPai;

    @Basic
    @Column(name = "NOIVO_MAE", table = "APALCASA", length = 60)
    private String noivoMae;

    @Basic
    @Column(name = "NOIVO_RESIDENTE", table = "APALCASA", length = 40)
    private String noivoResidente;

    @Basic
    @Column(name = "NOIVO_BAIRRO", table = "APALCASA", length = 40)
    private String noivoBairro;

    @Basic
    @Column(name = "NOIVO_BATIZ_COMO", table = "APALCASA")
    private String noivoBatizComo;

    @Basic
    @Column(name = "NOIVO_BATIZ_LIVRO", table = "APALCASA")
    private Integer noivoBatizLivro;

    @Basic
    @Column(name = "NOIVO_BATIZ_FOLHA", table = "APALCASA")
    private Integer noivoBatizFolha;

    @Basic
    @Column(name = "NOIVO_BATIZ_TERMO", table = "APALCASA")
    private Integer noivoBatizTermo;

    @Basic
    @Column(name = "NOIVO_PERGUNTA1", table = "APALCASA", length = 128)
    private String noivoPergunta1;

    @Basic
    @Column(name = "NOIVO_PERGUNTA2", table = "APALCASA", length = 128)
    private String noivoPergunta2;

    @Basic
    @Column(name = "NOIVO_PERGUNTA3", table = "APALCASA", length = 128)
    private String noivoPergunta3;

    @Basic
    @Column(name = "NOIVO_PERGUNTA4", table = "APALCASA", length = 128)
    private String noivoPergunta4;

    @Basic
    @Column(name = "NOIVO_PERGUNTA5", table = "APALCASA", length = 128)
    private String noivoPergunta5;

    @Basic
    @Column(name = "NOIVO_PERGUNTA6", table = "APALCASA", length = 128)
    private String noivoPergunta6;

    @Basic
    @Column(name = "NOIVO_SUPLETIVO", table = "APALCASA")
    private String noivoSupletivo;

    @Basic
    @Column(name = "NOIVO_SUPLETIVO_JURADO", table = "APALCASA", length = 60)
    private String noivoSupletivoJurado;

    @Basic
    @Column(name = "NOIVO_SUPLE_TESTEMUNHA1", table = "APALCASA", length = 60)
    private String noivoSupleTestemunha1;

    @Basic
    @Column(name = "NOIVO_SUPLE_TESTEMUNHA2", table = "APALCASA", length = 60)
    private String noivoSupleTestemunha2;

    @Basic
    @Column(name = "NOIVO_SUPLE_PADRE", table = "APALCASA", length = 60)
    private String noivoSuplePadre;

    @Basic
    @Column(name = "NOIVO_ESTAD_CIVIL", table = "APALCASA")
    private String noivoEstadCivil;

    @Basic
    @Column(name = "NOIVO_DT_BATIZMO", table = "APALCASA")
    @Temporal(TemporalType.DATE)
    private Date noivoDtBatizmo;

    @Basic
    @Column(name = "NOIVO_BATIZ_PAROQ", table = "APALCASA", length = 40)
    private String noivoBatizParoq;

    @Basic
    @Column(name = "NOIVO_BATIZ_DICESE", table = "APALCASA", length = 40)
    private String noivoBatizDicese;

    @Basic
    @Column(name = "NOIVO_PAIS_RESIDENTES", table = "APALCASA", length = 128)
    private String noivoPaisResidentes;

    @Basic
    @Column(name = "NOIVO_MAE_NATURAL", table = "APALCASA", length = 40)
    private String noivoMaeNatural;

    @Basic
    @Column(name = "NOIVO_PAI_NATURAL", table = "APALCASA", length = 40)
    private String noivoPaiNatural;

    @Basic
    @Column(name = "NOIVO_RESID_PAROQ", table = "APALCASA", length = 128)
    private String noivoResidParoq;

    @Basic
    @Column(name = "PADRE_NOME", table = "APALCASA", length = 60)
    private String padreNome;

    @Basic
    @Column(name = "TESTEMUNHA1", table = "APALCASA", length = 60)
    private String testemunha1;

    @Basic
    @Column(name = "TESTEMUNHA2", table = "APALCASA", length = 60)
    private String testemunha2;

    @Lob
    @Basic
    @Column(name = "TESTEMUNHAS", table = "APALCASA")
    private byte[] testemunhas;

    @Basic(optional = false)
    @Column(name = "IMPRESSOES", table = "APALCASA", nullable = false)
    private int impressoes;

    @Basic
    @Column(name = "DT_DIALOGO", table = "APALCASA")
    @Temporal(TemporalType.DATE)
    private Date dtDialogo;

    @Basic
    @Column(name = "COMUNIDADE_FREQ", table = "APALCASA", length = 40)
    private String comunidadeFreq;

    @Basic
    @Column(name = "BISPO_NOME", table = "APALCASA", length = 60)
    private String bispoNome;

    @Basic
    @Column(name = "SITUACAO_PROCESSO", table = "APALCASA")
    private String situacaoProcesso;

    @Lob
    @Basic
    @Column(name = "OBSERVACAO", table = "APALCASA")
    private byte[] observacao;

    @Basic
    @Column(name = "NOTIFICOU", table = "APALCASA")
    private String notificou;

    @Basic
    @Column(name = "CIVIL_CARTOR_NOME", table = "APALCASA", length = 60)
    private String civilCartorNome;

    @Basic
    @Column(name = "CIVIL_DT_HABILITA", table = "APALCASA")
    @Temporal(TemporalType.DATE)
    private Date civilDtHabilita;

    @Basic
    @Column(name = "CIVIL_DT_CASAMENTO", table = "APALCASA")
    @Temporal(TemporalType.DATE)
    private Date civilDtCasamento;

    @Basic
    @Column(name = "CIVIL_NOME_JUIZ", table = "APALCASA", length = 60)
    private String civilNomeJuiz;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA1", table = "APALCASA", length = 60)
    private String civilTestemunha1;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA1_EST_CIVIL", table = "APALCASA")
    private String civilTestemunha1EstCivil;

    @Basic(optional = false)
    @Column(name = "CIVIL_TESTEMUNHA1_IDADE", table = "APALCASA", nullable = false)
    private int civilTestemunha1Idade;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA_PROFISSAO", table = "APALCASA", length = 40)
    private String civilTestemunhaProfissao;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA1_RESIDENCIA", table = "APALCASA", length = 128)
    private String civilTestemunha1Residencia;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA2", table = "APALCASA", length = 60)
    private String civilTestemunha2;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA2_EST_CIVIL", table = "APALCASA")
    private String civilTestemunha2EstCivil;

    @Basic(optional = false)
    @Column(name = "CIVIL_TESTEMUNHA2_IDADE", table = "APALCASA", nullable = false)
    private int civilTestemunha2Idade;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA2_PROFISSAO", table = "APALCASA", length = 40)
    private String civilTestemunha2Profissao;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA2_RESIDENCIA", table = "APALCASA", length = 128)
    private String civilTestemunha2Residencia;

    @Basic
    @Column(name = "CIVIL_NOME_NOIVA", table = "APALCASA", length = 60)
    private String civilNomeNoiva;

    @Basic
    @Column(name = "REGIME_CASA", table = "APALCASA", length = 128)
    private String regimeCasa;

    @Lob
    @Basic
    @Column(name = "DISPENSA_DESPACHO", table = "APALCASA")
    private byte[] dispensaDespacho;

    @Basic
    @Column(name = "DISPENSA_CONSAGUIDADE_GRAU", table = "APALCASA", length = 128)
    private String dispensaConsaguidadeGrau;

    @Basic
    @Column(name = "DISPENSA_DE_ITEN_IV", table = "APALCASA", length = 128)
    private String dispensaDeItenIv;

    @Basic
    @Column(name = "DISPENSA_MOTIVO", table = "APALCASA", length = 128)
    private String dispensaMotivo;

    @Basic
    @Column(name = "NOIVA_DT_NASCIMENTO", table = "APALCASA")
    @Temporal(TemporalType.DATE)
    private Date noivaDtNascimento;

    @Basic
    @Column(name = "DIOCESE_TRANSFERIDA", table = "APALCASA", length = 40)
    private String dioceseTransferida;

    @Basic
    @Column(name = "PAROQUIATRANSFERIDA", table = "APALCASA", length = 40)
    private String paroquiatransferida;

    @Basic
    @Column(name = "COMUNIDADE_TRANSFERIDA", table = "APALCASA", length = 40)
    private String comunidadeTransferida;

    @Basic
    @Column(name = "PAROCO", table = "APALCASA", length = 60)
    private String paroco;

    @Basic
    @Column(name = "NOIVA_PAROQ_RESID_PERIODO", table = "APALCASA", length = 40)
    private String noivaParoqResidPeriodo;

    @Basic
    @Column(name = "NOIVO_PAROQ_RESID_PERIODO", table = "APALCASA", length = 40)
    private String noivoParoqResidPeriodo;

    @Basic
    @Column(name = "NOIVO_SACRAMENTO", table = "APALCASA", length = 5)
    private String noivoSacramento;

    @Basic
    @Column(name = "NOIVA_SACRAMENTO", table = "APALCASA", length = 5)
    private String noivaSacramento;

    @Basic
    @Column(name = "EVANGELICO", table = "APALCASA", length = 6)
    private String evangelico;

    @Lob
    @Basic
    @Column(name = "OBS_ANULACAO", table = "APALCASA")
    private byte[] obsAnulacao;

    @Basic
    @Column(name = "NOIVA_CPF", table = "APALCASA", length = 18)
    private String noivaCpf;

    @Basic
    @Column(name = "NOIVA_RG", table = "APALCASA", length = 18)
    private String noivaRg;

    @Basic
    @Column(name = "NOIVO_CPF", table = "APALCASA", length = 18)
    private String noivoCpf;

    @Basic
    @Column(name = "NOIVO_RG", table = "APALCASA", length = 18)
    private String noivoRg;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA1_CPF", table = "APALCASA", length = 18)
    private String civilTestemunha1Cpf;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA1_RG", table = "APALCASA", length = 18)
    private String civilTestemunha1Rg;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA2_CPF", table = "APALCASA", length = 18)
    private String civilTestemunha2Cpf;

    @Basic
    @Column(name = "CIVIL_TESTEMUNHA2_RG", table = "APALCASA", length = 18)
    private String civilTestemunha2Rg;

    @Basic
    @Column(name = "ID_APANEGAT", table = "APALCASA")
    private Integer idApanegat;

    public Integer getIdApalcasa() {
        return idApalcasa;
    }

    public void setIdApalcasa(Integer idApalcasa) {
        this.idApalcasa = idApalcasa;
    }

    public Integer getIdApaparoq() {
        return idApaparoq;
    }

    public void setIdApaparoq(Integer idApaparoq) {
        this.idApaparoq = idApaparoq;
    }

    public Integer getIdApacomun() {
        return idApacomun;
    }

    public void setIdApacomun(Integer idApacomun) {
        this.idApacomun = idApacomun;
    }

    public Integer getIdCfacidadNoivo() {
        return idCfacidadNoivo;
    }

    public void setIdCfacidadNoivo(Integer idCfacidadNoivo) {
        this.idCfacidadNoivo = idCfacidadNoivo;
    }

    public Integer getIdCfaestadNoivo() {
        return idCfaestadNoivo;
    }

    public void setIdCfaestadNoivo(Integer idCfaestadNoivo) {
        this.idCfaestadNoivo = idCfaestadNoivo;
    }

    public Integer getIdCfacidadNoiva() {
        return idCfacidadNoiva;
    }

    public void setIdCfacidadNoiva(Integer idCfacidadNoiva) {
        this.idCfacidadNoiva = idCfacidadNoiva;
    }

    public Integer getIdCfaestadNoiva() {
        return idCfaestadNoiva;
    }

    public void setIdCfaestadNoiva(Integer idCfaestadNoiva) {
        this.idCfaestadNoiva = idCfaestadNoiva;
    }

    public Integer getIdCfacidadMorar() {
        return idCfacidadMorar;
    }

    public void setIdCfacidadMorar(Integer idCfacidadMorar) {
        this.idCfacidadMorar = idCfacidadMorar;
    }

    public Integer getIdCfaestadMorar() {
        return idCfaestadMorar;
    }

    public void setIdCfaestadMorar(Integer idCfaestadMorar) {
        this.idCfaestadMorar = idCfaestadMorar;
    }

    public Integer getIdCfaestadCivilCartor() {
        return idCfaestadCivilCartor;
    }

    public void setIdCfaestadCivilCartor(Integer idCfaestadCivilCartor) {
        this.idCfaestadCivilCartor = idCfaestadCivilCartor;
    }

    public Integer getIdCfacidadCivilCartor() {
        return idCfacidadCivilCartor;
    }

    public void setIdCfacidadCivilCartor(Integer idCfacidadCivilCartor) {
        this.idCfacidadCivilCartor = idCfacidadCivilCartor;
    }

    public Integer getIdCfaestadTestemunha1() {
        return idCfaestadTestemunha1;
    }

    public void setIdCfaestadTestemunha1(Integer idCfaestadTestemunha1) {
        this.idCfaestadTestemunha1 = idCfaestadTestemunha1;
    }

    public Integer getIdCfacidadTestemunha1() {
        return idCfacidadTestemunha1;
    }

    public void setIdCfacidadTestemunha1(Integer idCfacidadTestemunha1) {
        this.idCfacidadTestemunha1 = idCfacidadTestemunha1;
    }

    public Integer getIdCfaestadTestemunha2() {
        return idCfaestadTestemunha2;
    }

    public void setIdCfaestadTestemunha2(Integer idCfaestadTestemunha2) {
        this.idCfaestadTestemunha2 = idCfaestadTestemunha2;
    }

    public Integer getIdCfacidadTestemunha2() {
        return idCfacidadTestemunha2;
    }

    public void setIdCfacidadTestemunha2(Integer idCfacidadTestemunha2) {
        this.idCfacidadTestemunha2 = idCfacidadTestemunha2;
    }

    public Integer getIdCfaclifoDioce() {
        return idCfaclifoDioce;
    }

    public void setIdCfaclifoDioce(Integer idCfaclifoDioce) {
        this.idCfaclifoDioce = idCfaclifoDioce;
    }

    public Integer getIdCfaclifoParoq() {
        return idCfaclifoParoq;
    }

    public void setIdCfaclifoParoq(Integer idCfaclifoParoq) {
        this.idCfaclifoParoq = idCfaclifoParoq;
    }

    public Integer getIdCfaclifoComun() {
        return idCfaclifoComun;
    }

    public void setIdCfaclifoComun(Integer idCfaclifoComun) {
        this.idCfaclifoComun = idCfaclifoComun;
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Date getDtHrCasamento() {
        return dtHrCasamento;
    }

    public void setDtHrCasamento(Date dtHrCasamento) {
        this.dtHrCasamento = dtHrCasamento;
    }

    public Integer getLivro() {
        return livro;
    }

    public void setLivro(Integer livro) {
        this.livro = livro;
    }

    public Integer getFolha() {
        return folha;
    }

    public void setFolha(Integer folha) {
        this.folha = folha;
    }

    public Integer getTermo() {
        return termo;
    }

    public void setTermo(Integer termo) {
        this.termo = termo;
    }

    public String getNoivaNome() {
        return noivaNome;
    }

    public void setNoivaNome(String noivaNome) {
        this.noivaNome = noivaNome;
    }

    public String getNoivaNatural() {
        return noivaNatural;
    }

    public void setNoivaNatural(String noivaNatural) {
        this.noivaNatural = noivaNatural;
    }

    public int getNoivaIdade() {
        return noivaIdade;
    }

    public void setNoivaIdade(int noivaIdade) {
        this.noivaIdade = noivaIdade;
    }

    public String getNoivaBatizada() {
        return noivaBatizada;
    }

    public void setNoivaBatizada(String noivaBatizada) {
        this.noivaBatizada = noivaBatizada;
    }

    public String getNoivaProf() {
        return noivaProf;
    }

    public void setNoivaProf(String noivaProf) {
        this.noivaProf = noivaProf;
    }

    public String getNoivaPai() {
        return noivaPai;
    }

    public void setNoivaPai(String noivaPai) {
        this.noivaPai = noivaPai;
    }

    public String getNoivaMae() {
        return noivaMae;
    }

    public void setNoivaMae(String noivaMae) {
        this.noivaMae = noivaMae;
    }

    public String getNoivaResidente() {
        return noivaResidente;
    }

    public void setNoivaResidente(String noivaResidente) {
        this.noivaResidente = noivaResidente;
    }

    public String getNoivaBairro() {
        return noivaBairro;
    }

    public void setNoivaBairro(String noivaBairro) {
        this.noivaBairro = noivaBairro;
    }

    public String getNoivaBatizComo() {
        return noivaBatizComo;
    }

    public void setNoivaBatizComo(String noivaBatizComo) {
        this.noivaBatizComo = noivaBatizComo;
    }

    public Integer getNoivaBatizLivro() {
        return noivaBatizLivro;
    }

    public void setNoivaBatizLivro(Integer noivaBatizLivro) {
        this.noivaBatizLivro = noivaBatizLivro;
    }

    public Integer getNoivaBatizFolha() {
        return noivaBatizFolha;
    }

    public void setNoivaBatizFolha(Integer noivaBatizFolha) {
        this.noivaBatizFolha = noivaBatizFolha;
    }

    public Integer getNoivaBatizTermo() {
        return noivaBatizTermo;
    }

    public void setNoivaBatizTermo(Integer noivaBatizTermo) {
        this.noivaBatizTermo = noivaBatizTermo;
    }

    public String getNoivaPergunta1() {
        return noivaPergunta1;
    }

    public void setNoivaPergunta1(String noivaPergunta1) {
        this.noivaPergunta1 = noivaPergunta1;
    }

    public String getNoivaPergunta2() {
        return noivaPergunta2;
    }

    public void setNoivaPergunta2(String noivaPergunta2) {
        this.noivaPergunta2 = noivaPergunta2;
    }

    public String getNoivaPergunta3() {
        return noivaPergunta3;
    }

    public void setNoivaPergunta3(String noivaPergunta3) {
        this.noivaPergunta3 = noivaPergunta3;
    }

    public String getNoivaPergunta4() {
        return noivaPergunta4;
    }

    public void setNoivaPergunta4(String noivaPergunta4) {
        this.noivaPergunta4 = noivaPergunta4;
    }

    public String getNoivaPergunta5() {
        return noivaPergunta5;
    }

    public void setNoivaPergunta5(String noivaPergunta5) {
        this.noivaPergunta5 = noivaPergunta5;
    }

    public String getNoivaPergunta6() {
        return noivaPergunta6;
    }

    public void setNoivaPergunta6(String noivaPergunta6) {
        this.noivaPergunta6 = noivaPergunta6;
    }

    public String getNoivaSupletivo() {
        return noivaSupletivo;
    }

    public void setNoivaSupletivo(String noivaSupletivo) {
        this.noivaSupletivo = noivaSupletivo;
    }

    public String getNoivaSupleJurado() {
        return noivaSupleJurado;
    }

    public void setNoivaSupleJurado(String noivaSupleJurado) {
        this.noivaSupleJurado = noivaSupleJurado;
    }

    public String getNoivaSupleTestemunha1() {
        return noivaSupleTestemunha1;
    }

    public void setNoivaSupleTestemunha1(String noivaSupleTestemunha1) {
        this.noivaSupleTestemunha1 = noivaSupleTestemunha1;
    }

    public String getNoivaSupleTestemunha2() {
        return noivaSupleTestemunha2;
    }

    public void setNoivaSupleTestemunha2(String noivaSupleTestemunha2) {
        this.noivaSupleTestemunha2 = noivaSupleTestemunha2;
    }

    public String getNoivaSuplePadre() {
        return noivaSuplePadre;
    }

    public void setNoivaSuplePadre(String noivaSuplePadre) {
        this.noivaSuplePadre = noivaSuplePadre;
    }

    public String getNoivaEstCivil() {
        return noivaEstCivil;
    }

    public void setNoivaEstCivil(String noivaEstCivil) {
        this.noivaEstCivil = noivaEstCivil;
    }

    public Date getNoivaDtBatismo() {
        return noivaDtBatismo;
    }

    public void setNoivaDtBatismo(Date noivaDtBatismo) {
        this.noivaDtBatismo = noivaDtBatismo;
    }

    public String getNoivaBatizParoq() {
        return noivaBatizParoq;
    }

    public void setNoivaBatizParoq(String noivaBatizParoq) {
        this.noivaBatizParoq = noivaBatizParoq;
    }

    public String getNoivaBatizDiocese() {
        return noivaBatizDiocese;
    }

    public void setNoivaBatizDiocese(String noivaBatizDiocese) {
        this.noivaBatizDiocese = noivaBatizDiocese;
    }

    public String getNoivaPaisResidentes() {
        return noivaPaisResidentes;
    }

    public void setNoivaPaisResidentes(String noivaPaisResidentes) {
        this.noivaPaisResidentes = noivaPaisResidentes;
    }

    public String getNoivaMaeNatural() {
        return noivaMaeNatural;
    }

    public void setNoivaMaeNatural(String noivaMaeNatural) {
        this.noivaMaeNatural = noivaMaeNatural;
    }

    public String getNoivaPaiNatural() {
        return noivaPaiNatural;
    }

    public void setNoivaPaiNatural(String noivaPaiNatural) {
        this.noivaPaiNatural = noivaPaiNatural;
    }

    public String getNoivaResideParoq() {
        return noivaResideParoq;
    }

    public void setNoivaResideParoq(String noivaResideParoq) {
        this.noivaResideParoq = noivaResideParoq;
    }

    public String getNoivoNome() {
        return noivoNome;
    }

    public void setNoivoNome(String noivoNome) {
        this.noivoNome = noivoNome;
    }

    public Date getNoivoDtNascimento() {
        return noivoDtNascimento;
    }

    public void setNoivoDtNascimento(Date noivoDtNascimento) {
        this.noivoDtNascimento = noivoDtNascimento;
    }

    public String getNoivoNatural() {
        return noivoNatural;
    }

    public void setNoivoNatural(String noivoNatural) {
        this.noivoNatural = noivoNatural;
    }

    public int getNoivoIdade() {
        return noivoIdade;
    }

    public void setNoivoIdade(int noivoIdade) {
        this.noivoIdade = noivoIdade;
    }

    public String getNoivoBatizado() {
        return noivoBatizado;
    }

    public void setNoivoBatizado(String noivoBatizado) {
        this.noivoBatizado = noivoBatizado;
    }

    public String getNoivoProf() {
        return noivoProf;
    }

    public void setNoivoProf(String noivoProf) {
        this.noivoProf = noivoProf;
    }

    public String getNoivoPai() {
        return noivoPai;
    }

    public void setNoivoPai(String noivoPai) {
        this.noivoPai = noivoPai;
    }

    public String getNoivoMae() {
        return noivoMae;
    }

    public void setNoivoMae(String noivoMae) {
        this.noivoMae = noivoMae;
    }

    public String getNoivoResidente() {
        return noivoResidente;
    }

    public void setNoivoResidente(String noivoResidente) {
        this.noivoResidente = noivoResidente;
    }

    public String getNoivoBairro() {
        return noivoBairro;
    }

    public void setNoivoBairro(String noivoBairro) {
        this.noivoBairro = noivoBairro;
    }

    public String getNoivoBatizComo() {
        return noivoBatizComo;
    }

    public void setNoivoBatizComo(String noivoBatizComo) {
        this.noivoBatizComo = noivoBatizComo;
    }

    public Integer getNoivoBatizLivro() {
        return noivoBatizLivro;
    }

    public void setNoivoBatizLivro(Integer noivoBatizLivro) {
        this.noivoBatizLivro = noivoBatizLivro;
    }

    public Integer getNoivoBatizFolha() {
        return noivoBatizFolha;
    }

    public void setNoivoBatizFolha(Integer noivoBatizFolha) {
        this.noivoBatizFolha = noivoBatizFolha;
    }

    public Integer getNoivoBatizTermo() {
        return noivoBatizTermo;
    }

    public void setNoivoBatizTermo(Integer noivoBatizTermo) {
        this.noivoBatizTermo = noivoBatizTermo;
    }

    public String getNoivoPergunta1() {
        return noivoPergunta1;
    }

    public void setNoivoPergunta1(String noivoPergunta1) {
        this.noivoPergunta1 = noivoPergunta1;
    }

    public String getNoivoPergunta2() {
        return noivoPergunta2;
    }

    public void setNoivoPergunta2(String noivoPergunta2) {
        this.noivoPergunta2 = noivoPergunta2;
    }

    public String getNoivoPergunta3() {
        return noivoPergunta3;
    }

    public void setNoivoPergunta3(String noivoPergunta3) {
        this.noivoPergunta3 = noivoPergunta3;
    }

    public String getNoivoPergunta4() {
        return noivoPergunta4;
    }

    public void setNoivoPergunta4(String noivoPergunta4) {
        this.noivoPergunta4 = noivoPergunta4;
    }

    public String getNoivoPergunta5() {
        return noivoPergunta5;
    }

    public void setNoivoPergunta5(String noivoPergunta5) {
        this.noivoPergunta5 = noivoPergunta5;
    }

    public String getNoivoPergunta6() {
        return noivoPergunta6;
    }

    public void setNoivoPergunta6(String noivoPergunta6) {
        this.noivoPergunta6 = noivoPergunta6;
    }

    public String getNoivoSupletivo() {
        return noivoSupletivo;
    }

    public void setNoivoSupletivo(String noivoSupletivo) {
        this.noivoSupletivo = noivoSupletivo;
    }

    public String getNoivoSupletivoJurado() {
        return noivoSupletivoJurado;
    }

    public void setNoivoSupletivoJurado(String noivoSupletivoJurado) {
        this.noivoSupletivoJurado = noivoSupletivoJurado;
    }

    public String getNoivoSupleTestemunha1() {
        return noivoSupleTestemunha1;
    }

    public void setNoivoSupleTestemunha1(String noivoSupleTestemunha1) {
        this.noivoSupleTestemunha1 = noivoSupleTestemunha1;
    }

    public String getNoivoSupleTestemunha2() {
        return noivoSupleTestemunha2;
    }

    public void setNoivoSupleTestemunha2(String noivoSupleTestemunha2) {
        this.noivoSupleTestemunha2 = noivoSupleTestemunha2;
    }

    public String getNoivoSuplePadre() {
        return noivoSuplePadre;
    }

    public void setNoivoSuplePadre(String noivoSuplePadre) {
        this.noivoSuplePadre = noivoSuplePadre;
    }

    public String getNoivoEstadCivil() {
        return noivoEstadCivil;
    }

    public void setNoivoEstadCivil(String noivoEstadCivil) {
        this.noivoEstadCivil = noivoEstadCivil;
    }

    public Date getNoivoDtBatizmo() {
        return noivoDtBatizmo;
    }

    public void setNoivoDtBatizmo(Date noivoDtBatizmo) {
        this.noivoDtBatizmo = noivoDtBatizmo;
    }

    public String getNoivoBatizParoq() {
        return noivoBatizParoq;
    }

    public void setNoivoBatizParoq(String noivoBatizParoq) {
        this.noivoBatizParoq = noivoBatizParoq;
    }

    public String getNoivoBatizDicese() {
        return noivoBatizDicese;
    }

    public void setNoivoBatizDicese(String noivoBatizDicese) {
        this.noivoBatizDicese = noivoBatizDicese;
    }

    public String getNoivoPaisResidentes() {
        return noivoPaisResidentes;
    }

    public void setNoivoPaisResidentes(String noivoPaisResidentes) {
        this.noivoPaisResidentes = noivoPaisResidentes;
    }

    public String getNoivoMaeNatural() {
        return noivoMaeNatural;
    }

    public void setNoivoMaeNatural(String noivoMaeNatural) {
        this.noivoMaeNatural = noivoMaeNatural;
    }

    public String getNoivoPaiNatural() {
        return noivoPaiNatural;
    }

    public void setNoivoPaiNatural(String noivoPaiNatural) {
        this.noivoPaiNatural = noivoPaiNatural;
    }

    public String getNoivoResidParoq() {
        return noivoResidParoq;
    }

    public void setNoivoResidParoq(String noivoResidParoq) {
        this.noivoResidParoq = noivoResidParoq;
    }

    public String getPadreNome() {
        return padreNome;
    }

    public void setPadreNome(String padreNome) {
        this.padreNome = padreNome;
    }

    public String getTestemunha1() {
        return testemunha1;
    }

    public void setTestemunha1(String testemunha1) {
        this.testemunha1 = testemunha1;
    }

    public String getTestemunha2() {
        return testemunha2;
    }

    public void setTestemunha2(String testemunha2) {
        this.testemunha2 = testemunha2;
    }

    public byte[] getTestemunhas() {
        return testemunhas;
    }

    public void setTestemunhas(byte[] testemunhas) {
        this.testemunhas = testemunhas;
    }

    public int getImpressoes() {
        return impressoes;
    }

    public void setImpressoes(int impressoes) {
        this.impressoes = impressoes;
    }

    public Date getDtDialogo() {
        return dtDialogo;
    }

    public void setDtDialogo(Date dtDialogo) {
        this.dtDialogo = dtDialogo;
    }

    public String getComunidadeFreq() {
        return comunidadeFreq;
    }

    public void setComunidadeFreq(String comunidadeFreq) {
        this.comunidadeFreq = comunidadeFreq;
    }

    public String getBispoNome() {
        return bispoNome;
    }

    public void setBispoNome(String bispoNome) {
        this.bispoNome = bispoNome;
    }

    public String getSituacaoProcesso() {
        return situacaoProcesso;
    }

    public void setSituacaoProcesso(String situacaoProcesso) {
        this.situacaoProcesso = situacaoProcesso;
    }

    public byte[] getObservacao() {
        return observacao;
    }

    public void setObservacao(byte[] observacao) {
        this.observacao = observacao;
    }

    public String getNotificou() {
        return notificou;
    }

    public void setNotificou(String notificou) {
        this.notificou = notificou;
    }

    public String getCivilCartorNome() {
        return civilCartorNome;
    }

    public void setCivilCartorNome(String civilCartorNome) {
        this.civilCartorNome = civilCartorNome;
    }

    public Date getCivilDtHabilita() {
        return civilDtHabilita;
    }

    public void setCivilDtHabilita(Date civilDtHabilita) {
        this.civilDtHabilita = civilDtHabilita;
    }

    public Date getCivilDtCasamento() {
        return civilDtCasamento;
    }

    public void setCivilDtCasamento(Date civilDtCasamento) {
        this.civilDtCasamento = civilDtCasamento;
    }

    public String getCivilNomeJuiz() {
        return civilNomeJuiz;
    }

    public void setCivilNomeJuiz(String civilNomeJuiz) {
        this.civilNomeJuiz = civilNomeJuiz;
    }

    public String getCivilTestemunha1() {
        return civilTestemunha1;
    }

    public void setCivilTestemunha1(String civilTestemunha1) {
        this.civilTestemunha1 = civilTestemunha1;
    }

    public String getCivilTestemunha1EstCivil() {
        return civilTestemunha1EstCivil;
    }

    public void setCivilTestemunha1EstCivil(String civilTestemunha1EstCivil) {
        this.civilTestemunha1EstCivil = civilTestemunha1EstCivil;
    }

    public int getCivilTestemunha1Idade() {
        return civilTestemunha1Idade;
    }

    public void setCivilTestemunha1Idade(int civilTestemunha1Idade) {
        this.civilTestemunha1Idade = civilTestemunha1Idade;
    }

    public String getCivilTestemunhaProfissao() {
        return civilTestemunhaProfissao;
    }

    public void setCivilTestemunhaProfissao(String civilTestemunhaProfissao) {
        this.civilTestemunhaProfissao = civilTestemunhaProfissao;
    }

    public String getCivilTestemunha1Residencia() {
        return civilTestemunha1Residencia;
    }

    public void setCivilTestemunha1Residencia(String civilTestemunha1Residencia) {
        this.civilTestemunha1Residencia = civilTestemunha1Residencia;
    }

    public String getCivilTestemunha2() {
        return civilTestemunha2;
    }

    public void setCivilTestemunha2(String civilTestemunha2) {
        this.civilTestemunha2 = civilTestemunha2;
    }

    public String getCivilTestemunha2EstCivil() {
        return civilTestemunha2EstCivil;
    }

    public void setCivilTestemunha2EstCivil(String civilTestemunha2EstCivil) {
        this.civilTestemunha2EstCivil = civilTestemunha2EstCivil;
    }

    public int getCivilTestemunha2Idade() {
        return civilTestemunha2Idade;
    }

    public void setCivilTestemunha2Idade(int civilTestemunha2Idade) {
        this.civilTestemunha2Idade = civilTestemunha2Idade;
    }

    public String getCivilTestemunha2Profissao() {
        return civilTestemunha2Profissao;
    }

    public void setCivilTestemunha2Profissao(String civilTestemunha2Profissao) {
        this.civilTestemunha2Profissao = civilTestemunha2Profissao;
    }

    public String getCivilTestemunha2Residencia() {
        return civilTestemunha2Residencia;
    }

    public void setCivilTestemunha2Residencia(String civilTestemunha2Residencia) {
        this.civilTestemunha2Residencia = civilTestemunha2Residencia;
    }

    public String getCivilNomeNoiva() {
        return civilNomeNoiva;
    }

    public void setCivilNomeNoiva(String civilNomeNoiva) {
        this.civilNomeNoiva = civilNomeNoiva;
    }

    public String getRegimeCasa() {
        return regimeCasa;
    }

    public void setRegimeCasa(String regimeCasa) {
        this.regimeCasa = regimeCasa;
    }

    public byte[] getDispensaDespacho() {
        return dispensaDespacho;
    }

    public void setDispensaDespacho(byte[] dispensaDespacho) {
        this.dispensaDespacho = dispensaDespacho;
    }

    public String getDispensaConsaguidadeGrau() {
        return dispensaConsaguidadeGrau;
    }

    public void setDispensaConsaguidadeGrau(String dispensaConsaguidadeGrau) {
        this.dispensaConsaguidadeGrau = dispensaConsaguidadeGrau;
    }

    public String getDispensaDeItenIv() {
        return dispensaDeItenIv;
    }

    public void setDispensaDeItenIv(String dispensaDeItenIv) {
        this.dispensaDeItenIv = dispensaDeItenIv;
    }

    public String getDispensaMotivo() {
        return dispensaMotivo;
    }

    public void setDispensaMotivo(String dispensaMotivo) {
        this.dispensaMotivo = dispensaMotivo;
    }

    public Date getNoivaDtNascimento() {
        return noivaDtNascimento;
    }

    public void setNoivaDtNascimento(Date noivaDtNascimento) {
        this.noivaDtNascimento = noivaDtNascimento;
    }

    public String getDioceseTransferida() {
        return dioceseTransferida;
    }

    public void setDioceseTransferida(String dioceseTransferida) {
        this.dioceseTransferida = dioceseTransferida;
    }

    public String getParoquiatransferida() {
        return paroquiatransferida;
    }

    public void setParoquiatransferida(String paroquiatransferida) {
        this.paroquiatransferida = paroquiatransferida;
    }

    public String getComunidadeTransferida() {
        return comunidadeTransferida;
    }

    public void setComunidadeTransferida(String comunidadeTransferida) {
        this.comunidadeTransferida = comunidadeTransferida;
    }

    public String getParoco() {
        return paroco;
    }

    public void setParoco(String paroco) {
        this.paroco = paroco;
    }

    public String getNoivaParoqResidPeriodo() {
        return noivaParoqResidPeriodo;
    }

    public void setNoivaParoqResidPeriodo(String noivaParoqResidPeriodo) {
        this.noivaParoqResidPeriodo = noivaParoqResidPeriodo;
    }

    public String getNoivoParoqResidPeriodo() {
        return noivoParoqResidPeriodo;
    }

    public void setNoivoParoqResidPeriodo(String noivoParoqResidPeriodo) {
        this.noivoParoqResidPeriodo = noivoParoqResidPeriodo;
    }

    public String getNoivoSacramento() {
        return noivoSacramento;
    }

    public void setNoivoSacramento(String noivoSacramento) {
        this.noivoSacramento = noivoSacramento;
    }

    public String getNoivaSacramento() {
        return noivaSacramento;
    }

    public void setNoivaSacramento(String noivaSacramento) {
        this.noivaSacramento = noivaSacramento;
    }

    public String getEvangelico() {
        return evangelico;
    }

    public void setEvangelico(String evangelico) {
        this.evangelico = evangelico;
    }

    public byte[] getObsAnulacao() {
        return obsAnulacao;
    }

    public void setObsAnulacao(byte[] obsAnulacao) {
        this.obsAnulacao = obsAnulacao;
    }

    public String getNoivaCpf() {
        return noivaCpf;
    }

    public void setNoivaCpf(String noivaCpf) {
        this.noivaCpf = noivaCpf;
    }

    public String getNoivaRg() {
        return noivaRg;
    }

    public void setNoivaRg(String noivaRg) {
        this.noivaRg = noivaRg;
    }

    public String getNoivoCpf() {
        return noivoCpf;
    }

    public void setNoivoCpf(String noivoCpf) {
        this.noivoCpf = noivoCpf;
    }

    public String getNoivoRg() {
        return noivoRg;
    }

    public void setNoivoRg(String noivoRg) {
        this.noivoRg = noivoRg;
    }

    public String getCivilTestemunha1Cpf() {
        return civilTestemunha1Cpf;
    }

    public void setCivilTestemunha1Cpf(String civilTestemunha1Cpf) {
        this.civilTestemunha1Cpf = civilTestemunha1Cpf;
    }

    public String getCivilTestemunha1Rg() {
        return civilTestemunha1Rg;
    }

    public void setCivilTestemunha1Rg(String civilTestemunha1Rg) {
        this.civilTestemunha1Rg = civilTestemunha1Rg;
    }

    public String getCivilTestemunha2Cpf() {
        return civilTestemunha2Cpf;
    }

    public void setCivilTestemunha2Cpf(String civilTestemunha2Cpf) {
        this.civilTestemunha2Cpf = civilTestemunha2Cpf;
    }

    public String getCivilTestemunha2Rg() {
        return civilTestemunha2Rg;
    }

    public void setCivilTestemunha2Rg(String civilTestemunha2Rg) {
        this.civilTestemunha2Rg = civilTestemunha2Rg;
    }

    public Integer getIdApanegat() {
        return idApanegat;
    }

    public void setIdApanegat(Integer idApanegat) {
        this.idApanegat = idApanegat;
    }

}