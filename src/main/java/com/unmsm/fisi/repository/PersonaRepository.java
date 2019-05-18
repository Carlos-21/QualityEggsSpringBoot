package com.unmsm.fisi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unmsm.fisi.entity.ManPersona;
import com.unmsm.fisi.entity.ManPersonaId;

@Repository
public interface PersonaRepository extends JpaRepository<ManPersona, ManPersonaId>{

}
