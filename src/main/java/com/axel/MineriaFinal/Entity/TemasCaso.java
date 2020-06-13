package com.axel.MineriaFinal.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="Temas_casos")
@IdClass(TemasCasoId.class)
public class TemasCaso {
    @Id
    private Caso idCaso;
    @Id
    private Temas idTema;
}

