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
@Table(name = "APAMINIS")
public class ApaminisEntity {

    @Id
    @Column(name = "ID_APAMINIS", table = "APAMINIS", nullable = false)
    private Integer idApaminis;

    @Basic
    @Column(name = "US_CAD", table = "APAMINIS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APAMINIS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APAMINIS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APAMINIS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APAMINIS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "APAMINIS")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "APAMINIS", length = 60)
    private String descricao;

    public Integer getIdApaminis() {
        return idApaminis;
    }

    public void setIdApaminis(Integer idApaminis) {
        this.idApaminis = idApaminis;
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

}