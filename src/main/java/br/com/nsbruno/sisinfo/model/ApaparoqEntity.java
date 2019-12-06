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
@Table(name = "APAPAROQ")
public class ApaparoqEntity {

    @Id
    @Column(name = "ID_APAPAROQ", table = "APAPAROQ", nullable = false)
    private Integer idApaparoq;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "APAPAROQ")
    private Integer idCfaestad;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "APAPAROQ")
    private Integer idCfacidad;

    @Basic
    @Column(name = "US_CAD", table = "APAPAROQ", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "APAPAROQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "APAPAROQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APAPAROQ")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APAPAROQ", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "APAPAROQ")
    private Integer codigo;

    @Basic
    @Column(name = "NOME", table = "APAPAROQ", length = 60)
    private String nome;

    @Basic
    @Column(name = "CNPJ", table = "APAPAROQ", length = 18)
    private String cnpj;

    @Basic
    @Column(name = "LOCALIDADE", table = "APAPAROQ", length = 40)
    private String localidade;

    @Basic
    @Column(name = "ENDERECO", table = "APAPAROQ", length = 40)
    private String endereco;

    @Basic
    @Column(name = "BAIRRO", table = "APAPAROQ", length = 40)
    private String bairro;

    @Basic
    @Column(name = "CEP", table = "APAPAROQ", length = 9)
    private String cep;

    @Basic
    @Column(name = "DDD_FONE", table = "APAPAROQ")
    private Integer dddFone;

    @Basic
    @Column(name = "TELEFONE", table = "APAPAROQ", length = 15)
    private String telefone;

    @Basic
    @Column(name = "DDD_FAX", table = "APAPAROQ")
    private Integer dddFax;

    @Basic
    @Column(name = "FAX", table = "APAPAROQ", length = 15)
    private String fax;

    @Basic
    @Column(name = "EMAIL", table = "APAPAROQ", length = 128)
    private String email;

    @Lob
    @Basic
    @Column(name = "OBS", table = "APAPAROQ")
    private byte[] obs;

    @Lob
    @Basic
    @Column(name = "FOTO", table = "APAPAROQ")
    private byte[] foto;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
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

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

}