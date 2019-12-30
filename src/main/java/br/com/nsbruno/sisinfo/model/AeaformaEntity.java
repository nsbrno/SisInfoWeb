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
@Table(name = "AEAFORMA")
public class AeaformaEntity {

    @Id
    @Column(name = "ID_AEAFORMA", table = "AEAFORMA", nullable = false)
    private Integer idAeaforma;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAFORMA", nullable = false)
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CFATPDOC_PV", table = "AEAFORMA", nullable = false)
    private Integer idCfatpdocPv;

    @Basic(optional = false)
    @Column(name = "ID_CFATPCOB_PV", table = "AEAFORMA", nullable = false)
    private Integer idCfatpcobPv;

    @Basic(optional = false)
    @Column(name = "ID_CFAPORTA_PV", table = "AEAFORMA", nullable = false)
    private Integer idCfaportaPv;

    @Basic(optional = false)
    @Column(name = "ID_CFATPDOC_VF", table = "AEAFORMA", nullable = false)
    private Integer idCfatpdocVf;

    @Basic(optional = false)
    @Column(name = "ID_CFATPCOB_VF", table = "AEAFORMA", nullable = false)
    private Integer idCfatpcobVf;

    @Basic(optional = false)
    @Column(name = "ID_CFAPORTA_VF", table = "AEAFORMA", nullable = false)
    private Integer idCfaportaVf;

    @Basic
    @Column(name = "ID_CFACCRED", table = "AEAFORMA")
    private Integer idCfaccred;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAFORMA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAFORMA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAFORMA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAFORMA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAFORMA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAFORMA", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAFORMA", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "DESCRICAO_ECF", table = "AEAFORMA", length = 40)
    private String descricaoEcf;

    @Basic(optional = false)
    @Column(name = "ATAC_VAREJO", table = "AEAFORMA", nullable = false, length = 3)
    private String atacVarejo;

    @Basic(optional = false)
    @Column(name = "TIPO_CARTAO", table = "AEAFORMA", nullable = false)
    private String tipoCartao;

    @Basic(optional = false)
    @Column(name = "PROGRAMA_ECF", table = "AEAFORMA", nullable = false)
    private String programaEcf;

    public Integer getIdAeaforma() {
        return idAeaforma;
    }

    public void setIdAeaforma(Integer idAeaforma) {
        this.idAeaforma = idAeaforma;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfatpdocPv() {
        return idCfatpdocPv;
    }

    public void setIdCfatpdocPv(Integer idCfatpdocPv) {
        this.idCfatpdocPv = idCfatpdocPv;
    }

    public Integer getIdCfatpcobPv() {
        return idCfatpcobPv;
    }

    public void setIdCfatpcobPv(Integer idCfatpcobPv) {
        this.idCfatpcobPv = idCfatpcobPv;
    }

    public Integer getIdCfaportaPv() {
        return idCfaportaPv;
    }

    public void setIdCfaportaPv(Integer idCfaportaPv) {
        this.idCfaportaPv = idCfaportaPv;
    }

    public Integer getIdCfatpdocVf() {
        return idCfatpdocVf;
    }

    public void setIdCfatpdocVf(Integer idCfatpdocVf) {
        this.idCfatpdocVf = idCfatpdocVf;
    }

    public Integer getIdCfatpcobVf() {
        return idCfatpcobVf;
    }

    public void setIdCfatpcobVf(Integer idCfatpcobVf) {
        this.idCfatpcobVf = idCfatpcobVf;
    }

    public Integer getIdCfaportaVf() {
        return idCfaportaVf;
    }

    public void setIdCfaportaVf(Integer idCfaportaVf) {
        this.idCfaportaVf = idCfaportaVf;
    }

    public Integer getIdCfaccred() {
        return idCfaccred;
    }

    public void setIdCfaccred(Integer idCfaccred) {
        this.idCfaccred = idCfaccred;
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

    public String getDescricaoEcf() {
        return descricaoEcf;
    }

    public void setDescricaoEcf(String descricaoEcf) {
        this.descricaoEcf = descricaoEcf;
    }

    public String getAtacVarejo() {
        return atacVarejo;
    }

    public void setAtacVarejo(String atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public String getProgramaEcf() {
        return programaEcf;
    }

    public void setProgramaEcf(String programaEcf) {
        this.programaEcf = programaEcf;
    }

}