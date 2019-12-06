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
@Table(name = "AEAGRDPL")
public class AeagrdplEntity {

    @Id
    @Column(name = "ID_AEAGRDPL", table = "AEAGRDPL", nullable = false)
    private Integer idAeagrdpl;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLOJA", table = "AEAGRDPL", nullable = false)
    private int idAeaploja;

    @Basic(optional = false)
    @Column(name = "ID_AEAGRDPR", table = "AEAGRDPL", nullable = false)
    private int idAeagrdpr;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAGRDPL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAGRDPL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAGRDPL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAGRDPL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAGRDPL")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "ESTOQUE_F", table = "AEAGRDPL", nullable = false)
    private double estoqueF;

    @Basic(optional = false)
    @Column(name = "ESTOQUE_C", table = "AEAGRDPL", nullable = false)
    private double estoqueC;

    @Basic(optional = false)
    @Column(name = "PEDIDO", table = "AEAGRDPL", nullable = false)
    private double pedido;

    @Basic(optional = false)
    @Column(name = "RETIDO", table = "AEAGRDPL", nullable = false)
    private double retido;

    @Basic
    @Column(name = "DT_VENDA_VARE_D", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtVendaVareD;

    @Basic
    @Column(name = "DT_VENDA_ATAC_D", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtVendaAtacD;

    @Basic
    @Column(name = "DT_COMPRA", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtCompra;

    @Basic
    @Column(name = "DT_VENDA_VARE_N", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtVendaVareN;

    @Basic
    @Column(name = "DT_VENDA_ATAC_N", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtVendaAtacN;

    @Basic
    @Column(name = "DT_VENDA_PROMO_VARE_D", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoVareD;

    @Basic
    @Column(name = "DT_VENDA_PROMO_ATAC_D", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoAtacD;

    @Basic
    @Column(name = "DT_VENDA_PROMO_VARE_N", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoVareN;

    @Basic
    @Column(name = "DT_VENDA_PROMO_ATAC_N", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoAtacN;

    @Basic
    @Column(name = "DT_ENTRADA_D", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtEntradaD;

    @Basic
    @Column(name = "DT_ENTRADA_N", table = "AEAGRDPL")
    @Temporal(TemporalType.DATE)
    private Date dtEntradaN;

    @Basic(optional = false)
    @Column(name = "MINIMO", table = "AEAGRDPL", nullable = false)
    private double minimo;

    @Basic(optional = false)
    @Column(name = "MEDIO", table = "AEAGRDPL", nullable = false)
    private double medio;

    @Basic(optional = false)
    @Column(name = "MAXIMO", table = "AEAGRDPL", nullable = false)
    private double maximo;

    @Basic(optional = false)
    @Column(name = "NUM_COMPRAS", table = "AEAGRDPL", nullable = false)
    private int numCompras;

    @Basic(optional = false)
    @Column(name = "TEMPO_PED_ENTREGA", table = "AEAGRDPL", nullable = false)
    private double tempoPedEntrega;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAGRDPL", nullable = false)
    private String ativo;

    public Integer getIdAeagrdpl() {
        return idAeagrdpl;
    }

    public void setIdAeagrdpl(Integer idAeagrdpl) {
        this.idAeagrdpl = idAeagrdpl;
    }

    public int getIdAeaploja() {
        return idAeaploja;
    }

    public void setIdAeaploja(int idAeaploja) {
        this.idAeaploja = idAeaploja;
    }

    public int getIdAeagrdpr() {
        return idAeagrdpr;
    }

    public void setIdAeagrdpr(int idAeagrdpr) {
        this.idAeagrdpr = idAeagrdpr;
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

    public double getEstoqueF() {
        return estoqueF;
    }

    public void setEstoqueF(double estoqueF) {
        this.estoqueF = estoqueF;
    }

    public double getEstoqueC() {
        return estoqueC;
    }

    public void setEstoqueC(double estoqueC) {
        this.estoqueC = estoqueC;
    }

    public double getPedido() {
        return pedido;
    }

    public void setPedido(double pedido) {
        this.pedido = pedido;
    }

    public double getRetido() {
        return retido;
    }

    public void setRetido(double retido) {
        this.retido = retido;
    }

    public Date getDtVendaVareD() {
        return dtVendaVareD;
    }

    public void setDtVendaVareD(Date dtVendaVareD) {
        this.dtVendaVareD = dtVendaVareD;
    }

    public Date getDtVendaAtacD() {
        return dtVendaAtacD;
    }

    public void setDtVendaAtacD(Date dtVendaAtacD) {
        this.dtVendaAtacD = dtVendaAtacD;
    }

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public Date getDtVendaVareN() {
        return dtVendaVareN;
    }

    public void setDtVendaVareN(Date dtVendaVareN) {
        this.dtVendaVareN = dtVendaVareN;
    }

    public Date getDtVendaAtacN() {
        return dtVendaAtacN;
    }

    public void setDtVendaAtacN(Date dtVendaAtacN) {
        this.dtVendaAtacN = dtVendaAtacN;
    }

    public Date getDtVendaPromoVareD() {
        return dtVendaPromoVareD;
    }

    public void setDtVendaPromoVareD(Date dtVendaPromoVareD) {
        this.dtVendaPromoVareD = dtVendaPromoVareD;
    }

    public Date getDtVendaPromoAtacD() {
        return dtVendaPromoAtacD;
    }

    public void setDtVendaPromoAtacD(Date dtVendaPromoAtacD) {
        this.dtVendaPromoAtacD = dtVendaPromoAtacD;
    }

    public Date getDtVendaPromoVareN() {
        return dtVendaPromoVareN;
    }

    public void setDtVendaPromoVareN(Date dtVendaPromoVareN) {
        this.dtVendaPromoVareN = dtVendaPromoVareN;
    }

    public Date getDtVendaPromoAtacN() {
        return dtVendaPromoAtacN;
    }

    public void setDtVendaPromoAtacN(Date dtVendaPromoAtacN) {
        this.dtVendaPromoAtacN = dtVendaPromoAtacN;
    }

    public Date getDtEntradaD() {
        return dtEntradaD;
    }

    public void setDtEntradaD(Date dtEntradaD) {
        this.dtEntradaD = dtEntradaD;
    }

    public Date getDtEntradaN() {
        return dtEntradaN;
    }

    public void setDtEntradaN(Date dtEntradaN) {
        this.dtEntradaN = dtEntradaN;
    }

    public double getMinimo() {
        return minimo;
    }

    public void setMinimo(double minimo) {
        this.minimo = minimo;
    }

    public double getMedio() {
        return medio;
    }

    public void setMedio(double medio) {
        this.medio = medio;
    }

    public double getMaximo() {
        return maximo;
    }

    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }

    public int getNumCompras() {
        return numCompras;
    }

    public void setNumCompras(int numCompras) {
        this.numCompras = numCompras;
    }

    public double getTempoPedEntrega() {
        return tempoPedEntrega;
    }

    public void setTempoPedEntrega(double tempoPedEntrega) {
        this.tempoPedEntrega = tempoPedEntrega;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}