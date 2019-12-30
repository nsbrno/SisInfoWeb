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
@Table(name = "SMAITLAC")
@Data
public class SmaitlacEntity {

    @Id
    @Column(name = "ID_SMAITLAC", table = "SMAITLAC", nullable = false)
    private Integer idSmaitlac;

    @Basic
    @Column(name = "ID_SMALOGAC", table = "SMAITLAC")
    private Integer idSmalogac;

    @Basic
    @Column(name = "DT_ALT", table = "SMAITLAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "ID_ARQUIVO", table = "SMAITLAC")
    private Integer idArquivo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAITLAC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "ACAO", table = "SMAITLAC")
    private String acao;

    @Basic
    @Column(name = "ARQUIVO", table = "SMAITLAC", length = 12)
    private String arquivo;
}