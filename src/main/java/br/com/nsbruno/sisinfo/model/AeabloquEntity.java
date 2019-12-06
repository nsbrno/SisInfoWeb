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
@Table(name = "AEABLOQU")
public class AeabloquEntity {

    @Id
    @Column(name = "ID_AEABLOQU", table = "AEABLOQU", nullable = false)
    private Integer idAeabloqu;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "AEABLOQU")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_AEAFAMIL", table = "AEABLOQU")
    private Integer idAeafamil;

    @Basic
    @Column(name = "ID_AEACLASE", table = "AEABLOQU")
    private Integer idAeaclase;

    @Basic
    @Column(name = "ID_AEAGRUPO", table = "AEABLOQU")
    private Integer idAeagrupo;

    @Basic
    @Column(name = "ID_AEASGRUP", table = "AEABLOQU")
    private Integer idAeasgrup;

    @Basic
    @Column(name = "ID_AEAMARCA", table = "AEABLOQU")
    private Integer idAeamarca;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "AEABLOQU")
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEABLOQU", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEABLOQU", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEABLOQU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEABLOQU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEABLOQU")
    private Integer ctInteg;

    @Basic
    @Column(name = "BLOQUEIA_ORC", table = "AEABLOQU")
    private String bloqueiaOrc;

    @Basic
    @Column(name = "BLOQUEIA_PED", table = "AEABLOQU")
    private String bloqueiaPed;

    @Basic
    @Column(name = "BLOQUEIA_NFS", table = "AEABLOQU")
    private String bloqueiaNfs;

    @Basic
    @Column(name = "ORC_SEM_ESTOQUE", table = "AEABLOQU")
    private String orcSemEstoque;

    @Basic
    @Column(name = "PED_SEM_ESTOQUE", table = "AEABLOQU")
    private String pedSemEstoque;

    @Basic
    @Column(name = "NFS_SEM_ESTOQUE", table = "AEABLOQU")
    private String nfsSemEstoque;

    public Integer getIdAeabloqu() {
        return idAeabloqu;
    }

    public void setIdAeabloqu(Integer idAeabloqu) {
        this.idAeabloqu = idAeabloqu;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public Integer getIdAeamarca() {
        return idAeamarca;
    }

    public void setIdAeamarca(Integer idAeamarca) {
        this.idAeamarca = idAeamarca;
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

    public String getBloqueiaOrc() {
        return bloqueiaOrc;
    }

    public void setBloqueiaOrc(String bloqueiaOrc) {
        this.bloqueiaOrc = bloqueiaOrc;
    }

    public String getBloqueiaPed() {
        return bloqueiaPed;
    }

    public void setBloqueiaPed(String bloqueiaPed) {
        this.bloqueiaPed = bloqueiaPed;
    }

    public String getBloqueiaNfs() {
        return bloqueiaNfs;
    }

    public void setBloqueiaNfs(String bloqueiaNfs) {
        this.bloqueiaNfs = bloqueiaNfs;
    }

    public String getOrcSemEstoque() {
        return orcSemEstoque;
    }

    public void setOrcSemEstoque(String orcSemEstoque) {
        this.orcSemEstoque = orcSemEstoque;
    }

    public String getPedSemEstoque() {
        return pedSemEstoque;
    }

    public void setPedSemEstoque(String pedSemEstoque) {
        this.pedSemEstoque = pedSemEstoque;
    }

    public String getNfsSemEstoque() {
        return nfsSemEstoque;
    }

    public void setNfsSemEstoque(String nfsSemEstoque) {
        this.nfsSemEstoque = nfsSemEstoque;
    }

}