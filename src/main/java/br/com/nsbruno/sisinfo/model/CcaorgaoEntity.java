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
@Table(name = "CCAORGAO")
public class CcaorgaoEntity {

    @Id
    @Column(name = "ID_CCAORGAO", table = "CCAORGAO", nullable = false)
    private Integer idCcaorgao;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "CCAORGAO")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CCAORGAO")
    private Integer idCfaestad;

    @Basic
    @Column(name = "US_CAD", table = "CCAORGAO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CCAORGAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CCAORGAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CCAORGAO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CCAORGAO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "CCAORGAO")
    private Integer codigo;

    @Basic
    @Column(name = "NOME", table = "CCAORGAO", length = 60)
    private String nome;

    public Integer getIdCcaorgao() {
        return idCcaorgao;
    }

    public void setIdCcaorgao(Integer idCcaorgao) {
        this.idCcaorgao = idCcaorgao;
    }

    public Integer getIdCfacidad() {
        return idCfacidad;
    }

    public void setIdCfacidad(Integer idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}