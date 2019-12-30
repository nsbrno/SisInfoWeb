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
@Table(name = "AEACONJT")
@Data
public class AeaconjtEntity {

    @Id
    @Column(name = "ID_AEACONJT", table = "AEACONJT", nullable = false)
    private Integer idAeaconjt;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEACONJT", nullable = false)
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU_ITEM", table = "AEACONJT", nullable = false)
    private Integer idAeaproduItem;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEACONJT", nullable = false)
    private Integer idAeaunven;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACONJT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACONJT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACONJT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACONJT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACONJT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "AEACONJT", nullable = false)
    private String tipo;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEACONJT", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEACONJT", nullable = false)
    private double quantidade;
}