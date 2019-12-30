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
@Table(name = "AEACAIXA")
@Data
public class AeacaixaEntity {

    @Id
    @Column(name = "ID_AEACAIXA", table = "AEACAIXA", nullable = false)
    private Integer idAeacaixa;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEACAIXA", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO_FUNC", table = "AEACAIXA", nullable = false)
    private Integer idCfaclifoFunc;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACAIXA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACAIXA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACAIXA")
    private Integer ctInteg;

    @Basic
    @Column(name = "NUMERO", table = "AEACAIXA")
    private Integer numero;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "AEACAIXA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "TURNO", table = "AEACAIXA", nullable = false)
    private String turno;

    @Basic(optional = false)
    @Column(name = "VL_RECEBIMENTOS", table = "AEACAIXA", nullable = false)
    private double vlRecebimentos;

    @Basic(optional = false)
    @Column(name = "VL_CARTAO", table = "AEACAIXA", nullable = false)
    private double vlCartao;

    @Basic(optional = false)
    @Column(name = "VL_NOTAS", table = "AEACAIXA", nullable = false)
    private double vlNotas;

    @Basic(optional = false)
    @Column(name = "VL_CHEQUE_VISTA", table = "AEACAIXA", nullable = false)
    private double vlChequeVista;

    @Basic(optional = false)
    @Column(name = "VL_CHEQUE_PRAZO", table = "AEACAIXA", nullable = false)
    private double vlChequePrazo;

    @Basic(optional = false)
    @Column(name = "VL_DINHEIRO", table = "AEACAIXA", nullable = false)
    private double vlDinheiro;

    @Basic(optional = false)
    @Column(name = "VL_SAIDAS", table = "AEACAIXA", nullable = false)
    private double vlSaidas;

    @Basic(optional = false)
    @Column(name = "VL_ENCERRANTE", table = "AEACAIXA", nullable = false)
    private double vlEncerrante;

    @Basic(optional = false)
    @Column(name = "VL_VENDAS", table = "AEACAIXA", nullable = false)
    private double vlVendas;

    @Basic(optional = false)
    @Column(name = "FECHADO", table = "AEACAIXA", nullable = false)
    private short fechado;

    @Basic
    @Column(name = "FC_VL_CAIXA", table = "AEACAIXA", precision = 15)
    private Double fcVlCaixa;

    @Basic
    @Column(name = "FC_VL_MOVTO", table = "AEACAIXA", precision = 15)
    private Double fcVlMovto;
}