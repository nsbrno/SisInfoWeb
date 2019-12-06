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
@Table(name = "CFANATOP")
public class CfanatopEntity {

    @Id
    @Column(name = "ID_CFANATOP", table = "CFANATOP", nullable = false)
    private Integer idCfanatop;

    @Basic
    @Column(name = "ID_AEAOBSPR", table = "CFANATOP")
    private Integer idAeaobspr;

    @Basic
    @Column(name = "ID_CFANATOP_DEV", table = "CFANATOP")
    private Integer idCfanatopDev;

    @Basic
    @Column(name = "ID_AEATBPER", table = "CFANATOP")
    private Integer idAeatbper;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFANATOP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFANATOP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFANATOP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFANATOP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFANATOP")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "E_S", table = "CFANATOP", nullable = false)
    private String eS;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFANATOP", nullable = false, length = 5)
    private String codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFANATOP", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "ATUALIZA_CUSTO", table = "CFANATOP", nullable = false)
    private String atualizaCusto;

    @Basic(optional = false)
    @Column(name = "ATUALIZA_PRECO", table = "CFANATOP", nullable = false)
    private String atualizaPreco;

    @Basic
    @Column(name = "DESTACA_IMPOSTO", table = "CFANATOP")
    private String destacaImposto;

    public Integer getIdCfanatop() {
        return idCfanatop;
    }

    public void setIdCfanatop(Integer idCfanatop) {
        this.idCfanatop = idCfanatop;
    }

    public Integer getIdAeaobspr() {
        return idAeaobspr;
    }

    public void setIdAeaobspr(Integer idAeaobspr) {
        this.idAeaobspr = idAeaobspr;
    }

    public Integer getIdCfanatopDev() {
        return idCfanatopDev;
    }

    public void setIdCfanatopDev(Integer idCfanatopDev) {
        this.idCfanatopDev = idCfanatopDev;
    }

    public Integer getIdAeatbper() {
        return idAeatbper;
    }

    public void setIdAeatbper(Integer idAeatbper) {
        this.idAeatbper = idAeatbper;
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

    public String getES() {
        return eS;
    }

    public void setES(String eS) {
        this.eS = eS;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtualizaCusto() {
        return atualizaCusto;
    }

    public void setAtualizaCusto(String atualizaCusto) {
        this.atualizaCusto = atualizaCusto;
    }

    public String getAtualizaPreco() {
        return atualizaPreco;
    }

    public void setAtualizaPreco(String atualizaPreco) {
        this.atualizaPreco = atualizaPreco;
    }

    public String getDestacaImposto() {
        return destacaImposto;
    }

    public void setDestacaImposto(String destacaImposto) {
        this.destacaImposto = destacaImposto;
    }

}