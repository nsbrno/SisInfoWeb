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
@Table(name = "AEAPRIND")
public class AeaprindEntity {

    @Id
    @Column(name = "ID_AEAPRIND", table = "AEAPRIND", nullable = false)
    private Integer idAeaprind;

    @Basic(optional = false)
    @Column(name = "ID_AEAITIND", table = "AEAPRIND", nullable = false)
    private Integer idAeaitind;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ_ORIG", table = "AEAPRIND", nullable = false)
    private Integer idAeaestoqOrig;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAPRIND", nullable = false)
    private Integer idAeaunven;

    @Basic
    @Column(name = "US_CAD", table = "AEAPRIND", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPRIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPRIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPRIND")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPRIND", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DT_ALOCADO", table = "AEAPRIND")
    @Temporal(TemporalType.DATE)
    private Date dtAlocado;

    @Basic(optional = false)
    @Column(name = "QTDE_UM_ITEM", table = "AEAPRIND", nullable = false)
    private double qtdeUmItem;

    @Basic(optional = false)
    @Column(name = "QTDE_ALOCADA", table = "AEAPRIND", nullable = false)
    private double qtdeAlocada;

    @Basic(optional = false)
    @Column(name = "QTDE_UTILIZADA", table = "AEAPRIND", nullable = false)
    private double qtdeUtilizada;

    @Basic(optional = false)
    @Column(name = "QTDE_PERDIDA", table = "AEAPRIND", nullable = false)
    private double qtdePerdida;

    @Basic(optional = false)
    @Column(name = "QTDE_RETORNADA", table = "AEAPRIND", nullable = false)
    private double qtdeRetornada;

    public Integer getIdAeaprind() {
        return idAeaprind;
    }

    public void setIdAeaprind(Integer idAeaprind) {
        this.idAeaprind = idAeaprind;
    }

    public Integer getIdAeaitind() {
        return idAeaitind;
    }

    public void setIdAeaitind(Integer idAeaitind) {
        this.idAeaitind = idAeaitind;
    }

    public Integer getIdAeaestoqOrig() {
        return idAeaestoqOrig;
    }

    public void setIdAeaestoqOrig(Integer idAeaestoqOrig) {
        this.idAeaestoqOrig = idAeaestoqOrig;
    }

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
        this.idAeaunven = idAeaunven;
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Date getDtAlocado() {
        return dtAlocado;
    }

    public void setDtAlocado(Date dtAlocado) {
        this.dtAlocado = dtAlocado;
    }

    public double getQtdeUmItem() {
        return qtdeUmItem;
    }

    public void setQtdeUmItem(double qtdeUmItem) {
        this.qtdeUmItem = qtdeUmItem;
    }

    public double getQtdeAlocada() {
        return qtdeAlocada;
    }

    public void setQtdeAlocada(double qtdeAlocada) {
        this.qtdeAlocada = qtdeAlocada;
    }

    public double getQtdeUtilizada() {
        return qtdeUtilizada;
    }

    public void setQtdeUtilizada(double qtdeUtilizada) {
        this.qtdeUtilizada = qtdeUtilizada;
    }

    public double getQtdePerdida() {
        return qtdePerdida;
    }

    public void setQtdePerdida(double qtdePerdida) {
        this.qtdePerdida = qtdePerdida;
    }

    public double getQtdeRetornada() {
        return qtdeRetornada;
    }

    public void setQtdeRetornada(double qtdeRetornada) {
        this.qtdeRetornada = qtdeRetornada;
    }

}