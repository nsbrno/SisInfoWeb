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
@Table(name = "CFAEQUIP")
public class CfaequipEntity {

    @Id
    @Column(name = "ID_CFAEQUIP", table = "CFAEQUIP", nullable = false)
    private Integer idCfaequip;

    @Basic
    @Column(name = "ID_CFAMODEQ", table = "CFAEQUIP")
    private Integer idCfamodeq;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "CFAEQUIP")
    private Integer idAeaprodu;

    @Basic
    @Column(name = "ID_AEAMARCA", table = "CFAEQUIP")
    private Integer idAeamarca;

    @Basic
    @Column(name = "ID_AEAITENT", table = "CFAEQUIP")
    private Integer idAeaitent;

    @Basic
    @Column(name = "ID_AEAITORC", table = "CFAEQUIP")
    private Integer idAeaitorc;

    @Basic
    @Column(name = "ID_AEAITSAI", table = "CFAEQUIP")
    private Integer idAeaitsai;

    @Basic
    @Column(name = "ID_AEAITNFS", table = "CFAEQUIP")
    private Integer idAeaitnfs;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFAEQUIP")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_AEAESTOQ", table = "CFAEQUIP")
    private Integer idAeaestoq;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAEQUIP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAEQUIP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAEQUIP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAEQUIP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAEQUIP")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFAEQUIP", nullable = false, length = 18)
    private String codigo;

    @Lob
    @Basic
    @Column(name = "DESCRICAO", table = "CFAEQUIP")
    private byte[] descricao;

    @Basic
    @Column(name = "DT_COMPRA", table = "CFAEQUIP")
    @Temporal(TemporalType.DATE)
    private Date dtCompra;

    @Basic(optional = false)
    @Column(name = "VL_COMPRA", table = "CFAEQUIP", nullable = false)
    private double vlCompra;

    @Basic(optional = false)
    @Column(name = "ANO_MOD", table = "CFAEQUIP", nullable = false)
    private Integer anoMod;

    @Basic(optional = false)
    @Column(name = "ANO_FAB", table = "CFAEQUIP", nullable = false)
    private Integer anoFab;

    @Basic
    @Column(name = "PLACA", table = "CFAEQUIP", length = 10)
    private String placa;

    @Basic(optional = false)
    @Column(name = "CAPACIDADE", table = "CFAEQUIP", nullable = false)
    private Integer capacidade;

    @Basic(optional = false)
    @Column(name = "TOCO_KG", table = "CFAEQUIP", nullable = false)
    private double tocoKg;

    @Basic
    @Column(name = "RENAVAN", table = "CFAEQUIP")
    private Integer renavan;

    @Basic
    @Column(name = "NUMERO_SERIE", table = "CFAEQUIP", length = 26)
    private String numeroSerie;

    @Basic(optional = false)
    @Column(name = "KM", table = "CFAEQUIP", nullable = false)
    private double km;

    @Basic
    @Column(name = "FROTA", table = "CFAEQUIP", length = 26)
    private String frota;

    public Integer getIdCfaequip() {
        return idCfaequip;
    }

    public void setIdCfaequip(Integer idCfaequip) {
        this.idCfaequip = idCfaequip;
    }

    public Integer getIdCfamodeq() {
        return idCfamodeq;
    }

    public void setIdCfamodeq(Integer idCfamodeq) {
        this.idCfamodeq = idCfamodeq;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdAeamarca() {
        return idAeamarca;
    }

    public void setIdAeamarca(Integer idAeamarca) {
        this.idAeamarca = idAeamarca;
    }

    public Integer getIdAeaitent() {
        return idAeaitent;
    }

    public void setIdAeaitent(Integer idAeaitent) {
        this.idAeaitent = idAeaitent;
    }

    public Integer getIdAeaitorc() {
        return idAeaitorc;
    }

    public void setIdAeaitorc(Integer idAeaitorc) {
        this.idAeaitorc = idAeaitorc;
    }

    public Integer getIdAeaitsai() {
        return idAeaitsai;
    }

    public void setIdAeaitsai(Integer idAeaitsai) {
        this.idAeaitsai = idAeaitsai;
    }

    public Integer getIdAeaitnfs() {
        return idAeaitnfs;
    }

    public void setIdAeaitnfs(Integer idAeaitnfs) {
        this.idAeaitnfs = idAeaitnfs;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(Integer idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte[] getDescricao() {
        return descricao;
    }

    public void setDescricao(byte[] descricao) {
        this.descricao = descricao;
    }

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public double getVlCompra() {
        return vlCompra;
    }

    public void setVlCompra(double vlCompra) {
        this.vlCompra = vlCompra;
    }

    public Integer getAnoMod() {
        return anoMod;
    }

    public void setAnoMod(Integer anoMod) {
        this.anoMod = anoMod;
    }

    public Integer getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(Integer anoFab) {
        this.anoFab = anoFab;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public double getTocoKg() {
        return tocoKg;
    }

    public void setTocoKg(double tocoKg) {
        this.tocoKg = tocoKg;
    }

    public Integer getRenavan() {
        return renavan;
    }

    public void setRenavan(Integer renavan) {
        this.renavan = renavan;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getFrota() {
        return frota;
    }

    public void setFrota(String frota) {
        this.frota = frota;
    }

}