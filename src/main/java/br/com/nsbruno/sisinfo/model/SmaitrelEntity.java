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
@Table(name = "SMAITREL")
@Data
public class SmaitrelEntity {

    @Id
    @Column(name = "ID_SMAITREL", table = "SMAITREL", nullable = false)
    private Integer idSmaitrel;

    @Basic(optional = false)
    @Column(name = "ID_SMARELAT", table = "SMAITREL", nullable = false)
    private Integer idSmarelat;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAITREL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAITREL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAITREL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAITREL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAITREL")
    private Integer ctInteg;

    @Basic
    @Column(name = "NOME_ARQUIVO", table = "SMAITREL", length = 20)
    private String nomeArquivo;

    @Lob
    @Basic
    @Column(name = "SQL", table = "SMAITREL")
    private byte[] sql;
}