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
@Table(name = "AEACODPR")
@Data
public class AeacodprEntity {

    @Id
    @Column(name = "ID_AEACODPR", table = "AEACODPR", nullable = false)
    private Integer idAeacodpr;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEACODPR", nullable = false)
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACODPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACODPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACODPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACODPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACODPR")
    private Integer ctInteg;

    @Basic
    @Column(name = "DESCRICAO", table = "AEACODPR", length = 40)
    private String descricao;

    @Basic
    @Column(name = "REFERENCIA", table = "AEACODPR", length = 20)
    private String referencia;

    @Basic
    @Column(name = "CODIGO_BARRAS", table = "AEACODPR", length = 20)
    private String codigoBarras;
}