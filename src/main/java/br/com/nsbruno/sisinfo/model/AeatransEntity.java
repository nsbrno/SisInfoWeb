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
@Table(name = "AEATRANS")
public class AeatransEntity {

    @Id
    @Column(name = "ID_AEATRANS", table = "AEATRANS", nullable = false)
    private Integer idAeatrans;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "AEATRANS", nullable = false)
    private int idSmaempre;

    @Basic
    @Column(name = "ID_SMAEMPRE_D", table = "AEATRANS")
    private Integer idSmaempreD;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEATRANS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEATRANS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEATRANS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEATRANS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEATRANS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEATRANS", nullable = false)
    private int codigo;

    @Basic(optional = false)
    @Column(name = "DT_TRANSF", table = "AEATRANS", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtTransf;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEATRANS")
    private byte[] obs;

    @Basic(optional = false)
    @Column(name = "ABERTO", table = "AEATRANS", nullable = false)
    private String aberto;

    @Basic
    @Column(name = "EST_ORIGEM", table = "AEATRANS")
    private String estOrigem;

    @Basic
    @Column(name = "EST_DESTINO", table = "AEATRANS")
    private String estDestino;

    @Basic
    @Column(name = "PLACA", table = "AEATRANS", length = 10)
    private String placa;

    @Basic
    @Column(name = "MOTORISTA", table = "AEATRANS", length = 60)
    private String motorista;

    @Basic
    @Column(name = "DOCUMENTO", table = "AEATRANS", length = 26)
    private String documento;

    public Integer getIdAeatrans() {
        return idAeatrans;
    }

    public void setIdAeatrans(Integer idAeatrans) {
        this.idAeatrans = idAeatrans;
    }

    public int getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdSmaempreD() {
        return idSmaempreD;
    }

    public void setIdSmaempreD(Integer idSmaempreD) {
        this.idSmaempreD = idSmaempreD;
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

    public Date getDtTransf() {
        return dtTransf;
    }

    public void setDtTransf(Date dtTransf) {
        this.dtTransf = dtTransf;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getAberto() {
        return aberto;
    }

    public void setAberto(String aberto) {
        this.aberto = aberto;
    }

    public String getEstOrigem() {
        return estOrigem;
    }

    public void setEstOrigem(String estOrigem) {
        this.estOrigem = estOrigem;
    }

    public String getEstDestino() {
        return estDestino;
    }

    public void setEstDestino(String estDestino) {
        this.estDestino = estDestino;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

}