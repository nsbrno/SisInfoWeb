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
@Table(name = "SMALOGWS")
@Data
public class SmalogwsEntity {

    @Id
    @Column(name = "ID_SMALOGWS", table = "SMALOGWS", nullable = false)
    private Integer idSmalogws;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "SMALOGWS")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_SMADISPO", table = "SMALOGWS")
    private Integer idSmadispo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMALOGWS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMALOGWS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMALOGWS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMALOGWS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMALOGWS")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "SMALOGWS")
    private Integer codigo;

    @Basic
    @Column(name = "TIPO", table = "SMALOGWS")
    private String tipo;

    @Basic
    @Column(name = "ORIGEM", table = "SMALOGWS", length = 40)
    private String origem;

    @Basic
    @Column(name = "LEVEL", table = "SMALOGWS", length = 128)
    private String level;

    @Basic
    @Column(name = "METODO", table = "SMALOGWS", length = 128)
    private String metodo;

    @Basic
    @Column(name = "IP", table = "SMALOGWS", length = 128)
    private String ip;

    @Basic(optional = false)
    @Column(name = "LATITUDE", table = "SMALOGWS", nullable = false)
    private double latitude;

    @Basic(optional = false)
    @Column(name = "LONGITUDE", table = "SMALOGWS", nullable = false)
    private double longitude;

    @Lob
    @Basic
    @Column(name = "LOG", table = "SMALOGWS")
    private byte[] log;

    @Lob
    @Basic
    @Column(name = "ANEXO", table = "SMALOGWS")
    private byte[] anexo;
}