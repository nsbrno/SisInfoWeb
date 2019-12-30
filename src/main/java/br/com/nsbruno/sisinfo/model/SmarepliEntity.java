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
@Table(name = "SMAREPLI")
@Data
public class SmarepliEntity {

    @Id
    @Column(name = "ID_SMAREPLI", table = "SMAREPLI", nullable = false)
    private Integer idSmarepli;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMAREPLI")
    private Integer idSmaarqui;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAREPLI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAREPLI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAREPLI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAREPLI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAREPLI")
    private Integer ctInteg;

    @Basic
    @Column(name = "SEQUENCIA", table = "SMAREPLI")
    private Integer sequencia;

    @Basic
    @Column(name = "TIPO", table = "SMAREPLI")
    private String tipo;

    @Basic
    @Column(name = "CAMPO", table = "SMAREPLI", length = 40)
    private String campo;
}