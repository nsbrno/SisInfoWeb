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
@Table(name = "SMAARQGR")
@Data
public class SmaarqgrEntity {

    @Id
    @Column(name = "ID_SMAARQGR", table = "SMAARQGR", nullable = false)
    private Integer idSmaarqgr;

    @Basic
    @Column(name = "ID_SMAGRUPO", table = "SMAARQGR")
    private Integer idSmagrupo;

    @Basic
    @Column(name = "ID_SMAUSUAR", table = "SMAARQGR")
    private Integer idSmausuar;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMAARQGR")
    private Integer idSmaarqui;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAARQGR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAARQGR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAARQGR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAARQGR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAARQGR")
    private Integer ctInteg;

    @Basic
    @Column(name = "ACESSA", table = "SMAARQGR")
    private String acessa;

    @Basic
    @Column(name = "LIBERA", table = "SMAARQGR")
    private String libera;

    @Basic
    @Column(name = "INCLUI", table = "SMAARQGR")
    private String inclui;

    @Basic
    @Column(name = "ALTERA", table = "SMAARQGR")
    private String altera;

    @Basic
    @Column(name = "EXCLUI", table = "SMAARQGR")
    private String exclui;

    @Basic
    @Column(name = "ACESSA_CADASTRO", table = "SMAARQGR")
    private String acessaCadastro;
}