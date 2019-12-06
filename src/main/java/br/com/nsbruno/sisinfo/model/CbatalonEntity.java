package br.com.nsbruno.sisinfo.model;

import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CBATALON")
public class CbatalonEntity {

    @Id
    @Column(name = "ID_CBATALON", table = "CBATALON", nullable = false)
    private Integer idCbatalon;

    @Basic(optional = false)
    @Column(name = "ID_CBACONTA", table = "CBATALON", nullable = false)
    private int idCbaconta;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBATALON", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBATALON", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBATALON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBATALON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBATALON")
    private Integer ctInteg;

    @Basic
    @Column(name = "SERIE", table = "CBATALON", length = 6)
    private String serie;

    @Basic(optional = false)
    @Column(name = "NUMERO_INI", table = "CBATALON", nullable = false)
    private int numeroIni;

    @Basic(optional = false)
    @Column(name = "NUMERO_FIM", table = "CBATALON", nullable = false)
    private int numeroFim;

    @Basic(optional = false)
    @Column(name = "USADOS", table = "CBATALON", nullable = false)
    private int usados;

    @Basic
    @Column(name = "FC_NUM_CHEQUES", table = "CBATALON")
    private BigInteger fcNumCheques;

    public Integer getIdCbatalon() {
        return idCbatalon;
    }

    public void setIdCbatalon(Integer idCbatalon) {
        this.idCbatalon = idCbatalon;
    }

    public int getIdCbaconta() {
        return idCbaconta;
    }

    public void setIdCbaconta(int idCbaconta) {
        this.idCbaconta = idCbaconta;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumeroIni() {
        return numeroIni;
    }

    public void setNumeroIni(int numeroIni) {
        this.numeroIni = numeroIni;
    }

    public int getNumeroFim() {
        return numeroFim;
    }

    public void setNumeroFim(int numeroFim) {
        this.numeroFim = numeroFim;
    }

    public int getUsados() {
        return usados;
    }

    public void setUsados(int usados) {
        this.usados = usados;
    }

    public BigInteger getFcNumCheques() {
        return fcNumCheques;
    }

    public void setFcNumCheques(BigInteger fcNumCheques) {
        this.fcNumCheques = fcNumCheques;
    }

}