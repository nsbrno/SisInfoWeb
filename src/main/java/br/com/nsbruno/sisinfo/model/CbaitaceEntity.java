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


@Entity
@Table(name = "CBAITACE")
public class CbaitaceEntity {

    @Id
    @Column(name = "ID_CBAITACE", table = "CBAITACE", nullable = false)
    private Integer idCbaitace;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA", table = "CBAITACE", nullable = false)
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "ID_CBATRANS", table = "CBAITACE", nullable = false)
    private Integer idCbatrans;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_NUMCX", table = "CBAITACE", nullable = false)
    private Integer idCbaplctaNumcx;

    @Basic(optional = false)
    @Column(name = "ID_CFATPDOC", table = "CBAITACE", nullable = false)
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CBAITACE")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_AEAFORMA", table = "CBAITACE")
    private Integer idAeaforma;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBAITACE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBAITACE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBAITACE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBAITACE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBAITACE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "CBAITACE", nullable = false)
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "D_C", table = "CBAITACE", nullable = false)
    private String dC;

    @Basic(optional = false)
    @Column(name = "A_S", table = "CBAITACE", nullable = false)
    private String a_S;

    @Basic(optional = false)
    @Column(name = "TIPO_DOC", table = "CBAITACE", nullable = false)
    private String tipoDoc;

    @Basic(optional = false)
    @Column(name = "VL_ACERTO", table = "CBAITACE", nullable = false)
    private double vlAcerto;

    @Lob
    @Basic
    @Column(name = "OBS", table = "CBAITACE")
    private byte[] obs;

    public Integer getIdCbaitace() {
        return idCbaitace;
    }

    public void setIdCbaitace(Integer idCbaitace) {
        this.idCbaitace = idCbaitace;
    }

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public Integer getIdCbatrans() {
        return idCbatrans;
    }

    public void setIdCbatrans(Integer idCbatrans) {
        this.idCbatrans = idCbatrans;
    }

    public Integer getIdCbaplctaNumcx() {
        return idCbaplctaNumcx;
    }

    public void setIdCbaplctaNumcx(Integer idCbaplctaNumcx) {
        this.idCbaplctaNumcx = idCbaplctaNumcx;
    }

    public Integer getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(Integer idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdAeaforma() {
        return idAeaforma;
    }

    public void setIdAeaforma(Integer idAeaforma) {
        this.idAeaforma = idAeaforma;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUsCad() {
        return usCad;
    }

    public void setUsCad(String usCad) {
        this.usCad = usCad;
    }

    public Date getDtCad() {
        return dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getCtInteg() {
        return ctInteg;
    }

    public void setCtInteg(Integer ctInteg) {
        this.ctInteg = ctInteg;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public String getDC() {
        return dC;
    }

    public void setDC(String dC) {
        this.dC = dC;
    }

    public String getA_S() {
        return a_S;
    }

    public void setA_S(String a_S) {
        this.a_S = a_S;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public double getVlAcerto() {
        return vlAcerto;
    }

    public void setVlAcerto(double vlAcerto) {
        this.vlAcerto = vlAcerto;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}