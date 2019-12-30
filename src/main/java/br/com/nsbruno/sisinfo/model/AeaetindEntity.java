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
@Table(name = "AEAETIND")
@Data
public class AeaetindEntity {

    @Id
    @Column(name = "ID_AEAETIND", table = "AEAETIND", nullable = false)
    private Integer idAeaetind;

    @Basic(optional = false)
    @Column(name = "ID_AEAITIND", table = "AEAETIND", nullable = false)
    private Integer idAeaitind;

    @Basic(optional = false)
    @Column(name = "ID_AEAETPRD", table = "AEAETIND", nullable = false)
    private Integer idAeaetprd;

    @Basic
    @Column(name = "US_CAD", table = "AEAETIND", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAETIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAETIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAETIND")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAETIND", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "AEAETIND", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "MIN_GASTOS", table = "AEAETIND")
    private Integer minGastos;
}