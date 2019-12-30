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
@Table(name = "RPALCPAR")
@Data
public class RpalcparEntity {

    @Id
    @Column(name = "ID_RPALCPAR", table = "RPALCPAR", nullable = false)
    private Integer idRpalcpar;

    @Basic(optional = false)
    @Column(name = "ID_RPAPARCE", table = "RPALCPAR", nullable = false)
    private Integer idRpaparce;

    @Basic
    @Column(name = "ID_CBAITMOV", table = "RPALCPAR")
    private Integer idCbaitmov;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "RPALCPAR")
    private Integer idCbaplcta;

    @Basic
    @Column(name = "ID_CFATPDOC_ANT", table = "RPALCPAR")
    private Integer idCfatpdocAnt;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPALCPAR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPALCPAR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPALCPAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPALCPAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPALCPAR")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO", table = "RPALCPAR")
    private String tipo;

    @Basic
    @Column(name = "DT_IMPORTACAO", table = "RPALCPAR")
    @Temporal(TemporalType.DATE)
    private Date dtImportacao;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "RPALCPAR")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "RPALCPAR", nullable = false)
    private Integer sequencia;

    @Basic
    @Column(name = "D_C", table = "RPALCPAR")
    private String dC;

    @Basic(optional = false)
    @Column(name = "VL_PAGO", table = "RPALCPAR", nullable = false)
    private double vlPago;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_PRORROG", table = "RPALCPAR", nullable = false)
    private double vlJurosProrrog;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "RPALCPAR", nullable = false)
    private double vlJuros;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "RPALCPAR", nullable = false)
    private double vlDesconto;

    @Basic
    @Column(name = "FC_VL_PAGO_TOTAL", table = "RPALCPAR", precision = 15)
    private Double fcVlPagoTotal;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPALCPAR")
    private byte[] obs;
}