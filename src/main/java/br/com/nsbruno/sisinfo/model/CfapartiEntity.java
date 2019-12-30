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
@Table(name = "CFAPARTI")
public class CfapartiEntity {

    @Id
    @Column(name = "ID_CFAPARTI", table = "CFAPARTI", nullable = false)
    private Integer idCfaparti;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAPARTI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAPARTI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAPARTI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAPARTI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAPARTI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFAPARTI", nullable = false)
    private Integer codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CFAPARTI", nullable = false, length = 60)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "SIGLA", table = "CFAPARTI", nullable = false, length = 20)
    private String sigla;

    public Integer getIdCfaparti() {
        return idCfaparti;
    }

    public void setIdCfaparti(Integer idCfaparti) {
        this.idCfaparti = idCfaparti;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}