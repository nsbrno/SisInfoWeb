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
@Table(name = "RPADOCTO")
@Data
public class RpadoctoEntity {

    @Id
    @Column(name = "ID_RPADOCTO", table = "RPADOCTO", nullable = false)
    private Integer idRpadocto;

    @Basic(optional = false)
    @Column(name = "ID_RPAFATUR", table = "RPADOCTO", nullable = false)
    private Integer idRpafatur;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "RPADOCTO")
    private Integer idAeaentra;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPADOCTO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPADOCTO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPADOCTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPADOCTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPADOCTO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "RPADOCTO", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "VL_ANEXADO", table = "RPADOCTO", nullable = false)
    private double vlAnexado;
}