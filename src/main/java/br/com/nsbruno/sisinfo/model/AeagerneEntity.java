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
@Table(name = "AEAGERNE")
public class AeagerneEntity {

    @Id
    @Column(name = "ID_AEAGERNE", table = "AEAGERNE", nullable = false)
    private Integer idAeagerne;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEAGERNE")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "AEAGERNE")
    private Integer idAeanfsai;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAGERNE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAGERNE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAGERNE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAGERNE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAGERNE")
    private Integer ctInteg;

    @Basic
    @Column(name = "COMANDO", table = "AEAGERNE")
    private Integer comando;

    @Basic
    @Column(name = "JUSTIFICATIVA", table = "AEAGERNE", length = 128)
    private String justificativa;

    @Lob
    @Basic
    @Column(name = "TEXTO", table = "AEAGERNE")
    private byte[] texto;

    @Basic
    @Column(name = "TIPO_EVENTO", table = "AEAGERNE")
    private Integer tipoEvento;

    public Integer getIdAeagerne() {
        return idAeagerne;
    }

    public void setIdAeagerne(Integer idAeagerne) {
        this.idAeagerne = idAeagerne;
    }

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
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

    public Integer getComando() {
        return comando;
    }

    public void setComando(Integer comando) {
        this.comando = comando;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public byte[] getTexto() {
        return texto;
    }

    public void setTexto(byte[] texto) {
        this.texto = texto;
    }

    public Integer getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(Integer tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

}