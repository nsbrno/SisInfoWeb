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
@Table(name = "APADIPAS")
public class ApadipasEntity {

    @Id
    @Column(name = "ID_APADIPAS", table = "APADIPAS", nullable = false)
    private Integer idApadipas;

    @Basic
    @Column(name = "ID_APADIZIM", table = "APADIPAS")
    private Integer idApadizim;

    @Basic
    @Column(name = "ID_APAPASTO", table = "APADIPAS")
    private Integer idApapasto;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "APADIPAS")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "US_CAD", table = "APADIPAS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APADIPAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APADIPAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APADIPAS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APADIPAS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DT_INICIAL", table = "APADIPAS")
    @Temporal(TemporalType.DATE)
    private Date dtInicial;

    @Basic
    @Column(name = "DT_FINAL", table = "APADIPAS")
    @Temporal(TemporalType.DATE)
    private Date dtFinal;

    @Basic
    @Column(name = "TIPO_PG", table = "APADIPAS")
    private String tipoPg;

    public Integer getIdApadipas() {
        return idApadipas;
    }

    public void setIdApadipas(Integer idApadipas) {
        this.idApadipas = idApadipas;
    }

    public Integer getIdApadizim() {
        return idApadizim;
    }

    public void setIdApadizim(Integer idApadizim) {
        this.idApadizim = idApadizim;
    }

    public Integer getIdApapasto() {
        return idApapasto;
    }

    public void setIdApapasto(Integer idApapasto) {
        this.idApapasto = idApapasto;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public Date getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(Date dtInicial) {
        this.dtInicial = dtInicial;
    }

    public Date getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(Date dtFinal) {
        this.dtFinal = dtFinal;
    }

    public String getTipoPg() {
        return tipoPg;
    }

    public void setTipoPg(String tipoPg) {
        this.tipoPg = tipoPg;
    }

}