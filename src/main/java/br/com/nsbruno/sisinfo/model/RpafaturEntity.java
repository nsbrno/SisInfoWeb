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
import lombok.Data;


@Entity
@Table(name = "RPAFATUR")
@Data
public class RpafaturEntity {

    @Id
    @Column(name = "ID_RPAFATUR", table = "RPAFATUR", nullable = false)
    private Integer idRpafatur;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "RPAFATUR", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFATPFAT_VENDA", table = "RPAFATUR")
    private Integer idCfatpfatVenda;

    @Basic(optional = false)
    @Column(name = "ID_CFATPFAT", table = "RPAFATUR", nullable = false)
    private Integer idCfatpfat;

    @Basic
    @Column(name = "ID_AEAFORMA", table = "RPAFATUR")
    private Integer idAeaforma;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_CTA_TRANS", table = "RPAFATUR", nullable = false)
    private Integer idCbaplctaCtaTrans;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA", table = "RPAFATUR", nullable = false)
    private Integer idCbaplcta;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "RPAFATUR")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "RPAFATUR")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFACLIFO_CONVENIO", table = "RPAFATUR")
    private Integer idCfaclifoConvenio;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAFATUR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAFATUR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAFATUR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAFATUR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAFATUR")
    private Integer ctInteg;

    @Basic
    @Column(name = "ORIGEM", table = "RPAFATUR")
    private String origem;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "RPAFATUR", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "ATAC_VAREJO", table = "RPAFATUR")
    private String atacVarejo;

    @Basic
    @Column(name = "NUMERO_VENDA", table = "RPAFATUR")
    private Integer numeroVenda;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "RPAFATUR", nullable = false)
    private Integer numero;

    @Basic
    @Column(name = "DT_IMPORTACAO", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtImportacao;

    @Basic(optional = false)
    @Column(name = "DT_ABERTURA", table = "RPAFATUR", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtAbertura;

    @Basic
    @Column(name = "DT_EMISSAO", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_BAIXA", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtBaixa;

    @Basic
    @Column(name = "DT_PAGAMENTO", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtPagamento;

    @Basic
    @Column(name = "DT_CANCEL", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtCancel;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "RPAFATUR", nullable = false)
    private short situacao;

    @Basic(optional = false)
    @Column(name = "VL_FATURA", table = "RPAFATUR", nullable = false)
    private double vlFatura;

    @Basic(optional = false)
    @Column(name = "VL_DIF_VENCTO", table = "RPAFATUR", nullable = false)
    private double vlDifVencto;

    @Basic(optional = false)
    @Column(name = "VL_COMP_FATURA", table = "RPAFATUR", nullable = false)
    private double vlCompFatura;

    @Basic
    @Column(name = "FC_VL_TOTAL_FATURA", table = "RPAFATUR", precision = 15)
    private Double fcVlTotalFatura;

    @Basic(optional = false)
    @Column(name = "VL_FATURADO", table = "RPAFATUR", nullable = false)
    private double vlFaturado;

    @Basic(optional = false)
    @Column(name = "VL_PAGO", table = "RPAFATUR", nullable = false)
    private double vlPago;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "RPAFATUR", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "RPAFATUR", nullable = false)
    private double vlJuros;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_PRORROG", table = "RPAFATUR", nullable = false)
    private double vlJurosProrrog;

    @Basic(optional = false)
    @Column(name = "VL_ANEXADO", table = "RPAFATUR", nullable = false)
    private double vlAnexado;

    @Basic
    @Column(name = "FC_VL_TOTAL_PAGO", table = "RPAFATUR", precision = 15)
    private Double fcVlTotalPago;

    @Basic
    @Column(name = "FC_VL_RESTANTE", table = "RPAFATUR", precision = 15)
    private Double fcVlRestante;

    @Basic(optional = false)
    @Column(name = "NUM_PARCELAS", table = "RPAFATUR", nullable = false)
    private short numParcelas;

    @Basic(optional = false)
    @Column(name = "AGUARDA_FATURAMENTO", table = "RPAFATUR", nullable = false)
    private String aguardaFaturamento;

    @Basic
    @Column(name = "FATURADO", table = "RPAFATUR")
    private String faturado;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPAFATUR")
    private byte[] obs;

    @Basic
    @Column(name = "A_S", table = "RPAFATUR")
    private String a_S;
}