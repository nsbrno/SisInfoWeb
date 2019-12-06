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
@Table(name = "APAPRMAT")
public class ApaprmatEntity {

    @Id
    @Column(name = "ID_APAPRMAT", table = "APAPRMAT", nullable = false)
    private Integer idApaprmat;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APAPRMAT")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_APACOMUN", table = "APAPRMAT")
    private Integer idApacomun;

    @Basic
    @Column(name = "ID_CFACIDAD_NOIVO", table = "APAPRMAT")
    private Integer idCfacidadNoivo;

    @Basic
    @Column(name = "ID_CFAESTAD_NOIVO", table = "APAPRMAT")
    private Integer idCfaestadNoivo;

    @Basic
    @Column(name = "ID_CFACIDAD_NOIVA", table = "APAPRMAT")
    private Integer idCfacidadNoiva;

    @Basic
    @Column(name = "ID_CFAESTAD_NOIVA", table = "APAPRMAT")
    private Integer idCfaestadNoiva;

    @Basic
    @Column(name = "ID_CFACIDAD_MORAR", table = "APAPRMAT")
    private Integer idCfacidadMorar;

    @Basic
    @Column(name = "ID_CFAESTAD_MORAR", table = "APAPRMAT")
    private Integer idCfaestadMorar;

    @Basic
    @Column(name = "US_CAD", table = "APAPRMAT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APAPRMAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APAPRMAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APAPRMAT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APAPRMAT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "NOIVO_NOME", table = "APAPRMAT", length = 60)
    private String noivoNome;

    @Basic
    @Column(name = "NOIVA_NOME", table = "APAPRMAT", length = 60)
    private String noivaNome;

    @Basic
    @Column(name = "NOIVO_PAI", table = "APAPRMAT", length = 60)
    private String noivoPai;

    @Basic
    @Column(name = "NOIVO_MAE", table = "APAPRMAT", length = 60)
    private String noivoMae;

    @Basic
    @Column(name = "NOIVO_DT_NASCIMENTO", table = "APAPRMAT")
    @Temporal(TemporalType.DATE)
    private Date noivoDtNascimento;

    @Basic
    @Column(name = "NOIVO_NATURAL", table = "APAPRMAT", length = 40)
    private String noivoNatural;

    @Basic
    @Column(name = "NOIVO_BATIZ_PAROQ", table = "APAPRMAT", length = 40)
    private String noivoBatizParoq;

    @Basic
    @Column(name = "NOIVO_BATIZ_DIOCESE", table = "APAPRMAT", length = 40)
    private String noivoBatizDiocese;

    @Basic
    @Column(name = "NOIVO_ENDERECO", table = "APAPRMAT", length = 40)
    private String noivoEndereco;

    @Basic
    @Column(name = "NOIVO_BAIRRO", table = "APAPRMAT", length = 40)
    private String noivoBairro;

    @Basic
    @Column(name = "NOIVO_BATIZADO", table = "APAPRMAT")
    private String noivoBatizado;

    @Basic
    @Column(name = "NOIVO_BATIZ_LIVRO", table = "APAPRMAT")
    private Integer noivoBatizLivro;

    @Basic
    @Column(name = "NOIVO_BATIZ_FOLHA", table = "APAPRMAT")
    private Integer noivoBatizFolha;

    @Basic
    @Column(name = "NOIVO_BATIZ_TERMO", table = "APAPRMAT")
    private Integer noivoBatizTermo;

    @Basic
    @Column(name = "NOIVA_PAI", table = "APAPRMAT", length = 60)
    private String noivaPai;

    @Basic
    @Column(name = "NOIVA_MAE", table = "APAPRMAT", length = 60)
    private String noivaMae;

    @Basic
    @Column(name = "NOIVA_DT_NASCIMENTO", table = "APAPRMAT")
    @Temporal(TemporalType.DATE)
    private Date noivaDtNascimento;

    @Basic
    @Column(name = "NOIVA_NATURAL", table = "APAPRMAT", length = 40)
    private String noivaNatural;

    @Basic
    @Column(name = "NOIVA_BATIZ_PAROQ", table = "APAPRMAT", length = 40)
    private String noivaBatizParoq;

    @Basic
    @Column(name = "NOIVA_BATIZ_DIOCESE", table = "APAPRMAT", length = 40)
    private String noivaBatizDiocese;

    @Basic
    @Column(name = "NOIVA_ENDERECO", table = "APAPRMAT", length = 40)
    private String noivaEndereco;

    @Basic
    @Column(name = "NOIVA_BAIRRO", table = "APAPRMAT", length = 40)
    private String noivaBairro;

    @Basic
    @Column(name = "NOIVO_PERGUNTA1", table = "APAPRMAT", length = 128)
    private String noivoPergunta1;

    @Basic
    @Column(name = "NOIVO_PERGUNTA2", table = "APAPRMAT", length = 128)
    private String noivoPergunta2;

    @Basic
    @Column(name = "NOIVO_PERGUNTA3", table = "APAPRMAT", length = 128)
    private String noivoPergunta3;

    @Basic
    @Column(name = "NOIVO_PERGUNTA4", table = "APAPRMAT", length = 128)
    private String noivoPergunta4;

    @Basic
    @Column(name = "NOIVO_PERGUNTA5", table = "APAPRMAT", length = 128)
    private String noivoPergunta5;

    @Basic
    @Column(name = "NOIVO_PERGUNTA6", table = "APAPRMAT", length = 128)
    private String noivoPergunta6;

    @Basic
    @Column(name = "NOIVA_PERGUNTA1", table = "APAPRMAT", length = 128)
    private String noivaPergunta1;

    @Basic
    @Column(name = "NOIVA_PERGUNTA2", table = "APAPRMAT", length = 128)
    private String noivaPergunta2;

    @Basic
    @Column(name = "NOIVA_PERGUNTA3", table = "APAPRMAT", length = 128)
    private String noivaPergunta3;

    @Basic
    @Column(name = "NOIVA_PERGUNTA4", table = "APAPRMAT", length = 128)
    private String noivaPergunta4;

    @Basic
    @Column(name = "NOIVA_PERGUNTA5", table = "APAPRMAT", length = 128)
    private String noivaPergunta5;

    @Basic
    @Column(name = "NOIVA_PERGUNTA6", table = "APAPRMAT", length = 128)
    private String noivaPergunta6;

    @Basic
    @Column(name = "NOIVA_BATIZADA", table = "APAPRMAT")
    private String noivaBatizada;

    @Basic
    @Column(name = "NOIVA_BATIZ_LIVRO", table = "APAPRMAT")
    private Integer noivaBatizLivro;

    @Basic
    @Column(name = "NOIVA_BATIZ_FOLHA", table = "APAPRMAT")
    private Integer noivaBatizFolha;

    @Basic
    @Column(name = "NOIVA_BATIZ_TERMO", table = "APAPRMAT")
    private Integer noivaBatizTermo;

    @Basic
    @Column(name = "DT_DIALOGO", table = "APAPRMAT")
    @Temporal(TemporalType.DATE)
    private Date dtDialogo;

    @Basic
    @Column(name = "COMUNIDADE_MORAR", table = "APAPRMAT", length = 40)
    private String comunidadeMorar;

    @Basic
    @Column(name = "PADRE_NOME", table = "APAPRMAT", length = 60)
    private String padreNome;

    @Basic
    @Column(name = "BISPO_NOME", table = "APAPRMAT", length = 60)
    private String bispoNome;

    @Basic
    @Column(name = "DT_HR_CASAMENTO", table = "APAPRMAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtHrCasamento;

    @Basic
    @Column(name = "SITUACAO", table = "APAPRMAT")
    private String situacao;

    @Basic
    @Column(name = "PAROQUIATRANSFERIDA", table = "APAPRMAT", length = 40)
    private String paroquiatransferida;

    @Basic
    @Column(name = "PAROCO", table = "APAPRMAT", length = 60)
    private String paroco;

    public Integer getIdApaprmat() {
        return idApaprmat;
    }

    public void setIdApaprmat(Integer idApaprmat) {
        this.idApaprmat = idApaprmat;
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

    public String getNoivoNome() {
        return noivoNome;
    }

    public void setNoivoNome(String noivoNome) {
        this.noivoNome = noivoNome;
    }

    public String getNoivaNome() {
        return noivaNome;
    }

    public void setNoivaNome(String noivaNome) {
        this.noivaNome = noivaNome;
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

    public String getNoivoBatizParoq() {
        return noivoBatizParoq;
    }

    public void setNoivoBatizParoq(String noivoBatizParoq) {
        this.noivoBatizParoq = noivoBatizParoq;
    }

    public String getNoivoBatizDiocese() {
        return noivoBatizDiocese;
    }

    public void setNoivoBatizDiocese(String noivoBatizDiocese) {
        this.noivoBatizDiocese = noivoBatizDiocese;
    }

    public String getNoivoEndereco() {
        return noivoEndereco;
    }

    public void setNoivoEndereco(String noivoEndereco) {
        this.noivoEndereco = noivoEndereco;
    }

    public String getNoivoBairro() {
        return noivoBairro;
    }

    public void setNoivoBairro(String noivoBairro) {
        this.noivoBairro = noivoBairro;
    }

    public String getNoivoBatizado() {
        return noivoBatizado;
    }

    public void setNoivoBatizado(String noivoBatizado) {
        this.noivoBatizado = noivoBatizado;
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

    public Date getNoivaDtNascimento() {
        return noivaDtNascimento;
    }

    public void setNoivaDtNascimento(Date noivaDtNascimento) {
        this.noivaDtNascimento = noivaDtNascimento;
    }

    public String getNoivaNatural() {
        return noivaNatural;
    }

    public void setNoivaNatural(String noivaNatural) {
        this.noivaNatural = noivaNatural;
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

    public String getNoivaEndereco() {
        return noivaEndereco;
    }

    public void setNoivaEndereco(String noivaEndereco) {
        this.noivaEndereco = noivaEndereco;
    }

    public String getNoivaBairro() {
        return noivaBairro;
    }

    public void setNoivaBairro(String noivaBairro) {
        this.noivaBairro = noivaBairro;
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

    public String getNoivaBatizada() {
        return noivaBatizada;
    }

    public void setNoivaBatizada(String noivaBatizada) {
        this.noivaBatizada = noivaBatizada;
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

    public Date getDtDialogo() {
        return dtDialogo;
    }

    public void setDtDialogo(Date dtDialogo) {
        this.dtDialogo = dtDialogo;
    }

    public String getComunidadeMorar() {
        return comunidadeMorar;
    }

    public void setComunidadeMorar(String comunidadeMorar) {
        this.comunidadeMorar = comunidadeMorar;
    }

    public String getPadreNome() {
        return padreNome;
    }

    public void setPadreNome(String padreNome) {
        this.padreNome = padreNome;
    }

    public String getBispoNome() {
        return bispoNome;
    }

    public void setBispoNome(String bispoNome) {
        this.bispoNome = bispoNome;
    }

    public Date getDtHrCasamento() {
        return dtHrCasamento;
    }

    public void setDtHrCasamento(Date dtHrCasamento) {
        this.dtHrCasamento = dtHrCasamento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getParoquiatransferida() {
        return paroquiatransferida;
    }

    public void setParoquiatransferida(String paroquiatransferida) {
        this.paroquiatransferida = paroquiatransferida;
    }

    public String getParoco() {
        return paroco;
    }

    public void setParoco(String paroco) {
        this.paroco = paroco;
    }

}