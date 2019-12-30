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
@Table(name = "GCATPLOC")
@Data
public class GcatplocEntity {

    @Id
    @Column(name = "ID_GCATPLOC", table = "GCATPLOC", nullable = false)
    private Integer idGcatploc;

    @Basic
    @Column(name = "US_CAD", table = "GCATPLOC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "GCATPLOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "GCATPLOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "GCATPLOC")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "GCATPLOC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "GCATPLOC")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "GCATPLOC", length = 40)
    private String descricao;

    @Basic
    @Column(name = "ATIVO", table = "GCATPLOC")
    private String ativo;

    @Basic(optional = false)
    @Column(name = "NUMERO_DIAS", table = "GCATPLOC", nullable = false)
    private Integer numeroDias;
}