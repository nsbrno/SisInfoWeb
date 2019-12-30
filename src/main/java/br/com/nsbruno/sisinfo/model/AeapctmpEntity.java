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
@Table(name = "AEAPCTMP")
public class AeapctmpEntity {

    @Id
    @Column(name = "ID_AEAPCTMP", table = "AEAPCTMP", nullable = false)
    private Integer idAeapctmp;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "AEAPCTMP")
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLOJA", table = "AEAPCTMP", nullable = false)
    private Integer idAeaploja;

    @Basic
    @Column(name = "ID_AEAGRDPL", table = "AEAPCTMP")
    private Integer idAeagrdpl;

    @Basic
    @Column(name = "ID_AEAUNVEN", table = "AEAPCTMP")
    private Integer idAeaunven;

    @Basic
    @Column(name = "ID_CFACLIFO_VENDEDOR", table = "AEAPCTMP")
    private Integer idCfaclifoVendedor;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPCTMP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPCTMP", length = 20)
    private String usCad;

    @Basic(optional = false)
    @Column(name = "DT_CAD", table = "AEAPCTMP", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic(optional = false)
    @Column(name = "DT_ALT", table = "AEAPCTMP", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPCTMP")
    private Integer ctInteg;

    @Basic
    @Column(name = "CHAVE", table = "AEAPCTMP")
    private Integer chave;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAPCTMP", nullable = false)
    private double quantidade;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAPCTMP")
    private byte[] obs;

    @Basic
    @Column(name = "PRODUTO", table = "AEAPCTMP", length = 50)
    private String produto;

    public Integer getIdAeapctmp() {
        return idAeapctmp;
    }

    public void setIdAeapctmp(Integer idAeapctmp) {
        this.idAeapctmp = idAeapctmp;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAeaploja() {
        return idAeaploja;
    }

    public void setIdAeaploja(Integer idAeaploja) {
        this.idAeaploja = idAeaploja;
    }

    public Integer getIdAeagrdpl() {
        return idAeagrdpl;
    }

    public void setIdAeagrdpl(Integer idAeagrdpl) {
        this.idAeagrdpl = idAeagrdpl;
    }

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public Integer getIdCfaclifoVendedor() {
        return idCfaclifoVendedor;
    }

    public void setIdCfaclifoVendedor(Integer idCfaclifoVendedor) {
        this.idCfaclifoVendedor = idCfaclifoVendedor;
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

    public Integer getChave() {
        return chave;
    }

    public void setChave(Integer chave) {
        this.chave = chave;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

}