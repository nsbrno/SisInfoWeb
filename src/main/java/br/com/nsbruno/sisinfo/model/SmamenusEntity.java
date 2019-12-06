package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "SMAMENUS")
@Data
public class SmamenusEntity {

    @Id
    @Column(name = "ID_SMAMENUS", table = "SMAMENUS", nullable = false)
    private Integer idSmamenus;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAMENUS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAMENUS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAMENUS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAMENUS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAMENUS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NOME", table = "SMAMENUS", nullable = false, length = 12)
    private String nome;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "SMAMENUS", nullable = false, length = 60)
    private String descricao;

    public Integer getIdSmamenus() {
        return idSmamenus;
    }

    public void setIdSmamenus(Integer idSmamenus) {
        this.idSmamenus = idSmamenus;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}