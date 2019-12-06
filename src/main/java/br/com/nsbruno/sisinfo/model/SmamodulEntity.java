package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "SMAMODUL")
@Data
public class SmamodulEntity {

    @Id
    @Column(name = "ID_SMAMODUL", table = "SMAMODUL", nullable = false)
    private Integer idSmamodul;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAMODUL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAMODUL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAMODUL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAMODUL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAMODUL")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "MODULO", table = "SMAMODUL", nullable = false, length = 12)
    private String modulo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "SMAMODUL", nullable = false, length = 40)
    private String descricao;

    public Integer getIdSmamodul() {
        return idSmamodul;
    }

    public void setIdSmamodul(Integer idSmamodul) {
        this.idSmamodul = idSmamodul;
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

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}