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
@Table(name = "AEALOCES")
public class AealocesEntity {

    @Id
    @Column(name = "ID_AEALOCES", table = "AEALOCES", nullable = false)
    private Integer idAealoces;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEALOCES", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "AEALOCES")
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEALOCES", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEALOCES", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEALOCES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEALOCES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEALOCES")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEALOCES", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEALOCES", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEALOCES", nullable = false)
    private String ativo;

    @Basic
    @Column(name = "IMPRESSORA", table = "AEALOCES", length = 128)
    private String impressora;

    @Basic
    @Column(name = "TIPO_VENDA", table = "AEALOCES")
    private String tipoVenda;

    public Integer getIdAealoces() {
        return idAealoces;
    }

    public void setIdAealoces(Integer idAealoces) {
        this.idAealoces = idAealoces;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public String getImpressora() {
        return impressora;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

}