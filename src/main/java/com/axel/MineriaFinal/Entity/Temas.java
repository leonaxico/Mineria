package com.axel.MineriaFinal.Entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Temas {
    @Id
    private Integer id;
    @Column
    private String descripcion;
}
