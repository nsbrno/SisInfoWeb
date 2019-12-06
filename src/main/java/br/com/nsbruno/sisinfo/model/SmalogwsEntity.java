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
@Table(name = "SMALOGWS")
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

    public Integer getIdSmalogws() {
        return idSmalogws;
    }

    public void setIdSmalogws(Integer idSmalogws) {
        this.idSmalogws = idSmalogws;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdSmadispo() {
        return idSmadispo;
    }

    public void setIdSmadispo(Integer idSmadispo) {
        this.idSmadispo = idSmadispo;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public byte[] getLog() {
        return log;
    }

    public void setLog(byte[] log) {
        this.log = log;
    }

    public byte[] getAnexo() {
        return anexo;
    }

    public void setAnexo(byte[] anexo) {
        this.anexo = anexo;
    }

}