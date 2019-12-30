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
@Table(name = "SMAITARQ")
@Data
public class SmaitarqEntity {

    @Id
    @Column(name = "ID_SMAITARQ", table = "SMAITARQ", nullable = false)
    private Integer idSmaitarq;

    @Basic(optional = false)
    @Column(name = "ID_SMAARQUI", table = "SMAITARQ", nullable = false)
    private Integer idSmaarqui;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAITARQ", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAITARQ", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAITARQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAITARQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAITARQ")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "CAMPO", table = "SMAITARQ", nullable = false, length = 40)
    private String campo;

    @Lob
    @Basic
    @Column(name = "INDICE", table = "SMAITARQ")
    private byte[] indice;

    @Basic
    @Column(name = "DATATYPE", table = "SMAITARQ", length = 2)
    private String datatype;

    @Basic
    @Column(name = "AUTOFIND", table = "SMAITARQ")
    private String autofind;

    @Basic
    @Column(name = "CAPSLOCK", table = "SMAITARQ")
    private String capslock;

    @Basic
    @Column(name = "REQUERIDO", table = "SMAITARQ")
    private String requerido;

    @Basic(optional = false)
    @Column(name = "TAMANHO", table = "SMAITARQ", nullable = false)
    private Integer tamanho;

    @Basic(optional = false)
    @Column(name = "DECIMAIS", table = "SMAITARQ", nullable = false)
    private Integer decimais;

    @Lob
    @Basic
    @Column(name = "MSGERRO", table = "SMAITARQ")
    private byte[] msgerro;

    @Lob
    @Basic
    @Column(name = "MSGEXPLICATIVA", table = "SMAITARQ")
    private byte[] msgexplicativa;

    @Lob
    @Basic
    @Column(name = "VALORDEFAULT", table = "SMAITARQ")
    private byte[] valordefault;

    @Lob
    @Basic
    @Column(name = "OPCAOTELA", table = "SMAITARQ")
    private byte[] opcaotela;

    @Lob
    @Basic
    @Column(name = "OPCAOBASE", table = "SMAITARQ")
    private byte[] opcaobase;

    @Basic
    @Column(name = "FOUNDREQUERIDO", table = "SMAITARQ")
    private String foundrequerido;

    @Lob
    @Basic
    @Column(name = "NOMECAMPO", table = "SMAITARQ")
    private byte[] nomecampo;

    @Basic
    @Column(name = "MASCARA", table = "SMAITARQ")
    private String mascara;

    @Basic
    @Column(name = "INDICENATIVO", table = "SMAITARQ")
    private String indicenativo;
}