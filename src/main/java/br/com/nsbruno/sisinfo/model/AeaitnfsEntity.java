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
@Table(name = "AEAITNFS")
public class AeaitnfsEntity {

    @Id
    @Column(name = "ID_AEAITNFS", table = "AEAITNFS", nullable = false)
    private Integer idAeaitnfs;

    @Basic(optional = false)
    @Column(name = "ID_AEANFSAI", table = "AEAITNFS", nullable = false)
    private int idAeanfsai;

    @Basic(optional = false)
    @Column(name = "ID_AEAESTOQ", table = "AEAITNFS", nullable = false)
    private int idAeaestoq;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAITNFS", nullable = false)
    private int idAeaunven;

    @Basic(optional = false)
    @Column(name = "ID_AEAPLPGT", table = "AEAITNFS", nullable = false)
    private int idAeaplpgt;

    @Basic(optional = false)
    @Column(name = "ID_AEACODOM", table = "AEAITNFS", nullable = false)
    private int idAeacodom;

    @Basic(optional = false)
    @Column(name = "ID_AEACODST", table = "AEAITNFS", nullable = false)
    private int idAeacodst;

    @Basic
    @Column(name = "ID_AEACODST_IPI", table = "AEAITNFS")
    private Integer idAeacodstIpi;

    @Basic
    @Column(name = "ID_AEACODST_PIS", table = "AEAITNFS")
    private Integer idAeacodstPis;

    @Basic
    @Column(name = "ID_AEACODST_COFINS", table = "AEAITNFS")
    private Integer idAeacodstCofins;

    @Basic
    @Column(name = "ID_AEAOBSPR", table = "AEAITNFS")
    private Integer idAeaobspr;

    @Basic
    @Column(name = "ID_GCAPRODU", table = "AEAITNFS")
    private Integer idGcaprodu;

    @Basic(optional = false)
    @Column(name = "ID_CFANATOP", table = "AEAITNFS", nullable = false)
    private int idCfanatop;

    @Basic(optional = false)
    @Column(name = "ID_CFACLIFO_VENDEDOR", table = "AEAITNFS", nullable = false)
    private int idCfaclifoVendedor;

    @Basic
    @Column(name = "ID_AEAITNFS_CONJ", table = "AEAITNFS")
    private Integer idAeaitnfsConj;

    @Basic
    @Column(name = "ID_AEAITNFS_CF", table = "AEAITNFS")
    private Integer idAeaitnfsCf;

    @Basic
    @Column(name = "ID_AEAITTRA", table = "AEAITNFS")
    private Integer idAeaittra;

    @Basic
    @Column(name = "ID_AEAITCNF", table = "AEAITNFS")
    private Integer idAeaitcnf;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAITNFS", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAITNFS", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAITNFS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAITNFS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAITNFS")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DT_NF", table = "AEAITNFS", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtNf;

    @Basic(optional = false)
    @Column(name = "SEQUENCIA", table = "AEAITNFS", nullable = false)
    private int sequencia;

    @Basic(optional = false)
    @Column(name = "REDUCAO_ICMS", table = "AEAITNFS", nullable = false)
    private double reducaoIcms;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS", table = "AEAITNFS", nullable = false)
    private double aliquotaIcms;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS_SUB", table = "AEAITNFS", nullable = false)
    private double aliquotaIcmsSub;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_IPI", table = "AEAITNFS", nullable = false)
    private double aliquotaIpi;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ISS", table = "AEAITNFS", nullable = false)
    private double aliquotaIss;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_COFINS", table = "AEAITNFS", nullable = false)
    private double aliquotaCofins;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_PIS", table = "AEAITNFS", nullable = false)
    private double aliquotaPis;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_PIS_ST", table = "AEAITNFS", nullable = false)
    private double aliquotaPisSt;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_COFINS_ST", table = "AEAITNFS", nullable = false)
    private double aliquotaCofinsSt;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_BCOP", table = "AEAITNFS", nullable = false)
    private double aliquotaBcop;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_CRED_SN", table = "AEAITNFS", nullable = false)
    private double aliquotaCredSn;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_MVAST", table = "AEAITNFS", nullable = false)
    private double aliquotaMvast;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_FCP_UF_DEST", table = "AEAITNFS", nullable = false)
    private double aliquotaFcpUfDest;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS_UF_DEST", table = "AEAITNFS", nullable = false)
    private double aliquotaIcmsUfDest;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS_INTER", table = "AEAITNFS", nullable = false)
    private double aliquotaIcmsInter;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_ICMS_INTER_PART", table = "AEAITNFS", nullable = false)
    private double aliquotaIcmsInterPart;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_FCP", table = "AEAITNFS", nullable = false)
    private double aliquotaFcp;

    @Basic(optional = false)
    @Column(name = "P_RED_BC_ST", table = "AEAITNFS", nullable = false)
    private double pRedBcSt;

    @Basic(optional = false)
    @Column(name = "QUANTIDADE", table = "AEAITNFS", nullable = false)
    private double quantidade;

    @Basic(optional = false)
    @Column(name = "QTDE_DEVOL", table = "AEAITNFS", nullable = false)
    private double qtdeDevol;

    @Basic(optional = false)
    @Column(name = "VL_CUSTO", table = "AEAITNFS", nullable = false)
    private double vlCusto;

    @Basic(optional = false)
    @Column(name = "VL_CUSTO_FIS", table = "AEAITNFS", nullable = false)
    private double vlCustoFis;

    @Basic(optional = false)
    @Column(name = "VL_VISTA", table = "AEAITNFS", nullable = false)
    private double vlVista;

    @Basic(optional = false)
    @Column(name = "VL_VENDA", table = "AEAITNFS", nullable = false)
    private double vlVenda;

    @Basic(optional = false)
    @Column(name = "VL_TABELA", table = "AEAITNFS", nullable = false)
    private double vlTabela;

    @Basic(optional = false)
    @Column(name = "VL_BRUTO", table = "AEAITNFS", nullable = false)
    private double vlBruto;

    @Basic(optional = false)
    @Column(name = "VL_DESCONTO", table = "AEAITNFS", nullable = false)
    private double vlDesconto;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS", table = "AEAITNFS", nullable = false)
    private double vlBaseIcms;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_SUB", table = "AEAITNFS", nullable = false)
    private double vlBaseIcmsSub;

    @Basic(optional = false)
    @Column(name = "VL_BASE_IPI", table = "AEAITNFS", nullable = false)
    private double vlBaseIpi;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ISS", table = "AEAITNFS", nullable = false)
    private double vlBaseIss;

    @Basic(optional = false)
    @Column(name = "VL_ICMS", table = "AEAITNFS", nullable = false)
    private double vlIcms;

    @Basic(optional = false)
    @Column(name = "VL_IPI", table = "AEAITNFS", nullable = false)
    private double vlIpi;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_SUB", table = "AEAITNFS", nullable = false)
    private double vlIcmsSub;

    @Basic(optional = false)
    @Column(name = "VL_ISS", table = "AEAITNFS", nullable = false)
    private double vlIss;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_ICMS", table = "AEAITNFS", nullable = false)
    private double vlIsentoIcms;

    @Basic(optional = false)
    @Column(name = "VL_ISENTO_IPI", table = "AEAITNFS", nullable = false)
    private double vlIsentoIpi;

    @Basic(optional = false)
    @Column(name = "VL_PIS", table = "AEAITNFS", nullable = false)
    private double vlPis;

    @Basic(optional = false)
    @Column(name = "VL_COFINS", table = "AEAITNFS", nullable = false)
    private double vlCofins;

    @Basic(optional = false)
    @Column(name = "VL_PIS_ST", table = "AEAITNFS", nullable = false)
    private double vlPisSt;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_ST", table = "AEAITNFS", nullable = false)
    private double vlCofinsSt;

    @Basic(optional = false)
    @Column(name = "VL_BASE_PIS", table = "AEAITNFS", nullable = false)
    private double vlBasePis;

    @Basic(optional = false)
    @Column(name = "VL_BASE_COFINS", table = "AEAITNFS", nullable = false)
    private double vlBaseCofins;

    @Basic
    @Column(name = "FC_VL_LIQUIDO", table = "AEAITNFS", precision = 15)
    private Double fcVlLiquido;

    @Basic
    @Column(name = "FC_CUSTO_UN", table = "AEAITNFS", precision = 15)
    private Double fcCustoUn;

    @Basic
    @Column(name = "FC_CUSTO_FIS_UN", table = "AEAITNFS", precision = 15)
    private Double fcCustoFisUn;

    @Basic
    @Column(name = "FC_VISTA_UN", table = "AEAITNFS", precision = 15)
    private Double fcVistaUn;

    @Basic
    @Column(name = "FC_VENDA_UN", table = "AEAITNFS", precision = 15)
    private Double fcVendaUn;

    @Basic
    @Column(name = "FC_TABELA_UN", table = "AEAITNFS", precision = 15)
    private Double fcTabelaUn;

    @Basic
    @Column(name = "FC_BRUTO_UN", table = "AEAITNFS", precision = 15)
    private Double fcBrutoUn;

    @Basic
    @Column(name = "FC_DESCONTO_UN", table = "AEAITNFS", precision = 15)
    private Double fcDescontoUn;

    @Basic(optional = false)
    @Column(name = "PROMOCAO", table = "AEAITNFS", nullable = false)
    private String promocao;

    @Basic(optional = false)
    @Column(name = "TIPO_PRODUTO", table = "AEAITNFS", nullable = false)
    private String tipoProduto;

    @Basic(optional = false)
    @Column(name = "ATAC_VAREJO", table = "AEAITNFS", nullable = false)
    private String atacVarejo;

    @Basic(optional = false)
    @Column(name = "TIPO_BAIXA", table = "AEAITNFS", nullable = false)
    private String tipoBaixa;

    @Basic(optional = false)
    @Column(name = "TIPO_IPI", table = "AEAITNFS", nullable = false)
    private String tipoIpi;

    @Basic(optional = false)
    @Column(name = "COMISSAO", table = "AEAITNFS", nullable = false)
    private double comissao;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "AEAITNFS")
    private byte[] complemento;

    @Basic
    @Column(name = "SEQ_DESCONTO", table = "AEAITNFS", length = 50)
    private String seqDesconto;

    @Basic
    @Column(name = "MODALIDADE", table = "AEAITNFS")
    private String modalidade;

    @Basic
    @Column(name = "MODALIDADE_ST", table = "AEAITNFS")
    private String modalidadeSt;

    @Basic
    @Column(name = "MOTDESICMS", table = "AEAITNFS")
    private String motdesicms;

    @Basic
    @Column(name = "NAT_BC_CRED", table = "AEAITNFS", length = 2)
    private String natBcCred;

    @Basic
    @Column(name = "CSOSN", table = "AEAITNFS", length = 3)
    private String csosn;

    @Basic(optional = false)
    @Column(name = "VL_BASE_PIS_ST", table = "AEAITNFS", nullable = false)
    private double vlBasePisSt;

    @Basic(optional = false)
    @Column(name = "VL_BASE_COFINS_ST", table = "AEAITNFS", nullable = false)
    private double vlBaseCofinsSt;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ST_RET", table = "AEAITNFS", nullable = false)
    private double vlBaseStRet;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ST_DEST", table = "AEAITNFS", nullable = false)
    private double vlBaseStDest;

    @Basic(optional = false)
    @Column(name = "VL_BASE_II", table = "AEAITNFS", nullable = false)
    private double vlBaseIi;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_ST_RET", table = "AEAITNFS", nullable = false)
    private double vlIcmsStRet;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_ST_DEST", table = "AEAITNFS", nullable = false)
    private double vlIcmsStDest;

    @Basic(optional = false)
    @Column(name = "VL_CRED_ICMS_SN", table = "AEAITNFS", nullable = false)
    private double vlCredIcmsSn;

    @Basic(optional = false)
    @Column(name = "VL_II", table = "AEAITNFS", nullable = false)
    private double vlIi;

    @Basic(optional = false)
    @Column(name = "VL_DESP_ADU_II", table = "AEAITNFS", nullable = false)
    private double vlDespAduIi;

    @Basic(optional = false)
    @Column(name = "VL_IOF_II", table = "AEAITNFS", nullable = false)
    private double vlIofIi;

    @Basic(optional = false)
    @Column(name = "VL_FRETE", table = "AEAITNFS", nullable = false)
    private double vlFrete;

    @Basic(optional = false)
    @Column(name = "VL_SEGURO", table = "AEAITNFS", nullable = false)
    private double vlSeguro;

    @Basic(optional = false)
    @Column(name = "VL_OUTROS", table = "AEAITNFS", nullable = false)
    private double vlOutros;

    @Basic(optional = false)
    @Column(name = "VL_TOT_TRIB", table = "AEAITNFS", nullable = false)
    private double vlTotTrib;

    @Basic(optional = false)
    @Column(name = "VL_BASE_ICMS_UF_DEST", table = "AEAITNFS", nullable = false)
    private double vlBaseIcmsUfDest;

    @Basic(optional = false)
    @Column(name = "VL_FCP_UF_DEST", table = "AEAITNFS", nullable = false)
    private double vlFcpUfDest;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_UF_DEST", table = "AEAITNFS", nullable = false)
    private double vlIcmsUfDest;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_UF_REMET", table = "AEAITNFS", nullable = false)
    private double vlIcmsUfRemet;

    @Basic(optional = false)
    @Column(name = "VL_FCP", table = "AEAITNFS", nullable = false)
    private double vlFcp;

    @Basic(optional = false)
    @Column(name = "VL_ICMS_DESON", table = "AEAITNFS", nullable = false)
    private double vlIcmsDeson;

    @Basic(optional = false)
    @Column(name = "VL_PIS_DESON", table = "AEAITNFS", nullable = false)
    private double vlPisDeson;

    @Basic(optional = false)
    @Column(name = "VL_COFINS_DESON", table = "AEAITNFS", nullable = false)
    private double vlCofinsDeson;

    @Basic(optional = false)
    @Column(name = "VL_IPI_DESON", table = "AEAITNFS", nullable = false)
    private double vlIpiDeson;

    public Integer getIdAeaitnfs() {
        return idAeaitnfs;
    }

    public void setIdAeaitnfs(Integer idAeaitnfs) {
        this.idAeaitnfs = idAeaitnfs;
    }

    public int getIdAeanfsai() {
        return idAeanfsai;
    }

    public void setIdAeanfsai(int idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public int getIdAeaestoq() {
        return idAeaestoq;
    }

    public void setIdAeaestoq(int idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
    }

    public int getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public int getIdAeaplpgt() {
        return idAeaplpgt;
    }

    public void setIdAeaplpgt(int idAeaplpgt) {
        this.idAeaplpgt = idAeaplpgt;
    }

    public int getIdAeacodom() {
        return idAeacodom;
    }

    public void setIdAeacodom(int idAeacodom) {
        this.idAeacodom = idAeacodom;
    }

    public int getIdAeacodst() {
        return idAeacodst;
    }

    public void setIdAeacodst(int idAeacodst) {
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

    public Integer getIdAeaobspr() {
        return idAeaobspr;
    }

    public void setIdAeaobspr(Integer idAeaobspr) {
        this.idAeaobspr = idAeaobspr;
    }

    public Integer getIdGcaprodu() {
        return idGcaprodu;
    }

    public void setIdGcaprodu(Integer idGcaprodu) {
        this.idGcaprodu = idGcaprodu;
    }

    public int getIdCfanatop() {
        return idCfanatop;
    }

    public void setIdCfanatop(int idCfanatop) {
        this.idCfanatop = idCfanatop;
    }

    public int getIdCfaclifoVendedor() {
        return idCfaclifoVendedor;
    }

    public void setIdCfaclifoVendedor(int idCfaclifoVendedor) {
        this.idCfaclifoVendedor = idCfaclifoVendedor;
    }

    public Integer getIdAeaitnfsConj() {
        return idAeaitnfsConj;
    }

    public void setIdAeaitnfsConj(Integer idAeaitnfsConj) {
        this.idAeaitnfsConj = idAeaitnfsConj;
    }

    public Integer getIdAeaitnfsCf() {
        return idAeaitnfsCf;
    }

    public void setIdAeaitnfsCf(Integer idAeaitnfsCf) {
        this.idAeaitnfsCf = idAeaitnfsCf;
    }

    public Integer getIdAeaittra() {
        return idAeaittra;
    }

    public void setIdAeaittra(Integer idAeaittra) {
        this.idAeaittra = idAeaittra;
    }

    public Integer getIdAeaitcnf() {
        return idAeaitcnf;
    }

    public void setIdAeaitcnf(Integer idAeaitcnf) {
        this.idAeaitcnf = idAeaitcnf;
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

    public Date getDtNf() {
        return dtNf;
    }

    public void setDtNf(Date dtNf) {
        this.dtNf = dtNf;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getReducaoIcms() {
        return reducaoIcms;
    }

    public void setReducaoIcms(double reducaoIcms) {
        this.reducaoIcms = reducaoIcms;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getAliquotaIcmsSub() {
        return aliquotaIcmsSub;
    }

    public void setAliquotaIcmsSub(double aliquotaIcmsSub) {
        this.aliquotaIcmsSub = aliquotaIcmsSub;
    }

    public double getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }

    public double getAliquotaIss() {
        return aliquotaIss;
    }

    public void setAliquotaIss(double aliquotaIss) {
        this.aliquotaIss = aliquotaIss;
    }

    public double getAliquotaCofins() {
        return aliquotaCofins;
    }

    public void setAliquotaCofins(double aliquotaCofins) {
        this.aliquotaCofins = aliquotaCofins;
    }

    public double getAliquotaPis() {
        return aliquotaPis;
    }

    public void setAliquotaPis(double aliquotaPis) {
        this.aliquotaPis = aliquotaPis;
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

    public double getPRedBcSt() {
        return pRedBcSt;
    }

    public void setPRedBcSt(double pRedBcSt) {
        this.pRedBcSt = pRedBcSt;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQtdeDevol() {
        return qtdeDevol;
    }

    public void setQtdeDevol(double qtdeDevol) {
        this.qtdeDevol = qtdeDevol;
    }

    public double getVlCusto() {
        return vlCusto;
    }

    public void setVlCusto(double vlCusto) {
        this.vlCusto = vlCusto;
    }

    public double getVlCustoFis() {
        return vlCustoFis;
    }

    public void setVlCustoFis(double vlCustoFis) {
        this.vlCustoFis = vlCustoFis;
    }

    public double getVlVista() {
        return vlVista;
    }

    public void setVlVista(double vlVista) {
        this.vlVista = vlVista;
    }

    public double getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(double vlVenda) {
        this.vlVenda = vlVenda;
    }

    public double getVlTabela() {
        return vlTabela;
    }

    public void setVlTabela(double vlTabela) {
        this.vlTabela = vlTabela;
    }

    public double getVlBruto() {
        return vlBruto;
    }

    public void setVlBruto(double vlBruto) {
        this.vlBruto = vlBruto;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlBaseIcms() {
        return vlBaseIcms;
    }

    public void setVlBaseIcms(double vlBaseIcms) {
        this.vlBaseIcms = vlBaseIcms;
    }

    public double getVlBaseIcmsSub() {
        return vlBaseIcmsSub;
    }

    public void setVlBaseIcmsSub(double vlBaseIcmsSub) {
        this.vlBaseIcmsSub = vlBaseIcmsSub;
    }

    public double getVlBaseIpi() {
        return vlBaseIpi;
    }

    public void setVlBaseIpi(double vlBaseIpi) {
        this.vlBaseIpi = vlBaseIpi;
    }

    public double getVlBaseIss() {
        return vlBaseIss;
    }

    public void setVlBaseIss(double vlBaseIss) {
        this.vlBaseIss = vlBaseIss;
    }

    public double getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(double vlIcms) {
        this.vlIcms = vlIcms;
    }

    public double getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(double vlIpi) {
        this.vlIpi = vlIpi;
    }

    public double getVlIcmsSub() {
        return vlIcmsSub;
    }

    public void setVlIcmsSub(double vlIcmsSub) {
        this.vlIcmsSub = vlIcmsSub;
    }

    public double getVlIss() {
        return vlIss;
    }

    public void setVlIss(double vlIss) {
        this.vlIss = vlIss;
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

    public double getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(double vlCofins) {
        this.vlCofins = vlCofins;
    }

    public double getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(double vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public double getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(double vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }

    public double getVlBasePis() {
        return vlBasePis;
    }

    public void setVlBasePis(double vlBasePis) {
        this.vlBasePis = vlBasePis;
    }

    public double getVlBaseCofins() {
        return vlBaseCofins;
    }

    public void setVlBaseCofins(double vlBaseCofins) {
        this.vlBaseCofins = vlBaseCofins;
    }

    public Double getFcVlLiquido() {
        return fcVlLiquido;
    }

    public void setFcVlLiquido(Double fcVlLiquido) {
        this.fcVlLiquido = fcVlLiquido;
    }

    public Double getFcCustoUn() {
        return fcCustoUn;
    }

    public void setFcCustoUn(Double fcCustoUn) {
        this.fcCustoUn = fcCustoUn;
    }

    public Double getFcCustoFisUn() {
        return fcCustoFisUn;
    }

    public void setFcCustoFisUn(Double fcCustoFisUn) {
        this.fcCustoFisUn = fcCustoFisUn;
    }

    public Double getFcVistaUn() {
        return fcVistaUn;
    }

    public void setFcVistaUn(Double fcVistaUn) {
        this.fcVistaUn = fcVistaUn;
    }

    public Double getFcVendaUn() {
        return fcVendaUn;
    }

    public void setFcVendaUn(Double fcVendaUn) {
        this.fcVendaUn = fcVendaUn;
    }

    public Double getFcTabelaUn() {
        return fcTabelaUn;
    }

    public void setFcTabelaUn(Double fcTabelaUn) {
        this.fcTabelaUn = fcTabelaUn;
    }

    public Double getFcBrutoUn() {
        return fcBrutoUn;
    }

    public void setFcBrutoUn(Double fcBrutoUn) {
        this.fcBrutoUn = fcBrutoUn;
    }

    public Double getFcDescontoUn() {
        return fcDescontoUn;
    }

    public void setFcDescontoUn(Double fcDescontoUn) {
        this.fcDescontoUn = fcDescontoUn;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getAtacVarejo() {
        return atacVarejo;
    }

    public void setAtacVarejo(String atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public String getTipoBaixa() {
        return tipoBaixa;
    }

    public void setTipoBaixa(String tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public String getTipoIpi() {
        return tipoIpi;
    }

    public void setTipoIpi(String tipoIpi) {
        this.tipoIpi = tipoIpi;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public String getSeqDesconto() {
        return seqDesconto;
    }

    public void setSeqDesconto(String seqDesconto) {
        this.seqDesconto = seqDesconto;
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

    public double getVlBasePisSt() {
        return vlBasePisSt;
    }

    public void setVlBasePisSt(double vlBasePisSt) {
        this.vlBasePisSt = vlBasePisSt;
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

    public double getVlIi() {
        return vlIi;
    }

    public void setVlIi(double vlIi) {
        this.vlIi = vlIi;
    }

    public double getVlDespAduIi() {
        return vlDespAduIi;
    }

    public void setVlDespAduIi(double vlDespAduIi) {
        this.vlDespAduIi = vlDespAduIi;
    }

    public double getVlIofIi() {
        return vlIofIi;
    }

    public void setVlIofIi(double vlIofIi) {
        this.vlIofIi = vlIofIi;
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

    public double getVlIpiDeson() {
        return vlIpiDeson;
    }

    public void setVlIpiDeson(double vlIpiDeson) {
        this.vlIpiDeson = vlIpiDeson;
    }

}