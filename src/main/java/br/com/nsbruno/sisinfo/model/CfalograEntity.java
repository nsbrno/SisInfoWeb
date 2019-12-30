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
@Table(name = "CFALOGRA")
public class CfalograEntity {

    @Id
    @Column(name = "ID_CFALOGRA", table = "CFALOGRA", nullable = false)
    private Integer idCfalogra;

    @Basic(optional = false)
    @Column(name = "ID_CFACIDAD", table = "CFALOGRA", nullable = false)
    private Integer idCfacidad;

    @Basic(optional = false)
    @Column(name = "ID_CFABAIRO", table = "CFALOGRA", nullable = false)
    private Integer idCfabairo;

    @Basic(optional = false)
    @Column(name = "ID_CFATPLOG", table = "CFALOGRA", nullable = false)
    private Integer idCfatplog;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFALOGRA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFALOGRA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFALOGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFALOGRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFALOGRA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFALOGRA", nullable = false, length = 60)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "CEP", table = "CFALOGRA", nullable = false, length = 9)
    private String cep;

    @Basic(optional = false)
    @Column(name = "DE", table = "CFALOGRA", nullable = false)
    private double de;

    @Basic(optional = false)
    @Column(name = "ATE", table = "CFALOGRA", nullable = false)
    private double ate;

    @Basic
    @Column(name = "PAR_IMPAR", table = "CFALOGRA")
    private String parImpar;

    @Basic
    @Column(name = "DDD", table = "CFALOGRA")
    private Integer ddd;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CFALOGRA")
    private byte[] complemento;

    public Integer getIdCfalogra() {
        return idCfalogra;
    }

    public void setIdCfalogra(Integer idCfalogra) {
        this.idCfalogra = idCfalogra;
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

    public Integer getIdCfatplog() {
        return idCfatplog;
    }

    public void setIdCfatplog(Integer idCfatplog) {
        this.idCfatplog = idCfatplog;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public double getDe() {
        return de;
    }

    public void setDe(double de) {
        this.de = de;
    }

    public double getAte() {
        return ate;
    }

    public void setAte(double ate) {
        this.ate = ate;
    }

    public String getParImpar() {
        return parImpar;
    }

    public void setParImpar(String parImpar) {
        this.parImpar = parImpar;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

}