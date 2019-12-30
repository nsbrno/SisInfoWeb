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
@Table(name = "AEACARGA")
@Data
public class AeacargaEntity {

    @Id
    @Column(name = "ID_AEACARGA", table = "AEACARGA", nullable = false)
    private Integer idAeacarga;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEACARGA", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFACLIFO_MOTORISTA", table = "AEACARGA")
    private Integer idCfaclifoMotorista;

    @Basic
    @Column(name = "ID_CFAEQUIP", table = "AEACARGA")
    private Integer idCfaequip;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACARGA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACARGA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACARGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACARGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACARGA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEACARGA", nullable = false)
    private Integer numero;

    @Basic(optional = false)
    @Column(name = "DT_CARGA", table = "AEACARGA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtCarga;

    @Basic
    @Column(name = "DT_EMISSAO", table = "AEACARGA")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_SAIDA", table = "AEACARGA")
    @Temporal(TemporalType.DATE)
    private Date dtSaida;

    @Basic
    @Column(name = "DT_FECHAMENTO", table = "AEACARGA")
    @Temporal(TemporalType.DATE)
    private Date dtFechamento;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "AEACARGA", nullable = false)
    private double valor;
}