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
@Table(name = "SMAUSURL")
@Data
public class SmausurlEntity {

    @Id
    @Column(name = "ID_SMAUSURL", table = "SMAUSURL", nullable = false)
    private Integer idSmausurl;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMAUSURL")
    private Integer idSmaarqui;

    @Basic
    @Column(name = "ID_SMARELAT", table = "SMAUSURL")
    private Integer idSmarelat;

    @Basic
    @Column(name = "ID_SMAUSUAR", table = "SMAUSURL")
    private Integer idSmausuar;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAUSURL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAUSURL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAUSURL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAUSURL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAUSURL")
    private Integer ctInteg;

    @Basic
    @Column(name = "COMANDO_IMPRESSAO", table = "SMAUSURL", length = 40)
    private String comandoImpressao;

    @Basic
    @Column(name = "PEDE_SAIDA", table = "SMAUSURL")
    private String pedeSaida;

    @Basic
    @Column(name = "SALVA_TELA", table = "SMAUSURL")
    private String salvaTela;

    @Basic
    @Column(name = "TIPO", table = "SMAUSURL")
    private String tipo;

    @Basic
    @Column(name = "USUARIO_CONFIGURA", table = "SMAUSURL")
    private String usuarioConfigura;

    @Basic(optional = false)
    @Column(name = "COPIAS", table = "SMAUSURL", nullable = false)
    private int copias;

    public Integer getIdSmausurl() {
        return idSmausurl;
    }

    public void setIdSmausurl(Integer idSmausurl) {
        this.idSmausurl = idSmausurl;
    }

    public Integer getIdSmaarqui() {
        return idSmaarqui;
    }

    public void setIdSmaarqui(Integer idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
    }

    public Integer getIdSmarelat() {
        return idSmarelat;
    }

    public void setIdSmarelat(Integer idSmarelat) {
        this.idSmarelat = idSmarelat;
    }

    public Integer getIdSmausuar() {
        return idSmausuar;
    }

    public void setIdSmausuar(Integer idSmausuar) {
        this.idSmausuar = idSmausuar;
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

    public String getComandoImpressao() {
        return comandoImpressao;
    }

    public void setComandoImpressao(String comandoImpressao) {
        this.comandoImpressao = comandoImpressao;
    }

    public String getPedeSaida() {
        return pedeSaida;
    }

    public void setPedeSaida(String pedeSaida) {
        this.pedeSaida = pedeSaida;
    }

    public String getSalvaTela() {
        return salvaTela;
    }

    public void setSalvaTela(String salvaTela) {
        this.salvaTela = salvaTela;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuarioConfigura() {
        return usuarioConfigura;
    }

    public void setUsuarioConfigura(String usuarioConfigura) {
        this.usuarioConfigura = usuarioConfigura;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

}