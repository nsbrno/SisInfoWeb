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
@Table(name = "CPALIQUI")
public class CpaliquiEntity {

    @Id
    @Column(name = "ID_CPALIQUI", table = "CPALIQUI", nullable = false)
    private Integer idCpaliqui;

    @Basic
    @Column(name = "US_CAD", table = "CPALIQUI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPALIQUI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPALIQUI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPALIQUI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPALIQUI", nullable = false, length = 16)
    private String guid;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CPALIQUI", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CPALIQUI", nullable = false, length = 40)
    private String descricao;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CPALIQUI")
    private byte[] complemento;

    public Integer getIdCpaliqui() {
        return idCpaliqui;
    }

    public void setIdCpaliqui(Integer idCpaliqui) {
        this.idCpaliqui = idCpaliqui;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

}