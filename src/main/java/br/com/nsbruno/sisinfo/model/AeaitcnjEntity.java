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
@Table(name = "AEAITCNJ")
public class AeaitcnjEntity {

    @Id
    @Column(name = "ID_AEAITCNJ", table = "AEAITCNJ", nullable = false)
    private Integer idAeaitcnj;

    @Basic
    @Column(name = "ID_AEAITSAI", table = "AEAITCNJ")
    private Integer idAeaitsai;

    @Basic
    @Column(name = "ID_AEAITNFS", table = "AEAITCNJ")
    private Integer idAeaitnfs;

    @Basic
    @Column(name = "ID_AEAITORC", table = "AEAITCNJ")
    private Integer idAeaitorc;

    @Basic
    @Column(name = "ID_AEAESTOQ", table = "AEAITCNJ")
    private Integer idAeaestoq;

    @Basic
    @Column(name = "ID_AEAUNVEN", table = "AEAITCNJ")
    private Integer idAeaunven;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITCNJ", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITCNJ", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITCNJ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITCNJ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITCNJ")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_VENDA", table = "AEAITCNJ")
    @Temporal(TemporalType.DATE)
    private Date dtVenda;

    @Basic
    @Column(name = "SEQUENCIA", table = "AEAITCNJ")
    private Integer sequencia;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS", table = "AEAITCNJ", nullable = false)
    private double aliquotaIcms;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_IPI", table = "AEAITCNJ", nullable = false)
    private double aliquotaIpi;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ISS", table = "AEAITCNJ", nullable = false)
    private double aliquotaIss;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITCNJ", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "QTDE_DEVOL", table = "AEAITCNJ", nullable = false)
    private double qtdeDevol;

    @Basic(optional = false)
    @Column(name = "VL_IPI", table = "AEAITCNJ", nullable = false)
    private double vlIpi;

    @Basic(optional = false)
    @Column(name = "VL_CUSTO", table = "AEAITCNJ", nullable = false)
    private double vlCusto;

    @Basic(optional = false)
    @Column(name = "VL_CUSTO_FIS", table = "AEAITCNJ", nullable = false)
    private double vlCustoFis;

    @Basic(optional = false)
    @Column(name = "VL_VISTA", table = "AEAITCNJ", nullable = false)
    private double vlVista;

    @Basic(optional = false)
    @Column(name = "VL_TABELA", table = "AEAITCNJ", nullable = false)
    private double vlTabela;

    @Basic(optional = false)
    @Column(name = "VL_BRUTO", table = "AEAITCNJ", nullable = false)
    private double vlBruto;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "AEAITCNJ", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS", table = "AEAITCNJ", nullable = false)
    private double vlBaseIcms;

    @Basic(optional = false)
    @Column(name = "VL_BASE_IPI", table = "AEAITCNJ", nullable = false)
    private double vlBaseIpi;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ISS", table = "AEAITCNJ", nullable = false)
    private double vlBaseIss;

    @Basic(optional = false)
    @Column(name = "VL_ICMS", table = "AEAITCNJ", nullable = false)
    private double vlIcms;

    @Basic(optional = false)
    @Column(name = "VL_ISS", table = "AEAITCNJ", nullable = false)
    private double vlIss;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_ICMS", table = "AEAITCNJ", nullable = false)
    private double vlIsentoIcms;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_IPI", table = "AEAITCNJ", nullable = false)
    private double vlIsentoIpi;

    @Basic
    @Column(name = "PROMOCAO", table = "AEAITCNJ")
    private String promocao;

    @Basic
    @Column(name = "TIPO_PRODUTO", table = "AEAITCNJ")
    private String tipoProduto;

    @Basic
    @Column(name = "ATAC_VAREJO", table = "AEAITCNJ")
    private String atacVarejo;

    @Basic
    @Column(name = "TIPO_BAIXA", table = "AEAITCNJ")
    private String tipoBaixa;

    @Basic
    @Column(name = "TIPO_IPI", table = "AEAITCNJ")
    private String tipoIpi;

    @Basic(optional = false)
    @Column(name = "COMISSAO", table = "AEAITCNJ", nullable = false)
    private double comissao;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "AEAITCNJ")
    private byte[] complemento;

    @Basic
    @Column(name = "SEQ_DESCONTO", table = "AEAITCNJ", length = 50)
    private String seqDesconto;

    public Integer getIdAeaitcnj() {
        return idAeaitcnj;
    }

    public void setIdAeaitcnj(Integer idAeaitcnj) {
        this.idAeaitcnj = idAeaitcnj;
    }

    public Integer getIdAeaitsai() {
        return idAeaitsai;
    }

    public void setIdAeaitsai(Integer idAeaitsai) {
        this.idAeaitsai = idAeaitsai;
    }

    public Integer getIdAeaitnfs() {
        return idAeaitnfs;
    }

    public void setIdAeaitnfs(Integer idAeaitnfs) {
        this.idAeaitnfs = idAeaitnfs;
    }

    public Integer getIdAeaitorc() {
        return idAeaitorc;
    }

    public void setIdAeaitorc(Integer idAeaitorc) {
        this.idAeaitorc = idAeaitorc;
    }

    public Integer getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(Integer idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
    }

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
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

    public Date getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(Date dtVenda) {
        this.dtVenda = dtVenda;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }

    public double getAliquotaIss() {
        return aliquotaIss;
    }

    public void setAliquotaIss(double aliquotaIss) {
        this.aliquotaIss = aliquotaIss;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQtdeDevol() {
        return qtdeDevol;
    }

    public void setQtdeDevol(double qtdeDevol) {
        this.qtdeDevol = qtdeDevol;
    }

    public double getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public double getVlCusto() {
        return vlCusto;
    }

    public void setVlCusto(double vlCusto) {
        this.vlCusto = vlCusto;
    }

    public double getVlCustoFis() {
        return vlCustoFis;
    }

    public void setVlCustoFis(double vlCustoFis) {
        this.vlCustoFis = vlCustoFis;
    }

    public double getVlVista() {
        return vlVista;
    }

    public void setVlVista(double vlVista) {
        this.vlVista = vlVista;
    }

    public double getVlTabela() {
        return vlTabela;
    }

    public void setVlTabela(double vlTabela) {
        this.vlTabela = vlTabela;
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

    public double getVlBaseIcms() {
        return vlBaseIcms;
    }

    public void setVlBaseIcms(double vlBaseIcms) {
        this.vlBaseIcms = vlBaseIcms;
    }

    public double getVlBaseIpi() {
        return vlBaseIpi;
    }

    public void setVlBaseIpi(double vlBaseIpi) {
        this.vlBaseIpi = vlBaseIpi;
    }

    public double getVlBaseIss() {
        return vlBaseIss;
    }

    public void setVlBaseIss(double vlBaseIss) {
        this.vlBaseIss = vlBaseIss;
    }

    public double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public double getVlIss() {
        return vlIss;
    }

    public void setVlIss(double vlIss) {
        this.vlIss = vlIss;
    }

    public double getVlIsentoIcms() {
        return vlIsentoIcms;
    }

    public void setVlIsentoIcms(double vlIsentoIcms) {
        this.vlIsentoIcms = vlIsentoIcms;
    }

    public double getVlIsentoIpi() {
        return vlIsentoIpi;
    }

    public void setVlIsentoIpi(double vlIsentoIpi) {
        this.vlIsentoIpi = vlIsentoIpi;
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

    public String getAtacVarejo() {
        return atacVarejo;
    }

    public void setAtacVarejo(String atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public String getTipoBaixa() {
        return tipoBaixa;
    }

    public void setTipoBaixa(String tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public String getTipoIpi() {
        return tipoIpi;
    }

    public void setTipoIpi(String tipoIpi) {
        this.tipoIpi = tipoIpi;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
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

}