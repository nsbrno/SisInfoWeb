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
@Table(name = "RPASUBST")
@Data
public class RpasubstEntity {

    @Id
    @Column(name = "ID_RPASUBST", table = "RPASUBST", nullable = false)
    private Integer idRpasubst;

    @Basic(optional = false)
    @Column(name = "ID_RPAPARCE", table = "RPASUBST", nullable = false)
    private Integer idRpaparce;

    @Basic
    @Column(name = "ID_CFATPDOC", table = "RPASUBST")
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "RPASUBST")
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CBAPLCTA_CTA_TRANS", table = "RPASUBST")
    private Integer idCbaplctaCtaTrans;

    @Basic
    @Column(name = "ID_CBAPLCTA_DP", table = "RPASUBST")
    private Integer idCbaplctaDp;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "RPASUBST")
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPASUBST", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPASUBST", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPASUBST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPASUBST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPASUBST")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "VL_PARCELA", table = "RPASUBST", nullable = false)
    private double vlParcela;

    @Basic
    @Column(name = "DT_EMISSAO", table = "RPASUBST")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_VENCIMENTO", table = "RPASUBST")
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;
}