package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "AEAEXTBP")
@Data
public class AeaextbpEntity {

    @Id
    @Column(name = "ID_AEAEXTBP", table = "AEAEXTBP", nullable = false)
    private Integer idAeaextbp;

    @Basic(optional = false)
    @Column(name = "ID_AEAITTBP", table = "AEAEXTBP", nullable = false)
    private Integer idAeaittbp;

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
}