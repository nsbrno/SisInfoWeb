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
@Table(name = "CCACARGO")
public class CcacargoEntity {

    @Id
    @Column(name = "ID_CCACARGO", table = "CCACARGO", nullable = false)
    private Integer idCcacargo;

    @Basic
    @Column(name = "ID_CCAESCOL", table = "CCACARGO")
    private Integer idCcaescol;

    @Basic
    @Column(name = "ID_CCACONCU", table = "CCACARGO")
    private Integer idCcaconcu;

    @Basic
    @Column(name = "DT_CAD", table = "CCACARGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "US_CAD", table = "CCACARGO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_ALT", table = "CCACARGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CCACARGO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CCACARGO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "CCACARGO")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "CCACARGO", length = 128)
    private String descricao;

    @Basic
    @Column(name = "VAGAS", table = "CCACARGO")
    private Integer vagas;

    @Basic(optional = false)
    @Column(name = "SALARIO", table = "CCACARGO", nullable = false)
    private double salario;

    public Integer getIdCcacargo() {
        return idCcacargo;
    }

    public void setIdCcacargo(Integer idCcacargo) {
        this.idCcacargo = idCcacargo;
    }

    public Integer getIdCcaescol() {
        return idCcaescol;
    }

    public void setIdCcaescol(Integer idCcaescol) {
        this.idCcaescol = idCcaescol;
    }

    public Integer getIdCcaconcu() {
        return idCcaconcu;
    }

    public void setIdCcaconcu(Integer idCcaconcu) {
        this.idCcaconcu = idCcaconcu;
    }

    public Date getDtCad() {
        return dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public String getUsCad() {
        return usCad;
    }

    public void setUsCad(String usCad) {
        this.usCad = usCad;
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

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}