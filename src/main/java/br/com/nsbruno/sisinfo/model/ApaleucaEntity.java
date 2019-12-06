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
@Table(name = "APALEUCA")
public class ApaleucaEntity {

    @Id
    @Column(name = "ID_APALEUCA", table = "APALEUCA", nullable = false)
    private Integer idApaleuca;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APALEUCA")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_APACOMUN", table = "APALEUCA")
    private Integer idApacomun;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APALEUCA")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "APALEUCA")
    private Integer idCfaclifoComun;

    @Basic
    @Column(name = "US_CAD", table = "APALEUCA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APALEUCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APALEUCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APALEUCA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APALEUCA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "LIVRO", table = "APALEUCA")
    private Integer livro;

    @Basic
    @Column(name = "FOLHA", table = "APALEUCA")
    private Integer folha;

    @Basic
    @Column(name = "TERMO", table = "APALEUCA")
    private Integer termo;

    @Basic
    @Column(name = "DT_EUCARISTIA", table = "APALEUCA")
    @Temporal(TemporalType.DATE)
    private Date dtEucaristia;

    @Basic
    @Column(name = "CELEBRANTE", table = "APALEUCA", length = 60)
    private String celebrante;

    @Basic
    @Column(name = "NOME", table = "APALEUCA", length = 60)
    private String nome;

    @Basic
    @Column(name = "MAE", table = "APALEUCA", length = 60)
    private String mae;

    @Basic
    @Column(name = "PAI", table = "APALEUCA", length = 60)
    private String pai;

    @Basic
    @Column(name = "MAD_PAD", table = "APALEUCA", length = 60)
    private String madPad;

    @Lob
    @Basic
    @Column(name = "OBS", table = "APALEUCA")
    private byte[] obs;

    @Basic(optional = false)
    @Column(name = "IMPRESSOES", table = "APALEUCA", nullable = false)
    private int impressoes;

    @Basic
    @Column(name = "PAROCO", table = "APALEUCA", length = 60)
    private String paroco;

    public Integer getIdApaleuca() {
        return idApaleuca;
    }

    public void setIdApaleuca(Integer idApaleuca) {
        this.idApaleuca = idApaleuca;
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

    public Date getDtEucaristia() {
        return dtEucaristia;
    }

    public void setDtEucaristia(Date dtEucaristia) {
        this.dtEucaristia = dtEucaristia;
    }

    public String getCelebrante() {
        return celebrante;
    }

    public void setCelebrante(String celebrante) {
        this.celebrante = celebrante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMadPad() {
        return madPad;
    }

    public void setMadPad(String madPad) {
        this.madPad = madPad;
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