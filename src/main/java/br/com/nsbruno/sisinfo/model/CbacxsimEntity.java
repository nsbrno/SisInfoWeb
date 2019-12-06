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
@Table(name = "CBACXSIM")
public class CbacxsimEntity {

    @Id
    @Column(name = "ID_CBACXSIM", table = "CBACXSIM", nullable = false)
    private Integer idCbacxsim;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CBACXSIM", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CBANUMCX", table = "CBACXSIM", nullable = false)
    private int idCbanumcx;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA", table = "CBACXSIM", nullable = false)
    private int idCbaplcta;

    @Basic
    @Column(name = "ID_CBACTCUS", table = "CBACXSIM")
    private Integer idCbactcus;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBACXSIM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBACXSIM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBACXSIM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBACXSIM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBACXSIM")
    private Integer ctInteg;

    @Basic
    @Column(name = "D_C", table = "CBACXSIM")
    private String dC;

    @Basic
    @Column(name = "DT_LANCAMENTO", table = "CBACXSIM")
    @Temporal(TemporalType.DATE)
    private Date dtLancamento;

    @Basic(optional = false)
    @Column(name = "VL_LANCAMENTO", table = "CBACXSIM", nullable = false)
    private double vlLancamento;

    @Basic
    @Column(name = "HISTORICO", table = "CBACXSIM", length = 256)
    private String historico;

    public Integer getIdCbacxsim() {
        return idCbacxsim;
    }

    public void setIdCbacxsim(Integer idCbacxsim) {
        this.idCbacxsim = idCbacxsim;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public Integer getIdCbactcus() {
        return idCbactcus;
    }

    public void setIdCbactcus(Integer idCbactcus) {
        this.idCbactcus = idCbactcus;
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

    public String getDC() {
        return dC;
    }

    public void setDC(String dC) {
        this.dC = dC;
    }

    public Date getDtLancamento() {
        return dtLancamento;
    }

    public void setDtLancamento(Date dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    public double getVlLancamento() {
        return vlLancamento;
    }

    public void setVlLancamento(double vlLancamento) {
        this.vlLancamento = vlLancamento;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

}