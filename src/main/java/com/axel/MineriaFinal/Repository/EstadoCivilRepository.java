package com.axel.MineriaFinal.Repository;

import com.axel.MineriaFinal.Entity.EstadoCivil;
import org.springframework.data.repository.CrudRepository;

public interface EstadoCivilRepository extends CrudRepository <EstadoCivil,Integer> {
    boolean existsByDescripcion(String descripcion);
    EstadoCivil findByDescripcion(String descripcion);
}
