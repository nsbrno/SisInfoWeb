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
@Table(name = "GCATPLOC")
public class GcatplocEntity {

    @Id
    @Column(name = "ID_GCATPLOC", table = "GCATPLOC", nullable = false)
    private Integer idGcatploc;

    @Basic
    @Column(name = "US_CAD", table = "GCATPLOC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "GCATPLOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "GCATPLOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "GCATPLOC")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "GCATPLOC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "GCATPLOC")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "GCATPLOC", length = 40)
    private String descricao;

    @Basic
    @Column(name = "ATIVO", table = "GCATPLOC")
    private String ativo;

    @Basic(optional = false)
    @Column(name = "NUMERO_DIAS", table = "GCATPLOC", nullable = false)
    private int numeroDias;

    public Integer getIdGcatploc() {
        return idGcatploc;
    }

    public void setIdGcatploc(Integer idGcatploc) {
        this.idGcatploc = idGcatploc;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

}