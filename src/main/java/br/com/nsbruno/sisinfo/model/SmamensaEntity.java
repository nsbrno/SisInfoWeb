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
@Table(name = "SMAMENSA")
@Data
public class SmamensaEntity {

    @Id
    @Column(name = "ID_SMAMENSA", table = "SMAMENSA", nullable = false)
    private Integer idSmamensa;

    @Basic
    @Column(name = "ID_SMAMENSA_ORIGINAL", table = "SMAMENSA")
    private Integer idSmamensaOriginal;

    @Basic
    @Column(name = "ID_SMAUSUAR_FROM", table = "SMAMENSA")
    private Integer idSmausuarFrom;

    @Basic
    @Column(name = "ID_SMAUSUAR_TO", table = "SMAMENSA")
    private Integer idSmausuarTo;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAMENSA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAMENSA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAMENSA")
    private Integer ctInteg;

    @Basic
    @Column(name = "DATA_GERADO", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataGerado;

    @Basic
    @Column(name = "DATA_ENVIO", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEnvio;

    @Basic
    @Column(name = "DATA_LEITURA", table = "SMAMENSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataLeitura;

    @Basic
    @Column(name = "ARQUIVO", table = "SMAMENSA", length = 13)
    private String arquivo;

    @Basic
    @Column(name = "ID_ARQUIVO", table = "SMAMENSA")
    private Integer idArquivo;

    @Basic
    @Column(name = "TIPO_MENSAGEM", table = "SMAMENSA")
    private Integer tipoMensagem;

    @Basic
    @Column(name = "STATUS", table = "SMAMENSA")
    private String status;

    @Basic
    @Column(name = "MSG_FROM", table = "SMAMENSA", length = 128)
    private String msgFrom;

    @Basic
    @Column(name = "MSG_TO", table = "SMAMENSA", length = 128)
    private String msgTo;

    @Basic
    @Column(name = "ASSUNTO", table = "SMAMENSA", length = 128)
    private String assunto;

    @Lob
    @Basic
    @Column(name = "MENSAGEM", table = "SMAMENSA")
    private byte[] mensagem;
}