package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Temas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String descripcion;
}
