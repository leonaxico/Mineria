package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Ocupación")
public class Ocupacion {
    @Id
    private Integer id;
    @Column
    private String descripción;
}
