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
@Table(name = "AEAITGPR")
public class AeaitgprEntity {

    @Id
    @Column(name = "ID_AEAITGPR", table = "AEAITGPR", nullable = false)
    private Integer idAeaitgpr;

    @Basic(optional = false)
    @Column(name = "ID_AEAAGPPR", table = "AEAITGPR", nullable = false)
    private int idAeaagppr;

    @Basic
    @Column(name = "ID_AEAMARCA", table = "AEAITGPR")
    private Integer idAeamarca;

    @Basic
    @Column(name = "ID_AEAFAMIL", table = "AEAITGPR")
    private Integer idAeafamil;

    @Basic
    @Column(name = "ID_AEACLASE", table = "AEAITGPR")
    private Integer idAeaclase;

    @Basic
    @Column(name = "ID_AEAGRUPO", table = "AEAITGPR")
    private Integer idAeagrupo;

    @Basic
    @Column(name = "ID_AEASGRUP", table = "AEAITGPR")
    private Integer idAeasgrup;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "AEAITGPR")
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITGPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITGPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITGPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITGPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITGPR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEAITGPR", nullable = false)
    private int sequencia;

    public Integer getIdAeaitgpr() {
        return idAeaitgpr;
    }

    public void setIdAeaitgpr(Integer idAeaitgpr) {
        this.idAeaitgpr = idAeaitgpr;
    }

    public int getIdAeaagppr() {
        return idAeaagppr;
    }

    public void setIdAeaagppr(int idAeaagppr) {
        this.idAeaagppr = idAeaagppr;
    }

    public Integer getIdAeamarca() {
        return idAeamarca;
    }

    public void setIdAeamarca(Integer idAeamarca) {
        this.idAeamarca = idAeamarca;
    }

    public Integer getIdAeafamil() {
        return idAeafamil;
    }

    public void setIdAeafamil(Integer idAeafamil) {
        this.idAeafamil = idAeafamil;
    }

    public Integer getIdAeaclase() {
        return idAeaclase;
    }

    public void setIdAeaclase(Integer idAeaclase) {
        this.idAeaclase = idAeaclase;
    }

    public Integer getIdAeagrupo() {
        return idAeagrupo;
    }

    public void setIdAeagrupo(Integer idAeagrupo) {
        this.idAeagrupo = idAeagrupo;
    }

    public Integer getIdAeasgrup() {
        return idAeasgrup;
    }

    public void setIdAeasgrup(Integer idAeasgrup) {
        this.idAeasgrup = idAeasgrup;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
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

}