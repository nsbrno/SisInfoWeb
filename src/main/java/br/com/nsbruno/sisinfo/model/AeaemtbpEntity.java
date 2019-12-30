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
@Table(name = "AEAEMTBP")
@Data
public class AeaemtbpEntity {

    @Id
    @Column(name = "ID_AEAEMTBP", table = "AEAEMTBP", nullable = false)
    private Integer idAeaemtbp;

    @Basic(optional = false)
    @Column(name = "ID_AEATBPRO", table = "AEAEMTBP", nullable = false)
    private Integer idAeatbpro;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAEMTBP", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAEMTBP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAEMTBP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAEMTBP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAEMTBP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAEMTBP")
    private Integer ctInteg;
}