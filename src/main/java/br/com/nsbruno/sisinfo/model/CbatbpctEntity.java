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
@Table(name = "CBATBPCT")
public class CbatbpctEntity {

    @Id
    @Column(name = "ID_CBATBPCT", table = "CBATBPCT", nullable = false)
    private Integer idCbatbpct;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBATBPCT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBATBPCT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBATBPCT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBATBPCT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBATBPCT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CBATBPCT", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CBATBPCT", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CBATBPCT", nullable = false)
    private String tipo;

    @Basic(optional = false)
    @Column(name = "TOTAL_GERAL", table = "CBATBPCT", nullable = false)
    private String totalGeral;

    public Integer getIdCbatbpct() {
        return idCbatbpct;
    }

    public void setIdCbatbpct(Integer idCbatbpct) {
        this.idCbatbpct = idCbatbpct;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTotalGeral() {
        return totalGeral;
    }

    public void setTotalGeral(String totalGeral) {
        this.totalGeral = totalGeral;
    }

}