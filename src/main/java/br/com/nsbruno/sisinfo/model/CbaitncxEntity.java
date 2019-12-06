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
@Table(name = "CBAITNCX")
public class CbaitncxEntity {

    @Id
    @Column(name = "ID_CBAITNCX", table = "CBAITNCX", nullable = false)
    private Integer idCbaitncx;

    @Basic(optional = false)
    @Column(name = "ID_CBANUMCX", table = "CBAITNCX", nullable = false)
    private int idCbanumcx;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA", table = "CBAITNCX", nullable = false)
    private int idCbaplcta;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBAITNCX", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBAITNCX", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBAITNCX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBAITNCX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBAITNCX")
    private Integer ctInteg;

    public Integer getIdCbaitncx() {
        return idCbaitncx;
    }

    public void setIdCbaitncx(Integer idCbaitncx) {
        this.idCbaitncx = idCbaitncx;
    }

    public int getIdCbanumcx() {
        return idCbanumcx;
    }

    public void setIdCbanumcx(int idCbanumcx) {
        this.idCbanumcx = idCbanumcx;
    }

    public int getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(int idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
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

}