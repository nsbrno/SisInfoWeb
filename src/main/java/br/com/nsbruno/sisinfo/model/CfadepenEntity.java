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
@Table(name = "CFADEPEN")
public class CfadepenEntity {

    @Id
    @Column(name = "ID_CFADEPEN", table = "CFADEPEN", nullable = false)
    private Integer idCfadepen;

    @Basic
    @Column(name = "ID_CFAPROFI_CARGO", table = "CFADEPEN")
    private Integer idCfaprofiCargo;

    @Basic
    @Column(name = "ID_CFAPROFI", table = "CFADEPEN")
    private Integer idCfaprofi;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFADEPEN", nullable = false)
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFAPARTI", table = "CFADEPEN")
    private Integer idCfaparti;

    @Basic
    @Column(name = "ID_CFATIMEF", table = "CFADEPEN")
    private Integer idCfatimef;

    @Basic
    @Column(name = "ID_CFATPDEP", table = "CFADEPEN")
    private Integer idCfatpdep;

    @Basic
    @Column(name = "ID_APAPASTO", table = "CFADEPEN")
    private Integer idApapasto;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFADEPEN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFADEPEN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFADEPEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFADEPEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFADEPEN")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NOME", table = "CFADEPEN", nullable = false, length = 60)
    private String nome;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "CFADEPEN")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Basic
    @Column(name = "SEXO", table = "CFADEPEN")
    private String sexo;

    @Basic
    @Column(name = "EMPRESA_TRAB", table = "CFADEPEN", length = 60)
    private String empresaTrab;

    @Basic(optional = false)
    @Column(name = "RENDA", table = "CFADEPEN", nullable = false)
    private double renda;

    @Basic
    @Column(name = "PODE_COMPRAR", table = "CFADEPEN")
    private String podeComprar;

    @Basic
    @Column(name = "CPF", table = "CFADEPEN", length = 18)
    private String cpf;

    @Basic
    @Column(name = "RG", table = "CFADEPEN", length = 18)
    private String rg;

    @Basic
    @Column(name = "FUMANTE", table = "CFADEPEN")
    private String fumante;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CFADEPEN")
    private byte[] complemento;

    @Basic
    @Column(name = "TEMPO_CONTRIBUICAO", table = "CFADEPEN", length = 40)
    private String tempoContribuicao;

    @Basic
    @Column(name = "PARTICIPA_PASTORAL", table = "CFADEPEN")
    private String participaPastoral;

    @Basic
    @Column(name = "CONTRIBUINTE", table = "CFADEPEN")
    private String contribuIntegere;

    public Integer getIdCfadepen() {
        return idCfadepen;
    }

    public void setIdCfadepen(Integer idCfadepen) {
        this.idCfadepen = idCfadepen;
    }

    public Integer getIdCfaprofiCargo() {
        return idCfaprofiCargo;
    }

    public void setIdCfaprofiCargo(Integer idCfaprofiCargo) {
        this.idCfaprofiCargo = idCfaprofiCargo;
    }

    public Integer getIdCfaprofi() {
        return idCfaprofi;
    }

    public void setIdCfaprofi(Integer idCfaprofi) {
        this.idCfaprofi = idCfaprofi;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaparti() {
        return idCfaparti;
    }

    public void setIdCfaparti(Integer idCfaparti) {
        this.idCfaparti = idCfaparti;
    }

    public Integer getIdCfatimef() {
        return idCfatimef;
    }

    public void setIdCfatimef(Integer idCfatimef) {
        this.idCfatimef = idCfatimef;
    }

    public Integer getIdCfatpdep() {
        return idCfatpdep;
    }

    public void setIdCfatpdep(Integer idCfatpdep) {
        this.idCfatpdep = idCfatpdep;
    }

    public Integer getIdApapasto() {
        return idApapasto;
    }

    public void setIdApapasto(Integer idApapasto) {
        this.idApapasto = idApapasto;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmpresaTrab() {
        return empresaTrab;
    }

    public void setEmpresaTrab(String empresaTrab) {
        this.empresaTrab = empresaTrab;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getPodeComprar() {
        return podeComprar;
    }

    public void setPodeComprar(String podeComprar) {
        this.podeComprar = podeComprar;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFumante() {
        return fumante;
    }

    public void setFumante(String fumante) {
        this.fumante = fumante;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
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

    public String getContribuIntegere() {
        return contribuIntegere;
    }

    public void setContribuIntegere(String contribuIntegere) {
        this.contribuIntegere = contribuIntegere;
    }

}