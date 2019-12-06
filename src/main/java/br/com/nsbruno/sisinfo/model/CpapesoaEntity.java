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
@Table(name = "CPAPESOA")
public class CpapesoaEntity {

    @Id
    @Column(name = "ID_CPAPESOA", table = "CPAPESOA", nullable = false)
    private Integer idCpapesoa;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CPAPESOA")
    private Integer idCfaestad;

    @Basic
    @Column(name = "US_CAD", table = "CPAPESOA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPAPESOA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPAPESOA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPAPESOA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPAPESOA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "PESSOA", table = "CPAPESOA")
    private String pessoa;

    @Basic
    @Column(name = "CPF_CGC", table = "CPAPESOA", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "TIPO_DOC", table = "CPAPESOA")
    private String tipoDoc;

    @Basic
    @Column(name = "DOCUMENTO", table = "CPAPESOA", length = 18)
    private String documento;

    @Basic(optional = false)
    @Column(name = "NOME_RAZAO", table = "CPAPESOA", nullable = false, length = 60)
    private String nomeRazao;

    @Basic
    @Column(name = "ENDERECO", table = "CPAPESOA", length = 128)
    private String endereco;

    @Basic
    @Column(name = "NUMERO", table = "CPAPESOA", length = 6)
    private String numero;

    @Basic
    @Column(name = "BAIRRO", table = "CPAPESOA", length = 40)
    private String bairro;

    @Basic
    @Column(name = "CIDADE", table = "CPAPESOA", length = 40)
    private String cidade;

    @Basic
    @Column(name = "CEP", table = "CPAPESOA", length = 9)
    private String cep;

    @Basic
    @Column(name = "FONE", table = "CPAPESOA", length = 15)
    private String fone;

    @Basic
    @Column(name = "FAX", table = "CPAPESOA", length = 15)
    private String fax;

    @Basic
    @Column(name = "EMAIL", table = "CPAPESOA", length = 128)
    private String email;

    @Basic
    @Column(name = "WEB", table = "CPAPESOA", length = 128)
    private String web;

    @Basic(optional = false)
    @Column(name = "CODIGO_COMPENSACAO", table = "CPAPESOA", nullable = false)
    private int codigoCompensacao;

    public Integer getIdCpapesoa() {
        return idCpapesoa;
    }

    public void setIdCpapesoa(Integer idCpapesoa) {
        this.idCpapesoa = idCpapesoa;
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

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getCpfCgc() {
        return cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
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

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getCodigoCompensacao() {
        return codigoCompensacao;
    }

    public void setCodigoCompensacao(int codigoCompensacao) {
        this.codigoCompensacao = codigoCompensacao;
    }

}