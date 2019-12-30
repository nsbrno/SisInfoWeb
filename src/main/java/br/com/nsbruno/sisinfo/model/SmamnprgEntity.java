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
@Table(name = "SMAMNPRG")
@Data
public class SmamnprgEntity {

    @Id
    @Column(name = "ID_SMAMNPRG", table = "SMAMNPRG", nullable = false)
    private Integer idSmamnprg;

    @Basic(optional = false)
    @Column(name = "ID_SMAMENUS", table = "SMAMNPRG", nullable = false)
    private Integer idSmamenus;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAMNPRG", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAMNPRG", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAMNPRG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAMNPRG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAMNPRG")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NOME", table = "SMAMNPRG", nullable = false, length = 128)
    private String nome;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "SMAMNPRG", nullable = false, length = 60)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "SMAMNPRG", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "PARAMETROS", table = "SMAMNPRG", length = 128)
    private String parametros;

    @Basic
    @Column(name = "HOTKEY", table = "SMAMNPRG", length = 20)
    private String hotkey;
}