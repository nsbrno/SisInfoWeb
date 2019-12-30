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
@Table(name = "AEACONEN")
@Data
public class AeaconenEntity {

    @Id
    @Column(name = "ID_AEACONEN", table = "AEACONEN", nullable = false)
    private Integer idAeaconen;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACONEN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACONEN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACONEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "DT_CAD", table = "AEACONEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACONEN")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACONEN")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "AEACONEN", length = 128)
    private String descricao;
}