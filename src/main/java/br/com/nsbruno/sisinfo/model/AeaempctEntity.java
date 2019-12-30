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
@Table(name = "AEAEMPCT")
@Data
public class AeaempctEntity {

    @Id
    @Column(name = "ID_AEAEMPCT", table = "AEAEMPCT", nullable = false)
    private Integer idAeaempct;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "AEAEMPCT")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_AEACODST", table = "AEAEMPCT")
    private Integer idAeacodst;

    @Basic
    @Column(name = "ID_AEAOBSPR", table = "AEAEMPCT")
    private Integer idAeaobspr;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAEMPCT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAEMPCT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAEMPCT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAEMPCT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAEMPCT")
    private Integer ctInteg;
}