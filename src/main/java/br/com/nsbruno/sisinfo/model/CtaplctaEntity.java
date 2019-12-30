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
@Table(name = "CTAPLCTA")
public class CtaplctaEntity {

    @Id
    @Column(name = "ID_CTAPLCTA", table = "CTAPLCTA", nullable = false)
    private Integer idCtaplcta;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "CTAPLCTA")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CTAGRUPO", table = "CTAPLCTA")
    private Integer idCtagrupo;

    @Basic
    @Column(name = "ID_CTAPLCTA_ANT", table = "CTAPLCTA")
    private Integer idCtaplctaAnt;

    @Basic
    @Column(name = "ID_CTAPLCTA_DEST", table = "CTAPLCTA")
    private Integer idCtaplctaDest;

    @Basic
    @Column(name = "ID_CTAPLCTA_TRANSF", table = "CTAPLCTA")
    private Integer idCtaplctaTransf;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CTAPLCTA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CTAPLCTA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CTAPLCTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CTAPLCTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CTAPLCTA")
    private Integer ctInteg;

    @Basic
    @Column(name = "COD_REDUZ", table = "CTAPLCTA")
    private Integer codReduz;

    @Basic
    @Column(name = "COD_ESTRUTURAL", table = "CTAPLCTA", length = 26)
    private String codEstrutural;

    @Basic
    @Column(name = "DESCRICAO", table = "CTAPLCTA", length = 40)
    private String descricao;

    @Basic
    @Column(name = "DC", table = "CTAPLCTA")
    private String dc;

    @Basic
    @Column(name = "DG", table = "CTAPLCTA")
    private String dg;

    @Basic(optional = false)
    @Column(name = "NIVEL", table = "CTAPLCTA", nullable = false)
    private Integer nivel;

    @Basic
    @Column(name = "A_S", table = "CTAPLCTA")
    private String a_S;

    public Integer getIdCtaplcta() {
        return idCtaplcta;
    }

    public void setIdCtaplcta(Integer idCtaplcta) {
        this.idCtaplcta = idCtaplcta;
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

    public Integer getIdCtaplctaAnt() {
        return idCtaplctaAnt;
    }

    public void setIdCtaplctaAnt(Integer idCtaplctaAnt) {
        this.idCtaplctaAnt = idCtaplctaAnt;
    }

    public Integer getIdCtaplctaDest() {
        return idCtaplctaDest;
    }

    public void setIdCtaplctaDest(Integer idCtaplctaDest) {
        this.idCtaplctaDest = idCtaplctaDest;
    }

    public Integer getIdCtaplctaTransf() {
        return idCtaplctaTransf;
    }

    public void setIdCtaplctaTransf(Integer idCtaplctaTransf) {
        this.idCtaplctaTransf = idCtaplctaTransf;
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

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
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