package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Servicio {
    @Id
    private Integer id;
    @Column (name="Descripcion")
    private String descripcion;
}
