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
@Table(name = "CFATPDOC")
public class CfatpdocEntity {

    @Id
    @Column(name = "ID_CFATPDOC", table = "CFATPDOC", nullable = false)
    private Integer idCfatpdoc;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CFATPDOC", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "CFATPDOC")
    private Integer idSmaarqui;

    @Basic
    @Column(name = "ID_CBAPLCTA_L_REC", table = "CFATPDOC")
    private Integer idCbaplctaLRec;

    @Basic
    @Column(name = "ID_CBAPLCTA_J_REC", table = "CFATPDOC")
    private Integer idCbaplctaJRec;

    @Basic
    @Column(name = "ID_CBAPLCTA_D_REC", table = "CFATPDOC")
    private Integer idCbaplctaDRec;

    @Basic
    @Column(name = "ID_CBAPLCTA_DP_REC", table = "CFATPDOC")
    private Integer idCbaplctaDpRec;

    @Basic
    @Column(name = "ID_CTAHIPAD_L_REC", table = "CFATPDOC")
    private Integer idCtahipadLRec;

    @Basic
    @Column(name = "ID_CTAHIPAD_J_REC", table = "CFATPDOC")
    private Integer idCtahipadJRec;

    @Basic
    @Column(name = "ID_CTAHIPAD_D_REC", table = "CFATPDOC")
    private Integer idCtahipadDRec;

    @Basic
    @Column(name = "ID_CBAPLCTA_L_PAG", table = "CFATPDOC")
    private Integer idCbaplctaLPag;

    @Basic
    @Column(name = "ID_CBAPLCTA_J_PAG", table = "CFATPDOC")
    private Integer idCbaplctaJPag;

    @Basic
    @Column(name = "ID_CBAPLCTA_D_PAG", table = "CFATPDOC")
    private Integer idCbaplctaDPag;

    @Basic
    @Column(name = "ID_CBAPLCTA_DP_PAG", table = "CFATPDOC")
    private Integer idCbaplctaDpPag;

    @Basic
    @Column(name = "ID_CTAHIPAD_L_PAG", table = "CFATPDOC")
    private Integer idCtahipadLPag;

    @Basic
    @Column(name = "ID_CTAHIPAD_J_PAG", table = "CFATPDOC")
    private Integer idCtahipadJPag;

    @Basic
    @Column(name = "ID_CTAHIPAD_D_PAG", table = "CFATPDOC")
    private Integer idCtahipadDPag;

    @Basic
    @Column(name = "ID_CFATPDOC_ESTORNO", table = "CFATPDOC")
    private Integer idCfatpdocEstorno;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "CFATPDOC")
    private Integer idCfaporta;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFATPDOC", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFATPDOC", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFATPDOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFATPDOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFATPDOC")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "CFATPDOC", nullable = false)
    private int codigo;

    @Basic
    @Column(name = "DESCRICAO", table = "CFATPDOC", length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "SIGLA", table = "CFATPDOC", nullable = false, length = 18)
    private String sigla;

    @Basic
    @Column(name = "TIPO", table = "CFATPDOC")
    private String tipo;

    @Basic
    @Column(name = "SISTEMAS", table = "CFATPDOC", length = 18)
    private String sistemas;

    @Basic
    @Column(name = "ESPECIE", table = "CFATPDOC")
    private String especie;

    @Basic
    @Column(name = "GERA_FINAN_CX", table = "CFATPDOC")
    private String geraFinanCx;

    public Integer getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(Integer idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdSmaarqui() {
        return idSmaarqui;
    }

    public void setIdSmaarqui(Integer idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
    }

    public Integer getIdCbaplctaLRec() {
        return idCbaplctaLRec;
    }

    public void setIdCbaplctaLRec(Integer idCbaplctaLRec) {
        this.idCbaplctaLRec = idCbaplctaLRec;
    }

    public Integer getIdCbaplctaJRec() {
        return idCbaplctaJRec;
    }

    public void setIdCbaplctaJRec(Integer idCbaplctaJRec) {
        this.idCbaplctaJRec = idCbaplctaJRec;
    }

    public Integer getIdCbaplctaDRec() {
        return idCbaplctaDRec;
    }

    public void setIdCbaplctaDRec(Integer idCbaplctaDRec) {
        this.idCbaplctaDRec = idCbaplctaDRec;
    }

    public Integer getIdCbaplctaDpRec() {
        return idCbaplctaDpRec;
    }

    public void setIdCbaplctaDpRec(Integer idCbaplctaDpRec) {
        this.idCbaplctaDpRec = idCbaplctaDpRec;
    }

    public Integer getIdCtahipadLRec() {
        return idCtahipadLRec;
    }

    public void setIdCtahipadLRec(Integer idCtahipadLRec) {
        this.idCtahipadLRec = idCtahipadLRec;
    }

    public Integer getIdCtahipadJRec() {
        return idCtahipadJRec;
    }

    public void setIdCtahipadJRec(Integer idCtahipadJRec) {
        this.idCtahipadJRec = idCtahipadJRec;
    }

    public Integer getIdCtahipadDRec() {
        return idCtahipadDRec;
    }

    public void setIdCtahipadDRec(Integer idCtahipadDRec) {
        this.idCtahipadDRec = idCtahipadDRec;
    }

    public Integer getIdCbaplctaLPag() {
        return idCbaplctaLPag;
    }

    public void setIdCbaplctaLPag(Integer idCbaplctaLPag) {
        this.idCbaplctaLPag = idCbaplctaLPag;
    }

    public Integer getIdCbaplctaJPag() {
        return idCbaplctaJPag;
    }

    public void setIdCbaplctaJPag(Integer idCbaplctaJPag) {
        this.idCbaplctaJPag = idCbaplctaJPag;
    }

    public Integer getIdCbaplctaDPag() {
        return idCbaplctaDPag;
    }

    public void setIdCbaplctaDPag(Integer idCbaplctaDPag) {
        this.idCbaplctaDPag = idCbaplctaDPag;
    }

    public Integer getIdCbaplctaDpPag() {
        return idCbaplctaDpPag;
    }

    public void setIdCbaplctaDpPag(Integer idCbaplctaDpPag) {
        this.idCbaplctaDpPag = idCbaplctaDpPag;
    }

    public Integer getIdCtahipadLPag() {
        return idCtahipadLPag;
    }

    public void setIdCtahipadLPag(Integer idCtahipadLPag) {
        this.idCtahipadLPag = idCtahipadLPag;
    }

    public Integer getIdCtahipadJPag() {
        return idCtahipadJPag;
    }

    public void setIdCtahipadJPag(Integer idCtahipadJPag) {
        this.idCtahipadJPag = idCtahipadJPag;
    }

    public Integer getIdCtahipadDPag() {
        return idCtahipadDPag;
    }

    public void setIdCtahipadDPag(Integer idCtahipadDPag) {
        this.idCtahipadDPag = idCtahipadDPag;
    }

    public Integer getIdCfatpdocEstorno() {
        return idCfatpdocEstorno;
    }

    public void setIdCfatpdocEstorno(Integer idCfatpdocEstorno) {
        this.idCfatpdocEstorno = idCfatpdocEstorno;
    }

    public Integer getIdCfaporta() {
        return idCfaporta;
    }

    public void setIdCfaporta(Integer idCfaporta) {
        this.idCfaporta = idCfaporta;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSistemas() {
        return sistemas;
    }

    public void setSistemas(String sistemas) {
        this.sistemas = sistemas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGeraFinanCx() {
        return geraFinanCx;
    }

    public void setGeraFinanCx(String geraFinanCx) {
        this.geraFinanCx = geraFinanCx;
    }

}