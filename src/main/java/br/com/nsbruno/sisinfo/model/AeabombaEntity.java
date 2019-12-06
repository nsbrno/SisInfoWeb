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
@Table(name = "AEABOMBA")
public class AeabombaEntity {

    @Id
    @Column(name = "ID_AEABOMBA", table = "AEABOMBA", nullable = false)
    private Integer idAeabomba;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEABOMBA", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEABOMBA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEABOMBA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEABOMBA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEABOMBA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEABOMBA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEABOMBA", nullable = false)
    private int numero;

    @Basic
    @Column(name = "SERIE", table = "AEABOMBA", length = 20)
    private String serie;

    @Basic
    @Column(name = "FABRICANTE", table = "AEABOMBA", length = 40)
    private String fabricante;

    @Basic
    @Column(name = "MODELO", table = "AEABOMBA", length = 40)
    private String modelo;

    @Basic
    @Column(name = "TIPO_MEDICAO", table = "AEABOMBA")
    private String tipoMedicao;

    public Integer getIdAeabomba() {
        return idAeabomba;
    }

    public void setIdAeabomba(Integer idAeabomba) {
        this.idAeabomba = idAeabomba;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMedicao() {
        return tipoMedicao;
    }

    public void setTipoMedicao(String tipoMedicao) {
        this.tipoMedicao = tipoMedicao;
    }

}