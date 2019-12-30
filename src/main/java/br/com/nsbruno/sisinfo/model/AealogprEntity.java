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
@Table(name = "AEALOGPR")
public class AealogprEntity {

    @Id
    @Column(name = "ID_AEALOGPR", table = "AEALOGPR", nullable = false)
    private Integer idAealogpr;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLOJA", table = "AEALOGPR", nullable = false)
    private Integer idAeaploja;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEALOGPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEALOGPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEALOGPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEALOGPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEALOGPR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CT_REPOSICAO_N", table = "AEALOGPR", nullable = false)
    private double ctReposicaoN;

    @Basic(optional = false)
    @Column(name = "CT_REPOSICAO_D", table = "AEALOGPR", nullable = false)
    private double ctReposicaoD;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_N", table = "AEALOGPR", nullable = false)
    private double ctMedioN;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_COMP_N", table = "AEALOGPR", nullable = false)
    private double ctMedioCompN;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_D", table = "AEALOGPR", nullable = false)
    private double ctMedioD;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_CND", table = "AEALOGPR", nullable = false)
    private double ctMedioCnd;

    @Basic(optional = false)
    @Column(name = "CT_REAL_N", table = "AEALOGPR", nullable = false)
    private double ctRealN;

    @Basic(optional = false)
    @Column(name = "CT_COMPLETO_N", table = "AEALOGPR", nullable = false)
    private double ctCompletoN;

    @Basic(optional = false)
    @Column(name = "CT_REAL_D", table = "AEALOGPR", nullable = false)
    private double ctRealD;

    @Basic(optional = false)
    @Column(name = "VENDA_ATAC", table = "AEALOGPR", nullable = false)
    private double vendaAtac;

    @Basic(optional = false)
    @Column(name = "VENDA_VARE", table = "AEALOGPR", nullable = false)
    private double vendaVare;

    @Basic(optional = false)
    @Column(name = "PRECO_TABELA", table = "AEALOGPR", nullable = false)
    private double precoTabela;

    @Basic(optional = false)
    @Column(name = "CT_REPOSICAO_N_NEW", table = "AEALOGPR", nullable = false)
    private double ctReposicaoNNew;

    @Basic(optional = false)
    @Column(name = "CT_REPOSICAO_D_NEW", table = "AEALOGPR", nullable = false)
    private double ctReposicaoDNew;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_N_NEW", table = "AEALOGPR", nullable = false)
    private double ctMedioNNew;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_COMP_N_NEW", table = "AEALOGPR", nullable = false)
    private double ctMedioCompNNew;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_D_NEW", table = "AEALOGPR", nullable = false)
    private double ctMedioDNew;

    @Basic(optional = false)
    @Column(name = "CT_MEDIO_CND_NEW", table = "AEALOGPR", nullable = false)
    private double ctMedioCndNew;

    @Basic(optional = false)
    @Column(name = "CT_REAL_N_NEW", table = "AEALOGPR", nullable = false)
    private double ctRealNNew;

    @Basic(optional = false)
    @Column(name = "CT_COMPLETO_N_NEW", table = "AEALOGPR", nullable = false)
    private double ctCompletoNNew;

    @Basic(optional = false)
    @Column(name = "CT_REAL_D_NEW", table = "AEALOGPR", nullable = false)
    private double ctRealDNew;

    @Basic(optional = false)
    @Column(name = "VENDA_ATAC_NEW", table = "AEALOGPR", nullable = false)
    private double vendaAtacNew;

    @Basic(optional = false)
    @Column(name = "VENDA_VARE_NEW", table = "AEALOGPR", nullable = false)
    private double vendaVareNew;

    @Basic(optional = false)
    @Column(name = "PRECO_TABELA_NEW", table = "AEALOGPR", nullable = false)
    private double precoTabelaNew;

    public Integer getIdAealogpr() {
        return idAealogpr;
    }

    public void setIdAealogpr(Integer idAealogpr) {
        this.idAealogpr = idAealogpr;
    }

    public Integer getIdAeaploja() {
        return idAeaploja;
    }

    public void setIdAeaploja(Integer idAeaploja) {
        this.idAeaploja = idAeaploja;
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

    public double getCtReposicaoN() {
        return ctReposicaoN;
    }

    public void setCtReposicaoN(double ctReposicaoN) {
        this.ctReposicaoN = ctReposicaoN;
    }

    public double getCtReposicaoD() {
        return ctReposicaoD;
    }

    public void setCtReposicaoD(double ctReposicaoD) {
        this.ctReposicaoD = ctReposicaoD;
    }

    public double getCtMedioN() {
        return ctMedioN;
    }

    public void setCtMedioN(double ctMedioN) {
        this.ctMedioN = ctMedioN;
    }

    public double getCtMedioCompN() {
        return ctMedioCompN;
    }

    public void setCtMedioCompN(double ctMedioCompN) {
        this.ctMedioCompN = ctMedioCompN;
    }

    public double getCtMedioD() {
        return ctMedioD;
    }

    public void setCtMedioD(double ctMedioD) {
        this.ctMedioD = ctMedioD;
    }

    public double getCtMedioCnd() {
        return ctMedioCnd;
    }

    public void setCtMedioCnd(double ctMedioCnd) {
        this.ctMedioCnd = ctMedioCnd;
    }

    public double getCtRealN() {
        return ctRealN;
    }

    public void setCtRealN(double ctRealN) {
        this.ctRealN = ctRealN;
    }

    public double getCtCompletoN() {
        return ctCompletoN;
    }

    public void setCtCompletoN(double ctCompletoN) {
        this.ctCompletoN = ctCompletoN;
    }

    public double getCtRealD() {
        return ctRealD;
    }

    public void setCtRealD(double ctRealD) {
        this.ctRealD = ctRealD;
    }

    public double getVendaAtac() {
        return vendaAtac;
    }

    public void setVendaAtac(double vendaAtac) {
        this.vendaAtac = vendaAtac;
    }

    public double getVendaVare() {
        return vendaVare;
    }

    public void setVendaVare(double vendaVare) {
        this.vendaVare = vendaVare;
    }

    public double getPrecoTabela() {
        return precoTabela;
    }

    public void setPrecoTabela(double precoTabela) {
        this.precoTabela = precoTabela;
    }

    public double getCtReposicaoNNew() {
        return ctReposicaoNNew;
    }

    public void setCtReposicaoNNew(double ctReposicaoNNew) {
        this.ctReposicaoNNew = ctReposicaoNNew;
    }

    public double getCtReposicaoDNew() {
        return ctReposicaoDNew;
    }

    public void setCtReposicaoDNew(double ctReposicaoDNew) {
        this.ctReposicaoDNew = ctReposicaoDNew;
    }

    public double getCtMedioNNew() {
        return ctMedioNNew;
    }

    public void setCtMedioNNew(double ctMedioNNew) {
        this.ctMedioNNew = ctMedioNNew;
    }

    public double getCtMedioCompNNew() {
        return ctMedioCompNNew;
    }

    public void setCtMedioCompNNew(double ctMedioCompNNew) {
        this.ctMedioCompNNew = ctMedioCompNNew;
    }

    public double getCtMedioDNew() {
        return ctMedioDNew;
    }

    public void setCtMedioDNew(double ctMedioDNew) {
        this.ctMedioDNew = ctMedioDNew;
    }

    public double getCtMedioCndNew() {
        return ctMedioCndNew;
    }

    public void setCtMedioCndNew(double ctMedioCndNew) {
        this.ctMedioCndNew = ctMedioCndNew;
    }

    public double getCtRealNNew() {
        return ctRealNNew;
    }

    public void setCtRealNNew(double ctRealNNew) {
        this.ctRealNNew = ctRealNNew;
    }

    public double getCtCompletoNNew() {
        return ctCompletoNNew;
    }

    public void setCtCompletoNNew(double ctCompletoNNew) {
        this.ctCompletoNNew = ctCompletoNNew;
    }

    public double getCtRealDNew() {
        return ctRealDNew;
    }

    public void setCtRealDNew(double ctRealDNew) {
        this.ctRealDNew = ctRealDNew;
    }

    public double getVendaAtacNew() {
        return vendaAtacNew;
    }

    public void setVendaAtacNew(double vendaAtacNew) {
        this.vendaAtacNew = vendaAtacNew;
    }

    public double getVendaVareNew() {
        return vendaVareNew;
    }

    public void setVendaVareNew(double vendaVareNew) {
        this.vendaVareNew = vendaVareNew;
    }

    public double getPrecoTabelaNew() {
        return precoTabelaNew;
    }

    public void setPrecoTabelaNew(double precoTabelaNew) {
        this.precoTabelaNew = precoTabelaNew;
    }

}