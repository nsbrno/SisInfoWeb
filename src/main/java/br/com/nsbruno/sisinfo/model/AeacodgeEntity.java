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
@Table(name = "AEACODGE")
@Data
public class AeacodgeEntity {

    @Id
    @Column(name = "ID_AEACODGE", table = "AEACODGE", nullable = false)
    private Integer idAeacodge;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACODGE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACODGE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACODGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACODGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACODGE")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACODGE", length = 5)
    private String codigo;

    @Lob
    @Basic
    @Column(name = "DESCRICAO", table = "AEACODGE")
    private byte[] descricao;
}