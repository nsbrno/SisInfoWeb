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
@Table(name = "RPAFATUR")
public class RpafaturEntity {

    @Id
    @Column(name = "ID_RPAFATUR", table = "RPAFATUR", nullable = false)
    private Integer idRpafatur;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "RPAFATUR", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_CFATPFAT_VENDA", table = "RPAFATUR")
    private Integer idCfatpfatVenda;

    @Basic(optional = false)
    @Column(name = "ID_CFATPFAT", table = "RPAFATUR", nullable = false)
    private int idCfatpfat;

    @Basic
    @Column(name = "ID_AEAFORMA", table = "RPAFATUR")
    private Integer idAeaforma;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_CTA_TRANS", table = "RPAFATUR", nullable = false)
    private int idCbaplctaCtaTrans;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA", table = "RPAFATUR", nullable = false)
    private int idCbaplcta;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "RPAFATUR")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "RPAFATUR")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFACLIFO_CONVENIO", table = "RPAFATUR")
    private Integer idCfaclifoConvenio;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAFATUR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAFATUR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAFATUR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAFATUR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAFATUR")
    private Integer ctInteg;

    @Basic
    @Column(name = "ORIGEM", table = "RPAFATUR")
    private String origem;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "RPAFATUR", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "ATAC_VAREJO", table = "RPAFATUR")
    private String atacVarejo;

    @Basic
    @Column(name = "NUMERO_VENDA", table = "RPAFATUR")
    private Integer numeroVenda;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "RPAFATUR", nullable = false)
    private int numero;

    @Basic
    @Column(name = "DT_IMPORTACAO", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtImportacao;

    @Basic(optional = false)
    @Column(name = "DT_ABERTURA", table = "RPAFATUR", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtAbertura;

    @Basic
    @Column(name = "DT_EMISSAO", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_BAIXA", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtBaixa;

    @Basic
    @Column(name = "DT_PAGAMENTO", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtPagamento;

    @Basic
    @Column(name = "DT_CANCEL", table = "RPAFATUR")
    @Temporal(TemporalType.DATE)
    private Date dtCancel;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "RPAFATUR", nullable = false)
    private short situacao;

    @Basic(optional = false)
    @Column(name = "VL_FATURA", table = "RPAFATUR", nullable = false)
    private double vlFatura;

    @Basic(optional = false)
    @Column(name = "VL_DIF_VENCTO", table = "RPAFATUR", nullable = false)
    private double vlDifVencto;

    @Basic(optional = false)
    @Column(name = "VL_COMP_FATURA", table = "RPAFATUR", nullable = false)
    private double vlCompFatura;

    @Basic
    @Column(name = "FC_VL_TOTAL_FATURA", table = "RPAFATUR", precision = 15)
    private Double fcVlTotalFatura;

    @Basic(optional = false)
    @Column(name = "VL_FATURADO", table = "RPAFATUR", nullable = false)
    private double vlFaturado;

    @Basic(optional = false)
    @Column(name = "VL_PAGO", table = "RPAFATUR", nullable = false)
    private double vlPago;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "RPAFATUR", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "RPAFATUR", nullable = false)
    private double vlJuros;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_PRORROG", table = "RPAFATUR", nullable = false)
    private double vlJurosProrrog;

    @Basic(optional = false)
    @Column(name = "VL_ANEXADO", table = "RPAFATUR", nullable = false)
    private double vlAnexado;

    @Basic
    @Column(name = "FC_VL_TOTAL_PAGO", table = "RPAFATUR", precision = 15)
    private Double fcVlTotalPago;

    @Basic
    @Column(name = "FC_VL_RESTANTE", table = "RPAFATUR", precision = 15)
    private Double fcVlRestante;

    @Basic(optional = false)
    @Column(name = "NUM_PARCELAS", table = "RPAFATUR", nullable = false)
    private short numParcelas;

    @Basic(optional = false)
    @Column(name = "AGUARDA_FATURAMENTO", table = "RPAFATUR", nullable = false)
    private String aguardaFaturamento;

    @Basic
    @Column(name = "FATURADO", table = "RPAFATUR")
    private String faturado;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPAFATUR")
    private byte[] obs;

    @Basic
    @Column(name = "A_S", table = "RPAFATUR")
    private String a_S;

    public Integer getIdRpafatur() {
        return idRpafatur;
    }

    public void setIdRpafatur(Integer idRpafatur) {
        this.idRpafatur = idRpafatur;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfatpfatVenda() {
        return idCfatpfatVenda;
    }

    public void setIdCfatpfatVenda(Integer idCfatpfatVenda) {
        this.idCfatpfatVenda = idCfatpfatVenda;
    }

    public int getIdCfatpfat() {
        return idCfatpfat;
    }

    public void setIdCfatpfat(int idCfatpfat) {
        this.idCfatpfat = idCfatpfat;
    }

    public Integer getIdAeaforma() {
        return idAeaforma;
    }

    public void setIdAeaforma(Integer idAeaforma) {
        this.idAeaforma = idAeaforma;
    }

    public int getIdCbaplctaCtaTrans() {
        return idCbaplctaCtaTrans;
    }

    public void setIdCbaplctaCtaTrans(int idCbaplctaCtaTrans) {
        this.idCbaplctaCtaTrans = idCbaplctaCtaTrans;
    }

    public int getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(int idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaclifoConvenio() {
        return idCfaclifoConvenio;
    }

    public void setIdCfaclifoConvenio(Integer idCfaclifoConvenio) {
        this.idCfaclifoConvenio = idCfaclifoConvenio;
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAtacVarejo() {
        return atacVarejo;
    }

    public void setAtacVarejo(String atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public Integer getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(Integer numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDtImportacao() {
        return dtImportacao;
    }

    public void setDtImportacao(Date dtImportacao) {
        this.dtImportacao = dtImportacao;
    }

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtBaixa() {
        return dtBaixa;
    }

    public void setDtBaixa(Date dtBaixa) {
        this.dtBaixa = dtBaixa;
    }

    public Date getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(Date dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public Date getDtCancel() {
        return dtCancel;
    }

    public void setDtCancel(Date dtCancel) {
        this.dtCancel = dtCancel;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public double getVlFatura() {
        return vlFatura;
    }

    public void setVlFatura(double vlFatura) {
        this.vlFatura = vlFatura;
    }

    public double getVlDifVencto() {
        return vlDifVencto;
    }

    public void setVlDifVencto(double vlDifVencto) {
        this.vlDifVencto = vlDifVencto;
    }

    public double getVlCompFatura() {
        return vlCompFatura;
    }

    public void setVlCompFatura(double vlCompFatura) {
        this.vlCompFatura = vlCompFatura;
    }

    public Double getFcVlTotalFatura() {
        return fcVlTotalFatura;
    }

    public void setFcVlTotalFatura(Double fcVlTotalFatura) {
        this.fcVlTotalFatura = fcVlTotalFatura;
    }

    public double getVlFaturado() {
        return vlFaturado;
    }

    public void setVlFaturado(double vlFaturado) {
        this.vlFaturado = vlFaturado;
    }

    public double getVlPago() {
        return vlPago;
    }

    public void setVlPago(double vlPago) {
        this.vlPago = vlPago;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlJuros() {
        return vlJuros;
    }

    public void setVlJuros(double vlJuros) {
        this.vlJuros = vlJuros;
    }

    public double getVlJurosProrrog() {
        return vlJurosProrrog;
    }

    public void setVlJurosProrrog(double vlJurosProrrog) {
        this.vlJurosProrrog = vlJurosProrrog;
    }

    public double getVlAnexado() {
        return vlAnexado;
    }

    public void setVlAnexado(double vlAnexado) {
        this.vlAnexado = vlAnexado;
    }

    public Double getFcVlTotalPago() {
        return fcVlTotalPago;
    }

    public void setFcVlTotalPago(Double fcVlTotalPago) {
        this.fcVlTotalPago = fcVlTotalPago;
    }

    public Double getFcVlRestante() {
        return fcVlRestante;
    }

    public void setFcVlRestante(Double fcVlRestante) {
        this.fcVlRestante = fcVlRestante;
    }

    public short getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(short numParcelas) {
        this.numParcelas = numParcelas;
    }

    public String getAguardaFaturamento() {
        return aguardaFaturamento;
    }

    public void setAguardaFaturamento(String aguardaFaturamento) {
        this.aguardaFaturamento = aguardaFaturamento;
    }

    public String getFaturado() {
        return faturado;
    }

    public void setFaturado(String faturado) {
        this.faturado = faturado;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getA_S() {
        return a_S;
    }

    public void setA_S(String a_S) {
        this.a_S = a_S;
    }

}