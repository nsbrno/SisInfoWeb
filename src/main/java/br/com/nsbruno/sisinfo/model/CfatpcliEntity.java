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
@Table(name = "CFATPCLI")
public class CfatpcliEntity {

    @Id
    @Column(name = "ID_CFATPCLI", table = "CFATPCLI", nullable = false)
    private Integer idCfatpcli;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFATPCLI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFATPCLI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFATPCLI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFATPCLI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFATPCLI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFATPCLI", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFATPCLI", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "DESC_ATAC_VISTA", table = "CFATPCLI", nullable = false)
    private double descAtacVista;

    @Basic(optional = false)
    @Column(name = "DESC_ATAC_PRAZO", table = "CFATPCLI", nullable = false)
    private double descAtacPrazo;

    @Basic(optional = false)
    @Column(name = "DESC_VARE_VISTA", table = "CFATPCLI", nullable = false)
    private double descVareVista;

    @Basic(optional = false)
    @Column(name = "DESC_VARE_PRAZO", table = "CFATPCLI", nullable = false)
    private double descVarePrazo;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_VISTA", table = "CFATPCLI", nullable = false)
    private double descServVista;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_PRAZO", table = "CFATPCLI", nullable = false)
    private double descServPrazo;

    @Basic
    @Column(name = "DESC_PROMOCAO", table = "CFATPCLI")
    private String descPromocao;

    @Basic
    @Column(name = "VENDE_ATAC_VAREJO", table = "CFATPCLI")
    private String vendeAtacVarejo;

    public Integer getIdCfatpcli() {
        return idCfatpcli;
    }

    public void setIdCfatpcli(Integer idCfatpcli) {
        this.idCfatpcli = idCfatpcli;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDescAtacVista() {
        return descAtacVista;
    }

    public void setDescAtacVista(double descAtacVista) {
        this.descAtacVista = descAtacVista;
    }

    public double getDescAtacPrazo() {
        return descAtacPrazo;
    }

    public void setDescAtacPrazo(double descAtacPrazo) {
        this.descAtacPrazo = descAtacPrazo;
    }

    public double getDescVareVista() {
        return descVareVista;
    }

    public void setDescVareVista(double descVareVista) {
        this.descVareVista = descVareVista;
    }

    public double getDescVarePrazo() {
        return descVarePrazo;
    }

    public void setDescVarePrazo(double descVarePrazo) {
        this.descVarePrazo = descVarePrazo;
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

    public String getDescPromocao() {
        return descPromocao;
    }

    public void setDescPromocao(String descPromocao) {
        this.descPromocao = descPromocao;
    }

    public String getVendeAtacVarejo() {
        return vendeAtacVarejo;
    }

    public void setVendeAtacVarejo(String vendeAtacVarejo) {
        this.vendeAtacVarejo = vendeAtacVarejo;
    }

}