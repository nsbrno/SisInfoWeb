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
@Table(name = "APATOMBO")
public class ApatomboEntity {

    @Id
    @Column(name = "ID_APATOMBO", table = "APATOMBO", nullable = false)
    private Integer idApatombo;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APATOMBO")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APATOMBO")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "US_CAD", table = "APATOMBO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APATOMBO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APATOMBO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APATOMBO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APATOMBO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "APATOMBO")
    private Integer codigo;

    @Basic
    @Column(name = "DT_TOMBO", table = "APATOMBO")
    @Temporal(TemporalType.DATE)
    private Date dtTombo;

    @Basic
    @Column(name = "ASSUNTO", table = "APATOMBO", length = 128)
    private String assunto;

    @Lob
    @Basic
    @Column(name = "TEXTO", table = "APATOMBO")
    private byte[] texto;

    public Integer getIdApatombo() {
        return idApatombo;
    }

    public void setIdApatombo(Integer idApatombo) {
        this.idApatombo = idApatombo;
    }

    public Integer getIdApaparoq() {
        return idApaparoq;
    }

    public void setIdApaparoq(Integer idApaparoq) {
        this.idApaparoq = idApaparoq;
    }

    public Integer getIdCfaclifoParoq() {
        return idCfaclifoParoq;
    }

    public void setIdCfaclifoParoq(Integer idCfaclifoParoq) {
        this.idCfaclifoParoq = idCfaclifoParoq;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDtTombo() {
        return dtTombo;
    }

    public void setDtTombo(Date dtTombo) {
        this.dtTombo = dtTombo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public byte[] getTexto() {
        return texto;
    }

    public void setTexto(byte[] texto) {
        this.texto = texto;
    }

}