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
@Table(name = "CBAPLCTA")
public class CbaplctaEntity {

    @Id
    @Column(name = "ID_CBAPLCTA", table = "CBAPLCTA", nullable = false)
    private Integer idCbaplcta;

    @Basic(optional = false)
    @Column(name = "ID_CTAGRUPO", table = "CBAPLCTA", nullable = false)
    private int idCtagrupo;

    @Basic
    @Column(name = "ID_CBAPLCTA_ANT", table = "CBAPLCTA")
    private Integer idCbaplctaAnt;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBAPLCTA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBAPLCTA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CBAPLCTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBAPLCTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CBAPLCTA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "COD_REDUZ", table = "CBAPLCTA", nullable = false)
    private int codReduz;

    @Basic(optional = false)
    @Column(name = "COD_ESTRUTURAL", table = "CBAPLCTA", nullable = false, length = 26)
    private String codEstrutural;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "CBAPLCTA", nullable = false, length = 50)
    private String descricao;

    @Basic
    @Column(name = "SIGLA", table = "CBAPLCTA", length = 18)
    private String sigla;

    @Basic
    @Column(name = "TIPOS", table = "CBAPLCTA", length = 18)
    private String tipos;

    @Basic
    @Column(name = "SUGERE_CONCI", table = "CBAPLCTA")
    private String sugereConci;

    @Basic
    @Column(name = "VALOR_ZERO", table = "CBAPLCTA")
    private String valorZero;

    @Basic
    @Column(name = "EMITE_RECIBO", table = "CBAPLCTA")
    private String emiteRecibo;

    @Basic
    @Column(name = "PEDE_PRE_DATA", table = "CBAPLCTA")
    private String pedePreData;

    @Basic
    @Column(name = "REQUER_HIST", table = "CBAPLCTA")
    private String requerHist;

    @Basic
    @Column(name = "SISTEMAS", table = "CBAPLCTA", length = 18)
    private String sistemas;

    @Basic
    @Column(name = "SUGERE_CHEQUE", table = "CBAPLCTA")
    private String sugereCheque;

    @Basic
    @Column(name = "REQUER_FAVO", table = "CBAPLCTA")
    private String requerFavo;

    @Basic
    @Column(name = "USA_NATDC", table = "CBAPLCTA")
    private String usaNatdc;

    @Basic
    @Column(name = "USA_CONTA", table = "CBAPLCTA")
    private String usaConta;

    @Basic
    @Column(name = "USA_DOCTO", table = "CBAPLCTA")
    private String usaDocto;

    @Basic
    @Column(name = "USA_HISTO", table = "CBAPLCTA")
    private String usaHisto;

    @Basic(optional = false)
    @Column(name = "A_S", table = "CBAPLCTA", nullable = false)
    private String a_S;

    @Basic(optional = false)
    @Column(name = "D_C", table = "CBAPLCTA", nullable = false)
    private String dC;

    @Basic(optional = false)
    @Column(name = "DG", table = "CBAPLCTA", nullable = false)
    private String dg;

    @Basic(optional = false)
    @Column(name = "NIVEL", table = "CBAPLCTA", nullable = false)
    private int nivel;

    @Lob
    @Basic
    @Column(name = "OBS", table = "CBAPLCTA")
    private byte[] obs;

    public Integer getIdCbaplcta() {
        return idCbaplcta;
    }

    public void setIdCbaplcta(Integer idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public int getIdCtagrupo() {
        return idCtagrupo;
    }

    public void setIdCtagrupo(int idCtagrupo) {
        this.idCtagrupo = idCtagrupo;
    }

    public Integer getIdCbaplctaAnt() {
        return idCbaplctaAnt;
    }

    public void setIdCbaplctaAnt(Integer idCbaplctaAnt) {
        this.idCbaplctaAnt = idCbaplctaAnt;
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

    public int getCodReduz() {
        return codReduz;
    }

    public void setCodReduz(int codReduz) {
        this.codReduz = codReduz;
    }

    public String getCodEstrutural() {
        return codEstrutural;
    }

    public void setCodEstrutural(String codEstrutural) {
        this.codEstrutural = codEstrutural;
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

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getSugereConci() {
        return sugereConci;
    }

    public void setSugereConci(String sugereConci) {
        this.sugereConci = sugereConci;
    }

    public String getValorZero() {
        return valorZero;
    }

    public void setValorZero(String valorZero) {
        this.valorZero = valorZero;
    }

    public String getEmiteRecibo() {
        return emiteRecibo;
    }

    public void setEmiteRecibo(String emiteRecibo) {
        this.emiteRecibo = emiteRecibo;
    }

    public String getPedePreData() {
        return pedePreData;
    }

    public void setPedePreData(String pedePreData) {
        this.pedePreData = pedePreData;
    }

    public String getRequerHist() {
        return requerHist;
    }

    public void setRequerHist(String requerHist) {
        this.requerHist = requerHist;
    }

    public String getSistemas() {
        return sistemas;
    }

    public void setSistemas(String sistemas) {
        this.sistemas = sistemas;
    }

    public String getSugereCheque() {
        return sugereCheque;
    }

    public void setSugereCheque(String sugereCheque) {
        this.sugereCheque = sugereCheque;
    }

    public String getRequerFavo() {
        return requerFavo;
    }

    public void setRequerFavo(String requerFavo) {
        this.requerFavo = requerFavo;
    }

    public String getUsaNatdc() {
        return usaNatdc;
    }

    public void setUsaNatdc(String usaNatdc) {
        this.usaNatdc = usaNatdc;
    }

    public String getUsaConta() {
        return usaConta;
    }

    public void setUsaConta(String usaConta) {
        this.usaConta = usaConta;
    }

    public String getUsaDocto() {
        return usaDocto;
    }

    public void setUsaDocto(String usaDocto) {
        this.usaDocto = usaDocto;
    }

    public String getUsaHisto() {
        return usaHisto;
    }

    public void setUsaHisto(String usaHisto) {
        this.usaHisto = usaHisto;
    }

    public String getA_S() {
        return a_S;
    }

    public void setA_S(String a_S) {
        this.a_S = a_S;
    }

    public String getDC() {
        return dC;
    }

    public void setDC(String dC) {
        this.dC = dC;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}