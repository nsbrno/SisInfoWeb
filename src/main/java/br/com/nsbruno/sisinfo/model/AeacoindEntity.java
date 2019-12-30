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
@Table(name = "AEACOIND")
@Data
public class AeacoindEntity {

    @Id
    @Column(name = "ID_AEACOIND", table = "AEACOIND", nullable = false)
    private Integer idAeacoind;

    @Basic
    @Column(name = "ID_AEAITIND", table = "AEACOIND")
    private Integer idAeaitind;

    @Basic
    @Column(name = "US_CAD", table = "AEACOIND", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACOIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACOIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACOIND")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACOIND", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DT_CONCLUIDO", table = "AEACOIND")
    @Temporal(TemporalType.DATE)
    private Date dtConcluido;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEACOIND", nullable = false)
    private double quantidade;
}