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
@Table(name = "AEAPRISM")
public class AeaprismEntity {

    @Id
    @Column(name = "ID_AEAPRISM", table = "AEAPRISM", nullable = false)
    private Integer idAeaprism;

    @Basic
    @Column(name = "ID_AEAORCAM", table = "AEAPRISM")
    private Integer idAeaorcam;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPRISM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPRISM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPRISM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPRISM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPRISM")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEAPRISM")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "AEAPRISM", length = 40)
    private String descricao;

    public Integer getIdAeaprism() {
        return idAeaprism;
    }

    public void setIdAeaprism(Integer idAeaprism) {
        this.idAeaprism = idAeaprism;
    }

    public Integer getIdAeaorcam() {
        return idAeaorcam;
    }

    public void setIdAeaorcam(Integer idAeaorcam) {
        this.idAeaorcam = idAeaorcam;
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

}