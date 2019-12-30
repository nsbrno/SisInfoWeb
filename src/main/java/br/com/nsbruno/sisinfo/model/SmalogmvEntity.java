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
@Table(name = "SMALOGMV")
@Data
public class SmalogmvEntity {

    @Id
    @Column(name = "ID_SMALOGMV", table = "SMALOGMV", nullable = false)
    private Integer idSmalogmv;

    @Basic
    @Column(name = "ID_ARQUIVO", table = "SMALOGMV")
    private Integer idArquivo;

    @Basic
    @Column(name = "ARQUIVO", table = "SMALOGMV", length = 12)
    private String arquivo;

    @Basic
    @Column(name = "USUARIO", table = "SMALOGMV", length = 20)
    private String usuario;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMALOGMV", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CT_INTEG", table = "SMALOGMV")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_ULT_ALT_ARQUIVO", table = "SMALOGMV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltAltArquivo;

    @Basic
    @Column(name = "DT_ALT", table = "SMALOGMV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "TIPO", table = "SMALOGMV")
    private String tipo;

    @Lob
    @Basic
    @Column(name = "LOG", table = "SMALOGMV")
    private byte[] log;
}