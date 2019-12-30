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
@Table(name = "AEAFAMIL")
@Data
public class AeafamilEntity {

    @Id
    @Column(name = "ID_AEAFAMIL", table = "AEAFAMIL", nullable = false)
    private Integer idAeafamil;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAFAMIL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAFAMIL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAFAMIL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAFAMIL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAFAMIL")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAFAMIL", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAFAMIL", nullable = false, length = 40)
    private String descricao;
}