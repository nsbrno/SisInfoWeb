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
import lombok.Data;


@Entity
@Table(name = "RPATMP02")
@Data
public class Rpatmp02Entity {

    @Id
    @Column(name = "ID_RPATMP02", table = "RPATMP02", nullable = false)
    private Integer idRpatmp02;

    @Basic
    @Column(name = "ID_CFATPDOC", table = "RPATMP02")
    private Integer idCfatpdoc;

    @Basic
    @Column(name = "ID_CFATPCOB", table = "RPATMP02")
    private Integer idCfatpcob;

    @Basic
    @Column(name = "ID_CFAPORTA", table = "RPATMP02")
    private Integer idCfaporta;

    @Basic
    @Column(name = "ID_CFACCRED", table = "RPATMP02")
    private Integer idCfaccred;

    @Basic
    @Column(name = "ID_CFAESTAD_ORGAO", table = "RPATMP02")
    private Integer idCfaestadOrgao;

    @Basic
    @Column(name = "CHAVE_ID", table = "RPATMP02")
    private Integer chaveId;

    @Basic(optional = false)
    @Column(name = "DIAS", table = "RPATMP02", nullable = false)
    private Integer dias;

    @Basic(optional = false)
    @Column(name = "VALOR", table = "RPATMP02", nullable = false)
    private double valor;

    @Basic
    @Column(name = "DATA", table = "RPATMP02")
    @Temporal(TemporalType.DATE)
    private Date data;

    @Basic
    @Column(name = "ID_AUX1", table = "RPATMP02")
    private Integer idAux1;

    @Basic
    @Column(name = "AGENCIA", table = "RPATMP02")
    private Integer agencia;

    @Basic
    @Column(name = "DG_AG", table = "RPATMP02")
    private String dgAg;

    @Basic
    @Column(name = "CONTA", table = "RPATMP02")
    private Integer conta;

    @Basic
    @Column(name = "DG_CT", table = "RPATMP02", length = 2)
    private String dgCt;

    @Basic
    @Column(name = "SERIE", table = "RPATMP02", length = 6)
    private String serie;

    @Basic
    @Column(name = "NUMERO", table = "RPATMP02", length = 20)
    private String numero;

    @Basic
    @Column(name = "CONTROLE", table = "RPATMP02", length = 40)
    private String controle;

    @Basic
    @Column(name = "NOME", table = "RPATMP02", length = 60)
    private String nome;

    @Basic
    @Column(name = "CPF_CGC", table = "RPATMP02", length = 18)
    private String cpfCgc;

    @Basic
    @Column(name = "IE_RG", table = "RPATMP02", length = 18)
    private String ieRg;

    @Basic
    @Column(name = "ORGAO_EMISSOR", table = "RPATMP02", length = 3)
    private String orgaoEmissor;

    @Lob
    @Basic
    @Column(name = "OBS", table = "RPATMP02")
    private byte[] obs;
}