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
@Table(name = "RPATMP01")
public class Rpatmp01Entity {

    @Id
    @Column(name = "ID_RPATMP01", table = "RPATMP01", nullable = false)
    private Integer idRpatmp01;

    @Basic(optional = false)
    @Column(name = "ID_CFATPDOC", table = "RPATMP01", nullable = false)
    private int idCfatpdoc;

    @Basic(optional = false)
    @Column(name = "CHAVE_ID", table = "RPATMP01", nullable = false)
    private int chaveId;

    @Basic
    @Column(name = "ID_AUX1", table = "RPATMP01")
    private Integer idAux1;

    @Basic(optional = false)
    @Column(name = "DIAS", table = "RPATMP01", nullable = false)
    private int dias;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "RPATMP01", nullable = false)
    private double valor;

    @Basic
    @Column(name = "DATA", table = "RPATMP01")
    @Temporal(TemporalType.DATE)
    private Date data;

    @Basic(optional = false)
    @Column(name = "VALOR1", table = "RPATMP01", nullable = false)
    private double valor1;

    @Basic
    @Column(name = "ID_AUX2", table = "RPATMP01")
    private Integer idAux2;

    @Basic
    @Column(name = "ID_AUX3", table = "RPATMP01")
    private Integer idAux3;

    @Basic
    @Column(name = "ID_AUX4", table = "RPATMP01")
    private Integer idAux4;

    public Integer getIdRpatmp01() {
        return idRpatmp01;
    }

    public void setIdRpatmp01(Integer idRpatmp01) {
        this.idRpatmp01 = idRpatmp01;
    }

    public int getIdCfatpdoc() {
        return idCfatpdoc;
    }

    public void setIdCfatpdoc(int idCfatpdoc) {
        this.idCfatpdoc = idCfatpdoc;
    }

    public int getChaveId() {
        return chaveId;
    }

    public void setChaveId(int chaveId) {
        this.chaveId = chaveId;
    }

    public Integer getIdAux1() {
        return idAux1;
    }

    public void setIdAux1(Integer idAux1) {
        this.idAux1 = idAux1;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public Integer getIdAux2() {
        return idAux2;
    }

    public void setIdAux2(Integer idAux2) {
        this.idAux2 = idAux2;
    }

    public Integer getIdAux3() {
        return idAux3;
    }

    public void setIdAux3(Integer idAux3) {
        this.idAux3 = idAux3;
    }

    public Integer getIdAux4() {
        return idAux4;
    }

    public void setIdAux4(Integer idAux4) {
        this.idAux4 = idAux4;
    }

}