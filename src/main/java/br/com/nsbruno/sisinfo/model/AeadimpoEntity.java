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
@Table(name = "AEADIMPO")
@Data
public class AeadimpoEntity {

    @Id
    @Column(name = "ID_AEADIMPO", table = "AEADIMPO", nullable = false)
    private Integer idAeadimpo;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "AEADIMPO")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_AEAITNFS", table = "AEADIMPO")
    private Integer idAeaitnfs;

    @Basic
    @Column(name = "ID_AEAITENT", table = "AEADIMPO")
    private Integer idAeaitent;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEADIMPO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEADIMPO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEADIMPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEADIMPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEADIMPO")
    private Integer ctInteg;

    @Basic
    @Column(name = "NUMERO_DI", table = "AEADIMPO", length = 15)
    private String numeroDi;

    @Basic
    @Column(name = "DT_DI", table = "AEADIMPO")
    @Temporal(TemporalType.DATE)
    private Date dtDi;

    @Basic
    @Column(name = "DT_DESEMBARACO", table = "AEADIMPO")
    @Temporal(TemporalType.DATE)
    private Date dtDesembaraco;

    @Basic
    @Column(name = "LOCAL_DESEMBARACO", table = "AEADIMPO", length = 60)
    private String localDesembaraco;

    @Basic
    @Column(name = "COD_EXPORTADOR", table = "AEADIMPO", length = 60)
    private String codExportador;
}