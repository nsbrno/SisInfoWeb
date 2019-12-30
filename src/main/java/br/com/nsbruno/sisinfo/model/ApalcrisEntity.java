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
@Table(name = "APALCRIS")
public class ApalcrisEntity {

    @Id
    @Column(name = "ID_APALCRIS", table = "APALCRIS", nullable = false)
    private Integer idApalcris;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APALCRIS")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_APACOMUN", table = "APALCRIS")
    private Integer idApacomun;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APALCRIS")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "APALCRIS")
    private Integer idCfaclifoComun;

    @Basic(optional = false)
    @Column(name = "US_CAD", table = "APALCRIS", nullable = false, length = 20)
    private String usCad;

    @Basic(optional = false)
    @Column(name = "DT_CAD", table = "APALCRIS", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic(optional = false)
    @Column(name = "DT_ALT", table = "APALCRIS", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APALCRIS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APALCRIS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "LIVRO", table = "APALCRIS")
    private Integer livro;

    @Basic
    @Column(name = "FOLHA", table = "APALCRIS")
    private Integer folha;

    @Basic
    @Column(name = "TERMO", table = "APALCRIS")
    private Integer termo;

    @Basic
    @Column(name = "DT_CRISMA", table = "APALCRIS")
    @Temporal(TemporalType.DATE)
    private Date dtCrisma;

    @Basic
    @Column(name = "CELEBRANTE", table = "APALCRIS", length = 60)
    private String celebrante;

    @Basic
    @Column(name = "NOME", table = "APALCRIS", length = 60)
    private String nome;

    @Basic
    @Column(name = "MAE", table = "APALCRIS", length = 60)
    private String mae;

    @Basic
    @Column(name = "PAI", table = "APALCRIS", length = 60)
    private String pai;

    @Basic
    @Column(name = "MAD_PAD", table = "APALCRIS", length = 60)
    private String madPad;

    @Lob
    @Basic
    @Column(name = "OBS", table = "APALCRIS")
    private byte[] obs;

    @Basic(optional = false)
    @Column(name = "IMPRESSOES", table = "APALCRIS", nullable = false)
    private Integer impressoes;

    @Basic
    @Column(name = "PAROCO", table = "APALCRIS", length = 60)
    private String paroco;

    public Integer getIdApalcris() {
        return idApalcris;
    }

    public void setIdApalcris(Integer idApalcris) {
        this.idApalcris = idApalcris;
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

    public Date getDtCrisma() {
        return dtCrisma;
    }

    public void setDtCrisma(Date dtCrisma) {
        this.dtCrisma = dtCrisma;
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

    public Integer getImpressoes() {
        return impressoes;
    }

    public void setImpressoes(Integer impressoes) {
        this.impressoes = impressoes;
    }

    public String getParoco() {
        return paroco;
    }

    public void setParoco(String paroco) {
        this.paroco = paroco;
    }

}