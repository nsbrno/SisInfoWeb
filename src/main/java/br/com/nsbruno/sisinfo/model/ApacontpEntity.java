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
@Table(name = "APACONTP")
public class ApacontpEntity {

    @Id
    @Column(name = "ID_APACONTP", table = "APACONTP", nullable = false)
    private Integer idApacontp;

    @Basic
    @Column(name = "US_CAD", table = "APACONTP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APACONTP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APACONTP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APACONTP")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APACONTP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "APACONTP")
    private Integer codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "APACONTP", length = 40)
    private String descricao;

    public Integer getIdApacontp() {
        return idApacontp;
    }

    public void setIdApacontp(Integer idApacontp) {
        this.idApacontp = idApacontp;
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