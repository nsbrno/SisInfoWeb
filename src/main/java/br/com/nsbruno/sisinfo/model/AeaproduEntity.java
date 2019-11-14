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
import javax.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "AEAPRODU", uniqueConstraints = @UniqueConstraint(columnNames = "CODIGO"))
public class AeaproduEntity {

    @Id
    @Column(name = "ID_AEAPRODU", table = "AEAPRODU", nullable = false)
    private Integer idAeaprodu;

    @Basic
    @Column(name = "ID_AEAFAMIL", table = "AEAPRODU")
    private Integer idAeafamil;

    @Basic
    @Column(name = "ID_AEACLASE", table = "AEAPRODU")
    private Integer idAeaclase;

    @Basic
    @Column(name = "ID_AEAGRUPO", table = "AEAPRODU")
    private Integer idAeagrupo;

    @Basic
    @Column(name = "ID_AEASGRUP", table = "AEAPRODU")
    private Integer idAeasgrup;

    @Basic
    @Column(name = "ID_AEAMARCA", table = "AEAPRODU")
    private Integer idAeamarca;

    @Basic(optional = false)
    @Column(name = "ID_AEAUNVEN", table = "AEAPRODU", nullable = false)
    private Integer idAeaunven;

    @Basic
    @Column(name = "ID_AEAPESOS", table = "AEAPRODU")
    private Integer idAeapesos;

    @Basic
    @Column(name = "ID_AEATPGRD", table = "AEAPRODU")
    private Integer idAeatpgrd;

    @Basic(optional = false)
    @Column(name = "ID_AEACODOM", table = "AEAPRODU", nullable = false)
    private Integer idAeacodom;

    @Basic
    @Column(name = "ID_CFAMODEQ", table = "AEAPRODU")
    private Integer idCfamodeq;

    @Basic
    @Column(name = "ID_AEACODGE", table = "AEAPRODU")
    private Integer idAeacodge;

    @Basic
    @Column(name = "ID_AEALISSE", table = "AEAPRODU")
    private Integer idAealisse;

    @Basic
    @Column(name = "ID_AEACOANP", table = "AEAPRODU")
    private Integer idAeacoanp;

    @Basic(optional = false)
    @Column(name = "GUID", table = "AEAPRODU", nullable = false, length = 16)
    private String guid;

    @Basic
    @Column(name = "US_CAD", table = "AEAPRODU", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_CAD", table = "AEAPRODU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Basic
    @Column(name = "DT_ALT", table = "AEAPRODU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic
    @Column(name = "CT_INTEG", table = "AEAPRODU")
    private Integer ctInteg;

    @Basic(optional = false)
    @Column(name = "DESCRICAO", table = "AEAPRODU", nullable = false, length = 50)
    private String descricao;

    @Lob
    @Basic
    @Column(name = "DESCRICAO_AUXILIAR", table = "AEAPRODU")
    private byte[] descricaoAuxiliar;

    @Basic
    @Column(name = "DESCRICAO_MASCARA", table = "AEAPRODU", length = 50)
    private String descricaoMascara;

    @Basic(optional = false)
    @Column(name = "CODIGO", table = "AEAPRODU", nullable = false)
    private Integer codigo;

    @Basic
    @Column(name = "CODIGO_ESTRUTURAL", table = "AEAPRODU", length = 20)
    private String codigoEstrutural;

    @Basic
    @Column(name = "REFERENCIA", table = "AEAPRODU", length = 20)
    private String referencia;

    @Basic
    @Column(name = "CODIGO_BARRAS", table = "AEAPRODU", length = 20)
    private String codigoBarras;

    @Basic
    @Column(name = "ABREV_CF", table = "AEAPRODU", length = 2)
    private String abrevCf;

    @Basic
    @Column(name = "CLASSIF_FISCAL", table = "AEAPRODU")
    private Integer classifFiscal;

    @Basic(optional = false)
    @Column(name = "PESO_LIQUIDO", table = "AEAPRODU", nullable = false)
    private double pesoLiquido;

    @Basic(optional = false)
    @Column(name = "PESO_BRUTO", table = "AEAPRODU", nullable = false)
    private double pesoBruto;

    @Basic(optional = false)
    @Column(name = "ATIVO", table = "AEAPRODU", nullable = false)
    private String ativo;

    @Basic(optional = false)
    @Column(name = "TIPO", table = "AEAPRODU", nullable = false)
    private String tipo;

    @Basic
    @Column(name = "GENERO", table = "AEAPRODU")
    private String genero;

    @Basic
    @Column(name = "VALIDADE", table = "AEAPRODU")
    private String validade;

    @Basic
    @Column(name = "GARANTIA", table = "AEAPRODU")
    private String garantia;

    @Basic
    @Column(name = "CONTROLE_SERIAL", table = "AEAPRODU")
    private String controleSerial;

    @Basic
    @Column(name = "SAI_NA_NF", table = "AEAPRODU")
    private String saiNaNf;

    @Basic
    @Column(name = "AGRUPADOR_PRECO", table = "AEAPRODU", length = 20)
    private String agrupadorPreco;

    @Basic
    @Column(name = "EX_IPI", table = "AEAPRODU", length = 3)
    private String exIpi;

    @Basic
    @Column(name = "TIPO_ITEM_EFD", table = "AEAPRODU")
    private String tipoItemEfd;

    @Basic
    @Column(name = "CODIGO_NCM", table = "AEAPRODU", length = 13)
    private String codigoNcm;

    @Basic
    @Column(name = "SIMILARIDADE", table = "AEAPRODU")
    private Integer similaridade;

    @Basic
    @Column(name = "ROMANEIA", table = "AEAPRODU")
    private String romaneia;

    @Basic
    @Column(name = "FCI", table = "AEAPRODU", length = 40)
    private String fci;

    @Basic(optional = false)
    @Column(name = "LUCRO_VARE", table = "AEAPRODU", nullable = false)
    private double lucroVare;

    @Basic(optional = false)
    @Column(name = "LUCRO_ATAC", table = "AEAPRODU", nullable = false)
    private double lucroAtac;

    @Basic(optional = false)
    @Column(name = "MVA", table = "AEAPRODU", nullable = false)
    private double mva;

    @Basic
    @Column(name = "CEST", table = "AEAPRODU", length = 13)
    private String cest;
}