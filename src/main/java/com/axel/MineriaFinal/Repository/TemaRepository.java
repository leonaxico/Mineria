package com.axel.MineriaFinal.Repository;

import com.axel.MineriaFinal.Entity.Temas;
import org.springframework.data.repository.CrudRepository;

public interface TemaRepository extends CrudRepository<Temas,Integer> {
    boolean existsByDescripcion(String descripcion);
    Temas findByDescripcion(String descripcion);
}
