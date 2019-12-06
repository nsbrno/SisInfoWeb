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
@Table(name = "RPAPARCE")
public class RpaparceEntity {

    @Id
    @Column(name = "ID_RPAPARCE", table = "RPAPARCE", nullable = false)
    private Integer idRpaparce;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "RPAPARCE", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_RPAFATUR", table = "RPAPARCE")
    private Integer idRpafatur;

    @Basic
    @Column(name = "ID_CBAITACE", table = "RPAPARCE")
    private Integer idCbaitace;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "RPAPARCE", nullable = false)
    private int idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_CFATPDOC", table = "RPAPARCE", nullable = false)
    private int idCfatpdoc;

    @Basic
    @Column(name = "ID_CBAPLCTA_CTA_TRANS", table = "RPAPARCE")
    private Integer idCbaplctaCtaTrans;

    @Basic
    @Column(name = "ID_CBAPLCTA_DP", table = "RPAPARCE")
    private Integer idCbaplctaDp;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "RPAPARCE")
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "ID_CFATPCOB", table = "RPAPARCE", nullable = false)
    private int idCfatpcob;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "RPAPARCE")
    private Integer idCfamoeda;

    @Basic(optional = false)
    @Column(name = "ID_CFAPORTA", table = "RPAPARCE", nullable = false)
    private int idCfaporta;

    @Basic
    @Column(name = "ID_CFAESTAD_ORGAO", table = "RPAPARCE")
    private Integer idCfaestadOrgao;

    @Basic
    @Column(name = "ID_CBACAIXA_AUTENTIC", table = "RPAPARCE")
    private Integer idCbacaixaAutentic;

    @Basic
    @Column(name = "ID_CFACLIFO_AUTENTIC", table = "RPAPARCE")
    private Integer idCfaclifoAutentic;

    @Basic
    @Column(name = "ID_CFACCRED", table = "RPAPARCE")
    private Integer idCfaccred;

    @Basic(optional = false)
    @Column(name = "GUID", table = "RPAPARCE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "RPAPARCE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "RPAPARCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "RPAPARCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "RPAPARCE")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "RPAPARCE", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "DT_IMPORTACAO", table = "RPAPARCE")
    @Temporal(TemporalType.DATE)
    private Date dtImportacao;

    @Basic(optional = false)
    @Column(name = "DT_EMISSAO", table = "RPAPARCE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic(optional = false)
    @Column(name = "DT_VENCIMENTO", table = "RPAPARCE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Basic
    @Column(name = "DT_PAGAMENTO", table = "RPAPARCE")
    @Temporal(TemporalType.DATE)
    private Date dtPagamento;

    @Basic
    @Column(name = "DT_BAIXA", table = "RPAPARCE")
    @Temporal(TemporalType.DATE)
    private Date dtBaixa;

    @Basic
    @Column(name = "DT_TEM_DOCTO_MUDOU", table = "RPAPARCE")
    @Temporal(TemporalType.DATE)
    private Date dtTemDoctoMudou;

    @Basic
    @Column(name = "DT_AUTENTIC", table = "RPAPARCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAutentic;

    @Basic(optional = false)
    @Column(name = "PARCELA", table = "RPAPARCE", nullable = false)
    private int parcela;

    @Basic(optional = false)
    @Column(name = "VL_PARCELA", table = "RPAPARCE", nullable = false)
    private double vlParcela;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_PRORROG", table = "RPAPARCE", nullable = false)
    private double vlJurosProrrog;

    @Basic(optional = false)
    @Column(name = "VL_PAGO", table = "RPAPARCE", nullable = false)
    private double vlPago;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "RPAPARCE", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "RPAPARCE", nullable = false)
    private double vlJuros;

    @Basic
    @Column(name = "FC_VL_TOTAL_PAGO", table = "RPAPARCE", precision = 15)
    private Double fcVlTotalPago;

    @Basic
    @Column(name = "FC_VL_RESTANTE", table = "RPAPARCE", precision = 15)
    private Double fcVlRestante;

    @Basic
    @Column(name = "FC_VL_RESTANTE_SEM_PRORROG", table = "RPAPARCE", precision = 15)
    private Double fcVlRestanteSemProrrog;

    @Basic(optional = false)
    @Column(name = "VL_JUROS_DIARIO", table = "RPAPARCE", nullable = false)
    private double vlJurosDiario;

    @Basic(optional = false)
    @Column(name = "NUM_EMISSOES", table = "RPAPARCE", nullable = false)
    private int numEmissoes;

    @Basic(optional = false)
    @Column(name = "TAXA_DIARIA", table = "RPAPARCE", nullable = false)
    private double taxaDiaria;

    @Basic
    @Column(name = "CAPITALIZA", table = "RPAPARCE")
    private String capitaliza;

    @Basic
    @Column(name = "PRORROGADO", table = "RPAPARCE")
    private String prorrogado;

    @Basic(optional = false)
    @Column(name = "DIAS_PROTESTO", table = "RPAPARCE", nullable = false)
    private int diasProtesto;

    @Basic(optional = false)
    @Column(name = "TEM_DOCTO", table = "RPAPARCE", nullable = false)
    private String temDocto;

    @Basic(optional = false)
    @Column(name = "PERC_MULTA", table = "RPAPARCE", nullable = false)
    private double percMulta;

    @Basic(optional = false)
    @Column(name = "PERC_DESCONTO", table = "RPAPARCE", nullable = false)
    private double percDesconto;

    @Basic
    @Column(name = "INDEXADO", table = "RPAPARCE")
    private String indexado;

    @Basic(optional = false)
    @Column(name = "SEQUENCIAL", table = "RPAPARCE", nullable = false, length = 13)
    private String sequencial;

    @Basic(optional = false)
    @Column(name = "AGENCIA", table = "RPAPARCE", nullable = false)
    private int agencia;

    @Basic
    @Column(name = "DG_AG", table = "RPAPARCE")
    private String dgAg;

    @Basic
    @Column(name = "CONTA", table = "RPAPARCE")
    private Integer conta;

    @Basic
    @Column(name = "DG_CT", table = "RPAPARCE", length = 2)
    private String dgCt;

    @Basic
    @Column(name = "SERIE", table = "RPAPARCE", length = 6)
    private String serie;

    @Basic
    @Column(name = "NUMERO", table = "RPAPARCE", length = 20)
    private String numero;

    @Basic
    @Column(name = "CONTROLE", table = "RPAPARCE", length = 60)
    private String controle;

    @Basic
    @Column(name = "SEQ_BOLETO", table = "RPAPARCE")
    private Integer seqBoleto;

    @Basic
    @Column(name = "NOME", table = "RPAPARCE", length = 60)
    private String nome;

    @Basic
    @Column(name = "CPF_CGC", table = "RPAPARCE", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "IE_RG", table = "RPAPARCE", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "ORGAO_EMISSOR", table = "RPAPARCE", length = 3)
    private String orgaoEmissor;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "RPAPARCE", nullable = false)
    private short situacao;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPAPARCE")
    private byte[] obs;

    @Basic
    @Column(name = "A_S", table = "RPAPARCE")
    private String a_S;

    public Integer getIdRpaparce() {
        return idRpaparce;
    }

    public void setIdRpaparce(Integer idRpaparce) {
        this.idRpaparce = idRpaparce;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdRpafatur() {
        return idRpafatur;
    }

    public void setIdRpafatur(Integer idRpafatur) {
        this.idRpafatur = idRpafatur;
    }

    public Integer getIdCbaitace() {
        return idCbaitace;
    }

    public void setIdCbaitace(Integer idCbaitace) {
        this.idCbaitace = idCbaitace;
    }

    public int getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public int getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(int idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public Integer getIdCbaplctaCtaTrans() {
        return idCbaplctaCtaTrans;
    }

    public void setIdCbaplctaCtaTrans(Integer idCbaplctaCtaTrans) {
        this.idCbaplctaCtaTrans = idCbaplctaCtaTrans;
    }

    public Integer getIdCbaplctaDp() {
        return idCbaplctaDp;
    }

    public void setIdCbaplctaDp(Integer idCbaplctaDp) {
        this.idCbaplctaDp = idCbaplctaDp;
    }

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public int getIdCfatpcob() {
        return idCfatpcob;
    }

    public void setIdCfatpcob(int idCfatpcob) {
        this.idCfatpcob = idCfatpcob;
    }

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
    }

    public int getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(int idCfaporta) {
        this.idCfaporta = idCfaporta;
    }

    public Integer getIdCfaestadOrgao() {
        return idCfaestadOrgao;
    }

    public void setIdCfaestadOrgao(Integer idCfaestadOrgao) {
        this.idCfaestadOrgao = idCfaestadOrgao;
    }

    public Integer getIdCbacaixaAutentic() {
        return idCbacaixaAutentic;
    }

    public void setIdCbacaixaAutentic(Integer idCbacaixaAutentic) {
        this.idCbacaixaAutentic = idCbacaixaAutentic;
    }

    public Integer getIdCfaclifoAutentic() {
        return idCfaclifoAutentic;
    }

    public void setIdCfaclifoAutentic(Integer idCfaclifoAutentic) {
        this.idCfaclifoAutentic = idCfaclifoAutentic;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDtImportacao() {
        return dtImportacao;
    }

    public void setDtImportacao(Date dtImportacao) {
        this.dtImportacao = dtImportacao;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(Date dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public Date getDtBaixa() {
        return dtBaixa;
    }

    public void setDtBaixa(Date dtBaixa) {
        this.dtBaixa = dtBaixa;
    }

    public Date getDtTemDoctoMudou() {
        return dtTemDoctoMudou;
    }

    public void setDtTemDoctoMudou(Date dtTemDoctoMudou) {
        this.dtTemDoctoMudou = dtTemDoctoMudou;
    }

    public Date getDtAutentic() {
        return dtAutentic;
    }

    public void setDtAutentic(Date dtAutentic) {
        this.dtAutentic = dtAutentic;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public double getVlParcela() {
        return vlParcela;
    }

    public void setVlParcela(double vlParcela) {
        this.vlParcela = vlParcela;
    }

    public double getVlJurosProrrog() {
        return vlJurosProrrog;
    }

    public void setVlJurosProrrog(double vlJurosProrrog) {
        this.vlJurosProrrog = vlJurosProrrog;
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

    public Double getFcVlRestanteSemProrrog() {
        return fcVlRestanteSemProrrog;
    }

    public void setFcVlRestanteSemProrrog(Double fcVlRestanteSemProrrog) {
        this.fcVlRestanteSemProrrog = fcVlRestanteSemProrrog;
    }

    public double getVlJurosDiario() {
        return vlJurosDiario;
    }

    public void setVlJurosDiario(double vlJurosDiario) {
        this.vlJurosDiario = vlJurosDiario;
    }

    public int getNumEmissoes() {
        return numEmissoes;
    }

    public void setNumEmissoes(int numEmissoes) {
        this.numEmissoes = numEmissoes;
    }

    public double getTaxaDiaria() {
        return taxaDiaria;
    }

    public void setTaxaDiaria(double taxaDiaria) {
        this.taxaDiaria = taxaDiaria;
    }

    public String getCapitaliza() {
        return capitaliza;
    }

    public void setCapitaliza(String capitaliza) {
        this.capitaliza = capitaliza;
    }

    public String getProrrogado() {
        return prorrogado;
    }

    public void setProrrogado(String prorrogado) {
        this.prorrogado = prorrogado;
    }

    public int getDiasProtesto() {
        return diasProtesto;
    }

    public void setDiasProtesto(int diasProtesto) {
        this.diasProtesto = diasProtesto;
    }

    public String getTemDocto() {
        return temDocto;
    }

    public void setTemDocto(String temDocto) {
        this.temDocto = temDocto;
    }

    public double getPercMulta() {
        return percMulta;
    }

    public void setPercMulta(double percMulta) {
        this.percMulta = percMulta;
    }

    public double getPercDesconto() {
        return percDesconto;
    }

    public void setPercDesconto(double percDesconto) {
        this.percDesconto = percDesconto;
    }

    public String getIndexado() {
        return indexado;
    }

    public void setIndexado(String indexado) {
        this.indexado = indexado;
    }

    public String getSequencial() {
        return sequencial;
    }

    public void setSequencial(String sequencial) {
        this.sequencial = sequencial;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getDgAg() {
        return dgAg;
    }

    public void setDgAg(String dgAg) {
        this.dgAg = dgAg;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public String getDgCt() {
        return dgCt;
    }

    public void setDgCt(String dgCt) {
        this.dgCt = dgCt;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public Integer getSeqBoleto() {
        return seqBoleto;
    }

    public void setSeqBoleto(Integer seqBoleto) {
        this.seqBoleto = seqBoleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCgc() {
        return cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public String getIeRg() {
        return ieRg;
    }

    public void setIeRg(String ieRg) {
        this.ieRg = ieRg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
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