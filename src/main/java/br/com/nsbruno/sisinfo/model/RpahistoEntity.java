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
@Table(name = "RPAHISTO")
@Data
public class RpahistoEntity {

    @Id
    @Column(name = "ID_RPAHISTO", table = "RPAHISTO", nullable = false)
    private Integer idRpahisto;

    @Basic
    @Column(name = "ID_RPAPARCE", table = "RPAHISTO")
    private Integer idRpaparce;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "RPAHISTO", nullable = false)
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "RPAHISTO", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFATPCOB_ANT", table = "RPAHISTO")
    private Integer idCfatpcobAnt;

    @Basic
    @Column(name = "ID_CFATPCOB", table = "RPAHISTO")
    private Integer idCfatpcob;

    @Basic
    @Column(name = "ID_RPAHIPAD", table = "RPAHISTO")
    private Integer idRpahipad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAHISTO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAHISTO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAHISTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAHISTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAHISTO")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_MOVIMENTO", table = "RPAHISTO")
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "DT_PROXIMO_CONTATO", table = "RPAHISTO")
    @Temporal(TemporalType.DATE)
    private Date dtProximoContato;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPAHISTO")
    private byte[] obs;
}