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
import lombok.Data;

@Entity
@Table(name = "CFAENDER")
@Data
public class CfaenderEntity {

    @Id
    @Column(name = "ID_CFAENDER", table = "CFAENDER", nullable = false)
    private Integer idCfaender;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CFAENDER")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "CFAENDER")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_CFABAIRO", table = "CFAENDER")
    private Integer idCfabairo;

    @Basic
    @Column(name = "ID_CFALOGRA", table = "CFAENDER")
    private Integer idCfalogra;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "CFAENDER")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFACONTA", table = "CFAENDER")
    private Integer idCfaconta;

    @Basic
    @Column(name = "ID_CFADEPEN", table = "CFAENDER")
    private Integer idCfadepen;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFAENDER")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFASOCPA", table = "CFAENDER")
    private Integer idCfasocpa;

    @Basic
    @Column(name = "ID_CFAREFCL", table = "CFAENDER")
    private Integer idCfarefcl;

    @Basic
    @Column(name = "ID_CFAREFER", table = "CFAENDER")
    private Integer idCfarefer;

    @Basic
    @Column(name = "ID_APACATEQ", table = "CFAENDER")
    private Integer idApacateq;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAENDER", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAENDER", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAENDER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAENDER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAENDER")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CFAENDER", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "NUMERO", table = "CFAENDER", length = 6)
    private String numero;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CFAENDER")
    private byte[] complemento;

    @Basic
    @Column(name = "EMAIL", table = "CFAENDER", length = 128)
    private String email;

    @Basic
    @Column(name = "INTERNET", table = "CFAENDER", length = 128)
    private String Integerernet;

    @Basic
    @Column(name = "LETRA_CX_POSTAL", table = "CFAENDER")
    private String letraCxPostal;

    @Basic
    @Column(name = "CAIXA_POSTAL", table = "CFAENDER")
    private Integer caixaPostal;

    @Basic
    @Column(name = "LOGRADOURO", table = "CFAENDER", length = 60)
    private String logradouro;

    @Basic
    @Column(name = "CEP", table = "CFAENDER", length = 9)
    private String cep;

    @Basic
    @Column(name = "CEP_CAIXA_POSTAL", table = "CFAENDER", length = 9)
    private String cepCaixaPostal;

    public Integer getIdCfaender() {
        return idCfaender;
    }

    public void setIdCfaender(Integer idCfaender) {
        this.idCfaender = idCfaender;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
    }

    public Integer getIdCfacidad() {
        return idCfacidad;
    }

    public void setIdCfacidad(Integer idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public Integer getIdCfabairo() {
        return idCfabairo;
    }

    public void setIdCfabairo(Integer idCfabairo) {
        this.idCfabairo = idCfabairo;
    }

    public Integer getIdCfalogra() {
        return idCfalogra;
    }

    public void setIdCfalogra(Integer idCfalogra) {
        this.idCfalogra = idCfalogra;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfaconta() {
        return idCfaconta;
    }

    public void setIdCfaconta(Integer idCfaconta) {
        this.idCfaconta = idCfaconta;
    }

    public Integer getIdCfadepen() {
        return idCfadepen;
    }

    public void setIdCfadepen(Integer idCfadepen) {
        this.idCfadepen = idCfadepen;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfasocpa() {
        return idCfasocpa;
    }

    public void setIdCfasocpa(Integer idCfasocpa) {
        this.idCfasocpa = idCfasocpa;
    }

    public Integer getIdCfarefcl() {
        return idCfarefcl;
    }

    public void setIdCfarefcl(Integer idCfarefcl) {
        this.idCfarefcl = idCfarefcl;
    }

    public Integer getIdCfarefer() {
        return idCfarefer;
    }

    public void setIdCfarefer(Integer idCfarefer) {
        this.idCfarefer = idCfarefer;
    }

    public Integer getIdApacateq() {
        return idApacateq;
    }

    public void setIdApacateq(Integer idApacateq) {
        this.idApacateq = idApacateq;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInternet() {
        return Integerernet;
    }

    public void setInternet(String Integerernet) {
        this.Integerernet = Integerernet;
    }

    public String getLetraCxPostal() {
        return letraCxPostal;
    }

    public void setLetraCxPostal(String letraCxPostal) {
        this.letraCxPostal = letraCxPostal;
    }

    public Integer getCaixaPostal() {
        return caixaPostal;
    }

    public void setCaixaPostal(Integer caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCepCaixaPostal() {
        return cepCaixaPostal;
    }

    public void setCepCaixaPostal(String cepCaixaPostal) {
        this.cepCaixaPostal = cepCaixaPostal;
    }

}