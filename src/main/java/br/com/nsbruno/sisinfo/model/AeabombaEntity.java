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
@Table(name = "AEABOMBA")
@Data
public class AeabombaEntity {

    @Id
    @Column(name = "ID_AEABOMBA", table = "AEABOMBA", nullable = false)
    private Integer idAeabomba;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEABOMBA", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEABOMBA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEABOMBA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEABOMBA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEABOMBA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEABOMBA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEABOMBA", nullable = false)
    private Integer numero;

    @Basic
    @Column(name = "SERIE", table = "AEABOMBA", length = 20)
    private String serie;

    @Basic
    @Column(name = "FABRICANTE", table = "AEABOMBA", length = 40)
    private String fabricante;

    @Basic
    @Column(name = "MODELO", table = "AEABOMBA", length = 40)
    private String modelo;

    @Basic
    @Column(name = "TIPO_MEDICAO", table = "AEABOMBA")
    private String tipoMedicao;
}