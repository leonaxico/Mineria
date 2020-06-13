package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Data
@Entity
public class Direccion {
    @Id
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
