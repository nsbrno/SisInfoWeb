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
@Table(name = "AEABICOS")
@Data
public class AeabicosEntity {

    @Id
    @Column(name = "ID_AEABICOS", table = "AEABICOS", nullable = false)
    private Integer idAeabicos;

    @Basic(optional = false)
    @Column(name = "ID_AEATANQU", table = "AEABICOS", nullable = false)
    private Integer idAeatanqu;

    @Basic(optional = false)
    @Column(name = "ID_AEABOMBA", table = "AEABICOS", nullable = false)
    private Integer idAeabomba;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEABICOS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEABICOS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEABICOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEABICOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEABICOS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "AEABICOS", nullable = false)
    private Integer numero;

    @Basic(optional = false)
    @Column(name = "CONTADOR", table = "AEABICOS", nullable = false)
    private double contador;

    @Basic(optional = false)
    @Column(name = "PRECO", table = "AEABICOS", nullable = false)
    private double preco;
}