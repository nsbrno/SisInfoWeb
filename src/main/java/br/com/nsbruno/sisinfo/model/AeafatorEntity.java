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
@Table(name = "AEAFATOR")
@Data
public class AeafatorEntity {

    @Id
    @Column(name = "ID_AEAFATOR", table = "AEAFATOR", nullable = false)
    private Integer idAeafator;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAFATOR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAFATOR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAFATOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAFATOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAFATOR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAFATOR", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAFATOR", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "JURO_MEDIO_ATAC", table = "AEAFATOR", nullable = false)
    private double juroMedioAtac;

    @Basic(optional = false)
    @Column(name = "JURO_MEDIO_VARE", table = "AEAFATOR", nullable = false)
    private double juroMedioVare;

    @Basic(optional = false)
    @Column(name = "JURO_MEDIO_SERV", table = "AEAFATOR", nullable = false)
    private double juroMedioServ;

    @Basic(optional = false)
    @Column(name = "DESC_PG_ANT_ATAC", table = "AEAFATOR", nullable = false)
    private double descPgAntAtac;

    @Basic(optional = false)
    @Column(name = "DESC_PG_ANT_VARE", table = "AEAFATOR", nullable = false)
    private double descPgAntVare;

    @Basic(optional = false)
    @Column(name = "DESC_PG_ANT_SERV", table = "AEAFATOR", nullable = false)
    private double descPgAntServ;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_PLANO_ATAC_VISTA", table = "AEAFATOR", nullable = false)
    private double descMaxPlanoAtacVista;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_PLANO_ATAC_PRAZO", table = "AEAFATOR", nullable = false)
    private double descMaxPlanoAtacPrazo;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_PLANO_VARE_VISTA", table = "AEAFATOR", nullable = false)
    private double descMaxPlanoVareVista;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_PLANO_VARE_PRAZO", table = "AEAFATOR", nullable = false)
    private double descMaxPlanoVarePrazo;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_PLANO_SERV_VISTA", table = "AEAFATOR", nullable = false)
    private double descMaxPlanoServVista;

    @Basic(optional = false)
    @Column(name = "DESC_MAX_PLANO_SERV_PRAZO", table = "AEAFATOR", nullable = false)
    private double descMaxPlanoServPrazo;

    @Basic
    @Column(name = "TIPO_BONUS", table = "AEAFATOR")
    private String tipoBonus;

    @Basic(optional = false)
    @Column(name = "DIAS_BONUS", table = "AEAFATOR", nullable = false)
    private Integer diasBonus;
}