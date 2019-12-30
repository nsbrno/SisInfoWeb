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
@Table(name = "AEAITPED")
public class AeaitpedEntity {

    @Id
    @Column(name = "ID_AEAITPED", table = "AEAITPED", nullable = false)
    private Integer idAeaitped;

    @Basic(optional = false)
    @Column(name = "ID_AEAPEDID", table = "AEAITPED", nullable = false)
    private Integer idAeapedid;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLOJA", table = "AEAITPED", nullable = false)
    private Integer idAeaploja;

    @Basic
    @Column(name = "ID_AEAGRDPL", table = "AEAITPED")
    private Integer idAeagrdpl;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAITPED", nullable = false)
    private Integer idAeaunven;

    @Basic
    @Column(name = "ID_AEAITENT", table = "AEAITPED")
    private Integer idAeaitent;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITPED", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITPED", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITPED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITPED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITPED")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_PEDIDO", table = "AEAITPED", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtPedido;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEAITPED", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "VL_PRODUTO", table = "AEAITPED", nullable = false)
    private double vlProduto;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITPED", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "QUANT_CONF", table = "AEAITPED", nullable = false)
    private double quantConf;

    @Basic(optional = false)
    @Column(name = "QUANT_ATENDIDA", table = "AEAITPED", nullable = false)
    private double quantAtendida;

    @Basic(optional = false)
    @Column(name = "QUANT_CANCELADA", table = "AEAITPED", nullable = false)
    private double quantCancelada;

    @Basic
    @Column(name = "TIPO_PRODUTO", table = "AEAITPED")
    private String tipoProduto;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAITPED")
    private byte[] obs;

    public Integer getIdAeaitped() {
        return idAeaitped;
    }

    public void setIdAeaitped(Integer idAeaitped) {
        this.idAeaitped = idAeaitped;
    }

    public Integer getIdAeapedid() {
        return idAeapedid;
    }

    public void setIdAeapedid(Integer idAeapedid) {
        this.idAeapedid = idAeapedid;
    }

    public Integer getIdAeaploja() {
        return idAeaploja;
    }

    public void setIdAeaploja(Integer idAeaploja) {
        this.idAeaploja = idAeaploja;
    }

    public Integer getIdAeagrdpl() {
        return idAeagrdpl;
    }

    public void setIdAeagrdpl(Integer idAeagrdpl) {
        this.idAeagrdpl = idAeagrdpl;
    }

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public Integer getIdAeaitent() {
        return idAeaitent;
    }

    public void setIdAeaitent(Integer idAeaitent) {
        this.idAeaitent = idAeaitent;
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

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public double getVlProduto() {
        return vlProduto;
    }

    public void setVlProduto(double vlProduto) {
        this.vlProduto = vlProduto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantConf() {
        return quantConf;
    }

    public void setQuantConf(double quantConf) {
        this.quantConf = quantConf;
    }

    public double getQuantAtendida() {
        return quantAtendida;
    }

    public void setQuantAtendida(double quantAtendida) {
        this.quantAtendida = quantAtendida;
    }

    public double getQuantCancelada() {
        return quantCancelada;
    }

    public void setQuantCancelada(double quantCancelada) {
        this.quantCancelada = quantCancelada;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}