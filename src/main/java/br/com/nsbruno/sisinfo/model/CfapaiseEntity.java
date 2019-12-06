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
@Table(name = "CFAPAISE")
public class CfapaiseEntity {

    @Id
    @Column(name = "ID_CFAPAISE", table = "CFAPAISE", nullable = false)
    private Integer idCfapaise;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAPAISE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAPAISE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAPAISE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAPAISE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAPAISE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFAPAISE", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "NACIONALIDADE", table = "CFAPAISE", nullable = false, length = 40)
    private String nacionalidade;

    @Basic
    @Column(name = "COD_BACEN", table = "CFAPAISE", length = 6)
    private String codBacen;

    public Integer getIdCfapaise() {
        return idCfapaise;
    }

    public void setIdCfapaise(Integer idCfapaise) {
        this.idCfapaise = idCfapaise;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCodBacen() {
        return codBacen;
    }

    public void setCodBacen(String codBacen) {
        this.codBacen = codBacen;
    }

}