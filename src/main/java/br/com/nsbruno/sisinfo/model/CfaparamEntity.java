package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "CFAPARAM", uniqueConstraints = @UniqueConstraint(columnNames = {"ID_SMAEMPRE", "ID_CFACLIFO"}))
public class CfaparamEntity {

    @Id
    @Column(name = "ID_CFAPARAM", table = "CFAPARAM", nullable = false)
    private Integer idCfaparam;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO", table = "CFAPARAM", nullable = false)
    private Integer idCfaclifo;

    @Basic(optional = false)
    @Column(name = "ID_SMAEMPRE", table = "CFAPARAM", nullable = false)
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFACLIFO_VENDE", table = "CFAPARAM")
    private Integer idCfaclifoVende;

    @Basic
    @Column(name = "ID_CFACLIFO_CONVENIO", table = "CFAPARAM")
    private Integer idCfaclifoConvenio;

    @Basic
    @Column(name = "ID_CFACLIFO_INDICOU", table = "CFAPARAM")
    private Integer idCfaclifoIndicou;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "CFAPARAM")
    private Integer idCfamoeda;

    @Basic
    @Column(name = "ID_CFATPCOB", table = "CFAPARAM")
    private Integer idCfatpcob;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "CFAPARAM")
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CBAPLCTA", table = "CFAPARAM")
    private Integer idCbaplcta;

    @Basic
    @Column(name = "ID_CBACTCUS", table = "CFAPARAM")
    private Integer idCbactcus;

    @Basic
    @Column(name = "ID_CFATPDOC", table = "CFAPARAM")
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_AEAFORMA", table = "CFAPARAM")
    private Integer idAeaforma;

    @Basic
    @Column(name = "ID_AEAPLPGT", table = "CFAPARAM")
    private Integer idAeaplpgt;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CFAPARAM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CFAPARAM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CFAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CFAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CFAPARAM")
    private Integer ctInteg;

    @Basic
    @Column(name = "VENDE_ATRAZADO", table = "CFAPARAM")
    private String vendeAtrazado;

    @Basic
    @Column(name = "DEBITO_EM_CONTA", table = "CFAPARAM")
    private String debitoEmConta;

    @Basic(optional = false)
    @Column(name = "LIMITE", table = "CFAPARAM", nullable = false)
    private double limite;

    @Basic(optional = false)
    @Column(name = "DESC_ATAC_VISTA", table = "CFAPARAM", nullable = false)
    private double descAtacVista;

    @Basic(optional = false)
    @Column(name = "DESC_ATAC_PRAZO", table = "CFAPARAM", nullable = false)
    private double descAtacPrazo;

    @Basic(optional = false)
    @Column(name = "DESC_VARE_VISTA", table = "CFAPARAM", nullable = false)
    private double descVareVista;

    @Basic(optional = false)
    @Column(name = "DESC_VARE_PRAZO", table = "CFAPARAM", nullable = false)
    private double descVarePrazo;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_VISTA", table = "CFAPARAM", nullable = false)
    private double descServVista;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_PRAZO", table = "CFAPARAM", nullable = false)
    private double descServPrazo;

    @Basic
    @Column(name = "DESC_PROMOCAO", table = "CFAPARAM")
    private String descPromocao;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO1", table = "CFAPARAM", nullable = false)
    private Integer diaVencto1;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO2", table = "CFAPARAM", nullable = false)
    private Integer diaVencto2;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO3", table = "CFAPARAM", nullable = false)
    private Integer diaVencto3;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO4", table = "CFAPARAM", nullable = false)
    private Integer diaVencto4;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO_SEMANA1", table = "CFAPARAM", nullable = false)
    private Integer diaVenctoSemana1;

    @Basic(optional = false)
    @Column(name = "DIA_VENCTO_SEMANA2", table = "CFAPARAM", nullable = false)
    private Integer diaVenctoSemana2;

    @Basic(optional = false)
    @Column(name = "ROTEIRO", table = "CFAPARAM", nullable = false)
    private Integer roteiro;

    @Basic(optional = false)
    @Column(name = "FREQUENCIA", table = "CFAPARAM", nullable = false)
    private Integer frequencia;

    @Basic(optional = false)
    @Column(name = "POSICAO_ROTEIRO", table = "CFAPARAM", nullable = false)
    private Integer posicaoRoteiro;

    @Basic
    @Column(name = "DT_ULT_COMPRA", table = "CFAPARAM")
    @Temporal(TemporalType.DATE)
    private Date dtUltCompra;

    @Basic
    @Column(name = "DT_ULT_VISITA", table = "CFAPARAM")
    @Temporal(TemporalType.DATE)
    private Date dtUltVisita;

    @Basic
    @Column(name = "DT_ULT_ENVIO", table = "CFAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltEnvio;

    @Basic
    @Column(name = "DT_ULT_RECEBTO", table = "CFAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltRecebto;

    @Basic
    @Column(name = "DT_PROXIMO_CONTATO", table = "CFAPARAM")
    @Temporal(TemporalType.DATE)
    private Date dtProximoContato;

    @Basic(optional = false)
    @Column(name = "PERC_REDUC_FAT_ATAC", table = "CFAPARAM", nullable = false)
    private double percReducFatAtac;

    @Basic(optional = false)
    @Column(name = "PERC_REDUC_FAT_VARE", table = "CFAPARAM", nullable = false)
    private double percReducFatVare;

    @Basic(optional = false)
    @Column(name = "VALOR_MINIMO_AGRUP", table = "CFAPARAM", nullable = false)
    private double valorMinimoAgrup;

    @Basic(optional = false)
    @Column(name = "VALOR_MAXIMO_AGRUP", table = "CFAPARAM", nullable = false)
    private double valorMaximoAgrup;

    @Basic(optional = false)
    @Column(name = "DIAS_ATRAZO", table = "CFAPARAM", nullable = false)
    private Integer diasAtrazo;

    @Basic(optional = false)
    @Column(name = "DIAS_CARENCIA", table = "CFAPARAM", nullable = false)
    private Integer diasCarencia;

    @Basic(optional = false)
    @Column(name = "JUROS_DIARIO", table = "CFAPARAM", nullable = false)
    private double jurosDiario;

    @Basic
    @Column(name = "ATACADO_VAREJO", table = "CFAPARAM")
    private String atacadoVarejo;

    @Basic
    @Column(name = "VISTA_PRAZO", table = "CFAPARAM")
    private String vistaPrazo;

    @Basic
    @Column(name = "FATURA_VL_MIN", table = "CFAPARAM")
    private String faturaVlMin;

    @Basic
    @Column(name = "PARCELA_EM_ABERTO", table = "CFAPARAM")
    private String parcelaEmAberto;

    @Basic
    @Column(name = "CAPITALIZA", table = "CFAPARAM")
    private String capitaliza;

    @Basic
    @Column(name = "BLOQUEIA_TIT", table = "CFAPARAM")
    private String bloqueiaTit;

    @Basic
    @Column(name = "BLOQUEIA_BOL", table = "CFAPARAM")
    private String bloqueiaBol;

    @Basic
    @Column(name = "BLOQUEIA_REQ", table = "CFAPARAM")
    private String bloqueiaReq;

    @Basic
    @Column(name = "BLOQUEIA_CHQ", table = "CFAPARAM")
    private String bloqueiaChq;

    @Basic(optional = false)
    @Column(name = "JUROS_FACTORY", table = "CFAPARAM", nullable = false)
    private double jurosFactory;

    @Basic
    @Column(name = "FUNCOES_MOBILE", table = "CFAPARAM", length = 18)
    private String funcoesMobile;
}