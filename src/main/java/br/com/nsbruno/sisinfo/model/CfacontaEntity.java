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
@Table(name = "CFACONTA")
public class CfacontaEntity {

    @Id
    @Column(name = "ID_CFACONTA", table = "CFACONTA", nullable = false)
    private Integer idCfaconta;

    @Basic
    @Column(name = "ID_CFAPROFI_CARGO", table = "CFACONTA")
    private Integer idCfaprofiCargo;

    @Basic
    @Column(name = "ID_CFAPROFI", table = "CFACONTA")
    private Integer idCfaprofi;

    @Basic
    @Column(name = "ID_CFAPARTI", table = "CFACONTA")
    private Integer idCfaparti;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFACONTA", nullable = false)
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFATIMEF", table = "CFACONTA")
    private Integer idCfatimef;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFACONTA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFACONTA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFACONTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFACONTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFACONTA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NOME", table = "CFACONTA", nullable = false, length = 60)
    private String nome;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "CFACONTA")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Basic
    @Column(name = "SEXO", table = "CFACONTA")
    private String sexo;

    @Basic
    @Column(name = "FUMANTE", table = "CFACONTA")
    private String fumante;

    @Basic
    @Column(name = "TIPO", table = "CFACONTA")
    private String tipo;

    @Basic
    @Column(name = "EMPRESA_TRAB", table = "CFACONTA", length = 60)
    private String empresaTrab;

    public Integer getIdCfaconta() {
        return idCfaconta;
    }

    public void setIdCfaconta(Integer idCfaconta) {
        this.idCfaconta = idCfaconta;
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

    public Integer getIdCfaparti() {
        return idCfaparti;
    }

    public void setIdCfaparti(Integer idCfaparti) {
        this.idCfaparti = idCfaparti;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfatimef() {
        return idCfatimef;
    }

    public void setIdCfatimef(Integer idCfatimef) {
        this.idCfatimef = idCfatimef;
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

    public String getFumante() {
        return fumante;
    }

    public void setFumante(String fumante) {
        this.fumante = fumante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmpresaTrab() {
        return empresaTrab;
    }

    public void setEmpresaTrab(String empresaTrab) {
        this.empresaTrab = empresaTrab;
    }

}