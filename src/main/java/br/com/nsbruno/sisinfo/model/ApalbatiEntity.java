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
@Table(name = "APALBATI")
public class ApalbatiEntity {

    @Id
    @Column(name = "ID_APALBATI", table = "APALBATI", nullable = false)
    private Integer idApalbati;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APALBATI")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_APACOMUN", table = "APALBATI")
    private Integer idApacomun;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APALBATI")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "APALBATI")
    private Integer idCfaclifoComun;

    @Basic(optional = false)
    @Column(name = "US_CAD", table = "APALBATI", nullable = false, length = 20)
    private String usCad;

    @Basic(optional = false)
    @Column(name = "DT_CAD", table = "APALBATI", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic(optional = false)
    @Column(name = "DT_ALT", table = "APALBATI", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APALBATI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APALBATI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "LIVRO", table = "APALBATI")
    private Integer livro;

    @Basic
    @Column(name = "FOLHA", table = "APALBATI")
    private Integer folha;

    @Basic
    @Column(name = "TERMO", table = "APALBATI")
    private Integer termo;

    @Basic
    @Column(name = "CELEBRANTE", table = "APALBATI", length = 60)
    private String celebrante;

    @Basic
    @Column(name = "DT_EMISSAO", table = "APALBATI")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "NOME", table = "APALBATI", length = 60)
    private String nome;

    @Basic
    @Column(name = "LOCAL_NASCIMENTO", table = "APALBATI", length = 40)
    private String localNascimento;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "APALBATI")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Basic
    @Column(name = "PAI_NOME", table = "APALBATI", length = 60)
    private String paiNome;

    @Basic
    @Column(name = "PAI_PROF", table = "APALBATI", length = 40)
    private String paiProf;

    @Basic
    @Column(name = "MAE_NOME", table = "APALBATI", length = 60)
    private String maeNome;

    @Basic
    @Column(name = "MAE_PROF", table = "APALBATI", length = 40)
    private String maeProf;

    @Basic
    @Column(name = "CASADO_LOCAL", table = "APALBATI", length = 40)
    private String casadoLocal;

    @Basic
    @Column(name = "DT_CASAMENTO", table = "APALBATI")
    @Temporal(TemporalType.DATE)
    private Date dtCasamento;

    @Basic
    @Column(name = "PADRINHO_NOME", table = "APALBATI", length = 60)
    private String padrinhoNome;

    @Basic
    @Column(name = "PADRINHO_PROF", table = "APALBATI", length = 40)
    private String padrinhoProf;

    @Basic
    @Column(name = "MADRINHA_NOME", table = "APALBATI", length = 60)
    private String madrinhaNome;

    @Basic
    @Column(name = "MADRINHA_PROF", table = "APALBATI", length = 40)
    private String madrinhaProf;

    @Lob
    @Basic
    @Column(name = "OBS", table = "APALBATI")
    private byte[] obs;

    @Basic(optional = false)
    @Column(name = "IMPRESSOES", table = "APALBATI", nullable = false)
    private int impressoes;

    @Basic
    @Column(name = "PAROCO", table = "APALBATI", length = 60)
    private String paroco;

    public Integer getIdApalbati() {
        return idApalbati;
    }

    public void setIdApalbati(Integer idApalbati) {
        this.idApalbati = idApalbati;
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

    public String getCelebrante() {
        return celebrante;
    }

    public void setCelebrante(String celebrante) {
        this.celebrante = celebrante;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getPaiNome() {
        return paiNome;
    }

    public void setPaiNome(String paiNome) {
        this.paiNome = paiNome;
    }

    public String getPaiProf() {
        return paiProf;
    }

    public void setPaiProf(String paiProf) {
        this.paiProf = paiProf;
    }

    public String getMaeNome() {
        return maeNome;
    }

    public void setMaeNome(String maeNome) {
        this.maeNome = maeNome;
    }

    public String getMaeProf() {
        return maeProf;
    }

    public void setMaeProf(String maeProf) {
        this.maeProf = maeProf;
    }

    public String getCasadoLocal() {
        return casadoLocal;
    }

    public void setCasadoLocal(String casadoLocal) {
        this.casadoLocal = casadoLocal;
    }

    public Date getDtCasamento() {
        return dtCasamento;
    }

    public void setDtCasamento(Date dtCasamento) {
        this.dtCasamento = dtCasamento;
    }

    public String getPadrinhoNome() {
        return padrinhoNome;
    }

    public void setPadrinhoNome(String padrinhoNome) {
        this.padrinhoNome = padrinhoNome;
    }

    public String getPadrinhoProf() {
        return padrinhoProf;
    }

    public void setPadrinhoProf(String padrinhoProf) {
        this.padrinhoProf = padrinhoProf;
    }

    public String getMadrinhaNome() {
        return madrinhaNome;
    }

    public void setMadrinhaNome(String madrinhaNome) {
        this.madrinhaNome = madrinhaNome;
    }

    public String getMadrinhaProf() {
        return madrinhaProf;
    }

    public void setMadrinhaProf(String madrinhaProf) {
        this.madrinhaProf = madrinhaProf;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public int getImpressoes() {
        return impressoes;
    }

    public void setImpressoes(int impressoes) {
        this.impressoes = impressoes;
    }

    public String getParoco() {
        return paroco;
    }

    public void setParoco(String paroco) {
        this.paroco = paroco;
    }

}