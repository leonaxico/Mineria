package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Date;

@Data
@Entity
public class Caso {
    @Id
    private Integer id;
    @Column
    private Integer folio;
    @Column
    private Integer mes;
    @Column
    private Integer ano;
    @Column
    private Integer dia;
    @Column
    private BigInteger direccionHechos;
    @Column
    private Integer origen;
    @Column
    private Integer servicio;
    @Column
    private Date fecha;
    @Column
    private Integer idUsuario;

}
