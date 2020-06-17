package com.axel.MineriaFinal.Repository;

import com.axel.MineriaFinal.Entity.Origen;
import org.springframework.data.repository.CrudRepository;

public interface OrigenRepository extends CrudRepository <Origen,Integer> {
    boolean existsByDescripcion(String descripcion);
    Origen findByDescripcion(String descripcion);
}
