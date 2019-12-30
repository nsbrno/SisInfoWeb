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
import lombok.Data;

@Entity
@Table(name = "AEACPLNF")
@Data
public class AeacplnfEntity {

    @Id
    @Column(name = "ID_AEACPLNF", table = "AEACPLNF", nullable = false)
    private Integer idAeacplnf;

    @Basic
    @Column(name = "ID_CFAESTAD_PLACA1", table = "AEACPLNF")
    private Integer idCfaestadPlaca1;

    @Basic
    @Column(name = "ID_CFAESTAD_PLACA2", table = "AEACPLNF")
    private Integer idCfaestadPlaca2;

    @Basic
    @Column(name = "ID_CFAESTAD_PLACA3", table = "AEACPLNF")
    private Integer idCfaestadPlaca3;

    @Basic
    @Column(name = "ID_CFACLIFO_TRANSP", table = "AEACPLNF")
    private Integer idCfaclifoTransp;

    @Basic
    @Column(name = "ID_AEAPESOS", table = "AEACPLNF")
    private Integer idAeapesos;

    @Basic
    @Column(name = "ID_CFAENDER", table = "AEACPLNF")
    private Integer idCfaender;

    @Basic
    @Column(name = "ID_AEAORCAM", table = "AEACPLNF")
    private Integer idAeaorcam;

    @Basic
    @Column(name = "ID_AEASAIDA", table = "AEACPLNF")
    private Integer idAeasaida;

    @Basic
    @Column(name = "ID_AEANFSAI", table = "AEACPLNF")
    private Integer idAeanfsai;

    @Basic
    @Column(name = "ID_AEAENTRA", table = "AEACPLNF")
    private Integer idAeaentra;

    @Basic
    @Column(name = "ID_AEAPEDID", table = "AEACPLNF")
    private Integer idAeapedid;

    @Basic
    @Column(name = "ID_CFAVIATR", table = "AEACPLNF")
    private Integer idCfaviatr;

    @Basic
    @Column(name = "ID_AEAROMAN", table = "AEACPLNF")
    private Integer idAearoman;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEACPLNF", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEACPLNF", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEACPLNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEACPLNF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEACPLNF")
    private Integer ctInteg;

    @Lob
    @Basic
    @Column(name = "LOCAL_ENTREGA", table = "AEACPLNF")
    private byte[] localEntrega;

    @Basic
    @Column(name = "TIPO_FRETE", table = "AEACPLNF")
    private String tipoFrete;

    @Basic
    @Column(name = "PLACA1", table = "AEACPLNF", length = 10)
    private String placa1;

    @Basic
    @Column(name = "PLACA2", table = "AEACPLNF", length = 10)
    private String placa2;

    @Basic
    @Column(name = "PLACA3", table = "AEACPLNF", length = 10)
    private String placa3;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEACPLNF", nullable = false)
    private double quantidade;

    @Basic
    @Column(name = "ESPECIE", table = "AEACPLNF", length = 60)
    private String especie;

    @Basic
    @Column(name = "MARCA", table = "AEACPLNF", length = 60)
    private String marca;

    @Basic
    @Column(name = "NUMERO", table = "AEACPLNF", length = 60)
    private String numero;

    @Basic(optional = false)
    @Column(name = "PESO_BRUTO", table = "AEACPLNF", nullable = false)
    private double pesoBruto;

    @Basic(optional = false)
    @Column(name = "PESO_LIQUIDO", table = "AEACPLNF", nullable = false)
    private double pesoLiquido;

    @Basic
    @Column(name = "RNTC", table = "AEACPLNF", length = 20)
    private String rntc;
}