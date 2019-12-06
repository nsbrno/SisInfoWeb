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
@Table(name = "AEAITROM")
public class AeaitromEntity {

    @Id
    @Column(name = "ID_AEAITROM", table = "AEAITROM", nullable = false)
    private Integer idAeaitrom;

    @Basic(optional = false)
    @Column(name = "ID_AEAROMAN", table = "AEAITROM", nullable = false)
    private int idAearoman;

    @Basic(optional = false)
    @Column(name = "ID_AEASAIDA", table = "AEAITROM", nullable = false)
    private int idAeasaida;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITROM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITROM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITROM")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEAITROM", nullable = false)
    private int sequencia;

    @Basic(optional = false)
    @Column(name = "VL_SAIDA", table = "AEAITROM", nullable = false)
    private double vlSaida;

    @Basic
    @Column(name = "CONFERIDO", table = "AEAITROM")
    private String conferido;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "AEAITROM", nullable = false)
    private short situacao;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAITROM")
    private byte[] obs;

    public Integer getIdAeaitrom() {
        return idAeaitrom;
    }

    public void setIdAeaitrom(Integer idAeaitrom) {
        this.idAeaitrom = idAeaitrom;
    }

    public int getIdAearoman() {
        return idAearoman;
    }

    public void setIdAearoman(int idAearoman) {
        this.idAearoman = idAearoman;
    }

    public int getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(int idAeasaida) {
        this.idAeasaida = idAeasaida;
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

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getVlSaida() {
        return vlSaida;
    }

    public void setVlSaida(double vlSaida) {
        this.vlSaida = vlSaida;
    }

    public String getConferido() {
        return conferido;
    }

    public void setConferido(String conferido) {
        this.conferido = conferido;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}