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
@Table(name = "SMAUSPRG") 
@Data
public class SmausprgEntity {

    @Id
    @Column(name = "ID_SMAUSPRG", table = "SMAUSPRG", nullable = false)
    private Integer idSmausprg;

    @Basic(optional = false)
    @Column(name = "ID_SMAUSUAR", table = "SMAUSPRG", nullable = false)
    private Integer idSmausuar;

    @Basic
    @Column(name = "ID_SMAMENUS", table = "SMAUSPRG")
    private Integer idSmamenus;

    @Basic
    @Column(name = "ID_SMAMNPRG", table = "SMAUSPRG")
    private Integer idSmamnprg;

    @Basic
    @Column(name = "ID_SMAMNPRG_TELA", table = "SMAUSPRG")
    private Integer idSmamnprgTela;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAUSPRG", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAUSPRG", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAUSPRG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAUSPRG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAUSPRG")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "SMAUSPRG", nullable = false)
    private Integer sequencia;
}