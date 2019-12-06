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
@Table(name = "CCACANDI")
public class CcacandiEntity {

    @Id
    @Column(name = "ID_CCACANDI", table = "CCACANDI", nullable = false)
    private Integer idCcacandi;

    @Basic
    @Column(name = "ID_CCACONCU", table = "CCACANDI")
    private Integer idCcaconcu;

    @Basic
    @Column(name = "ID_CCACARGO", table = "CCACANDI")
    private Integer idCcacargo;

    @Basic
    @Column(name = "ID_CCASALAP", table = "CCACANDI")
    private Integer idCcasalap;

    @Basic
    @Column(name = "ID_CCAESCOL", table = "CCACANDI")
    private Integer idCcaescol;

    @Basic
    @Column(name = "US_CAD", table = "CCACANDI", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "CCACANDI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "CCACANDI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "CCACANDI")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "CCACANDI", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "CCACANDI")
    private Integer codigo;

    @Basic
    @Column(name = "NOME", table = "CCACANDI", length = 60)
    private String nome;

    @Basic
    @Column(name = "RG", table = "CCACANDI", length = 18)
    private String rg;

    @Basic
    @Column(name = "ORGAO_RG", table = "CCACANDI", length = 40)
    private String orgaoRg;

    @Basic
    @Column(name = "SEXO", table = "CCACANDI")
    private String sexo;

    @Basic
    @Column(name = "DATANASCIMENTO", table = "CCACANDI")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;

    @Basic
    @Column(name = "ESTADOCIVIL", table = "CCACANDI")
    private String estadocivil;

    @Basic
    @Column(name = "NFILHOS", table = "CCACANDI")
    private Integer nfilhos;

    @Basic
    @Column(name = "NECESPECIAL", table = "CCACANDI")
    private String necespecial;

    @Basic
    @Column(name = "CEP", table = "CCACANDI", length = 9)
    private String cep;

    @Basic
    @Column(name = "LOGRADOURO", table = "CCACANDI", length = 128)
    private String logradouro;

    @Basic
    @Column(name = "NUMERO", table = "CCACANDI")
    private Integer numero;

    @Basic
    @Column(name = "BAIRRO", table = "CCACANDI", length = 128)
    private String bairro;

    @Basic
    @Column(name = "CIDADE", table = "CCACANDI", length = 128)
    private String cidade;

    @Basic
    @Column(name = "UF", table = "CCACANDI", length = 40)
    private String uf;

    @Basic
    @Column(name = "DDD", table = "CCACANDI")
    private Integer ddd;

    @Basic
    @Column(name = "TELEFONE", table = "CCACANDI", length = 15)
    private String telefone;

    @Basic
    @Column(name = "EMAIL", table = "CCACANDI", length = 128)
    private String email;

    @Basic(optional = false)
    @Column(name = "PROVAESCRITA", table = "CCACANDI", nullable = false)
    private double provaescrita;

    @Basic(optional = false)
    @Column(name = "PROVAPRATICA", table = "CCACANDI", nullable = false)
    private double provapratica;

    @Basic(optional = false)
    @Column(name = "PROVATITULOS", table = "CCACANDI", nullable = false)
    private double provatitulos;

    @Basic
    @Column(name = "PROVARESISTENCIA", table = "CCACANDI")
    private String provaresistencia;

    @Basic
    @Column(name = "NOSSO_NUMERO", table = "CCACANDI")
    private Integer nossoNumero;

    @Basic
    @Column(name = "DATAHORA", table = "CCACANDI", length = 40)
    private String datahora;

    @Basic
    @Column(name = "SITE", table = "CCACANDI")
    private String site;

    @Basic
    @Column(name = "PAGO", table = "CCACANDI")
    private String pago;

    @Basic(optional = false)
    @Column(name = "VL_INSCRICAO", table = "CCACANDI", nullable = false)
    private double vlInscricao;

    @Basic
    @Column(name = "DATA_PGTO", table = "CCACANDI")
    @Temporal(TemporalType.DATE)
    private Date dataPgto;

    public Integer getIdCcacandi() {
        return idCcacandi;
    }

    public void setIdCcacandi(Integer idCcacandi) {
        this.idCcacandi = idCcacandi;
    }

    public Integer getIdCcaconcu() {
        return idCcaconcu;
    }

    public void setIdCcaconcu(Integer idCcaconcu) {
        this.idCcaconcu = idCcaconcu;
    }

    public Integer getIdCcacargo() {
        return idCcacargo;
    }

    public void setIdCcacargo(Integer idCcacargo) {
        this.idCcacargo = idCcacargo;
    }

    public Integer getIdCcasalap() {
        return idCcasalap;
    }

    public void setIdCcasalap(Integer idCcasalap) {
        this.idCcasalap = idCcasalap;
    }

    public Integer getIdCcaescol() {
        return idCcaescol;
    }

    public void setIdCcaescol(Integer idCcaescol) {
        this.idCcaescol = idCcaescol;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoRg() {
        return orgaoRg;
    }

    public void setOrgaoRg(String orgaoRg) {
        this.orgaoRg = orgaoRg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public Integer getNfilhos() {
        return nfilhos;
    }

    public void setNfilhos(Integer nfilhos) {
        this.nfilhos = nfilhos;
    }

    public String getNecespecial() {
        return necespecial;
    }

    public void setNecespecial(String necespecial) {
        this.necespecial = necespecial;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
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

    public double getProvaescrita() {
        return provaescrita;
    }

    public void setProvaescrita(double provaescrita) {
        this.provaescrita = provaescrita;
    }

    public double getProvapratica() {
        return provapratica;
    }

    public void setProvapratica(double provapratica) {
        this.provapratica = provapratica;
    }

    public double getProvatitulos() {
        return provatitulos;
    }

    public void setProvatitulos(double provatitulos) {
        this.provatitulos = provatitulos;
    }

    public String getProvaresistencia() {
        return provaresistencia;
    }

    public void setProvaresistencia(String provaresistencia) {
        this.provaresistencia = provaresistencia;
    }

    public Integer getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(Integer nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public String getDatahora() {
        return datahora;
    }

    public void setDatahora(String datahora) {
        this.datahora = datahora;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public double getVlInscricao() {
        return vlInscricao;
    }

    public void setVlInscricao(double vlInscricao) {
        this.vlInscricao = vlInscricao;
    }

    public Date getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Date dataPgto) {
        this.dataPgto = dataPgto;
    }

}