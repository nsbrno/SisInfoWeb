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
@Table(name = "SMALIBAC")
@Data
public class SmalibacEntity {

    @Id
    @Column(name = "ID_SMALIBAC", table = "SMALIBAC", nullable = false)
    private Integer idSmalibac;

    @Basic
    @Column(name = "ID_SMALIBER", table = "SMALIBAC")
    private Integer idSmaliber;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMALIBAC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMALIBAC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMALIBAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMALIBAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMALIBAC")
    private Integer ctInteg;

    @Basic
    @Column(name = "COD_TRANSACAO", table = "SMALIBAC")
    private Integer codTransacao;

    @Basic
    @Column(name = "USER_ADDR", table = "SMALIBAC", length = 20)
    private String userAddr;

    @Basic
    @Column(name = "ACAO", table = "SMALIBAC")
    private String acao;

    @Basic
    @Column(name = "OBS", table = "SMALIBAC", length = 128)
    private String obs;
}