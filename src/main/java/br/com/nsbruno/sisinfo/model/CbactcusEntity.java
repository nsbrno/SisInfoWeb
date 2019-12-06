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
@Table(name = "CBACTCUS")
public class CbactcusEntity {

    @Id
    @Column(name = "ID_CBACTCUS", table = "CBACTCUS", nullable = false)
    private Integer idCbactcus;

    @Basic
    @Column(name = "ID_CTAGRUPO", table = "CBACTCUS")
    private Integer idCtagrupo;

    @Basic
    @Column(name = "ID_CBACTCUS_ANT", table = "CBACTCUS")
    private Integer idCbactcusAnt;

    @Basic
    @Column(name = "US_CAD", table = "CBACTCUS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBACTCUS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBACTCUS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBACTCUS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBACTCUS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "COD_REDUZ", table = "CBACTCUS")
    private Integer codReduz;

    @Basic
    @Column(name = "COD_ESTRUTURAL", table = "CBACTCUS", length = 26)
    private String codEstrutural;

    @Basic
    @Column(name = "DESCRICAO", table = "CBACTCUS", length = 40)
    private String descricao;

    @Basic
    @Column(name = "DG", table = "CBACTCUS")
    private String dg;

    @Basic(optional = false)
    @Column(name = "NIVEL", table = "CBACTCUS", nullable = false)
    private int nivel;

    @Basic
    @Column(name = "A_S", table = "CBACTCUS")
    private String a_S;

    @Basic
    @Column(name = "D_C", table = "CBACTCUS")
    private String dC;

    public Integer getIdCbactcus() {
        return idCbactcus;
    }

    public void setIdCbactcus(Integer idCbactcus) {
        this.idCbactcus = idCbactcus;
    }

    public Integer getIdCtagrupo() {
        return idCtagrupo;
    }

    public void setIdCtagrupo(Integer idCtagrupo) {
        this.idCtagrupo = idCtagrupo;
    }

    public Integer getIdCbactcusAnt() {
        return idCbactcusAnt;
    }

    public void setIdCbactcusAnt(Integer idCbactcusAnt) {
        this.idCbactcusAnt = idCbactcusAnt;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getA_S() {
        return a_S;
    }

    public void setA_S(String a_S) {
        this.a_S = a_S;
    }

    public String getDC() {
        return dC;
    }

    public void setDC(String dC) {
        this.dC = dC;
    }

}