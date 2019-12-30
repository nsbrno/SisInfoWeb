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
@Table(name = "SMADISPO")
@Data
public class SmadispoEntity {

    @Id
    @Column(name = "ID_SMADISPO", table = "SMADISPO", nullable = false)
    private Integer idSmadispo;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "SMADISPO")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFACLIFO_FUNC", table = "SMADISPO")
    private Integer idCfaclifoFunc;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMADISPO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMADISPO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMADISPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMADISPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMADISPO")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "SMADISPO")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "SMADISPO", length = 40)
    private String descricao;

    @Basic
    @Column(name = "IDENTIFICACAO", table = "SMADISPO", length = 40)
    private String identificacao;

    @Basic
    @Column(name = "ATIVO", table = "SMADISPO")
    private String ativo;
}