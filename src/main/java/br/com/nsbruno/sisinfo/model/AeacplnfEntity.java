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
@Table(name = "AEACPLNF")
public class AeacplnfEntity {

    @Id
    @Column(name = "ID_AEACPLNF", table = "AEACPLNF", nullable = false)
    private Integer idAeacplnf;

    @Basic
    @Column(name = "ID_CFAESTAD_PLACA1", table = "AEACPLNF")
    private Integer idCfaestadPlaca1;

    @Basic
    @Column(name = "ID_CFAESTAD_PLACA2", table = "AEACPLNF")
    private Integer idCfaestadPlaca2;

    @Basic
    @Column(name = "ID_CFAESTAD_PLACA3", table = "AEACPLNF")
    private Integer idCfaestadPlaca3;

    @Basic
    @Column(name = "ID_CFACLIFO_TRANSP", table = "AEACPLNF")
    private Integer idCfaclifoTransp;

    @Basic
    @Column(name = "ID_AEAPESOS", table = "AEACPLNF")
    private Integer idAeapesos;

    @Basic
    @Column(name = "ID_CFAENDER", table = "AEACPLNF")
    private Integer idCfaender;

    @Basic
    @Column(name = "ID_AEAORCAM", table = "AEACPLNF")
    private Integer idAeaorcam;

    @Basic
    @Column(name = "ID_AEASAIDA", table = "AEACPLNF")
    private Integer idAeasaida;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "AEACPLNF")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEACPLNF")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEAPEDID", table = "AEACPLNF")
    private Integer idAeapedid;

    @Basic
    @Column(name = "ID_CFAVIATR", table = "AEACPLNF")
    private Integer idCfaviatr;

    @Basic
    @Column(name = "ID_AEAROMAN", table = "AEACPLNF")
    private Integer idAearoman;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACPLNF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACPLNF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACPLNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACPLNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACPLNF")
    private Integer ctInteg;

    @Lob
    @Basic
    @Column(name = "LOCAL_ENTREGA", table = "AEACPLNF")
    private byte[] localEntrega;

    @Basic
    @Column(name = "TIPO_FRETE", table = "AEACPLNF")
    private String tipoFrete;

    @Basic
    @Column(name = "PLACA1", table = "AEACPLNF", length = 10)
    private String placa1;

    @Basic
    @Column(name = "PLACA2", table = "AEACPLNF", length = 10)
    private String placa2;

    @Basic
    @Column(name = "PLACA3", table = "AEACPLNF", length = 10)
    private String placa3;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEACPLNF", nullable = false)
    private double quantidade;

    @Basic
    @Column(name = "ESPECIE", table = "AEACPLNF", length = 60)
    private String especie;

    @Basic
    @Column(name = "MARCA", table = "AEACPLNF", length = 60)
    private String marca;

    @Basic
    @Column(name = "NUMERO", table = "AEACPLNF", length = 60)
    private String numero;

    @Basic(optional = false)
    @Column(name = "PESO_BRUTO", table = "AEACPLNF", nullable = false)
    private double pesoBruto;

    @Basic(optional = false)
    @Column(name = "PESO_LIQUIDO", table = "AEACPLNF", nullable = false)
    private double pesoLiquido;

    @Basic
    @Column(name = "RNTC", table = "AEACPLNF", length = 20)
    private String rntc;

    public Integer getIdAeacplnf() {
        return idAeacplnf;
    }

    public void setIdAeacplnf(Integer idAeacplnf) {
        this.idAeacplnf = idAeacplnf;
    }

    public Integer getIdCfaestadPlaca1() {
        return idCfaestadPlaca1;
    }

    public void setIdCfaestadPlaca1(Integer idCfaestadPlaca1) {
        this.idCfaestadPlaca1 = idCfaestadPlaca1;
    }

    public Integer getIdCfaestadPlaca2() {
        return idCfaestadPlaca2;
    }

    public void setIdCfaestadPlaca2(Integer idCfaestadPlaca2) {
        this.idCfaestadPlaca2 = idCfaestadPlaca2;
    }

    public Integer getIdCfaestadPlaca3() {
        return idCfaestadPlaca3;
    }

    public void setIdCfaestadPlaca3(Integer idCfaestadPlaca3) {
        this.idCfaestadPlaca3 = idCfaestadPlaca3;
    }

    public Integer getIdCfaclifoTransp() {
        return idCfaclifoTransp;
    }

    public void setIdCfaclifoTransp(Integer idCfaclifoTransp) {
        this.idCfaclifoTransp = idCfaclifoTransp;
    }

    public Integer getIdAeapesos() {
        return idAeapesos;
    }

    public void setIdAeapesos(Integer idAeapesos) {
        this.idAeapesos = idAeapesos;
    }

    public Integer getIdCfaender() {
        return idCfaender;
    }

    public void setIdCfaender(Integer idCfaender) {
        this.idCfaender = idCfaender;
    }

    public Integer getIdAeaorcam() {
        return idAeaorcam;
    }

    public void setIdAeaorcam(Integer idAeaorcam) {
        this.idAeaorcam = idAeaorcam;
    }

    public Integer getIdAeasaida() {
        return idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public Integer getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public Integer getIdAeapedid() {
        return idAeapedid;
    }

    public void setIdAeapedid(Integer idAeapedid) {
        this.idAeapedid = idAeapedid;
    }

    public Integer getIdCfaviatr() {
        return idCfaviatr;
    }

    public void setIdCfaviatr(Integer idCfaviatr) {
        this.idCfaviatr = idCfaviatr;
    }

    public Integer getIdAearoman() {
        return idAearoman;
    }

    public void setIdAearoman(Integer idAearoman) {
        this.idAearoman = idAearoman;
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

    public byte[] getLocalEntrega() {
        return localEntrega;
    }

    public void setLocalEntrega(byte[] localEntrega) {
        this.localEntrega = localEntrega;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public String getPlaca1() {
        return placa1;
    }

    public void setPlaca1(String placa1) {
        this.placa1 = placa1;
    }

    public String getPlaca2() {
        return placa2;
    }

    public void setPlaca2(String placa2) {
        this.placa2 = placa2;
    }

    public String getPlaca3() {
        return placa3;
    }

    public void setPlaca3(String placa3) {
        this.placa3 = placa3;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public String getRntc() {
        return rntc;
    }

    public void setRntc(String rntc) {
        this.rntc = rntc;
    }

}