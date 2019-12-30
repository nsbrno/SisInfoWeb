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
@Table(name = "AEAESTOQ")
@Data
public class AeaestoqEntity {

    @Id
    @Column(name = "ID_AEAESTOQ", table = "AEAESTOQ", nullable = false)
    private Integer idAeaestoq;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLOJA", table = "AEAESTOQ", nullable = false)
    private Integer idAeaploja;

    @Basic
    @Column(name = "ID_AEAGRDPL", table = "AEAESTOQ")
    private Integer idAeagrdpl;

    @Basic(optional = false)
    @Column(name = "ID_AEALOCES", table = "AEAESTOQ", nullable = false)
    private Integer idAealoces;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAESTOQ", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAESTOQ", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAESTOQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAESTOQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAESTOQ")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "ESTOQUE", table = "AEAESTOQ", nullable = false)
    private double estoque;

    @Basic(optional = false)
    @Column(name = "RETIDO", table = "AEAESTOQ", nullable = false)
    private double retido;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAESTOQ", nullable = false)
    private String ativo;

    @Basic
    @Column(name = "LOCACAO_ATIVA", table = "AEAESTOQ", length = 18)
    private String locacaoAtiva;

    @Basic
    @Column(name = "LOCACAO_RESERVA", table = "AEAESTOQ", length = 18)
    private String locacaoReserva;
}