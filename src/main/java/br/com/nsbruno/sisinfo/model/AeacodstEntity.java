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
@Table(name = "AEACODST")
@Data
public class AeacodstEntity {

    @Id
    @Column(name = "ID_AEACODST", table = "AEACODST", nullable = false)
    private Integer idAeacodst;

    @Basic
    @Column(name = "ID_CFANATOP_INT_CF", table = "AEACODST")
    private Integer idCfanatopIntCf;

    @Basic
    @Column(name = "ID_CFANATOP_INT_RV", table = "AEACODST")
    private Integer idCfanatopIntRv;

    @Basic
    @Column(name = "ID_CFANATOP_INT_TR_S", table = "AEACODST")
    private Integer idCfanatopIntTrS;

    @Basic
    @Column(name = "ID_CFANATOP_INT_TR_E", table = "AEACODST")
    private Integer idCfanatopIntTrE;

    @Basic
    @Column(name = "ID_CFANATOP_INT_SV", table = "AEACODST")
    private Integer idCfanatopIntSv;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_CF", table = "AEACODST")
    private Integer idCfanatopExtCf;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_RV", table = "AEACODST")
    private Integer idCfanatopExtRv;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_TR_S", table = "AEACODST")
    private Integer idCfanatopExtTrS;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_TR_E", table = "AEACODST")
    private Integer idCfanatopExtTrE;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_SV", table = "AEACODST")
    private Integer idCfanatopExtSv;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACODST", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACODST", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACODST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACODST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACODST")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACODST", length = 3)
    private String codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEACODST", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "TIPO", table = "AEACODST")
    private String tipo;

    @Basic
    @Column(name = "ORIGEM", table = "AEACODST")
    private String origem;

    @Basic
    @Column(name = "CSOSN", table = "AEACODST", length = 3)
    private String csosn;
}