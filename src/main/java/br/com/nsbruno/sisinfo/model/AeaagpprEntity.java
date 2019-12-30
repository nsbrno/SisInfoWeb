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
@Table(name = "AEAAGPPR")
@Data
public class AeaagpprEntity {

    @Id
    @Column(name = "ID_AEAAGPPR", table = "AEAAGPPR", nullable = false)
    private Integer idAeaagppr;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAAGPPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAAGPPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAAGPPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAAGPPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAAGPPR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAAGPPR", nullable = false, length = 50)
    private String descricao;
}