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
@Table(name = "CBACAIXA")
public class CbacaixaEntity {

    @Id
    @Column(name = "ID_CBACAIXA", table = "CBACAIXA", nullable = false)
    private Integer idCbacaixa;

    @Basic(optional = false)
    @Column(name = "ID_CBANUMCX", table = "CBACAIXA", nullable = false)
    private int idCbanumcx;

    @Basic(optional = false)
    @Column(name = "ID_CBALOTES", table = "CBACAIXA", nullable = false)
    private int idCbalotes;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBACAIXA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBACAIXA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBACAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBACAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBACAIXA")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "CBACAIXA")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "CBACAIXA", nullable = false)
    private short situacao;

    public Integer getIdCbacaixa() {
        return idCbacaixa;
    }

    public void setIdCbacaixa(Integer idCbacaixa) {
        this.idCbacaixa = idCbacaixa;
    }

    public int getIdCbanumcx() {
        return idCbanumcx;
    }

    public void setIdCbanumcx(int idCbanumcx) {
        this.idCbanumcx = idCbanumcx;
    }

    public int getIdCbalotes() {
        return idCbalotes;
    }

    public void setIdCbalotes(int idCbalotes) {
        this.idCbalotes = idCbalotes;
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

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

}