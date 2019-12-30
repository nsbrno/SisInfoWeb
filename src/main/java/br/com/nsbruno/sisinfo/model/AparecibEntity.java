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
@Table(name = "APARECIB")
public class AparecibEntity {

    @Id
    @Column(name = "ID_APARECIB", table = "APARECIB", nullable = false)
    private Integer idAparecib;

    @Basic
    @Column(name = "US_CAD", table = "APARECIB", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APARECIB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APARECIB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APARECIB")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APARECIB", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "NUMERO_ENT", table = "APARECIB")
    private Integer numeroEnt;

    @Basic
    @Column(name = "NUMERO_SAI", table = "APARECIB")
    private Integer numeroSai;

    @Basic
    @Column(name = "DATA", table = "APARECIB")
    @Temporal(TemporalType.DATE)
    private Date data;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "APARECIB", nullable = false)
    private double valor;

    @Basic
    @Column(name = "PROVENIENTE", table = "APARECIB", length = 128)
    private String proveniente;

    @Basic
    @Column(name = "SACADO", table = "APARECIB", length = 60)
    private String sacado;

    @Basic
    @Column(name = "ENDERECO_SACADO", table = "APARECIB", length = 128)
    private String enderecoSacado;

    @Basic
    @Column(name = "CREDOR", table = "APARECIB", length = 60)
    private String credor;

    @Basic
    @Column(name = "ENDERECO_CREDOR", table = "APARECIB", length = 128)
    private String enderecoCredor;

    @Basic
    @Column(name = "CPF_CNPJ_CREDOR", table = "APARECIB", length = 18)
    private String cpfCnpjCredor;

    @Basic
    @Column(name = "RG_IE_CREDOR", table = "APARECIB", length = 18)
    private String rgIeCredor;

    @Basic
    @Column(name = "MENSAGEM", table = "APARECIB", length = 128)
    private String mensagem;

    @Lob
    @Basic
    @Column(name = "ORIGEM", table = "APARECIB")
    private byte[] origem;

    @Basic(optional = false)
    @Column(name = "NUM_EMISSOES", table = "APARECIB", nullable = false)
    private Integer numEmissoes;

    @Basic
    @Column(name = "DT_CANCELAMENTO", table = "APARECIB")
    @Temporal(TemporalType.DATE)
    private Date dtCancelamento;

    public Integer getIdAparecib() {
        return idAparecib;
    }

    public void setIdAparecib(Integer idAparecib) {
        this.idAparecib = idAparecib;
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

    public Integer getNumeroEnt() {
        return numeroEnt;
    }

    public void setNumeroEnt(Integer numeroEnt) {
        this.numeroEnt = numeroEnt;
    }

    public Integer getNumeroSai() {
        return numeroSai;
    }

    public void setNumeroSai(Integer numeroSai) {
        this.numeroSai = numeroSai;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProveniente() {
        return proveniente;
    }

    public void setProveniente(String proveniente) {
        this.proveniente = proveniente;
    }

    public String getSacado() {
        return sacado;
    }

    public void setSacado(String sacado) {
        this.sacado = sacado;
    }

    public String getEnderecoSacado() {
        return enderecoSacado;
    }

    public void setEnderecoSacado(String enderecoSacado) {
        this.enderecoSacado = enderecoSacado;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public String getEnderecoCredor() {
        return enderecoCredor;
    }

    public void setEnderecoCredor(String enderecoCredor) {
        this.enderecoCredor = enderecoCredor;
    }

    public String getCpfCnpjCredor() {
        return cpfCnpjCredor;
    }

    public void setCpfCnpjCredor(String cpfCnpjCredor) {
        this.cpfCnpjCredor = cpfCnpjCredor;
    }

    public String getRgIeCredor() {
        return rgIeCredor;
    }

    public void setRgIeCredor(String rgIeCredor) {
        this.rgIeCredor = rgIeCredor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public byte[] getOrigem() {
        return origem;
    }

    public void setOrigem(byte[] origem) {
        this.origem = origem;
    }

    public Integer getNumEmissoes() {
        return numEmissoes;
    }

    public void setNumEmissoes(Integer numEmissoes) {
        this.numEmissoes = numEmissoes;
    }

    public Date getDtCancelamento() {
        return dtCancelamento;
    }

    public void setDtCancelamento(Date dtCancelamento) {
        this.dtCancelamento = dtCancelamento;
    }

}