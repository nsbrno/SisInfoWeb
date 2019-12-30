package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


@Entity
@Table(name = "AEAEVEST")
@Data
public class AeaevestEntity {

    @Id
    @Column(name = "ID_AEAEVEST", table = "AEAEVEST", nullable = false)
    private Integer idAeaevest;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAEVEST", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAEVEST", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAEVEST", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAEVEST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAEVEST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAEVEST")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEAEVEST")
    private Integer codigo;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "AEAEVEST")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "TIPO", table = "AEAEVEST")
    private String tipo;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAEVEST")
    private byte[] obs;
}