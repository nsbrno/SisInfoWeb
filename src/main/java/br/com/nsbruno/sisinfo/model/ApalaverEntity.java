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
@Table(name = "APALAVER")
public class ApalaverEntity {

    @Id
    @Column(name = "ID_APALAVER", table = "APALAVER", nullable = false)
    private Integer idApalaver;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APALAVER")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "APALAVER")
    private Integer idCfaclifoComun;

    @Basic
    @Column(name = "US_CAD", table = "APALAVER", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APALAVER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APALAVER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APALAVER")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APALAVER", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "DT_AVERBACAO", table = "APALAVER")
    @Temporal(TemporalType.DATE)
    private Date dtAverbacao;

    @Basic
    @Column(name = "DT_APELACAO", table = "APALAVER")
    @Temporal(TemporalType.DATE)
    private Date dtApelacao;

    @Basic
    @Column(name = "DT_CASAMENTO", table = "APALAVER")
    @Temporal(TemporalType.DATE)
    private Date dtCasamento;

    @Basic
    @Column(name = "NOIVA", table = "APALAVER", length = 60)
    private String noiva;

    @Basic
    @Column(name = "NOIVO", table = "APALAVER", length = 60)
    private String noivo;

    @Basic
    @Column(name = "TRIB_HOMOLOGACAO", table = "APALAVER", length = 60)
    private String tribHomologacao;

    @Basic
    @Column(name = "TRIB_APELACAO", table = "APALAVER", length = 60)
    private String tribApelacao;

    @Basic
    @Column(name = "PAROQUIA", table = "APALAVER", length = 60)
    private String paroquia;

    @Basic
    @Column(name = "CIDADE", table = "APALAVER", length = 60)
    private String cidade;

    @Basic
    @Column(name = "LIVRO_CASAMENTO", table = "APALAVER")
    private Integer livroCasamento;

    @Basic
    @Column(name = "FOLHA_CASAMENTO", table = "APALAVER")
    private Integer folhaCasamento;

    @Basic
    @Column(name = "TERMO_CASAMENTO", table = "APALAVER")
    private Integer termoCasamento;

    @Basic
    @Column(name = "LIVRO", table = "APALAVER")
    private Integer livro;

    @Basic
    @Column(name = "FOLHA", table = "APALAVER")
    private Integer folha;

    @Basic
    @Column(name = "TERMO", table = "APALAVER")
    private Integer termo;

    @Lob
    @Basic
    @Column(name = "SENTENCA", table = "APALAVER")
    private byte[] sentenca;

    public Integer getIdApalaver() {
        return idApalaver;
    }

    public void setIdApalaver(Integer idApalaver) {
        this.idApalaver = idApalaver;
    }

    public Integer getIdCfaclifoParoq() {
        return idCfaclifoParoq;
    }

    public void setIdCfaclifoParoq(Integer idCfaclifoParoq) {
        this.idCfaclifoParoq = idCfaclifoParoq;
    }

    public Integer getIdCfaclifoComun() {
        return idCfaclifoComun;
    }

    public void setIdCfaclifoComun(Integer idCfaclifoComun) {
        this.idCfaclifoComun = idCfaclifoComun;
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

    public Date getDtAverbacao() {
        return dtAverbacao;
    }

    public void setDtAverbacao(Date dtAverbacao) {
        this.dtAverbacao = dtAverbacao;
    }

    public Date getDtApelacao() {
        return dtApelacao;
    }

    public void setDtApelacao(Date dtApelacao) {
        this.dtApelacao = dtApelacao;
    }

    public Date getDtCasamento() {
        return dtCasamento;
    }

    public void setDtCasamento(Date dtCasamento) {
        this.dtCasamento = dtCasamento;
    }

    public String getNoiva() {
        return noiva;
    }

    public void setNoiva(String noiva) {
        this.noiva = noiva;
    }

    public String getNoivo() {
        return noivo;
    }

    public void setNoivo(String noivo) {
        this.noivo = noivo;
    }

    public String getTribHomologacao() {
        return tribHomologacao;
    }

    public void setTribHomologacao(String tribHomologacao) {
        this.tribHomologacao = tribHomologacao;
    }

    public String getTribApelacao() {
        return tribApelacao;
    }

    public void setTribApelacao(String tribApelacao) {
        this.tribApelacao = tribApelacao;
    }

    public String getParoquia() {
        return paroquia;
    }

    public void setParoquia(String paroquia) {
        this.paroquia = paroquia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getLivroCasamento() {
        return livroCasamento;
    }

    public void setLivroCasamento(Integer livroCasamento) {
        this.livroCasamento = livroCasamento;
    }

    public Integer getFolhaCasamento() {
        return folhaCasamento;
    }

    public void setFolhaCasamento(Integer folhaCasamento) {
        this.folhaCasamento = folhaCasamento;
    }

    public Integer getTermoCasamento() {
        return termoCasamento;
    }

    public void setTermoCasamento(Integer termoCasamento) {
        this.termoCasamento = termoCasamento;
    }

    public Integer getLivro() {
        return livro;
    }

    public void setLivro(Integer livro) {
        this.livro = livro;
    }

    public Integer getFolha() {
        return folha;
    }

    public void setFolha(Integer folha) {
        this.folha = folha;
    }

    public Integer getTermo() {
        return termo;
    }

    public void setTermo(Integer termo) {
        this.termo = termo;
    }

    public byte[] getSentenca() {
        return sentenca;
    }

    public void setSentenca(byte[] sentenca) {
        this.sentenca = sentenca;
    }

}