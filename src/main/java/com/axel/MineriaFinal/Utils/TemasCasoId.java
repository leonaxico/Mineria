package com.axel.MineriaFinal.Utils;

import com.axel.MineriaFinal.Entity.Caso;
import com.axel.MineriaFinal.Entity.Temas;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Data
public class TemasCasoId implements Serializable {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Caso idCaso;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private Temas idTema;
}
