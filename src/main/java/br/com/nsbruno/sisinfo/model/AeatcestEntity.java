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
@Table(name = "AEATCEST")
public class AeatcestEntity {

    @Id
    @Column(name = "ID_AEATCEST", table = "AEATCEST", nullable = false)
    private Integer idAeatcest;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEATCEST", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEATCEST", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEATCEST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEATCEST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEATCEST")
    private Integer ctInteg;

    @Basic
    @Column(name = "CEST", table = "AEATCEST", length = 13)
    private String cest;

    @Basic
    @Column(name = "NCM", table = "AEATCEST", length = 13)
    private String ncm;

    @Basic
    @Column(name = "DESCRICAO", table = "AEATCEST", length = 512)
    private String descricao;

    public Integer getIdAeatcest() {
        return idAeatcest;
    }

    public void setIdAeatcest(Integer idAeatcest) {
        this.idAeatcest = idAeatcest;
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

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}