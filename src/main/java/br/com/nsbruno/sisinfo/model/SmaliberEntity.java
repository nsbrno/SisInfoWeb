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
@Table(name = "SMALIBER")
public class SmaliberEntity {

    @Id
    @Column(name = "ID_SMALIBER", table = "SMALIBER", nullable = false)
    private Integer idSmaliber;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMALIBER", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMALIBER", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMALIBER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMALIBER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMALIBER")
    private Integer ctInteg;

    @Basic
    @Column(name = "ARQUIVO", table = "SMALIBER", length = 12)
    private String arquivo;

    @Basic(optional = false)
    @Column(name = "ID_ARQUIVO", table = "SMALIBER", nullable = false)
    private int idArquivo;

    @Basic
    @Column(name = "COD_TRANSACAO", table = "SMALIBER")
    private Integer codTransacao;

    @Basic
    @Column(name = "LIBERADO", table = "SMALIBER")
    private String liberado;

    @Basic
    @Column(name = "BLOQUEADO", table = "SMALIBER")
    private String bloqueado;

    @Basic
    @Column(name = "GERADO_AUTOMATICO", table = "SMALIBER")
    private String geradoAutomatico;

    @Basic
    @Column(name = "DT_LIBERADO_ATE", table = "SMALIBER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtLiberadoAte;

    @Basic
    @Column(name = "DT_BLOQUEADO_ATE", table = "SMALIBER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtBloqueadoAte;

    @Basic
    @Column(name = "OBS", table = "SMALIBER", length = 128)
    private String obs;

    public Integer getIdSmaliber() {
        return idSmaliber;
    }

    public void setIdSmaliber(Integer idSmaliber) {
        this.idSmaliber = idSmaliber;
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

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public int getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(int idArquivo) {
        this.idArquivo = idArquivo;
    }

    public Integer getCodTransacao() {
        return codTransacao;
    }

    public void setCodTransacao(Integer codTransacao) {
        this.codTransacao = codTransacao;
    }

    public String getLiberado() {
        return liberado;
    }

    public void setLiberado(String liberado) {
        this.liberado = liberado;
    }

    public String getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String getGeradoAutomatico() {
        return geradoAutomatico;
    }

    public void setGeradoAutomatico(String geradoAutomatico) {
        this.geradoAutomatico = geradoAutomatico;
    }

    public Date getDtLiberadoAte() {
        return dtLiberadoAte;
    }

    public void setDtLiberadoAte(Date dtLiberadoAte) {
        this.dtLiberadoAte = dtLiberadoAte;
    }

    public Date getDtBloqueadoAte() {
        return dtBloqueadoAte;
    }

    public void setDtBloqueadoAte(Date dtBloqueadoAte) {
        this.dtBloqueadoAte = dtBloqueadoAte;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}