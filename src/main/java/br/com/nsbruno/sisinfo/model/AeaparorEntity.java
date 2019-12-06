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
@Table(name = "AEAPAROR")
public class AeaparorEntity {

    @Id
    @Column(name = "ID_AEAPAROR", table = "AEAPAROR", nullable = false)
    private Integer idAeaparor;

    @Basic(optional = false)
    @Column(name = "ID_AEAORCAM", table = "AEAPAROR", nullable = false)
    private int idAeaorcam;

    @Basic(optional = false)
    @Column(name = "ID_CFATPDOC", table = "AEAPAROR", nullable = false)
    private int idCfatpdoc;

    @Basic(optional = false)
    @Column(name = "ID_CFAPORTA", table = "AEAPAROR", nullable = false)
    private int idCfaporta;

    @Basic(optional = false)
    @Column(name = "ID_CFATPCOB", table = "AEAPAROR", nullable = false)
    private int idCfatpcob;

    @Basic
    @Column(name = "ID_CFAESTAD_ORGAO", table = "AEAPAROR")
    private Integer idCfaestadOrgao;

    @Basic
    @Column(name = "ID_CFACCRED", table = "AEAPAROR")
    private Integer idCfaccred;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "AEAPAROR")
    private Integer idCfamoeda;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPAROR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPAROR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPAROR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPAROR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPAROR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "PARCELA", table = "AEAPAROR", nullable = false)
    private int parcela;

    @Basic
    @Column(name = "DT_EMISSAO", table = "AEAPAROR")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_VENCIMENTO", table = "AEAPAROR")
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Basic(optional = false)
    @Column(name = "VL_PARCELA", table = "AEAPAROR", nullable = false)
    private double vlParcela;

    @Basic(optional = false)
    @Column(name = "VL_DIF_PARCELA", table = "AEAPAROR", nullable = false)
    private double vlDifParcela;

    @Basic(optional = false)
    @Column(name = "AGENCIA", table = "AEAPAROR", nullable = false)
    private int agencia;

    @Basic
    @Column(name = "DG_AG", table = "AEAPAROR")
    private String dgAg;

    @Basic
    @Column(name = "CONTA", table = "AEAPAROR")
    private Integer conta;

    @Basic
    @Column(name = "DG_CT", table = "AEAPAROR", length = 2)
    private String dgCt;

    @Basic
    @Column(name = "SERIE", table = "AEAPAROR", length = 6)
    private String serie;

    @Basic
    @Column(name = "NUMERO", table = "AEAPAROR", length = 20)
    private String numero;

    @Basic
    @Column(name = "CONTROLE", table = "AEAPAROR", length = 20)
    private String controle;

    @Basic
    @Column(name = "NOME", table = "AEAPAROR", length = 60)
    private String nome;

    @Basic
    @Column(name = "CPF_CGC", table = "AEAPAROR", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "IE_RG", table = "AEAPAROR", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "ORGAO_EMISSOR", table = "AEAPAROR", length = 3)
    private String orgaoEmissor;

    public Integer getIdAeaparor() {
        return idAeaparor;
    }

    public void setIdAeaparor(Integer idAeaparor) {
        this.idAeaparor = idAeaparor;
    }

    public int getIdAeaorcam() {
        return idAeaorcam;
    }

    public void setIdAeaorcam(int idAeaorcam) {
        this.idAeaorcam = idAeaorcam;
    }

    public int getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(int idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public int getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(int idCfaporta) {
        this.idCfaporta = idCfaporta;
    }

    public int getIdCfatpcob() {
        return idCfatpcob;
    }

    public void setIdCfatpcob(int idCfatpcob) {
        this.idCfatpcob = idCfatpcob;
    }

    public Integer getIdCfaestadOrgao() {
        return idCfaestadOrgao;
    }

    public void setIdCfaestadOrgao(Integer idCfaestadOrgao) {
        this.idCfaestadOrgao = idCfaestadOrgao;
    }

    public Integer getIdCfaccred() {
        return idCfaccred;
    }

    public void setIdCfaccred(Integer idCfaccred) {
        this.idCfaccred = idCfaccred;
    }

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
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

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
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

    public double getVlParcela() {
        return vlParcela;
    }

    public void setVlParcela(double vlParcela) {
        this.vlParcela = vlParcela;
    }

    public double getVlDifParcela() {
        return vlDifParcela;
    }

    public void setVlDifParcela(double vlDifParcela) {
        this.vlDifParcela = vlDifParcela;
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

}