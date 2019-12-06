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
@Table(name = "RPATMP02")
public class Rpatmp02Entity {

    @Id
    @Column(name = "ID_RPATMP02", table = "RPATMP02", nullable = false)
    private Integer idRpatmp02;

    @Basic
    @Column(name = "ID_CFATPDOC", table = "RPATMP02")
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_CFATPCOB", table = "RPATMP02")
    private Integer idCfatpcob;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "RPATMP02")
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CFACCRED", table = "RPATMP02")
    private Integer idCfaccred;

    @Basic
    @Column(name = "ID_CFAESTAD_ORGAO", table = "RPATMP02")
    private Integer idCfaestadOrgao;

    @Basic
    @Column(name = "CHAVE_ID", table = "RPATMP02")
    private Integer chaveId;

    @Basic(optional = false)
    @Column(name = "DIAS", table = "RPATMP02", nullable = false)
    private int dias;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "RPATMP02", nullable = false)
    private double valor;

    @Basic
    @Column(name = "DATA", table = "RPATMP02")
    @Temporal(TemporalType.DATE)
    private Date data;

    @Basic
    @Column(name = "ID_AUX1", table = "RPATMP02")
    private Integer idAux1;

    @Basic
    @Column(name = "AGENCIA", table = "RPATMP02")
    private Integer agencia;

    @Basic
    @Column(name = "DG_AG", table = "RPATMP02")
    private String dgAg;

    @Basic
    @Column(name = "CONTA", table = "RPATMP02")
    private Integer conta;

    @Basic
    @Column(name = "DG_CT", table = "RPATMP02", length = 2)
    private String dgCt;

    @Basic
    @Column(name = "SERIE", table = "RPATMP02", length = 6)
    private String serie;

    @Basic
    @Column(name = "NUMERO", table = "RPATMP02", length = 20)
    private String numero;

    @Basic
    @Column(name = "CONTROLE", table = "RPATMP02", length = 40)
    private String controle;

    @Basic
    @Column(name = "NOME", table = "RPATMP02", length = 60)
    private String nome;

    @Basic
    @Column(name = "CPF_CGC", table = "RPATMP02", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "IE_RG", table = "RPATMP02", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "ORGAO_EMISSOR", table = "RPATMP02", length = 3)
    private String orgaoEmissor;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPATMP02")
    private byte[] obs;

    public Integer getIdRpatmp02() {
        return idRpatmp02;
    }

    public void setIdRpatmp02(Integer idRpatmp02) {
        this.idRpatmp02 = idRpatmp02;
    }

    public Integer getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(Integer idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
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

    public Integer getIdCfaccred() {
        return idCfaccred;
    }

    public void setIdCfaccred(Integer idCfaccred) {
        this.idCfaccred = idCfaccred;
    }

    public Integer getIdCfaestadOrgao() {
        return idCfaestadOrgao;
    }

    public void setIdCfaestadOrgao(Integer idCfaestadOrgao) {
        this.idCfaestadOrgao = idCfaestadOrgao;
    }

    public Integer getChaveId() {
        return chaveId;
    }

    public void setChaveId(Integer chaveId) {
        this.chaveId = chaveId;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getIdAux1() {
        return idAux1;
    }

    public void setIdAux1(Integer idAux1) {
        this.idAux1 = idAux1;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
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

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}