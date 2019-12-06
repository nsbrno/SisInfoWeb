package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "RPAPRORO")
public class RpaproroEntity {

    @Id
    @Column(name = "ID_RPAPRORO", table = "RPAPRORO", nullable = false)
    private Integer idRpaproro;

    @Basic(optional = false)
    @Column(name = "ID_RPAPARCE", table = "RPAPRORO", nullable = false)
    private int idRpaparce;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAPRORO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAPRORO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAPRORO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAPRORO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAPRORO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "RPAPRORO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "DT_VENCIMENTO", table = "RPAPRORO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Basic(optional = false)
    @Column(name = "DT_VENCIMENTO_ANT", table = "RPAPRORO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtVencimentoAnt;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "RPAPRORO", nullable = false)
    private double vlJuros;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPAPRORO")
    private byte[] obs;

    public Integer getIdRpaproro() {
        return idRpaproro;
    }

    public void setIdRpaproro(Integer idRpaproro) {
        this.idRpaproro = idRpaproro;
    }

    public int getIdRpaparce() {
        return idRpaparce;
    }

    public void setIdRpaparce(int idRpaparce) {
        this.idRpaparce = idRpaparce;
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

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtVencimentoAnt() {
        return dtVencimentoAnt;
    }

    public void setDtVencimentoAnt(Date dtVencimentoAnt) {
        this.dtVencimentoAnt = dtVencimentoAnt;
    }

    public double getVlJuros() {
        return vlJuros;
    }

    public void setVlJuros(double vlJuros) {
        this.vlJuros = vlJuros;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}