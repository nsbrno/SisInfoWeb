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
@Table(name = "CTAGRUPO")
public class CtagrupoEntity {

    @Id
    @Column(name = "ID_CTAGRUPO", table = "CTAGRUPO", nullable = false)
    private Integer idCtagrupo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CTAGRUPO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CTAGRUPO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CTAGRUPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CTAGRUPO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CTAGRUPO")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "COD_REDUZ", table = "CTAGRUPO", nullable = false)
    private Integer codReduz;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CTAGRUPO", nullable = false, length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "MASCARA", table = "CTAGRUPO", nullable = false, length = 26)
    private String mascara;

    @Basic(optional = false)
    @Column(name = "TAM_NIVEL1", table = "CTAGRUPO", nullable = false)
    private Integer tamNivel1;

    @Basic(optional = false)
    @Column(name = "TAM_NIVEL2", table = "CTAGRUPO", nullable = false)
    private Integer tamNivel2;

    @Basic(optional = false)
    @Column(name = "TAM_NIVEL3", table = "CTAGRUPO", nullable = false)
    private Integer tamNivel3;

    @Basic(optional = false)
    @Column(name = "TAM_NIVEL4", table = "CTAGRUPO", nullable = false)
    private Integer tamNivel4;

    @Basic(optional = false)
    @Column(name = "TAM_NIVEL5", table = "CTAGRUPO", nullable = false)
    private Integer tamNivel5;

    @Basic(optional = false)
    @Column(name = "TAM_NIVEL6", table = "CTAGRUPO", nullable = false)
    private Integer tamNivel6;

    @Basic(optional = false)
    @Column(name = "TAM_NIVEL7", table = "CTAGRUPO", nullable = false)
    private Integer tamNivel7;

    @Basic(optional = false)
    @Column(name = "TAM_NIVEL8", table = "CTAGRUPO", nullable = false)
    private Integer tamNivel8;

    @Basic(optional = false)
    @Column(name = "TAM_NIVEL9", table = "CTAGRUPO", nullable = false)
    private Integer tamNivel9;

    @Basic(optional = false)
    @Column(name = "ULT_NIVEL", table = "CTAGRUPO", nullable = false)
    private Integer ultNivel;

    @Basic(optional = false)
    @Column(name = "TOT_DIGITOS", table = "CTAGRUPO", nullable = false)
    private Integer totDigitos;

    @Basic(optional = false)
    @Column(name = "CHEIO", table = "CTAGRUPO", nullable = false)
    private String cheio;

    public Integer getIdCtagrupo() {
        return idCtagrupo;
    }

    public void setIdCtagrupo(Integer idCtagrupo) {
        this.idCtagrupo = idCtagrupo;
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

    public Integer getCodReduz() {
        return codReduz;
    }

    public void setCodReduz(Integer codReduz) {
        this.codReduz = codReduz;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Integer getTamNivel1() {
        return tamNivel1;
    }

    public void setTamNivel1(Integer tamNivel1) {
        this.tamNivel1 = tamNivel1;
    }

    public Integer getTamNivel2() {
        return tamNivel2;
    }

    public void setTamNivel2(Integer tamNivel2) {
        this.tamNivel2 = tamNivel2;
    }

    public Integer getTamNivel3() {
        return tamNivel3;
    }

    public void setTamNivel3(Integer tamNivel3) {
        this.tamNivel3 = tamNivel3;
    }

    public Integer getTamNivel4() {
        return tamNivel4;
    }

    public void setTamNivel4(Integer tamNivel4) {
        this.tamNivel4 = tamNivel4;
    }

    public Integer getTamNivel5() {
        return tamNivel5;
    }

    public void setTamNivel5(Integer tamNivel5) {
        this.tamNivel5 = tamNivel5;
    }

    public Integer getTamNivel6() {
        return tamNivel6;
    }

    public void setTamNivel6(Integer tamNivel6) {
        this.tamNivel6 = tamNivel6;
    }

    public Integer getTamNivel7() {
        return tamNivel7;
    }

    public void setTamNivel7(Integer tamNivel7) {
        this.tamNivel7 = tamNivel7;
    }

    public Integer getTamNivel8() {
        return tamNivel8;
    }

    public void setTamNivel8(Integer tamNivel8) {
        this.tamNivel8 = tamNivel8;
    }

    public Integer getTamNivel9() {
        return tamNivel9;
    }

    public void setTamNivel9(Integer tamNivel9) {
        this.tamNivel9 = tamNivel9;
    }

    public Integer getUltNivel() {
        return ultNivel;
    }

    public void setUltNivel(Integer ultNivel) {
        this.ultNivel = ultNivel;
    }

    public Integer getTotDigitos() {
        return totDigitos;
    }

    public void setTotDigitos(Integer totDigitos) {
        this.totDigitos = totDigitos;
    }

    public String getCheio() {
        return cheio;
    }

    public void setCheio(String cheio) {
        this.cheio = cheio;
    }

}