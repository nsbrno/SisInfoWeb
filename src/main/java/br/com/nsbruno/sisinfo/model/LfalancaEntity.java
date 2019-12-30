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
@Table(name = "LFALANCA")
@Data
public class LfalancaEntity {

    @Id
    @Column(name = "ID_LFALANCA", table = "LFALANCA", nullable = false)
    private Integer idLfalanca;

    @Basic
    @Column(name = "ID_CFACLIFO", table = "LFALANCA")
    private Integer idCfaclifo;

    @Basic
    @Column(name = "US_CAD", table = "LFALANCA", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "LFALANCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "LFALANCA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "LFALANCA")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "LFALANCA", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "TIPO", table = "LFALANCA")
    private String tipo;

    @Basic
    @Column(name = "A_E", table = "LFALANCA")
    private String aE;

    @Basic
    @Column(name = "NUMERO", table = "LFALANCA")
    private Integer numero;

    @Basic
    @Column(name = "NUMERO_INI", table = "LFALANCA")
    private Integer numeroIni;

    @Basic
    @Column(name = "DT_EMISSAO", table = "LFALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_ENTRADA", table = "LFALANCA")
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;

    @Basic
    @Column(name = "IE_RG", table = "LFALANCA", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "CPF_CGC", table = "LFALANCA", length = 18)
    private String cpfCgc;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_IPI", table = "LFALANCA", nullable = false)
    private double aliquotaIpi;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS", table = "LFALANCA", nullable = false)
    private double aliquotaIcms;

    @Basic(optional = false)
    @Column(name = "VL_CONT_IPI", table = "LFALANCA", nullable = false)
    private double vlContIpi;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC_IPI", table = "LFALANCA", nullable = false)
    private double vlBaseCalcIpi;

    @Basic(optional = false)
    @Column(name = "VL_IMP_IPI", table = "LFALANCA", nullable = false)
    private double vlImpIpi;

    @Basic(optional = false)
    @Column(name = "VL_ISE_IPI", table = "LFALANCA", nullable = false)
    private double vlIseIpi;

    @Basic(optional = false)
    @Column(name = "VL_OUT_IPI", table = "LFALANCA", nullable = false)
    private double vlOutIpi;

    @Basic(optional = false)
    @Column(name = "VL_EXT_IPI", table = "LFALANCA", nullable = false)
    private double vlExtIpi;

    @Basic(optional = false)
    @Column(name = "VL_CONT_ICMS", table = "LFALANCA", nullable = false)
    private double vlContIcms;

    @Basic(optional = false)
    @Column(name = "VL_BASE_CALC_ICMS", table = "LFALANCA", nullable = false)
    private double vlBaseCalcIcms;

    @Basic(optional = false)
    @Column(name = "VL_IMP_ICMS", table = "LFALANCA", nullable = false)
    private double vlImpIcms;

    @Basic(optional = false)
    @Column(name = "VL_ISE_ICMS", table = "LFALANCA", nullable = false)
    private double vlIseIcms;

    @Basic(optional = false)
    @Column(name = "VL_OUT_ICMS", table = "LFALANCA", nullable = false)
    private double vlOutIcms;

    @Basic(optional = false)
    @Column(name = "VL_EXT_ICMS", table = "LFALANCA", nullable = false)
    private double vlExtIcms;

    @Basic
    @Column(name = "FECHADO", table = "LFALANCA")
    private String fechado;

    @Lob
    @Basic
    @Column(name = "OBS", table = "LFALANCA")
    private byte[] obs;
}