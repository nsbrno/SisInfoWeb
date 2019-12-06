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
@Table(name = "AEAAGINV")
@Data
public class AeaaginvEntity {

    @Id
    @Column(name = "ID_AEAAGINV", table = "AEAAGINV", nullable = false)
    private Integer idAeaaginv;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "AEAAGINV")
    private Integer idSmaempre;

    @Basic
    @Column(name = "US_CAD", table = "AEAAGINV", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAAGINV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAAGINV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAAGINV")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAAGINV", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "AEAAGINV")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "AEAAGINV", length = 40)
    private String descricao;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "AEAAGINV")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic(optional = false)
    @Column(name = "ABERTO", table = "AEAAGINV", nullable = false)
    private String aberto;
}