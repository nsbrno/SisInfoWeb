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
@Table(name = "CFAREFCL")
public class CfarefclEntity {

    @Id
    @Column(name = "ID_CFAREFCL", table = "CFAREFCL", nullable = false)
    private Integer idCfarefcl;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFAREFCL", nullable = false)
    private int idCfaclifo;

    @Basic
    @Column(name = "ID_CFAPROFI", table = "CFAREFCL")
    private Integer idCfaprofi;

    @Basic
    @Column(name = "ID_CFAREFER", table = "CFAREFCL")
    private Integer idCfarefer;

    @Basic
    @Column(name = "ID_CFATPDEP", table = "CFAREFCL")
    private Integer idCfatpdep;

    @Basic
    @Column(name = "ID_CFAPROFI_CARGO", table = "CFAREFCL")
    private Integer idCfaprofiCargo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAREFCL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAREFCL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAREFCL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAREFCL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAREFCL")
    private Integer ctInteg;

    @Basic
    @Column(name = "NOME", table = "CFAREFCL", length = 60)
    private String nome;

    @Basic
    @Column(name = "TIPO", table = "CFAREFCL")
    private String tipo;

    @Basic
    @Column(name = "SEXO", table = "CFAREFCL")
    private String sexo;

    @Basic
    @Column(name = "EMPRESA_TRAB", table = "CFAREFCL", length = 60)
    private String empresaTrab;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CFAREFCL")
    private byte[] complemento;

    public Integer getIdCfarefcl() {
        return idCfarefcl;
    }

    public void setIdCfarefcl(Integer idCfarefcl) {
        this.idCfarefcl = idCfarefcl;
    }

    public int getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaprofi() {
        return idCfaprofi;
    }

    public void setIdCfaprofi(Integer idCfaprofi) {
        this.idCfaprofi = idCfaprofi;
    }

    public Integer getIdCfarefer() {
        return idCfarefer;
    }

    public void setIdCfarefer(Integer idCfarefer) {
        this.idCfarefer = idCfarefer;
    }

    public Integer getIdCfatpdep() {
        return idCfatpdep;
    }

    public void setIdCfatpdep(Integer idCfatpdep) {
        this.idCfatpdep = idCfatpdep;
    }

    public Integer getIdCfaprofiCargo() {
        return idCfaprofiCargo;
    }

    public void setIdCfaprofiCargo(Integer idCfaprofiCargo) {
        this.idCfaprofiCargo = idCfaprofiCargo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

}