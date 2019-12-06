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
@Table(name = "GCACONTR")
public class GcacontrEntity {

    @Id
    @Column(name = "ID_GCACONTR", table = "GCACONTR", nullable = false)
    private Integer idGcacontr;

    @Basic
    @Column(name = "ID_CFACLIFO_CLIE", table = "GCACONTR")
    private Integer idCfaclifoClie;

    @Basic
    @Column(name = "ID_CFACLIFO_VEND", table = "GCACONTR")
    private Integer idCfaclifoVend;

    @Basic
    @Column(name = "ID_CFACLIFO_ENTR", table = "GCACONTR")
    private Integer idCfaclifoEntr;

    @Basic
    @Column(name = "ID_CFACLIFO_RECO", table = "GCACONTR")
    private Integer idCfaclifoReco;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "GCACONTR")
    private Integer idSmaempre;

    @Basic
    @Column(name = "US_CAD", table = "GCACONTR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "GCACONTR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "GCACONTR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "GCACONTR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "GCACONTR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "GCACONTR")
    private Integer codigo;

    @Basic
    @Column(name = "DATA_EMISSAO", table = "GCACONTR")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;

    @Basic(optional = false)
    @Column(name = "VL_CONTRATO", table = "GCACONTR", nullable = false)
    private double vlContrato;

    @Basic(optional = false)
    @Column(name = "SITUACAO", table = "GCACONTR", nullable = false)
    private short situacao;

    @Lob
    @Basic
    @Column(name = "OBSERVACAO", table = "GCACONTR")
    private byte[] observacao;

    @Basic
    @Column(name = "REPRESENTANTE_NOME", table = "GCACONTR", length = 60)
    private String representanteNome;

    @Basic
    @Column(name = "REPRESENTANTE_CPF", table = "GCACONTR", length = 18)
    private String representanteCpf;

    public Integer getIdGcacontr() {
        return idGcacontr;
    }

    public void setIdGcacontr(Integer idGcacontr) {
        this.idGcacontr = idGcacontr;
    }

    public Integer getIdCfaclifoClie() {
        return idCfaclifoClie;
    }

    public void setIdCfaclifoClie(Integer idCfaclifoClie) {
        this.idCfaclifoClie = idCfaclifoClie;
    }

    public Integer getIdCfaclifoVend() {
        return idCfaclifoVend;
    }

    public void setIdCfaclifoVend(Integer idCfaclifoVend) {
        this.idCfaclifoVend = idCfaclifoVend;
    }

    public Integer getIdCfaclifoEntr() {
        return idCfaclifoEntr;
    }

    public void setIdCfaclifoEntr(Integer idCfaclifoEntr) {
        this.idCfaclifoEntr = idCfaclifoEntr;
    }

    public Integer getIdCfaclifoReco() {
        return idCfaclifoReco;
    }

    public void setIdCfaclifoReco(Integer idCfaclifoReco) {
        this.idCfaclifoReco = idCfaclifoReco;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getVlContrato() {
        return vlContrato;
    }

    public void setVlContrato(double vlContrato) {
        this.vlContrato = vlContrato;
    }

    public short getSituacao() {
        return situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public byte[] getObservacao() {
        return observacao;
    }

    public void setObservacao(byte[] observacao) {
        this.observacao = observacao;
    }

    public String getRepresentanteNome() {
        return representanteNome;
    }

    public void setRepresentanteNome(String representanteNome) {
        this.representanteNome = representanteNome;
    }

    public String getRepresentanteCpf() {
        return representanteCpf;
    }

    public void setRepresentanteCpf(String representanteCpf) {
        this.representanteCpf = representanteCpf;
    }

}