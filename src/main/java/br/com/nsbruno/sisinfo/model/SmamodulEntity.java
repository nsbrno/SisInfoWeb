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
@Table(name = "SMAMODUL")
@Data
public class SmamodulEntity {

    @Id
    @Column(name = "ID_SMAMODUL", table = "SMAMODUL", nullable = false)
    private Integer idSmamodul;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAMODUL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAMODUL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAMODUL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAMODUL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAMODUL")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "MODULO", table = "SMAMODUL", nullable = false, length = 12)
    private String modulo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "SMAMODUL", nullable = false, length = 40)
    private String descricao;
}