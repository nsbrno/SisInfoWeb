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
@Table(name = "CPAENDOS")
public class CpaendosEntity {

    @Id
    @Column(name = "ID_CPAENDOS", table = "CPAENDOS", nullable = false)
    private Integer idCpaendos;

    @Basic(optional = false)
    @Column(name = "ID_CPAAPONT", table = "CPAENDOS", nullable = false)
    private Integer idCpaapont;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CPAENDOS")
    private Integer idCfaestad;

    @Basic
    @Column(name = "US_CAD", table = "CPAENDOS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPAENDOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPAENDOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPAENDOS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPAENDOS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "NOME", table = "CPAENDOS", length = 60)
    private String nome;

    @Basic
    @Column(name = "ENDERECO", table = "CPAENDOS", length = 128)
    private String endereco;

    @Basic
    @Column(name = "NUMERO", table = "CPAENDOS", length = 6)
    private String numero;

    @Basic
    @Column(name = "BAIRRO", table = "CPAENDOS", length = 40)
    private String bairro;

    @Basic
    @Column(name = "CIDADE", table = "CPAENDOS", length = 40)
    private String cidade;

    @Basic
    @Column(name = "CEP", table = "CPAENDOS", length = 9)
    private String cep;

    public Integer getIdCpaendos() {
        return idCpaendos;
    }

    public void setIdCpaendos(Integer idCpaendos) {
        this.idCpaendos = idCpaendos;
    }

    public Integer getIdCpaapont() {
        return idCpaapont;
    }

    public void setIdCpaapont(Integer idCpaapont) {
        this.idCpaapont = idCpaapont;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}