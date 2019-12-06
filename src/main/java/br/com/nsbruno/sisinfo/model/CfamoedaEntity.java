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
@Table(name = "CFAMOEDA")
public class CfamoedaEntity {

    @Id
    @Column(name = "ID_CFAMOEDA", table = "CFAMOEDA", nullable = false)
    private Integer idCfamoeda;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAMOEDA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAMOEDA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAMOEDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAMOEDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAMOEDA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SIGLA", table = "CFAMOEDA", nullable = false, length = 5)
    private String sigla;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFAMOEDA", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "PLURAL", table = "CFAMOEDA", nullable = false, length = 40)
    private String plural;

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

}