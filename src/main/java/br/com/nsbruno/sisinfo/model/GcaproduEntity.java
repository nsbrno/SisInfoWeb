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
@Table(name = "GCAPRODU")
public class GcaproduEntity {

    @Id
    @Column(name = "ID_GCAPRODU", table = "GCAPRODU", nullable = false)
    private Integer idGcaprodu;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "GCAPRODU")
    private Integer idAeaprodu;

    @Basic
    @Column(name = "US_CAD", table = "GCAPRODU", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "GCAPRODU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "GCAPRODU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "GCAPRODU")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "GCAPRODU", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "GCAPRODU")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "GCAPRODU", length = 40)
    private String descricao;

    @Basic
    @Column(name = "TIPO", table = "GCAPRODU")
    private String tipo;

    @Lob
    @Basic
    @Column(name = "OBSERVACAO", table = "GCAPRODU")
    private byte[] observacao;

    @Basic(optional = false)
    @Column(name = "VALOR_VENAL", table = "GCAPRODU", nullable = false)
    private double valorVenal;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "GCAPRODU", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "QTDE_LOCADA", table = "GCAPRODU", nullable = false)
    private double qtdeLocada;

    public Integer getIdGcaprodu() {
        return idGcaprodu;
    }

    public void setIdGcaprodu(Integer idGcaprodu) {
        this.idGcaprodu = idGcaprodu;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public byte[] getObservacao() {
        return observacao;
    }

    public void setObservacao(byte[] observacao) {
        this.observacao = observacao;
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQtdeLocada() {
        return qtdeLocada;
    }

    public void setQtdeLocada(double qtdeLocada) {
        this.qtdeLocada = qtdeLocada;
    }

}