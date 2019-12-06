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
@Table(name = "AEAITOLF")
public class AeaitolfEntity {

    @Id
    @Column(name = "ID_AEAITOLF", table = "AEAITOLF", nullable = false)
    private Integer idAeaitolf;

    @Basic
    @Column(name = "ID_AEAOBSLF", table = "AEAITOLF")
    private Integer idAeaobslf;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "AEAITOLF")
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITOLF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITOLF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITOLF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITOLF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITOLF")
    private Integer ctInteg;

    @Basic
    @Column(name = "COD_AJ", table = "AEAITOLF", length = 20)
    private String codAj;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "AEAITOLF")
    private byte[] complemento;

    @Basic(optional = false)
    @Column(name = "VL_BC_ICMS", table = "AEAITOLF", nullable = false)
    private double vlBcIcms;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS", table = "AEAITOLF", nullable = false)
    private double aliquotaIcms;

    @Basic(optional = false)
    @Column(name = "VL_ICMS", table = "AEAITOLF", nullable = false)
    private double vlIcms;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS", table = "AEAITOLF", nullable = false)
    private double vlOutros;

    public Integer getIdAeaitolf() {
        return idAeaitolf;
    }

    public void setIdAeaitolf(Integer idAeaitolf) {
        this.idAeaitolf = idAeaitolf;
    }

    public Integer getIdAeaobslf() {
        return idAeaobslf;
    }

    public void setIdAeaobslf(Integer idAeaobslf) {
        this.idAeaobslf = idAeaobslf;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
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

    public String getCodAj() {
        return codAj;
    }

    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public double getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public double getVlOutros() {
        return vlOutros;
    }

    public void setVlOutros(double vlOutros) {
        this.vlOutros = vlOutros;
    }

}