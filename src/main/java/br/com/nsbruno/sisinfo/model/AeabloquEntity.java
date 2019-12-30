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
@Table(name = "AEABLOQU")
@Data
public class AeabloquEntity {

    @Id
    @Column(name = "ID_AEABLOQU", table = "AEABLOQU", nullable = false)
    private Integer idAeabloqu;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "AEABLOQU")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_AEAFAMIL", table = "AEABLOQU")
    private Integer idAeafamil;

    @Basic
    @Column(name = "ID_AEACLASE", table = "AEABLOQU")
    private Integer idAeaclase;

    @Basic
    @Column(name = "ID_AEAGRUPO", table = "AEABLOQU")
    private Integer idAeagrupo;

    @Basic
    @Column(name = "ID_AEASGRUP", table = "AEABLOQU")
    private Integer idAeasgrup;

    @Basic
    @Column(name = "ID_AEAMARCA", table = "AEABLOQU")
    private Integer idAeamarca;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "AEABLOQU")
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEABLOQU", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEABLOQU", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEABLOQU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEABLOQU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEABLOQU")
    private Integer ctInteg;

    @Basic
    @Column(name = "BLOQUEIA_ORC", table = "AEABLOQU")
    private String bloqueiaOrc;

    @Basic
    @Column(name = "BLOQUEIA_PED", table = "AEABLOQU")
    private String bloqueiaPed;

    @Basic
    @Column(name = "BLOQUEIA_NFS", table = "AEABLOQU")
    private String bloqueiaNfs;

    @Basic
    @Column(name = "ORC_SEM_ESTOQUE", table = "AEABLOQU")
    private String orcSemEstoque;

    @Basic
    @Column(name = "PED_SEM_ESTOQUE", table = "AEABLOQU")
    private String pedSemEstoque;

    @Basic
    @Column(name = "NFS_SEM_ESTOQUE", table = "AEABLOQU")
    private String nfsSemEstoque;
}