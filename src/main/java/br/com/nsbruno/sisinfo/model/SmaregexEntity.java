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
@Table(name = "SMAREGEX")
@Data
public class SmaregexEntity {

    @Id
    @Column(name = "ID_SMAREGEX", table = "SMAREGEX", nullable = false)
    private Integer idSmaregex;

    @Basic
    @Column(name = "US_CAD", table = "SMAREGEX", length = 20)
    private String usCad;

    @Basic
    @Column(name = "DT_ALT", table = "SMAREGEX")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Basic(optional = false)
    @Column(name = "ARQUIVO", table = "SMAREGEX", nullable = false, length = 12)
    private String arquivo;

    @Basic
    @Column(name = "IDEXCLUIDO", table = "SMAREGEX")
    private Integer idexcluido;

    @Basic(optional = false)
    @Column(name = "GUIDEXCLUIDO", table = "SMAREGEX", nullable = false, length = 16)
    private String guidexcluido;
}