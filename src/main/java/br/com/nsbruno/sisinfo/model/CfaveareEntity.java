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
@Table(name = "CFAVEARE")
public class CfaveareEntity {

    @Id
    @Column(name = "ID_CFAVEARE", table = "CFAVEARE", nullable = false)
    private Integer idCfaveare;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFAVEARE")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFACLIFO_CLIENTE", table = "CFAVEARE")
    private Integer idCfaclifoCliente;

    @Basic
    @Column(name = "ID_CFAAREAS", table = "CFAVEARE")
    private Integer idCfaareas;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CFAVEARE")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "CFAVEARE")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "CFAVEARE")
    private Integer idAeaprodu;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "CFAVEARE")
    private Integer idCfaporta;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAVEARE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAVEARE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAVEARE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAVEARE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAVEARE")
    private Integer ctInteg;

    @Basic
    @Column(name = "ACAO", table = "CFAVEARE")
    private String acao;

    public Integer getIdCfaveare() {
        return idCfaveare;
    }

    public void setIdCfaveare(Integer idCfaveare) {
        this.idCfaveare = idCfaveare;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaclifoCliente() {
        return idCfaclifoCliente;
    }

    public void setIdCfaclifoCliente(Integer idCfaclifoCliente) {
        this.idCfaclifoCliente = idCfaclifoCliente;
    }

    public Integer getIdCfaareas() {
        return idCfaareas;
    }

    public void setIdCfaareas(Integer idCfaareas) {
        this.idCfaareas = idCfaareas;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
    }

    public Integer getIdCfacidad() {
        return idCfacidad;
    }

    public void setIdCfacidad(Integer idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(Integer idCfaporta) {
        this.idCfaporta = idCfaporta;
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

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

}