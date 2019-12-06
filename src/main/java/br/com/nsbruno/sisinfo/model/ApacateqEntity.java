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
@Table(name = "APACATEQ")
public class ApacateqEntity {

    @Id
    @Column(name = "ID_APACATEQ", table = "APACATEQ", nullable = false)
    private Integer idApacateq;

    @Basic
    @Column(name = "ID_CFACLIFO_COMUN", table = "APACATEQ")
    private Integer idCfaclifoComun;

    @Basic
    @Column(name = "ID_CFACLIFO_CATEQ", table = "APACATEQ")
    private Integer idCfaclifoCateq;

    @Basic
    @Column(name = "ID_CFAESTAD_BATIS", table = "APACATEQ")
    private Integer idCfaestadBatis;

    @Basic
    @Column(name = "ID_CFAESTAD_NASC", table = "APACATEQ")
    private Integer idCfaestadNasc;

    @Basic
    @Column(name = "ID_CFACIDAD_BATIS", table = "APACATEQ")
    private Integer idCfacidadBatis;

    @Basic
    @Column(name = "ID_CFACIDAD_NASC", table = "APACATEQ")
    private Integer idCfacidadNasc;

    @Basic
    @Column(name = "ID_APATURMA", table = "APACATEQ")
    private Integer idApaturma;

    @Basic(optional = false)
    @Column(name = "US_CAD", table = "APACATEQ", nullable = false, length = 20)
    private String usCad;

    @Basic(optional = false)
    @Column(name = "DT_CAD", table = "APACATEQ", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic(optional = false)
    @Column(name = "DT_ALT", table = "APACATEQ", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "APACATEQ")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "GUID", table = "APACATEQ", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "CODIGO", table = "APACATEQ")
    private Integer codigo;

    @Basic
    @Column(name = "NOME", table = "APACATEQ", length = 60)
    private String nome;

    @Basic
    @Column(name = "DT_NASCIMENTO", table = "APACATEQ")
    @Temporal(TemporalType.DATE)
    private Date dtNascimento;

    @Basic
    @Column(name = "DT_CATEQUESE", table = "APACATEQ")
    @Temporal(TemporalType.DATE)
    private Date dtCatequese;

    @Basic
    @Column(name = "ENDERECO", table = "APACATEQ", length = 60)
    private String endereco;

    @Basic
    @Column(name = "TELEFONE", table = "APACATEQ", length = 15)
    private String telefone;

    @Basic
    @Column(name = "SEXO", table = "APACATEQ")
    private String sexo;

    @Basic
    @Column(name = "NOME_MAE", table = "APACATEQ", length = 60)
    private String nomeMae;

    @Basic
    @Column(name = "NOME_PAI", table = "APACATEQ", length = 60)
    private String nomePai;

    @Basic
    @Column(name = "DT_BATISMO", table = "APACATEQ")
    @Temporal(TemporalType.DATE)
    private Date dtBatismo;

    @Basic
    @Column(name = "DT_EUCARISTIA", table = "APACATEQ")
    @Temporal(TemporalType.DATE)
    private Date dtEucaristia;

    @Basic
    @Column(name = "PAROQ_EUCARISTIA", table = "APACATEQ", length = 60)
    private String paroqEucaristia;

    @Basic
    @Column(name = "COMUN_EUCARISTIA", table = "APACATEQ", length = 60)
    private String comunEucaristia;

    @Basic
    @Column(name = "EUCA_EDUCADOR", table = "APACATEQ", length = 60)
    private String eucaEducador;

    @Basic
    @Column(name = "DT_CRISMA", table = "APACATEQ")
    @Temporal(TemporalType.DATE)
    private Date dtCrisma;

    @Basic
    @Column(name = "PAROQ_CRISMA", table = "APACATEQ", length = 60)
    private String paroqCrisma;

    @Basic
    @Column(name = "COMUN_CRISMA", table = "APACATEQ", length = 60)
    private String comunCrisma;

    @Basic
    @Column(name = "CRIS_EDUCADOR", table = "APACATEQ", length = 60)
    private String crisEducador;

    @Lob
    @Basic
    @Column(name = "PART_COMUNIDADE", table = "APACATEQ")
    private byte[] partComunidade;

    @Basic
    @Column(name = "DT_TRANSFERENCIA", table = "APACATEQ")
    @Temporal(TemporalType.DATE)
    private Date dtTransferencia;

    @Basic
    @Column(name = "TRANSFERENCIA", table = "APACATEQ", length = 60)
    private String transferencia;

    @Lob
    @Basic
    @Column(name = "OBS", table = "APACATEQ")
    private byte[] obs;

    public Integer getIdApacateq() {
        return idApacateq;
    }

    public void setIdApacateq(Integer idApacateq) {
        this.idApacateq = idApacateq;
    }

    public Integer getIdCfaclifoComun() {
        return idCfaclifoComun;
    }

    public void setIdCfaclifoComun(Integer idCfaclifoComun) {
        this.idCfaclifoComun = idCfaclifoComun;
    }

    public Integer getIdCfaclifoCateq() {
        return idCfaclifoCateq;
    }

    public void setIdCfaclifoCateq(Integer idCfaclifoCateq) {
        this.idCfaclifoCateq = idCfaclifoCateq;
    }

    public Integer getIdCfaestadBatis() {
        return idCfaestadBatis;
    }

    public void setIdCfaestadBatis(Integer idCfaestadBatis) {
        this.idCfaestadBatis = idCfaestadBatis;
    }

    public Integer getIdCfaestadNasc() {
        return idCfaestadNasc;
    }

    public void setIdCfaestadNasc(Integer idCfaestadNasc) {
        this.idCfaestadNasc = idCfaestadNasc;
    }

    public Integer getIdCfacidadBatis() {
        return idCfacidadBatis;
    }

    public void setIdCfacidadBatis(Integer idCfacidadBatis) {
        this.idCfacidadBatis = idCfacidadBatis;
    }

    public Integer getIdCfacidadNasc() {
        return idCfacidadNasc;
    }

    public void setIdCfacidadNasc(Integer idCfacidadNasc) {
        this.idCfacidadNasc = idCfacidadNasc;
    }

    public Integer getIdApaturma() {
        return idApaturma;
    }

    public void setIdApaturma(Integer idApaturma) {
        this.idApaturma = idApaturma;
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

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Date getDtCatequese() {
        return dtCatequese;
    }

    public void setDtCatequese(Date dtCatequese) {
        this.dtCatequese = dtCatequese;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Date getDtBatismo() {
        return dtBatismo;
    }

    public void setDtBatismo(Date dtBatismo) {
        this.dtBatismo = dtBatismo;
    }

    public Date getDtEucaristia() {
        return dtEucaristia;
    }

    public void setDtEucaristia(Date dtEucaristia) {
        this.dtEucaristia = dtEucaristia;
    }

    public String getParoqEucaristia() {
        return paroqEucaristia;
    }

    public void setParoqEucaristia(String paroqEucaristia) {
        this.paroqEucaristia = paroqEucaristia;
    }

    public String getComunEucaristia() {
        return comunEucaristia;
    }

    public void setComunEucaristia(String comunEucaristia) {
        this.comunEucaristia = comunEucaristia;
    }

    public String getEucaEducador() {
        return eucaEducador;
    }

    public void setEucaEducador(String eucaEducador) {
        this.eucaEducador = eucaEducador;
    }

    public Date getDtCrisma() {
        return dtCrisma;
    }

    public void setDtCrisma(Date dtCrisma) {
        this.dtCrisma = dtCrisma;
    }

    public String getParoqCrisma() {
        return paroqCrisma;
    }

    public void setParoqCrisma(String paroqCrisma) {
        this.paroqCrisma = paroqCrisma;
    }

    public String getComunCrisma() {
        return comunCrisma;
    }

    public void setComunCrisma(String comunCrisma) {
        this.comunCrisma = comunCrisma;
    }

    public String getCrisEducador() {
        return crisEducador;
    }

    public void setCrisEducador(String crisEducador) {
        this.crisEducador = crisEducador;
    }

    public byte[] getPartComunidade() {
        return partComunidade;
    }

    public void setPartComunidade(byte[] partComunidade) {
        this.partComunidade = partComunidade;
    }

    public Date getDtTransferencia() {
        return dtTransferencia;
    }

    public void setDtTransferencia(Date dtTransferencia) {
        this.dtTransferencia = dtTransferencia;
    }

    public String getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(String transferencia) {
        this.transferencia = transferencia;
    }

    public byte[] getObs() {
        return obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}