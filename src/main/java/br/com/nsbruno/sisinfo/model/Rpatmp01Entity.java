package br.com.nsbruno.sisinfo.model;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


@Entity
@Table(name = "RPATMP01")
@Data
public class Rpatmp01Entity {

    @Id
    @Column(name = "ID_RPATMP01", table = "RPATMP01", nullable = false)
    private Integer idRpatmp01;

    @Basic(optional = false)
    @Column(name = "ID_CFATPDOC", table = "RPATMP01", nullable = false)
    private Integer idCfatpdoc;

    @Basic(optional = false)
    @Column(name = "CHAVE_ID", table = "RPATMP01", nullable = false)
    private Integer chaveId;

    @Basic
    @Column(name = "ID_AUX1", table = "RPATMP01")
    private Integer idAux1;

    @Basic(optional = false)
    @Column(name = "DIAS", table = "RPATMP01", nullable = false)
    private Integer dias;

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
}