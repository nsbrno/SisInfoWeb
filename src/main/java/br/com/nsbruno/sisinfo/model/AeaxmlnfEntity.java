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
@Table(name = "AEAXMLNF")
public class AeaxmlnfEntity {

    @Id
    @Column(name = "ID_AEAXMLNF", table = "AEAXMLNF", nullable = false)
    private Integer idAeaxmlnf;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "AEAXMLNF")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEAXMLNF")
    private Integer idAeaentra;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAXMLNF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAXMLNF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAXMLNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAXMLNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAXMLNF")
    private Integer ctInteg;

    @Basic
    @Column(name = "CHAVE_NFE", table = "AEAXMLNF", length = 60)
    private String chaveNfe;

    @Lob
    @Basic
    @Column(name = "XML_NFE", table = "AEAXMLNF")
    private byte[] xmlNfe;

    @Basic
    @Column(name = "DT_REGEVENTO", table = "AEAXMLNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtRegevento;

    @Basic
    @Column(name = "NUMPROT", table = "AEAXMLNF", length = 18)
    private String numprot;

    @Basic
    @Column(name = "TIPO_EVENTO", table = "AEAXMLNF")
    private String tipoEvento;

    @Basic
    @Column(name = "SEQUENCIA", table = "AEAXMLNF")
    private Integer sequencia;

    public Integer getIdAeaxmlnf() {
        return idAeaxmlnf;
    }

    public void setIdAeaxmlnf(Integer idAeaxmlnf) {
        this.idAeaxmlnf = idAeaxmlnf;
    }

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
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

    public String getChaveNfe() {
        return chaveNfe;
    }

    public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
    }

    public byte[] getXmlNfe() {
        return xmlNfe;
    }

    public void setXmlNfe(byte[] xmlNfe) {
        this.xmlNfe = xmlNfe;
    }

    public Date getDtRegevento() {
        return dtRegevento;
    }

    public void setDtRegevento(Date dtRegevento) {
        this.dtRegevento = dtRegevento;
    }

    public String getNumprot() {
        return numprot;
    }

    public void setNumprot(String numprot) {
        this.numprot = numprot;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

}