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
@Table(name = "CTACTCUS")
public class CtactcusEntity {

    @Id
    @Column(name = "ID_CTACTCUS", table = "CTACTCUS", nullable = false)
    private Integer idCtactcus;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CTACTCUS", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CTAGRUPO", table = "CTACTCUS", nullable = false)
    private Integer idCtagrupo;

    @Basic
    @Column(name = "ID_CTACTCUS_ANT", table = "CTACTCUS")
    private Integer idCtactcusAnt;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CTACTCUS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CTACTCUS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CTACTCUS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CTACTCUS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CTACTCUS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "COD_REDUZ", table = "CTACTCUS", nullable = false)
    private Integer codReduz;

    @Basic(optional = false)
    @Column(name = "COD_ESTRUTURAL", table = "CTACTCUS", nullable = false, length = 26)
    private String codEstrutural;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CTACTCUS", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "DG", table = "CTACTCUS")
    private String dg;

    @Basic(optional = false)
    @Column(name = "DC", table = "CTACTCUS", nullable = false)
    private String dc;

    @Basic(optional = false)
    @Column(name = "NIVEL", table = "CTACTCUS", nullable = false)
    private Integer nivel;

    @Basic(optional = false)
    @Column(name = "A_S", table = "CTACTCUS", nullable = false)
    private String a_S;

    public Integer getIdCtactcus() {
        return idCtactcus;
    }

    public void setIdCtactcus(Integer idCtactcus) {
        this.idCtactcus = idCtactcus;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCtagrupo() {
        return idCtagrupo;
    }

    public void setIdCtagrupo(Integer idCtagrupo) {
        this.idCtagrupo = idCtagrupo;
    }

    public Integer getIdCtactcusAnt() {
        return idCtactcusAnt;
    }

    public void setIdCtactcusAnt(Integer idCtactcusAnt) {
        this.idCtactcusAnt = idCtactcusAnt;
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

    public Integer getCodReduz() {
        return codReduz;
    }

    public void setCodReduz(Integer codReduz) {
        this.codReduz = codReduz;
    }

    public String getCodEstrutural() {
        return codEstrutural;
    }

    public void setCodEstrutural(String codEstrutural) {
        this.codEstrutural = codEstrutural;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getA_S() {
        return a_S;
    }

    public void setA_S(String a_S) {
        this.a_S = a_S;
    }

}