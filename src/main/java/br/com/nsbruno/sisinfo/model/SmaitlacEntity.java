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
@Table(name = "SMAITLAC")
public class SmaitlacEntity {

    @Id
    @Column(name = "ID_SMAITLAC", table = "SMAITLAC", nullable = false)
    private Integer idSmaitlac;

    @Basic
    @Column(name = "ID_SMALOGAC", table = "SMAITLAC")
    private Integer idSmalogac;

    @Basic
    @Column(name = "DT_ALT", table = "SMAITLAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "ID_ARQUIVO", table = "SMAITLAC")
    private Integer idArquivo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAITLAC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "ACAO", table = "SMAITLAC")
    private String acao;

    @Basic
    @Column(name = "ARQUIVO", table = "SMAITLAC", length = 12)
    private String arquivo;

    public Integer getIdSmaitlac() {
        return idSmaitlac;
    }

    public void setIdSmaitlac(Integer idSmaitlac) {
        this.idSmaitlac = idSmaitlac;
    }

    public Integer getIdSmalogac() {
        return idSmalogac;
    }

    public void setIdSmalogac(Integer idSmalogac) {
        this.idSmalogac = idSmalogac;
    }

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(Integer idArquivo) {
        this.idArquivo = idArquivo;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

}