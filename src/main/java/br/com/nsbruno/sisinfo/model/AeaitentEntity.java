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


@Entity
@Table(name = "AEAITENT")
public class AeaitentEntity {

    @Id
    @Column(name = "ID_AEAITENT", table = "AEAITENT", nullable = false)
    private Integer idAeaitent;

    @Basic(optional = false)
    @Column(name = "ID_AEAENTRA", table = "AEAITENT", nullable = false)
    private int idAeaentra;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAITENT", nullable = false)
    private int idAeaunven;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ", table = "AEAITENT", nullable = false)
    private int idAeaestoq;

    @Basic
    @Column(name = "ID_AEAITNFS", table = "AEAITENT")
    private Integer idAeaitnfs;

    @Basic
    @Column(name = "ID_AEAITSAI", table = "AEAITENT")
    private Integer idAeaitsai;

    @Basic(optional = false)
    @Column(name = "ID_CFANATOP", table = "AEAITENT", nullable = false)
    private int idCfanatop;

    @Basic
    @Column(name = "ID_AEAITPED", table = "AEAITENT")
    private Integer idAeaitped;

    @Basic
    @Column(name = "ID_AEACODOM", table = "AEAITENT")
    private Integer idAeacodom;

    @Basic
    @Column(name = "ID_AEACODST", table = "AEAITENT")
    private Integer idAeacodst;

    @Basic
    @Column(name = "ID_AEACODST_IPI", table = "AEAITENT")
    private Integer idAeacodstIpi;

    @Basic
    @Column(name = "ID_AEACODST_PIS", table = "AEAITENT")
    private Integer idAeacodstPis;

    @Basic
    @Column(name = "ID_AEACODST_COFINS", table = "AEAITENT")
    private Integer idAeacodstCofins;

    @Basic
    @Column(name = "ID_AEATANQU", table = "AEAITENT")
    private Integer idAeatanqu;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITENT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITENT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITENT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_ENTRADA", table = "AEAITENT", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEAITENT", nullable = false)
    private int sequencia;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITENT", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "QTDE_DAT_VAL", table = "AEAITENT", nullable = false)
    private double qtdeDatVal;

    @Basic(optional = false)
    @Column(name = "QTDE_CONFERIDO", table = "AEAITENT", nullable = false)
    private double qtdeConferido;

    @Basic(optional = false)
    @Column(name = "VL_MERCADORIA", table = "AEAITENT", nullable = false)
    private double vlMercadoria;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "AEAITENT", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_FRETE", table = "AEAITENT", nullable = false)
    private double vlFrete;

    @Basic(optional = false)
    @Column(name = "VL_SEGURO", table = "AEAITENT", nullable = false)
    private double vlSeguro;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS", table = "AEAITENT", nullable = false)
    private double vlOutros;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_FRETE", table = "AEAITENT", nullable = false)
    private double vlBaseIcmsFrete;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_MERC", table = "AEAITENT", nullable = false)
    private double vlBaseIcmsMerc;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_SUBST", table = "AEAITENT", nullable = false)
    private double vlBaseIcmsSubst;

    @Basic(optional = false)
    @Column(name = "VL_BASE_IPI", table = "AEAITENT", nullable = false)
    private double vlBaseIpi;

    @Basic(optional = false)
    @Column(name = "VL_BASE_PIS", table = "AEAITENT", nullable = false)
    private double vlBasePis;

    @Basic(optional = false)
    @Column(name = "VL_BASE_PIS_ST", table = "AEAITENT", nullable = false)
    private double vlBasePisSt;

    @Basic(optional = false)
    @Column(name = "VL_BASE_COFINS", table = "AEAITENT", nullable = false)
    private double vlBaseCofins;

    @Basic(optional = false)
    @Column(name = "VL_BASE_COFINS_ST", table = "AEAITENT", nullable = false)
    private double vlBaseCofinsSt;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ST_RET", table = "AEAITENT", nullable = false)
    private double vlBaseStRet;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ST_DEST", table = "AEAITENT", nullable = false)
    private double vlBaseStDest;

    @Basic(optional = false)
    @Column(name = "VL_BASE_II", table = "AEAITENT", nullable = false)
    private double vlBaseIi;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_FRETE", table = "AEAITENT", nullable = false)
    private double vlIcmsFrete;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_MERC", table = "AEAITENT", nullable = false)
    private double vlIcmsMerc;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_SUBST", table = "AEAITENT", nullable = false)
    private double vlIcmsSubst;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_ST_RET", table = "AEAITENT", nullable = false)
    private double vlIcmsStRet;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_ST_DEST", table = "AEAITENT", nullable = false)
    private double vlIcmsStDest;

    @Basic(optional = false)
    @Column(name = "VL_CRED_ICMS_SN", table = "AEAITENT", nullable = false)
    private double vlCredIcmsSn;

    @Basic(optional = false)
    @Column(name = "VL_IPI", table = "AEAITENT", nullable = false)
    private double vlIpi;

    @Basic(optional = false)
    @Column(name = "VL_IPI_EXTRA", table = "AEAITENT", nullable = false)
    private double vlIpiExtra;

    @Basic(optional = false)
    @Column(name = "VL_FRETE_EXTRA", table = "AEAITENT", nullable = false)
    private double vlFreteExtra;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_EXTRA", table = "AEAITENT", nullable = false)
    private double vlIcmsExtra;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_ICMS", table = "AEAITENT", nullable = false)
    private double vlIsentoIcms;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_IPI", table = "AEAITENT", nullable = false)
    private double vlIsentoIpi;

    @Basic(optional = false)
    @Column(name = "VL_PIS", table = "AEAITENT", nullable = false)
    private double vlPis;

    @Basic(optional = false)
    @Column(name = "VL_PIS_ST", table = "AEAITENT", nullable = false)
    private double vlPisSt;

    @Basic(optional = false)
    @Column(name = "VL_COFINS", table = "AEAITENT", nullable = false)
    private double vlCofins;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_ST", table = "AEAITENT", nullable = false)
    private double vlCofinsSt;

    @Basic(optional = false)
    @Column(name = "VL_SUFRAMA", table = "AEAITENT", nullable = false)
    private double vlSuframa;

    @Basic(optional = false)
    @Column(name = "VL_II", table = "AEAITENT", nullable = false)
    private double vlIi;

    @Basic(optional = false)
    @Column(name = "VL_IOF_II", table = "AEAITENT", nullable = false)
    private double vlIofIi;

    @Basic
    @Column(name = "VL_DESP_ADU_II", table = "AEAITENT")
    private Integer vlDespAduIi;

    @Basic(optional = false)
    @Column(name = "JUROS_DESCONTO", table = "AEAITENT", nullable = false)
    private double jurosDesconto;

    @Basic(optional = false)
    @Column(name = "P_RED_BC_ICMS", table = "AEAITENT", nullable = false)
    private double pRedBcIcms;

    @Basic(optional = false)
    @Column(name = "P_RED_BC_ST", table = "AEAITENT", nullable = false)
    private double pRedBcSt;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS", table = "AEAITENT", nullable = false)
    private double aliquotaIcms;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_IPI", table = "AEAITENT", nullable = false)
    private double aliquotaIpi;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ST", table = "AEAITENT", nullable = false)
    private double aliquotaSt;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_PIS", table = "AEAITENT", nullable = false)
    private double aliquotaPis;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_COFINS", table = "AEAITENT", nullable = false)
    private double aliquotaCofins;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_PIS_ST", table = "AEAITENT", nullable = false)
    private double aliquotaPisSt;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_COFINS_ST", table = "AEAITENT", nullable = false)
    private double aliquotaCofinsSt;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_BCOP", table = "AEAITENT", nullable = false)
    private double aliquotaBcop;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_CRED_SN", table = "AEAITENT", nullable = false)
    private double aliquotaCredSn;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_MVAST", table = "AEAITENT", nullable = false)
    private double aliquotaMvast;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_FCP_UF_DEST", table = "AEAITENT", nullable = false)
    private double aliquotaFcpUfDest;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS_UF_DEST", table = "AEAITENT", nullable = false)
    private double aliquotaIcmsUfDest;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS_INTER", table = "AEAITENT", nullable = false)
    private double aliquotaIcmsInter;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS_INTER_PART", table = "AEAITENT", nullable = false)
    private double aliquotaIcmsInterPart;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_FCP", table = "AEAITENT", nullable = false)
    private double aliquotaFcp;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "AEAITENT", nullable = false)
    private String tipo;

    @Basic(optional = false)
    @Column(name = "TIPO_PRODUTO", table = "AEAITENT", nullable = false)
    private String tipoProduto;

    @Basic(optional = false)
    @Column(name = "TIPO_BAIXA", table = "AEAITENT", nullable = false)
    private String tipoBaixa;

    @Lob
    @Basic
    @Column(name = "OBS", table = "AEAITENT")
    private byte[] obs;

    @Basic
    @Column(name = "MODALIDADE", table = "AEAITENT")
    private String modalidade;

    @Basic
    @Column(name = "MODALIDADE_ST", table = "AEAITENT")
    private String modalidadeSt;

    @Basic
    @Column(name = "MOTDESICMS", table = "AEAITENT")
    private String motdesicms;

    @Basic
    @Column(name = "NAT_BC_CRED", table = "AEAITENT", length = 2)
    private String natBcCred;

    @Basic
    @Column(name = "CSOSN", table = "AEAITENT", length = 3)
    private String csosn;

    @Basic
    @Column(name = "FC_MERCADORIA_UN", table = "AEAITENT", precision = 15)
    private Double fcMercadoriaUn;

    @Basic
    @Column(name = "FC_DESCONTO_UN", table = "AEAITENT", precision = 15)
    private Double fcDescontoUn;

    @Basic
    @Column(name = "FC_CT_REP", table = "AEAITENT", precision = 15)
    private Double fcCtRep;

    @Basic
    @Column(name = "FC_CT_REP_D", table = "AEAITENT", precision = 15)
    private Double fcCtRepD;

    @Basic
    @Column(name = "FC_CT_REAL", table = "AEAITENT", precision = 15)
    private Double fcCtReal;

    @Basic
    @Column(name = "FC_CT_COMP", table = "AEAITENT", precision = 15)
    private Double fcCtComp;

    @Basic
    @Column(name = "FC_CT_REAL_D", table = "AEAITENT", precision = 15)
    private Double fcCtRealD;

    @Basic(optional = false)
    @Column(name = "VL_TOT_TRIB", table = "AEAITENT", nullable = false)
    private double vlTotTrib;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_UF_DEST", table = "AEAITENT", nullable = false)
    private double vlBaseIcmsUfDest;

    @Basic(optional = false)
    @Column(name = "VL_FCP_UF_DEST", table = "AEAITENT", nullable = false)
    private double vlFcpUfDest;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_UF_DEST", table = "AEAITENT", nullable = false)
    private double vlIcmsUfDest;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_UF_REMET", table = "AEAITENT", nullable = false)
    private double vlIcmsUfRemet;

    @Basic(optional = false)
    @Column(name = "VL_FCP", table = "AEAITENT", nullable = false)
    private double vlFcp;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_DESON", table = "AEAITENT", nullable = false)
    private double vlIcmsDeson;

    @Basic(optional = false)
    @Column(name = "VL_IPI_DESON", table = "AEAITENT", nullable = false)
    private double vlIpiDeson;

    @Basic(optional = false)
    @Column(name = "VL_PIS_DESON", table = "AEAITENT", nullable = false)
    private double vlPisDeson;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_DESON", table = "AEAITENT", nullable = false)
    private double vlCofinsDeson;

    public Integer getIdAeaitent() {
        return idAeaitent;
    }

    public void setIdAeaitent(Integer idAeaitent) {
        this.idAeaitent = idAeaitent;
    }

    public int getIdAeaentra() {
        return idAeaentra;
    }

    public void setIdAeaentra(int idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public int getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public int getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(int idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
    }

    public Integer getIdAeaitnfs() {
        return idAeaitnfs;
    }

    public void setIdAeaitnfs(Integer idAeaitnfs) {
        this.idAeaitnfs = idAeaitnfs;
    }

    public Integer getIdAeaitsai() {
        return idAeaitsai;
    }

    public void setIdAeaitsai(Integer idAeaitsai) {
        this.idAeaitsai = idAeaitsai;
    }

    public int getIdCfanatop() {
        return idCfanatop;
    }

    public void setIdCfanatop(int idCfanatop) {
        this.idCfanatop = idCfanatop;
    }

    public Integer getIdAeaitped() {
        return idAeaitped;
    }

    public void setIdAeaitped(Integer idAeaitped) {
        this.idAeaitped = idAeaitped;
    }

    public Integer getIdAeacodom() {
        return idAeacodom;
    }

    public void setIdAeacodom(Integer idAeacodom) {
        this.idAeacodom = idAeacodom;
    }

    public Integer getIdAeacodst() {
        return idAeacodst;
    }

    public void setIdAeacodst(Integer idAeacodst) {
        this.idAeacodst = idAeacodst;
    }

    public Integer getIdAeacodstIpi() {
        return idAeacodstIpi;
    }

    public void setIdAeacodstIpi(Integer idAeacodstIpi) {
        this.idAeacodstIpi = idAeacodstIpi;
    }

    public Integer getIdAeacodstPis() {
        return idAeacodstPis;
    }

    public void setIdAeacodstPis(Integer idAeacodstPis) {
        this.idAeacodstPis = idAeacodstPis;
    }

    public Integer getIdAeacodstCofins() {
        return idAeacodstCofins;
    }

    public void setIdAeacodstCofins(Integer idAeacodstCofins) {
        this.idAeacodstCofins = idAeacodstCofins;
    }

    public Integer getIdAeatanqu() {
        return idAeatanqu;
    }

    public void setIdAeatanqu(Integer idAeatanqu) {
        this.idAeatanqu = idAeatanqu;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUsCad() {
        return usCad;
    }

    public void setUsCad(String usCad) {
        this.usCad = usCad;
    }

    public Date getDtCad() {
        return dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getCtInteg() {
        return ctInteg;
    }

    public void setCtInteg(Integer ctInteg) {
        this.ctInteg = ctInteg;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQtdeDatVal() {
        return qtdeDatVal;
    }

    public void setQtdeDatVal(double qtdeDatVal) {
        this.qtdeDatVal = qtdeDatVal;
    }

    public double getQtdeConferido() {
        return qtdeConferido;
    }

    public void setQtdeConferido(double qtdeConferido) {
        this.qtdeConferido = qtdeConferido;
    }

    public double getVlMercadoria() {
        return vlMercadoria;
    }

    public void setVlMercadoria(double vlMercadoria) {
        this.vlMercadoria = vlMercadoria;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlFrete() {
        return vlFrete;
    }

    public void setVlFrete(double vlFrete) {
        this.vlFrete = vlFrete;
    }

    public double getVlSeguro() {
        return vlSeguro;
    }

    public void setVlSeguro(double vlSeguro) {
        this.vlSeguro = vlSeguro;
    }

    public double getVlOutros() {
        return vlOutros;
    }

    public void setVlOutros(double vlOutros) {
        this.vlOutros = vlOutros;
    }

    public double getVlBaseIcmsFrete() {
        return vlBaseIcmsFrete;
    }

    public void setVlBaseIcmsFrete(double vlBaseIcmsFrete) {
        this.vlBaseIcmsFrete = vlBaseIcmsFrete;
    }

    public double getVlBaseIcmsMerc() {
        return vlBaseIcmsMerc;
    }

    public void setVlBaseIcmsMerc(double vlBaseIcmsMerc) {
        this.vlBaseIcmsMerc = vlBaseIcmsMerc;
    }

    public double getVlBaseIcmsSubst() {
        return vlBaseIcmsSubst;
    }

    public void setVlBaseIcmsSubst(double vlBaseIcmsSubst) {
        this.vlBaseIcmsSubst = vlBaseIcmsSubst;
    }

    public double getVlBaseIpi() {
        return vlBaseIpi;
    }

    public void setVlBaseIpi(double vlBaseIpi) {
        this.vlBaseIpi = vlBaseIpi;
    }

    public double getVlBasePis() {
        return vlBasePis;
    }

    public void setVlBasePis(double vlBasePis) {
        this.vlBasePis = vlBasePis;
    }

    public double getVlBasePisSt() {
        return vlBasePisSt;
    }

    public void setVlBasePisSt(double vlBasePisSt) {
        this.vlBasePisSt = vlBasePisSt;
    }

    public double getVlBaseCofins() {
        return vlBaseCofins;
    }

    public void setVlBaseCofins(double vlBaseCofins) {
        this.vlBaseCofins = vlBaseCofins;
    }

    public double getVlBaseCofinsSt() {
        return vlBaseCofinsSt;
    }

    public void setVlBaseCofinsSt(double vlBaseCofinsSt) {
        this.vlBaseCofinsSt = vlBaseCofinsSt;
    }

    public double getVlBaseStRet() {
        return vlBaseStRet;
    }

    public void setVlBaseStRet(double vlBaseStRet) {
        this.vlBaseStRet = vlBaseStRet;
    }

    public double getVlBaseStDest() {
        return vlBaseStDest;
    }

    public void setVlBaseStDest(double vlBaseStDest) {
        this.vlBaseStDest = vlBaseStDest;
    }

    public double getVlBaseIi() {
        return vlBaseIi;
    }

    public void setVlBaseIi(double vlBaseIi) {
        this.vlBaseIi = vlBaseIi;
    }

    public double getVlIcmsFrete() {
        return vlIcmsFrete;
    }

    public void setVlIcmsFrete(double vlIcmsFrete) {
        this.vlIcmsFrete = vlIcmsFrete;
    }

    public double getVlIcmsMerc() {
        return vlIcmsMerc;
    }

    public void setVlIcmsMerc(double vlIcmsMerc) {
        this.vlIcmsMerc = vlIcmsMerc;
    }

    public double getVlIcmsSubst() {
        return vlIcmsSubst;
    }

    public void setVlIcmsSubst(double vlIcmsSubst) {
        this.vlIcmsSubst = vlIcmsSubst;
    }

    public double getVlIcmsStRet() {
        return vlIcmsStRet;
    }

    public void setVlIcmsStRet(double vlIcmsStRet) {
        this.vlIcmsStRet = vlIcmsStRet;
    }

    public double getVlIcmsStDest() {
        return vlIcmsStDest;
    }

    public void setVlIcmsStDest(double vlIcmsStDest) {
        this.vlIcmsStDest = vlIcmsStDest;
    }

    public double getVlCredIcmsSn() {
        return vlCredIcmsSn;
    }

    public void setVlCredIcmsSn(double vlCredIcmsSn) {
        this.vlCredIcmsSn = vlCredIcmsSn;
    }

    public double getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public double getVlIpiExtra() {
        return vlIpiExtra;
    }

    public void setVlIpiExtra(double vlIpiExtra) {
        this.vlIpiExtra = vlIpiExtra;
    }

    public double getVlFreteExtra() {
        return vlFreteExtra;
    }

    public void setVlFreteExtra(double vlFreteExtra) {
        this.vlFreteExtra = vlFreteExtra;
    }

    public double getVlIcmsExtra() {
        return vlIcmsExtra;
    }

    public void setVlIcmsExtra(double vlIcmsExtra) {
        this.vlIcmsExtra = vlIcmsExtra;
    }

    public double getVlIsentoIcms() {
        return vlIsentoIcms;
    }

    public void setVlIsentoIcms(double vlIsentoIcms) {
        this.vlIsentoIcms = vlIsentoIcms;
    }

    public double getVlIsentoIpi() {
        return vlIsentoIpi;
    }

    public void setVlIsentoIpi(double vlIsentoIpi) {
        this.vlIsentoIpi = vlIsentoIpi;
    }

    public double getVlPis() {
        return vlPis;
    }

    public void setVlPis(double vlPis) {
        this.vlPis = vlPis;
    }

    public double getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(double vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public double getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(double vlCofins) {
        this.vlCofins = vlCofins;
    }

    public double getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(double vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }

    public double getVlSuframa() {
        return vlSuframa;
    }

    public void setVlSuframa(double vlSuframa) {
        this.vlSuframa = vlSuframa;
    }

    public double getVlIi() {
        return vlIi;
    }

    public void setVlIi(double vlIi) {
        this.vlIi = vlIi;
    }

    public double getVlIofIi() {
        return vlIofIi;
    }

    public void setVlIofIi(double vlIofIi) {
        this.vlIofIi = vlIofIi;
    }

    public Integer getVlDespAduIi() {
        return vlDespAduIi;
    }

    public void setVlDespAduIi(Integer vlDespAduIi) {
        this.vlDespAduIi = vlDespAduIi;
    }

    public double getJurosDesconto() {
        return jurosDesconto;
    }

    public void setJurosDesconto(double jurosDesconto) {
        this.jurosDesconto = jurosDesconto;
    }

    public double getPRedBcIcms() {
        return pRedBcIcms;
    }

    public void setPRedBcIcms(double pRedBcIcms) {
        this.pRedBcIcms = pRedBcIcms;
    }

    public double getPRedBcSt() {
        return pRedBcSt;
    }

    public void setPRedBcSt(double pRedBcSt) {
        this.pRedBcSt = pRedBcSt;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }

    public double getAliquotaSt() {
        return aliquotaSt;
    }

    public void setAliquotaSt(double aliquotaSt) {
        this.aliquotaSt = aliquotaSt;
    }

    public double getAliquotaPis() {
        return aliquotaPis;
    }

    public void setAliquotaPis(double aliquotaPis) {
        this.aliquotaPis = aliquotaPis;
    }

    public double getAliquotaCofins() {
        return aliquotaCofins;
    }

    public void setAliquotaCofins(double aliquotaCofins) {
        this.aliquotaCofins = aliquotaCofins;
    }

    public double getAliquotaPisSt() {
        return aliquotaPisSt;
    }

    public void setAliquotaPisSt(double aliquotaPisSt) {
        this.aliquotaPisSt = aliquotaPisSt;
    }

    public double getAliquotaCofinsSt() {
        return aliquotaCofinsSt;
    }

    public void setAliquotaCofinsSt(double aliquotaCofinsSt) {
        this.aliquotaCofinsSt = aliquotaCofinsSt;
    }

    public double getAliquotaBcop() {
        return aliquotaBcop;
    }

    public void setAliquotaBcop(double aliquotaBcop) {
        this.aliquotaBcop = aliquotaBcop;
    }

    public double getAliquotaCredSn() {
        return aliquotaCredSn;
    }

    public void setAliquotaCredSn(double aliquotaCredSn) {
        this.aliquotaCredSn = aliquotaCredSn;
    }

    public double getAliquotaMvast() {
        return aliquotaMvast;
    }

    public void setAliquotaMvast(double aliquotaMvast) {
        this.aliquotaMvast = aliquotaMvast;
    }

    public double getAliquotaFcpUfDest() {
        return aliquotaFcpUfDest;
    }

    public void setAliquotaFcpUfDest(double aliquotaFcpUfDest) {
        this.aliquotaFcpUfDest = aliquotaFcpUfDest;
    }

    public double getAliquotaIcmsUfDest() {
        return aliquotaIcmsUfDest;
    }

    public void setAliquotaIcmsUfDest(double aliquotaIcmsUfDest) {
        this.aliquotaIcmsUfDest = aliquotaIcmsUfDest;
    }

    public double getAliquotaIcmsInter() {
        return aliquotaIcmsInter;
    }

    public void setAliquotaIcmsInter(double aliquotaIcmsInter) {
        this.aliquotaIcmsInter = aliquotaIcmsInter;
    }

    public double getAliquotaIcmsInterPart() {
        return aliquotaIcmsInterPart;
    }

    public void setAliquotaIcmsInterPart(double aliquotaIcmsInterPart) {
        this.aliquotaIcmsInterPart = aliquotaIcmsInterPart;
    }

    public double getAliquotaFcp() {
        return aliquotaFcp;
    }

    public void setAliquotaFcp(double aliquotaFcp) {
        this.aliquotaFcp = aliquotaFcp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getTipoBaixa() {
        return tipoBaixa;
    }

    public void setTipoBaixa(String tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getModalidadeSt() {
        return modalidadeSt;
    }

    public void setModalidadeSt(String modalidadeSt) {
        this.modalidadeSt = modalidadeSt;
    }

    public String getMotdesicms() {
        return motdesicms;
    }

    public void setMotdesicms(String motdesicms) {
        this.motdesicms = motdesicms;
    }

    public String getNatBcCred() {
        return natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public String getCsosn() {
        return csosn;
    }

    public void setCsosn(String csosn) {
        this.csosn = csosn;
    }

    public Double getFcMercadoriaUn() {
        return fcMercadoriaUn;
    }

    public void setFcMercadoriaUn(Double fcMercadoriaUn) {
        this.fcMercadoriaUn = fcMercadoriaUn;
    }

    public Double getFcDescontoUn() {
        return fcDescontoUn;
    }

    public void setFcDescontoUn(Double fcDescontoUn) {
        this.fcDescontoUn = fcDescontoUn;
    }

    public Double getFcCtRep() {
        return fcCtRep;
    }

    public void setFcCtRep(Double fcCtRep) {
        this.fcCtRep = fcCtRep;
    }

    public Double getFcCtRepD() {
        return fcCtRepD;
    }

    public void setFcCtRepD(Double fcCtRepD) {
        this.fcCtRepD = fcCtRepD;
    }

    public Double getFcCtReal() {
        return fcCtReal;
    }

    public void setFcCtReal(Double fcCtReal) {
        this.fcCtReal = fcCtReal;
    }

    public Double getFcCtComp() {
        return fcCtComp;
    }

    public void setFcCtComp(Double fcCtComp) {
        this.fcCtComp = fcCtComp;
    }

    public Double getFcCtRealD() {
        return fcCtRealD;
    }

    public void setFcCtRealD(Double fcCtRealD) {
        this.fcCtRealD = fcCtRealD;
    }

    public double getVlTotTrib() {
        return vlTotTrib;
    }

    public void setVlTotTrib(double vlTotTrib) {
        this.vlTotTrib = vlTotTrib;
    }

    public double getVlBaseIcmsUfDest() {
        return vlBaseIcmsUfDest;
    }

    public void setVlBaseIcmsUfDest(double vlBaseIcmsUfDest) {
        this.vlBaseIcmsUfDest = vlBaseIcmsUfDest;
    }

    public double getVlFcpUfDest() {
        return vlFcpUfDest;
    }

    public void setVlFcpUfDest(double vlFcpUfDest) {
        this.vlFcpUfDest = vlFcpUfDest;
    }

    public double getVlIcmsUfDest() {
        return vlIcmsUfDest;
    }

    public void setVlIcmsUfDest(double vlIcmsUfDest) {
        this.vlIcmsUfDest = vlIcmsUfDest;
    }

    public double getVlIcmsUfRemet() {
        return vlIcmsUfRemet;
    }

    public void setVlIcmsUfRemet(double vlIcmsUfRemet) {
        this.vlIcmsUfRemet = vlIcmsUfRemet;
    }

    public double getVlFcp() {
        return vlFcp;
    }

    public void setVlFcp(double vlFcp) {
        this.vlFcp = vlFcp;
    }

    public double getVlIcmsDeson() {
        return vlIcmsDeson;
    }

    public void setVlIcmsDeson(double vlIcmsDeson) {
        this.vlIcmsDeson = vlIcmsDeson;
    }

    public double getVlIpiDeson() {
        return vlIpiDeson;
    }

    public void setVlIpiDeson(double vlIpiDeson) {
        this.vlIpiDeson = vlIpiDeson;
    }

    public double getVlPisDeson() {
        return vlPisDeson;
    }

    public void setVlPisDeson(double vlPisDeson) {
        this.vlPisDeson = vlPisDeson;
    }

    public double getVlCofinsDeson() {
        return vlCofinsDeson;
    }

    public void setVlCofinsDeson(double vlCofinsDeson) {
        this.vlCofinsDeson = vlCofinsDeson;
    }

}