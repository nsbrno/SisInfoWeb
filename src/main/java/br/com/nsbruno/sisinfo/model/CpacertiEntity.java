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
@Table(name = "CPACERTI")
public class CpacertiEntity {

    @Id
    @Column(name = "ID_CPACERTI", table = "CPACERTI", nullable = false)
    private Integer idCpacerti;

    @Basic
    @Column(name = "ID_CPAPESOA", table = "CPACERTI")
    private Integer idCpapesoa;

    @Basic
    @Column(name = "ID_CFAESTAD", table = "CPACERTI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idCfaestad;

    @Basic
    @Column(name = "US_CAD", table = "CPACERTI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CPACERTI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CPACERTI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CPACERTI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CPACERTI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "CPACERTI")
    private Integer codigo;

    @Basic
    @Column(name = "TIPO", table = "CPACERTI")
    private String tipo;

    @Basic
    @Column(name = "DT_CERTIDAO", table = "CPACERTI")
    @Temporal(TemporalType.DATE)
    private Date dtCertidao;

    @Basic
    @Column(name = "CPF_CGC", table = "CPACERTI", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "TIPO_DOC", table = "CPACERTI")
    private String tipoDoc;

    @Basic
    @Column(name = "DOCUMENTO", table = "CPACERTI", length = 18)
    private String documento;

    @Basic
    @Column(name = "NOME", table = "CPACERTI", length = 60)
    private String nome;

    @Basic
    @Column(name = "NACIONAL", table = "CPACERTI", length = 40)
    private String nacional;

    @Basic
    @Column(name = "ESTADO_CIVIL", table = "CPACERTI")
    private String estadoCivil;

    @Basic
    @Column(name = "PROFISSAO", table = "CPACERTI", length = 40)
    private String profissao;

    @Basic
    @Column(name = "ENDERECO", table = "CPACERTI", length = 128)
    private String endereco;

    @Basic
    @Column(name = "NUMERO", table = "CPACERTI", length = 6)
    private String numero;

    @Basic
    @Column(name = "BAIRRO", table = "CPACERTI", length = 40)
    private String bairro;

    @Basic
    @Column(name = "CIDADE", table = "CPACERTI", length = 40)
    private String cidade;

    @Basic
    @Column(name = "CEP", table = "CPACERTI", length = 9)
    private String cep;

    @Basic(optional = false)
    @Column(name = "VL_EMOL", table = "CPACERTI", nullable = false)
    private double vlEmol;

    @Basic(optional = false)
    @Column(name = "VL_TRIB", table = "CPACERTI", nullable = false)
    private double vlTrib;

    @Basic(optional = false)
    @Column(name = "VL_FUJU", table = "CPACERTI", nullable = false)
    private double vlFuju;

    @Basic(optional = false)
    @Column(name = "VL_SELO", table = "CPACERTI", nullable = false)
    private double vlSelo;

    @Basic
    @Column(name = "FC_CUSTAS", table = "CPACERTI", precision = 15)
    private Double fcCustas;

    public Integer getIdCpacerti() {
        return idCpacerti;
    }

    public void setIdCpacerti(Integer idCpacerti) {
        this.idCpacerti = idCpacerti;
    }

    public Integer getIdCpapesoa() {
        return idCpapesoa;
    }

    public void setIdCpapesoa(Integer idCpapesoa) {
        this.idCpapesoa = idCpapesoa;
    }

    public Date getIdCfaestad() {
        return idCfaestad;
    }

    public void setIdCfaestad(Date idCfaestad) {
        this.idCfaestad = idCfaestad;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDtCertidao() {
        return dtCertidao;
    }

    public void setDtCertidao(Date dtCertidao) {
        this.dtCertidao = dtCertidao;
    }

    public String getCpfCgc() {
        return cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public Double getFcCustas() {
        return fcCustas;
    }

    public void setFcCustas(Double fcCustas) {
        this.fcCustas = fcCustas;
    }

}