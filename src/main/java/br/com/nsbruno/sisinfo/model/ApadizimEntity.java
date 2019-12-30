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
@Table(name = "APADIZIM")
public class ApadizimEntity {

    @Id
    @Column(name = "ID_APADIZIM", table = "APADIZIM", nullable = false)
    private Integer idApadizim;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APADIZIM")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_APACOMUN", table = "APADIZIM")
    private Integer idApacomun;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "APADIZIM")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "APADIZIM")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_CFALOGRA", table = "APADIZIM")
    private Integer idCfalogra;

    @Basic
    @Column(name = "ID_CFABAIRO", table = "APADIZIM")
    private Integer idCfabairo;

    @Basic
    @Column(name = "ID_APAPASTO_PARTICIPA", table = "APADIZIM")
    private Integer idApapastoParticipa;

    @Basic
    @Column(name = "ID_APAPASTO_GOSTARIA", table = "APADIZIM")
    private Integer idApapastoGostaria;

    @Basic
    @Column(name = "US_CAD", table = "APADIZIM", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APADIZIM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APADIZIM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APADIZIM")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APADIZIM", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "NOME", table = "APADIZIM", length = 60)
    private String nome;

    @Basic
    @Column(name = "CEP", table = "APADIZIM", length = 9)
    private String cep;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "APADIZIM")
    private byte[] complemento;

    @Basic(optional = false)
    @Column(name = "NUMERO", table = "APADIZIM", nullable = false)
    private Integer numero;

    @Basic
    @Column(name = "TELEFONE", table = "APADIZIM", length = 15)
    private String telefone;

    @Basic
    @Column(name = "EMAIL", table = "APADIZIM", length = 128)
    private String email;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Basic
    @Column(name = "TEMPO_CONTRIBUICAO", table = "APADIZIM", length = 40)
    private String tempoContribuicao;

    @Basic
    @Column(name = "CASADO", table = "APADIZIM")
    private String casado;

    @Basic
    @Column(name = "CONJUGE", table = "APADIZIM", length = 60)
    private String conjuge;

    @Basic
    @Column(name = "DT_NASC_CONJUGE", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date dtNascConjuge;

    @Basic
    @Column(name = "DT_CASAMENTO", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date dtCasamento;

    @Basic
    @Column(name = "PARTICIPA_PASTORAL", table = "APADIZIM")
    private String participaPastoral;

    @Basic
    @Column(name = "GOSTARIA_PASTORAL", table = "APADIZIM")
    private String gostariaPastoral;

    @Basic
    @Column(name = "CODIGO", table = "APADIZIM")
    private Integer codigo;

    @Basic
    @Column(name = "NUMERO_FICHA", table = "APADIZIM")
    private Integer numeroFicha;

    @Basic
    @Column(name = "DIZIMO_FUNERARIA", table = "APADIZIM")
    private String dizimoFuneraria;

    @Basic
    @Column(name = "ATIVO", table = "APADIZIM")
    private String ativo;

    @Basic
    @Column(name = "LOGRADOURO", table = "APADIZIM", length = 128)
    private String logradouro;

    @Basic
    @Column(name = "NOME_CONHECIDO", table = "APADIZIM", length = 60)
    private String nomeConhecido;

    @Basic
    @Column(name = "NOME_PAI", table = "APADIZIM", length = 60)
    private String nomePai;

    @Basic
    @Column(name = "NOME_MAE", table = "APADIZIM", length = 60)
    private String nomeMae;

    @Basic
    @Column(name = "TIPO_SANGUINEO", table = "APADIZIM")
    private String tipoSanguineo;

    @Basic
    @Column(name = "FATOR_RH", table = "APADIZIM")
    private String fatorRh;

    @Basic
    @Column(name = "CPF", table = "APADIZIM", length = 18)
    private String cpf;

    @Basic
    @Column(name = "RG", table = "APADIZIM", length = 18)
    private String rg;

    @Basic
    @Column(name = "RG_ORGAO", table = "APADIZIM", length = 20)
    private String rgOrgao;

    @Basic
    @Column(name = "RG_DT_EXPEDICAO", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date rgDtExpedicao;

    @Basic
    @Column(name = "SEXO", table = "APADIZIM")
    private String sexo;

    @Basic
    @Column(name = "NACIONALIDADE", table = "APADIZIM", length = 50)
    private String nacionalidade;

    @Basic
    @Column(name = "NATURALIDADE", table = "APADIZIM", length = 50)
    private String naturalidade;

    @Basic
    @Column(name = "CAIXA_POSTAL", table = "APADIZIM")
    private Integer caixaPostal;

    @Basic
    @Column(name = "CEP_CAIXA_POSTAL", table = "APADIZIM", length = 9)
    private String cepCaixaPostal;

    @Basic
    @Column(name = "TELEFONE2", table = "APADIZIM", length = 15)
    private String telefone2;

    @Basic
    @Column(name = "REDE_SOCIAL", table = "APADIZIM", length = 13)
    private String redeSocial;

    @Basic
    @Column(name = "PAROQUIA_ANTERIOR", table = "APADIZIM", length = 60)
    private String paroquiaAnterior;

    @Basic
    @Column(name = "PADRE_PAROCO_VIGARIO", table = "APADIZIM")
    private String padreParocoVigario;

    @Basic
    @Column(name = "PADRE_TEM_PROCURACAO", table = "APADIZIM")
    private String padreTemProcuracao;

    @Basic
    @Column(name = "PADRE_DT_EXPEDICAO", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date padreDtExpedicao;

    @Basic
    @Column(name = "PADRE_DT_VALIDADE", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date padreDtValidade;

    @Basic
    @Column(name = "PADRE_LIVRO_PROCURACAO", table = "APADIZIM")
    private Integer padreLivroProcuracao;

    @Basic
    @Column(name = "PADRE_FOLHA_PROCURACAO", table = "APADIZIM")
    private Integer padreFolhaProcuracao;

    @Basic
    @Column(name = "PADRE_DT_CHEGADA_DIOCESE", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date padreDtChegadaDiocese;

    @Basic
    @Column(name = "PADRE_DT_ORDENACAO", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date padreDtOrdenacao;

    @Basic
    @Column(name = "PADRE_DT_PRESBITERAL", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date padreDtPresbiteral;

    @Basic
    @Column(name = "PADRE_DT_EPISCOPAL", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date padreDtEpiscopal;

    @Basic
    @Column(name = "PADRE_DIOCESE_ORDENACAO", table = "APADIZIM", length = 60)
    private String padreDioceseOrdenacao;

    @Basic
    @Column(name = "PADRE_DIOCESE_INCARDINACAO", table = "APADIZIM", length = 60)
    private String padreDioceseIncardinacao;

    @Basic
    @Column(name = "PADRE_DIOCESE_RESIDENCIA", table = "APADIZIM", length = 60)
    private String padreDioceseResidencia;

    @Basic
    @Column(name = "PADRE_VINCULACAO_DR", table = "APADIZIM")
    private String padreVinculacaoDr;

    @Lob
    @Basic
    @Column(name = "PADRE_ESTUDOS_FEITOS", table = "APADIZIM")
    private byte[] padreEstudosFeitos;

    @Basic
    @Column(name = "CAT_JA_FOI", table = "APADIZIM")
    private String catJaFoi;

    @Basic
    @Column(name = "CAT_JA_FOI_ONDE", table = "APADIZIM", length = 60)
    private String catJaFoiOnde;

    @Basic
    @Column(name = "CAT_JA_FOI_DT_INICIO", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date catJaFoiDtInicio;

    @Basic
    @Column(name = "CAT_JA_FOI_DT_FINAL", table = "APADIZIM", length = 18)
    private String catJaFoiDtFinal;

    @Basic
    @Column(name = "CAT_ATUAL_DT_INICIO", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date catAtualDtInicio;

    @Basic
    @Column(name = "CAT_ATUAL_DT_FINAL", table = "APADIZIM")
    @Temporal(TemporalType.DATE)
    private Date catAtualDtFinal;

    @Basic
    @Column(name = "CAT_ATUAL_N_MATRICULAS", table = "APADIZIM")
    private Integer catAtualNMatriculas;

    @Basic
    @Column(name = "CAT_ATUAL_N_FORMANDOS", table = "APADIZIM")
    private Integer catAtualNFormandos;

    @Basic
    @Column(name = "CAT_ATUAL_USA_AGENDA", table = "APADIZIM")
    private String catAtualUsaAgenda;

    @Basic
    @Column(name = "IS_DIZIMISTA", table = "APADIZIM")
    private String isDizimista;

    @Basic
    @Column(name = "IS_PADRE", table = "APADIZIM")
    private String isPadre;

    @Basic
    @Column(name = "IS_RELIGIOSO", table = "APADIZIM")
    private String isReligioso;

    @Basic
    @Column(name = "IS_MINISTRO", table = "APADIZIM")
    private String isMinistro;

    @Basic
    @Column(name = "IS_LEIGO", table = "APADIZIM")
    private String isLeigo;

    @Basic
    @Column(name = "IS_OUTROS", table = "APADIZIM")
    private String isOutros;

    @Lob
    @Basic
    @Column(name = "LEIGO_OUTROS_OBSERVACAO", table = "APADIZIM")
    private byte[] leigoOutrosObservacao;

    @Basic
    @Column(name = "IS_CATEQUISTA", table = "APADIZIM")
    private String isCatequista;

    @Basic
    @Column(name = "IS_FUNERARIA", table = "APADIZIM")
    private String isFuneraria;

    @Basic
    @Column(name = "IS_CONTRIBUINTE", table = "APADIZIM")
    private String isContribuIntegere;

    public Integer getIdApadizim() {
        return idApadizim;
    }

    public void setIdApadizim(Integer idApadizim) {
        this.idApadizim = idApadizim;
    }

    public Integer getIdApaparoq() {
        return idApaparoq;
    }

    public void setIdApaparoq(Integer idApaparoq) {
        this.idApaparoq = idApaparoq;
    }

    public Integer getIdApacomun() {
        return idApacomun;
    }

    public void setIdApacomun(Integer idApacomun) {
        this.idApacomun = idApacomun;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
    }

    public Integer getIdCfacidad() {
        return idCfacidad;
    }

    public void setIdCfacidad(Integer idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public Integer getIdCfalogra() {
        return idCfalogra;
    }

    public void setIdCfalogra(Integer idCfalogra) {
        this.idCfalogra = idCfalogra;
    }

    public Integer getIdCfabairo() {
        return idCfabairo;
    }

    public void setIdCfabairo(Integer idCfabairo) {
        this.idCfabairo = idCfabairo;
    }

    public Integer getIdApapastoParticipa() {
        return idApapastoParticipa;
    }

    public void setIdApapastoParticipa(Integer idApapastoParticipa) {
        this.idApapastoParticipa = idApapastoParticipa;
    }

    public Integer getIdApapastoGostaria() {
        return idApapastoGostaria;
    }

    public void setIdApapastoGostaria(Integer idApapastoGostaria) {
        this.idApapastoGostaria = idApapastoGostaria;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public byte[] getComplemento() {
        return complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getTempoContribuicao() {
        return tempoContribuicao;
    }

    public void setTempoContribuicao(String tempoContribuicao) {
        this.tempoContribuicao = tempoContribuicao;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    public Date getDtNascConjuge() {
        return dtNascConjuge;
    }

    public void setDtNascConjuge(Date dtNascConjuge) {
        this.dtNascConjuge = dtNascConjuge;
    }

    public Date getDtCasamento() {
        return dtCasamento;
    }

    public void setDtCasamento(Date dtCasamento) {
        this.dtCasamento = dtCasamento;
    }

    public String getParticipaPastoral() {
        return participaPastoral;
    }

    public void setParticipaPastoral(String participaPastoral) {
        this.participaPastoral = participaPastoral;
    }

    public String getGostariaPastoral() {
        return gostariaPastoral;
    }

    public void setGostariaPastoral(String gostariaPastoral) {
        this.gostariaPastoral = gostariaPastoral;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getNumeroFicha() {
        return numeroFicha;
    }

    public void setNumeroFicha(Integer numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public String getDizimoFuneraria() {
        return dizimoFuneraria;
    }

    public void setDizimoFuneraria(String dizimoFuneraria) {
        this.dizimoFuneraria = dizimoFuneraria;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNomeConhecido() {
        return nomeConhecido;
    }

    public void setNomeConhecido(String nomeConhecido) {
        this.nomeConhecido = nomeConhecido;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getFatorRh() {
        return fatorRh;
    }

    public void setFatorRh(String fatorRh) {
        this.fatorRh = fatorRh;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgOrgao() {
        return rgOrgao;
    }

    public void setRgOrgao(String rgOrgao) {
        this.rgOrgao = rgOrgao;
    }

    public Date getRgDtExpedicao() {
        return rgDtExpedicao;
    }

    public void setRgDtExpedicao(Date rgDtExpedicao) {
        this.rgDtExpedicao = rgDtExpedicao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Integer getCaixaPostal() {
        return caixaPostal;
    }

    public void setCaixaPostal(Integer caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    public String getCepCaixaPostal() {
        return cepCaixaPostal;
    }

    public void setCepCaixaPostal(String cepCaixaPostal) {
        this.cepCaixaPostal = cepCaixaPostal;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getParoquiaAnterior() {
        return paroquiaAnterior;
    }

    public void setParoquiaAnterior(String paroquiaAnterior) {
        this.paroquiaAnterior = paroquiaAnterior;
    }

    public String getPadreParocoVigario() {
        return padreParocoVigario;
    }

    public void setPadreParocoVigario(String padreParocoVigario) {
        this.padreParocoVigario = padreParocoVigario;
    }

    public String getPadreTemProcuracao() {
        return padreTemProcuracao;
    }

    public void setPadreTemProcuracao(String padreTemProcuracao) {
        this.padreTemProcuracao = padreTemProcuracao;
    }

    public Date getPadreDtExpedicao() {
        return padreDtExpedicao;
    }

    public void setPadreDtExpedicao(Date padreDtExpedicao) {
        this.padreDtExpedicao = padreDtExpedicao;
    }

    public Date getPadreDtValidade() {
        return padreDtValidade;
    }

    public void setPadreDtValidade(Date padreDtValidade) {
        this.padreDtValidade = padreDtValidade;
    }

    public Integer getPadreLivroProcuracao() {
        return padreLivroProcuracao;
    }

    public void setPadreLivroProcuracao(Integer padreLivroProcuracao) {
        this.padreLivroProcuracao = padreLivroProcuracao;
    }

    public Integer getPadreFolhaProcuracao() {
        return padreFolhaProcuracao;
    }

    public void setPadreFolhaProcuracao(Integer padreFolhaProcuracao) {
        this.padreFolhaProcuracao = padreFolhaProcuracao;
    }

    public Date getPadreDtChegadaDiocese() {
        return padreDtChegadaDiocese;
    }

    public void setPadreDtChegadaDiocese(Date padreDtChegadaDiocese) {
        this.padreDtChegadaDiocese = padreDtChegadaDiocese;
    }

    public Date getPadreDtOrdenacao() {
        return padreDtOrdenacao;
    }

    public void setPadreDtOrdenacao(Date padreDtOrdenacao) {
        this.padreDtOrdenacao = padreDtOrdenacao;
    }

    public Date getPadreDtPresbiteral() {
        return padreDtPresbiteral;
    }

    public void setPadreDtPresbiteral(Date padreDtPresbiteral) {
        this.padreDtPresbiteral = padreDtPresbiteral;
    }

    public Date getPadreDtEpiscopal() {
        return padreDtEpiscopal;
    }

    public void setPadreDtEpiscopal(Date padreDtEpiscopal) {
        this.padreDtEpiscopal = padreDtEpiscopal;
    }

    public String getPadreDioceseOrdenacao() {
        return padreDioceseOrdenacao;
    }

    public void setPadreDioceseOrdenacao(String padreDioceseOrdenacao) {
        this.padreDioceseOrdenacao = padreDioceseOrdenacao;
    }

    public String getPadreDioceseIncardinacao() {
        return padreDioceseIncardinacao;
    }

    public void setPadreDioceseIncardinacao(String padreDioceseIncardinacao) {
        this.padreDioceseIncardinacao = padreDioceseIncardinacao;
    }

    public String getPadreDioceseResidencia() {
        return padreDioceseResidencia;
    }

    public void setPadreDioceseResidencia(String padreDioceseResidencia) {
        this.padreDioceseResidencia = padreDioceseResidencia;
    }

    public String getPadreVinculacaoDr() {
        return padreVinculacaoDr;
    }

    public void setPadreVinculacaoDr(String padreVinculacaoDr) {
        this.padreVinculacaoDr = padreVinculacaoDr;
    }

    public byte[] getPadreEstudosFeitos() {
        return padreEstudosFeitos;
    }

    public void setPadreEstudosFeitos(byte[] padreEstudosFeitos) {
        this.padreEstudosFeitos = padreEstudosFeitos;
    }

    public String getCatJaFoi() {
        return catJaFoi;
    }

    public void setCatJaFoi(String catJaFoi) {
        this.catJaFoi = catJaFoi;
    }

    public String getCatJaFoiOnde() {
        return catJaFoiOnde;
    }

    public void setCatJaFoiOnde(String catJaFoiOnde) {
        this.catJaFoiOnde = catJaFoiOnde;
    }

    public Date getCatJaFoiDtInicio() {
        return catJaFoiDtInicio;
    }

    public void setCatJaFoiDtInicio(Date catJaFoiDtInicio) {
        this.catJaFoiDtInicio = catJaFoiDtInicio;
    }

    public String getCatJaFoiDtFinal() {
        return catJaFoiDtFinal;
    }

    public void setCatJaFoiDtFinal(String catJaFoiDtFinal) {
        this.catJaFoiDtFinal = catJaFoiDtFinal;
    }

    public Date getCatAtualDtInicio() {
        return catAtualDtInicio;
    }

    public void setCatAtualDtInicio(Date catAtualDtInicio) {
        this.catAtualDtInicio = catAtualDtInicio;
    }

    public Date getCatAtualDtFinal() {
        return catAtualDtFinal;
    }

    public void setCatAtualDtFinal(Date catAtualDtFinal) {
        this.catAtualDtFinal = catAtualDtFinal;
    }

    public Integer getCatAtualNMatriculas() {
        return catAtualNMatriculas;
    }

    public void setCatAtualNMatriculas(Integer catAtualNMatriculas) {
        this.catAtualNMatriculas = catAtualNMatriculas;
    }

    public Integer getCatAtualNFormandos() {
        return catAtualNFormandos;
    }

    public void setCatAtualNFormandos(Integer catAtualNFormandos) {
        this.catAtualNFormandos = catAtualNFormandos;
    }

    public String getCatAtualUsaAgenda() {
        return catAtualUsaAgenda;
    }

    public void setCatAtualUsaAgenda(String catAtualUsaAgenda) {
        this.catAtualUsaAgenda = catAtualUsaAgenda;
    }

    public String getIsDizimista() {
        return isDizimista;
    }

    public void setIsDizimista(String isDizimista) {
        this.isDizimista = isDizimista;
    }

    public String getIsPadre() {
        return isPadre;
    }

    public void setIsPadre(String isPadre) {
        this.isPadre = isPadre;
    }

    public String getIsReligioso() {
        return isReligioso;
    }

    public void setIsReligioso(String isReligioso) {
        this.isReligioso = isReligioso;
    }

    public String getIsMinistro() {
        return isMinistro;
    }

    public void setIsMinistro(String isMinistro) {
        this.isMinistro = isMinistro;
    }

    public String getIsLeigo() {
        return isLeigo;
    }

    public void setIsLeigo(String isLeigo) {
        this.isLeigo = isLeigo;
    }

    public String getIsOutros() {
        return isOutros;
    }

    public void setIsOutros(String isOutros) {
        this.isOutros = isOutros;
    }

    public byte[] getLeigoOutrosObservacao() {
        return leigoOutrosObservacao;
    }

    public void setLeigoOutrosObservacao(byte[] leigoOutrosObservacao) {
        this.leigoOutrosObservacao = leigoOutrosObservacao;
    }

    public String getIsCatequista() {
        return isCatequista;
    }

    public void setIsCatequista(String isCatequista) {
        this.isCatequista = isCatequista;
    }

    public String getIsFuneraria() {
        return isFuneraria;
    }

    public void setIsFuneraria(String isFuneraria) {
        this.isFuneraria = isFuneraria;
    }

    public String getIsContribuIntegere() {
        return isContribuIntegere;
    }

    public void setIsContribuIntegere(String isContribuIntegere) {
        this.isContribuIntegere = isContribuIntegere;
    }

}