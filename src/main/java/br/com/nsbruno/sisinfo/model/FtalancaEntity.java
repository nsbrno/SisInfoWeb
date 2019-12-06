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
@Table(name = "FTALANCA")
public class FtalancaEntity {

    @Id
    @Column(name = "ID_FTALANCA", table = "FTALANCA", nullable = false)
    private Integer idFtalanca;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "FTALANCA")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "FTALANCA")
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CFATPCOB", table = "FTALANCA")
    private Integer idCfatpcob;

    @Basic(optional = false)
    @Column(name = "GUID", table = "FTALANCA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "FTALANCA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "FTALANCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "FTALANCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "FTALANCA")
    private Integer ctInteg;

    @Basic
    @Column(name = "AGENCIA", table = "FTALANCA")
    private Integer agencia;

    @Basic
    @Column(name = "DG_AG", table = "FTALANCA")
    private String dgAg;

    @Basic
    @Column(name = "CONTA", table = "FTALANCA")
    private Integer conta;

    @Basic
    @Column(name = "DG_CT", table = "FTALANCA")
    private String dgCt;

    @Basic
    @Column(name = "NUMERO_DOC", table = "FTALANCA")
    private Integer numeroDoc;

    @Basic
    @Column(name = "DG_NU", table = "FTALANCA")
    private String dgNu;

    @Basic
    @Column(name = "VARIACAO", table = "FTALANCA", length = 3)
    private String variacao;

    @Basic
    @Column(name = "CONTROLE", table = "FTALANCA", length = 40)
    private String controle;

    @Basic(optional = false)
    @Column(name = "VL_CPMF", table = "FTALANCA", nullable = false)
    private double vlCpmf;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "FTALANCA", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_DOCUMENTO", table = "FTALANCA", nullable = false)
    private double vlDocumento;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS", table = "FTALANCA", nullable = false)
    private double vlOutros;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "FTALANCA", nullable = false)
    private double vlJuros;

    @Basic
    @Column(name = "FC_VL_ACERTO", table = "FTALANCA", precision = 15)
    private Double fcVlAcerto;

    @Basic
    @Column(name = "GRUPO", table = "FTALANCA")
    private Integer grupo;

    @Basic(optional = false)
    @Column(name = "PERC_CPMF", table = "FTALANCA", nullable = false)
    private double percCpmf;

    @Basic
    @Column(name = "DT_EMISSAO", table = "FTALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_VENCIMENTO", table = "FTALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Basic
    @Column(name = "DT_COMPENSACAO", table = "FTALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtCompensacao;

    @Basic
    @Column(name = "DT_DEPOSITO", table = "FTALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtDeposito;

    @Lob
    @Basic
    @Column(name = "OBS", table = "FTALANCA")
    private byte[] obs;

    @Basic
    @Column(name = "AVALISTA", table = "FTALANCA", length = 60)
    private String avalista;

    @Basic
    @Column(name = "AVALISTA_FONE", table = "FTALANCA", length = 15)
    private String avalistaFone;

    @Basic
    @Column(name = "DONO_DOCUMENTO", table = "FTALANCA", length = 60)
    private String donoDocumento;

    @Basic
    @Column(name = "CIDADE", table = "FTALANCA", length = 40)
    private String cidade;

    public Integer getIdFtalanca() {
        return idFtalanca;
    }

    public void setIdFtalanca(Integer idFtalanca) {
        this.idFtalanca = idFtalanca;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(Integer idCfaporta) {
        this.idCfaporta = idCfaporta;
    }

    public Integer getIdCfatpcob() {
        return idCfatpcob;
    }

    public void setIdCfatpcob(Integer idCfatpcob) {
        this.idCfatpcob = idCfatpcob;
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

    public Integer getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(Integer numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getDgNu() {
        return dgNu;
    }

    public void setDgNu(String dgNu) {
        this.dgNu = dgNu;
    }

    public String getVariacao() {
        return variacao;
    }

    public void setVariacao(String variacao) {
        this.variacao = variacao;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public double getVlCpmf() {
        return vlCpmf;
    }

    public void setVlCpmf(double vlCpmf) {
        this.vlCpmf = vlCpmf;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlDocumento() {
        return vlDocumento;
    }

    public void setVlDocumento(double vlDocumento) {
        this.vlDocumento = vlDocumento;
    }

    public double getVlOutros() {
        return vlOutros;
    }

    public void setVlOutros(double vlOutros) {
        this.vlOutros = vlOutros;
    }

    public double getVlJuros() {
        return vlJuros;
    }

    public void setVlJuros(double vlJuros) {
        this.vlJuros = vlJuros;
    }

    public Double getFcVlAcerto() {
        return fcVlAcerto;
    }

    public void setFcVlAcerto(Double fcVlAcerto) {
        this.fcVlAcerto = fcVlAcerto;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public double getPercCpmf() {
        return percCpmf;
    }

    public void setPercCpmf(double percCpmf) {
        this.percCpmf = percCpmf;
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

    public Date getDtCompensacao() {
        return dtCompensacao;
    }

    public void setDtCompensacao(Date dtCompensacao) {
        this.dtCompensacao = dtCompensacao;
    }

    public Date getDtDeposito() {
        return dtDeposito;
    }

    public void setDtDeposito(Date dtDeposito) {
        this.dtDeposito = dtDeposito;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getAvalista() {
        return avalista;
    }

    public void setAvalista(String avalista) {
        this.avalista = avalista;
    }

    public String getAvalistaFone() {
        return avalistaFone;
    }

    public void setAvalistaFone(String avalistaFone) {
        this.avalistaFone = avalistaFone;
    }

    public String getDonoDocumento() {
        return donoDocumento;
    }

    public void setDonoDocumento(String donoDocumento) {
        this.donoDocumento = donoDocumento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}