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
@Table(name = "AEACODOM")
@Data
public class AeacodomEntity {

    @Id
    @Column(name = "ID_AEACODOM", table = "AEACODOM", nullable = false)
    private Integer idAeacodom;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACODOM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACODOM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACODOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACODOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACODOM")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACODOM")
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEACODOM", nullable = false, length = 40)
    private String descricao;
}