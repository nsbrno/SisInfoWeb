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
@Table(name = "SMAMENSA")
public class SmamensaEntity {

    @Id
    @Column(name = "ID_SMAMENSA", table = "SMAMENSA", nullable = false)
    private Integer idSmamensa;

    @Basic
    @Column(name = "ID_SMAMENSA_ORIGINAL", table = "SMAMENSA")
    private Integer idSmamensaOriginal;

    @Basic
    @Column(name = "ID_SMAUSUAR_FROM", table = "SMAMENSA")
    private Integer idSmausuarFrom;

    @Basic
    @Column(name = "ID_SMAUSUAR_TO", table = "SMAMENSA")
    private Integer idSmausuarTo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAMENSA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAMENSA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAMENSA")
    private Integer ctInteg;

    @Basic
    @Column(name = "DATA_GERADO", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataGerado;

    @Basic
    @Column(name = "DATA_ENVIO", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEnvio;

    @Basic
    @Column(name = "DATA_LEITURA", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataLeitura;

    @Basic
    @Column(name = "ARQUIVO", table = "SMAMENSA", length = 13)
    private String arquivo;

    @Basic
    @Column(name = "ID_ARQUIVO", table = "SMAMENSA")
    private Integer idArquivo;

    @Basic
    @Column(name = "TIPO_MENSAGEM", table = "SMAMENSA")
    private Integer tipoMensagem;

    @Basic
    @Column(name = "STATUS", table = "SMAMENSA")
    private String status;

    @Basic
    @Column(name = "MSG_FROM", table = "SMAMENSA", length = 128)
    private String msgFrom;

    @Basic
    @Column(name = "MSG_TO", table = "SMAMENSA", length = 128)
    private String msgTo;

    @Basic
    @Column(name = "ASSUNTO", table = "SMAMENSA", length = 128)
    private String assunto;

    @Lob
    @Basic
    @Column(name = "MENSAGEM", table = "SMAMENSA")
    private byte[] mensagem;

    public Integer getIdSmamensa() {
        return idSmamensa;
    }

    public void setIdSmamensa(Integer idSmamensa) {
        this.idSmamensa = idSmamensa;
    }

    public Integer getIdSmamensaOriginal() {
        return idSmamensaOriginal;
    }

    public void setIdSmamensaOriginal(Integer idSmamensaOriginal) {
        this.idSmamensaOriginal = idSmamensaOriginal;
    }

    public Integer getIdSmausuarFrom() {
        return idSmausuarFrom;
    }

    public void setIdSmausuarFrom(Integer idSmausuarFrom) {
        this.idSmausuarFrom = idSmausuarFrom;
    }

    public Integer getIdSmausuarTo() {
        return idSmausuarTo;
    }

    public void setIdSmausuarTo(Integer idSmausuarTo) {
        this.idSmausuarTo = idSmausuarTo;
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

    public Date getDataGerado() {
        return dataGerado;
    }

    public void setDataGerado(Date dataGerado) {
        this.dataGerado = dataGerado;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Date getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Integer getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(Integer idArquivo) {
        this.idArquivo = idArquivo;
    }

    public Integer getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(Integer tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsgFrom() {
        return msgFrom;
    }

    public void setMsgFrom(String msgFrom) {
        this.msgFrom = msgFrom;
    }

    public String getMsgTo() {
        return msgTo;
    }

    public void setMsgTo(String msgTo) {
        this.msgTo = msgTo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public byte[] getMensagem() {
        return mensagem;
    }

    public void setMensagem(byte[] mensagem) {
        this.mensagem = mensagem;
    }

}