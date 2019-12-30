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
@Table(name = "AEAFRETE")
public class AeafreteEntity {

    @Id
    @Column(name = "ID_AEAFRETE", table = "AEAFRETE", nullable = false)
    private Integer idAeafrete;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEAFRETE")
    private Integer idAeaentra;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "AEAFRETE", nullable = false)
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_CFANATOP", table = "AEAFRETE", nullable = false)
    private Integer idCfanatop;

    @Basic(optional = false)
    @Column(name = "ID_AEASERIE", table = "AEAFRETE", nullable = false)
    private Integer idAeaserie;

    @Basic
    @Column(name = "ID_CFACIDAD_ORIG", table = "AEAFRETE")
    private Integer idCfacidadOrig;

    @Basic
    @Column(name = "ID_CFACIDAD_DEST", table = "AEAFRETE")
    private Integer idCfacidadDest;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAFRETE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAFRETE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAFRETE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAFRETE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAFRETE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SERIE", table = "AEAFRETE", nullable = false, length = 4)
    private String serie;

    @Basic
    @Column(name = "SUBSERIE", table = "AEAFRETE", length = 3)
    private String subserie;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEAFRETE", nullable = false)
    private Integer numero;

    @Basic(optional = false)
    @Column(name = "DT_EMISSAO", table = "AEAFRETE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_ENTRADA", table = "AEAFRETE")
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;

    @Basic(optional = false)
    @Column(name = "VL_FRETE", table = "AEAFRETE", nullable = false)
    private double vlFrete;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "AEAFRETE", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS", table = "AEAFRETE", nullable = false)
    private double vlBaseIcms;

    @Basic(optional = false)
    @Column(name = "VL_NAO_TRIBUT", table = "AEAFRETE", nullable = false)
    private double vlNaoTribut;

    @Basic(optional = false)
    @Column(name = "VL_ICMS", table = "AEAFRETE", nullable = false)
    private double vlIcms;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS", table = "AEAFRETE", nullable = false)
    private double aliquotaIcms;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "AEAFRETE", nullable = false)
    private short situacao;

    @Basic
    @Column(name = "TIPO_FRETE", table = "AEAFRETE")
    private String tipoFrete;

    @Basic
    @Column(name = "TIPO_CTE", table = "AEAFRETE")
    private String tipoCte;

    @Basic
    @Column(name = "COD_SIT", table = "AEAFRETE")
    private String codSit;

    @Basic
    @Column(name = "CHV_CTE", table = "AEAFRETE", length = 50)
    private String chvCte;

    public Integer getIdAeafrete() {
        return idAeafrete;
    }

    public void setIdAeafrete(Integer idAeafrete) {
        this.idAeafrete = idAeafrete;
    }

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfanatop() {
        return idCfanatop;
    }

    public void setIdCfanatop(Integer idCfanatop) {
        this.idCfanatop = idCfanatop;
    }

    public Integer getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(Integer idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdCfacidadOrig() {
        return idCfacidadOrig;
    }

    public void setIdCfacidadOrig(Integer idCfacidadOrig) {
        this.idCfacidadOrig = idCfacidadOrig;
    }

    public Integer getIdCfacidadDest() {
        return idCfacidadDest;
    }

    public void setIdCfacidadDest(Integer idCfacidadDest) {
        this.idCfacidadDest = idCfacidadDest;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSubserie() {
        return subserie;
    }

    public void setSubserie(String subserie) {
        this.subserie = subserie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public double getVlFrete() {
        return vlFrete;
    }

    public void setVlFrete(double vlFrete) {
        this.vlFrete = vlFrete;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlBaseIcms() {
        return vlBaseIcms;
    }

    public void setVlBaseIcms(double vlBaseIcms) {
        this.vlBaseIcms = vlBaseIcms;
    }

    public double getVlNaoTribut() {
        return vlNaoTribut;
    }

    public void setVlNaoTribut(double vlNaoTribut) {
        this.vlNaoTribut = vlNaoTribut;
    }

    public double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public String getTipoCte() {
        return tipoCte;
    }

    public void setTipoCte(String tipoCte) {
        this.tipoCte = tipoCte;
    }

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    public String getChvCte() {
        return chvCte;
    }

    public void setChvCte(String chvCte) {
        this.chvCte = chvCte;
    }

}