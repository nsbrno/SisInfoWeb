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
@Table(name = "AEAMARCA")
public class AeamarcaEntity {

    @Id
    @Column(name = "ID_AEAMARCA", table = "AEAMARCA", nullable = false)
    private Integer idAeamarca;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "AEAMARCA")
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAMARCA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAMARCA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAMARCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAMARCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAMARCA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAMARCA", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "LISTA", table = "AEAMARCA", length = 20)
    private String lista;

    @Basic(optional = false)
    @Column(name = "FRETE", table = "AEAMARCA", nullable = false)
    private double frete;

    @Basic(optional = false)
    @Column(name = "SUFRAMA", table = "AEAMARCA", nullable = false)
    private double suframa;

    @Basic(optional = false)
    @Column(name = "AUMENTO_LINEAR", table = "AEAMARCA", nullable = false)
    private double aumentoLinear;

    @Basic(optional = false)
    @Column(name = "MARGEM", table = "AEAMARCA", nullable = false)
    private double margem;

    @Basic
    @Column(name = "ATUALIZADO_EM", table = "AEAMARCA")
    @Temporal(TemporalType.DATE)
    private Date atualizadoEm;

    @Basic(optional = false)
    @Column(name = "DESCONTO1", table = "AEAMARCA", nullable = false)
    private double desconto1;

    @Basic(optional = false)
    @Column(name = "DESCONTO2", table = "AEAMARCA", nullable = false)
    private double desconto2;

    @Basic(optional = false)
    @Column(name = "DESCONTO3", table = "AEAMARCA", nullable = false)
    private double desconto3;

    @Basic(optional = false)
    @Column(name = "DESCONTO4", table = "AEAMARCA", nullable = false)
    private double desconto4;

    @Basic(optional = false)
    @Column(name = "DESCONTO5", table = "AEAMARCA", nullable = false)
    private double desconto5;

    @Basic(optional = false)
    @Column(name = "DESCONTO6", table = "AEAMARCA", nullable = false)
    private double desconto6;

    @Basic(optional = false)
    @Column(name = "DESCONTO7", table = "AEAMARCA", nullable = false)
    private double desconto7;

    @Basic(optional = false)
    @Column(name = "DESCONTO8", table = "AEAMARCA", nullable = false)
    private double desconto8;

    @Basic(optional = false)
    @Column(name = "DESCONTO9", table = "AEAMARCA", nullable = false)
    private double desconto9;

    @Basic(optional = false)
    @Column(name = "DESCONTO10", table = "AEAMARCA", nullable = false)
    private double desconto10;

    @Basic(optional = false)
    @Column(name = "FATOR_FOB", table = "AEAMARCA", nullable = false)
    private double fatorFob;

    @Basic(optional = false)
    @Column(name = "FATOR_REAL", table = "AEAMARCA", nullable = false)
    private double fatorReal;

    @Basic(optional = false)
    @Column(name = "FATOR_REP", table = "AEAMARCA", nullable = false)
    private double fatorRep;

    @Basic(optional = false)
    @Column(name = "FATOR_VENDA", table = "AEAMARCA", nullable = false)
    private double fatorVenda;

    public Integer getIdAeamarca() {
        return idAeamarca;
    }

    public void setIdAeamarca(Integer idAeamarca) {
        this.idAeamarca = idAeamarca;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getSuframa() {
        return suframa;
    }

    public void setSuframa(double suframa) {
        this.suframa = suframa;
    }

    public double getAumentoLinear() {
        return aumentoLinear;
    }

    public void setAumentoLinear(double aumentoLinear) {
        this.aumentoLinear = aumentoLinear;
    }

    public double getMargem() {
        return margem;
    }

    public void setMargem(double margem) {
        this.margem = margem;
    }

    public Date getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(Date atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }

    public double getDesconto1() {
        return desconto1;
    }

    public void setDesconto1(double desconto1) {
        this.desconto1 = desconto1;
    }

    public double getDesconto2() {
        return desconto2;
    }

    public void setDesconto2(double desconto2) {
        this.desconto2 = desconto2;
    }

    public double getDesconto3() {
        return desconto3;
    }

    public void setDesconto3(double desconto3) {
        this.desconto3 = desconto3;
    }

    public double getDesconto4() {
        return desconto4;
    }

    public void setDesconto4(double desconto4) {
        this.desconto4 = desconto4;
    }

    public double getDesconto5() {
        return desconto5;
    }

    public void setDesconto5(double desconto5) {
        this.desconto5 = desconto5;
    }

    public double getDesconto6() {
        return desconto6;
    }

    public void setDesconto6(double desconto6) {
        this.desconto6 = desconto6;
    }

    public double getDesconto7() {
        return desconto7;
    }

    public void setDesconto7(double desconto7) {
        this.desconto7 = desconto7;
    }

    public double getDesconto8() {
        return desconto8;
    }

    public void setDesconto8(double desconto8) {
        this.desconto8 = desconto8;
    }

    public double getDesconto9() {
        return desconto9;
    }

    public void setDesconto9(double desconto9) {
        this.desconto9 = desconto9;
    }

    public double getDesconto10() {
        return desconto10;
    }

    public void setDesconto10(double desconto10) {
        this.desconto10 = desconto10;
    }

    public double getFatorFob() {
        return fatorFob;
    }

    public void setFatorFob(double fatorFob) {
        this.fatorFob = fatorFob;
    }

    public double getFatorReal() {
        return fatorReal;
    }

    public void setFatorReal(double fatorReal) {
        this.fatorReal = fatorReal;
    }

    public double getFatorRep() {
        return fatorRep;
    }

    public void setFatorRep(double fatorRep) {
        this.fatorRep = fatorRep;
    }

    public double getFatorVenda() {
        return fatorVenda;
    }

    public void setFatorVenda(double fatorVenda) {
        this.fatorVenda = fatorVenda;
    }

}