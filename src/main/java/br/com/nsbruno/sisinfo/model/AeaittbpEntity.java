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
@Table(name = "AEAITTBP")
public class AeaittbpEntity {

    @Id
    @Column(name = "ID_AEAITTBP", table = "AEAITTBP", nullable = false)
    private Integer idAeaittbp;

    @Basic(optional = false)
    @Column(name = "ID_AEATBPRO", table = "AEAITTBP", nullable = false)
    private int idAeatbpro;

    @Basic
    @Column(name = "ID_AEAAGPPR", table = "AEAITTBP")
    private Integer idAeaagppr;

    @Basic
    @Column(name = "ID_AEAMARCA", table = "AEAITTBP")
    private Integer idAeamarca;

    @Basic
    @Column(name = "ID_AEAFAMIL", table = "AEAITTBP")
    private Integer idAeafamil;

    @Basic
    @Column(name = "ID_AEACLASE", table = "AEAITTBP")
    private Integer idAeaclase;

    @Basic
    @Column(name = "ID_AEAGRUPO", table = "AEAITTBP")
    private Integer idAeagrupo;

    @Basic
    @Column(name = "ID_AEASGRUP", table = "AEAITTBP")
    private Integer idAeasgrup;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "AEAITTBP")
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITTBP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITTBP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITTBP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITTBP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITTBP")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_VISTA_VARE", table = "AEAITTBP", nullable = false)
    private double descMercVistaVare;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    private double descMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    private double descMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    private double descMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_VISTA", table = "AEAITTBP", nullable = false)
    private double descServVista;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_PRAZO", table = "AEAITTBP", nullable = false)
    private double descServPrazo;

    @Basic(optional = false)
    @Column(name = "COM_MERC_VISTA_VARE", table = "AEAITTBP", nullable = false)
    private double comMercVistaVare;

    @Basic(optional = false)
    @Column(name = "COM_MERC_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    private double comMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "COM_MERC_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    private double comMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "COM_MERC_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    private double comMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "COM_SERV_VISTA", table = "AEAITTBP", nullable = false)
    private double comServVista;

    @Basic(optional = false)
    @Column(name = "COM_SERV_PRAZO", table = "AEAITTBP", nullable = false)
    private double comServPrazo;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_VISTA_VARE", table = "AEAITTBP", nullable = false)
    private double comExtMercVistaVare;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    private double comExtMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    private double comExtMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    private double comExtMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "COM_EXT_SERV_VISTA", table = "AEAITTBP", nullable = false)
    private double comExtServVista;

    @Basic(optional = false)
    @Column(name = "COM_EXT_SERV_PRAZO", table = "AEAITTBP", nullable = false)
    private double comExtServPrazo;

    @Basic(optional = false)
    @Column(name = "PRECO_VISTA_VARE", table = "AEAITTBP", nullable = false)
    private double precoVistaVare;

    @Basic(optional = false)
    @Column(name = "PRECO_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    private double precoVistaAtac;

    @Basic(optional = false)
    @Column(name = "PRECO_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    private double precoPrazoVare;

    @Basic(optional = false)
    @Column(name = "PRECO_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    private double precoPrazoAtac;

    @Basic(optional = false)
    @Column(name = "PRECO_VISTA_SERV", table = "AEAITTBP", nullable = false)
    private double precoVistaServ;

    @Basic(optional = false)
    @Column(name = "PRECO_PRAZO_SERV", table = "AEAITTBP", nullable = false)
    private double precoPrazoServ;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_MERC_VISTA_VARE", table = "AEAITTBP", nullable = false)
    private double descMaxMercVistaVare;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_MERC_VISTA_ATAC", table = "AEAITTBP", nullable = false)
    private double descMaxMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_MERC_PRAZO_VARE", table = "AEAITTBP", nullable = false)
    private double descMaxMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_MERC_PRAZO_ATAC", table = "AEAITTBP", nullable = false)
    private double descMaxMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_SERV_VISTA", table = "AEAITTBP", nullable = false)
    private double descMaxServVista;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_SERV_PRAZO", table = "AEAITTBP", nullable = false)
    private double descMaxServPrazo;

    public Integer getIdAeaittbp() {
        return idAeaittbp;
    }

    public void setIdAeaittbp(Integer idAeaittbp) {
        this.idAeaittbp = idAeaittbp;
    }

    public int getIdAeatbpro() {
        return idAeatbpro;
    }

    public void setIdAeatbpro(int idAeatbpro) {
        this.idAeatbpro = idAeatbpro;
    }

    public Integer getIdAeaagppr() {
        return idAeaagppr;
    }

    public void setIdAeaagppr(Integer idAeaagppr) {
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

    public double getDescMercVistaVare() {
        return descMercVistaVare;
    }

    public void setDescMercVistaVare(double descMercVistaVare) {
        this.descMercVistaVare = descMercVistaVare;
    }

    public double getDescMercVistaAtac() {
        return descMercVistaAtac;
    }

    public void setDescMercVistaAtac(double descMercVistaAtac) {
        this.descMercVistaAtac = descMercVistaAtac;
    }

    public double getDescMercPrazoVare() {
        return descMercPrazoVare;
    }

    public void setDescMercPrazoVare(double descMercPrazoVare) {
        this.descMercPrazoVare = descMercPrazoVare;
    }

    public double getDescMercPrazoAtac() {
        return descMercPrazoAtac;
    }

    public void setDescMercPrazoAtac(double descMercPrazoAtac) {
        this.descMercPrazoAtac = descMercPrazoAtac;
    }

    public double getDescServVista() {
        return descServVista;
    }

    public void setDescServVista(double descServVista) {
        this.descServVista = descServVista;
    }

    public double getDescServPrazo() {
        return descServPrazo;
    }

    public void setDescServPrazo(double descServPrazo) {
        this.descServPrazo = descServPrazo;
    }

    public double getComMercVistaVare() {
        return comMercVistaVare;
    }

    public void setComMercVistaVare(double comMercVistaVare) {
        this.comMercVistaVare = comMercVistaVare;
    }

    public double getComMercVistaAtac() {
        return comMercVistaAtac;
    }

    public void setComMercVistaAtac(double comMercVistaAtac) {
        this.comMercVistaAtac = comMercVistaAtac;
    }

    public double getComMercPrazoVare() {
        return comMercPrazoVare;
    }

    public void setComMercPrazoVare(double comMercPrazoVare) {
        this.comMercPrazoVare = comMercPrazoVare;
    }

    public double getComMercPrazoAtac() {
        return comMercPrazoAtac;
    }

    public void setComMercPrazoAtac(double comMercPrazoAtac) {
        this.comMercPrazoAtac = comMercPrazoAtac;
    }

    public double getComServVista() {
        return comServVista;
    }

    public void setComServVista(double comServVista) {
        this.comServVista = comServVista;
    }

    public double getComServPrazo() {
        return comServPrazo;
    }

    public void setComServPrazo(double comServPrazo) {
        this.comServPrazo = comServPrazo;
    }

    public double getComExtMercVistaVare() {
        return comExtMercVistaVare;
    }

    public void setComExtMercVistaVare(double comExtMercVistaVare) {
        this.comExtMercVistaVare = comExtMercVistaVare;
    }

    public double getComExtMercVistaAtac() {
        return comExtMercVistaAtac;
    }

    public void setComExtMercVistaAtac(double comExtMercVistaAtac) {
        this.comExtMercVistaAtac = comExtMercVistaAtac;
    }

    public double getComExtMercPrazoVare() {
        return comExtMercPrazoVare;
    }

    public void setComExtMercPrazoVare(double comExtMercPrazoVare) {
        this.comExtMercPrazoVare = comExtMercPrazoVare;
    }

    public double getComExtMercPrazoAtac() {
        return comExtMercPrazoAtac;
    }

    public void setComExtMercPrazoAtac(double comExtMercPrazoAtac) {
        this.comExtMercPrazoAtac = comExtMercPrazoAtac;
    }

    public double getComExtServVista() {
        return comExtServVista;
    }

    public void setComExtServVista(double comExtServVista) {
        this.comExtServVista = comExtServVista;
    }

    public double getComExtServPrazo() {
        return comExtServPrazo;
    }

    public void setComExtServPrazo(double comExtServPrazo) {
        this.comExtServPrazo = comExtServPrazo;
    }

    public double getPrecoVistaVare() {
        return precoVistaVare;
    }

    public void setPrecoVistaVare(double precoVistaVare) {
        this.precoVistaVare = precoVistaVare;
    }

    public double getPrecoVistaAtac() {
        return precoVistaAtac;
    }

    public void setPrecoVistaAtac(double precoVistaAtac) {
        this.precoVistaAtac = precoVistaAtac;
    }

    public double getPrecoPrazoVare() {
        return precoPrazoVare;
    }

    public void setPrecoPrazoVare(double precoPrazoVare) {
        this.precoPrazoVare = precoPrazoVare;
    }

    public double getPrecoPrazoAtac() {
        return precoPrazoAtac;
    }

    public void setPrecoPrazoAtac(double precoPrazoAtac) {
        this.precoPrazoAtac = precoPrazoAtac;
    }

    public double getPrecoVistaServ() {
        return precoVistaServ;
    }

    public void setPrecoVistaServ(double precoVistaServ) {
        this.precoVistaServ = precoVistaServ;
    }

    public double getPrecoPrazoServ() {
        return precoPrazoServ;
    }

    public void setPrecoPrazoServ(double precoPrazoServ) {
        this.precoPrazoServ = precoPrazoServ;
    }

    public double getDescMaxMercVistaVare() {
        return descMaxMercVistaVare;
    }

    public void setDescMaxMercVistaVare(double descMaxMercVistaVare) {
        this.descMaxMercVistaVare = descMaxMercVistaVare;
    }

    public double getDescMaxMercVistaAtac() {
        return descMaxMercVistaAtac;
    }

    public void setDescMaxMercVistaAtac(double descMaxMercVistaAtac) {
        this.descMaxMercVistaAtac = descMaxMercVistaAtac;
    }

    public double getDescMaxMercPrazoVare() {
        return descMaxMercPrazoVare;
    }

    public void setDescMaxMercPrazoVare(double descMaxMercPrazoVare) {
        this.descMaxMercPrazoVare = descMaxMercPrazoVare;
    }

    public double getDescMaxMercPrazoAtac() {
        return descMaxMercPrazoAtac;
    }

    public void setDescMaxMercPrazoAtac(double descMaxMercPrazoAtac) {
        this.descMaxMercPrazoAtac = descMaxMercPrazoAtac;
    }

    public double getDescMaxServVista() {
        return descMaxServVista;
    }

    public void setDescMaxServVista(double descMaxServVista) {
        this.descMaxServVista = descMaxServVista;
    }

    public double getDescMaxServPrazo() {
        return descMaxServPrazo;
    }

    public void setDescMaxServPrazo(double descMaxServPrazo) {
        this.descMaxServPrazo = descMaxServPrazo;
    }

}