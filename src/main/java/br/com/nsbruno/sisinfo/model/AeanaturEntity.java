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
@Table(name = "AEANATUR")
public class AeanaturEntity {

    @Id
    @Column(name = "ID_AEANATUR", table = "AEANATUR", nullable = false)
    private Integer idAeanatur;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEANATUR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEANATUR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEANATUR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEANATUR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEANATUR")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEANATUR")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "AEANATUR", length = 40)
    private String descricao;

    @Basic
    @Column(name = "TIPO", table = "AEANATUR")
    private String tipo;

    @Basic
    @Column(name = "ADICIONA_SPED", table = "AEANATUR")
    private String adicionaSped;

    @Basic
    @Column(name = "ADICIONA_SPED_PIS", table = "AEANATUR")
    private String adicionaSpedPis;

    public Integer getIdAeanatur() {
        return idAeanatur;
    }

    public void setIdAeanatur(Integer idAeanatur) {
        this.idAeanatur = idAeanatur;
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

    public String getAdicionaSped() {
        return adicionaSped;
    }

    public void setAdicionaSped(String adicionaSped) {
        this.adicionaSped = adicionaSped;
    }

    public String getAdicionaSpedPis() {
        return adicionaSpedPis;
    }

    public void setAdicionaSpedPis(String adicionaSpedPis) {
        this.adicionaSpedPis = adicionaSpedPis;
    }

}