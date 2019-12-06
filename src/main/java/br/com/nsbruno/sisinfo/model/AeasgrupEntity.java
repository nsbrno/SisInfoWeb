package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "AEASGRUP")
@Data
public class AeasgrupEntity {

    @Id
    @Column(name = "ID_AEASGRUP", table = "AEASGRUP", nullable = false)
    private Integer idAeasgrup;

    @Basic(optional = false)
    @Column(name = "ID_AEAGRUPO", table = "AEASGRUP", nullable = false)
    private int idAeagrupo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEASGRUP", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEASGRUP", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEASGRUP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEASGRUP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEASGRUP")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEASGRUP", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEASGRUP", nullable = false, length = 60)
    private String descricao;

    public Integer getIdAeasgrup() {
        return idAeasgrup;
    }

    public void setIdAeasgrup(Integer idAeasgrup) {
        this.idAeasgrup = idAeasgrup;
    }

    public int getIdAeagrupo() {
        return idAeagrupo;
    }

    public void setIdAeagrupo(int idAeagrupo) {
        this.idAeagrupo = idAeagrupo;
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

}