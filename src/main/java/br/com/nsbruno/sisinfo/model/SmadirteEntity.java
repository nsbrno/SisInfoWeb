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
@Table(name = "SMADIRTE")
@Data
public class SmadirteEntity {

    @Id
    @Column(name = "ID_SMADIRTE", table = "SMADIRTE", nullable = false)
    private Integer idSmadirte;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMADIRTE")
    private Integer idSmaarqui;

    @Basic
    @Column(name = "ID_SMAUSUAR", table = "SMADIRTE")
    private Integer idSmausuar;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMADIRTE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMADIRTE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMADIRTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMADIRTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMADIRTE")
    private Integer ctInteg;

    @Basic
    @Column(name = "CAMPO", table = "SMADIRTE", length = 40)
    private String campo;

    @Basic
    @Column(name = "FORMATO", table = "SMADIRTE")
    private String formato;
}