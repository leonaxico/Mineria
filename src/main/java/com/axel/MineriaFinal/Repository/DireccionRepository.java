package com.axel.MineriaFinal.Repository;

import com.axel.MineriaFinal.Entity.Direccion;
import org.springframework.data.repository.CrudRepository;

public interface DireccionRepository extends CrudRepository <Direccion,Integer> {
    boolean existsByEstadoAndColoniaAndMunicipioAndCp(String estado, String colonia, String municipio, String cp);
    Direccion findByEstadoAndColoniaAndMunicipioAndCp(String estado, String colonia, String municipio, String cp);
}
