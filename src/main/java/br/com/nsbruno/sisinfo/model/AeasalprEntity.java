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
@Table(name = "AEASALPR")
public class AeasalprEntity {

    @Id
    @Column(name = "ID_AEASALPR", table = "AEASALPR", nullable = false)
    private Integer idAeasalpr;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLOJA", table = "AEASALPR", nullable = false)
    private Integer idAeaploja;

    @Basic
    @Column(name = "ID_AEAGRDPL", table = "AEASALPR")
    private Integer idAeagrdpl;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ", table = "AEASALPR", nullable = false)
    private Integer idAeaestoq;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEASALPR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEASALPR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEASALPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEASALPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEASALPR")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_MOVIMENTO", table = "AEASALPR", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Basic
    @Column(name = "DT_INVENTARIO", table = "AEASALPR")
    @Temporal(TemporalType.DATE)
    private Date dtInventario;

    @Basic(optional = false)
    @Column(name = "ENTRADA_C", table = "AEASALPR", nullable = false)
    private double entradaC;

    @Basic(optional = false)
    @Column(name = "ENTRADA_F", table = "AEASALPR", nullable = false)
    private double entradaF;

    @Basic(optional = false)
    @Column(name = "SAIDA_C", table = "AEASALPR", nullable = false)
    private double saidaC;

    @Basic(optional = false)
    @Column(name = "SAIDA_F", table = "AEASALPR", nullable = false)
    private double saidaF;

    @Basic(optional = false)
    @Column(name = "ACERTOS_C", table = "AEASALPR", nullable = false)
    private double acertosC;

    @Basic(optional = false)
    @Column(name = "ACERTOS_F", table = "AEASALPR", nullable = false)
    private double acertosF;

    @Basic(optional = false)
    @Column(name = "PEDIDO", table = "AEASALPR", nullable = false)
    private double pedido;

    @Basic(optional = false)
    @Column(name = "RETIDO", table = "AEASALPR", nullable = false)
    private double retido;

    @Basic(optional = false)
    @Column(name = "INVENTARIO_F", table = "AEASALPR", nullable = false)
    private double inventarioF;

    @Basic(optional = false)
    @Column(name = "INVENTARIO_C", table = "AEASALPR", nullable = false)
    private double inventarioC;

    public Integer getIdAeasalpr() {
        return idAeasalpr;
    }

    public void setIdAeasalpr(Integer idAeasalpr) {
        this.idAeasalpr = idAeasalpr;
    }

    public Integer getIdAeaploja() {
        return idAeaploja;
    }

    public void setIdAeaploja(Integer idAeaploja) {
        this.idAeaploja = idAeaploja;
    }

    public Integer getIdAeagrdpl() {
        return idAeagrdpl;
    }

    public void setIdAeagrdpl(Integer idAeagrdpl) {
        this.idAeagrdpl = idAeagrdpl;
    }

    public Integer getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(Integer idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
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

    public Date getDtMovimento() {
        return dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public Date getDtInventario() {
        return dtInventario;
    }

    public void setDtInventario(Date dtInventario) {
        this.dtInventario = dtInventario;
    }

    public double getEntradaC() {
        return entradaC;
    }

    public void setEntradaC(double entradaC) {
        this.entradaC = entradaC;
    }

    public double getEntradaF() {
        return entradaF;
    }

    public void setEntradaF(double entradaF) {
        this.entradaF = entradaF;
    }

    public double getSaidaC() {
        return saidaC;
    }

    public void setSaidaC(double saidaC) {
        this.saidaC = saidaC;
    }

    public double getSaidaF() {
        return saidaF;
    }

    public void setSaidaF(double saidaF) {
        this.saidaF = saidaF;
    }

    public double getAcertosC() {
        return acertosC;
    }

    public void setAcertosC(double acertosC) {
        this.acertosC = acertosC;
    }

    public double getAcertosF() {
        return acertosF;
    }

    public void setAcertosF(double acertosF) {
        this.acertosF = acertosF;
    }

    public double getPedido() {
        return pedido;
    }

    public void setPedido(double pedido) {
        this.pedido = pedido;
    }

    public double getRetido() {
        return retido;
    }

    public void setRetido(double retido) {
        this.retido = retido;
    }

    public double getInventarioF() {
        return inventarioF;
    }

    public void setInventarioF(double inventarioF) {
        this.inventarioF = inventarioF;
    }

    public double getInventarioC() {
        return inventarioC;
    }

    public void setInventarioC(double inventarioC) {
        this.inventarioC = inventarioC;
    }

}