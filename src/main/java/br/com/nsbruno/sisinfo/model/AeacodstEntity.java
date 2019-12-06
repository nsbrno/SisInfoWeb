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
@Table(name = "AEACODST")
public class AeacodstEntity {

    @Id
    @Column(name = "ID_AEACODST", table = "AEACODST", nullable = false)
    private Integer idAeacodst;

    @Basic
    @Column(name = "ID_CFANATOP_INT_CF", table = "AEACODST")
    private Integer idCfanatopIntCf;

    @Basic
    @Column(name = "ID_CFANATOP_INT_RV", table = "AEACODST")
    private Integer idCfanatopIntRv;

    @Basic
    @Column(name = "ID_CFANATOP_INT_TR_S", table = "AEACODST")
    private Integer idCfanatopIntTrS;

    @Basic
    @Column(name = "ID_CFANATOP_INT_TR_E", table = "AEACODST")
    private Integer idCfanatopIntTrE;

    @Basic
    @Column(name = "ID_CFANATOP_INT_SV", table = "AEACODST")
    private Integer idCfanatopIntSv;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_CF", table = "AEACODST")
    private Integer idCfanatopExtCf;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_RV", table = "AEACODST")
    private Integer idCfanatopExtRv;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_TR_S", table = "AEACODST")
    private Integer idCfanatopExtTrS;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_TR_E", table = "AEACODST")
    private Integer idCfanatopExtTrE;

    @Basic
    @Column(name = "ID_CFANATOP_EXT_SV", table = "AEACODST")
    private Integer idCfanatopExtSv;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACODST", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACODST", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACODST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACODST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACODST")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACODST", length = 3)
    private String codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEACODST", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "TIPO", table = "AEACODST")
    private String tipo;

    @Basic
    @Column(name = "ORIGEM", table = "AEACODST")
    private String origem;

    @Basic
    @Column(name = "CSOSN", table = "AEACODST", length = 3)
    private String csosn;

    public Integer getIdAeacodst() {
        return idAeacodst;
    }

    public void setIdAeacodst(Integer idAeacodst) {
        this.idAeacodst = idAeacodst;
    }

    public Integer getIdCfanatopIntCf() {
        return idCfanatopIntCf;
    }

    public void setIdCfanatopIntCf(Integer idCfanatopIntCf) {
        this.idCfanatopIntCf = idCfanatopIntCf;
    }

    public Integer getIdCfanatopIntRv() {
        return idCfanatopIntRv;
    }

    public void setIdCfanatopIntRv(Integer idCfanatopIntRv) {
        this.idCfanatopIntRv = idCfanatopIntRv;
    }

    public Integer getIdCfanatopIntTrS() {
        return idCfanatopIntTrS;
    }

    public void setIdCfanatopIntTrS(Integer idCfanatopIntTrS) {
        this.idCfanatopIntTrS = idCfanatopIntTrS;
    }

    public Integer getIdCfanatopIntTrE() {
        return idCfanatopIntTrE;
    }

    public void setIdCfanatopIntTrE(Integer idCfanatopIntTrE) {
        this.idCfanatopIntTrE = idCfanatopIntTrE;
    }

    public Integer getIdCfanatopIntSv() {
        return idCfanatopIntSv;
    }

    public void setIdCfanatopIntSv(Integer idCfanatopIntSv) {
        this.idCfanatopIntSv = idCfanatopIntSv;
    }

    public Integer getIdCfanatopExtCf() {
        return idCfanatopExtCf;
    }

    public void setIdCfanatopExtCf(Integer idCfanatopExtCf) {
        this.idCfanatopExtCf = idCfanatopExtCf;
    }

    public Integer getIdCfanatopExtRv() {
        return idCfanatopExtRv;
    }

    public void setIdCfanatopExtRv(Integer idCfanatopExtRv) {
        this.idCfanatopExtRv = idCfanatopExtRv;
    }

    public Integer getIdCfanatopExtTrS() {
        return idCfanatopExtTrS;
    }

    public void setIdCfanatopExtTrS(Integer idCfanatopExtTrS) {
        this.idCfanatopExtTrS = idCfanatopExtTrS;
    }

    public Integer getIdCfanatopExtTrE() {
        return idCfanatopExtTrE;
    }

    public void setIdCfanatopExtTrE(Integer idCfanatopExtTrE) {
        this.idCfanatopExtTrE = idCfanatopExtTrE;
    }

    public Integer getIdCfanatopExtSv() {
        return idCfanatopExtSv;
    }

    public void setIdCfanatopExtSv(Integer idCfanatopExtSv) {
        this.idCfanatopExtSv = idCfanatopExtSv;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCsosn() {
        return csosn;
    }

    public void setCsosn(String csosn) {
        this.csosn = csosn;
    }

}