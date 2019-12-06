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
@Table(name = "CCACONCU")
public class CcaconcuEntity {

    @Id
    @Column(name = "ID_CCACONCU", table = "CCACONCU", nullable = false)
    private Integer idCcaconcu;

    @Basic
    @Column(name = "ID_CCAORGAO", table = "CCACONCU")
    private Integer idCcaorgao;

    @Basic
    @Column(name = "US_CAD", table = "CCACONCU", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CCACONCU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CCACONCU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CCACONCU")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CCACONCU", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "CCACONCU")
    private Integer codigo;

    @Basic
    @Column(name = "EDITAL", table = "CCACONCU", length = 40)
    private String edital;

    @Basic
    @Column(name = "DESCRICAO", table = "CCACONCU", length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "MEDIAAPROVACAO", table = "CCACONCU", nullable = false)
    private double mediaaprovacao;

    @Basic
    @Column(name = "DATAABERTURA", table = "CCACONCU")
    @Temporal(TemporalType.DATE)
    private Date dataabertura;

    @Basic
    @Column(name = "TEMPROVAESCRITA", table = "CCACONCU")
    private String temprovaescrita;

    @Basic
    @Column(name = "TEMPROVAPRATICA", table = "CCACONCU")
    private String temprovapratica;

    @Basic
    @Column(name = "TEMPROVATITULOS", table = "CCACONCU")
    private String temprovatitulos;

    @Basic
    @Column(name = "TEMPROVARESISTENCIA", table = "CCACONCU")
    private String temprovaresistencia;

    public Integer getIdCcaconcu() {
        return idCcaconcu;
    }

    public void setIdCcaconcu(Integer idCcaconcu) {
        this.idCcaconcu = idCcaconcu;
    }

    public Integer getIdCcaorgao() {
        return idCcaorgao;
    }

    public void setIdCcaorgao(Integer idCcaorgao) {
        this.idCcaorgao = idCcaorgao;
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

    public String getEdital() {
        return edital;
    }

    public void setEdital(String edital) {
        this.edital = edital;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getMediaaprovacao() {
        return mediaaprovacao;
    }

    public void setMediaaprovacao(double mediaaprovacao) {
        this.mediaaprovacao = mediaaprovacao;
    }

    public Date getDataabertura() {
        return dataabertura;
    }

    public void setDataabertura(Date dataabertura) {
        this.dataabertura = dataabertura;
    }

    public String getTemprovaescrita() {
        return temprovaescrita;
    }

    public void setTemprovaescrita(String temprovaescrita) {
        this.temprovaescrita = temprovaescrita;
    }

    public String getTemprovapratica() {
        return temprovapratica;
    }

    public void setTemprovapratica(String temprovapratica) {
        this.temprovapratica = temprovapratica;
    }

    public String getTemprovatitulos() {
        return temprovatitulos;
    }

    public void setTemprovatitulos(String temprovatitulos) {
        this.temprovatitulos = temprovatitulos;
    }

    public String getTemprovaresistencia() {
        return temprovaresistencia;
    }

    public void setTemprovaresistencia(String temprovaresistencia) {
        this.temprovaresistencia = temprovaresistencia;
    }

}