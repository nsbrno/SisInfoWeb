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
@Table(name = "CCACLASI")
public class CcaclasiEntity {

    @Id
    @Column(name = "ID_CCACLASI", table = "CCACLASI", nullable = false)
    private Integer idCcaclasi;

    @Basic
    @Column(name = "US_CAD", table = "CCACLASI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CCACLASI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CCACLASI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CCACLASI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CCACLASI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "CCACLASI")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "CCACLASI", length = 40)
    private String descricao;

    @Basic
    @Column(name = "SQL", table = "CCACLASI", length = 128)
    private String sql;

    @Basic
    @Column(name = "TIPO", table = "CCACLASI")
    private String tipo;

    public Integer getIdCcaclasi() {
        return idCcaclasi;
    }

    public void setIdCcaclasi(Integer idCcaclasi) {
        this.idCcaclasi = idCcaclasi;
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

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}