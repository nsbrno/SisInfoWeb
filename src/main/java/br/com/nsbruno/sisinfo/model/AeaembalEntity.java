package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


@Entity
@Table(name = "AEAEMBAL")
@Data
public class AeaembalEntity {

    @Id
    @Column(name = "ID_AEAEMBAL", table = "AEAEMBAL", nullable = false)
    private Integer idAeaembal;

    @Basic(optional = false)
    @Column(name = "ID_AEAPRODU", table = "AEAEMBAL", nullable = false)
    private Integer idAeaprodu;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAEMBAL", nullable = false)
    private Integer idAeaunven;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAEMBAL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAEMBAL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAEMBAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAEMBAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAEMBAL")
    private Integer ctInteg;

    @Basic
    @Column(name = "PRINCIPAL", table = "AEAEMBAL")
    private String principal;

    @Basic
    @Column(name = "DESCRICAO", table = "AEAEMBAL", length = 40)
    private String descricao;

    @Basic(optional = false)
    @Column(name = "FATOR_CONVERSAO", table = "AEAEMBAL", nullable = false)
    private double fatorConversao;

    @Basic(optional = false)
    @Column(name = "FATOR_PRECO", table = "AEAEMBAL", nullable = false)
    private double fatorPreco;

    @Basic(optional = false)
    @Column(name = "MODULO", table = "AEAEMBAL", nullable = false)
    private Integer modulo;

    @Basic(optional = false)
    @Column(name = "DECIMAIS", table = "AEAEMBAL", nullable = false)
    private Integer decimais;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAEMBAL", nullable = false)
    private String ativo;

    @Basic
    @Column(name = "CODIGO_BARRAS", table = "AEAEMBAL", length = 20)
    private String codigoBarras;

    @Basic
    @Column(name = "REFERENCIA", table = "AEAEMBAL", length = 20)
    private String referencia;

    @Basic
    @Column(name = "TIPO_CALC_TOTAL", table = "AEAEMBAL")
    private String tipoCalcTotal;
}