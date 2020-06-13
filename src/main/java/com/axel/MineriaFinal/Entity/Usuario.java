package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Data
@Entity
public class Usuario {
    @Id
    private Integer id;
    @Column
    private Integer edad;
    @Column
    private String genero;
    @Column
    private BigInteger direccionUsuario;
    @Column
    private Integer estadoCivil;
    @Column
    private Integer ocupacionUsuario;
    @Column
    private Integer escolaridadUsuaria;
}
