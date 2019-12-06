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
@Table(name = "APAPASTO")
public class ApapastoEntity {

    @Id
    @Column(name = "ID_APAPASTO", table = "APAPASTO", nullable = false)
    private Integer idApapasto;

    @Basic
    @Column(name = "US_CAD", table = "APAPASTO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APAPASTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APAPASTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APAPASTO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APAPASTO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "APAPASTO")
    private Integer codigo;

    @Basic
    @Column(name = "NOME", table = "APAPASTO", length = 40)
    private String nome;

    public Integer getIdApapasto() {
        return idApapasto;
    }

    public void setIdApapasto(Integer idApapasto) {
        this.idApapasto = idApapasto;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}