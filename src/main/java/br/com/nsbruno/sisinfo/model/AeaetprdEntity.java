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
@Table(name = "AEAETPRD")
@Data
public class AeaetprdEntity {

    @Id
    @Column(name = "ID_AEAETPRD", table = "AEAETPRD", nullable = false)
    private Integer idAeaetprd;

    @Basic(optional = false)
    @Column(name = "ID_AEAETAPA", table = "AEAETPRD", nullable = false)
    private Integer idAeaetapa;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEAETPRD", nullable = false)
    private Integer idAeaprodu;

    @Basic
    @Column(name = "US_CAD", table = "AEAETPRD", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAETPRD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAETPRD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAETPRD")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAETPRD", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "MIN_PREVISTOS", table = "AEAETPRD")
    private Integer minPrevistos;
}