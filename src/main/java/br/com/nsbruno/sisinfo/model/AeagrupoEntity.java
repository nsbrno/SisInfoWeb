package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "AEAGRUPO", uniqueConstraints = @UniqueConstraint(columnNames = {"ID_AEACLASE", "CODIGO"}))
public class AeagrupoEntity {

    @Id
    @Column(name = "ID_AEAGRUPO", table = "AEAGRUPO", nullable = false)
    private Integer idAeagrupo;

    @Basic(optional = false)
    @Column(name = "ID_AEACLASE", table = "AEAGRUPO", nullable = false)
    private Integer idAeaclase;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAGRUPO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAGRUPO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAGRUPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAGRUPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAGRUPO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAGRUPO", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAGRUPO", nullable = false, length = 60)
    private String descricao;
}