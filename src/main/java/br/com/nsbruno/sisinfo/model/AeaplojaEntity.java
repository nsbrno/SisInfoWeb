package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "AEAPLOJA", uniqueConstraints = @UniqueConstraint(columnNames = {"ID_SMAEMPRE", "ID_AEAPRODU"}))
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
}