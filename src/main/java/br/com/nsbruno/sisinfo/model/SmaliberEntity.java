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
@Table(name = "SMALIBER")
@Data
public class SmaliberEntity {

    @Id
    @Column(name = "ID_SMALIBER", table = "SMALIBER", nullable = false)
    private Integer idSmaliber;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMALIBER", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMALIBER", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMALIBER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMALIBER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMALIBER")
    private Integer ctInteg;

    @Basic
    @Column(name = "ARQUIVO", table = "SMALIBER", length = 12)
    private String arquivo;

    @Basic(optional = false)
    @Column(name = "ID_ARQUIVO", table = "SMALIBER", nullable = false)
    private Integer idArquivo;

    @Basic
    @Column(name = "COD_TRANSACAO", table = "SMALIBER")
    private Integer codTransacao;

    @Basic
    @Column(name = "LIBERADO", table = "SMALIBER")
    private String liberado;

    @Basic
    @Column(name = "BLOQUEADO", table = "SMALIBER")
    private String bloqueado;

    @Basic
    @Column(name = "GERADO_AUTOMATICO", table = "SMALIBER")
    private String geradoAutomatico;

    @Basic
    @Column(name = "DT_LIBERADO_ATE", table = "SMALIBER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtLiberadoAte;

    @Basic
    @Column(name = "DT_BLOQUEADO_ATE", table = "SMALIBER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtBloqueadoAte;

    @Basic
    @Column(name = "OBS", table = "SMALIBER", length = 128)
    private String obs;
}