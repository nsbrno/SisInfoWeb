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
@Table(name = "CFASTATU")
public class CfastatuEntity {

    @Id
    @Column(name = "ID_CFASTATU", table = "CFASTATU", nullable = false)
    private Integer idCfastatu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFASTATU", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFASTATU", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFASTATU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFASTATU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFASTATU")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFASTATU", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFASTATU", nullable = false, length = 40)
    private String descricao;

    @Lob
    @Basic
    @Column(name = "MENSAGEM", table = "CFASTATU")
    private byte[] mensagem;

    @Basic(optional = false)
    @Column(name = "BLOQUEIA", table = "CFASTATU", nullable = false)
    private String bloqueia;

    @Basic(optional = false)
    @Column(name = "DESC_ATAC_VISTA", table = "CFASTATU", nullable = false)
    private double descAtacVista;

    @Basic(optional = false)
    @Column(name = "DESC_ATAC_PRAZO", table = "CFASTATU", nullable = false)
    private double descAtacPrazo;

    @Basic(optional = false)
    @Column(name = "DESC_VARE_VISTA", table = "CFASTATU", nullable = false)
    private double descVareVista;

    @Basic(optional = false)
    @Column(name = "DESC_VARE_PRAZO", table = "CFASTATU", nullable = false)
    private double descVarePrazo;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_VISTA", table = "CFASTATU", nullable = false)
    private double descServVista;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_PRAZO", table = "CFASTATU", nullable = false)
    private double descServPrazo;

    @Basic
    @Column(name = "DESC_PROMOCAO", table = "CFASTATU")
    private String descPromocao;

    @Basic
    @Column(name = "PARCELA_EM_ABERTO", table = "CFASTATU")
    private String parcelaEmAberto;

    @Basic
    @Column(name = "VISTA_PRAZO", table = "CFASTATU")
    private String vistaPrazo;

    public Integer getIdCfastatu() {
        return idCfastatu;
    }

    public void setIdCfastatu(Integer idCfastatu) {
        this.idCfastatu = idCfastatu;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getMensagem() {
        return mensagem;
    }

    public void setMensagem(byte[] mensagem) {
        this.mensagem = mensagem;
    }

    public String getBloqueia() {
        return bloqueia;
    }

    public void setBloqueia(String bloqueia) {
        this.bloqueia = bloqueia;
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

    public String getParcelaEmAberto() {
        return parcelaEmAberto;
    }

    public void setParcelaEmAberto(String parcelaEmAberto) {
        this.parcelaEmAberto = parcelaEmAberto;
    }

    public String getVistaPrazo() {
        return vistaPrazo;
    }

    public void setVistaPrazo(String vistaPrazo) {
        this.vistaPrazo = vistaPrazo;
    }

}