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
@Table(name = "SMAARQGR")
public class SmaarqgrEntity {

    @Id
    @Column(name = "ID_SMAARQGR", table = "SMAARQGR", nullable = false)
    private Integer idSmaarqgr;

    @Basic
    @Column(name = "ID_SMAGRUPO", table = "SMAARQGR")
    private Integer idSmagrupo;

    @Basic
    @Column(name = "ID_SMAUSUAR", table = "SMAARQGR")
    private Integer idSmausuar;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMAARQGR")
    private Integer idSmaarqui;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAARQGR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAARQGR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAARQGR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAARQGR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAARQGR")
    private Integer ctInteg;

    @Basic
    @Column(name = "ACESSA", table = "SMAARQGR")
    private String acessa;

    @Basic
    @Column(name = "LIBERA", table = "SMAARQGR")
    private String libera;

    @Basic
    @Column(name = "INCLUI", table = "SMAARQGR")
    private String inclui;

    @Basic
    @Column(name = "ALTERA", table = "SMAARQGR")
    private String altera;

    @Basic
    @Column(name = "EXCLUI", table = "SMAARQGR")
    private String exclui;

    @Basic
    @Column(name = "ACESSA_CADASTRO", table = "SMAARQGR")
    private String acessaCadastro;

    public Integer getIdSmaarqgr() {
        return idSmaarqgr;
    }

    public void setIdSmaarqgr(Integer idSmaarqgr) {
        this.idSmaarqgr = idSmaarqgr;
    }

    public Integer getIdSmagrupo() {
        return idSmagrupo;
    }

    public void setIdSmagrupo(Integer idSmagrupo) {
        this.idSmagrupo = idSmagrupo;
    }

    public Integer getIdSmausuar() {
        return idSmausuar;
    }

    public void setIdSmausuar(Integer idSmausuar) {
        this.idSmausuar = idSmausuar;
    }

    public Integer getIdSmaarqui() {
        return idSmaarqui;
    }

    public void setIdSmaarqui(Integer idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
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

    public String getAcessa() {
        return acessa;
    }

    public void setAcessa(String acessa) {
        this.acessa = acessa;
    }

    public String getLibera() {
        return libera;
    }

    public void setLibera(String libera) {
        this.libera = libera;
    }

    public String getInclui() {
        return inclui;
    }

    public void setInclui(String inclui) {
        this.inclui = inclui;
    }

    public String getAltera() {
        return altera;
    }

    public void setAltera(String altera) {
        this.altera = altera;
    }

    public String getExclui() {
        return exclui;
    }

    public void setExclui(String exclui) {
        this.exclui = exclui;
    }

    public String getAcessaCadastro() {
        return acessaCadastro;
    }

    public void setAcessaCadastro(String acessaCadastro) {
        this.acessaCadastro = acessaCadastro;
    }

}