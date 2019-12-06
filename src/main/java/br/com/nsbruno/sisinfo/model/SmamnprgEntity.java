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
@Table(name = "SMAMNPRG")
public class SmamnprgEntity {

    @Id
    @Column(name = "ID_SMAMNPRG", table = "SMAMNPRG", nullable = false)
    private Integer idSmamnprg;

    @Basic(optional = false)
    @Column(name = "ID_SMAMENUS", table = "SMAMNPRG", nullable = false)
    private int idSmamenus;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAMNPRG", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAMNPRG", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAMNPRG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAMNPRG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAMNPRG")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NOME", table = "SMAMNPRG", nullable = false, length = 128)
    private String nome;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "SMAMNPRG", nullable = false, length = 60)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "SMAMNPRG", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "PARAMETROS", table = "SMAMNPRG", length = 128)
    private String parametros;

    @Basic
    @Column(name = "HOTKEY", table = "SMAMNPRG", length = 20)
    private String hotkey;

    public Integer getIdSmamnprg() {
        return idSmamnprg;
    }

    public void setIdSmamnprg(Integer idSmamnprg) {
        this.idSmamnprg = idSmamnprg;
    }

    public int getIdSmamenus() {
        return idSmamenus;
    }

    public void setIdSmamenus(int idSmamenus) {
        this.idSmamenus = idSmamenus;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getHotkey() {
        return hotkey;
    }

    public void setHotkey(String hotkey) {
        this.hotkey = hotkey;
    }

}