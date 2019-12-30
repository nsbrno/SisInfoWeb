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
@Table(name = "SMARLPRN")
@Data
public class SmarlprnEntity {

    @Id
    @Column(name = "ID_SMARLPRN", table = "SMARLPRN", nullable = false)
    private Integer idSmarlprn;

    @Basic(optional = false)
    @Column(name = "ID_SMAUSURL", table = "SMARLPRN", nullable = false)
    private Integer idSmausurl;

    @Basic
    @Column(name = "ID_SMAUSUAR", table = "SMARLPRN")
    private Integer idSmausuar;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMARLPRN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMARLPRN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMARLPRN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMARLPRN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMARLPRN")
    private Integer ctInteg;

    @Basic
    @Column(name = "MICRO", table = "SMARLPRN", length = 40)
    private String micro;

    @Basic
    @Column(name = "IMPRESSORA", table = "SMARLPRN", length = 40)
    private String impressora;
}