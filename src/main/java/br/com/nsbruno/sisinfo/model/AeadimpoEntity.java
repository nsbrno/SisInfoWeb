package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "AEADIMPO")
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

    public Integer getIdAeadimpo() {
        return idAeadimpo;
    }

    public void setIdAeadimpo(Integer idAeadimpo) {
        this.idAeadimpo = idAeadimpo;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
    }

    public Integer getIdAeaitnfs() {
        return idAeaitnfs;
    }

    public void setIdAeaitnfs(Integer idAeaitnfs) {
        this.idAeaitnfs = idAeaitnfs;
    }

    public Integer getIdAeaitent() {
        return idAeaitent;
    }

    public void setIdAeaitent(Integer idAeaitent) {
        this.idAeaitent = idAeaitent;
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

    public String getNumeroDi() {
        return numeroDi;
    }

    public void setNumeroDi(String numeroDi) {
        this.numeroDi = numeroDi;
    }

    public Date getDtDi() {
        return dtDi;
    }

    public void setDtDi(Date dtDi) {
        this.dtDi = dtDi;
    }

    public Date getDtDesembaraco() {
        return dtDesembaraco;
    }

    public void setDtDesembaraco(Date dtDesembaraco) {
        this.dtDesembaraco = dtDesembaraco;
    }

    public String getLocalDesembaraco() {
        return localDesembaraco;
    }

    public void setLocalDesembaraco(String localDesembaraco) {
        this.localDesembaraco = localDesembaraco;
    }

    public String getCodExportador() {
        return codExportador;
    }

    public void setCodExportador(String codExportador) {
        this.codExportador = codExportador;
    }

}