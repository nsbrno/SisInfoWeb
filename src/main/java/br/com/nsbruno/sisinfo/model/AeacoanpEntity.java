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
@Table(name = "AEACOANP")
@Data
public class AeacoanpEntity {

    @Id
    @Column(name = "ID_AEACOANP", table = "AEACOANP", nullable = false)
    private Integer idAeacoanp;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACOANP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACOANP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACOANP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACOANP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACOANP")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACOANP", length = 9)
    private String codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "AEACOANP", length = 50)
    private String descricao;
}