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
@Table(name = "CFATPFAT")
public class CfatpfatEntity {

    @Id
    @Column(name = "ID_CFATPFAT", table = "CFATPFAT", nullable = false)
    private Integer idCfatpfat;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CFATPFAT", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_CTA_TRANS", table = "CFATPFAT", nullable = false)
    private Integer idCbaplctaCtaTrans;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_VISTA", table = "CFATPFAT", nullable = false)
    private Integer idCbaplctaVista;

    @Basic
    @Column(name = "ID_CBAPLCTA_PRAZO", table = "CFATPFAT")
    private Integer idCbaplctaPrazo;

    @Basic
    @Column(name = "ID_AEAFORMA", table = "CFATPFAT")
    private Integer idAeaforma;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFATPFAT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFATPFAT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFATPFAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFATPFAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFATPFAT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFATPFAT", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFATPFAT", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CFATPFAT", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "WORK_ON_VL_ANEXADO", table = "CFATPFAT")
    private String workOnVlAnexado;

    @Basic(optional = false)
    @Column(name = "NUMERA", table = "CFATPFAT", nullable = false)
    private String numera;

    @Basic
    @Column(name = "SEQUENCIA", table = "CFATPFAT")
    private Integer sequencia;

    public Integer getIdCfatpfat() {
        return idCfatpfat;
    }

    public void setIdCfatpfat(Integer idCfatpfat) {
        this.idCfatpfat = idCfatpfat;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCbaplctaCtaTrans() {
        return idCbaplctaCtaTrans;
    }

    public void setIdCbaplctaCtaTrans(Integer idCbaplctaCtaTrans) {
        this.idCbaplctaCtaTrans = idCbaplctaCtaTrans;
    }

    public Integer getIdCbaplctaVista() {
        return idCbaplctaVista;
    }

    public void setIdCbaplctaVista(Integer idCbaplctaVista) {
        this.idCbaplctaVista = idCbaplctaVista;
    }

    public Integer getIdCbaplctaPrazo() {
        return idCbaplctaPrazo;
    }

    public void setIdCbaplctaPrazo(Integer idCbaplctaPrazo) {
        this.idCbaplctaPrazo = idCbaplctaPrazo;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getWorkOnVlAnexado() {
        return workOnVlAnexado;
    }

    public void setWorkOnVlAnexado(String workOnVlAnexado) {
        this.workOnVlAnexado = workOnVlAnexado;
    }

    public String getNumera() {
        return numera;
    }

    public void setNumera(String numera) {
        this.numera = numera;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

}