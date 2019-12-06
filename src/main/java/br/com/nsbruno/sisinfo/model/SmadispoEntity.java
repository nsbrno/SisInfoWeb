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
@Table(name = "SMADISPO")
public class SmadispoEntity {

    @Id
    @Column(name = "ID_SMADISPO", table = "SMADISPO", nullable = false)
    private Integer idSmadispo;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "SMADISPO")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFACLIFO_FUNC", table = "SMADISPO")
    private Integer idCfaclifoFunc;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMADISPO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMADISPO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMADISPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMADISPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMADISPO")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "SMADISPO")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "SMADISPO", length = 40)
    private String descricao;

    @Basic
    @Column(name = "IDENTIFICACAO", table = "SMADISPO", length = 40)
    private String identificacao;

    @Basic
    @Column(name = "ATIVO", table = "SMADISPO")
    private String ativo;

    public Integer getIdSmadispo() {
        return idSmadispo;
    }

    public void setIdSmadispo(Integer idSmadispo) {
        this.idSmadispo = idSmadispo;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaclifoFunc() {
        return idCfaclifoFunc;
    }

    public void setIdCfaclifoFunc(Integer idCfaclifoFunc) {
        this.idCfaclifoFunc = idCfaclifoFunc;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}