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
@Table(name = "SMAITARQ")
public class SmaitarqEntity {

    @Id
    @Column(name = "ID_SMAITARQ", table = "SMAITARQ", nullable = false)
    private Integer idSmaitarq;

    @Basic(optional = false)
    @Column(name = "ID_SMAARQUI", table = "SMAITARQ", nullable = false)
    private int idSmaarqui;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAITARQ", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAITARQ", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAITARQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAITARQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAITARQ")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CAMPO", table = "SMAITARQ", nullable = false, length = 40)
    private String campo;

    @Lob
    @Basic
    @Column(name = "INDICE", table = "SMAITARQ")
    private byte[] indice;

    @Basic
    @Column(name = "DATATYPE", table = "SMAITARQ", length = 2)
    private String datatype;

    @Basic
    @Column(name = "AUTOFIND", table = "SMAITARQ")
    private String autofind;

    @Basic
    @Column(name = "CAPSLOCK", table = "SMAITARQ")
    private String capslock;

    @Basic
    @Column(name = "REQUERIDO", table = "SMAITARQ")
    private String requerido;

    @Basic(optional = false)
    @Column(name = "TAMANHO", table = "SMAITARQ", nullable = false)
    private int tamanho;

    @Basic(optional = false)
    @Column(name = "DECIMAIS", table = "SMAITARQ", nullable = false)
    private int decimais;

    @Lob
    @Basic
    @Column(name = "MSGERRO", table = "SMAITARQ")
    private byte[] msgerro;

    @Lob
    @Basic
    @Column(name = "MSGEXPLICATIVA", table = "SMAITARQ")
    private byte[] msgexplicativa;

    @Lob
    @Basic
    @Column(name = "VALORDEFAULT", table = "SMAITARQ")
    private byte[] valordefault;

    @Lob
    @Basic
    @Column(name = "OPCAOTELA", table = "SMAITARQ")
    private byte[] opcaotela;

    @Lob
    @Basic
    @Column(name = "OPCAOBASE", table = "SMAITARQ")
    private byte[] opcaobase;

    @Basic
    @Column(name = "FOUNDREQUERIDO", table = "SMAITARQ")
    private String foundrequerido;

    @Lob
    @Basic
    @Column(name = "NOMECAMPO", table = "SMAITARQ")
    private byte[] nomecampo;

    @Basic
    @Column(name = "MASCARA", table = "SMAITARQ")
    private String mascara;

    @Basic
    @Column(name = "INDICENATIVO", table = "SMAITARQ")
    private String indicenativo;

    public Integer getIdSmaitarq() {
        return idSmaitarq;
    }

    public void setIdSmaitarq(Integer idSmaitarq) {
        this.idSmaitarq = idSmaitarq;
    }

    public int getIdSmaarqui() {
        return idSmaarqui;
    }

    public void setIdSmaarqui(int idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
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

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public byte[] getIndice() {
        return indice;
    }

    public void setIndice(byte[] indice) {
        this.indice = indice;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getAutofind() {
        return autofind;
    }

    public void setAutofind(String autofind) {
        this.autofind = autofind;
    }

    public String getCapslock() {
        return capslock;
    }

    public void setCapslock(String capslock) {
        this.capslock = capslock;
    }

    public String getRequerido() {
        return requerido;
    }

    public void setRequerido(String requerido) {
        this.requerido = requerido;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getDecimais() {
        return decimais;
    }

    public void setDecimais(int decimais) {
        this.decimais = decimais;
    }

    public byte[] getMsgerro() {
        return msgerro;
    }

    public void setMsgerro(byte[] msgerro) {
        this.msgerro = msgerro;
    }

    public byte[] getMsgexplicativa() {
        return msgexplicativa;
    }

    public void setMsgexplicativa(byte[] msgexplicativa) {
        this.msgexplicativa = msgexplicativa;
    }

    public byte[] getValordefault() {
        return valordefault;
    }

    public void setValordefault(byte[] valordefault) {
        this.valordefault = valordefault;
    }

    public byte[] getOpcaotela() {
        return opcaotela;
    }

    public void setOpcaotela(byte[] opcaotela) {
        this.opcaotela = opcaotela;
    }

    public byte[] getOpcaobase() {
        return opcaobase;
    }

    public void setOpcaobase(byte[] opcaobase) {
        this.opcaobase = opcaobase;
    }

    public String getFoundrequerido() {
        return foundrequerido;
    }

    public void setFoundrequerido(String foundrequerido) {
        this.foundrequerido = foundrequerido;
    }

    public byte[] getNomecampo() {
        return nomecampo;
    }

    public void setNomecampo(byte[] nomecampo) {
        this.nomecampo = nomecampo;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getIndicenativo() {
        return indicenativo;
    }

    public void setIndicenativo(String indicenativo) {
        this.indicenativo = indicenativo;
    }

}