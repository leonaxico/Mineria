package com.axel.MineriaFinal.Repository;

import com.axel.MineriaFinal.Entity.Servicio;
import org.springframework.data.repository.CrudRepository;

public interface ServicioRepository extends CrudRepository <Servicio,Integer> {
    boolean existsByDescripcion(String descripcion);
    Servicio findByDescripcion(String descripcion);
}
