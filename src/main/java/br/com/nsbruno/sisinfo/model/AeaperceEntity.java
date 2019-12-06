package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AEAPERCE")
public class AeaperceEntity {

    @Id
    @Column(name = "ID_AEAPERCE", table = "AEAPERCE", nullable = false)
    private Integer idAeaperce;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "AEAPERCE")
    private Integer idSmaempre;

    @Basic
    @Column(name = "ID_CFAPARAM_VENDEDOR", table = "AEAPERCE")
    private Integer idCfaparamVendedor;

    @Basic
    @Column(name = "ID_AEATBPER_TABELA", table = "AEAPERCE")
    private Integer idAeatbperTabela;

    @Basic
    @Column(name = "ID_AEATBPER", table = "AEAPERCE")
    private Integer idAeatbper;

    @Basic
    @Column(name = "ID_AEAFAMIL", table = "AEAPERCE")
    private Integer idAeafamil;

    @Basic
    @Column(name = "ID_AEACLASE", table = "AEAPERCE")
    private Integer idAeaclase;

    @Basic
    @Column(name = "ID_AEAGRUPO", table = "AEAPERCE")
    private Integer idAeagrupo;

    @Basic
    @Column(name = "ID_AEASGRUP", table = "AEAPERCE")
    private Integer idAeasgrup;

    @Basic
    @Column(name = "ID_AEAMARCA", table = "AEAPERCE")
    private Integer idAeamarca;

    @Basic
    @Column(name = "ID_AEAPRODU", table = "AEAPERCE")
    private Integer idAeaprodu;

    @Basic
    @Column(name = "ID_AEAPLOJA", table = "AEAPERCE")
    private Integer idAeaploja;

    @Basic
    @Column(name = "ID_AEAAGPPR", table = "AEAPERCE")
    private Integer idAeaagppr;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "AEAPERCE")
    private Integer idCfamoeda;

    @Basic
    @Column(name = "ID_AEAFATOR", table = "AEAPERCE")
    private Integer idAeafator;

    @Basic
    @Column(name = "ID_AEACODST_IPI", table = "AEAPERCE")
    private Integer idAeacodstIpi;

    @Basic
    @Column(name = "ID_AEACODST_PIS", table = "AEAPERCE")
    private Integer idAeacodstPis;

    @Basic
    @Column(name = "ID_AEACODST_COFINS", table = "AEAPERCE")
    private Integer idAeacodstCofins;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPERCE", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPERCE", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPERCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPERCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPERCE")
    private Integer ctInteg;

    @Basic
    @Column(name = "TIPO_ISS", table = "AEAPERCE")
    private String tipoIss;

    @Basic(optional = false)
    @Column(name = "ISS", table = "AEAPERCE", nullable = false)
    private double iss;

    @Basic(optional = false)
    @Column(name = "CUSTO_FIXO", table = "AEAPERCE", nullable = false)
    private double custoFixo;

    @Basic(optional = false)
    @Column(name = "IMPOSTOS_FEDERAIS", table = "AEAPERCE", nullable = false)
    private double impostosFederais;

    @Basic(optional = false)
    @Column(name = "MARKUP_VARE", table = "AEAPERCE", nullable = false)
    private double markupVare;

    @Basic(optional = false)
    @Column(name = "MARKUP_ATAC", table = "AEAPERCE", nullable = false)
    private double markupAtac;

    @Basic(optional = false)
    @Column(name = "LUCRO_VARE", table = "AEAPERCE", nullable = false)
    private double lucroVare;

    @Basic(optional = false)
    @Column(name = "LUCRO_ATAC", table = "AEAPERCE", nullable = false)
    private double lucroAtac;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_VISTA_VARE", table = "AEAPERCE", nullable = false)
    private double descMercVistaVare;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_VISTA_ATAC", table = "AEAPERCE", nullable = false)
    private double descMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_PRAZO_VARE", table = "AEAPERCE", nullable = false)
    private double descMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "DESC_MERC_PRAZO_ATAC", table = "AEAPERCE", nullable = false)
    private double descMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_VISTA", table = "AEAPERCE", nullable = false)
    private double descServVista;

    @Basic(optional = false)
    @Column(name = "DESC_SERV_PRAZO", table = "AEAPERCE", nullable = false)
    private double descServPrazo;

    @Basic(optional = false)
    @Column(name = "COM_MERC_VISTA_VARE", table = "AEAPERCE", nullable = false)
    private double comMercVistaVare;

    @Basic(optional = false)
    @Column(name = "COM_MERC_VISTA_ATAC", table = "AEAPERCE", nullable = false)
    private double comMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "COM_MERC_PRAZO_VARE", table = "AEAPERCE", nullable = false)
    private double comMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "COM_MERC_PRAZO_ATAC", table = "AEAPERCE", nullable = false)
    private double comMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "COM_SERV_VISTA", table = "AEAPERCE", nullable = false)
    private double comServVista;

    @Basic(optional = false)
    @Column(name = "COM_SERV_PRAZO", table = "AEAPERCE", nullable = false)
    private double comServPrazo;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_VISTA_VARE", table = "AEAPERCE", nullable = false)
    private double comExtMercVistaVare;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_VISTA_ATAC", table = "AEAPERCE", nullable = false)
    private double comExtMercVistaAtac;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_PRAZO_VARE", table = "AEAPERCE", nullable = false)
    private double comExtMercPrazoVare;

    @Basic(optional = false)
    @Column(name = "COM_EXT_MERC_PRAZO_ATAC", table = "AEAPERCE", nullable = false)
    private double comExtMercPrazoAtac;

    @Basic(optional = false)
    @Column(name = "COM_EXT_SERV_VISTA", table = "AEAPERCE", nullable = false)
    private double comExtServVista;

    @Basic(optional = false)
    @Column(name = "COM_EXT_SERV_PRAZO", table = "AEAPERCE", nullable = false)
    private double comExtServPrazo;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_IPI", table = "AEAPERCE", nullable = false)
    private double aliquotaIpi;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_PIS", table = "AEAPERCE", nullable = false)
    private double aliquotaPis;

    @Basic(optional = false)
    @Column(name = "ALIQUOTA_COFINS", table = "AEAPERCE", nullable = false)
    private double aliquotaCofins;

    public Integer getIdAeaperce() {
        return idAeaperce;
    }

    public void setIdAeaperce(Integer idAeaperce) {
        this.idAeaperce = idAeaperce;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfaparamVendedor() {
        return idCfaparamVendedor;
    }

    public void setIdCfaparamVendedor(Integer idCfaparamVendedor) {
        this.idCfaparamVendedor = idCfaparamVendedor;
    }

    public Integer getIdAeatbperTabela() {
        return idAeatbperTabela;
    }

    public void setIdAeatbperTabela(Integer idAeatbperTabela) {
        this.idAeatbperTabela = idAeatbperTabela;
    }

    public Integer getIdAeatbper() {
        return idAeatbper;
    }

    public void setIdAeatbper(Integer idAeatbper) {
        this.idAeatbper = idAeatbper;
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

    public Integer getIdAeaprodu() {
        return idAeaprodu;
    }

    public void setIdAeaprodu(Integer idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public Integer getIdAeaploja() {
        return idAeaploja;
    }

    public void setIdAeaploja(Integer idAeaploja) {
        this.idAeaploja = idAeaploja;
    }

    public Integer getIdAeaagppr() {
        return idAeaagppr;
    }

    public void setIdAeaagppr(Integer idAeaagppr) {
        this.idAeaagppr = idAeaagppr;
    }

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
    }

    public Integer getIdAeafator() {
        return idAeafator;
    }

    public void setIdAeafator(Integer idAeafator) {
        this.idAeafator = idAeafator;
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

    public String getTipoIss() {
        return tipoIss;
    }

    public void setTipoIss(String tipoIss) {
        this.tipoIss = tipoIss;
    }

    public double getIss() {
        return iss;
    }

    public void setIss(double iss) {
        this.iss = iss;
    }

    public double getCustoFixo() {
        return custoFixo;
    }

    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }

    public double getImpostosFederais() {
        return impostosFederais;
    }

    public void setImpostosFederais(double impostosFederais) {
        this.impostosFederais = impostosFederais;
    }

    public double getMarkupVare() {
        return markupVare;
    }

    public void setMarkupVare(double markupVare) {
        this.markupVare = markupVare;
    }

    public double getMarkupAtac() {
        return markupAtac;
    }

    public void setMarkupAtac(double markupAtac) {
        this.markupAtac = markupAtac;
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

    public double getDescMercVistaVare() {
        return descMercVistaVare;
    }

    public void setDescMercVistaVare(double descMercVistaVare) {
        this.descMercVistaVare = descMercVistaVare;
    }

    public double getDescMercVistaAtac() {
        return descMercVistaAtac;
    }

    public void setDescMercVistaAtac(double descMercVistaAtac) {
        this.descMercVistaAtac = descMercVistaAtac;
    }

    public double getDescMercPrazoVare() {
        return descMercPrazoVare;
    }

    public void setDescMercPrazoVare(double descMercPrazoVare) {
        this.descMercPrazoVare = descMercPrazoVare;
    }

    public double getDescMercPrazoAtac() {
        return descMercPrazoAtac;
    }

    public void setDescMercPrazoAtac(double descMercPrazoAtac) {
        this.descMercPrazoAtac = descMercPrazoAtac;
    }

    public double getDescServVista() {
        return descServVista;
    }

    public void setDescServVista(double descServVista) {
        this.descServVista = descServVista;
    }

    public double getDescServPrazo() {
        return descServPrazo;
    }

    public void setDescServPrazo(double descServPrazo) {
        this.descServPrazo = descServPrazo;
    }

    public double getComMercVistaVare() {
        return comMercVistaVare;
    }

    public void setComMercVistaVare(double comMercVistaVare) {
        this.comMercVistaVare = comMercVistaVare;
    }

    public double getComMercVistaAtac() {
        return comMercVistaAtac;
    }

    public void setComMercVistaAtac(double comMercVistaAtac) {
        this.comMercVistaAtac = comMercVistaAtac;
    }

    public double getComMercPrazoVare() {
        return comMercPrazoVare;
    }

    public void setComMercPrazoVare(double comMercPrazoVare) {
        this.comMercPrazoVare = comMercPrazoVare;
    }

    public double getComMercPrazoAtac() {
        return comMercPrazoAtac;
    }

    public void setComMercPrazoAtac(double comMercPrazoAtac) {
        this.comMercPrazoAtac = comMercPrazoAtac;
    }

    public double getComServVista() {
        return comServVista;
    }

    public void setComServVista(double comServVista) {
        this.comServVista = comServVista;
    }

    public double getComServPrazo() {
        return comServPrazo;
    }

    public void setComServPrazo(double comServPrazo) {
        this.comServPrazo = comServPrazo;
    }

    public double getComExtMercVistaVare() {
        return comExtMercVistaVare;
    }

    public void setComExtMercVistaVare(double comExtMercVistaVare) {
        this.comExtMercVistaVare = comExtMercVistaVare;
    }

    public double getComExtMercVistaAtac() {
        return comExtMercVistaAtac;
    }

    public void setComExtMercVistaAtac(double comExtMercVistaAtac) {
        this.comExtMercVistaAtac = comExtMercVistaAtac;
    }

    public double getComExtMercPrazoVare() {
        return comExtMercPrazoVare;
    }

    public void setComExtMercPrazoVare(double comExtMercPrazoVare) {
        this.comExtMercPrazoVare = comExtMercPrazoVare;
    }

    public double getComExtMercPrazoAtac() {
        return comExtMercPrazoAtac;
    }

    public void setComExtMercPrazoAtac(double comExtMercPrazoAtac) {
        this.comExtMercPrazoAtac = comExtMercPrazoAtac;
    }

    public double getComExtServVista() {
        return comExtServVista;
    }

    public void setComExtServVista(double comExtServVista) {
        this.comExtServVista = comExtServVista;
    }

    public double getComExtServPrazo() {
        return comExtServPrazo;
    }

    public void setComExtServPrazo(double comExtServPrazo) {
        this.comExtServPrazo = comExtServPrazo;
    }

    public double getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
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

}