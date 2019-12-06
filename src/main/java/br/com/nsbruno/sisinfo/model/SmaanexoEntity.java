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
@Table(name = "SMAANEXO")
public class SmaanexoEntity {

    @Id
    @Column(name = "ID_SMAANEXO", table = "SMAANEXO", nullable = false)
    private Integer idSmaanexo;

    @Basic(optional = false)
    @Column(name = "ID_SMAMENSA", table = "SMAANEXO", nullable = false)
    private int idSmamensa;

    @Basic(optional = false)
    @Column(name = "GUID", table = "SMAANEXO", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "SMAANEXO", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "SMAANEXO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAANEXO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "SMAANEXO")
    private Integer ctInteg;

    @Lob
    @Basic
    @Column(name = "ANEXO", table = "SMAANEXO")
    private byte[] anexo;

    @Basic
    @Column(name = "NOME", table = "SMAANEXO", length = 128)
    private String nome;

    public Integer getIdSmaanexo() {
        return idSmaanexo;
    }

    public void setIdSmaanexo(Integer idSmaanexo) {
        this.idSmaanexo = idSmaanexo;
    }

    public int getIdSmamensa() {
        return idSmamensa;
    }

    public void setIdSmamensa(int idSmamensa) {
        this.idSmamensa = idSmamensa;
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

    public byte[] getAnexo() {
        return anexo;
    }

    public void setAnexo(byte[] anexo) {
        this.anexo = anexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}