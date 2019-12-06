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
@Table(name = "AEACONJT")
public class AeaconjtEntity {

    @Id
    @Column(name = "ID_AEACONJT", table = "AEACONJT", nullable = false)
    private Integer idAeaconjt;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEACONJT", nullable = false)
    private int idAeaprodu;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU_ITEM", table = "AEACONJT", nullable = false)
    private int idAeaproduItem;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEACONJT", nullable = false)
    private int idAeaunven;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACONJT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACONJT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACONJT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACONJT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACONJT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "AEACONJT", nullable = false)
    private String tipo;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEACONJT", nullable = false)
    private int sequencia;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEACONJT", nullable = false)
    private double quantidade;

    public Integer getIdAeaconjt() {
        return idAeaconjt;
    }

    public void setIdAeaconjt(Integer idAeaconjt) {
        this.idAeaconjt = idAeaconjt;
    }

    public int getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(int idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public int getIdAeaproduItem() {
        return idAeaproduItem;
    }

    public void setIdAeaproduItem(int idAeaproduItem) {
        this.idAeaproduItem = idAeaproduItem;
    }

    public int getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
        this.idAeaunven = idAeaunven;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}