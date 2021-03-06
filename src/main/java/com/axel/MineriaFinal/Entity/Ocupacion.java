package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Ocupación")
public class Ocupacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String descripción;
}
