package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column (name="Descripcion")
    private String descripcion;
}
