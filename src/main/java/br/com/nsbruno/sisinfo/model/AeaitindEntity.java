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
@Table(name = "AEAITIND")
public class AeaitindEntity {

    @Id
    @Column(name = "ID_AEAITIND", table = "AEAITIND", nullable = false)
    private Integer idAeaitind;

    @Basic(optional = false)
    @Column(name = "ID_AEAOSIND", table = "AEAITIND", nullable = false)
    private Integer idAeaosind;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEAITIND", nullable = false)
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAITIND", nullable = false)
    private Integer idAeaunven;

    @Basic(optional = false)
    @Column(name = "ID_AEALOCES_ORIG", table = "AEAITIND", nullable = false)
    private Integer idAealocesOrig;

    @Basic(optional = false)
    @Column(name = "ID_AEALOCES_DEST", table = "AEAITIND", nullable = false)
    private Integer idAealocesDest;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ_DEST", table = "AEAITIND", nullable = false)
    private Integer idAeaestoqDest;

    @Basic
    @Column(name = "US_CAD", table = "AEAITIND", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITIND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITIND")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITIND", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "DT_INCLUIDO", table = "AEAITIND", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtIncluido;

    @Basic
    @Column(name = "DT_ALOCADO", table = "AEAITIND")
    @Temporal(TemporalType.DATE)
    private Date dtAlocado;

    @Basic
    @Column(name = "DT_CONCLUIDO", table = "AEAITIND")
    @Temporal(TemporalType.DATE)
    private Date dtConcluido;

    @Basic(optional = false)
    @Column(name = "QTDE_PREVISTA", table = "AEAITIND", nullable = false)
    private double qtdePrevista;

    @Basic(optional = false)
    @Column(name = "QTDE_PRODUZIDA", table = "AEAITIND", nullable = false)
    private double qtdeProduzida;

    public Integer getIdAeaitind() {
        return idAeaitind;
    }

    public void setIdAeaitind(Integer idAeaitind) {
        this.idAeaitind = idAeaitind;
    }

    public Integer getIdAeaosind() {
        return idAeaosind;
    }

    public void setIdAeaosind(Integer idAeaosind) {
        this.idAeaosind = idAeaosind;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public Integer getIdAealocesOrig() {
        return idAealocesOrig;
    }

    public void setIdAealocesOrig(Integer idAealocesOrig) {
        this.idAealocesOrig = idAealocesOrig;
    }

    public Integer getIdAealocesDest() {
        return idAealocesDest;
    }

    public void setIdAealocesDest(Integer idAealocesDest) {
        this.idAealocesDest = idAealocesDest;
    }

    public Integer getIdAeaestoqDest() {
        return idAeaestoqDest;
    }

    public void setIdAeaestoqDest(Integer idAeaestoqDest) {
        this.idAeaestoqDest = idAeaestoqDest;
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

    public Date getDtIncluido() {
        return dtIncluido;
    }

    public void setDtIncluido(Date dtIncluido) {
        this.dtIncluido = dtIncluido;
    }

    public Date getDtAlocado() {
        return dtAlocado;
    }

    public void setDtAlocado(Date dtAlocado) {
        this.dtAlocado = dtAlocado;
    }

    public Date getDtConcluido() {
        return dtConcluido;
    }

    public void setDtConcluido(Date dtConcluido) {
        this.dtConcluido = dtConcluido;
    }

    public double getQtdePrevista() {
        return qtdePrevista;
    }

    public void setQtdePrevista(double qtdePrevista) {
        this.qtdePrevista = qtdePrevista;
    }

    public double getQtdeProduzida() {
        return qtdeProduzida;
    }

    public void setQtdeProduzida(double qtdeProduzida) {
        this.qtdeProduzida = qtdeProduzida;
    }

}