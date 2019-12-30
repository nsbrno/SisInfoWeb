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
@Table(name = "APANEGAT")
public class ApanegatEntity {

    @Id
    @Column(name = "ID_APANEGAT", table = "APANEGAT", nullable = false)
    private Integer idApanegat;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APANEGAT")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_APACOMUN", table = "APANEGAT")
    private Integer idApacomun;

    @Basic
    @Column(name = "US_CAD", table = "APANEGAT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APANEGAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APANEGAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APANEGAT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APANEGAT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "NOME", table = "APANEGAT", length = 60)
    private String nome;

    @Basic(optional = false)
    @Column(name = "ANO", table = "APANEGAT", nullable = false)
    private Integer ano;

    @Basic(optional = false)
    @Column(name = "ANOFIM", table = "APANEGAT", nullable = false)
    private Integer anofim;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "APANEGAT")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Basic
    @Column(name = "PAI", table = "APANEGAT", length = 60)
    private String pai;

    @Basic
    @Column(name = "MAE", table = "APANEGAT", length = 60)
    private String mae;

    @Basic
    @Column(name = "EMISSAO", table = "APANEGAT")
    @Temporal(TemporalType.DATE)
    private Date emissao;

    @Basic
    @Column(name = "SECRETARIA", table = "APANEGAT", length = 60)
    private String secretaria;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APANEGAT")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "APANEGAT")
    private Integer idCfaclifoComun;

    @Basic
    @Column(name = "LIVRO", table = "APANEGAT")
    private Integer livro;

    @Basic
    @Column(name = "TERMO", table = "APANEGAT")
    private Integer termo;

    @Basic
    @Column(name = "FOLHA", table = "APANEGAT")
    private Integer folha;

    @Basic
    @Column(name = "ID_APALCASA", table = "APANEGAT")
    private Integer idApalcasa;

    public Integer getIdApanegat() {
        return idApanegat;
    }

    public void setIdApanegat(Integer idApanegat) {
        this.idApanegat = idApanegat;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getAnofim() {
        return anofim;
    }

    public void setAnofim(Integer anofim) {
        this.anofim = anofim;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public Date getEmissao() {
        return emissao;
    }

    public void setEmissao(Date emissao) {
        this.emissao = emissao;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
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

    public Integer getLivro() {
        return livro;
    }

    public void setLivro(Integer livro) {
        this.livro = livro;
    }

    public Integer getTermo() {
        return termo;
    }

    public void setTermo(Integer termo) {
        this.termo = termo;
    }

    public Integer getFolha() {
        return folha;
    }

    public void setFolha(Integer folha) {
        this.folha = folha;
    }

    public Integer getIdApalcasa() {
        return idApalcasa;
    }

    public void setIdApalcasa(Integer idApalcasa) {
        this.idApalcasa = idApalcasa;
    }

}