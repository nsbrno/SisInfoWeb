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
@Table(name = "RPARATEI")
@Data
public class RparateiEntity {

    @Id
    @Column(name = "ID_RPARATEI", table = "RPARATEI", nullable = false)
    private Integer idRparatei;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPARATEI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPARATEI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPARATEI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPARATEI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPARATEI")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "RPARATEI")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "DC", table = "RPARATEI")
    private String dc;

    @Basic(optional = false)
    @Column(name = "VL_RATEADO", table = "RPARATEI", nullable = false)
    private double vlRateado;
}