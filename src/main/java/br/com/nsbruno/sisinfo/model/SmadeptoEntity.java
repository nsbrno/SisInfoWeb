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
@Table(name = "SMADEPTO")
@Data
public class SmadeptoEntity {

    @Id
    @Column(name = "ID_SMADEPTO", table = "SMADEPTO", nullable = false)
    private Integer idSmadepto;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMADEPTO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMADEPTO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMADEPTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMADEPTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMADEPTO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "SMADEPTO", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "SMADEPTO", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "TIPO_TEMPO", table = "SMADEPTO")
    private String tipoTempo;
}