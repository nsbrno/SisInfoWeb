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
@Table(name = "CFAATUAL")
public class CfaatualEntity {

    @Id
    @Column(name = "ID_CFAATUAL", table = "CFAATUAL", nullable = false)
    private Integer idCfaatual;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFAATUAL")
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAATUAL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAATUAL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAATUAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAATUAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAATUAL")
    private Integer ctInteg;

    @Lob
    @Basic
    @Column(name = "MENSAGEM", table = "CFAATUAL")
    private byte[] mensagem;

    @Basic
    @Column(name = "PROCESSO", table = "CFAATUAL")
    private String processo;

    @Basic
    @Column(name = "PROCESSO_PASSO", table = "CFAATUAL")
    private String processoPasso;

    @Basic
    @Column(name = "PROCESSO_STATUS", table = "CFAATUAL")
    private String processoStatus;

    public Integer getIdCfaatual() {
        return idCfaatual;
    }

    public void setIdCfaatual(Integer idCfaatual) {
        this.idCfaatual = idCfaatual;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public byte[] getMensagem() {
        return mensagem;
    }

    public void setMensagem(byte[] mensagem) {
        this.mensagem = mensagem;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public String getProcessoPasso() {
        return processoPasso;
    }

    public void setProcessoPasso(String processoPasso) {
        this.processoPasso = processoPasso;
    }

    public String getProcessoStatus() {
        return processoStatus;
    }

    public void setProcessoStatus(String processoStatus) {
        this.processoStatus = processoStatus;
    }

}