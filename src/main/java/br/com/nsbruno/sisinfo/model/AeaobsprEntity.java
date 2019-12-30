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
@Table(name = "AEAOBSPR")
public class AeaobsprEntity {

    @Id
    @Column(name = "ID_AEAOBSPR", table = "AEAOBSPR", nullable = false)
    private Integer idAeaobspr;

    @Basic
    @Column(name = "ID_AEATBPER", table = "AEAOBSPR")
    private Integer idAeatbper;

    @Basic
    @Column(name = "ID_AEACODST", table = "AEAOBSPR")
    private Integer idAeacodst;

    @Basic
    @Column(name = "ID_CFANATOP", table = "AEAOBSPR")
    private Integer idCfanatop;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAOBSPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAOBSPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAOBSPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAOBSPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAOBSPR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAOBSPR", nullable = false)
    private Integer codigo;

    @Lob
    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAOBSPR", nullable = false)
    private byte[] descricao;

    @Basic
    @Column(name = "SIGLA", table = "AEAOBSPR", length = 18)
    private String sigla;

    @Basic
    @Column(name = "SUFRAMA", table = "AEAOBSPR")
    private String suframa;

    @Basic
    @Column(name = "PESSOA", table = "AEAOBSPR")
    private String pessoa;

    @Basic
    @Column(name = "CRT_ICMS", table = "AEAOBSPR", length = 5)
    private String crtIcms;

    @Basic
    @Column(name = "CRT_PIS", table = "AEAOBSPR", length = 5)
    private String crtPis;

    @Basic
    @Column(name = "CRT_COFINS", table = "AEAOBSPR", length = 5)
    private String crtCofins;

    @Basic
    @Column(name = "CRT_IPI", table = "AEAOBSPR", length = 5)
    private String crtIpi;

    @Basic
    @Column(name = "DESTACA_ICMS", table = "AEAOBSPR")
    private String destacaIcms;

    @Basic
    @Column(name = "DESTACA_PIS", table = "AEAOBSPR")
    private String destacaPis;

    @Basic
    @Column(name = "DESTACA_COFINS", table = "AEAOBSPR")
    private String destacaCofins;

    @Basic
    @Column(name = "DESTACA_IPI", table = "AEAOBSPR")
    private String destacaIpi;

    @Basic
    @Column(name = "TOTAL_NF_ICMS", table = "AEAOBSPR")
    private String totalNfIcms;

    @Basic
    @Column(name = "TOTAL_NF_PIS", table = "AEAOBSPR")
    private String totalNfPis;

    @Basic
    @Column(name = "TOTAL_NF_COFINS", table = "AEAOBSPR")
    private String totalNfCofins;

    @Basic
    @Column(name = "TOTAL_NF_IPI", table = "AEAOBSPR")
    private String totalNfIpi;

    @Basic
    @Column(name = "MOT_DES_ICMS", table = "AEAOBSPR")
    private String motDesIcms;

    public Integer getIdAeaobspr() {
        return idAeaobspr;
    }

    public void setIdAeaobspr(Integer idAeaobspr) {
        this.idAeaobspr = idAeaobspr;
    }

    public Integer getIdAeatbper() {
        return idAeatbper;
    }

    public void setIdAeatbper(Integer idAeatbper) {
        this.idAeatbper = idAeatbper;
    }

    public Integer getIdAeacodst() {
        return idAeacodst;
    }

    public void setIdAeacodst(Integer idAeacodst) {
        this.idAeacodst = idAeacodst;
    }

    public Integer getIdCfanatop() {
        return idCfanatop;
    }

    public void setIdCfanatop(Integer idCfanatop) {
        this.idCfanatop = idCfanatop;
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

    public byte[] getDescricao() {
        return descricao;
    }

    public void setDescricao(byte[] descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getCrtIcms() {
        return crtIcms;
    }

    public void setCrtIcms(String crtIcms) {
        this.crtIcms = crtIcms;
    }

    public String getCrtPis() {
        return crtPis;
    }

    public void setCrtPis(String crtPis) {
        this.crtPis = crtPis;
    }

    public String getCrtCofins() {
        return crtCofins;
    }

    public void setCrtCofins(String crtCofins) {
        this.crtCofins = crtCofins;
    }

    public String getCrtIpi() {
        return crtIpi;
    }

    public void setCrtIpi(String crtIpi) {
        this.crtIpi = crtIpi;
    }

    public String getDestacaIcms() {
        return destacaIcms;
    }

    public void setDestacaIcms(String destacaIcms) {
        this.destacaIcms = destacaIcms;
    }

    public String getDestacaPis() {
        return destacaPis;
    }

    public void setDestacaPis(String destacaPis) {
        this.destacaPis = destacaPis;
    }

    public String getDestacaCofins() {
        return destacaCofins;
    }

    public void setDestacaCofins(String destacaCofins) {
        this.destacaCofins = destacaCofins;
    }

    public String getDestacaIpi() {
        return destacaIpi;
    }

    public void setDestacaIpi(String destacaIpi) {
        this.destacaIpi = destacaIpi;
    }

    public String getTotalNfIcms() {
        return totalNfIcms;
    }

    public void setTotalNfIcms(String totalNfIcms) {
        this.totalNfIcms = totalNfIcms;
    }

    public String getTotalNfPis() {
        return totalNfPis;
    }

    public void setTotalNfPis(String totalNfPis) {
        this.totalNfPis = totalNfPis;
    }

    public String getTotalNfCofins() {
        return totalNfCofins;
    }

    public void setTotalNfCofins(String totalNfCofins) {
        this.totalNfCofins = totalNfCofins;
    }

    public String getTotalNfIpi() {
        return totalNfIpi;
    }

    public void setTotalNfIpi(String totalNfIpi) {
        this.totalNfIpi = totalNfIpi;
    }

    public String getMotDesIcms() {
        return motDesIcms;
    }

    public void setMotDesIcms(String motDesIcms) {
        this.motDesIcms = motDesIcms;
    }

}