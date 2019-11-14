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

@Data
@Entity
@Table(name = "SMAUSURL")
public class SmausurlEntity {

    @Id
    @Column(name = "ID_SMAUSURL", table = "SMAUSURL", nullable = false)
    private Integer idSmausurl;

    @Basic
    @Column(name = "ID_SMAARQUI", table = "SMAUSURL")
    private Integer idSmaarqui;

    @Basic
    @Column(name = "ID_SMARELAT", table = "SMAUSURL")
    private Integer idSmarelat;

    @Basic
    @Column(name = "ID_SMAUSUAR", table = "SMAUSURL")
    private Integer idSmausuar;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAUSURL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAUSURL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAUSURL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAUSURL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAUSURL")
    private Integer ctInteg;

    @Basic
    @Column(name = "COMANDO_IMPRESSAO", table = "SMAUSURL", length = 40)
    private String comandoImpressao;

    @Basic
    @Column(name = "PEDE_SAIDA", table = "SMAUSURL")
    private String pedeSaida;

    @Basic
    @Column(name = "SALVA_TELA", table = "SMAUSURL")
    private String salvaTela;

    @Basic
    @Column(name = "TIPO", table = "SMAUSURL")
    private String tipo;

    @Basic
    @Column(name = "USUARIO_CONFIGURA", table = "SMAUSURL")
    private String usuarioConfigura;

    @Basic(optional = false)
    @Column(name = "COPIAS", table = "SMAUSURL", nullable = false)
    private Integer copias;
}