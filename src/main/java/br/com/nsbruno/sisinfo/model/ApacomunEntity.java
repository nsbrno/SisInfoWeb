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
@Table(name = "APACOMUN")
public class ApacomunEntity {

    @Id
    @Column(name = "ID_APACOMUN", table = "APACOMUN", nullable = false)
    private Integer idApacomun;

    @Basic
    @Column(name = "ID_APAPAROQ", table = "APACOMUN")
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "APACOMUN")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "APACOMUN")
    private Integer idCfacidad;

    @Basic
    @Column(name = "US_CAD", table = "APACOMUN", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APACOMUN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APACOMUN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APACOMUN")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APACOMUN", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "APACOMUN")
    private Integer codigo;

    @Basic
    @Column(name = "CNPJ", table = "APACOMUN", length = 18)
    private String cnpj;

    @Basic
    @Column(name = "NOME", table = "APACOMUN", length = 60)
    private String nome;

    @Basic
    @Column(name = "ENDERECO", table = "APACOMUN", length = 40)
    private String endereco;

    @Basic
    @Column(name = "BAIRRO", table = "APACOMUN", length = 40)
    private String bairro;

    @Basic
    @Column(name = "CEP", table = "APACOMUN", length = 9)
    private String cep;

    @Basic
    @Column(name = "DDD_FONE", table = "APACOMUN")
    private Integer dddFone;

    @Basic
    @Column(name = "TELEFONE", table = "APACOMUN", length = 15)
    private String telefone;

    @Basic
    @Column(name = "DDD_FAX", table = "APACOMUN")
    private Integer dddFax;

    @Basic
    @Column(name = "FAX", table = "APACOMUN", length = 15)
    private String fax;

    @Basic
    @Column(name = "EMAIL", table = "APACOMUN", length = 128)
    private String email;

    @Basic
    @Column(name = "GRUPO_REFLEXAO", table = "APACOMUN")
    private String grupoReflexao;

    @Lob
    @Basic
    @Column(name = "OBS", table = "APACOMUN")
    private byte[] obs;

    @Basic
    @Column(name = "ZONA", table = "APACOMUN")
    private String zona;

    @Basic
    @Column(name = "QUANT_GRUPO_REFLEXAO", table = "APACOMUN")
    private Integer quantGrupoReflexao;

    @Basic
    @Column(name = "ATIVO", table = "APACOMUN")
    private String ativo;

    public Integer getIdApacomun() {
        return idApacomun;
    }

    public void setIdApacomun(Integer idApacomun) {
        this.idApacomun = idApacomun;
    }

    public Integer getIdApaparoq() {
        return idApaparoq;
    }

    public void setIdApaparoq(Integer idApaparoq) {
        this.idApaparoq = idApaparoq;
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

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getDddFone() {
        return dddFone;
    }

    public void setDddFone(Integer dddFone) {
        this.dddFone = dddFone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getDddFax() {
        return dddFax;
    }

    public void setDddFax(Integer dddFax) {
        this.dddFax = dddFax;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrupoReflexao() {
        return grupoReflexao;
    }

    public void setGrupoReflexao(String grupoReflexao) {
        this.grupoReflexao = grupoReflexao;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Integer getQuantGrupoReflexao() {
        return quantGrupoReflexao;
    }

    public void setQuantGrupoReflexao(Integer quantGrupoReflexao) {
        this.quantGrupoReflexao = quantGrupoReflexao;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

}