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
@Table(name = "AEAITORC")
public class AeaitorcEntity {

    @Id
    @Column(name = "ID_AEAITORC", table = "AEAITORC", nullable = false)
    private Integer idAeaitorc;

    @Basic(optional = false)
    @Column(name = "ID_AEAORCAM", table = "AEAITORC", nullable = false)
    private int idAeaorcam;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ", table = "AEAITORC", nullable = false)
    private int idAeaestoq;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLPGT", table = "AEAITORC", nullable = false)
    private int idAeaplpgt;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAITORC", nullable = false)
    private int idAeaunven;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO_VENDEDOR", table = "AEAITORC", nullable = false)
    private int idCfaclifoVendedor;

    @Basic
    @Column(name = "ID_AEAITORC_CONJ", table = "AEAITORC")
    private Integer idAeaitorcConj;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITORC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITORC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITORC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITORC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITORC")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEAITORC", nullable = false)
    private int sequencia;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITORC", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "VL_CUSTO", table = "AEAITORC", nullable = false)
    private double vlCusto;

    @Basic(optional = false)
    @Column(name = "VL_BRUTO", table = "AEAITORC", nullable = false)
    private double vlBruto;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "AEAITORC", nullable = false)
    private double vlDesconto;

    @Basic
    @Column(name = "FC_CUSTO_UN", table = "AEAITORC", precision = 15)
    private Double fcCustoUn;

    @Basic
    @Column(name = "FC_BRUTO_UN", table = "AEAITORC", precision = 15)
    private Double fcBrutoUn;

    @Basic
    @Column(name = "FC_DESCONTO_UN", table = "AEAITORC", precision = 15)
    private Double fcDescontoUn;

    @Basic
    @Column(name = "FC_LIQUIDO", table = "AEAITORC", precision = 15)
    private Double fcLiquido;

    @Basic
    @Column(name = "PROMOCAO", table = "AEAITORC")
    private String promocao;

    @Basic(optional = false)
    @Column(name = "TIPO_PRODUTO", table = "AEAITORC", nullable = false)
    private String tipoProduto;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "AEAITORC")
    private byte[] complemento;

    @Basic
    @Column(name = "SEQ_DESCONTO", table = "AEAITORC", length = 50)
    private String seqDesconto;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_DESON", table = "AEAITORC", nullable = false)
    private double vlIcmsDeson;

    @Basic(optional = false)
    @Column(name = "VL_PIS_DESON", table = "AEAITORC", nullable = false)
    private double vlPisDeson;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_DESON", table = "AEAITORC", nullable = false)
    private double vlCofinsDeson;

    @Basic(optional = false)
    @Column(name = "VL_IPI_DESON", table = "AEAITORC", nullable = false)
    private double vlIpiDeson;

    public Integer getIdAeaitorc() {
        return idAeaitorc;
    }

    public void setIdAeaitorc(Integer idAeaitorc) {
        this.idAeaitorc = idAeaitorc;
    }

    public int getIdAeaorcam() {
        return idAeaorcam;
    }

    public void setIdAeaorcam(int idAeaorcam) {
        this.idAeaorcam = idAeaorcam;
    }

    public int getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(int idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
    }

    public int getIdAeaplpgt() {
        return idAeaplpgt;
    }

    public void setIdAeaplpgt(int idAeaplpgt) {
        this.idAeaplpgt = idAeaplpgt;
    }

    public int getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public int getIdCfaclifoVendedor() {
        return idCfaclifoVendedor;
    }

    public void setIdCfaclifoVendedor(int idCfaclifoVendedor) {
        this.idCfaclifoVendedor = idCfaclifoVendedor;
    }

    public Integer getIdAeaitorcConj() {
        return idAeaitorcConj;
    }

    public void setIdAeaitorcConj(Integer idAeaitorcConj) {
        this.idAeaitorcConj = idAeaitorcConj;
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

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getVlCusto() {
        return vlCusto;
    }

    public void setVlCusto(double vlCusto) {
        this.vlCusto = vlCusto;
    }

    public double getVlBruto() {
        return vlBruto;
    }

    public void setVlBruto(double vlBruto) {
        this.vlBruto = vlBruto;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public Double getFcCustoUn() {
        return fcCustoUn;
    }

    public void setFcCustoUn(Double fcCustoUn) {
        this.fcCustoUn = fcCustoUn;
    }

    public Double getFcBrutoUn() {
        return fcBrutoUn;
    }

    public void setFcBrutoUn(Double fcBrutoUn) {
        this.fcBrutoUn = fcBrutoUn;
    }

    public Double getFcDescontoUn() {
        return fcDescontoUn;
    }

    public void setFcDescontoUn(Double fcDescontoUn) {
        this.fcDescontoUn = fcDescontoUn;
    }

    public Double getFcLiquido() {
        return fcLiquido;
    }

    public void setFcLiquido(Double fcLiquido) {
        this.fcLiquido = fcLiquido;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public String getSeqDesconto() {
        return seqDesconto;
    }

    public void setSeqDesconto(String seqDesconto) {
        this.seqDesconto = seqDesconto;
    }

    public double getVlIcmsDeson() {
        return vlIcmsDeson;
    }

    public void setVlIcmsDeson(double vlIcmsDeson) {
        this.vlIcmsDeson = vlIcmsDeson;
    }

    public double getVlPisDeson() {
        return vlPisDeson;
    }

    public void setVlPisDeson(double vlPisDeson) {
        this.vlPisDeson = vlPisDeson;
    }

    public double getVlCofinsDeson() {
        return vlCofinsDeson;
    }

    public void setVlCofinsDeson(double vlCofinsDeson) {
        this.vlCofinsDeson = vlCofinsDeson;
    }

    public double getVlIpiDeson() {
        return vlIpiDeson;
    }

    public void setVlIpiDeson(double vlIpiDeson) {
        this.vlIpiDeson = vlIpiDeson;
    }

}