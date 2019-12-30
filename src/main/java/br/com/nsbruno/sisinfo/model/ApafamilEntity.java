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
@Table(name = "APAFAMIL")
public class ApafamilEntity {

    @Id
    @Column(name = "ID_APAFAMIL", table = "APAFAMIL", nullable = false)
    private Integer idApafamil;

    @Basic
    @Column(name = "ID_CFACLIFO_PAROQ", table = "APAFAMIL")
    private Integer idCfaclifoParoq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "APAFAMIL")
    private Integer idCfaclifoComun;

    @Basic
    @Column(name = "US_CAD", table = "APAFAMIL", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APAFAMIL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APAFAMIL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APAFAMIL")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APAFAMIL", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "COMUNIDADE", table = "APAFAMIL")
    private String comunidade;

    @Basic
    @Column(name = "FAMILIA", table = "APAFAMIL", length = 60)
    private String familia;

    @Basic
    @Column(name = "TEMPO_COMUN", table = "APAFAMIL", length = 256)
    private String tempoComun;

    @Basic(optional = false)
    @Column(name = "QTDE_MEMBROS", table = "APAFAMIL", nullable = false)
    private Integer qtdeMembros;

    @Basic
    @Column(name = "ENDERECO", table = "APAFAMIL", length = 128)
    private String endereco;

    @Basic
    @Column(name = "FONE", table = "APAFAMIL", length = 15)
    private String fone;

    @Basic
    @Column(name = "CELULAR", table = "APAFAMIL", length = 15)
    private String celular;

    @Basic
    @Column(name = "NOME", table = "APAFAMIL", length = 60)
    private String nome;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "APAFAMIL")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Basic
    @Column(name = "CONJUGE", table = "APAFAMIL")
    private String conjuge;

    @Basic
    @Column(name = "CASADO_CIVIL", table = "APAFAMIL")
    private String casadoCivil;

    @Basic
    @Column(name = "SEGUNDA_UNIAO", table = "APAFAMIL")
    private String segundaUniao;

    @Basic
    @Column(name = "TEMPO_UNIAO", table = "APAFAMIL", length = 256)
    private String tempoUniao;

    @Basic
    @Column(name = "CASADO_NA_CATOLICA", table = "APAFAMIL")
    private String casadoNaCatolica;

    @Basic
    @Column(name = "DT_CASAMENTO", table = "APAFAMIL")
    @Temporal(TemporalType.DATE)
    private Date dtCasamento;

    @Basic
    @Column(name = "SACRAMENTOS", table = "APAFAMIL", length = 6)
    private String sacramentos;

    @Basic
    @Column(name = "NOME_CONJ", table = "APAFAMIL", length = 60)
    private String nomeConj;

    @Basic
    @Column(name = "DT_NASC_CONJ", table = "APAFAMIL")
    @Temporal(TemporalType.DATE)
    private Date dtNascConj;

    @Basic
    @Column(name = "SACRAMENTOS_CONJ", table = "APAFAMIL", length = 6)
    private String sacramentosConj;

    @Basic
    @Column(name = "NOME_DEP1", table = "APAFAMIL", length = 60)
    private String nomeDep1;

    @Basic
    @Column(name = "DT_NASC_DEP1", table = "APAFAMIL")
    @Temporal(TemporalType.DATE)
    private Date dtNascDep1;

    @Basic
    @Column(name = "SACRAMENTOS_DEP1", table = "APAFAMIL", length = 6)
    private String sacramentosDep1;

    @Basic
    @Column(name = "NOME_DEP2", table = "APAFAMIL", length = 60)
    private String nomeDep2;

    @Basic
    @Column(name = "DT_NASC_DEP2", table = "APAFAMIL")
    @Temporal(TemporalType.DATE)
    private Date dtNascDep2;

    @Basic
    @Column(name = "SACRAMENTOS_DEP2", table = "APAFAMIL", length = 6)
    private String sacramentosDep2;

    @Basic
    @Column(name = "NOME_DEP3", table = "APAFAMIL", length = 60)
    private String nomeDep3;

    @Basic
    @Column(name = "DT_NASC_DEP3", table = "APAFAMIL")
    @Temporal(TemporalType.DATE)
    private Date dtNascDep3;

    @Basic
    @Column(name = "SACRAMENTOS_DEP3", table = "APAFAMIL", length = 6)
    private String sacramentosDep3;

    @Basic
    @Column(name = "NOME_DEP4", table = "APAFAMIL", length = 60)
    private String nomeDep4;

    @Basic
    @Column(name = "DT_NASC_DEP4", table = "APAFAMIL")
    @Temporal(TemporalType.DATE)
    private Date dtNascDep4;

    @Basic
    @Column(name = "SACRAMENTOS_DEP4", table = "APAFAMIL", length = 6)
    private String sacramentosDep4;

    @Basic
    @Column(name = "NOME_DEP5", table = "APAFAMIL", length = 60)
    private String nomeDep5;

    @Basic
    @Column(name = "DT_NASC_DEP5", table = "APAFAMIL")
    @Temporal(TemporalType.DATE)
    private Date dtNascDep5;

    @Basic
    @Column(name = "SACRAMENTOS_DEP5", table = "APAFAMIL", length = 6)
    private String sacramentosDep5;

    @Basic
    @Column(name = "OBS", table = "APAFAMIL", length = 512)
    private String obs;

    @Basic
    @Column(name = "OBS_FAMILIA", table = "APAFAMIL", length = 512)
    private String obsFamilia;

    @Basic
    @Column(name = "DT_VISITA", table = "APAFAMIL")
    @Temporal(TemporalType.DATE)
    private Date dtVisita;

    public Integer getIdApafamil() {
        return idApafamil;
    }

    public void setIdApafamil(Integer idApafamil) {
        this.idApafamil = idApafamil;
    }

    public Integer getIdCfaclifoParoq() {
        return idCfaclifoParoq;
    }

    public void setIdCfaclifoParoq(Integer idCfaclifoParoq) {
        this.idCfaclifoParoq = idCfaclifoParoq;
    }

    public Integer getIdCfaclifoComun() {
        return idCfaclifoComun;
    }

    public void setIdCfaclifoComun(Integer idCfaclifoComun) {
        this.idCfaclifoComun = idCfaclifoComun;
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

    public String getComunidade() {
        return comunidade;
    }

    public void setComunidade(String comunidade) {
        this.comunidade = comunidade;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getTempoComun() {
        return tempoComun;
    }

    public void setTempoComun(String tempoComun) {
        this.tempoComun = tempoComun;
    }

    public Integer getQtdeMembros() {
        return qtdeMembros;
    }

    public void setQtdeMembros(Integer qtdeMembros) {
        this.qtdeMembros = qtdeMembros;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    public String getCasadoCivil() {
        return casadoCivil;
    }

    public void setCasadoCivil(String casadoCivil) {
        this.casadoCivil = casadoCivil;
    }

    public String getSegundaUniao() {
        return segundaUniao;
    }

    public void setSegundaUniao(String segundaUniao) {
        this.segundaUniao = segundaUniao;
    }

    public String getTempoUniao() {
        return tempoUniao;
    }

    public void setTempoUniao(String tempoUniao) {
        this.tempoUniao = tempoUniao;
    }

    public String getCasadoNaCatolica() {
        return casadoNaCatolica;
    }

    public void setCasadoNaCatolica(String casadoNaCatolica) {
        this.casadoNaCatolica = casadoNaCatolica;
    }

    public Date getDtCasamento() {
        return dtCasamento;
    }

    public void setDtCasamento(Date dtCasamento) {
        this.dtCasamento = dtCasamento;
    }

    public String getSacramentos() {
        return sacramentos;
    }

    public void setSacramentos(String sacramentos) {
        this.sacramentos = sacramentos;
    }

    public String getNomeConj() {
        return nomeConj;
    }

    public void setNomeConj(String nomeConj) {
        this.nomeConj = nomeConj;
    }

    public Date getDtNascConj() {
        return dtNascConj;
    }

    public void setDtNascConj(Date dtNascConj) {
        this.dtNascConj = dtNascConj;
    }

    public String getSacramentosConj() {
        return sacramentosConj;
    }

    public void setSacramentosConj(String sacramentosConj) {
        this.sacramentosConj = sacramentosConj;
    }

    public String getNomeDep1() {
        return nomeDep1;
    }

    public void setNomeDep1(String nomeDep1) {
        this.nomeDep1 = nomeDep1;
    }

    public Date getDtNascDep1() {
        return dtNascDep1;
    }

    public void setDtNascDep1(Date dtNascDep1) {
        this.dtNascDep1 = dtNascDep1;
    }

    public String getSacramentosDep1() {
        return sacramentosDep1;
    }

    public void setSacramentosDep1(String sacramentosDep1) {
        this.sacramentosDep1 = sacramentosDep1;
    }

    public String getNomeDep2() {
        return nomeDep2;
    }

    public void setNomeDep2(String nomeDep2) {
        this.nomeDep2 = nomeDep2;
    }

    public Date getDtNascDep2() {
        return dtNascDep2;
    }

    public void setDtNascDep2(Date dtNascDep2) {
        this.dtNascDep2 = dtNascDep2;
    }

    public String getSacramentosDep2() {
        return sacramentosDep2;
    }

    public void setSacramentosDep2(String sacramentosDep2) {
        this.sacramentosDep2 = sacramentosDep2;
    }

    public String getNomeDep3() {
        return nomeDep3;
    }

    public void setNomeDep3(String nomeDep3) {
        this.nomeDep3 = nomeDep3;
    }

    public Date getDtNascDep3() {
        return dtNascDep3;
    }

    public void setDtNascDep3(Date dtNascDep3) {
        this.dtNascDep3 = dtNascDep3;
    }

    public String getSacramentosDep3() {
        return sacramentosDep3;
    }

    public void setSacramentosDep3(String sacramentosDep3) {
        this.sacramentosDep3 = sacramentosDep3;
    }

    public String getNomeDep4() {
        return nomeDep4;
    }

    public void setNomeDep4(String nomeDep4) {
        this.nomeDep4 = nomeDep4;
    }

    public Date getDtNascDep4() {
        return dtNascDep4;
    }

    public void setDtNascDep4(Date dtNascDep4) {
        this.dtNascDep4 = dtNascDep4;
    }

    public String getSacramentosDep4() {
        return sacramentosDep4;
    }

    public void setSacramentosDep4(String sacramentosDep4) {
        this.sacramentosDep4 = sacramentosDep4;
    }

    public String getNomeDep5() {
        return nomeDep5;
    }

    public void setNomeDep5(String nomeDep5) {
        this.nomeDep5 = nomeDep5;
    }

    public Date getDtNascDep5() {
        return dtNascDep5;
    }

    public void setDtNascDep5(Date dtNascDep5) {
        this.dtNascDep5 = dtNascDep5;
    }

    public String getSacramentosDep5() {
        return sacramentosDep5;
    }

    public void setSacramentosDep5(String sacramentosDep5) {
        this.sacramentosDep5 = sacramentosDep5;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getObsFamilia() {
        return obsFamilia;
    }

    public void setObsFamilia(String obsFamilia) {
        this.obsFamilia = obsFamilia;
    }

    public Date getDtVisita() {
        return dtVisita;
    }

    public void setDtVisita(Date dtVisita) {
        this.dtVisita = dtVisita;
    }

}