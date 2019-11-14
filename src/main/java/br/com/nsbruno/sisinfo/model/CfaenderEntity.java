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

@Data
@Entity
@Table(name = "CFAENDER")
public class CfaenderEntity {

    @Id
    @Column(name = "ID_CFAENDER", table = "CFAENDER", nullable = false)
    private Integer idCfaender;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CFAENDER")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "CFAENDER")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_CFABAIRO", table = "CFAENDER")
    private Integer idCfabairo;

    @Basic
    @Column(name = "ID_CFALOGRA", table = "CFAENDER")
    private Integer idCfalogra;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "CFAENDER")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFACONTA", table = "CFAENDER")
    private Integer idCfaconta;

    @Basic
    @Column(name = "ID_CFADEPEN", table = "CFAENDER")
    private Integer idCfadepen;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "CFAENDER")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "ID_CFASOCPA", table = "CFAENDER")
    private Integer idCfasocpa;

    @Basic
    @Column(name = "ID_CFAREFCL", table = "CFAENDER")
    private Integer idCfarefcl;

    @Basic
    @Column(name = "ID_CFAREFER", table = "CFAENDER")
    private Integer idCfarefer;

    @Basic
    @Column(name = "ID_APACATEQ", table = "CFAENDER")
    private Integer idApacateq;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAENDER", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAENDER", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAENDER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAENDER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAENDER")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "CFAENDER", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "NUMERO", table = "CFAENDER", length = 6)
    private String numero;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CFAENDER")
    private byte[] complemento;

    @Basic
    @Column(name = "EMAIL", table = "CFAENDER", length = 128)
    private String email;

    @Basic
    @Column(name = "INTERNET", table = "CFAENDER", length = 128)
    private String internet;

    @Basic
    @Column(name = "LETRA_CX_POSTAL", table = "CFAENDER")
    private String letraCxPostal;

    @Basic
    @Column(name = "CAIXA_POSTAL", table = "CFAENDER")
    private Integer caixaPostal;

    @Basic
    @Column(name = "LOGRADOURO", table = "CFAENDER", length = 60)
    private String logradouro;

    @Basic
    @Column(name = "CEP", table = "CFAENDER", length = 9)
    private String cep;

    @Basic
    @Column(name = "CEP_CAIXA_POSTAL", table = "CFAENDER", length = 9)
    private String cepCaixaPostal;
}