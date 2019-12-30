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
@Table(name = "CPAAPONT")
public class CpaapontEntity {

    @Id
    @Column(name = "ID_CPAAPONT", table = "CPAAPONT", nullable = false)
    private Integer idCpaapont;

    @Basic
    @Column(name = "ID_CFAMOEDA", table = "CPAAPONT")
    private Integer idCfamoeda;

    @Basic
    @Column(name = "ID_CPAMOTIV", table = "CPAAPONT")
    private Integer idCpamotiv;

    @Basic(optional = false)
    @Column(name = "ID_CPAESPEC", table = "CPAAPONT", nullable = false)
    private Integer idCpaespec;

    @Basic
    @Column(name = "ID_CPALIQUI", table = "CPAAPONT")
    private Integer idCpaliqui;

    @Basic
    @Column(name = "ID_CPAOCORR", table = "CPAAPONT")
    private Integer idCpaocorr;

    @Basic
    @Column(name = "ID_CFAESTAD_APR", table = "CPAAPONT")
    private Integer idCfaestadApr;

    @Basic
    @Column(name = "ID_CFAESTAD_CRE", table = "CPAAPONT")
    private Integer idCfaestadCre;

    @Basic
    @Column(name = "ID_CFAESTAD_DEV", table = "CPAAPONT")
    private Integer idCfaestadDev;

    @Basic
    @Column(name = "ID_CPAPESOA_APR", table = "CPAAPONT")
    private Integer idCpapesoaApr;

    @Basic
    @Column(name = "ID_CPAPESOA_CRE", table = "CPAAPONT")
    private Integer idCpapesoaCre;

    @Basic
    @Column(name = "ID_CPAPESOA_DEV", table = "CPAAPONT")
    private Integer idCpapesoaDev;

    @Basic
    @Column(name = "ID_CPAPESOA_CH", table = "CPAAPONT")
    private Integer idCpapesoaCh;

    @Basic
    @Column(name = "ID_CPAIRREG", table = "CPAAPONT")
    private Integer idCpairreg;

    @Basic
    @Column(name = "US_CAD", table = "CPAAPONT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPAAPONT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPAAPONT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPAAPONT")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPAAPONT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "PROTOCOLO", table = "CPAAPONT")
    private Integer protocolo;

    @Basic
    @Column(name = "DT_PROTOCOLO", table = "CPAAPONT")
    @Temporal(TemporalType.DATE)
    private Date dtProtocolo;

    @Basic
    @Column(name = "DT_PREV_PROT", table = "CPAAPONT")
    @Temporal(TemporalType.DATE)
    private Date dtPrevProt;

    @Basic
    @Column(name = "APR_NOME", table = "CPAAPONT", length = 60)
    private String aprNome;

    @Basic
    @Column(name = "APR_ENDERECO", table = "CPAAPONT", length = 128)
    private String aprEndereco;

    @Basic
    @Column(name = "APR_NUMERO", table = "CPAAPONT", length = 6)
    private String aprNumero;

    @Basic
    @Column(name = "APR_BAIRRO", table = "CPAAPONT", length = 40)
    private String aprBairro;

    @Basic
    @Column(name = "APR_CIDADE", table = "CPAAPONT", length = 40)
    private String aprCidade;

    @Basic
    @Column(name = "APR_CEP", table = "CPAAPONT", length = 9)
    private String aprCep;

    @Basic
    @Column(name = "CRE_NOME", table = "CPAAPONT", length = 60)
    private String creNome;

    @Basic
    @Column(name = "CRE_ENDERECO", table = "CPAAPONT", length = 128)
    private String creEndereco;

    @Basic
    @Column(name = "CRE_NUMERO", table = "CPAAPONT", length = 6)
    private String creNumero;

    @Basic
    @Column(name = "CRE_BAIRRO", table = "CPAAPONT", length = 40)
    private String creBairro;

    @Basic
    @Column(name = "CRE_CIDADE", table = "CPAAPONT", length = 40)
    private String creCidade;

    @Basic
    @Column(name = "CRE_CEP", table = "CPAAPONT", length = 9)
    private String creCep;

    @Basic
    @Column(name = "DEVDOCNUM", table = "CPAAPONT", length = 18)
    private String devdocnum;

    @Basic
    @Column(name = "DEV_NOME", table = "CPAAPONT", length = 60)
    private String devNome;

    @Basic
    @Column(name = "DEV_ENDERECO", table = "CPAAPONT", length = 128)
    private String devEndereco;

    @Basic
    @Column(name = "DEV_NUMERO", table = "CPAAPONT", length = 6)
    private String devNumero;

    @Basic
    @Column(name = "DEV_BAIRRO", table = "CPAAPONT", length = 40)
    private String devBairro;

    @Basic
    @Column(name = "DEV_CIDADE", table = "CPAAPONT", length = 40)
    private String devCidade;

    @Basic
    @Column(name = "DEV_CEP", table = "CPAAPONT", length = 9)
    private String devCep;

    @Basic
    @Column(name = "TITULO", table = "CPAAPONT", length = 20)
    private String titulo;

    @Basic
    @Column(name = "DT_EMISSAO", table = "CPAAPONT")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Basic
    @Column(name = "DT_VENCIMENTO", table = "CPAAPONT")
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Basic(optional = false)
    @Column(name = "VL_TITULO", table = "CPAAPONT", nullable = false)
    private double vlTitulo;

    @Basic(optional = false)
    @Column(name = "SALDO_TITULO", table = "CPAAPONT", nullable = false)
    private double saldoTitulo;

    @Basic(optional = false)
    @Column(name = "VL_JUROS", table = "CPAAPONT", nullable = false)
    private double vlJuros;

    @Basic
    @Column(name = "ENDOSSO", table = "CPAAPONT")
    private String endosso;

    @Basic
    @Column(name = "ACEITO", table = "CPAAPONT")
    private String aceito;

    @Lob
    @Basic
    @Column(name = "OBS", table = "CPAAPONT")
    private byte[] obs;

    @Basic
    @Column(name = "DT_OCORRENCIA", table = "CPAAPONT")
    @Temporal(TemporalType.DATE)
    private Date dtOcorrencia;

    @Basic
    @Column(name = "HR_OCORRENCIA", table = "CPAAPONT", length = 18)
    private String hrOcorrencia;

    @Basic(optional = false)
    @Column(name = "VL_EMOL", table = "CPAAPONT", nullable = false)
    private double vlEmol;

    @Basic(optional = false)
    @Column(name = "VL_TRIB", table = "CPAAPONT", nullable = false)
    private double vlTrib;

    @Basic(optional = false)
    @Column(name = "VL_FUJU", table = "CPAAPONT", nullable = false)
    private double vlFuju;

    @Basic(optional = false)
    @Column(name = "VL_SELO", table = "CPAAPONT", nullable = false)
    private double vlSelo;

    @Basic
    @Column(name = "FC_VL_CUSTAS", table = "CPAAPONT", precision = 15)
    private Double fcVlCustas;

    @Basic
    @Column(name = "PROT_TERMO", table = "CPAAPONT")
    private Integer protTermo;

    @Basic
    @Column(name = "PROT_LIVRO", table = "CPAAPONT")
    private Integer protLivro;

    @Basic
    @Column(name = "PROT_FOLHA", table = "CPAAPONT")
    private Integer protFolha;

    @Basic
    @Column(name = "CANC_TERMO", table = "CPAAPONT")
    private Integer cancTermo;

    @Basic
    @Column(name = "CANC_DATA", table = "CPAAPONT")
    @Temporal(TemporalType.DATE)
    private Date cancData;

    @Basic(optional = false)
    @Column(name = "CANC_EMOL", table = "CPAAPONT", nullable = false)
    private double cancEmol;

    @Basic(optional = false)
    @Column(name = "CANC_TRIB", table = "CPAAPONT", nullable = false)
    private double cancTrib;

    @Basic(optional = false)
    @Column(name = "CANC_FUJU", table = "CPAAPONT", nullable = false)
    private double cancFuju;

    @Basic(optional = false)
    @Column(name = "CANC_SELO", table = "CPAAPONT", nullable = false)
    private double cancSelo;

    @Basic
    @Column(name = "FC_CANC_CUSTAS", table = "CPAAPONT", precision = 15)
    private Double fcCancCustas;

    @Basic
    @Column(name = "NOSSO_NUMERO", table = "CPAAPONT", length = 20)
    private String nossoNumero;

    @Basic
    @Column(name = "AG_COD_CENDENTE", table = "CPAAPONT", length = 20)
    private String agCodCendente;

    @Basic
    @Column(name = "AGENCIA_CENTRAL", table = "CPAAPONT", length = 6)
    private String agenciaCentral;

    @Lob
    @Basic
    @Column(name = "IMAGEM", table = "CPAAPONT")
    private byte[] imagem;

    @Basic
    @Column(name = "PRACA_PAGTO", table = "CPAAPONT", length = 40)
    private String pracaPagto;

    @Basic
    @Column(name = "CONFIRMOU", table = "CPAAPONT")
    private String confirmou;

    @Basic
    @Column(name = "RETORNOU", table = "CPAAPONT")
    private String retornou;

    @Basic(optional = false)
    @Column(name = "PERC_CUSTAS", table = "CPAAPONT", nullable = false)
    private double percCustas;

    @Basic
    @Column(name = "COD_OCORRENCIA", table = "CPAAPONT")
    private String codOcorrencia;

    @Basic
    @Column(name = "CH_AG", table = "CPAAPONT", length = 18)
    private String chAg;

    @Basic
    @Column(name = "CH_CC", table = "CPAAPONT", length = 18)
    private String chCc;

    @Basic
    @Column(name = "CH_CH", table = "CPAAPONT", length = 18)
    private String chCh;

    @Basic
    @Column(name = "DT_DEV_CH", table = "CPAAPONT")
    @Temporal(TemporalType.DATE)
    private Date dtDevCh;

    @Lob
    @Basic
    @Column(name = "OBS_DEV_CH", table = "CPAAPONT")
    private byte[] obsDevCh;

    @Basic(optional = false)
    @Column(name = "GEROU_INF_PROT", table = "CPAAPONT", nullable = false)
    private Integer gerouInfProt;

    @Basic(optional = false)
    @Column(name = "GEROU_INF_CANC", table = "CPAAPONT", nullable = false)
    private Integer gerouInfCanc;

    @Basic(optional = false)
    @Column(name = "VL_UNIT_INF_PRO", table = "CPAAPONT", nullable = false)
    private double vlUnitInfPro;

    @Basic(optional = false)
    @Column(name = "VL_UNIT_INF_CAN", table = "CPAAPONT", nullable = false)
    private double vlUnitInfCan;

    public Integer getIdCpaapont() {
        return idCpaapont;
    }

    public void setIdCpaapont(Integer idCpaapont) {
        this.idCpaapont = idCpaapont;
    }

    public Integer getIdCfamoeda() {
        return idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
    }

    public Integer getIdCpamotiv() {
        return idCpamotiv;
    }

    public void setIdCpamotiv(Integer idCpamotiv) {
        this.idCpamotiv = idCpamotiv;
    }

    public Integer getIdCpaespec() {
        return idCpaespec;
    }

    public void setIdCpaespec(Integer idCpaespec) {
        this.idCpaespec = idCpaespec;
    }

    public Integer getIdCpaliqui() {
        return idCpaliqui;
    }

    public void setIdCpaliqui(Integer idCpaliqui) {
        this.idCpaliqui = idCpaliqui;
    }

    public Integer getIdCpaocorr() {
        return idCpaocorr;
    }

    public void setIdCpaocorr(Integer idCpaocorr) {
        this.idCpaocorr = idCpaocorr;
    }

    public Integer getIdCfaestadApr() {
        return idCfaestadApr;
    }

    public void setIdCfaestadApr(Integer idCfaestadApr) {
        this.idCfaestadApr = idCfaestadApr;
    }

    public Integer getIdCfaestadCre() {
        return idCfaestadCre;
    }

    public void setIdCfaestadCre(Integer idCfaestadCre) {
        this.idCfaestadCre = idCfaestadCre;
    }

    public Integer getIdCfaestadDev() {
        return idCfaestadDev;
    }

    public void setIdCfaestadDev(Integer idCfaestadDev) {
        this.idCfaestadDev = idCfaestadDev;
    }

    public Integer getIdCpapesoaApr() {
        return idCpapesoaApr;
    }

    public void setIdCpapesoaApr(Integer idCpapesoaApr) {
        this.idCpapesoaApr = idCpapesoaApr;
    }

    public Integer getIdCpapesoaCre() {
        return idCpapesoaCre;
    }

    public void setIdCpapesoaCre(Integer idCpapesoaCre) {
        this.idCpapesoaCre = idCpapesoaCre;
    }

    public Integer getIdCpapesoaDev() {
        return idCpapesoaDev;
    }

    public void setIdCpapesoaDev(Integer idCpapesoaDev) {
        this.idCpapesoaDev = idCpapesoaDev;
    }

    public Integer getIdCpapesoaCh() {
        return idCpapesoaCh;
    }

    public void setIdCpapesoaCh(Integer idCpapesoaCh) {
        this.idCpapesoaCh = idCpapesoaCh;
    }

    public Integer getIdCpairreg() {
        return idCpairreg;
    }

    public void setIdCpairreg(Integer idCpairreg) {
        this.idCpairreg = idCpairreg;
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Integer protocolo) {
        this.protocolo = protocolo;
    }

    public Date getDtProtocolo() {
        return dtProtocolo;
    }

    public void setDtProtocolo(Date dtProtocolo) {
        this.dtProtocolo = dtProtocolo;
    }

    public Date getDtPrevProt() {
        return dtPrevProt;
    }

    public void setDtPrevProt(Date dtPrevProt) {
        this.dtPrevProt = dtPrevProt;
    }

    public String getAprNome() {
        return aprNome;
    }

    public void setAprNome(String aprNome) {
        this.aprNome = aprNome;
    }

    public String getAprEndereco() {
        return aprEndereco;
    }

    public void setAprEndereco(String aprEndereco) {
        this.aprEndereco = aprEndereco;
    }

    public String getAprNumero() {
        return aprNumero;
    }

    public void setAprNumero(String aprNumero) {
        this.aprNumero = aprNumero;
    }

    public String getAprBairro() {
        return aprBairro;
    }

    public void setAprBairro(String aprBairro) {
        this.aprBairro = aprBairro;
    }

    public String getAprCidade() {
        return aprCidade;
    }

    public void setAprCidade(String aprCidade) {
        this.aprCidade = aprCidade;
    }

    public String getAprCep() {
        return aprCep;
    }

    public void setAprCep(String aprCep) {
        this.aprCep = aprCep;
    }

    public String getCreNome() {
        return creNome;
    }

    public void setCreNome(String creNome) {
        this.creNome = creNome;
    }

    public String getCreEndereco() {
        return creEndereco;
    }

    public void setCreEndereco(String creEndereco) {
        this.creEndereco = creEndereco;
    }

    public String getCreNumero() {
        return creNumero;
    }

    public void setCreNumero(String creNumero) {
        this.creNumero = creNumero;
    }

    public String getCreBairro() {
        return creBairro;
    }

    public void setCreBairro(String creBairro) {
        this.creBairro = creBairro;
    }

    public String getCreCidade() {
        return creCidade;
    }

    public void setCreCidade(String creCidade) {
        this.creCidade = creCidade;
    }

    public String getCreCep() {
        return creCep;
    }

    public void setCreCep(String creCep) {
        this.creCep = creCep;
    }

    public String getDevdocnum() {
        return devdocnum;
    }

    public void setDevdocnum(String devdocnum) {
        this.devdocnum = devdocnum;
    }

    public String getDevNome() {
        return devNome;
    }

    public void setDevNome(String devNome) {
        this.devNome = devNome;
    }

    public String getDevEndereco() {
        return devEndereco;
    }

    public void setDevEndereco(String devEndereco) {
        this.devEndereco = devEndereco;
    }

    public String getDevNumero() {
        return devNumero;
    }

    public void setDevNumero(String devNumero) {
        this.devNumero = devNumero;
    }

    public String getDevBairro() {
        return devBairro;
    }

    public void setDevBairro(String devBairro) {
        this.devBairro = devBairro;
    }

    public String getDevCidade() {
        return devCidade;
    }

    public void setDevCidade(String devCidade) {
        this.devCidade = devCidade;
    }

    public String getDevCep() {
        return devCep;
    }

    public void setDevCep(String devCep) {
        this.devCep = devCep;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public double getVlTitulo() {
        return vlTitulo;
    }

    public void setVlTitulo(double vlTitulo) {
        this.vlTitulo = vlTitulo;
    }

    public double getSaldoTitulo() {
        return saldoTitulo;
    }

    public void setSaldoTitulo(double saldoTitulo) {
        this.saldoTitulo = saldoTitulo;
    }

    public double getVlJuros() {
        return vlJuros;
    }

    public void setVlJuros(double vlJuros) {
        this.vlJuros = vlJuros;
    }

    public String getEndosso() {
        return endosso;
    }

    public void setEndosso(String endosso) {
        this.endosso = endosso;
    }

    public String getAceito() {
        return aceito;
    }

    public void setAceito(String aceito) {
        this.aceito = aceito;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public Date getDtOcorrencia() {
        return dtOcorrencia;
    }

    public void setDtOcorrencia(Date dtOcorrencia) {
        this.dtOcorrencia = dtOcorrencia;
    }

    public String getHrOcorrencia() {
        return hrOcorrencia;
    }

    public void setHrOcorrencia(String hrOcorrencia) {
        this.hrOcorrencia = hrOcorrencia;
    }

    public double getVlEmol() {
        return vlEmol;
    }

    public void setVlEmol(double vlEmol) {
        this.vlEmol = vlEmol;
    }

    public double getVlTrib() {
        return vlTrib;
    }

    public void setVlTrib(double vlTrib) {
        this.vlTrib = vlTrib;
    }

    public double getVlFuju() {
        return vlFuju;
    }

    public void setVlFuju(double vlFuju) {
        this.vlFuju = vlFuju;
    }

    public double getVlSelo() {
        return vlSelo;
    }

    public void setVlSelo(double vlSelo) {
        this.vlSelo = vlSelo;
    }

    public Double getFcVlCustas() {
        return fcVlCustas;
    }

    public void setFcVlCustas(Double fcVlCustas) {
        this.fcVlCustas = fcVlCustas;
    }

    public Integer getProtTermo() {
        return protTermo;
    }

    public void setProtTermo(Integer protTermo) {
        this.protTermo = protTermo;
    }

    public Integer getProtLivro() {
        return protLivro;
    }

    public void setProtLivro(Integer protLivro) {
        this.protLivro = protLivro;
    }

    public Integer getProtFolha() {
        return protFolha;
    }

    public void setProtFolha(Integer protFolha) {
        this.protFolha = protFolha;
    }

    public Integer getCancTermo() {
        return cancTermo;
    }

    public void setCancTermo(Integer cancTermo) {
        this.cancTermo = cancTermo;
    }

    public Date getCancData() {
        return cancData;
    }

    public void setCancData(Date cancData) {
        this.cancData = cancData;
    }

    public double getCancEmol() {
        return cancEmol;
    }

    public void setCancEmol(double cancEmol) {
        this.cancEmol = cancEmol;
    }

    public double getCancTrib() {
        return cancTrib;
    }

    public void setCancTrib(double cancTrib) {
        this.cancTrib = cancTrib;
    }

    public double getCancFuju() {
        return cancFuju;
    }

    public void setCancFuju(double cancFuju) {
        this.cancFuju = cancFuju;
    }

    public double getCancSelo() {
        return cancSelo;
    }

    public void setCancSelo(double cancSelo) {
        this.cancSelo = cancSelo;
    }

    public Double getFcCancCustas() {
        return fcCancCustas;
    }

    public void setFcCancCustas(Double fcCancCustas) {
        this.fcCancCustas = fcCancCustas;
    }

    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public String getAgCodCendente() {
        return agCodCendente;
    }

    public void setAgCodCendente(String agCodCendente) {
        this.agCodCendente = agCodCendente;
    }

    public String getAgenciaCentral() {
        return agenciaCentral;
    }

    public void setAgenciaCentral(String agenciaCentral) {
        this.agenciaCentral = agenciaCentral;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getPracaPagto() {
        return pracaPagto;
    }

    public void setPracaPagto(String pracaPagto) {
        this.pracaPagto = pracaPagto;
    }

    public String getConfirmou() {
        return confirmou;
    }

    public void setConfirmou(String confirmou) {
        this.confirmou = confirmou;
    }

    public String getRetornou() {
        return retornou;
    }

    public void setRetornou(String retornou) {
        this.retornou = retornou;
    }

    public double getPercCustas() {
        return percCustas;
    }

    public void setPercCustas(double percCustas) {
        this.percCustas = percCustas;
    }

    public String getCodOcorrencia() {
        return codOcorrencia;
    }

    public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    public String getChAg() {
        return chAg;
    }

    public void setChAg(String chAg) {
        this.chAg = chAg;
    }

    public String getChCc() {
        return chCc;
    }

    public void setChCc(String chCc) {
        this.chCc = chCc;
    }

    public String getChCh() {
        return chCh;
    }

    public void setChCh(String chCh) {
        this.chCh = chCh;
    }

    public Date getDtDevCh() {
        return dtDevCh;
    }

    public void setDtDevCh(Date dtDevCh) {
        this.dtDevCh = dtDevCh;
    }

    public byte[] getObsDevCh() {
        return obsDevCh;
    }

    public void setObsDevCh(byte[] obsDevCh) {
        this.obsDevCh = obsDevCh;
    }

    public Integer getGerouInfProt() {
        return gerouInfProt;
    }

    public void setGerouInfProt(Integer gerouInfProt) {
        this.gerouInfProt = gerouInfProt;
    }

    public Integer getGerouInfCanc() {
        return gerouInfCanc;
    }

    public void setGerouInfCanc(Integer gerouInfCanc) {
        this.gerouInfCanc = gerouInfCanc;
    }

    public double getVlUnitInfPro() {
        return vlUnitInfPro;
    }

    public void setVlUnitInfPro(double vlUnitInfPro) {
        this.vlUnitInfPro = vlUnitInfPro;
    }

    public double getVlUnitInfCan() {
        return vlUnitInfCan;
    }

    public void setVlUnitInfCan(double vlUnitInfCan) {
        this.vlUnitInfCan = vlUnitInfCan;
    }

}