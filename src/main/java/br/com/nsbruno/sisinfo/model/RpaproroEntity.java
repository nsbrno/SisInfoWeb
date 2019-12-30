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
@Table(name = "RPAPRORO")
@Data
public class RpaproroEntity {

    @Id
    @Column(name = "ID_RPAPRORO", table = "RPAPRORO", nullable = false)
    private Integer idRpaproro;

    @Basic(optional = false)
    @Column(name = "ID_RPAPARCE", table = "RPAPRORO", nullable = false)
    private Integer idRpaparce;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAPRORO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAPRORO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAPRORO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAPRORO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAPRORO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "RPAPRORO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "DT_VENCIMENTO", table = "RPAPRORO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Basic(optional = false)
    @Column(name = "DT_VENCIMENTO_ANT", table = "RPAPRORO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtVencimentoAnt;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "RPAPRORO", nullable = false)
    private double vlJuros;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPAPRORO")
    private byte[] obs;
}