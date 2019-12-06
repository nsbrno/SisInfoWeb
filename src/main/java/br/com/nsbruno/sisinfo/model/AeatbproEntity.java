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
@Table(name = "AEATBPRO")
public class AeatbproEntity {

    @Id
    @Column(name = "ID_AEATBPRO", table = "AEATBPRO", nullable = false)
    private Integer idAeatbpro;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEATBPRO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEATBPRO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEATBPRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEATBPRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEATBPRO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEATBPRO", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEATBPRO", nullable = false, length = 40)
    private String descricao;

    @Basic
    @Column(name = "DT_INICIO", table = "AEATBPRO")
    @Temporal(TemporalType.DATE)
    private Date dtInicio;

    @Basic
    @Column(name = "DT_FIM", table = "AEATBPRO")
    @Temporal(TemporalType.DATE)
    private Date dtFim;

    @Basic
    @Column(name = "DIAS", table = "AEATBPRO", length = 18)
    private String dias;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEATBPRO", nullable = false)
    private String ativo;

    @Basic(optional = false)
    @Column(name = "VISTA_PRAZO", table = "AEATBPRO", nullable = false)
    private String vistaPrazo;

    public Integer getIdAeatbpro() {
        return idAeatbpro;
    }

    public void setIdAeatbpro(Integer idAeatbpro) {
        this.idAeatbpro = idAeatbpro;
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

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getVistaPrazo() {
        return vistaPrazo;
    }

    public void setVistaPrazo(String vistaPrazo) {
        this.vistaPrazo = vistaPrazo;
    }

}