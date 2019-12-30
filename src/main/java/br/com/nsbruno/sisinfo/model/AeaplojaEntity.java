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
@Table(name = "AEAPLOJA")
@Data
public class AeaplojaEntity {

    @Id
    @Column(name = "ID_AEAPLOJA", table = "AEAPLOJA", nullable = false)
    private Integer idAeaploja;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAPLOJA", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEAPLOJA", nullable = false)
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "ID_AEACODST_ENT", table = "AEAPLOJA", nullable = false)
    private Integer idAeacodstEnt;

    @Basic(optional = false)
    @Column(name = "ID_AEACODST", table = "AEAPLOJA", nullable = false)
    private Integer idAeacodst;

    @Basic
    @Column(name = "ID_AEAOBSPR", table = "AEAPLOJA")
    private Integer idAeaobspr;

    @Basic
    @Column(name = "ID_AEASAZON", table = "AEAPLOJA")
    private Integer idAeasazon;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPLOJA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPLOJA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPLOJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPLOJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPLOJA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "ESTOQUE_F", table = "AEAPLOJA", nullable = false)
    private double estoqueF;

    @Basic(optional = false)
    @Column(name = "ESTOQUE_C", table = "AEAPLOJA", nullable = false)
    private double estoqueC;

    @Basic(optional = false)
    @Column(name = "RETIDO", table = "AEAPLOJA", nullable = false)
    private double retido;

    @Basic(optional = false)
    @Column(name = "PEDIDO", table = "AEAPLOJA", nullable = false)
    private double pedido;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAPLOJA", nullable = false)
    private String ativo;

    @Basic
    @Column(name = "DT_REAJUSTE_VARE", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtReajusteVare;

    @Basic
    @Column(name = "DT_REAJUSTE_ATAC", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtReajusteAtac;

    @Basic
    @Column(name = "DT_VENDA_VARE_D", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtVendaVareD;

    @Basic
    @Column(name = "DT_VENDA_ATAC_D", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtVendaAtacD;

    @Basic
    @Column(name = "DT_VENDA_VARE_N", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtVendaVareN;

    @Basic
    @Column(name = "DT_VENDA_ATAC_N", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtVendaAtacN;

    @Basic
    @Column(name = "DT_VENDA_PROMO_VARE_D", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoVareD;

    @Basic
    @Column(name = "DT_VENDA_PROMO_ATAC_D", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoAtacD;

    @Basic
    @Column(name = "DT_VENDA_PROMO_VARE_N", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoVareN;

    @Basic
    @Column(name = "DT_VENDA_PROMO_ATAC_N", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtVendaPromoAtacN;

    @Basic
    @Column(name = "DT_ENTRADA_D", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtEntradaD;

    @Basic
    @Column(name = "DT_COMPRA", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtCompra;

    @Basic
    @Column(name = "DT_ENTRADA_N", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtEntradaN;

    @Basic
    @Column(name = "DT_ULT_ALT", table = "AEAPLOJA")
    @Temporal(TemporalType.DATE)
    private Date dtUltAlt;

    @Basic(optional = false)
    @Column(name = "CT_REPOSICAO_N", table = "AEAPLOJA", nullable = false)
    private double ctReposicaoN;

    @Basic(optional = false)
    @Column(name = "CT_COMPLETO_N", table = "AEAPLOJA", nullable = false)
    private double ctCompletoN;

    @Basic(optional = false)
    @Column(name = "CT_REAL_N", table = "AEAPLOJA", nullable = false)
    private double ctRealN;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_N", table = "AEAPLOJA", nullable = false)
    private double ctMedioN;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_COMP_N", table = "AEAPLOJA", nullable = false)
    private double ctMedioCompN;

    @Basic(optional = false)
    @Column(name = "CT_REPOSICAO_D", table = "AEAPLOJA", nullable = false)
    private double ctReposicaoD;

    @Basic(optional = false)
    @Column(name = "CT_REAL_D", table = "AEAPLOJA", nullable = false)
    private double ctRealD;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_D", table = "AEAPLOJA", nullable = false)
    private double ctMedioD;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_CND", table = "AEAPLOJA", nullable = false)
    private double ctMedioCnd;

    @Basic(optional = false)
    @Column(name = "VENDA_ATAC", table = "AEAPLOJA", nullable = false)
    private double vendaAtac;

    @Basic(optional = false)
    @Column(name = "VENDA_VARE", table = "AEAPLOJA", nullable = false)
    private double vendaVare;

    @Basic(optional = false)
    @Column(name = "MINIMO", table = "AEAPLOJA", nullable = false)
    private double minimo;

    @Basic(optional = false)
    @Column(name = "MEDIO", table = "AEAPLOJA", nullable = false)
    private double medio;

    @Basic(optional = false)
    @Column(name = "MAXIMO", table = "AEAPLOJA", nullable = false)
    private double maximo;

    @Basic(optional = false)
    @Column(name = "NUM_COMPRAS", table = "AEAPLOJA", nullable = false)
    private Integer numCompras;

    @Basic(optional = false)
    @Column(name = "TEMPO_PED_ENTREGA", table = "AEAPLOJA", nullable = false)
    private double tempoPedEntrega;

    @Basic(optional = false)
    @Column(name = "PRECO_TABELA", table = "AEAPLOJA", nullable = false)
    private double precoTabela;

    @Basic(optional = false)
    @Column(name = "PERC_FAT_ATAC", table = "AEAPLOJA", nullable = false)
    private double percFatAtac;

    @Basic(optional = false)
    @Column(name = "PERC_FAT_VARE", table = "AEAPLOJA", nullable = false)
    private double percFatVare;

    @Basic(optional = false)
    @Column(name = "QTDE_PROD_DIA", table = "AEAPLOJA", nullable = false)
    private double qtdeProdDia;

    @Basic
    @Column(name = "FORMA_VENDA", table = "AEAPLOJA")
    private String formaVenda;

    public Integer getIdAeaploja() {
        return idAeaploja;
    }

    public void setIdAeaploja(Integer idAeaploja) {
        this.idAeaploja = idAeaploja;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdAeacodstEnt() {
        return idAeacodstEnt;
    }

    public void setIdAeacodstEnt(Integer idAeacodstEnt) {
        this.idAeacodstEnt = idAeacodstEnt;
    }

    public Integer getIdAeacodst() {
        return idAeacodst;
    }

    public void setIdAeacodst(Integer idAeacodst) {
        this.idAeacodst = idAeacodst;
    }

    public Integer getIdAeaobspr() {
        return idAeaobspr;
    }

    public void setIdAeaobspr(Integer idAeaobspr) {
        this.idAeaobspr = idAeaobspr;
    }

    public Integer getIdAeasazon() {
        return idAeasazon;
    }

    public void setIdAeasazon(Integer idAeasazon) {
        this.idAeasazon = idAeasazon;
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

    public double getRetido() {
        return retido;
    }

    public void setRetido(double retido) {
        this.retido = retido;
    }

    public double getPedido() {
        return pedido;
    }

    public void setPedido(double pedido) {
        this.pedido = pedido;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public Date getDtReajusteVare() {
        return dtReajusteVare;
    }

    public void setDtReajusteVare(Date dtReajusteVare) {
        this.dtReajusteVare = dtReajusteVare;
    }

    public Date getDtReajusteAtac() {
        return dtReajusteAtac;
    }

    public void setDtReajusteAtac(Date dtReajusteAtac) {
        this.dtReajusteAtac = dtReajusteAtac;
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

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public Date getDtEntradaN() {
        return dtEntradaN;
    }

    public void setDtEntradaN(Date dtEntradaN) {
        this.dtEntradaN = dtEntradaN;
    }

    public Date getDtUltAlt() {
        return dtUltAlt;
    }

    public void setDtUltAlt(Date dtUltAlt) {
        this.dtUltAlt = dtUltAlt;
    }

    public double getCtReposicaoN() {
        return ctReposicaoN;
    }

    public void setCtReposicaoN(double ctReposicaoN) {
        this.ctReposicaoN = ctReposicaoN;
    }

    public double getCtCompletoN() {
        return ctCompletoN;
    }

    public void setCtCompletoN(double ctCompletoN) {
        this.ctCompletoN = ctCompletoN;
    }

    public double getCtRealN() {
        return ctRealN;
    }

    public void setCtRealN(double ctRealN) {
        this.ctRealN = ctRealN;
    }

    public double getCtMedioN() {
        return ctMedioN;
    }

    public void setCtMedioN(double ctMedioN) {
        this.ctMedioN = ctMedioN;
    }

    public double getCtMedioCompN() {
        return ctMedioCompN;
    }

    public void setCtMedioCompN(double ctMedioCompN) {
        this.ctMedioCompN = ctMedioCompN;
    }

    public double getCtReposicaoD() {
        return ctReposicaoD;
    }

    public void setCtReposicaoD(double ctReposicaoD) {
        this.ctReposicaoD = ctReposicaoD;
    }

    public double getCtRealD() {
        return ctRealD;
    }

    public void setCtRealD(double ctRealD) {
        this.ctRealD = ctRealD;
    }

    public double getCtMedioD() {
        return ctMedioD;
    }

    public void setCtMedioD(double ctMedioD) {
        this.ctMedioD = ctMedioD;
    }

    public double getCtMedioCnd() {
        return ctMedioCnd;
    }

    public void setCtMedioCnd(double ctMedioCnd) {
        this.ctMedioCnd = ctMedioCnd;
    }

    public double getVendaAtac() {
        return vendaAtac;
    }

    public void setVendaAtac(double vendaAtac) {
        this.vendaAtac = vendaAtac;
    }

    public double getVendaVare() {
        return vendaVare;
    }

    public void setVendaVare(double vendaVare) {
        this.vendaVare = vendaVare;
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

    public Integer getNumCompras() {
        return numCompras;
    }

    public void setNumCompras(Integer numCompras) {
        this.numCompras = numCompras;
    }

    public double getTempoPedEntrega() {
        return tempoPedEntrega;
    }

    public void setTempoPedEntrega(double tempoPedEntrega) {
        this.tempoPedEntrega = tempoPedEntrega;
    }

    public double getPrecoTabela() {
        return precoTabela;
    }

    public void setPrecoTabela(double precoTabela) {
        this.precoTabela = precoTabela;
    }

    public double getPercFatAtac() {
        return percFatAtac;
    }

    public void setPercFatAtac(double percFatAtac) {
        this.percFatAtac = percFatAtac;
    }

    public double getPercFatVare() {
        return percFatVare;
    }

    public void setPercFatVare(double percFatVare) {
        this.percFatVare = percFatVare;
    }

    public double getQtdeProdDia() {
        return qtdeProdDia;
    }

    public void setQtdeProdDia(double qtdeProdDia) {
        this.qtdeProdDia = qtdeProdDia;
    }

    public String getFormaVenda() {
        return formaVenda;
    }

    public void setFormaVenda(String formaVenda) {
        this.formaVenda = formaVenda;
    }

}