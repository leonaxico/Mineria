package com.axel.MineriaFinal.Entity;

import com.axel.MineriaFinal.Utils.TemasCasoId;
import lombok.Data;

import javax.persistence.*;

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

