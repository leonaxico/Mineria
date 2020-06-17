package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Data
@Entity
public class Caso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer folio;
    @Column
    private Integer mes;
    @Column
    private Integer ano;
    @Column
    private Integer dia;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Direccion direccionHechos;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Origen origen;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Servicio servicio;
    @Column
    private Date fecha;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Usuario idUsuario;

}
