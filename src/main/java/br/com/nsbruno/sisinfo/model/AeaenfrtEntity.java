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
@Table(name = "AEAENFRT")
@Data
public class AeaenfrtEntity {

    @Id
    @Column(name = "ID_AEAENFRT", table = "AEAENFRT", nullable = false)
    private Integer idAeaenfrt;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEAENFRT")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEAFRETE", table = "AEAENFRT")
    private Integer idAeafrete;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAENFRT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAENFRT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAENFRT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAENFRT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAENFRT")
    private Integer ctInteg;
}