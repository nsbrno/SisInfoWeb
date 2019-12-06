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
@Table(name = "APADEPEN")
public class ApadepenEntity {

    @Id
    @Column(name = "ID_APADEPEN", table = "APADEPEN", nullable = false)
    private Integer idApadepen;

    @Basic
    @Column(name = "ID_APAPASTO", table = "APADEPEN")
    private Integer idApapasto;

    @Basic
    @Column(name = "ID_CFATPDEP", table = "APADEPEN")
    private Integer idCfatpdep;

    @Basic
    @Column(name = "ID_APADIZIM", table = "APADEPEN")
    private Integer idApadizim;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "APADEPEN")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "US_CAD", table = "APADEPEN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APADEPEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APADEPEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APADEPEN")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APADEPEN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "NOME", table = "APADEPEN", length = 60)
    private String nome;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "APADEPEN")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Basic
    @Column(name = "CONTRIBUINTE", table = "APADEPEN")
    private String contribuinte;

    @Basic
    @Column(name = "TEMPO_CONTRIBUICAO", table = "APADEPEN", length = 40)
    private String tempoContribuicao;

    @Basic
    @Column(name = "PARTICIPA_PASTORAL", table = "APADEPEN")
    private String participaPastoral;

    @Lob
    @Basic
    @Column(name = "OBSERVACAO", table = "APADEPEN")
    private byte[] observacao;

    public Integer getIdApadepen() {
        return idApadepen;
    }

    public void setIdApadepen(Integer idApadepen) {
        this.idApadepen = idApadepen;
    }

    public Integer getIdApapasto() {
        return idApapasto;
    }

    public void setIdApapasto(Integer idApapasto) {
        this.idApapasto = idApapasto;
    }

    public Integer getIdCfatpdep() {
        return idCfatpdep;
    }

    public void setIdCfatpdep(Integer idCfatpdep) {
        this.idCfatpdep = idCfatpdep;
    }

    public Integer getIdApadizim() {
        return idApadizim;
    }

    public void setIdApadizim(Integer idApadizim) {
        this.idApadizim = idApadizim;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public String getTempoContribuicao() {
        return tempoContribuicao;
    }

    public void setTempoContribuicao(String tempoContribuicao) {
        this.tempoContribuicao = tempoContribuicao;
    }

    public String getParticipaPastoral() {
        return participaPastoral;
    }

    public void setParticipaPastoral(String participaPastoral) {
        this.participaPastoral = participaPastoral;
    }

    public byte[] getObservacao() {
        return observacao;
    }

    public void setObservacao(byte[] observacao) {
        this.observacao = observacao;
    }

}