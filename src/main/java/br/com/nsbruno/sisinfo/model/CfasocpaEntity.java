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
@Table(name = "CFASOCPA")
public class CfasocpaEntity {

    @Id
    @Column(name = "ID_CFASOCPA", table = "CFASOCPA", nullable = false)
    private Integer idCfasocpa;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFASOCPA", nullable = false)
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CFASOCPA")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFAPROFI", table = "CFASOCPA")
    private Integer idCfaprofi;

    @Basic
    @Column(name = "ID_CFAATIVI", table = "CFASOCPA")
    private Integer idCfaativi;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFASOCPA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFASOCPA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFASOCPA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFASOCPA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFASOCPA")
    private Integer ctInteg;

    @Basic
    @Column(name = "TABELA", table = "CFASOCPA")
    private String tabela;

    @Basic
    @Column(name = "CPF_CGC", table = "CFASOCPA", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "IE_RG", table = "CFASOCPA", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "ORGAO_EMISSOR", table = "CFASOCPA", length = 3)
    private String orgaoEmissor;

    @Basic(optional = false)
    @Column(name = "NOME_RAZAO", table = "CFASOCPA", nullable = false, length = 60)
    private String nomeRazao;

    @Basic
    @Column(name = "NOME_FANTASIA", table = "CFASOCPA", length = 60)
    private String nomeFantasia;

    @Basic(optional = false)
    @Column(name = "PERCENTUAL", table = "CFASOCPA", nullable = false)
    private double percentual;

    @Basic(optional = false)
    @Column(name = "RETIRADA", table = "CFASOCPA", nullable = false)
    private double retirada;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CFASOCPA")
    private byte[] complemento;

    @Basic
    @Column(name = "CIVIL", table = "CFASOCPA")
    private String civil;

    @Basic
    @Column(name = "SEXO", table = "CFASOCPA")
    private String sexo;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "CFASOCPA")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    public Integer getIdCfasocpa() {
        return idCfasocpa;
    }

    public void setIdCfasocpa(Integer idCfasocpa) {
        this.idCfasocpa = idCfasocpa;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
    }

    public Integer getIdCfaprofi() {
        return idCfaprofi;
    }

    public void setIdCfaprofi(Integer idCfaprofi) {
        this.idCfaprofi = idCfaprofi;
    }

    public Integer getIdCfaativi() {
        return idCfaativi;
    }

    public void setIdCfaativi(Integer idCfaativi) {
        this.idCfaativi = idCfaativi;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public String getCpfCgc() {
        return cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public String getIeRg() {
        return ieRg;
    }

    public void setIeRg(String ieRg) {
        this.ieRg = ieRg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getRetirada() {
        return retirada;
    }

    public void setRetirada(double retirada) {
        this.retirada = retirada;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

}