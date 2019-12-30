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
@Table(name = "AEABICMV")
@Data
public class AeabicmvEntity {

    @Id
    @Column(name = "ID_AEABICMV", table = "AEABICMV", nullable = false)
    private Integer idAeabicmv;

    @Basic
    @Column(name = "ID_AEACAIXA", table = "AEABICMV")
    private Integer idAeacaixa;

    @Basic
    @Column(name = "ID_AEATANQU", table = "AEABICMV")
    private Integer idAeatanqu;

    @Basic
    @Column(name = "ID_AEABICOS", table = "AEABICMV")
    private Integer idAeabicos;

    @Basic
    @Column(name = "ID_AEAITENT", table = "AEABICMV")
    private Integer idAeaitent;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEABICMV", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEABICMV", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEABICMV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEABICMV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEABICMV")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO", table = "AEABICMV")
    private String tipo;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "AEABICMV")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "QTDE", table = "AEABICMV", nullable = false)
    private double qtde;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEABICMV", nullable = false)
    private Integer numero;

    @Basic
    @Column(name = "MOT_INTERV", table = "AEABICMV", length = 40)
    private String motInterv;

    @Basic
    @Column(name = "NOM_INTERV", table = "AEABICMV", length = 40)
    private String nomInterv;

    @Basic
    @Column(name = "CNPJ_INTERV", table = "AEABICMV", length = 18)
    private String cnpjInterv;

    @Basic
    @Column(name = "CPF_INTERV", table = "AEABICMV", length = 18)
    private String cpfInterv;

    @Basic(optional = false)
    @Column(name = "VAL_FECHA", table = "AEABICMV", nullable = false)
    private double valFecha;

    @Basic(optional = false)
    @Column(name = "VAL_ABERT", table = "AEABICMV", nullable = false)
    private double valAbert;

    @Basic(optional = false)
    @Column(name = "VOL_AFERI", table = "AEABICMV", nullable = false)
    private double volAferi;

    @Basic(optional = false)
    @Column(name = "VL_UNIT", table = "AEABICMV", nullable = false)
    private double vlUnit;

    @Basic
    @Column(name = "FC_VOL_VENDAS", table = "AEABICMV", precision = 15)
    private Double fcVolVendas;

    @Basic
    @Column(name = "FC_VL_VENDA", table = "AEABICMV", precision = 15)
    private Double fcVlVenda;
}