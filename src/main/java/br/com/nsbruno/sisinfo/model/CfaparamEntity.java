package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "CFAPARAM")
@Data
public class CfaparamEntity {

    @Id
    @Column(name = "ID_CFAPARAM", table = "CFAPARAM", nullable = false)
    private Integer idCfaparam;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFAPARAM", nullable = false)
    private int idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CFAPARAM", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_CFACLIFO_VENDE", table = "CFAPARAM")
    private Integer idCfaclifoVende;

    @Basic
    @Column(name = "ID_CFACLIFO_CONVENIO", table = "CFAPARAM")
    private Integer idCfaclifoConvenio;

    @Basic
    @Column(name = "ID_CFACLIFO_INDICOU", table = "CFAPARAM")
    private Integer idCfaclifoIndicou;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "CFAPARAM")
    private Integer idCfamoeda;

    @Basic
    @Column(name = "ID_CFATPCOB", table = "CFAPARAM")
    private Integer idCfatpcob;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "CFAPARAM")
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "CFAPARAM")
    private Integer idCbaplcta;

    @Basic
    @Column(name = "ID_CBACTCUS", table = "CFAPARAM")
    private Integer idCbactcus;

    @Basic
    @Column(name = "ID_CFATPDOC", table = "CFAPARAM")
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_AEAFORMA", table = "CFAPARAM")
    private Integer idAeaforma;

    @Basic
    @Column(name = "ID_AEAPLPGT", table = "CFAPARAM")
    private Integer idAeaplpgt;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAPARAM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAPARAM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAPARAM")
    private Integer ctInteg;

    @Basic
    @Column(name = "VENDE_ATRAZADO", table = "CFAPARAM")
    private String vendeAtrazado;

    @Basic
    @Column(name = "DEBITO_EM_CONTA", table = "CFAPARAM")
    private String debitoEmConta;

    @Basic(optional = false)
    @Column(name = "LIMITE", table = "CFAPARAM", nullable = false)
    private double limite;

    @Basic(optional = false)
    @Column(name = "DESC_ATAC_VISTA", table = "CFAPARAM", nullable = false)
    private double descAtacVista;

    @Basic(optional = false)
    @Column(name = "DESC_ATAC_PRAZO", table = "CFAPARAM", nullable = false)
    private double descAtacPrazo;

    @Basic(optional = false)
    @Column(name = "DESC_VARE_VISTA", table = "CFAPARAM", nullable = false)
    private double descVareVista;

    @Basic(optional = false)
    @Column(name = "DESC_VARE_PRAZO", table = "CFAPARAM", nullable = false)
    private double descVarePrazo;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_VISTA", table = "CFAPARAM", nullable = false)
    private double descServVista;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_PRAZO", table = "CFAPARAM", nullable = false)
    private double descServPrazo;

    @Basic
    @Column(name = "DESC_PROMOCAO", table = "CFAPARAM")
    private String descPromocao;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO1", table = "CFAPARAM", nullable = false)
    private int diaVencto1;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO2", table = "CFAPARAM", nullable = false)
    private int diaVencto2;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO3", table = "CFAPARAM", nullable = false)
    private int diaVencto3;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO4", table = "CFAPARAM", nullable = false)
    private int diaVencto4;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO_SEMANA1", table = "CFAPARAM", nullable = false)
    private int diaVenctoSemana1;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO_SEMANA2", table = "CFAPARAM", nullable = false)
    private int diaVenctoSemana2;

    @Basic(optional = false)
    @Column(name = "ROTEIRO", table = "CFAPARAM", nullable = false)
    private int roteiro;

    @Basic(optional = false)
    @Column(name = "FREQUENCIA", table = "CFAPARAM", nullable = false)
    private int frequencia;

    @Basic(optional = false)
    @Column(name = "POSICAO_ROTEIRO", table = "CFAPARAM", nullable = false)
    private int posicaoRoteiro;

    @Basic
    @Column(name = "DT_ULT_COMPRA", table = "CFAPARAM")
    @Temporal(TemporalType.DATE)
    private Date dtUltCompra;

    @Basic
    @Column(name = "DT_ULT_VISITA", table = "CFAPARAM")
    @Temporal(TemporalType.DATE)
    private Date dtUltVisita;

    @Basic
    @Column(name = "DT_ULT_ENVIO", table = "CFAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltEnvio;

    @Basic
    @Column(name = "DT_ULT_RECEBTO", table = "CFAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltRecebto;

    @Basic
    @Column(name = "DT_PROXIMO_CONTATO", table = "CFAPARAM")
    @Temporal(TemporalType.DATE)
    private Date dtProximoContato;

    @Basic(optional = false)
    @Column(name = "PERC_REDUC_FAT_ATAC", table = "CFAPARAM", nullable = false)
    private double percReducFatAtac;

    @Basic(optional = false)
    @Column(name = "PERC_REDUC_FAT_VARE", table = "CFAPARAM", nullable = false)
    private double percReducFatVare;

    @Basic(optional = false)
    @Column(name = "VALOR_MINIMO_AGRUP", table = "CFAPARAM", nullable = false)
    private double valorMinimoAgrup;

    @Basic(optional = false)
    @Column(name = "VALOR_MAXIMO_AGRUP", table = "CFAPARAM", nullable = false)
    private double valorMaximoAgrup;

    @Basic(optional = false)
    @Column(name = "DIAS_ATRAZO", table = "CFAPARAM", nullable = false)
    private int diasAtrazo;

    @Basic(optional = false)
    @Column(name = "DIAS_CARENCIA", table = "CFAPARAM", nullable = false)
    private int diasCarencia;

    @Basic(optional = false)
    @Column(name = "JUROS_DIARIO", table = "CFAPARAM", nullable = false)
    private double jurosDiario;

    @Basic
    @Column(name = "ATACADO_VAREJO", table = "CFAPARAM")
    private String atacadoVarejo;

    @Basic
    @Column(name = "VISTA_PRAZO", table = "CFAPARAM")
    private String vistaPrazo;

    @Basic
    @Column(name = "FATURA_VL_MIN", table = "CFAPARAM")
    private String faturaVlMin;

    @Basic
    @Column(name = "PARCELA_EM_ABERTO", table = "CFAPARAM")
    private String parcelaEmAberto;

    @Basic
    @Column(name = "CAPITALIZA", table = "CFAPARAM")
    private String capitaliza;

    @Basic
    @Column(name = "BLOQUEIA_TIT", table = "CFAPARAM")
    private String bloqueiaTit;

    @Basic
    @Column(name = "BLOQUEIA_BOL", table = "CFAPARAM")
    private String bloqueiaBol;

    @Basic
    @Column(name = "BLOQUEIA_REQ", table = "CFAPARAM")
    private String bloqueiaReq;

    @Basic
    @Column(name = "BLOQUEIA_CHQ", table = "CFAPARAM")
    private String bloqueiaChq;

    @Basic(optional = false)
    @Column(name = "JUROS_FACTORY", table = "CFAPARAM", nullable = false)
    private double jurosFactory;

    @Basic
    @Column(name = "FUNCOES_MOBILE", table = "CFAPARAM", length = 18)
    private String funcoesMobile;

    public Integer getIdCfaparam() {
        return idCfaparam;
    }

    public void setIdCfaparam(Integer idCfaparam) {
        this.idCfaparam = idCfaparam;
    }

    public int getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(int idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfaclifoVende() {
        return idCfaclifoVende;
    }

    public void setIdCfaclifoVende(Integer idCfaclifoVende) {
        this.idCfaclifoVende = idCfaclifoVende;
    }

    public Integer getIdCfaclifoConvenio() {
        return idCfaclifoConvenio;
    }

    public void setIdCfaclifoConvenio(Integer idCfaclifoConvenio) {
        this.idCfaclifoConvenio = idCfaclifoConvenio;
    }

    public Integer getIdCfaclifoIndicou() {
        return idCfaclifoIndicou;
    }

    public void setIdCfaclifoIndicou(Integer idCfaclifoIndicou) {
        this.idCfaclifoIndicou = idCfaclifoIndicou;
    }

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
    }

    public Integer getIdCfatpcob() {
        return idCfatpcob;
    }

    public void setIdCfatpcob(Integer idCfatpcob) {
        this.idCfatpcob = idCfatpcob;
    }

    public Integer getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(Integer idCfaporta) {
        this.idCfaporta = idCfaporta;
    }

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public Integer getIdCbactcus() {
        return idCbactcus;
    }

    public void setIdCbactcus(Integer idCbactcus) {
        this.idCbactcus = idCbactcus;
    }

    public Integer getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(Integer idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public Integer getIdAeaforma() {
        return idAeaforma;
    }

    public void setIdAeaforma(Integer idAeaforma) {
        this.idAeaforma = idAeaforma;
    }

    public Integer getIdAeaplpgt() {
        return idAeaplpgt;
    }

    public void setIdAeaplpgt(Integer idAeaplpgt) {
        this.idAeaplpgt = idAeaplpgt;
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

    public String getVendeAtrazado() {
        return vendeAtrazado;
    }

    public void setVendeAtrazado(String vendeAtrazado) {
        this.vendeAtrazado = vendeAtrazado;
    }

    public String getDebitoEmConta() {
        return debitoEmConta;
    }

    public void setDebitoEmConta(String debitoEmConta) {
        this.debitoEmConta = debitoEmConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getDescAtacVista() {
        return descAtacVista;
    }

    public void setDescAtacVista(double descAtacVista) {
        this.descAtacVista = descAtacVista;
    }

    public double getDescAtacPrazo() {
        return descAtacPrazo;
    }

    public void setDescAtacPrazo(double descAtacPrazo) {
        this.descAtacPrazo = descAtacPrazo;
    }

    public double getDescVareVista() {
        return descVareVista;
    }

    public void setDescVareVista(double descVareVista) {
        this.descVareVista = descVareVista;
    }

    public double getDescVarePrazo() {
        return descVarePrazo;
    }

    public void setDescVarePrazo(double descVarePrazo) {
        this.descVarePrazo = descVarePrazo;
    }

    public double getDescServVista() {
        return descServVista;
    }

    public void setDescServVista(double descServVista) {
        this.descServVista = descServVista;
    }

    public double getDescServPrazo() {
        return descServPrazo;
    }

    public void setDescServPrazo(double descServPrazo) {
        this.descServPrazo = descServPrazo;
    }

    public String getDescPromocao() {
        return descPromocao;
    }

    public void setDescPromocao(String descPromocao) {
        this.descPromocao = descPromocao;
    }

    public int getDiaVencto1() {
        return diaVencto1;
    }

    public void setDiaVencto1(int diaVencto1) {
        this.diaVencto1 = diaVencto1;
    }

    public int getDiaVencto2() {
        return diaVencto2;
    }

    public void setDiaVencto2(int diaVencto2) {
        this.diaVencto2 = diaVencto2;
    }

    public int getDiaVencto3() {
        return diaVencto3;
    }

    public void setDiaVencto3(int diaVencto3) {
        this.diaVencto3 = diaVencto3;
    }

    public int getDiaVencto4() {
        return diaVencto4;
    }

    public void setDiaVencto4(int diaVencto4) {
        this.diaVencto4 = diaVencto4;
    }

    public int getDiaVenctoSemana1() {
        return diaVenctoSemana1;
    }

    public void setDiaVenctoSemana1(int diaVenctoSemana1) {
        this.diaVenctoSemana1 = diaVenctoSemana1;
    }

    public int getDiaVenctoSemana2() {
        return diaVenctoSemana2;
    }

    public void setDiaVenctoSemana2(int diaVenctoSemana2) {
        this.diaVenctoSemana2 = diaVenctoSemana2;
    }

    public int getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(int roteiro) {
        this.roteiro = roteiro;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public int getPosicaoRoteiro() {
        return posicaoRoteiro;
    }

    public void setPosicaoRoteiro(int posicaoRoteiro) {
        this.posicaoRoteiro = posicaoRoteiro;
    }

    public Date getDtUltCompra() {
        return dtUltCompra;
    }

    public void setDtUltCompra(Date dtUltCompra) {
        this.dtUltCompra = dtUltCompra;
    }

    public Date getDtUltVisita() {
        return dtUltVisita;
    }

    public void setDtUltVisita(Date dtUltVisita) {
        this.dtUltVisita = dtUltVisita;
    }

    public Date getDtUltEnvio() {
        return dtUltEnvio;
    }

    public void setDtUltEnvio(Date dtUltEnvio) {
        this.dtUltEnvio = dtUltEnvio;
    }

    public Date getDtUltRecebto() {
        return dtUltRecebto;
    }

    public void setDtUltRecebto(Date dtUltRecebto) {
        this.dtUltRecebto = dtUltRecebto;
    }

    public Date getDtProximoContato() {
        return dtProximoContato;
    }

    public void setDtProximoContato(Date dtProximoContato) {
        this.dtProximoContato = dtProximoContato;
    }

    public double getPercReducFatAtac() {
        return percReducFatAtac;
    }

    public void setPercReducFatAtac(double percReducFatAtac) {
        this.percReducFatAtac = percReducFatAtac;
    }

    public double getPercReducFatVare() {
        return percReducFatVare;
    }

    public void setPercReducFatVare(double percReducFatVare) {
        this.percReducFatVare = percReducFatVare;
    }

    public double getValorMinimoAgrup() {
        return valorMinimoAgrup;
    }

    public void setValorMinimoAgrup(double valorMinimoAgrup) {
        this.valorMinimoAgrup = valorMinimoAgrup;
    }

    public double getValorMaximoAgrup() {
        return valorMaximoAgrup;
    }

    public void setValorMaximoAgrup(double valorMaximoAgrup) {
        this.valorMaximoAgrup = valorMaximoAgrup;
    }

    public int getDiasAtrazo() {
        return diasAtrazo;
    }

    public void setDiasAtrazo(int diasAtrazo) {
        this.diasAtrazo = diasAtrazo;
    }

    public int getDiasCarencia() {
        return diasCarencia;
    }

    public void setDiasCarencia(int diasCarencia) {
        this.diasCarencia = diasCarencia;
    }

    public double getJurosDiario() {
        return jurosDiario;
    }

    public void setJurosDiario(double jurosDiario) {
        this.jurosDiario = jurosDiario;
    }

    public String getAtacadoVarejo() {
        return atacadoVarejo;
    }

    public void setAtacadoVarejo(String atacadoVarejo) {
        this.atacadoVarejo = atacadoVarejo;
    }

    public String getVistaPrazo() {
        return vistaPrazo;
    }

    public void setVistaPrazo(String vistaPrazo) {
        this.vistaPrazo = vistaPrazo;
    }

    public String getFaturaVlMin() {
        return faturaVlMin;
    }

    public void setFaturaVlMin(String faturaVlMin) {
        this.faturaVlMin = faturaVlMin;
    }

    public String getParcelaEmAberto() {
        return parcelaEmAberto;
    }

    public void setParcelaEmAberto(String parcelaEmAberto) {
        this.parcelaEmAberto = parcelaEmAberto;
    }

    public String getCapitaliza() {
        return capitaliza;
    }

    public void setCapitaliza(String capitaliza) {
        this.capitaliza = capitaliza;
    }

    public String getBloqueiaTit() {
        return bloqueiaTit;
    }

    public void setBloqueiaTit(String bloqueiaTit) {
        this.bloqueiaTit = bloqueiaTit;
    }

    public String getBloqueiaBol() {
        return bloqueiaBol;
    }

    public void setBloqueiaBol(String bloqueiaBol) {
        this.bloqueiaBol = bloqueiaBol;
    }

    public String getBloqueiaReq() {
        return bloqueiaReq;
    }

    public void setBloqueiaReq(String bloqueiaReq) {
        this.bloqueiaReq = bloqueiaReq;
    }

    public String getBloqueiaChq() {
        return bloqueiaChq;
    }

    public void setBloqueiaChq(String bloqueiaChq) {
        this.bloqueiaChq = bloqueiaChq;
    }

    public double getJurosFactory() {
        return jurosFactory;
    }

    public void setJurosFactory(double jurosFactory) {
        this.jurosFactory = jurosFactory;
    }

    public String getFuncoesMobile() {
        return funcoesMobile;
    }

    public void setFuncoesMobile(String funcoesMobile) {
        this.funcoesMobile = funcoesMobile;
    }

}