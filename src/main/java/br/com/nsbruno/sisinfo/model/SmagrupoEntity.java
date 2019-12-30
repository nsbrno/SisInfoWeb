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
@Table(name = "SMAGRUPO")
@Data
public class SmagrupoEntity {

    @Id
    @Column(name = "ID_SMAGRUPO", table = "SMAGRUPO", nullable = false)
    private Integer idSmagrupo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAGRUPO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAGRUPO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAGRUPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAGRUPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAGRUPO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "SMAGRUPO", nullable = false, length = 40)
    private String descricao;
}