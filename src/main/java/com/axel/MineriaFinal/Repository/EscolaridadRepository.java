package com.axel.MineriaFinal.Repository;

import com.axel.MineriaFinal.Entity.Escolaridad;
import org.springframework.data.repository.CrudRepository;

public interface EscolaridadRepository extends CrudRepository <Escolaridad,Integer> {
    Escolaridad findByDescripcion(String descripcion);
    boolean existsByDescripcion(String descripcion);
}
