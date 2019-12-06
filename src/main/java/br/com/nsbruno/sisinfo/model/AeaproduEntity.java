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
@Table(name = "AEAPRODU")
@Data
public class AeaproduEntity {

    @Id
    @Column(name = "ID_AEAPRODU", table = "AEAPRODU", nullable = false)
    private Integer idAeaprodu;

    @Basic
    @Column(name = "ID_AEAFAMIL", table = "AEAPRODU")
    private Integer idAeafamil;

    @Basic
    @Column(name = "ID_AEACLASE", table = "AEAPRODU")
    private Integer idAeaclase;

    @Basic
    @Column(name = "ID_AEAGRUPO", table = "AEAPRODU")
    private Integer idAeagrupo;

    @Basic
    @Column(name = "ID_AEASGRUP", table = "AEAPRODU")
    private Integer idAeasgrup;

    @Basic
    @Column(name = "ID_AEAMARCA", table = "AEAPRODU")
    private Integer idAeamarca;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAPRODU", nullable = false)
    private int idAeaunven;

    @Basic
    @Column(name = "ID_AEAPESOS", table = "AEAPRODU")
    private Integer idAeapesos;

    @Basic
    @Column(name = "ID_AEATPGRD", table = "AEAPRODU")
    private Integer idAeatpgrd;

    @Basic(optional = false)
    @Column(name = "ID_AEACODOM", table = "AEAPRODU", nullable = false)
    private int idAeacodom;

    @Basic
    @Column(name = "ID_CFAMODEQ", table = "AEAPRODU")
    private Integer idCfamodeq;

    @Basic
    @Column(name = "ID_AEACODGE", table = "AEAPRODU")
    private Integer idAeacodge;

    @Basic
    @Column(name = "ID_AEALISSE", table = "AEAPRODU")
    private Integer idAealisse;

    @Basic
    @Column(name = "ID_AEACOANP", table = "AEAPRODU")
    private Integer idAeacoanp;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPRODU", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPRODU", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPRODU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPRODU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPRODU")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAPRODU", nullable = false, length = 50)
    private String descricao;

    @Lob
    @Basic
    @Column(name = "DESCRICAO_AUXILIAR", table = "AEAPRODU")
    private byte[] descricaoAuxiliar;

    @Basic
    @Column(name = "DESCRICAO_MASCARA", table = "AEAPRODU", length = 50)
    private String descricaoMascara;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAPRODU", nullable = false)
    private int codigo;

    @Basic
    @Column(name = "CODIGO_ESTRUTURAL", table = "AEAPRODU", length = 20)
    private String codigoEstrutural;

    @Basic
    @Column(name = "REFERENCIA", table = "AEAPRODU", length = 20)
    private String referencia;

    @Basic
    @Column(name = "CODIGO_BARRAS", table = "AEAPRODU", length = 20)
    private String codigoBarras;

    @Basic
    @Column(name = "ABREV_CF", table = "AEAPRODU", length = 2)
    private String abrevCf;

    @Basic
    @Column(name = "CLASSIF_FISCAL", table = "AEAPRODU")
    private Integer classifFiscal;

    @Basic(optional = false)
    @Column(name = "PESO_LIQUIDO", table = "AEAPRODU", nullable = false)
    private double pesoLiquido;

    @Basic(optional = false)
    @Column(name = "PESO_BRUTO", table = "AEAPRODU", nullable = false)
    private double pesoBruto;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAPRODU", nullable = false)
    private String ativo;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "AEAPRODU", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "GENERO", table = "AEAPRODU")
    private String genero;

    @Basic
    @Column(name = "VALIDADE", table = "AEAPRODU")
    private String validade;

    @Basic
    @Column(name = "GARANTIA", table = "AEAPRODU")
    private String garantia;

    @Basic
    @Column(name = "CONTROLE_SERIAL", table = "AEAPRODU")
    private String controleSerial;

    @Basic
    @Column(name = "SAI_NA_NF", table = "AEAPRODU")
    private String saiNaNf;

    @Basic
    @Column(name = "AGRUPADOR_PRECO", table = "AEAPRODU", length = 20)
    private String agrupadorPreco;

    @Basic
    @Column(name = "EX_IPI", table = "AEAPRODU", length = 3)
    private String exIpi;

    @Basic
    @Column(name = "TIPO_ITEM_EFD", table = "AEAPRODU")
    private String tipoItemEfd;

    @Basic
    @Column(name = "CODIGO_NCM", table = "AEAPRODU", length = 13)
    private String codigoNcm;

    @Basic
    @Column(name = "SIMILARIDADE", table = "AEAPRODU")
    private Integer similaridade;

    @Basic
    @Column(name = "ROMANEIA", table = "AEAPRODU")
    private String romaneia;

    @Basic
    @Column(name = "FCI", table = "AEAPRODU", length = 40)
    private String fci;

    @Basic(optional = false)
    @Column(name = "LUCRO_VARE", table = "AEAPRODU", nullable = false)
    private double lucroVare;

    @Basic(optional = false)
    @Column(name = "LUCRO_ATAC", table = "AEAPRODU", nullable = false)
    private double lucroAtac;

    @Basic(optional = false)
    @Column(name = "MVA", table = "AEAPRODU", nullable = false)
    private double mva;

    @Basic
    @Column(name = "CEST", table = "AEAPRODU", length = 13)
    private String cest;

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdAeafamil() {
        return idAeafamil;
    }

    public void setIdAeafamil(Integer idAeafamil) {
        this.idAeafamil = idAeafamil;
    }

    public Integer getIdAeaclase() {
        return idAeaclase;
    }

    public void setIdAeaclase(Integer idAeaclase) {
        this.idAeaclase = idAeaclase;
    }

    public Integer getIdAeagrupo() {
        return idAeagrupo;
    }

    public void setIdAeagrupo(Integer idAeagrupo) {
        this.idAeagrupo = idAeagrupo;
    }

    public Integer getIdAeasgrup() {
        return idAeasgrup;
    }

    public void setIdAeasgrup(Integer idAeasgrup) {
        this.idAeasgrup = idAeasgrup;
    }

    public Integer getIdAeamarca() {
        return idAeamarca;
    }

    public void setIdAeamarca(Integer idAeamarca) {
        this.idAeamarca = idAeamarca;
    }

    public int getIdAeaunven() {
        return idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public Integer getIdAeapesos() {
        return idAeapesos;
    }

    public void setIdAeapesos(Integer idAeapesos) {
        this.idAeapesos = idAeapesos;
    }

    public Integer getIdAeatpgrd() {
        return idAeatpgrd;
    }

    public void setIdAeatpgrd(Integer idAeatpgrd) {
        this.idAeatpgrd = idAeatpgrd;
    }

    public int getIdAeacodom() {
        return idAeacodom;
    }

    public void setIdAeacodom(int idAeacodom) {
        this.idAeacodom = idAeacodom;
    }

    public Integer getIdCfamodeq() {
        return idCfamodeq;
    }

    public void setIdCfamodeq(Integer idCfamodeq) {
        this.idCfamodeq = idCfamodeq;
    }

    public Integer getIdAeacodge() {
        return idAeacodge;
    }

    public void setIdAeacodge(Integer idAeacodge) {
        this.idAeacodge = idAeacodge;
    }

    public Integer getIdAealisse() {
        return idAealisse;
    }

    public void setIdAealisse(Integer idAealisse) {
        this.idAealisse = idAealisse;
    }

    public Integer getIdAeacoanp() {
        return idAeacoanp;
    }

    public void setIdAeacoanp(Integer idAeacoanp) {
        this.idAeacoanp = idAeacoanp;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getDescricaoAuxiliar() {
        return descricaoAuxiliar;
    }

    public void setDescricaoAuxiliar(byte[] descricaoAuxiliar) {
        this.descricaoAuxiliar = descricaoAuxiliar;
    }

    public String getDescricaoMascara() {
        return descricaoMascara;
    }

    public void setDescricaoMascara(String descricaoMascara) {
        this.descricaoMascara = descricaoMascara;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoEstrutural() {
        return codigoEstrutural;
    }

    public void setCodigoEstrutural(String codigoEstrutural) {
        this.codigoEstrutural = codigoEstrutural;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getAbrevCf() {
        return abrevCf;
    }

    public void setAbrevCf(String abrevCf) {
        this.abrevCf = abrevCf;
    }

    public Integer getClassifFiscal() {
        return classifFiscal;
    }

    public void setClassifFiscal(Integer classifFiscal) {
        this.classifFiscal = classifFiscal;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getControleSerial() {
        return controleSerial;
    }

    public void setControleSerial(String controleSerial) {
        this.controleSerial = controleSerial;
    }

    public String getSaiNaNf() {
        return saiNaNf;
    }

    public void setSaiNaNf(String saiNaNf) {
        this.saiNaNf = saiNaNf;
    }

    public String getAgrupadorPreco() {
        return agrupadorPreco;
    }

    public void setAgrupadorPreco(String agrupadorPreco) {
        this.agrupadorPreco = agrupadorPreco;
    }

    public String getExIpi() {
        return exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }

    public String getTipoItemEfd() {
        return tipoItemEfd;
    }

    public void setTipoItemEfd(String tipoItemEfd) {
        this.tipoItemEfd = tipoItemEfd;
    }

    public String getCodigoNcm() {
        return codigoNcm;
    }

    public void setCodigoNcm(String codigoNcm) {
        this.codigoNcm = codigoNcm;
    }

    public Integer getSimilaridade() {
        return similaridade;
    }

    public void setSimilaridade(Integer similaridade) {
        this.similaridade = similaridade;
    }

    public String getRomaneia() {
        return romaneia;
    }

    public void setRomaneia(String romaneia) {
        this.romaneia = romaneia;
    }

    public String getFci() {
        return fci;
    }

    public void setFci(String fci) {
        this.fci = fci;
    }

    public double getLucroVare() {
        return lucroVare;
    }

    public void setLucroVare(double lucroVare) {
        this.lucroVare = lucroVare;
    }

    public double getLucroAtac() {
        return lucroAtac;
    }

    public void setLucroAtac(double lucroAtac) {
        this.lucroAtac = lucroAtac;
    }

    public double getMva() {
        return mva;
    }

    public void setMva(double mva) {
        this.mva = mva;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

}