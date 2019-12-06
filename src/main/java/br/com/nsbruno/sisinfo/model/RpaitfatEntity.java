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
@Table(name = "RPAITFAT")
public class RpaitfatEntity {

    @Id
    @Column(name = "ID_RPAITFAT", table = "RPAITFAT", nullable = false)
    private Integer idRpaitfat;

    @Basic(optional = false)
    @Column(name = "ID_RPAFATUR", table = "RPAITFAT", nullable = false)
    private int idRpafatur;

    @Basic
    @Column(name = "ID_AEAPEDID", table = "RPAITFAT")
    private Integer idAeapedid;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "RPAITFAT")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEASAIDA", table = "RPAITFAT")
    private Integer idAeasaida;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "RPAITFAT")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_AEAFRETE", table = "RPAITFAT")
    private Integer idAeafrete;

    @Basic
    @Column(name = "ID_GCAVIGEN", table = "RPAITFAT")
    private Integer idGcavigen;

    @Basic
    @Column(name = "ID_AEACAIXA", table = "RPAITFAT")
    private Integer idAeacaixa;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAITFAT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAITFAT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAITFAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAITFAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAITFAT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "RPAITFAT", nullable = false)
    private int sequencia;

    @Basic(optional = false)
    @Column(name = "CANCELADO", table = "RPAITFAT", nullable = false)
    private String cancelado;

    @Basic(optional = false)
    @Column(name = "VL_ITEM_FAT", table = "RPAITFAT", nullable = false)
    private double vlItemFat;

    @Basic
    @Column(name = "COMPLEMENTO", table = "RPAITFAT")
    private String complemento;

    public Integer getIdRpaitfat() {
        return idRpaitfat;
    }

    public void setIdRpaitfat(Integer idRpaitfat) {
        this.idRpaitfat = idRpaitfat;
    }

    public int getIdRpafatur() {
        return idRpafatur;
    }

    public void setIdRpafatur(int idRpafatur) {
        this.idRpafatur = idRpafatur;
    }

    public Integer getIdAeapedid() {
        return idAeapedid;
    }

    public void setIdAeapedid(Integer idAeapedid) {
        this.idAeapedid = idAeapedid;
    }

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public Integer getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdAeafrete() {
        return idAeafrete;
    }

    public void setIdAeafrete(Integer idAeafrete) {
        this.idAeafrete = idAeafrete;
    }

    public Integer getIdGcavigen() {
        return idGcavigen;
    }

    public void setIdGcavigen(Integer idGcavigen) {
        this.idGcavigen = idGcavigen;
    }

    public Integer getIdAeacaixa() {
        return idAeacaixa;
    }

    public void setIdAeacaixa(Integer idAeacaixa) {
        this.idAeacaixa = idAeacaixa;
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

    public String getCancelado() {
        return cancelado;
    }

    public void setCancelado(String cancelado) {
        this.cancelado = cancelado;
    }

    public double getVlItemFat() {
        return vlItemFat;
    }

    public void setVlItemFat(double vlItemFat) {
        this.vlItemFat = vlItemFat;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}