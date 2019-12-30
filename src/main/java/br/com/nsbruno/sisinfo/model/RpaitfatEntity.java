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
@Table(name = "RPAITFAT")
@Data
public class RpaitfatEntity {

    @Id
    @Column(name = "ID_RPAITFAT", table = "RPAITFAT", nullable = false)
    private Integer idRpaitfat;

    @Basic(optional = false)
    @Column(name = "ID_RPAFATUR", table = "RPAITFAT", nullable = false)
    private Integer idRpafatur;

    @Basic
    @Column(name = "ID_AEAPEDID", table = "RPAITFAT")
    private Integer idAeapedid;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "RPAITFAT")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEASAIDA", table = "RPAITFAT")
    private Integer idAeasaida;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "RPAITFAT")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_AEAFRETE", table = "RPAITFAT")
    private Integer idAeafrete;

    @Basic
    @Column(name = "ID_GCAVIGEN", table = "RPAITFAT")
    private Integer idGcavigen;

    @Basic
    @Column(name = "ID_AEACAIXA", table = "RPAITFAT")
    private Integer idAeacaixa;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAITFAT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAITFAT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAITFAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAITFAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAITFAT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "RPAITFAT", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "CANCELADO", table = "RPAITFAT", nullable = false)
    private String cancelado;

    @Basic(optional = false)
    @Column(name = "VL_ITEM_FAT", table = "RPAITFAT", nullable = false)
    private double vlItemFat;

    @Basic
    @Column(name = "COMPLEMENTO", table = "RPAITFAT")
    private String complemento;
}