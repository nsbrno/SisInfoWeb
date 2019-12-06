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
@Table(name = "CFAPORTA")
public class CfaportaEntity {

    @Id
    @Column(name = "ID_CFAPORTA", table = "CFAPORTA", nullable = false)
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CFATPCOB", table = "CFAPORTA")
    private Integer idCfatpcob;

    @Basic
    @Column(name = "ID_SMARELAT_CHQ", table = "CFAPORTA")
    private Integer idSmarelatChq;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAPORTA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAPORTA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAPORTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAPORTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAPORTA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFAPORTA", nullable = false)
    private int codigo;

    @Basic
    @Column(name = "DG", table = "CFAPORTA")
    private String dg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFAPORTA", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "SIGLA", table = "CFAPORTA", length = 18)
    private String sigla;

    @Basic
    @Column(name = "SISTEMAS", table = "CFAPORTA", length = 18)
    private String sistemas;

    @Basic
    @Column(name = "TIPO", table = "CFAPORTA")
    private String tipo;

    @Lob
    @Basic
    @Column(name = "LOGOTIPO", table = "CFAPORTA")
    private byte[] logotipo;

    public Integer getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(Integer idCfaporta) {
        this.idCfaporta = idCfaporta;
    }

    public Integer getIdCfatpcob() {
        return idCfatpcob;
    }

    public void setIdCfatpcob(Integer idCfatpcob) {
        this.idCfatpcob = idCfatpcob;
    }

    public Integer getIdSmarelatChq() {
        return idSmarelatChq;
    }

    public void setIdSmarelatChq(Integer idSmarelatChq) {
        this.idSmarelatChq = idSmarelatChq;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSistemas() {
        return sistemas;
    }

    public void setSistemas(String sistemas) {
        this.sistemas = sistemas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public byte[] getLogotipo() {
        return logotipo;
    }

    public void setLogotipo(byte[] logotipo) {
        this.logotipo = logotipo;
    }

}