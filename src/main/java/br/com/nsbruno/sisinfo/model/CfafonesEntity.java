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
@Table(name = "CFAFONES")
public class CfafonesEntity {

    @Id
    @Column(name = "ID_CFAFONES", table = "CFAFONES", nullable = false)
    private Integer idCfafones;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "CFAFONES")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFADEPEN", table = "CFAFONES")
    private Integer idCfadepen;

    @Basic
    @Column(name = "ID_CFACONTA", table = "CFAFONES")
    private Integer idCfaconta;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFAFONES")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFASOCPA", table = "CFAFONES")
    private Integer idCfasocpa;

    @Basic
    @Column(name = "ID_CFAREFCL", table = "CFAFONES")
    private Integer idCfarefcl;

    @Basic
    @Column(name = "ID_CFAREFER", table = "CFAFONES")
    private Integer idCfarefer;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAFONES", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAFONES", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAFONES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAFONES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAFONES")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CFAFONES", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "MODELO", table = "CFAFONES", length = 5)
    private String modelo;

    @Basic
    @Column(name = "DDD", table = "CFAFONES")
    private Integer ddd;

    @Basic(optional = false)
    @Column(name = "FONE", table = "CFAFONES", nullable = false, length = 15)
    private String fone;

    @Basic
    @Column(name = "FC_DDD_FONE", table = "CFAFONES", length = 0)
    private String fcDddFone;

    @Lob
    @Basic
    @Column(name = "COMENTARIO", table = "CFAFONES")
    private byte[] comentario;

    @Basic(optional = false)
    @Column(name = "RAMAL", table = "CFAFONES", nullable = false)
    private int ramal;

    public Integer getIdCfafones() {
        return idCfafones;
    }

    public void setIdCfafones(Integer idCfafones) {
        this.idCfafones = idCfafones;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfadepen() {
        return idCfadepen;
    }

    public void setIdCfadepen(Integer idCfadepen) {
        this.idCfadepen = idCfadepen;
    }

    public Integer getIdCfaconta() {
        return idCfaconta;
    }

    public void setIdCfaconta(Integer idCfaconta) {
        this.idCfaconta = idCfaconta;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFcDddFone() {
        return fcDddFone;
    }

    public void setFcDddFone(String fcDddFone) {
        this.fcDddFone = fcDddFone;
    }

    public byte[] getComentario() {
        return comentario;
    }

    public void setComentario(byte[] comentario) {
        this.comentario = comentario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

}