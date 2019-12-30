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
@Table(name = "AEAPLPGT")
public class AeaplpgtEntity {

    @Id
    @Column(name = "ID_AEAPLPGT", table = "AEAPLPGT", nullable = false)
    private Integer idAeaplpgt;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEAPLPGT", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "AEAPLPGT")
    private Integer idCfamoeda;

    @Basic
    @Column(name = "ID_CFATPDOC", table = "AEAPLPGT")
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_AEAPLPGT_EQUIVALENTE", table = "AEAPLPGT")
    private Integer idAeaplpgtEquivalente;

    @Basic
    @Column(name = "ID_AEAFORMA", table = "AEAPLPGT")
    private Integer idAeaforma;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPLPGT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPLPGT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPLPGT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPLPGT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPLPGT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAPLPGT", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAPLPGT", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAPLPGT", nullable = false)
    private String ativo;

    @Basic(optional = false)
    @Column(name = "ORIGEM_VALOR", table = "AEAPLPGT", nullable = false)
    private String origemValor;

    @Basic(optional = false)
    @Column(name = "ATAC_VAREJO", table = "AEAPLPGT", nullable = false)
    private String atacVarejo;

    @Basic(optional = false)
    @Column(name = "VISTA_PRAZO", table = "AEAPLPGT", nullable = false)
    private String vistaPrazo;

    @Basic(optional = false)
    @Column(name = "COMISSAO", table = "AEAPLPGT", nullable = false)
    private String comissao;

    @Basic(optional = false)
    @Column(name = "PERC_DESC_COMISSAO", table = "AEAPLPGT", nullable = false)
    private double percDescComissao;

    @Basic(optional = false)
    @Column(name = "PERC_DESC_ATAC", table = "AEAPLPGT", nullable = false)
    private double percDescAtac;

    @Basic(optional = false)
    @Column(name = "PERC_DESC_VARE", table = "AEAPLPGT", nullable = false)
    private double percDescVare;

    @Basic(optional = false)
    @Column(name = "PERC_DESC_SERV", table = "AEAPLPGT", nullable = false)
    private double percDescServ;

    @Basic
    @Column(name = "DESC_PROMOCAO", table = "AEAPLPGT")
    private String descPromocao;

    @Basic(optional = false)
    @Column(name = "PERC_ENTRADA", table = "AEAPLPGT", nullable = false)
    private double percEntrada;

    @Basic(optional = false)
    @Column(name = "DIAS_ENTRADA", table = "AEAPLPGT", nullable = false)
    private Integer diasEntrada;

    @Basic(optional = false)
    @Column(name = "QTDE_PARCELAS1", table = "AEAPLPGT", nullable = false)
    private Integer qtdeParcelas1;

    @Basic(optional = false)
    @Column(name = "DIAS_PARCELAS1", table = "AEAPLPGT", nullable = false)
    private Integer diasParcelas1;

    @Basic(optional = false)
    @Column(name = "QTDE_PARCELAS2", table = "AEAPLPGT", nullable = false)
    private Integer qtdeParcelas2;

    @Basic(optional = false)
    @Column(name = "DIAS_PARCELAS2", table = "AEAPLPGT", nullable = false)
    private Integer diasParcelas2;

    @Basic(optional = false)
    @Column(name = "QTDE_PARCELAS3", table = "AEAPLPGT", nullable = false)
    private Integer qtdeParcelas3;

    @Basic(optional = false)
    @Column(name = "DIAS_PARCELAS3", table = "AEAPLPGT", nullable = false)
    private Integer diasParcelas3;

    @Basic(optional = false)
    @Column(name = "JURO_MEDIO_ATAC", table = "AEAPLPGT", nullable = false)
    private double juroMedioAtac;

    @Basic(optional = false)
    @Column(name = "JURO_MEDIO_VARE", table = "AEAPLPGT", nullable = false)
    private double juroMedioVare;

    @Basic(optional = false)
    @Column(name = "JURO_MEDIO_SERV", table = "AEAPLPGT", nullable = false)
    private double juroMedioServ;

    @Basic
    @Column(name = "JURO_MEDIO_LOCAL", table = "AEAPLPGT", length = 18)
    private String juroMedioLocal;

    @Basic(optional = false)
    @Column(name = "PERC_COM_ATAC", table = "AEAPLPGT", nullable = false)
    private double percComAtac;

    @Basic(optional = false)
    @Column(name = "PERC_COM_VARE", table = "AEAPLPGT", nullable = false)
    private double percComVare;

    @Basic(optional = false)
    @Column(name = "PERC_COM_SERV", table = "AEAPLPGT", nullable = false)
    private double percComServ;

    @Basic
    @Column(name = "PERC_COM_LOCAL", table = "AEAPLPGT", length = 18)
    private String percComLocal;

    @Basic(optional = false)
    @Column(name = "TEM_REGRAS", table = "AEAPLPGT", nullable = false)
    private short temRegras;

    @Basic
    @Column(name = "ENVIA_PALM", table = "AEAPLPGT")
    private String enviaPalm;

    public Integer getIdAeaplpgt() {
        return idAeaplpgt;
    }

    public void setIdAeaplpgt(Integer idAeaplpgt) {
        this.idAeaplpgt = idAeaplpgt;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
    }

    public Integer getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(Integer idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public Integer getIdAeaplpgtEquivalente() {
        return idAeaplpgtEquivalente;
    }

    public void setIdAeaplpgtEquivalente(Integer idAeaplpgtEquivalente) {
        this.idAeaplpgtEquivalente = idAeaplpgtEquivalente;
    }

    public Integer getIdAeaforma() {
        return idAeaforma;
    }

    public void setIdAeaforma(Integer idAeaforma) {
        this.idAeaforma = idAeaforma;
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

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getOrigemValor() {
        return origemValor;
    }

    public void setOrigemValor(String origemValor) {
        this.origemValor = origemValor;
    }

    public String getAtacVarejo() {
        return atacVarejo;
    }

    public void setAtacVarejo(String atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public String getVistaPrazo() {
        return vistaPrazo;
    }

    public void setVistaPrazo(String vistaPrazo) {
        this.vistaPrazo = vistaPrazo;
    }

    public String getComissao() {
        return comissao;
    }

    public void setComissao(String comissao) {
        this.comissao = comissao;
    }

    public double getPercDescComissao() {
        return percDescComissao;
    }

    public void setPercDescComissao(double percDescComissao) {
        this.percDescComissao = percDescComissao;
    }

    public double getPercDescAtac() {
        return percDescAtac;
    }

    public void setPercDescAtac(double percDescAtac) {
        this.percDescAtac = percDescAtac;
    }

    public double getPercDescVare() {
        return percDescVare;
    }

    public void setPercDescVare(double percDescVare) {
        this.percDescVare = percDescVare;
    }

    public double getPercDescServ() {
        return percDescServ;
    }

    public void setPercDescServ(double percDescServ) {
        this.percDescServ = percDescServ;
    }

    public String getDescPromocao() {
        return descPromocao;
    }

    public void setDescPromocao(String descPromocao) {
        this.descPromocao = descPromocao;
    }

    public double getPercEntrada() {
        return percEntrada;
    }

    public void setPercEntrada(double percEntrada) {
        this.percEntrada = percEntrada;
    }

    public Integer getDiasEntrada() {
        return diasEntrada;
    }

    public void setDiasEntrada(Integer diasEntrada) {
        this.diasEntrada = diasEntrada;
    }

    public Integer getQtdeParcelas1() {
        return qtdeParcelas1;
    }

    public void setQtdeParcelas1(Integer qtdeParcelas1) {
        this.qtdeParcelas1 = qtdeParcelas1;
    }

    public Integer getDiasParcelas1() {
        return diasParcelas1;
    }

    public void setDiasParcelas1(Integer diasParcelas1) {
        this.diasParcelas1 = diasParcelas1;
    }

    public Integer getQtdeParcelas2() {
        return qtdeParcelas2;
    }

    public void setQtdeParcelas2(Integer qtdeParcelas2) {
        this.qtdeParcelas2 = qtdeParcelas2;
    }

    public Integer getDiasParcelas2() {
        return diasParcelas2;
    }

    public void setDiasParcelas2(Integer diasParcelas2) {
        this.diasParcelas2 = diasParcelas2;
    }

    public Integer getQtdeParcelas3() {
        return qtdeParcelas3;
    }

    public void setQtdeParcelas3(Integer qtdeParcelas3) {
        this.qtdeParcelas3 = qtdeParcelas3;
    }

    public Integer getDiasParcelas3() {
        return diasParcelas3;
    }

    public void setDiasParcelas3(Integer diasParcelas3) {
        this.diasParcelas3 = diasParcelas3;
    }

    public double getJuroMedioAtac() {
        return juroMedioAtac;
    }

    public void setJuroMedioAtac(double juroMedioAtac) {
        this.juroMedioAtac = juroMedioAtac;
    }

    public double getJuroMedioVare() {
        return juroMedioVare;
    }

    public void setJuroMedioVare(double juroMedioVare) {
        this.juroMedioVare = juroMedioVare;
    }

    public double getJuroMedioServ() {
        return juroMedioServ;
    }

    public void setJuroMedioServ(double juroMedioServ) {
        this.juroMedioServ = juroMedioServ;
    }

    public String getJuroMedioLocal() {
        return juroMedioLocal;
    }

    public void setJuroMedioLocal(String juroMedioLocal) {
        this.juroMedioLocal = juroMedioLocal;
    }

    public double getPercComAtac() {
        return percComAtac;
    }

    public void setPercComAtac(double percComAtac) {
        this.percComAtac = percComAtac;
    }

    public double getPercComVare() {
        return percComVare;
    }

    public void setPercComVare(double percComVare) {
        this.percComVare = percComVare;
    }

    public double getPercComServ() {
        return percComServ;
    }

    public void setPercComServ(double percComServ) {
        this.percComServ = percComServ;
    }

    public String getPercComLocal() {
        return percComLocal;
    }

    public void setPercComLocal(String percComLocal) {
        this.percComLocal = percComLocal;
    }

    public short getTemRegras() {
        return temRegras;
    }

    public void setTemRegras(short temRegras) {
        this.temRegras = temRegras;
    }

    public String getEnviaPalm() {
        return enviaPalm;
    }

    public void setEnviaPalm(String enviaPalm) {
        this.enviaPalm = enviaPalm;
    }

}