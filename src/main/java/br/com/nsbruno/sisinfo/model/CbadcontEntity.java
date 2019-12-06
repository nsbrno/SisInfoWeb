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
@Table(name = "CBADCONT")
public class CbadcontEntity {

    @Id
    @Column(name = "ID_CBADCONT", table = "CBADCONT", nullable = false)
    private Integer idCbadcont;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CBADCONT", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "CBADCONT", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_ALT", table = "CBADCONT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "DT_CAD", table = "CBADCONT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "CT_INTEG", table = "CBADCONT")
    private Integer ctInteg;

    @Basic
    @Column(name = "ID_CFACIDAD", table = "CBADCONT")
    private Integer idCfacidad;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CBADCONT")
    private Integer idCfaestad;

    @Basic
    @Column(name = "CODIGO", table = "CBADCONT")
    private Integer codigo;

    @Basic
    @Column(name = "NOME", table = "CBADCONT", length = 60)
    private String nome;

    @Basic
    @Column(name = "CPF", table = "CBADCONT", length = 18)
    private String cpf;

    @Basic
    @Column(name = "CRC", table = "CBADCONT", length = 18)
    private String crc;

    @Basic
    @Column(name = "CNPJ", table = "CBADCONT", length = 18)
    private String cnpj;

    @Basic
    @Column(name = "CEP", table = "CBADCONT", length = 9)
    private String cep;

    @Basic
    @Column(name = "ENDERECO", table = "CBADCONT", length = 128)
    private String endereco;

    @Basic
    @Column(name = "BAIRRO", table = "CBADCONT", length = 128)
    private String bairro;

    @Basic
    @Column(name = "FONE", table = "CBADCONT", length = 15)
    private String fone;

    @Basic
    @Column(name = "FAX", table = "CBADCONT", length = 15)
    private String fax;

    @Basic
    @Column(name = "DDD", table = "CBADCONT")
    private Integer ddd;

    @Basic
    @Column(name = "EMAIL", table = "CBADCONT", length = 128)
    private String email;

    @Lob
    @Basic
    @Column(name = "COMPLEMENTO", table = "CBADCONT")
    private byte[] complemento;

    @Basic
    @Column(name = "NUMERO", table = "CBADCONT")
    private Integer numero;

    public Integer getIdCbadcont() {
        return idCbadcont;
    }

    public void setIdCbadcont(Integer idCbadcont) {
        this.idCbadcont = idCbadcont;
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

    public Date getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Date getDtCad() {
        return dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public Integer getCtInteg() {
        return ctInteg;
    }

    public void setCtInteg(Integer ctInteg) {
        this.ctInteg = ctInteg;
    }

    public Integer getIdCfacidad() {
        return idCfacidad;
    }

    public void setIdCfacidad(Integer idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public Integer getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

}