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
@Table(name = "AEACOFFL")
public class AeacofflEntity {

    @Id
    @Column(name = "ID_AEACOFFL", table = "AEACOFFL", nullable = false)
    private Integer idAeacoffl;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEACOFFL", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_AEANFSAI_DUVIDA", table = "AEACOFFL")
    private Integer idAeanfsaiDuvida;

    @Basic
    @Column(name = "ID_AEANFSAI_OFFLINE", table = "AEACOFFL")
    private Integer idAeanfsaiOffline;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACOFFL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACOFFL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACOFFL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACOFFL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACOFFL")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO", table = "AEACOFFL")
    private String tipo;

    @Basic
    @Column(name = "DESCRICAO", table = "AEACOFFL", length = 512)
    private String descricao;

    @Basic
    @Column(name = "MOTIVO", table = "AEACOFFL", length = 256)
    private String motivo;

    @Basic
    @Column(name = "DT_CONT_INI", table = "AEACOFFL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtContIni;

    @Basic
    @Column(name = "DT_CONT_FIM", table = "AEACOFFL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtContFim;

    public Integer getIdAeacoffl() {
        return idAeacoffl;
    }

    public void setIdAeacoffl(Integer idAeacoffl) {
        this.idAeacoffl = idAeacoffl;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAeanfsaiDuvida() {
        return idAeanfsaiDuvida;
    }

    public void setIdAeanfsaiDuvida(Integer idAeanfsaiDuvida) {
        this.idAeanfsaiDuvida = idAeanfsaiDuvida;
    }

    public Integer getIdAeanfsaiOffline() {
        return idAeanfsaiOffline;
    }

    public void setIdAeanfsaiOffline(Integer idAeanfsaiOffline) {
        this.idAeanfsaiOffline = idAeanfsaiOffline;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getDtContIni() {
        return dtContIni;
    }

    public void setDtContIni(Date dtContIni) {
        this.dtContIni = dtContIni;
    }

    public Date getDtContFim() {
        return dtContFim;
    }

    public void setDtContFim(Date dtContFim) {
        this.dtContFim = dtContFim;
    }

}