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
@Table(name = "CFAHISTO")
public class CfahistoEntity {

    @Id
    @Column(name = "ID_CFAHISTO", table = "CFAHISTO", nullable = false)
    private Integer idCfahisto;

    @Basic
    @Column(name = "ID_CFASTATU", table = "CFAHISTO")
    private Integer idCfastatu;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFAHISTO", nullable = false)
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAHISTO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAHISTO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAHISTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAHISTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAHISTO")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_CONSULTA", table = "CFAHISTO")
    @Temporal(TemporalType.DATE)
    private Date dtConsulta;

    @Basic
    @Column(name = "RESTRICOES", table = "CFAHISTO", length = 40)
    private String restricoes;

    @Lob
    @Basic
    @Column(name = "OBS", table = "CFAHISTO")
    private byte[] obs;

    @Basic
    @Column(name = "DESCRICAO", table = "CFAHISTO", length = 40)
    private String descricao;

    @Lob
    @Basic
    @Column(name = "XML_ENVIO", table = "CFAHISTO")
    private byte[] xmlEnvio;

    @Lob
    @Basic
    @Column(name = "XML_RETORNO", table = "CFAHISTO")
    private byte[] xmlRetorno;

    @Basic
    @Column(name = "CPF_CNPJ", table = "CFAHISTO", length = 18)
    private String cpfCnpj;

    public Integer getIdCfahisto() {
        return idCfahisto;
    }

    public void setIdCfahisto(Integer idCfahisto) {
        this.idCfahisto = idCfahisto;
    }

    public Integer getIdCfastatu() {
        return idCfastatu;
    }

    public void setIdCfastatu(Integer idCfastatu) {
        this.idCfastatu = idCfastatu;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public Date getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public String getRestricoes() {
        return restricoes;
    }

    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getXmlEnvio() {
        return xmlEnvio;
    }

    public void setXmlEnvio(byte[] xmlEnvio) {
        this.xmlEnvio = xmlEnvio;
    }

    public byte[] getXmlRetorno() {
        return xmlRetorno;
    }

    public void setXmlRetorno(byte[] xmlRetorno) {
        this.xmlRetorno = xmlRetorno;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

}