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
@Table(name = "SMAPARAM")
@Data
public class SmaparamEntity {

    @Id
    @Column(name = "ID_SMAPARAM", table = "SMAPARAM", nullable = false)
    private Integer idSmaparam;

    @Basic
    @Column(name = "ID_AEACODOM", table = "SMAPARAM")
    private Integer idAeacodom;

    @Basic
    @Column(name = "ID_SMAEMPRE_MANUT_PROD", table = "SMAPARAM")
    private Integer idSmaempreManutProd;

    @Basic
    @Column(name = "ID_SMAEMPRE", table = "SMAPARAM")
    private Integer idSmaempre;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAPARAM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAPARAM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAPARAM")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DIG_FAMILIA", table = "SMAPARAM", nullable = false)
    private int digFamilia;

    @Basic(optional = false)
    @Column(name = "DIG_CLASSE", table = "SMAPARAM", nullable = false)
    private int digClasse;

    @Basic(optional = false)
    @Column(name = "DIG_GRUPO", table = "SMAPARAM", nullable = false)
    private int digGrupo;

    @Basic(optional = false)
    @Column(name = "DIG_SUBGRUPO", table = "SMAPARAM", nullable = false)
    private int digSubgrupo;

    @Basic(optional = false)
    @Column(name = "DIG_CODIGO", table = "SMAPARAM", nullable = false)
    private int digCodigo;

    @Basic
    @Column(name = "NOME_RAZAO", table = "SMAPARAM", length = 60)
    private String nomeRazao;

    @Basic
    @Column(name = "CPF_CGC", table = "SMAPARAM", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "PADRAO_CODIGO_BARRAS", table = "SMAPARAM", length = 20)
    private String padraoCodigoBarras;

    @Basic
    @Column(name = "INATIVA_PROD_COM_ESTOQUE", table = "SMAPARAM")
    private String inativaProdComEstoque;

    @Basic
    @Column(name = "FONTE_RELAT_NOME", table = "SMAPARAM", length = 20)
    private String fonteRelatNome;

    @Basic(optional = false)
    @Column(name = "FONTE_RELAT_SIZE", table = "SMAPARAM", nullable = false)
    private int fonteRelatSize;

    @Basic
    @Column(name = "DATA_ULT_TRANSF", table = "SMAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltTransf;

    @Basic
    @Column(name = "DATA_ENTROU_AR", table = "SMAPARAM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrouAr;

    @Basic(optional = false)
    @Column(name = "ANOS_LOCK", table = "SMAPARAM", nullable = false)
    private int anosLock;

    @Basic(optional = false)
    @Column(name = "DELAY_BANNER", table = "SMAPARAM", nullable = false)
    private int delayBanner;

    @Basic(optional = false)
    @Column(name = "DELAY_ENTRE_BANNER", table = "SMAPARAM", nullable = false)
    private int delayEntreBanner;

    @Basic
    @Column(name = "RETORNO_FATURADO", table = "SMAPARAM")
    private String retornoFaturado;

    @Basic
    @Column(name = "VALIDA_GTIN", table = "SMAPARAM")
    private String validaGtin;

    @Basic
    @Column(name = "COD_INC_TRIB", table = "SMAPARAM")
    private String codIncTrib;

    @Basic
    @Column(name = "IND_APRO_CRED", table = "SMAPARAM")
    private String indAproCred;

    @Basic
    @Column(name = "COD_TIPO_CONT", table = "SMAPARAM")
    private String codTipoCont;

    @Basic
    @Column(name = "IND_REG_CUM", table = "SMAPARAM")
    private String indRegCum;

    @Basic
    @Column(name = "VERSAO_BANCO", table = "SMAPARAM")
    private Integer versaoBanco;

    @Basic
    @Column(name = "BD_ATUALIZANDO", table = "SMAPARAM")
    private String bdAtualizando;

    @Basic
    @Column(name = "TIPO_PARTIDAS", table = "SMAPARAM")
    private String tipoPartidas;

    @Basic
    @Column(name = "TIPO_BAIXA_CONTRATOS", table = "SMAPARAM")
    private String tipoBaixaContratos;

    public Integer getIdSmaparam() {
        return idSmaparam;
    }

    public void setIdSmaparam(Integer idSmaparam) {
        this.idSmaparam = idSmaparam;
    }

    public Integer getIdAeacodom() {
        return idAeacodom;
    }

    public void setIdAeacodom(Integer idAeacodom) {
        this.idAeacodom = idAeacodom;
    }

    public Integer getIdSmaempreManutProd() {
        return idSmaempreManutProd;
    }

    public void setIdSmaempreManutProd(Integer idSmaempreManutProd) {
        this.idSmaempreManutProd = idSmaempreManutProd;
    }

    public Integer getIdSmaempre() {
        return idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public int getDigFamilia() {
        return digFamilia;
    }

    public void setDigFamilia(int digFamilia) {
        this.digFamilia = digFamilia;
    }

    public int getDigClasse() {
        return digClasse;
    }

    public void setDigClasse(int digClasse) {
        this.digClasse = digClasse;
    }

    public int getDigGrupo() {
        return digGrupo;
    }

    public void setDigGrupo(int digGrupo) {
        this.digGrupo = digGrupo;
    }

    public int getDigSubgrupo() {
        return digSubgrupo;
    }

    public void setDigSubgrupo(int digSubgrupo) {
        this.digSubgrupo = digSubgrupo;
    }

    public int getDigCodigo() {
        return digCodigo;
    }

    public void setDigCodigo(int digCodigo) {
        this.digCodigo = digCodigo;
    }

    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public String getCpfCgc() {
        return cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public String getPadraoCodigoBarras() {
        return padraoCodigoBarras;
    }

    public void setPadraoCodigoBarras(String padraoCodigoBarras) {
        this.padraoCodigoBarras = padraoCodigoBarras;
    }

    public String getInativaProdComEstoque() {
        return inativaProdComEstoque;
    }

    public void setInativaProdComEstoque(String inativaProdComEstoque) {
        this.inativaProdComEstoque = inativaProdComEstoque;
    }

    public String getFonteRelatNome() {
        return fonteRelatNome;
    }

    public void setFonteRelatNome(String fonteRelatNome) {
        this.fonteRelatNome = fonteRelatNome;
    }

    public int getFonteRelatSize() {
        return fonteRelatSize;
    }

    public void setFonteRelatSize(int fonteRelatSize) {
        this.fonteRelatSize = fonteRelatSize;
    }

    public Date getDataUltTransf() {
        return dataUltTransf;
    }

    public void setDataUltTransf(Date dataUltTransf) {
        this.dataUltTransf = dataUltTransf;
    }

    public Date getDataEntrouAr() {
        return dataEntrouAr;
    }

    public void setDataEntrouAr(Date dataEntrouAr) {
        this.dataEntrouAr = dataEntrouAr;
    }

    public int getAnosLock() {
        return anosLock;
    }

    public void setAnosLock(int anosLock) {
        this.anosLock = anosLock;
    }

    public int getDelayBanner() {
        return delayBanner;
    }

    public void setDelayBanner(int delayBanner) {
        this.delayBanner = delayBanner;
    }

    public int getDelayEntreBanner() {
        return delayEntreBanner;
    }

    public void setDelayEntreBanner(int delayEntreBanner) {
        this.delayEntreBanner = delayEntreBanner;
    }

    public String getRetornoFaturado() {
        return retornoFaturado;
    }

    public void setRetornoFaturado(String retornoFaturado) {
        this.retornoFaturado = retornoFaturado;
    }

    public String getValidaGtin() {
        return validaGtin;
    }

    public void setValidaGtin(String validaGtin) {
        this.validaGtin = validaGtin;
    }

    public String getCodIncTrib() {
        return codIncTrib;
    }

    public void setCodIncTrib(String codIncTrib) {
        this.codIncTrib = codIncTrib;
    }

    public String getIndAproCred() {
        return indAproCred;
    }

    public void setIndAproCred(String indAproCred) {
        this.indAproCred = indAproCred;
    }

    public String getCodTipoCont() {
        return codTipoCont;
    }

    public void setCodTipoCont(String codTipoCont) {
        this.codTipoCont = codTipoCont;
    }

    public String getIndRegCum() {
        return indRegCum;
    }

    public void setIndRegCum(String indRegCum) {
        this.indRegCum = indRegCum;
    }

    public Integer getVersaoBanco() {
        return versaoBanco;
    }

    public void setVersaoBanco(Integer versaoBanco) {
        this.versaoBanco = versaoBanco;
    }

    public String getBdAtualizando() {
        return bdAtualizando;
    }

    public void setBdAtualizando(String bdAtualizando) {
        this.bdAtualizando = bdAtualizando;
    }

    public String getTipoPartidas() {
        return tipoPartidas;
    }

    public void setTipoPartidas(String tipoPartidas) {
        this.tipoPartidas = tipoPartidas;
    }

    public String getTipoBaixaContratos() {
        return tipoBaixaContratos;
    }

    public void setTipoBaixaContratos(String tipoBaixaContratos) {
        this.tipoBaixaContratos = tipoBaixaContratos;
    }

}