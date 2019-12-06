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
@Table(name = "CPABANCO")
public class CpabancoEntity {

    @Id
    @Column(name = "ID_CPABANCO", table = "CPABANCO", nullable = false)
    private Integer idCpabanco;

    @Basic
    @Column(name = "ID_CPAAPONT", table = "CPABANCO")
    private Integer idCpaapont;

    @Basic
    @Column(name = "US_CAD", table = "CPABANCO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPABANCO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPABANCO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPABANCO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPABANCO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "ARQUIVO", table = "CPABANCO", length = 12)
    private String arquivo;

    @Basic
    @Column(name = "SEQUENCIA", table = "CPABANCO")
    private Integer sequencia;

    @Basic
    @Column(name = "LINHA", table = "CPABANCO", length = 600)
    private String linha;

    @Basic
    @Column(name = "CONFIRMOU", table = "CPABANCO")
    private String confirmou;

    @Basic
    @Column(name = "RETORNOU", table = "CPABANCO")
    private String retornou;

    public Integer getIdCpabanco() {
        return idCpabanco;
    }

    public void setIdCpabanco(Integer idCpabanco) {
        this.idCpabanco = idCpabanco;
    }

    public Integer getIdCpaapont() {
        return idCpaapont;
    }

    public void setIdCpaapont(Integer idCpaapont) {
        this.idCpaapont = idCpaapont;
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

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getConfirmou() {
        return confirmou;
    }

    public void setConfirmou(String confirmou) {
        this.confirmou = confirmou;
    }

    public String getRetornou() {
        return retornou;
    }

    public void setRetornou(String retornou) {
        this.retornou = retornou;
    }

}