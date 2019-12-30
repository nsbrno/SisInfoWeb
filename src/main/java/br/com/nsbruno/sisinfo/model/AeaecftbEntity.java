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
@Table(name = "AEAECFTB")
@Data
public class AeaecftbEntity {

    @Id
    @Column(name = "ID_AEAECFTB", table = "AEAECFTB", nullable = false)
    private Integer idAeaecftb;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAECFTB", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAECFTB", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAECFTB", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAECFTB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAECFTB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAECFTB")
    private Integer ctInteg;

    @Basic
    @Column(name = "NUMERO_SERIE", table = "AEAECFTB", length = 20)
    private String numeroSerie;

    @Basic
    @Column(name = "MODELO", table = "AEAECFTB", length = 20)
    private String modelo;

    @Basic
    @Column(name = "MODELO_ECF", table = "AEAECFTB", length = 20)
    private String modeloEcf;

    @Basic(optional = false)
    @Column(name = "CAIXA", table = "AEAECFTB", nullable = false)
    private Integer caixa;
}