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
@Table(name = "AEACOFFL")
@Data
public class AeacofflEntity {

    @Id
    @Column(name = "ID_AEACOFFL", table = "AEACOFFL", nullable = false)
    private Integer idAeacoffl;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEACOFFL", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_AEANFSAI_DUVIDA", table = "AEACOFFL")
    private Integer idAeanfsaiDuvida;

    @Basic
    @Column(name = "ID_AEANFSAI_OFFLINE", table = "AEACOFFL")
    private Integer idAeanfsaiOffline;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACOFFL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACOFFL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACOFFL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACOFFL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACOFFL")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO", table = "AEACOFFL")
    private String tipo;

    @Basic
    @Column(name = "DESCRICAO", table = "AEACOFFL", length = 512)
    private String descricao;

    @Basic
    @Column(name = "MOTIVO", table = "AEACOFFL", length = 256)
    private String motivo;

    @Basic
    @Column(name = "DT_CONT_INI", table = "AEACOFFL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtContIni;

    @Basic
    @Column(name = "DT_CONT_FIM", table = "AEACOFFL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtContFim;
}