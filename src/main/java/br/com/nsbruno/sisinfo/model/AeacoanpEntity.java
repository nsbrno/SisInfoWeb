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
@Table(name = "AEACOANP")
public class AeacoanpEntity {

    @Id
    @Column(name = "ID_AEACOANP", table = "AEACOANP", nullable = false)
    private Integer idAeacoanp;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACOANP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACOANP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACOANP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACOANP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACOANP")
    private Integer ctInteg;

    @Basic
    @Column(name = "CODIGO", table = "AEACOANP", length = 9)
    private String codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "AEACOANP", length = 50)
    private String descricao;

    public Integer getIdAeacoanp() {
        return idAeacoanp;
    }

    public void setIdAeacoanp(Integer idAeacoanp) {
        this.idAeacoanp = idAeacoanp;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}