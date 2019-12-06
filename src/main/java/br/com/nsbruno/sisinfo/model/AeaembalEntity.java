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
@Table(name = "AEAEMBAL")
public class AeaembalEntity {

    @Id
    @Column(name = "ID_AEAEMBAL", table = "AEAEMBAL", nullable = false)
    private Integer idAeaembal;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEAEMBAL", nullable = false)
    private int idAeaprodu;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAEMBAL", nullable = false)
    private int idAeaunven;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAEMBAL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAEMBAL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAEMBAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAEMBAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAEMBAL")
    private Integer ctInteg;

    @Basic
    @Column(name = "PRINCIPAL", table = "AEAEMBAL")
    private String principal;

    @Basic
    @Column(name = "DESCRICAO", table = "AEAEMBAL", length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "FATOR_CONVERSAO", table = "AEAEMBAL", nullable = false)
    private double fatorConversao;

    @Basic(optional = false)
    @Column(name = "FATOR_PRECO", table = "AEAEMBAL", nullable = false)
    private double fatorPreco;

    @Basic(optional = false)
    @Column(name = "MODULO", table = "AEAEMBAL", nullable = false)
    private int modulo;

    @Basic(optional = false)
    @Column(name = "DECIMAIS", table = "AEAEMBAL", nullable = false)
    private int decimais;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAEMBAL", nullable = false)
    private String ativo;

    @Basic
    @Column(name = "CODIGO_BARRAS", table = "AEAEMBAL", length = 20)
    private String codigoBarras;

    @Basic
    @Column(name = "REFERENCIA", table = "AEAEMBAL", length = 20)
    private String referencia;

    @Basic
    @Column(name = "TIPO_CALC_TOTAL", table = "AEAEMBAL")
    private String tipoCalcTotal;

    public Integer getIdAeaembal() {
        return idAeaembal;
    }

    public void setIdAeaembal(Integer idAeaembal) {
        this.idAeaembal = idAeaembal;
    }

    public int getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(int idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public int getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
        this.idAeaunven = idAeaunven;
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

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(double fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public double getFatorPreco() {
        return fatorPreco;
    }

    public void setFatorPreco(double fatorPreco) {
        this.fatorPreco = fatorPreco;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public int getDecimais() {
        return decimais;
    }

    public void setDecimais(int decimais) {
        this.decimais = decimais;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTipoCalcTotal() {
        return tipoCalcTotal;
    }

    public void setTipoCalcTotal(String tipoCalcTotal) {
        this.tipoCalcTotal = tipoCalcTotal;
    }

}