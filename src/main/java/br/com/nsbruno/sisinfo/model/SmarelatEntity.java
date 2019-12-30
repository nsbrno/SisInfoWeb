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
@Table(name = "SMARELAT")
@Data
public class SmarelatEntity {

    @Id
    @Column(name = "ID_SMARELAT", table = "SMARELAT", nullable = false)
    private Integer idSmarelat;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMARELAT")
    private Integer idSmaarqui;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMARELAT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMARELAT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMARELAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMARELAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMARELAT")
    private Integer ctInteg;

    @Lob
    @Basic
    @Column(name = "RELATORIO", table = "SMARELAT")
    private byte[] relatorio;

    @Basic
    @Column(name = "DESCRICAO", table = "SMARELAT", length = 40)
    private String descricao;

    @Basic
    @Column(name = "PRINCIPAL", table = "SMARELAT")
    private String principal;

    @Basic
    @Column(name = "USAR_ORIGINAL", table = "SMARELAT")
    private String usarOriginal;
}