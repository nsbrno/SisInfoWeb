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
@Table(name = "AEAPRFOR")
public class AeaprforEntity {

    @Id
    @Column(name = "ID_AEAPRFOR", table = "AEAPRFOR", nullable = false)
    private Integer idAeaprfor;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "AEAPRFOR")
    private Integer idAeaprodu;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "AEAPRFOR")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_AEAUNVEN", table = "AEAPRFOR")
    private Integer idAeaunven;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPRFOR", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPRFOR", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPRFOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPRFOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPRFOR")
    private Integer ctInteg;

    @Basic
    @Column(name = "DT_ULT_COMPRA", table = "AEAPRFOR")
    @Temporal(TemporalType.DATE)
    private Date dtUltCompra;

    @Basic(optional = false)
    @Column(name = "NUM_COMPRAS", table = "AEAPRFOR", nullable = false)
    private int numCompras;

    @Basic(optional = false)
    @Column(name = "PED_ENTREGA", table = "AEAPRFOR", nullable = false)
    private int pedEntrega;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAPRFOR", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "AEAPRFOR", nullable = false)
    private double valor;

    @Basic
    @Column(name = "REFERENCIA", table = "AEAPRFOR", length = 20)
    private String referencia;

    @Basic
    @Column(name = "CODIGO_BARRAS", table = "AEAPRFOR", length = 20)
    private String codigoBarras;

    @Basic
    @Column(name = "UN_IN", table = "AEAPRFOR", length = 5)
    private String unIn;

    @Basic(optional = false)
    @Column(name = "MODULO", table = "AEAPRFOR", nullable = false)
    private double modulo;

    @Basic
    @Column(name = "CODIGO", table = "AEAPRFOR")
    private Integer codigo;

    public Integer getIdAeaprfor() {
        return idAeaprfor;
    }

    public void setIdAeaprfor(Integer idAeaprfor) {
        this.idAeaprfor = idAeaprfor;
    }

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdCfaclifo() {
        return idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
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

    public Date getDtUltCompra() {
        return dtUltCompra;
    }

    public void setDtUltCompra(Date dtUltCompra) {
        this.dtUltCompra = dtUltCompra;
    }

    public int getNumCompras() {
        return numCompras;
    }

    public void setNumCompras(int numCompras) {
        this.numCompras = numCompras;
    }

    public int getPedEntrega() {
        return pedEntrega;
    }

    public void setPedEntrega(int pedEntrega) {
        this.pedEntrega = pedEntrega;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getUnIn() {
        return unIn;
    }

    public void setUnIn(String unIn) {
        this.unIn = unIn;
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}