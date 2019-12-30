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
@Table(name = "CBAITBPC")
public class CbaitbpcEntity {

    @Id
    @Column(name = "ID_CBAITBPC", table = "CBAITBPC", nullable = false)
    private Integer idCbaitbpc;

    @Basic(optional = false)
    @Column(name = "ID_CBATBPCT", table = "CBAITBPC", nullable = false)
    private Integer idCbatbpct;

    @Basic
    @Column(name = "ID_CBANUMCX", table = "CBAITBPC")
    private Integer idCbanumcx;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "CBAITBPC")
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBAITBPC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBAITBPC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBAITBPC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBAITBPC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBAITBPC")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "CBAITBPC", nullable = false)
    private Integer sequencia;

    @Basic
    @Column(name = "CALCULO", table = "CBAITBPC")
    private String calculo;

    @Basic
    @Column(name = "SUBTOTAL", table = "CBAITBPC")
    private String subtotal;

    @Basic(optional = false)
    @Column(name = "NIVEL", table = "CBAITBPC", nullable = false)
    private Integer nivel;

    @Basic
    @Column(name = "NEGRITA", table = "CBAITBPC")
    private String negrita;

    @Basic
    @Column(name = "CONTAS", table = "CBAITBPC")
    private String contas;

    @Basic
    @Column(name = "IMPRIME_CODIGO", table = "CBAITBPC")
    private String imprimeCodigo;

    @Basic
    @Column(name = "IMPRIME_DESCRICAO", table = "CBAITBPC")
    private String imprimeDescricao;

    @Basic
    @Column(name = "IMPRIME_VALORES", table = "CBAITBPC")
    private String imprimeValores;

    @Basic
    @Column(name = "LINHA_EM_BRANCO", table = "CBAITBPC")
    private String linhaEmBranco;

    @Basic
    @Column(name = "APLICA_CALCULO", table = "CBAITBPC")
    private String aplicaCalculo;

    public Integer getIdCbaitbpc() {
        return idCbaitbpc;
    }

    public void setIdCbaitbpc(Integer idCbaitbpc) {
        this.idCbaitbpc = idCbaitbpc;
    }

    public Integer getIdCbatbpct() {
        return idCbatbpct;
    }

    public void setIdCbatbpct(Integer idCbatbpct) {
        this.idCbatbpct = idCbatbpct;
    }

    public Integer getIdCbanumcx() {
        return idCbanumcx;
    }

    public void setIdCbanumcx(Integer idCbanumcx) {
        this.idCbanumcx = idCbanumcx;
    }

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
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

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public String getCalculo() {
        return calculo;
    }

    public void setCalculo(String calculo) {
        this.calculo = calculo;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getNegrita() {
        return negrita;
    }

    public void setNegrita(String negrita) {
        this.negrita = negrita;
    }

    public String getContas() {
        return contas;
    }

    public void setContas(String contas) {
        this.contas = contas;
    }

    public String getImprimeCodigo() {
        return imprimeCodigo;
    }

    public void setImprimeCodigo(String imprimeCodigo) {
        this.imprimeCodigo = imprimeCodigo;
    }

    public String getImprimeDescricao() {
        return imprimeDescricao;
    }

    public void setImprimeDescricao(String imprimeDescricao) {
        this.imprimeDescricao = imprimeDescricao;
    }

    public String getImprimeValores() {
        return imprimeValores;
    }

    public void setImprimeValores(String imprimeValores) {
        this.imprimeValores = imprimeValores;
    }

    public String getLinhaEmBranco() {
        return linhaEmBranco;
    }

    public void setLinhaEmBranco(String linhaEmBranco) {
        this.linhaEmBranco = linhaEmBranco;
    }

    public String getAplicaCalculo() {
        return aplicaCalculo;
    }

    public void setAplicaCalculo(String aplicaCalculo) {
        this.aplicaCalculo = aplicaCalculo;
    }

}