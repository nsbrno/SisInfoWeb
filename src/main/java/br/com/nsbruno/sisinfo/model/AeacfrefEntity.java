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
@Table(name = "AEACFREF")
@Data
public class AeacfrefEntity {

    @Id
    @Column(name = "ID_AEACFREF", table = "AEACFREF", nullable = false)
    private Integer idAeacfref;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEACFREF")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEAMODDF", table = "AEACFREF")
    private Integer idAeamoddf;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "AEACFREF")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_AEANFSAI_CUPOM", table = "AEACFREF")
    private Integer idAeanfsaiCupom;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "AEACFREF")
    private Integer idCfaestad;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACFREF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACFREF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACFREF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACFREF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACFREF")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO", table = "AEACFREF")
    private String tipo;

    @Basic
    @Column(name = "ECF_CX", table = "AEACFREF")
    private Integer ecfCx;

    @Basic
    @Column(name = "SERIE", table = "AEACFREF", length = 3)
    private String serie;

    @Basic
    @Column(name = "NUM_DOC", table = "AEACFREF")
    private Integer numDoc;

    @Basic
    @Column(name = "ANO_MES", table = "AEACFREF", length = 4)
    private String anoMes;

    @Basic
    @Column(name = "DT_DOC", table = "AEACFREF")
    @Temporal(TemporalType.DATE)
    private Date dtDoc;

    @Basic
    @Column(name = "CNPJ_EMIT", table = "AEACFREF", length = 18)
    private String cnpjEmit;

    @Basic
    @Column(name = "IE_EMIT", table = "AEACFREF", length = 18)
    private String ieEmit;

    @Basic
    @Column(name = "CHAVE", table = "AEACFREF", length = 50)
    private String chave;
}