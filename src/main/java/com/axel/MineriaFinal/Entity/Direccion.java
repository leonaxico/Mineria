package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column
    private String estado;
    @Column
    private String municipio;
    @Column
    private String colonia;
    @Column
    private String cp;
}
