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
@Table(name = "SMAANEXO")
@Data
public class SmaanexoEntity {

    @Id
    @Column(name = "ID_SMAANEXO", table = "SMAANEXO", nullable = false)
    private Integer idSmaanexo;

    @Basic(optional = false)
    @Column(name = "ID_SMAMENSA", table = "SMAANEXO", nullable = false)
    private Integer idSmamensa;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAANEXO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAANEXO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAANEXO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAANEXO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAANEXO")
    private Integer ctInteg;

    @Lob
    @Basic
    @Column(name = "ANEXO", table = "SMAANEXO")
    private byte[] anexo;

    @Basic
    @Column(name = "NOME", table = "SMAANEXO", length = 128)
    private String nome;
}