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
@Table(name = "APALPROT")
public class ApalprotEntity {

    @Id
    @Column(name = "ID_APALPROT", table = "APALPROT", nullable = false)
    private Integer idApalprot;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APALPROT")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APALPROT")
    private Integer idCfaclifoParoq;

    @Basic(optional = false)
    @Column(name = "US_CAD", table = "APALPROT", nullable = false, length = 20)
    private String usCad;

    @Basic(optional = false)
    @Column(name = "DT_CAD", table = "APALPROT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic(optional = false)
    @Column(name = "DT_ALT", table = "APALPROT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APALPROT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APALPROT", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "ANO", table = "APALPROT", nullable = false)
    private int ano;

    @Basic
    @Column(name = "NUMERO", table = "APALPROT")
    private Integer numero;

    @Basic
    @Column(name = "EMISSAO", table = "APALPROT")
    @Temporal(TemporalType.DATE)
    private Date emissao;

    @Basic
    @Column(name = "EMITENTE", table = "APALPROT")
    private String emitente;

    @Basic
    @Column(name = "NOME_EMITENTE", table = "APALPROT", length = 60)
    private String nomeEmitente;

    @Lob
    @Basic
    @Column(name = "TEXTO", table = "APALPROT")
    private byte[] texto;

    @Basic(optional = false)
    @Column(name = "IMPRESSOES", table = "APALPROT", nullable = false)
    private int impressoes;

    public Integer getIdApalprot() {
        return idApalprot;
    }

    public void setIdApalprot(Integer idApalprot) {
        this.idApalprot = idApalprot;
    }

    public Integer getIdApaparoq() {
        return idApaparoq;
    }

    public void setIdApaparoq(Integer idApaparoq) {
        this.idApaparoq = idApaparoq;
    }

    public Integer getIdCfaclifoParoq() {
        return idCfaclifoParoq;
    }

    public void setIdCfaclifoParoq(Integer idCfaclifoParoq) {
        this.idCfaclifoParoq = idCfaclifoParoq;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getEmissao() {
        return emissao;
    }

    public void setEmissao(Date emissao) {
        this.emissao = emissao;
    }

    public String getEmitente() {
        return emitente;
    }

    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }

    public String getNomeEmitente() {
        return nomeEmitente;
    }

    public void setNomeEmitente(String nomeEmitente) {
        this.nomeEmitente = nomeEmitente;
    }

    public byte[] getTexto() {
        return texto;
    }

    public void setTexto(byte[] texto) {
        this.texto = texto;
    }

    public int getImpressoes() {
        return impressoes;
    }

    public void setImpressoes(int impressoes) {
        this.impressoes = impressoes;
    }

}