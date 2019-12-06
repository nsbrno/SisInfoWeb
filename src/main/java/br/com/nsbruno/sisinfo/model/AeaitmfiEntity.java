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
@Table(name = "AEAITMFI")
public class AeaitmfiEntity {

    @Id
    @Column(name = "ID_AEAITMFI", table = "AEAITMFI", nullable = false)
    private Integer idAeaitmfi;

    @Basic(optional = false)
    @Column(name = "ID_AEAMAPAF", table = "AEAITMFI", nullable = false)
    private int idAeamapaf;

    @Basic(optional = false)
    @Column(name = "ID_AEASERIE", table = "AEAITMFI", nullable = false)
    private int idAeaserie;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITMFI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITMFI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITMFI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITMFI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITMFI")
    private Integer ctInteg;

    @Basic
    @Column(name = "CUPOM_INICIAL", table = "AEAITMFI")
    private Integer cupomInicial;

    @Basic
    @Column(name = "CUPOM_FINAL", table = "AEAITMFI")
    private Integer cupomFinal;

    @Basic
    @Column(name = "CONTA_Z", table = "AEAITMFI")
    private Integer contaZ;

    @Basic
    @Column(name = "CONTADOR_REINICIO", table = "AEAITMFI")
    private Integer contadorReinicio;

    @Basic(optional = false)
    @Column(name = "GT_INICIAL", table = "AEAITMFI", nullable = false)
    private double gtInicial;

    @Basic(optional = false)
    @Column(name = "GT_FINAL_MOV", table = "AEAITMFI", nullable = false)
    private double gtFinalMov;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC", table = "AEAITMFI", nullable = false)
    private double vlBaseCalc;

    @Basic(optional = false)
    @Column(name = "VL_IMPOSTO_DEB", table = "AEAITMFI", nullable = false)
    private double vlImpostoDeb;

    @Basic(optional = false)
    @Column(name = "VL_SUB_TRIB", table = "AEAITMFI", nullable = false)
    private double vlSubTrib;

    @Basic(optional = false)
    @Column(name = "VL_ISENCAO", table = "AEAITMFI", nullable = false)
    private double vlIsencao;

    @Basic(optional = false)
    @Column(name = "VL_NAO_INCID", table = "AEAITMFI", nullable = false)
    private double vlNaoIncid;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "AEAITMFI", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_CANCELAMENTO", table = "AEAITMFI", nullable = false)
    private double vlCancelamento;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS_RECEB", table = "AEAITMFI", nullable = false)
    private double vlOutrosReceb;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC_SERV", table = "AEAITMFI", nullable = false)
    private double vlBaseCalcServ;

    @Basic(optional = false)
    @Column(name = "VL_IMPOSTO_DEB_SERV", table = "AEAITMFI", nullable = false)
    private double vlImpostoDebServ;

    @Basic(optional = false)
    @Column(name = "VL_SUB_TRIB_SERV", table = "AEAITMFI", nullable = false)
    private double vlSubTribServ;

    @Basic(optional = false)
    @Column(name = "VL_ISENCAO_SERV", table = "AEAITMFI", nullable = false)
    private double vlIsencaoServ;

    @Basic(optional = false)
    @Column(name = "VL_NAO_INCID_SERV", table = "AEAITMFI", nullable = false)
    private double vlNaoIncidServ;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO_SERV", table = "AEAITMFI", nullable = false)
    private double vlDescontoServ;

    @Basic(optional = false)
    @Column(name = "VL_CANCELAMENTO_SERV", table = "AEAITMFI", nullable = false)
    private double vlCancelamentoServ;

    @Basic
    @Column(name = "FC_VL_MOVIMENTO_DIA", table = "AEAITMFI", precision = 15)
    private Double fcVlMovimentoDia;

    @Basic
    @Column(name = "FC_VL_CONTABIL_ICMS", table = "AEAITMFI", precision = 15)
    private Double fcVlContabilIcms;

    @Basic
    @Column(name = "FC_VL_CONTABIL_ISS", table = "AEAITMFI", precision = 15)
    private Double fcVlContabilIss;

    public Integer getIdAeaitmfi() {
        return idAeaitmfi;
    }

    public void setIdAeaitmfi(Integer idAeaitmfi) {
        this.idAeaitmfi = idAeaitmfi;
    }

    public int getIdAeamapaf() {
        return idAeamapaf;
    }

    public void setIdAeamapaf(int idAeamapaf) {
        this.idAeamapaf = idAeamapaf;
    }

    public int getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(int idAeaserie) {
        this.idAeaserie = idAeaserie;
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

    public Integer getCupomInicial() {
        return cupomInicial;
    }

    public void setCupomInicial(Integer cupomInicial) {
        this.cupomInicial = cupomInicial;
    }

    public Integer getCupomFinal() {
        return cupomFinal;
    }

    public void setCupomFinal(Integer cupomFinal) {
        this.cupomFinal = cupomFinal;
    }

    public Integer getContaZ() {
        return contaZ;
    }

    public void setContaZ(Integer contaZ) {
        this.contaZ = contaZ;
    }

    public Integer getContadorReinicio() {
        return contadorReinicio;
    }

    public void setContadorReinicio(Integer contadorReinicio) {
        this.contadorReinicio = contadorReinicio;
    }

    public double getGtInicial() {
        return gtInicial;
    }

    public void setGtInicial(double gtInicial) {
        this.gtInicial = gtInicial;
    }

    public double getGtFinalMov() {
        return gtFinalMov;
    }

    public void setGtFinalMov(double gtFinalMov) {
        this.gtFinalMov = gtFinalMov;
    }

    public double getVlBaseCalc() {
        return vlBaseCalc;
    }

    public void setVlBaseCalc(double vlBaseCalc) {
        this.vlBaseCalc = vlBaseCalc;
    }

    public double getVlImpostoDeb() {
        return vlImpostoDeb;
    }

    public void setVlImpostoDeb(double vlImpostoDeb) {
        this.vlImpostoDeb = vlImpostoDeb;
    }

    public double getVlSubTrib() {
        return vlSubTrib;
    }

    public void setVlSubTrib(double vlSubTrib) {
        this.vlSubTrib = vlSubTrib;
    }

    public double getVlIsencao() {
        return vlIsencao;
    }

    public void setVlIsencao(double vlIsencao) {
        this.vlIsencao = vlIsencao;
    }

    public double getVlNaoIncid() {
        return vlNaoIncid;
    }

    public void setVlNaoIncid(double vlNaoIncid) {
        this.vlNaoIncid = vlNaoIncid;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlCancelamento() {
        return vlCancelamento;
    }

    public void setVlCancelamento(double vlCancelamento) {
        this.vlCancelamento = vlCancelamento;
    }

    public double getVlOutrosReceb() {
        return vlOutrosReceb;
    }

    public void setVlOutrosReceb(double vlOutrosReceb) {
        this.vlOutrosReceb = vlOutrosReceb;
    }

    public double getVlBaseCalcServ() {
        return vlBaseCalcServ;
    }

    public void setVlBaseCalcServ(double vlBaseCalcServ) {
        this.vlBaseCalcServ = vlBaseCalcServ;
    }

    public double getVlImpostoDebServ() {
        return vlImpostoDebServ;
    }

    public void setVlImpostoDebServ(double vlImpostoDebServ) {
        this.vlImpostoDebServ = vlImpostoDebServ;
    }

    public double getVlSubTribServ() {
        return vlSubTribServ;
    }

    public void setVlSubTribServ(double vlSubTribServ) {
        this.vlSubTribServ = vlSubTribServ;
    }

    public double getVlIsencaoServ() {
        return vlIsencaoServ;
    }

    public void setVlIsencaoServ(double vlIsencaoServ) {
        this.vlIsencaoServ = vlIsencaoServ;
    }

    public double getVlNaoIncidServ() {
        return vlNaoIncidServ;
    }

    public void setVlNaoIncidServ(double vlNaoIncidServ) {
        this.vlNaoIncidServ = vlNaoIncidServ;
    }

    public double getVlDescontoServ() {
        return vlDescontoServ;
    }

    public void setVlDescontoServ(double vlDescontoServ) {
        this.vlDescontoServ = vlDescontoServ;
    }

    public double getVlCancelamentoServ() {
        return vlCancelamentoServ;
    }

    public void setVlCancelamentoServ(double vlCancelamentoServ) {
        this.vlCancelamentoServ = vlCancelamentoServ;
    }

    public Double getFcVlMovimentoDia() {
        return fcVlMovimentoDia;
    }

    public void setFcVlMovimentoDia(Double fcVlMovimentoDia) {
        this.fcVlMovimentoDia = fcVlMovimentoDia;
    }

    public Double getFcVlContabilIcms() {
        return fcVlContabilIcms;
    }

    public void setFcVlContabilIcms(Double fcVlContabilIcms) {
        this.fcVlContabilIcms = fcVlContabilIcms;
    }

    public Double getFcVlContabilIss() {
        return fcVlContabilIss;
    }

    public void setFcVlContabilIss(Double fcVlContabilIss) {
        this.fcVlContabilIss = fcVlContabilIss;
    }

}