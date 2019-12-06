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
@Table(name = "CBANUMCX")
public class CbanumcxEntity {

    @Id
    @Column(name = "ID_CBANUMCX", table = "CBANUMCX", nullable = false)
    private Integer idCbanumcx;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CBANUMCX", nullable = false)
    private int idSmaempre;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA", table = "CBANUMCX", nullable = false)
    private int idCbaplcta;

    @Basic
    @Column(name = "ID_CBAPLCTA_SALDO", table = "CBANUMCX")
    private Integer idCbaplctaSaldo;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_JUROS_DISP", table = "CBANUMCX", nullable = false)
    private int idCbaplctaJurosDisp;

    @Basic(optional = false)
    @Column(name = "ID_CBAPLCTA_TROCO", table = "CBANUMCX", nullable = false)
    private int idCbaplctaTroco;

    @Basic
    @Column(name = "ID_AEASERIE", table = "CBANUMCX")
    private Integer idAeaserie;

    @Basic
    @Column(name = "ID_CFACLIFO_VENDEDOR", table = "CBANUMCX")
    private Integer idCfaclifoVendedor;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBANUMCX", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBANUMCX", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBANUMCX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBANUMCX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBANUMCX")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CBANUMCX", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CBANUMCX", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "SENHA", table = "CBANUMCX", length = 20)
    private String senha;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "CBANUMCX", nullable = false)
    private String ativo;

    @Basic
    @Column(name = "BAIXA_CT_REC", table = "CBANUMCX")
    private String baixaCtRec;

    @Basic
    @Column(name = "BAIXA_CT_PAG", table = "CBANUMCX")
    private String baixaCtPag;

    @Basic
    @Column(name = "BAIXA_VALE", table = "CBANUMCX")
    private String baixaVale;

    @Basic
    @Column(name = "ESTORNA_CT_REC", table = "CBANUMCX")
    private String estornaCtRec;

    @Basic
    @Column(name = "ESTORNA_CT_PAG", table = "CBANUMCX")
    private String estornaCtPag;

    @Basic
    @Column(name = "BLOQUEIA_CONTAS", table = "CBANUMCX")
    private String bloqueiaContas;

    @Basic
    @Column(name = "OUTRAS_DATAS", table = "CBANUMCX")
    private String outrasDatas;

    @Basic
    @Column(name = "FILTRA_PEDIDOS_EMITIDOS", table = "CBANUMCX")
    private String filtraPedidosEmitidos;

    @Basic
    @Column(name = "TRANSACAO_UNICA_DIA", table = "CBANUMCX")
    private String transacaoUnicaDia;

    @Basic
    @Column(name = "ESPELHO_CUPOM", table = "CBANUMCX")
    private String espelhoCupom;

    @Basic
    @Column(name = "EXIGE_AUTENTICACAO", table = "CBANUMCX")
    private String exigeAutenticacao;

    @Basic
    @Column(name = "BAIXA_OUTRAS_DATAS", table = "CBANUMCX")
    private String baixaOutrasDatas;

    @Basic
    @Column(name = "ACESSA_JUROS", table = "CBANUMCX")
    private String acessaJuros;

    @Basic(optional = false)
    @Column(name = "PERC_DESC_JUROS", table = "CBANUMCX", nullable = false)
    private double percDescJuros;

    @Basic(optional = false)
    @Column(name = "PERC_DESC_CAPITAL", table = "CBANUMCX", nullable = false)
    private double percDescCapital;

    @Basic
    @Column(name = "AUTO_AUTENTICACAO", table = "CBANUMCX")
    private String autoAutenticacao;

    public Integer getIdCbanumcx() {
        return idCbanumcx;
    }

    public void setIdCbanumcx(Integer idCbanumcx) {
        this.idCbanumcx = idCbanumcx;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public int getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(int idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public Integer getIdCbaplctaSaldo() {
        return idCbaplctaSaldo;
    }

    public void setIdCbaplctaSaldo(Integer idCbaplctaSaldo) {
        this.idCbaplctaSaldo = idCbaplctaSaldo;
    }

    public int getIdCbaplctaJurosDisp() {
        return idCbaplctaJurosDisp;
    }

    public void setIdCbaplctaJurosDisp(int idCbaplctaJurosDisp) {
        this.idCbaplctaJurosDisp = idCbaplctaJurosDisp;
    }

    public int getIdCbaplctaTroco() {
        return idCbaplctaTroco;
    }

    public void setIdCbaplctaTroco(int idCbaplctaTroco) {
        this.idCbaplctaTroco = idCbaplctaTroco;
    }

    public Integer getIdAeaserie() {
        return idAeaserie;
    }

    public void setIdAeaserie(Integer idAeaserie) {
        this.idAeaserie = idAeaserie;
    }

    public Integer getIdCfaclifoVendedor() {
        return idCfaclifoVendedor;
    }

    public void setIdCfaclifoVendedor(Integer idCfaclifoVendedor) {
        this.idCfaclifoVendedor = idCfaclifoVendedor;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getBaixaCtRec() {
        return baixaCtRec;
    }

    public void setBaixaCtRec(String baixaCtRec) {
        this.baixaCtRec = baixaCtRec;
    }

    public String getBaixaCtPag() {
        return baixaCtPag;
    }

    public void setBaixaCtPag(String baixaCtPag) {
        this.baixaCtPag = baixaCtPag;
    }

    public String getBaixaVale() {
        return baixaVale;
    }

    public void setBaixaVale(String baixaVale) {
        this.baixaVale = baixaVale;
    }

    public String getEstornaCtRec() {
        return estornaCtRec;
    }

    public void setEstornaCtRec(String estornaCtRec) {
        this.estornaCtRec = estornaCtRec;
    }

    public String getEstornaCtPag() {
        return estornaCtPag;
    }

    public void setEstornaCtPag(String estornaCtPag) {
        this.estornaCtPag = estornaCtPag;
    }

    public String getBloqueiaContas() {
        return bloqueiaContas;
    }

    public void setBloqueiaContas(String bloqueiaContas) {
        this.bloqueiaContas = bloqueiaContas;
    }

    public String getOutrasDatas() {
        return outrasDatas;
    }

    public void setOutrasDatas(String outrasDatas) {
        this.outrasDatas = outrasDatas;
    }

    public String getFiltraPedidosEmitidos() {
        return filtraPedidosEmitidos;
    }

    public void setFiltraPedidosEmitidos(String filtraPedidosEmitidos) {
        this.filtraPedidosEmitidos = filtraPedidosEmitidos;
    }

    public String getTransacaoUnicaDia() {
        return transacaoUnicaDia;
    }

    public void setTransacaoUnicaDia(String transacaoUnicaDia) {
        this.transacaoUnicaDia = transacaoUnicaDia;
    }

    public String getEspelhoCupom() {
        return espelhoCupom;
    }

    public void setEspelhoCupom(String espelhoCupom) {
        this.espelhoCupom = espelhoCupom;
    }

    public String getExigeAutenticacao() {
        return exigeAutenticacao;
    }

    public void setExigeAutenticacao(String exigeAutenticacao) {
        this.exigeAutenticacao = exigeAutenticacao;
    }

    public String getBaixaOutrasDatas() {
        return baixaOutrasDatas;
    }

    public void setBaixaOutrasDatas(String baixaOutrasDatas) {
        this.baixaOutrasDatas = baixaOutrasDatas;
    }

    public String getAcessaJuros() {
        return acessaJuros;
    }

    public void setAcessaJuros(String acessaJuros) {
        this.acessaJuros = acessaJuros;
    }

    public double getPercDescJuros() {
        return percDescJuros;
    }

    public void setPercDescJuros(double percDescJuros) {
        this.percDescJuros = percDescJuros;
    }

    public double getPercDescCapital() {
        return percDescCapital;
    }

    public void setPercDescCapital(double percDescCapital) {
        this.percDescCapital = percDescCapital;
    }

    public String getAutoAutenticacao() {
        return autoAutenticacao;
    }

    public void setAutoAutenticacao(String autoAutenticacao) {
        this.autoAutenticacao = autoAutenticacao;
    }

}