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
@Table(name = "RPAHIPAD")
@Data
public class RpahipadEntity {

    @Id
    @Column(name = "ID_RPAHIPAD", table = "RPAHIPAD", nullable = false)
    private Integer idRpahipad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAHIPAD", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAHIPAD", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAHIPAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAHIPAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAHIPAD")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "RPAHIPAD", nullable = false)
    private Integer codigo;

    @Lob
    @Basic
    @Column(name = "DESCRICAO", table = "RPAHIPAD")
    private byte[] descricao;
}