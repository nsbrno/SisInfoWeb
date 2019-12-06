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
@Table(name = "AEAGRADE")
public class AeagradeEntity {

    @Id
    @Column(name = "ID_AEAGRADE", table = "AEAGRADE", nullable = false)
    private Integer idAeagrade;

    @Basic(optional = false)
    @Column(name = "ID_AEATPGRD", table = "AEAGRADE", nullable = false)
    private int idAeatpgrd;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAGRADE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAGRADE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAGRADE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAGRADE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAGRADE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAGRADE", nullable = false, length = 40)
    private String descricao;

    public Integer getIdAeagrade() {
        return idAeagrade;
    }

    public void setIdAeagrade(Integer idAeagrade) {
        this.idAeagrade = idAeagrade;
    }

    public int getIdAeatpgrd() {
        return idAeatpgrd;
    }

    public void setIdAeatpgrd(int idAeatpgrd) {
        this.idAeatpgrd = idAeatpgrd;
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

}