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
@Table(name = "AEAUNVEN")
public class AeaunvenEntity {

    @Id
    @Column(name = "ID_AEAUNVEN", table = "AEAUNVEN", nullable = false)
    private Integer idAeaunven;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAUNVEN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAUNVEN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAUNVEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAUNVEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAUNVEN")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SIGLA", table = "AEAUNVEN", nullable = false, length = 3)
    private String sigla;

    @Basic(optional = false)
    @Column(name = "DESCRICAO_PLURAL", table = "AEAUNVEN", nullable = false, length = 40)
    private String descricaoPlural;

    @Basic(optional = false)
    @Column(name = "DESCRICAO_SINGULAR", table = "AEAUNVEN", nullable = false, length = 40)
    private String descricaoSingular;

    @Basic(optional = false)
    @Column(name = "DECIMAIS", table = "AEAUNVEN", nullable = false)
    private int decimais;

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
        this.idAeaunven = idAeaunven;
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

    public String getDescricaoPlural() {
        return descricaoPlural;
    }

    public void setDescricaoPlural(String descricaoPlural) {
        this.descricaoPlural = descricaoPlural;
    }

    public String getDescricaoSingular() {
        return descricaoSingular;
    }

    public void setDescricaoSingular(String descricaoSingular) {
        this.descricaoSingular = descricaoSingular;
    }

    public int getDecimais() {
        return decimais;
    }

    public void setDecimais(int decimais) {
        this.decimais = decimais;
    }

}