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
@Table(name = "AEAEXTBP")
public class AeaextbpEntity {

    @Id
    @Column(name = "ID_AEAEXTBP", table = "AEAEXTBP", nullable = false)
    private Integer idAeaextbp;

    @Basic(optional = false)
    @Column(name = "ID_AEAITTBP", table = "AEAEXTBP", nullable = false)
    private int idAeaittbp;

    @Basic
    @Column(name = "ID_CFAAREAS", table = "AEAEXTBP")
    private Integer idCfaareas;

    @Basic
    @Column(name = "ID_CFATPCLI", table = "AEAEXTBP")
    private Integer idCfatpcli;

    @Basic
    @Column(name = "ID_CFASTATU", table = "AEAEXTBP")
    private Integer idCfastatu;

    @Basic
    @Column(name = "ID_CFAPROFI", table = "AEAEXTBP")
    private Integer idCfaprofi;

    @Basic
    @Column(name = "ID_CFAATIVI", table = "AEAEXTBP")
    private Integer idCfaativi;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAEXTBP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAEXTBP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAEXTBP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAEXTBP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAEXTBP")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_VISTA_VARE", table = "AEAEXTBP", nullable = false)
    private double descMercVistaVare;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_VISTA_ATAC", table = "AEAEXTBP", nullable = false)
    private double descMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_PRAZO_VARE", table = "AEAEXTBP", nullable = false)
    private double descMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_PRAZO_ATAC", table = "AEAEXTBP", nullable = false)
    private double descMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_VISTA", table = "AEAEXTBP", nullable = false)
    private double descServVista;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_PRAZO", table = "AEAEXTBP", nullable = false)
    private double descServPrazo;

    @Basic(optional = false)
    @Column(name = "COM_MERC_VISTA_VARE", table = "AEAEXTBP", nullable = false)
    private double comMercVistaVare;

    @Basic(optional = false)
    @Column(name = "COM_MERC_VISTA_ATAC", table = "AEAEXTBP", nullable = false)
    private double comMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "COM_MERC_PRAZO_VARE", table = "AEAEXTBP", nullable = false)
    private double comMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "COM_MERC_PRAZO_ATAC", table = "AEAEXTBP", nullable = false)
    private double comMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "COM_SERV_VISTA", table = "AEAEXTBP", nullable = false)
    private double comServVista;

    @Basic(optional = false)
    @Column(name = "COM_SERV_PRAZO", table = "AEAEXTBP", nullable = false)
    private double comServPrazo;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_VISTA_VARE", table = "AEAEXTBP", nullable = false)
    private double comExtMercVistaVare;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_VISTA_ATAC", table = "AEAEXTBP", nullable = false)
    private double comExtMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_PRAZO_VARE", table = "AEAEXTBP", nullable = false)
    private double comExtMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_PRAZO_ATAC", table = "AEAEXTBP", nullable = false)
    private double comExtMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "COM_EXT_SERV_VISTA", table = "AEAEXTBP", nullable = false)
    private double comExtServVista;

    @Basic(optional = false)
    @Column(name = "COM_EXT_SERV_PRAZO", table = "AEAEXTBP", nullable = false)
    private double comExtServPrazo;

    @Basic(optional = false)
    @Column(name = "QTDE", table = "AEAEXTBP", nullable = false)
    private double qtde;

    @Basic(optional = false)
    @Column(name = "PRECO_VISTA_VARE", table = "AEAEXTBP", nullable = false)
    private double precoVistaVare;

    @Basic(optional = false)
    @Column(name = "PRECO_VISTA_ATAC", table = "AEAEXTBP", nullable = false)
    private double precoVistaAtac;

    @Basic(optional = false)
    @Column(name = "PRECO_VISTA_SERV", table = "AEAEXTBP", nullable = false)
    private double precoVistaServ;

    @Basic(optional = false)
    @Column(name = "PRECO_PRAZO_VARE", table = "AEAEXTBP", nullable = false)
    private double precoPrazoVare;

    @Basic(optional = false)
    @Column(name = "PRECO_PRAZO_ATAC", table = "AEAEXTBP", nullable = false)
    private double precoPrazoAtac;

    @Basic(optional = false)
    @Column(name = "PRECO_PRAZO_SERV", table = "AEAEXTBP", nullable = false)
    private double precoPrazoServ;

    public Integer getIdAeaextbp() {
        return idAeaextbp;
    }

    public void setIdAeaextbp(Integer idAeaextbp) {
        this.idAeaextbp = idAeaextbp;
    }

    public int getIdAeaittbp() {
        return idAeaittbp;
    }

    public void setIdAeaittbp(int idAeaittbp) {
        this.idAeaittbp = idAeaittbp;
    }

    public Integer getIdCfaareas() {
        return idCfaareas;
    }

    public void setIdCfaareas(Integer idCfaareas) {
        this.idCfaareas = idCfaareas;
    }

    public Integer getIdCfatpcli() {
        return idCfatpcli;
    }

    public void setIdCfatpcli(Integer idCfatpcli) {
        this.idCfatpcli = idCfatpcli;
    }

    public Integer getIdCfastatu() {
        return idCfastatu;
    }

    public void setIdCfastatu(Integer idCfastatu) {
        this.idCfastatu = idCfastatu;
    }

    public Integer getIdCfaprofi() {
        return idCfaprofi;
    }

    public void setIdCfaprofi(Integer idCfaprofi) {
        this.idCfaprofi = idCfaprofi;
    }

    public Integer getIdCfaativi() {
        return idCfaativi;
    }

    public void setIdCfaativi(Integer idCfaativi) {
        this.idCfaativi = idCfaativi;
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

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
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

    public double getPrecoVistaServ() {
        return precoVistaServ;
    }

    public void setPrecoVistaServ(double precoVistaServ) {
        this.precoVistaServ = precoVistaServ;
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

    public double getPrecoPrazoServ() {
        return precoPrazoServ;
    }

    public void setPrecoPrazoServ(double precoPrazoServ) {
        this.precoPrazoServ = precoPrazoServ;
    }

}