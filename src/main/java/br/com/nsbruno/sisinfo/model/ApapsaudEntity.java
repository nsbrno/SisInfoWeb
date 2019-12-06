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
@Table(name = "APAPSAUD")
public class ApapsaudEntity {

    @Id
    @Column(name = "ID_APAPSAUD", table = "APAPSAUD", nullable = false)
    private Integer idApapsaud;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APAPSAUD")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_APACOMUN", table = "APAPSAUD")
    private Integer idApacomun;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "APAPSAUD")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "APAPSAUD")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_CFALOGRA", table = "APAPSAUD")
    private Integer idCfalogra;

    @Basic
    @Column(name = "ID_CFABAIRO", table = "APAPSAUD")
    private Integer idCfabairo;

    @Basic
    @Column(name = "US_CAD", table = "APAPSAUD", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APAPSAUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APAPSAUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APAPSAUD")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APAPSAUD", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "FICHA", table = "APAPSAUD")
    private Integer ficha;

    @Basic
    @Column(name = "NOME", table = "APAPSAUD", length = 60)
    private String nome;

    @Basic
    @Column(name = "SEXO", table = "APAPSAUD")
    private String sexo;

    @Basic
    @Column(name = "DATA_NASCIMENTO", table = "APAPSAUD")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Basic
    @Column(name = "ESTADO_CIVIL", table = "APAPSAUD")
    private String estadoCivil;

    @Basic
    @Column(name = "ENDERECO", table = "APAPSAUD", length = 128)
    private String endereco;

    @Basic
    @Column(name = "NOME_MAE", table = "APAPSAUD", length = 60)
    private String nomeMae;

    @Basic
    @Column(name = "NOME_PAI", table = "APAPSAUD", length = 60)
    private String nomePai;

    @Lob
    @Basic
    @Column(name = "ANOTACOES", table = "APAPSAUD")
    private byte[] anotacoes;

    @Basic
    @Column(name = "NUMERO", table = "APAPSAUD")
    private Integer numero;

    @Basic
    @Column(name = "CEP", table = "APAPSAUD", length = 9)
    private String cep;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APAPSAUD")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "APAPSAUD")
    private Integer idCfaclifoComun;

    public Integer getIdApapsaud() {
        return idApapsaud;
    }

    public void setIdApapsaud(Integer idApapsaud) {
        this.idApapsaud = idApapsaud;
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

    public Integer getIdCfalogra() {
        return idCfalogra;
    }

    public void setIdCfalogra(Integer idCfalogra) {
        this.idCfalogra = idCfalogra;
    }

    public Integer getIdCfabairo() {
        return idCfabairo;
    }

    public void setIdCfabairo(Integer idCfabairo) {
        this.idCfabairo = idCfabairo;
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

    public Integer getFicha() {
        return ficha;
    }

    public void setFicha(Integer ficha) {
        this.ficha = ficha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public byte[] getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(byte[] anotacoes) {
        this.anotacoes = anotacoes;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

}